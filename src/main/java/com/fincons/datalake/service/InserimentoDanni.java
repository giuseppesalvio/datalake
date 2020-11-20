package com.fincons.datalake.service;

import com.fincons.datalake.entity.*;
import com.fincons.datalake.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;

import static com.fincons.datalake.service.Constant.*;


@Service
public class InserimentoDanni {
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
        inserimentoPolizzaRuoloTitoliMovimenti(codicePasoggettolock);
    }

    public void pg(Integer ecidContraente) {
        Integer codicePasoggettolock = inserimentoDatiAnagraficiGiuridica(ecidContraente);
        inserimentoPolizzaRuoloTitoliMovimenti(codicePasoggettolock);
    }



    private void inserisciNumeroCasualeTitoliMovimenti(Integer codicePcPolizza) {
        int numeroTitoli = (int) (FOR_MAX_RANDOM_MIN_MOVIMENTI + (Math.random() * FOR_MAX_RANDOM_MAX_MOVIMENTI));
        for (int i = 1; i < numeroTitoli; i++) {
            Integer codicePgTitolo = inserimentoTitolo();
            inserisciNumeroCasualeMovimenti(codicePcPolizza, codicePgTitolo);
        }
    }

    private void inserisciNumeroCasualeMovimenti(Integer codicePcPolizza, Integer codicePgTitolo) {
        int numeroMovimenti = (int) (FOR_MAX_RANDOM_MIN_TITOLI + (Math.random() * FOR_MAX_RANDOM_MAX_TITOLI));
        for (int j = 1; j < numeroMovimenti; j++) {
            inserimentoMovimentoVersione(codicePcPolizza, codicePgTitolo);
        }
    }

    private void inserimentoMovimentoVersione(Integer codicePcPolizza, Integer codicePgTitolo) {
        Integer codicePcMovimento = getMaxIdDiTabella(pcmovimentoRepository);
        pcmovimentoRepository.save(getPcMovimento(codicePcPolizza, codicePcMovimento, codicePgTitolo, /*bannullato*/getRandomNumber(0, 1)));
        pcversioneRepository.save(getPcVersione(codicePcPolizza, codicePcMovimento));
    }

    private Integer inserimentoTitolo() {
        Integer codicePgTitolo = getMaxIdDiTabella(pgtitoloRepository);
        pgtitoloRepository.save(getPgTitolo(codicePgTitolo));
        return codicePgTitolo;
    }

    private void inserimentoPolizzaRuoloTitoliMovimenti(Integer codicePasoggettolock) {
        int numeroPolizze = getRandomNumber(FOR_MIN_RANDOM_POLIZZE, FOR_MAX_RANDOM_POLIZZE);
        for (int i = 1; i < numeroPolizze; i++) {
            Integer codicePcRuolo = getMaxIdDiTabella(pcRuoloRepository);
            Integer codicePcPolizza = getMaxIdDiTabella(pcPolizzaRepository);
            pcRuoloRepository.save(getPcRuolo(codicePcRuolo, codicePasoggettolock));
            pcPolizzaRepository.save(getPcPolizza(codicePcPolizza));
            pcpolizzaruoloRepository.save(getPcPolizzaRuolo(codicePcPolizza, codicePcRuolo));
            inserisciNumeroCasualeTitoliMovimenti(codicePcPolizza);
        }

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
                .nverinizio(getRandomNumber(0, 999999998))
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
                .deffetto(DEFFETTO)
                .demissione(DEMISSIONE)
                .idpolizza(codicePcPolizza)
                .idgruppotitoli(codicePgTitolo)
                .idcausale(0)
                .bannullato(BigInteger.valueOf(bAnnullato))
                .build();
    }

    private PgtitoloEntity getPgTitolo(Integer codicePgTitolo) {
        return PgtitoloEntity.builder()
                .idtitolo(codicePgTitolo)
                .nimporto(BigDecimal.valueOf(getRandomNumber(1, 1000000)))
                .nimportototale(BigDecimal.valueOf(getRandomNumber(1, 1000000)))
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
                .ccodicefiscale(CF + codicePaSoggetto)
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
                .ccognome(COGNOME + ecidContraente)
                .cnome(NOME + ecidContraente)
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
}
