package com.fincons.datalake.service;

import com.fincons.datalake.entity.*;
import com.fincons.datalake.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.sql.Date;

@Service
public class InserimentoDanni {
    public static final String IMPRESA_SRL = "impresa srl ";
    public static final int CAP = 37120;
    public static final String VR = "VR";
    public static final String MARIO = "Mario ";
    public static final String ROSSI = "Rossi ";
    public static final int IDTOPONIMO = 123;
    private static final Integer IDRESIDENZA = 55;
    public static final String CODFISCALE = "RSSMRA";

    @Autowired
    PadatisingoliRepository paDatiSingoliRepository;
    @Autowired
    PaindirizzoRepository paIndirizzoRepository;
    @Autowired
    PasoggettoRepository paSoggettoRepository;
    @Autowired
    PasoggettolockRepository paSoggettoLockRepository;
    @Autowired
    PcruoloRepository pcRuoloRepository;
    @Autowired
    PcpolizzaRepository pcPolizzaRepository;
    @Autowired
    PcpolizzaruoloRepository pcpolizzaruoloRepository;
    @Autowired
    PcmovimentoRepository pcmovimentoRepository;
    @Autowired
    PgtitoloRepository pgtitoloRepository;
    @Autowired
    PcversioneRepository pcversioneRepository;


    public void pf(Integer ecidContraente) {
        Integer codicePaDatiSingoli = getCodice(paDatiSingoliRepository);
        Integer codicePaSoggetto = getCodice(paSoggettoRepository);
        Integer codicePasoggettolock = getCodice(paSoggettoLockRepository);
        paDatiSingoliRepository.save(getPadatisingoliF(codicePaDatiSingoli, ecidContraente));
        paSoggettoRepository.save(getPaSoggetto(codicePaSoggetto, codicePaDatiSingoli, 1));//1 per fisico 2 per giuridico
        paSoggettoLockRepository.save(getPaSoggettoLock(codicePasoggettolock, codicePaSoggetto, codicePaDatiSingoli, IDRESIDENZA, 0)); //codicePaIndirizzo va preso dal commander?

        Integer codicePcRuolo = getCodice(pcRuoloRepository);
        Integer codicePcPolizza = getCodice(pcPolizzaRepository);
        pcRuoloRepository.save(getPcRuolo(codicePcRuolo, codicePasoggettolock));
        pcPolizzaRepository.save(getPcPolizza(codicePcPolizza));
        pcpolizzaruoloRepository.save(getPcPolizzaRuolo(codicePcPolizza, codicePcRuolo));

        Integer codicePgTitolo = getCodice(pgtitoloRepository);
        pgtitoloRepository.save(getPgTitolo(codicePgTitolo));

        Integer codicePcMovimento = getCodice(pcmovimentoRepository);
        pcmovimentoRepository.save(getPcMovimento(codicePcPolizza, codicePcMovimento, codicePgTitolo, /*bannullato*/getRandom(0, 1)));
        pcversioneRepository.save(getPcVersione(codicePcPolizza, codicePcMovimento));
    }

    private PcversioneEntity getPcVersione(Integer codicePcPolizza, Integer codicePcMovimento) {
        return PcversioneEntity.builder()
                .idpolizza(codicePcPolizza)
                .nverinizio(getRandom(0, 999999998))
                .nverfine(999999999) //BigDecimal.getValue()
                .idpvgestione(0)
                .etipocoass(0)
                .build();
    }

    private PcmovimentoEntity getPcMovimento(Integer codicePcPolizza, Integer codicePcMovimento, Integer codicePgTitolo, Integer bAnnullato) {
        return PcmovimentoEntity.builder()
                .idmovimento(codicePcMovimento)
                .nversione(1)
                .btemporaneo(BigInteger.ZERO)
                .cdescrizione("movimento")
                .deffetto(Date.valueOf("2020-06-30"))
                .demissione(Date.valueOf("2020-06-30"))
                .idpolizza(codicePcPolizza)
                .idgruppotitoli(codicePgTitolo)
                .idcausale(0)
                .bannullato(BigInteger.valueOf(bAnnullato))
                .build();
    }

    private PgtitoloEntity getPgTitolo(Integer codicePgTitolo) {
        return PgtitoloEntity.builder()
                .idtitolo(codicePgTitolo)
                .build();
    }

    private PcpolizzaruoloEntity getPcPolizzaRuolo(Integer codicePcPolizza, Integer codicePcRuolo) {
        return PcpolizzaruoloEntity.builder()
                .idpolizza(codicePcPolizza)
                .idruolo(codicePcRuolo)
                .nverinizio(0)
                .build();
    }

    private PcpolizzaEntity getPcPolizza(Integer codicePcPolizza) {
        return PcpolizzaEntity.builder()
                .idpolizza(codicePcPolizza)
                .emotivocreazione(0)
                .cdescrizione("00")
                .bpolizza(BigInteger.ONE)
                .cnumpolizza(String.valueOf(codicePcPolizza))
                .dfinevalprop(Date.valueOf("2020-02-13"))
                .iddivisa(0)
                .idpvproduzione(0)
                .iduserins(0)
                .iduseragg(0)
                .bdanni(BigInteger.ONE)
                .bvita(BigInteger.ONE) /* errore con BigInteger.TEN*/
                .build();
    }

    private PcruoloEntity getPcRuolo(Integer codicePcRuolo, Integer codicePasoggettolock) {
        return PcruoloEntity.builder()
                .idruolo(codicePcRuolo)
                .idsoggettolock(codicePasoggettolock)
                .cruolo(1)
                .build();
    }

    private PasoggettolockEntity getPaSoggettoLock(Integer codicePasoggettolock, Integer codicePaSoggetto, Integer codicePaDatiSingoli, Integer idresidenza, Integer codicePaIndirizzo) {
        return PasoggettolockEntity.builder()
                .idsoggettolock(codicePasoggettolock)
                .idsoggetto(codicePaSoggetto)
                .idresidenza(IDRESIDENZA)
                .iddatisingoli(codicePaDatiSingoli)
                .idresidence(codicePaIndirizzo)
                .build();
    }

    private PasoggettoEntity getPaSoggetto(Integer codicePaSoggetto, Integer codicePaDatiSingoli, Integer tipo) {
        return PasoggettoEntity.builder()
                .ccodicefiscale(CODFISCALE + codicePaSoggetto)
                .iddatisingoli(codicePaDatiSingoli)
                .idsoggetto(codicePaSoggetto)
                .etiposoggetto(tipo)
                .build();
    }

    private Integer getCodice(FindMaxIdInterface repository) {
        Integer temp = repository.findMaxId();
        if (temp == null) {
            return 1111;
        }
        return temp + 1;
    }

    private PaindirizzoEntity getPaIndirizzo(Integer codicePaindirizzo) {
        return PaindirizzoEntity.builder()
                .idindirizzo(codicePaindirizzo)
                .cprovincia(VR)
                .ccap(String.valueOf(CAP))
                .idtoponimo(IDTOPONIMO)
                .build();
    }


    private static PadatisingoliEntity getPadatisingoliF(Integer idcontraente, Integer ecidContraente) {
        return PadatisingoliEntity.builder()
                .iddatisingoli(idcontraente)
                .ccognome(ROSSI + ecidContraente)
                .cnome(MARIO + ecidContraente)
                .necid(ecidContraente)
                .build();
    }

    private static PadatisingoliEntity getPadatisingoliG(Integer idcontraente, Integer ecidContraente) {
        return PadatisingoliEntity.builder()
                .iddatisingoli(idcontraente)
                .cdenominazione(IMPRESA_SRL + ecidContraente)
                .necid(ecidContraente)
                .build();
    }

    private Integer getPaDatiSingoli() {
        Integer temp = paDatiSingoliRepository.findMaxId();
        if (temp == null) {
            return 3333;
        }
        return temp + 1;
    }

    private Integer getCodicePaIndirizzo() {
        Integer temp = paIndirizzoRepository.findMaxId();
        if (temp == null) {
            return 3333;
        }
        return temp + 1;
    }

    private Integer getRandom(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
