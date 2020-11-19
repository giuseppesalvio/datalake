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
    public static final String VR = "VR";
    public static final String MARIO = "Mario ";
    public static final String ROSSI = "Rossi ";
    private static final Integer IDRESIDENZA = 55;
    public static final String CODFISCALE = "RSSMRA";
    public static final int TIPO_PF_DANNI = 1;
    public static final int TIPO_PG_DANNI = 2;

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
        Integer codicePasoggettolock = inserimentoDatiAnagraficiFisica(ecidContraente);
        Integer codicePcPolizza = inserimentoPolizzaE_Ruolo(codicePasoggettolock);
        inserisciNumeroCasualeTitoliMovimenti(codicePcPolizza);
    }

    public void pg(Integer ecidContraente) {
        Integer codicePasoggettolock = inserimentoDatiAnagraficiGiuridica(ecidContraente);
        Integer codicePcPolizza = inserimentoPolizzaE_Ruolo(codicePasoggettolock);
        inserisciNumeroCasualeTitoliMovimenti(codicePcPolizza);
    }



    private void inserisciNumeroCasualeTitoliMovimenti(Integer codicePcPolizza) {
        int numeroTitoli = (int) (20 + (Math.random() * 30));
        for (int i = 0; i < numeroTitoli; i++) {
            Integer codicePgTitolo = inserimentoTitolo();
            inserisciNumeroCasualeMovimenti(codicePcPolizza, codicePgTitolo);
        }
    }

    private void inserisciNumeroCasualeMovimenti(Integer codicePcPolizza, Integer codicePgTitolo) {
        int numeroMovimenti = (int) (20 + (Math.random() * 30));
        for (int j = 0; j < numeroMovimenti; j++) {
            inserimentoMovimentoVersione(codicePcPolizza, codicePgTitolo);
        }
    }

    private void inserimentoMovimentoVersione(Integer codicePcPolizza, Integer codicePgTitolo) {
        Integer codicePcMovimento = getMaxIdDiTabella(pcmovimentoRepository);
        pcmovimentoRepository.save(getPcMovimento(codicePcPolizza, codicePcMovimento, codicePgTitolo, /*bannullato*/getRandom(0, 1)));
        pcversioneRepository.save(getPcVersione(codicePcPolizza, codicePcMovimento));
    }

    private Integer inserimentoTitolo() {
        Integer codicePgTitolo = getMaxIdDiTabella(pgtitoloRepository);
        pgtitoloRepository.save(getPgTitolo(codicePgTitolo));
        return codicePgTitolo;
    }

    private Integer inserimentoPolizzaE_Ruolo(Integer codicePasoggettolock) {
        Integer codicePcRuolo = getMaxIdDiTabella(pcRuoloRepository);
        Integer codicePcPolizza = getMaxIdDiTabella(pcPolizzaRepository);
        pcRuoloRepository.save(getPcRuolo(codicePcRuolo, codicePasoggettolock));
        pcPolizzaRepository.save(getPcPolizza(codicePcPolizza));
        pcpolizzaruoloRepository.save(getPcPolizzaRuolo(codicePcPolizza, codicePcRuolo));
        return codicePcPolizza;
    }

    private Integer inserimentoDatiAnagraficiGiuridica(Integer ecidContraente) {
        Integer codicePaDatiSingoli = getMaxIdDiTabella(paDatiSingoliRepository);
        Integer codicePaSoggetto = getMaxIdDiTabella(paSoggettoRepository);
        Integer codicePasoggettolock = getMaxIdDiTabella(paSoggettoLockRepository);
        paDatiSingoliRepository.save(getPadatisingoliG(codicePaDatiSingoli, ecidContraente));
        paSoggettoRepository.save(getPaSoggetto(codicePaSoggetto, codicePaDatiSingoli, TIPO_PG_DANNI));//1 per fisico 2 per giuridico
        paSoggettoLockRepository.save(getPaSoggettoLock(codicePasoggettolock, codicePaSoggetto, codicePaDatiSingoli, IDRESIDENZA, 0)); //codicePaIndirizzo va preso dal commander?
        return codicePasoggettolock;
    }

    private Integer inserimentoDatiAnagraficiFisica(Integer ecidContraente) {
        Integer codicePaDatiSingoli = getMaxIdDiTabella(paDatiSingoliRepository);
        Integer codicePaSoggetto = getMaxIdDiTabella(paSoggettoRepository);
        Integer codicePasoggettolock = getMaxIdDiTabella(paSoggettoLockRepository);
        paDatiSingoliRepository.save(getPadatisingoliF(codicePaDatiSingoli, ecidContraente));
        paSoggettoRepository.save(getPaSoggetto(codicePaSoggetto, codicePaDatiSingoli, TIPO_PF_DANNI));//1 per fisico 2 per giuridico
        paSoggettoLockRepository.save(getPaSoggettoLock(codicePasoggettolock, codicePaSoggetto, codicePaDatiSingoli, IDRESIDENZA, 0)); //codicePaIndirizzo va preso dal commander?
        return codicePasoggettolock;
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

    private Integer getMaxIdDiTabella(FindMaxIdInterface repository) {
        Integer temp = repository.findMaxId();
        if (temp == null) {
            return 1111;
        }
        return temp + 1;
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

    private Integer getRandom(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
