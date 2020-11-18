package com.fincons.datalake.service;

import com.fincons.datalake.entity.Vttab022Entity;
import com.fincons.datalake.entity.Vttab024Entity;
import com.fincons.datalake.entity.Vttab200Entity;
import com.fincons.datalake.entity.Vttab201Entity;
import com.fincons.datalake.repository.Vttab022Repository;
import com.fincons.datalake.repository.Vttab024Repository;
import com.fincons.datalake.repository.Vttab200Repository;
import com.fincons.datalake.repository.Vttab201Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Calendar;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static com.fincons.datalake.service.Constant.CF;
import static com.fincons.datalake.service.Constant.PIVA;

@Service
public class InserimentoVita {
    public static final String IMPRESA_SRL = "impresa srl ";
    public static final String VIA_ROMA = "via Roma ";
    public static final String VERONA = "Verona";
    public static final int CAP = 37120;
    public static final String VR = "VR";
    public static final String MARIO = "Mario ";
    public static final String ROSSI = "Rossi ";
    @Autowired
    private Vttab200Repository personaVitaRepository;
    @Autowired
    private Vttab201Repository personaVitaEstesaRepository;
    @Autowired
    private Vttab022Repository polizaVitaRepository;
    @Autowired
    private Vttab024Repository posizioniVita;
    @Autowired
    private InserimentoCommander inserimentoCommander;


    public void pg() {
        int codiceContraenteVita = getCodiceClienteVita();
        int codicePolizzaVita = getCodicePolizzaVita();
        Date dataDecorrenza = getDateDecorrenza();

        Integer ecidContraente = inserimentoCommander.pg();
        polizaVitaRepository.save(
                getPolizzaPersonaGiuridica(ecidContraente, codiceContraenteVita, codicePolizzaVita, dataDecorrenza));
        inserisciContraentePG(ecidContraente, codiceContraenteVita);
        inserisciAltreFigure(codiceContraenteVita);
        inserisciPosizioni(codicePolizzaVita, dataDecorrenza);
    }


    public Integer pf() {
        int codiceContraenteVita = getCodiceClienteVita();
        int codicePolizzaVita = getCodicePolizzaVita();
        Date dataDecorrenza = getDateDecorrenza();

        Integer ecidContraente = inserimentoCommander.pf();
        polizaVitaRepository.save(
                getPolizzaPersonaFisica(ecidContraente, codiceContraenteVita, codicePolizzaVita, dataDecorrenza));
        inserisciContraente(ecidContraente, codiceContraenteVita);
        inserisciAltreFigure(codiceContraenteVita);
        inserisciPosizioni(codicePolizzaVita, dataDecorrenza);
        return ecidContraente;
    }

    private Date getDateDecorrenza() {
        Date d1 = new Date(1970, 01, 01);
        Date d2 = new Date(2020, 11, 11);
        return new Date(ThreadLocalRandom.current().nextLong(d1.getTime(), d2.getTime()));
    }

    private void inserisciAltreFigure(int codiceContraenteVita) {
        inserisciAltro(codiceContraenteVita + 1);
        inserisciAltro(codiceContraenteVita + 2);
        inserisciAltro(codiceContraenteVita + 3);
        inserisciAltro(codiceContraenteVita + 4);
        inserisciAltro(codiceContraenteVita + 5);
        inserisciAltro(codiceContraenteVita + 6);
        inserisciAltro(codiceContraenteVita + 7);
        inserisciAltro(codiceContraenteVita + 8);
    }

    private int getCodiceClienteVita() {
        Integer temp = personaVitaRepository.findMaxNumCliente();
        if (temp == null) {
            return 3333;
        }
        return temp + 1;
    }

    private int getCodicePolizzaVita() {
        Integer temp = polizaVitaRepository.findMaxNumPolizza();
        if (temp == null) {
            return 3333;
        }
        return temp + 1;
    }

    private void inserisciContraente(int ecidContraente, int codiceClienteVita) {
        personaVitaRepository.save(getPersonaFisica(ecidContraente, codiceClienteVita));
        personaVitaEstesaRepository.save(getPersonaFisicaEstesa(ecidContraente, codiceClienteVita));
    }

    private void inserisciContraentePG(int ecidContraente, int codiceClienteVita) {
        personaVitaRepository.save(getPersonaGiuridica(ecidContraente, codiceClienteVita));
        personaVitaEstesaRepository.save(getPersonaGiuridicaEstesa(ecidContraente, codiceClienteVita));
    }

    private void inserisciAltro(int codiceClienteVita) {
        int ecid = inserimentoCommander.pf();
        personaVitaRepository.save(getPersonaFisica(ecid, codiceClienteVita));
        personaVitaEstesaRepository.save(getPersonaFisicaEstesa(ecid, codiceClienteVita));
    }


    private void inserisciPosizioni(int codicePolizzaVita, Date dataDecorrenza) {
        for (int j = 0; j < getRandomNumber(1, 10); j++) {
            Vttab024Entity posizione =
                    Vttab024Entity.builder()
                            .t024Codsoc(341)
                            .t024Categoria("11")
                            .t024Agenzia("")
                            .t024Posizione((short) j)
                            .t024PrestRiv(BigDecimal.valueOf(getRandomNumber(1000, 50000)))
                            .t024NumColl(0)
                            .t024NumPolizza(codicePolizzaVita)
                            .t024PremioNetto(BigDecimal.valueOf(getRandomNumber(1000, 50000)))
                            .t024PremioPuro(BigDecimal.valueOf(getRandomNumber(1000, 50000)))
                            .t024PremioRata(BigDecimal.valueOf(getRandomNumber(1000, 50000)))
                            .t024Cab("21202")
                            .t024ContoCorr("000012345678")
                            .t024Categoria("11")
                            .t024Causale("51")
                            .t024Decorrenza(dataDecorrenza)
                            .t024CodiceUt(String.valueOf(getRandomNumber(1, 10000)))
                            .t024Stato(randomStato())
                            .build();
            posizioniVita.save(posizione);
        }
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    private Vttab201Entity getPersonaFisicaEstesa(int ecidContraente, int codiceClienteVita) {
        return Vttab201Entity.builder()
                .t201Codsoc(341)
                .t201Codcli(codiceClienteVita) // stesso della 201
                .t201Nome(MARIO + ecidContraente)
                .t201Cognome(ROSSI + ecidContraente)
                .build();
    }


    private Vttab201Entity getPersonaGiuridicaEstesa(int ecidContraente, int codiceClienteVita) {
        return Vttab201Entity.builder()
                .t201Codsoc(341)
                .t201Codcli(codiceClienteVita) // stesso della 201
                .t201Cognome(IMPRESA_SRL + ecidContraente)
                .build();
    }

    private Vttab200Entity getPersonaFisica(int ecidContraente, int codiceClienteVita) {
        return Vttab200Entity.builder()
                .t200Codsoc(341)
                .t200Codfisc(CF + ecidContraente)
                .t200Nominativo(MARIO + ecidContraente + " Rossi " + ecidContraente)
                .t200Codcli(codiceClienteVita) // stesso della 201
                .t200Codcommander(ecidContraente)
                .t200Indirizzo(VIA_ROMA + ecidContraente)
                .t200IndirizzoD(VIA_ROMA + ecidContraente)
                .t200Localita(VERONA + ecidContraente)
                .t200LocalitaD(VERONA + ecidContraente)
                .t200Cap(CAP)
                .t200CapD(String.valueOf(CAP))
                .t200Provincia(VR)
                .t200ProvinciaD(VR)
                .build();
    }

    private Vttab200Entity getPersonaGiuridica(int ecidContraente, int codiceClienteVita) {
        return Vttab200Entity.builder()
                .t200Codsoc(341)
                .t200Codfisc(PIVA + ecidContraente)
                .t200Nominativo(IMPRESA_SRL + ecidContraente)
                .t200Codcli(codiceClienteVita) // stesso della 201
                .t200Codcommander(ecidContraente)
                .t200Indirizzo(VIA_ROMA + ecidContraente)
                .t200IndirizzoD(VIA_ROMA + ecidContraente)
                .t200Localita(VERONA + ecidContraente)
                .t200LocalitaD(VERONA + ecidContraente)
                .t200Cap(CAP)
                .t200CapD(String.valueOf(CAP))
                .t200Provincia(VR)
                .t200ProvinciaD(VR)
                .build();
    }

    private static Vttab022Entity getPolizzaPersonaGiuridica(
            int ecidContraente, int codiceContraenteVita, int codicePolizzaVita, Date dataDecorrenza) {
        return Vttab022Entity.builder()
                .t022Codsoc(341)
                .t022Categoria("I")
                .t022Agenzia("")
                .t022NumColl(0)
                .t022NumPolizza(codicePolizzaVita)
                .t022Nominativo(IMPRESA_SRL + ecidContraente)
                .t022Stato(randomStato())
                .t022CodContr(codiceContraenteVita)
                .t022Decorrenza(dataDecorrenza)
                .t022Emissione(new java.sql.Date(Calendar.getInstance().getTime().getTime()))
                .t022UlFondo("")
                .t022CodAssic(codiceContraenteVita + 1)
                .t022CodAssic2(codiceContraenteVita + 2)
                .t022CodBenv1(codiceContraenteVita + 3)
                .t022CodBenv2(codiceContraenteVita + 4)
                .t022CodBenm1(codiceContraenteVita + 5)
                .t022CodBenm2(codiceContraenteVita + 6)
                .t022CodLrapp1(codiceContraenteVita + 7)
                .t022CodLrapp2(codiceContraenteVita + 8)
                .build();
    }

    private static Vttab022Entity getPolizzaPersonaFisica(
            int ecidContraente, int codiceContraenteVita, int codicePolizzaVita, Date dataDecorrenza) {
        return Vttab022Entity.builder()
                .t022Codsoc(341)
                .t022Categoria("I")
                .t022Agenzia("")
                .t022NumColl(0)
                .t022NumPolizza(codicePolizzaVita)
                .t022Nominativo(MARIO + ecidContraente + " Rossi " + 1)
                .t022Stato(randomStato())
                .t022CodContr(codiceContraenteVita)
                .t022Decorrenza(dataDecorrenza)
                .t022Emissione(new java.sql.Date(Calendar.getInstance().getTime().getTime()))
                .t022UlFondo("")
                .t022CodAssic(codiceContraenteVita + 1)
                .t022CodAssic2(codiceContraenteVita + 2)
                .t022CodBenv1(codiceContraenteVita + 3)
                .t022CodBenv2(codiceContraenteVita + 4)
                .t022CodBenm1(codiceContraenteVita + 5)
                .t022CodBenm2(codiceContraenteVita + 6)
                .t022CodLrapp1(codiceContraenteVita + 7)
                .t022CodLrapp2(codiceContraenteVita + 8)
                .build();
    }

    private static String randomStato() {
        Random random = new Random();
        if (random.nextInt(1) == 0) {
            return "S";
        } else {
            return "A";
        }
    }
}
