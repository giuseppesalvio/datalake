package com.fincons.datalake.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "vttab024", schema = "datalake", catalog = "")
@IdClass(Vttab024EntityPK.class)
public class Vttab024Entity {
    private int t024Codsoc;
    private String t024Categoria;
    private String t024Agenzia;
    private int t024NumColl;
    private int t024NumPolizza;
    private short t024Posizione;
    private String t024Stato;
    private String t024Causale;
    private Date t024DataCreaz;
    private String t024UserCreaz;
    private String t024CodiceUt;
    private Date t024Emissione;
    private Date t024Decorrenza;
    private BigDecimal t024Durata;
    private Date t024Scadenza;
    private String t024Convenzione;
    private String t024AgenzAcquis;
    private String t024AgenziaGest;
    private String t024Subagente;
    private String t024VisitaMedica;
    private BigDecimal t024SpeseMediche;
    private BigDecimal t024CostoPolizza;
    private BigDecimal t024CostoQuiet;
    private Date t024DataTrCoass;
    private String t024TrattCoass;
    private Date t024DataTrRiass;
    private String t024TrattRiass;
    private int t024FondoRivalut;
    private String t024TipoPremio;
    private String t024TipoPremio2;
    private short t024FrazPremio;
    private BigDecimal t024PremioRata;
    private BigDecimal t024PremioNetto;
    private BigDecimal t024Prestazione;
    private BigDecimal t024PrestRiv;
    private short t024FrazRendita;
    private BigDecimal t024IntFraz;
    private BigDecimal t024CapOpzione;
    private BigDecimal t024PremioPuro;
    private BigDecimal t024PremioInvent;
    private BigDecimal t024PremioTariff;
    private BigDecimal t024UltPrePuro;
    private BigDecimal t024UltPreInven;
    private BigDecimal t024UltPreTarif;
    private BigDecimal t024DurPagPUn;
    private String t024Abi;
    private String t024Cab;
    private String t024ContoCorr;
    private String t024Defisc;
    private BigInteger t024RateoIniz;
    private BigInteger t024PremioLim;
    private BigDecimal t024QCaricoAss;
    private Date t024DataVariaz;
    private short t024UltProgSt;
    private BigDecimal t024Eta;
    private BigDecimal t024PremioSucc;
    private Date t024NextQuietP;
    private Date t024NextQuietR;
    private Date t024DataRival;
    private Date t024DataQInc;
    private short t024AnnoFraz;
    private short t024NuovoFraz;
    private String t024TipoGar;
    private short t024Appendice;
    private BigDecimal t024PercImposte;
    private BigDecimal t024PercIna;
    private BigDecimal t024AbbuonoTot;
    private BigDecimal t024AbbuonoAnnuo;
    private short t024AnniAbbuono;
    private int t024DateTime;
    private String t024Statistico1;
    private String t024Statistico2;
    private String t024Statistico3;
    private String t024Statistico4;
    private String t024TipoRiscatto;
    private short t024Decrescenza;
    private BigDecimal t024Bonus;
    private String t024RipartoRiass;
    private Date t024DataPerfez;
    private String t024TipoSconto;
    private String t024Ristampa;
    private String t024CessioneCirt;
    private String t024ScadenzaAnt;
    private String t024ModalPagam;
    private Date t024LiberoD1;
    private Date t024LiberoD2;
    private BigDecimal t024ImpSconto;
    private BigDecimal t024LiberoI2;
    private String t024LiberoA1;
    private String t024CodClassif;
    private String t024LiberoA3;
    private String t024LiberoA4;
    private int t024NumAppendice;
    private int t024Sopramort;
    private short t024CarenzaMm;
    private short t024LiberoN4;
    private BigDecimal t024PrestaAgg;
    private BigDecimal t024PrestaAggI;
    private String t024Combinata;
    private BigDecimal t024PercAbbProv;
    private String t024PremiRicorr;
    private String t024UlFondo;
    private String t024UlTiporic;
    private Date t024UlDatestr;
    private Date t024UlDataggq;
    private String t024Bic;
    private String t024IbanIdPae;
    private String t024IbanCinPae;
    private String t024IbanCinConto;
    private String t024CodPtf;

    @Id
    @Column(name = "T024_CODSOC")
    public int getT024Codsoc() {
        return t024Codsoc;
    }

    public void setT024Codsoc(int t024Codsoc) {
        this.t024Codsoc = t024Codsoc;
    }

    @Id
    @Column(name = "T024_CATEGORIA")
    public String getT024Categoria() {
        return t024Categoria;
    }

    public void setT024Categoria(String t024Categoria) {
        this.t024Categoria = t024Categoria;
    }

    @Id
    @Column(name = "T024_AGENZIA")
    public String getT024Agenzia() {
        return t024Agenzia;
    }

    public void setT024Agenzia(String t024Agenzia) {
        this.t024Agenzia = t024Agenzia;
    }

    @Id
    @Column(name = "T024_NUM_COLL")
    public int getT024NumColl() {
        return t024NumColl;
    }

    public void setT024NumColl(int t024NumColl) {
        this.t024NumColl = t024NumColl;
    }

    @Id
    @Column(name = "T024_NUM_POLIZZA")
    public int getT024NumPolizza() {
        return t024NumPolizza;
    }

    public void setT024NumPolizza(int t024NumPolizza) {
        this.t024NumPolizza = t024NumPolizza;
    }

    @Id
    @Column(name = "T024_POSIZIONE")
    public short getT024Posizione() {
        return t024Posizione;
    }

    public void setT024Posizione(short t024Posizione) {
        this.t024Posizione = t024Posizione;
    }

    @Basic
    @Column(name = "T024_STATO")
    public String getT024Stato() {
        return t024Stato;
    }

    public void setT024Stato(String t024Stato) {
        this.t024Stato = t024Stato;
    }

    @Basic
    @Column(name = "T024_CAUSALE")
    public String getT024Causale() {
        return t024Causale;
    }

    public void setT024Causale(String t024Causale) {
        this.t024Causale = t024Causale;
    }

    @Basic
    @Column(name = "T024_DATA_CREAZ")
    public Date getT024DataCreaz() {
        return t024DataCreaz;
    }

    public void setT024DataCreaz(Date t024DataCreaz) {
        this.t024DataCreaz = t024DataCreaz;
    }

    @Basic
    @Column(name = "T024_USER_CREAZ")
    public String getT024UserCreaz() {
        return t024UserCreaz;
    }

    public void setT024UserCreaz(String t024UserCreaz) {
        this.t024UserCreaz = t024UserCreaz;
    }

    @Basic
    @Column(name = "T024_CODICE_UT")
    public String getT024CodiceUt() {
        return t024CodiceUt;
    }

    public void setT024CodiceUt(String t024CodiceUt) {
        this.t024CodiceUt = t024CodiceUt;
    }

    @Basic
    @Column(name = "T024_EMISSIONE")
    public Date getT024Emissione() {
        return t024Emissione;
    }

    public void setT024Emissione(Date t024Emissione) {
        this.t024Emissione = t024Emissione;
    }

    @Basic
    @Column(name = "T024_DECORRENZA")
    public Date getT024Decorrenza() {
        return t024Decorrenza;
    }

    public void setT024Decorrenza(Date t024Decorrenza) {
        this.t024Decorrenza = t024Decorrenza;
    }

    @Basic
    @Column(name = "T024_DURATA")
    public BigDecimal getT024Durata() {
        return t024Durata;
    }

    public void setT024Durata(BigDecimal t024Durata) {
        this.t024Durata = t024Durata;
    }

    @Basic
    @Column(name = "T024_SCADENZA")
    public Date getT024Scadenza() {
        return t024Scadenza;
    }

    public void setT024Scadenza(Date t024Scadenza) {
        this.t024Scadenza = t024Scadenza;
    }

    @Basic
    @Column(name = "T024_CONVENZIONE")
    public String getT024Convenzione() {
        return t024Convenzione;
    }

    public void setT024Convenzione(String t024Convenzione) {
        this.t024Convenzione = t024Convenzione;
    }

    @Basic
    @Column(name = "T024_AGENZ_ACQUIS")
    public String getT024AgenzAcquis() {
        return t024AgenzAcquis;
    }

    public void setT024AgenzAcquis(String t024AgenzAcquis) {
        this.t024AgenzAcquis = t024AgenzAcquis;
    }

    @Basic
    @Column(name = "T024_AGENZIA_GEST")
    public String getT024AgenziaGest() {
        return t024AgenziaGest;
    }

    public void setT024AgenziaGest(String t024AgenziaGest) {
        this.t024AgenziaGest = t024AgenziaGest;
    }

    @Basic
    @Column(name = "T024_SUBAGENTE")
    public String getT024Subagente() {
        return t024Subagente;
    }

    public void setT024Subagente(String t024Subagente) {
        this.t024Subagente = t024Subagente;
    }

    @Basic
    @Column(name = "T024_VISITA_MEDICA")
    public String getT024VisitaMedica() {
        return t024VisitaMedica;
    }

    public void setT024VisitaMedica(String t024VisitaMedica) {
        this.t024VisitaMedica = t024VisitaMedica;
    }

    @Basic
    @Column(name = "T024_SPESE_MEDICHE")
    public BigDecimal getT024SpeseMediche() {
        return t024SpeseMediche;
    }

    public void setT024SpeseMediche(BigDecimal t024SpeseMediche) {
        this.t024SpeseMediche = t024SpeseMediche;
    }

    @Basic
    @Column(name = "T024_COSTO_POLIZZA")
    public BigDecimal getT024CostoPolizza() {
        return t024CostoPolizza;
    }

    public void setT024CostoPolizza(BigDecimal t024CostoPolizza) {
        this.t024CostoPolizza = t024CostoPolizza;
    }

    @Basic
    @Column(name = "T024_COSTO_QUIET")
    public BigDecimal getT024CostoQuiet() {
        return t024CostoQuiet;
    }

    public void setT024CostoQuiet(BigDecimal t024CostoQuiet) {
        this.t024CostoQuiet = t024CostoQuiet;
    }

    @Basic
    @Column(name = "T024_DATA_TR_COASS")
    public Date getT024DataTrCoass() {
        return t024DataTrCoass;
    }

    public void setT024DataTrCoass(Date t024DataTrCoass) {
        this.t024DataTrCoass = t024DataTrCoass;
    }

    @Basic
    @Column(name = "T024_TRATT_COASS")
    public String getT024TrattCoass() {
        return t024TrattCoass;
    }

    public void setT024TrattCoass(String t024TrattCoass) {
        this.t024TrattCoass = t024TrattCoass;
    }

    @Basic
    @Column(name = "T024_DATA_TR_RIASS")
    public Date getT024DataTrRiass() {
        return t024DataTrRiass;
    }

    public void setT024DataTrRiass(Date t024DataTrRiass) {
        this.t024DataTrRiass = t024DataTrRiass;
    }

    @Basic
    @Column(name = "T024_TRATT_RIASS")
    public String getT024TrattRiass() {
        return t024TrattRiass;
    }

    public void setT024TrattRiass(String t024TrattRiass) {
        this.t024TrattRiass = t024TrattRiass;
    }

    @Basic
    @Column(name = "T024_FONDO_RIVALUT")
    public int getT024FondoRivalut() {
        return t024FondoRivalut;
    }

    public void setT024FondoRivalut(int t024FondoRivalut) {
        this.t024FondoRivalut = t024FondoRivalut;
    }

    @Basic
    @Column(name = "T024_TIPO_PREMIO")
    public String getT024TipoPremio() {
        return t024TipoPremio;
    }

    public void setT024TipoPremio(String t024TipoPremio) {
        this.t024TipoPremio = t024TipoPremio;
    }

    @Basic
    @Column(name = "T024_TIPO_PREMIO2")
    public String getT024TipoPremio2() {
        return t024TipoPremio2;
    }

    public void setT024TipoPremio2(String t024TipoPremio2) {
        this.t024TipoPremio2 = t024TipoPremio2;
    }

    @Basic
    @Column(name = "T024_FRAZ_PREMIO")
    public short getT024FrazPremio() {
        return t024FrazPremio;
    }

    public void setT024FrazPremio(short t024FrazPremio) {
        this.t024FrazPremio = t024FrazPremio;
    }

    @Basic
    @Column(name = "T024_PREMIO_RATA")
    public BigDecimal getT024PremioRata() {
        return t024PremioRata;
    }

    public void setT024PremioRata(BigDecimal t024PremioRata) {
        this.t024PremioRata = t024PremioRata;
    }

    @Basic
    @Column(name = "T024_PREMIO_NETTO")
    public BigDecimal getT024PremioNetto() {
        return t024PremioNetto;
    }

    public void setT024PremioNetto(BigDecimal t024PremioNetto) {
        this.t024PremioNetto = t024PremioNetto;
    }

    @Basic
    @Column(name = "T024_PRESTAZIONE")
    public BigDecimal getT024Prestazione() {
        return t024Prestazione;
    }

    public void setT024Prestazione(BigDecimal t024Prestazione) {
        this.t024Prestazione = t024Prestazione;
    }

    @Basic
    @Column(name = "T024_PREST_RIV")
    public BigDecimal getT024PrestRiv() {
        return t024PrestRiv;
    }

    public void setT024PrestRiv(BigDecimal t024PrestRiv) {
        this.t024PrestRiv = t024PrestRiv;
    }

    @Basic
    @Column(name = "T024_FRAZ_RENDITA")
    public short getT024FrazRendita() {
        return t024FrazRendita;
    }

    public void setT024FrazRendita(short t024FrazRendita) {
        this.t024FrazRendita = t024FrazRendita;
    }

    @Basic
    @Column(name = "T024_INT_FRAZ")
    public BigDecimal getT024IntFraz() {
        return t024IntFraz;
    }

    public void setT024IntFraz(BigDecimal t024IntFraz) {
        this.t024IntFraz = t024IntFraz;
    }

    @Basic
    @Column(name = "T024_CAP_OPZIONE")
    public BigDecimal getT024CapOpzione() {
        return t024CapOpzione;
    }

    public void setT024CapOpzione(BigDecimal t024CapOpzione) {
        this.t024CapOpzione = t024CapOpzione;
    }

    @Basic
    @Column(name = "T024_PREMIO_PURO")
    public BigDecimal getT024PremioPuro() {
        return t024PremioPuro;
    }

    public void setT024PremioPuro(BigDecimal t024PremioPuro) {
        this.t024PremioPuro = t024PremioPuro;
    }

    @Basic
    @Column(name = "T024_PREMIO_INVENT")
    public BigDecimal getT024PremioInvent() {
        return t024PremioInvent;
    }

    public void setT024PremioInvent(BigDecimal t024PremioInvent) {
        this.t024PremioInvent = t024PremioInvent;
    }

    @Basic
    @Column(name = "T024_PREMIO_TARIFF")
    public BigDecimal getT024PremioTariff() {
        return t024PremioTariff;
    }

    public void setT024PremioTariff(BigDecimal t024PremioTariff) {
        this.t024PremioTariff = t024PremioTariff;
    }

    @Basic
    @Column(name = "T024_ULT_PRE_PURO")
    public BigDecimal getT024UltPrePuro() {
        return t024UltPrePuro;
    }

    public void setT024UltPrePuro(BigDecimal t024UltPrePuro) {
        this.t024UltPrePuro = t024UltPrePuro;
    }

    @Basic
    @Column(name = "T024_ULT_PRE_INVEN")
    public BigDecimal getT024UltPreInven() {
        return t024UltPreInven;
    }

    public void setT024UltPreInven(BigDecimal t024UltPreInven) {
        this.t024UltPreInven = t024UltPreInven;
    }

    @Basic
    @Column(name = "T024_ULT_PRE_TARIF")
    public BigDecimal getT024UltPreTarif() {
        return t024UltPreTarif;
    }

    public void setT024UltPreTarif(BigDecimal t024UltPreTarif) {
        this.t024UltPreTarif = t024UltPreTarif;
    }

    @Basic
    @Column(name = "T024_DUR_PAG_P_UN")
    public BigDecimal getT024DurPagPUn() {
        return t024DurPagPUn;
    }

    public void setT024DurPagPUn(BigDecimal t024DurPagPUn) {
        this.t024DurPagPUn = t024DurPagPUn;
    }

    @Basic
    @Column(name = "T024_ABI")
    public String getT024Abi() {
        return t024Abi;
    }

    public void setT024Abi(String t024Abi) {
        this.t024Abi = t024Abi;
    }

    @Basic
    @Column(name = "T024_CAB")
    public String getT024Cab() {
        return t024Cab;
    }

    public void setT024Cab(String t024Cab) {
        this.t024Cab = t024Cab;
    }

    @Basic
    @Column(name = "T024_CONTO_CORR")
    public String getT024ContoCorr() {
        return t024ContoCorr;
    }

    public void setT024ContoCorr(String t024ContoCorr) {
        this.t024ContoCorr = t024ContoCorr;
    }

    @Basic
    @Column(name = "T024_DEFISC")
    public String getT024Defisc() {
        return t024Defisc;
    }

    public void setT024Defisc(String t024Defisc) {
        this.t024Defisc = t024Defisc;
    }

    @Basic
    @Column(name = "T024_RATEO_INIZ")
    public BigInteger getT024RateoIniz() {
        return t024RateoIniz;
    }

    public void setT024RateoIniz(BigInteger t024RateoIniz) {
        this.t024RateoIniz = t024RateoIniz;
    }

    @Basic
    @Column(name = "T024_PREMIO_LIM")
    public BigInteger getT024PremioLim() {
        return t024PremioLim;
    }

    public void setT024PremioLim(BigInteger t024PremioLim) {
        this.t024PremioLim = t024PremioLim;
    }

    @Basic
    @Column(name = "T024_Q_CARICO_ASS")
    public BigDecimal getT024QCaricoAss() {
        return t024QCaricoAss;
    }

    public void setT024QCaricoAss(BigDecimal t024QCaricoAss) {
        this.t024QCaricoAss = t024QCaricoAss;
    }

    @Basic
    @Column(name = "T024_DATA_VARIAZ")
    public Date getT024DataVariaz() {
        return t024DataVariaz;
    }

    public void setT024DataVariaz(Date t024DataVariaz) {
        this.t024DataVariaz = t024DataVariaz;
    }

    @Basic
    @Column(name = "T024_ULT_PROG_ST")
    public short getT024UltProgSt() {
        return t024UltProgSt;
    }

    public void setT024UltProgSt(short t024UltProgSt) {
        this.t024UltProgSt = t024UltProgSt;
    }

    @Basic
    @Column(name = "T024_ETA")
    public BigDecimal getT024Eta() {
        return t024Eta;
    }

    public void setT024Eta(BigDecimal t024Eta) {
        this.t024Eta = t024Eta;
    }

    @Basic
    @Column(name = "T024_PREMIO_SUCC")
    public BigDecimal getT024PremioSucc() {
        return t024PremioSucc;
    }

    public void setT024PremioSucc(BigDecimal t024PremioSucc) {
        this.t024PremioSucc = t024PremioSucc;
    }

    @Basic
    @Column(name = "T024_NEXT_QUIET_P")
    public Date getT024NextQuietP() {
        return t024NextQuietP;
    }

    public void setT024NextQuietP(Date t024NextQuietP) {
        this.t024NextQuietP = t024NextQuietP;
    }

    @Basic
    @Column(name = "T024_NEXT_QUIET_R")
    public Date getT024NextQuietR() {
        return t024NextQuietR;
    }

    public void setT024NextQuietR(Date t024NextQuietR) {
        this.t024NextQuietR = t024NextQuietR;
    }

    @Basic
    @Column(name = "T024_DATA_RIVAL")
    public Date getT024DataRival() {
        return t024DataRival;
    }

    public void setT024DataRival(Date t024DataRival) {
        this.t024DataRival = t024DataRival;
    }

    @Basic
    @Column(name = "T024_DATA_Q_INC")
    public Date getT024DataQInc() {
        return t024DataQInc;
    }

    public void setT024DataQInc(Date t024DataQInc) {
        this.t024DataQInc = t024DataQInc;
    }

    @Basic
    @Column(name = "T024_ANNO_FRAZ")
    public short getT024AnnoFraz() {
        return t024AnnoFraz;
    }

    public void setT024AnnoFraz(short t024AnnoFraz) {
        this.t024AnnoFraz = t024AnnoFraz;
    }

    @Basic
    @Column(name = "T024_NUOVO_FRAZ")
    public short getT024NuovoFraz() {
        return t024NuovoFraz;
    }

    public void setT024NuovoFraz(short t024NuovoFraz) {
        this.t024NuovoFraz = t024NuovoFraz;
    }

    @Basic
    @Column(name = "T024_TIPO_GAR")
    public String getT024TipoGar() {
        return t024TipoGar;
    }

    public void setT024TipoGar(String t024TipoGar) {
        this.t024TipoGar = t024TipoGar;
    }

    @Basic
    @Column(name = "T024_APPENDICE")
    public short getT024Appendice() {
        return t024Appendice;
    }

    public void setT024Appendice(short t024Appendice) {
        this.t024Appendice = t024Appendice;
    }

    @Basic
    @Column(name = "T024_PERC_IMPOSTE")
    public BigDecimal getT024PercImposte() {
        return t024PercImposte;
    }

    public void setT024PercImposte(BigDecimal t024PercImposte) {
        this.t024PercImposte = t024PercImposte;
    }

    @Basic
    @Column(name = "T024_PERC_INA")
    public BigDecimal getT024PercIna() {
        return t024PercIna;
    }

    public void setT024PercIna(BigDecimal t024PercIna) {
        this.t024PercIna = t024PercIna;
    }

    @Basic
    @Column(name = "T024_ABBUONO_TOT")
    public BigDecimal getT024AbbuonoTot() {
        return t024AbbuonoTot;
    }

    public void setT024AbbuonoTot(BigDecimal t024AbbuonoTot) {
        this.t024AbbuonoTot = t024AbbuonoTot;
    }

    @Basic
    @Column(name = "T024_ABBUONO_ANNUO")
    public BigDecimal getT024AbbuonoAnnuo() {
        return t024AbbuonoAnnuo;
    }

    public void setT024AbbuonoAnnuo(BigDecimal t024AbbuonoAnnuo) {
        this.t024AbbuonoAnnuo = t024AbbuonoAnnuo;
    }

    @Basic
    @Column(name = "T024_ANNI_ABBUONO")
    public short getT024AnniAbbuono() {
        return t024AnniAbbuono;
    }

    public void setT024AnniAbbuono(short t024AnniAbbuono) {
        this.t024AnniAbbuono = t024AnniAbbuono;
    }

    @Basic
    @Column(name = "T024_DATE_TIME")
    public int getT024DateTime() {
        return t024DateTime;
    }

    public void setT024DateTime(int t024DateTime) {
        this.t024DateTime = t024DateTime;
    }

    @Basic
    @Column(name = "T024_STATISTICO1")
    public String getT024Statistico1() {
        return t024Statistico1;
    }

    public void setT024Statistico1(String t024Statistico1) {
        this.t024Statistico1 = t024Statistico1;
    }

    @Basic
    @Column(name = "T024_STATISTICO2")
    public String getT024Statistico2() {
        return t024Statistico2;
    }

    public void setT024Statistico2(String t024Statistico2) {
        this.t024Statistico2 = t024Statistico2;
    }

    @Basic
    @Column(name = "T024_STATISTICO3")
    public String getT024Statistico3() {
        return t024Statistico3;
    }

    public void setT024Statistico3(String t024Statistico3) {
        this.t024Statistico3 = t024Statistico3;
    }

    @Basic
    @Column(name = "T024_STATISTICO4")
    public String getT024Statistico4() {
        return t024Statistico4;
    }

    public void setT024Statistico4(String t024Statistico4) {
        this.t024Statistico4 = t024Statistico4;
    }

    @Basic
    @Column(name = "T024_TIPO_RISCATTO")
    public String getT024TipoRiscatto() {
        return t024TipoRiscatto;
    }

    public void setT024TipoRiscatto(String t024TipoRiscatto) {
        this.t024TipoRiscatto = t024TipoRiscatto;
    }

    @Basic
    @Column(name = "T024_DECRESCENZA")
    public short getT024Decrescenza() {
        return t024Decrescenza;
    }

    public void setT024Decrescenza(short t024Decrescenza) {
        this.t024Decrescenza = t024Decrescenza;
    }

    @Basic
    @Column(name = "T024_BONUS")
    public BigDecimal getT024Bonus() {
        return t024Bonus;
    }

    public void setT024Bonus(BigDecimal t024Bonus) {
        this.t024Bonus = t024Bonus;
    }

    @Basic
    @Column(name = "T024_RIPARTO_RIASS")
    public String getT024RipartoRiass() {
        return t024RipartoRiass;
    }

    public void setT024RipartoRiass(String t024RipartoRiass) {
        this.t024RipartoRiass = t024RipartoRiass;
    }

    @Basic
    @Column(name = "T024_DATA_PERFEZ")
    public Date getT024DataPerfez() {
        return t024DataPerfez;
    }

    public void setT024DataPerfez(Date t024DataPerfez) {
        this.t024DataPerfez = t024DataPerfez;
    }

    @Basic
    @Column(name = "T024_TIPO_SCONTO")
    public String getT024TipoSconto() {
        return t024TipoSconto;
    }

    public void setT024TipoSconto(String t024TipoSconto) {
        this.t024TipoSconto = t024TipoSconto;
    }

    @Basic
    @Column(name = "T024_RISTAMPA")
    public String getT024Ristampa() {
        return t024Ristampa;
    }

    public void setT024Ristampa(String t024Ristampa) {
        this.t024Ristampa = t024Ristampa;
    }

    @Basic
    @Column(name = "T024_CESSIONE_CIRT")
    public String getT024CessioneCirt() {
        return t024CessioneCirt;
    }

    public void setT024CessioneCirt(String t024CessioneCirt) {
        this.t024CessioneCirt = t024CessioneCirt;
    }

    @Basic
    @Column(name = "T024_SCADENZA_ANT")
    public String getT024ScadenzaAnt() {
        return t024ScadenzaAnt;
    }

    public void setT024ScadenzaAnt(String t024ScadenzaAnt) {
        this.t024ScadenzaAnt = t024ScadenzaAnt;
    }

    @Basic
    @Column(name = "T024_MODAL_PAGAM")
    public String getT024ModalPagam() {
        return t024ModalPagam;
    }

    public void setT024ModalPagam(String t024ModalPagam) {
        this.t024ModalPagam = t024ModalPagam;
    }

    @Basic
    @Column(name = "T024_LIBERO_D1")
    public Date getT024LiberoD1() {
        return t024LiberoD1;
    }

    public void setT024LiberoD1(Date t024LiberoD1) {
        this.t024LiberoD1 = t024LiberoD1;
    }

    @Basic
    @Column(name = "T024_LIBERO_D2")
    public Date getT024LiberoD2() {
        return t024LiberoD2;
    }

    public void setT024LiberoD2(Date t024LiberoD2) {
        this.t024LiberoD2 = t024LiberoD2;
    }

    @Basic
    @Column(name = "T024_IMP_SCONTO")
    public BigDecimal getT024ImpSconto() {
        return t024ImpSconto;
    }

    public void setT024ImpSconto(BigDecimal t024ImpSconto) {
        this.t024ImpSconto = t024ImpSconto;
    }

    @Basic
    @Column(name = "T024_LIBERO_I2")
    public BigDecimal getT024LiberoI2() {
        return t024LiberoI2;
    }

    public void setT024LiberoI2(BigDecimal t024LiberoI2) {
        this.t024LiberoI2 = t024LiberoI2;
    }

    @Basic
    @Column(name = "T024_LIBERO_A1")
    public String getT024LiberoA1() {
        return t024LiberoA1;
    }

    public void setT024LiberoA1(String t024LiberoA1) {
        this.t024LiberoA1 = t024LiberoA1;
    }

    @Basic
    @Column(name = "T024_COD_CLASSIF")
    public String getT024CodClassif() {
        return t024CodClassif;
    }

    public void setT024CodClassif(String t024CodClassif) {
        this.t024CodClassif = t024CodClassif;
    }

    @Basic
    @Column(name = "T024_LIBERO_A3")
    public String getT024LiberoA3() {
        return t024LiberoA3;
    }

    public void setT024LiberoA3(String t024LiberoA3) {
        this.t024LiberoA3 = t024LiberoA3;
    }

    @Basic
    @Column(name = "T024_LIBERO_A4")
    public String getT024LiberoA4() {
        return t024LiberoA4;
    }

    public void setT024LiberoA4(String t024LiberoA4) {
        this.t024LiberoA4 = t024LiberoA4;
    }

    @Basic
    @Column(name = "T024_NUM_APPENDICE")
    public int getT024NumAppendice() {
        return t024NumAppendice;
    }

    public void setT024NumAppendice(int t024NumAppendice) {
        this.t024NumAppendice = t024NumAppendice;
    }

    @Basic
    @Column(name = "T024_SOPRAMORT")
    public int getT024Sopramort() {
        return t024Sopramort;
    }

    public void setT024Sopramort(int t024Sopramort) {
        this.t024Sopramort = t024Sopramort;
    }

    @Basic
    @Column(name = "T024_CARENZA_MM")
    public short getT024CarenzaMm() {
        return t024CarenzaMm;
    }

    public void setT024CarenzaMm(short t024CarenzaMm) {
        this.t024CarenzaMm = t024CarenzaMm;
    }

    @Basic
    @Column(name = "T024_LIBERO_N4")
    public short getT024LiberoN4() {
        return t024LiberoN4;
    }

    public void setT024LiberoN4(short t024LiberoN4) {
        this.t024LiberoN4 = t024LiberoN4;
    }

    @Basic
    @Column(name = "T024_PRESTA_AGG")
    public BigDecimal getT024PrestaAgg() {
        return t024PrestaAgg;
    }

    public void setT024PrestaAgg(BigDecimal t024PrestaAgg) {
        this.t024PrestaAgg = t024PrestaAgg;
    }

    @Basic
    @Column(name = "T024_PRESTA_AGG_I")
    public BigDecimal getT024PrestaAggI() {
        return t024PrestaAggI;
    }

    public void setT024PrestaAggI(BigDecimal t024PrestaAggI) {
        this.t024PrestaAggI = t024PrestaAggI;
    }

    @Basic
    @Column(name = "T024_COMBINATA")
    public String getT024Combinata() {
        return t024Combinata;
    }

    public void setT024Combinata(String t024Combinata) {
        this.t024Combinata = t024Combinata;
    }

    @Basic
    @Column(name = "T024_PERC_ABB_PROV")
    public BigDecimal getT024PercAbbProv() {
        return t024PercAbbProv;
    }

    public void setT024PercAbbProv(BigDecimal t024PercAbbProv) {
        this.t024PercAbbProv = t024PercAbbProv;
    }

    @Basic
    @Column(name = "T024_PREMI_RICORR")
    public String getT024PremiRicorr() {
        return t024PremiRicorr;
    }

    public void setT024PremiRicorr(String t024PremiRicorr) {
        this.t024PremiRicorr = t024PremiRicorr;
    }

    @Basic
    @Column(name = "T024_UL_FONDO")
    public String getT024UlFondo() {
        return t024UlFondo;
    }

    public void setT024UlFondo(String t024UlFondo) {
        this.t024UlFondo = t024UlFondo;
    }

    @Basic
    @Column(name = "T024_UL_TIPORIC")
    public String getT024UlTiporic() {
        return t024UlTiporic;
    }

    public void setT024UlTiporic(String t024UlTiporic) {
        this.t024UlTiporic = t024UlTiporic;
    }

    @Basic
    @Column(name = "T024_UL_DATESTR")
    public Date getT024UlDatestr() {
        return t024UlDatestr;
    }

    public void setT024UlDatestr(Date t024UlDatestr) {
        this.t024UlDatestr = t024UlDatestr;
    }

    @Basic
    @Column(name = "T024_UL_DATAGGQ")
    public Date getT024UlDataggq() {
        return t024UlDataggq;
    }

    public void setT024UlDataggq(Date t024UlDataggq) {
        this.t024UlDataggq = t024UlDataggq;
    }

    @Basic
    @Column(name = "T024_BIC")
    public String getT024Bic() {
        return t024Bic;
    }

    public void setT024Bic(String t024Bic) {
        this.t024Bic = t024Bic;
    }

    @Basic
    @Column(name = "T024_IBAN_ID_PAE")
    public String getT024IbanIdPae() {
        return t024IbanIdPae;
    }

    public void setT024IbanIdPae(String t024IbanIdPae) {
        this.t024IbanIdPae = t024IbanIdPae;
    }

    @Basic
    @Column(name = "T024_IBAN_CIN_PAE")
    public String getT024IbanCinPae() {
        return t024IbanCinPae;
    }

    public void setT024IbanCinPae(String t024IbanCinPae) {
        this.t024IbanCinPae = t024IbanCinPae;
    }

    @Basic
    @Column(name = "T024_IBAN_CIN_CONTO")
    public String getT024IbanCinConto() {
        return t024IbanCinConto;
    }

    public void setT024IbanCinConto(String t024IbanCinConto) {
        this.t024IbanCinConto = t024IbanCinConto;
    }

    @Basic
    @Column(name = "T024_COD_PTF")
    public String getT024CodPtf() {
        return t024CodPtf;
    }

    public void setT024CodPtf(String t024CodPtf) {
        this.t024CodPtf = t024CodPtf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vttab024Entity that = (Vttab024Entity) o;
        return t024Codsoc == that.t024Codsoc &&
                t024NumColl == that.t024NumColl &&
                t024NumPolizza == that.t024NumPolizza &&
                t024Posizione == that.t024Posizione &&
                t024FondoRivalut == that.t024FondoRivalut &&
                t024FrazPremio == that.t024FrazPremio &&
                t024FrazRendita == that.t024FrazRendita &&
                t024UltProgSt == that.t024UltProgSt &&
                t024AnnoFraz == that.t024AnnoFraz &&
                t024NuovoFraz == that.t024NuovoFraz &&
                t024Appendice == that.t024Appendice &&
                t024AnniAbbuono == that.t024AnniAbbuono &&
                t024DateTime == that.t024DateTime &&
                t024Decrescenza == that.t024Decrescenza &&
                t024NumAppendice == that.t024NumAppendice &&
                t024Sopramort == that.t024Sopramort &&
                t024CarenzaMm == that.t024CarenzaMm &&
                t024LiberoN4 == that.t024LiberoN4 &&
                Objects.equals(t024Categoria, that.t024Categoria) &&
                Objects.equals(t024Agenzia, that.t024Agenzia) &&
                Objects.equals(t024Stato, that.t024Stato) &&
                Objects.equals(t024Causale, that.t024Causale) &&
                Objects.equals(t024DataCreaz, that.t024DataCreaz) &&
                Objects.equals(t024UserCreaz, that.t024UserCreaz) &&
                Objects.equals(t024CodiceUt, that.t024CodiceUt) &&
                Objects.equals(t024Emissione, that.t024Emissione) &&
                Objects.equals(t024Decorrenza, that.t024Decorrenza) &&
                Objects.equals(t024Durata, that.t024Durata) &&
                Objects.equals(t024Scadenza, that.t024Scadenza) &&
                Objects.equals(t024Convenzione, that.t024Convenzione) &&
                Objects.equals(t024AgenzAcquis, that.t024AgenzAcquis) &&
                Objects.equals(t024AgenziaGest, that.t024AgenziaGest) &&
                Objects.equals(t024Subagente, that.t024Subagente) &&
                Objects.equals(t024VisitaMedica, that.t024VisitaMedica) &&
                Objects.equals(t024SpeseMediche, that.t024SpeseMediche) &&
                Objects.equals(t024CostoPolizza, that.t024CostoPolizza) &&
                Objects.equals(t024CostoQuiet, that.t024CostoQuiet) &&
                Objects.equals(t024DataTrCoass, that.t024DataTrCoass) &&
                Objects.equals(t024TrattCoass, that.t024TrattCoass) &&
                Objects.equals(t024DataTrRiass, that.t024DataTrRiass) &&
                Objects.equals(t024TrattRiass, that.t024TrattRiass) &&
                Objects.equals(t024TipoPremio, that.t024TipoPremio) &&
                Objects.equals(t024TipoPremio2, that.t024TipoPremio2) &&
                Objects.equals(t024PremioRata, that.t024PremioRata) &&
                Objects.equals(t024PremioNetto, that.t024PremioNetto) &&
                Objects.equals(t024Prestazione, that.t024Prestazione) &&
                Objects.equals(t024PrestRiv, that.t024PrestRiv) &&
                Objects.equals(t024IntFraz, that.t024IntFraz) &&
                Objects.equals(t024CapOpzione, that.t024CapOpzione) &&
                Objects.equals(t024PremioPuro, that.t024PremioPuro) &&
                Objects.equals(t024PremioInvent, that.t024PremioInvent) &&
                Objects.equals(t024PremioTariff, that.t024PremioTariff) &&
                Objects.equals(t024UltPrePuro, that.t024UltPrePuro) &&
                Objects.equals(t024UltPreInven, that.t024UltPreInven) &&
                Objects.equals(t024UltPreTarif, that.t024UltPreTarif) &&
                Objects.equals(t024DurPagPUn, that.t024DurPagPUn) &&
                Objects.equals(t024Abi, that.t024Abi) &&
                Objects.equals(t024Cab, that.t024Cab) &&
                Objects.equals(t024ContoCorr, that.t024ContoCorr) &&
                Objects.equals(t024Defisc, that.t024Defisc) &&
                Objects.equals(t024RateoIniz, that.t024RateoIniz) &&
                Objects.equals(t024PremioLim, that.t024PremioLim) &&
                Objects.equals(t024QCaricoAss, that.t024QCaricoAss) &&
                Objects.equals(t024DataVariaz, that.t024DataVariaz) &&
                Objects.equals(t024Eta, that.t024Eta) &&
                Objects.equals(t024PremioSucc, that.t024PremioSucc) &&
                Objects.equals(t024NextQuietP, that.t024NextQuietP) &&
                Objects.equals(t024NextQuietR, that.t024NextQuietR) &&
                Objects.equals(t024DataRival, that.t024DataRival) &&
                Objects.equals(t024DataQInc, that.t024DataQInc) &&
                Objects.equals(t024TipoGar, that.t024TipoGar) &&
                Objects.equals(t024PercImposte, that.t024PercImposte) &&
                Objects.equals(t024PercIna, that.t024PercIna) &&
                Objects.equals(t024AbbuonoTot, that.t024AbbuonoTot) &&
                Objects.equals(t024AbbuonoAnnuo, that.t024AbbuonoAnnuo) &&
                Objects.equals(t024Statistico1, that.t024Statistico1) &&
                Objects.equals(t024Statistico2, that.t024Statistico2) &&
                Objects.equals(t024Statistico3, that.t024Statistico3) &&
                Objects.equals(t024Statistico4, that.t024Statistico4) &&
                Objects.equals(t024TipoRiscatto, that.t024TipoRiscatto) &&
                Objects.equals(t024Bonus, that.t024Bonus) &&
                Objects.equals(t024RipartoRiass, that.t024RipartoRiass) &&
                Objects.equals(t024DataPerfez, that.t024DataPerfez) &&
                Objects.equals(t024TipoSconto, that.t024TipoSconto) &&
                Objects.equals(t024Ristampa, that.t024Ristampa) &&
                Objects.equals(t024CessioneCirt, that.t024CessioneCirt) &&
                Objects.equals(t024ScadenzaAnt, that.t024ScadenzaAnt) &&
                Objects.equals(t024ModalPagam, that.t024ModalPagam) &&
                Objects.equals(t024LiberoD1, that.t024LiberoD1) &&
                Objects.equals(t024LiberoD2, that.t024LiberoD2) &&
                Objects.equals(t024ImpSconto, that.t024ImpSconto) &&
                Objects.equals(t024LiberoI2, that.t024LiberoI2) &&
                Objects.equals(t024LiberoA1, that.t024LiberoA1) &&
                Objects.equals(t024CodClassif, that.t024CodClassif) &&
                Objects.equals(t024LiberoA3, that.t024LiberoA3) &&
                Objects.equals(t024LiberoA4, that.t024LiberoA4) &&
                Objects.equals(t024PrestaAgg, that.t024PrestaAgg) &&
                Objects.equals(t024PrestaAggI, that.t024PrestaAggI) &&
                Objects.equals(t024Combinata, that.t024Combinata) &&
                Objects.equals(t024PercAbbProv, that.t024PercAbbProv) &&
                Objects.equals(t024PremiRicorr, that.t024PremiRicorr) &&
                Objects.equals(t024UlFondo, that.t024UlFondo) &&
                Objects.equals(t024UlTiporic, that.t024UlTiporic) &&
                Objects.equals(t024UlDatestr, that.t024UlDatestr) &&
                Objects.equals(t024UlDataggq, that.t024UlDataggq) &&
                Objects.equals(t024Bic, that.t024Bic) &&
                Objects.equals(t024IbanIdPae, that.t024IbanIdPae) &&
                Objects.equals(t024IbanCinPae, that.t024IbanCinPae) &&
                Objects.equals(t024IbanCinConto, that.t024IbanCinConto) &&
                Objects.equals(t024CodPtf, that.t024CodPtf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(t024Codsoc, t024Categoria, t024Agenzia, t024NumColl, t024NumPolizza, t024Posizione, t024Stato, t024Causale, t024DataCreaz, t024UserCreaz, t024CodiceUt, t024Emissione, t024Decorrenza, t024Durata, t024Scadenza, t024Convenzione, t024AgenzAcquis, t024AgenziaGest, t024Subagente, t024VisitaMedica, t024SpeseMediche, t024CostoPolizza, t024CostoQuiet, t024DataTrCoass, t024TrattCoass, t024DataTrRiass, t024TrattRiass, t024FondoRivalut, t024TipoPremio, t024TipoPremio2, t024FrazPremio, t024PremioRata, t024PremioNetto, t024Prestazione, t024PrestRiv, t024FrazRendita, t024IntFraz, t024CapOpzione, t024PremioPuro, t024PremioInvent, t024PremioTariff, t024UltPrePuro, t024UltPreInven, t024UltPreTarif, t024DurPagPUn, t024Abi, t024Cab, t024ContoCorr, t024Defisc, t024RateoIniz, t024PremioLim, t024QCaricoAss, t024DataVariaz, t024UltProgSt, t024Eta, t024PremioSucc, t024NextQuietP, t024NextQuietR, t024DataRival, t024DataQInc, t024AnnoFraz, t024NuovoFraz, t024TipoGar, t024Appendice, t024PercImposte, t024PercIna, t024AbbuonoTot, t024AbbuonoAnnuo, t024AnniAbbuono, t024DateTime, t024Statistico1, t024Statistico2, t024Statistico3, t024Statistico4, t024TipoRiscatto, t024Decrescenza, t024Bonus, t024RipartoRiass, t024DataPerfez, t024TipoSconto, t024Ristampa, t024CessioneCirt, t024ScadenzaAnt, t024ModalPagam, t024LiberoD1, t024LiberoD2, t024ImpSconto, t024LiberoI2, t024LiberoA1, t024CodClassif, t024LiberoA3, t024LiberoA4, t024NumAppendice, t024Sopramort, t024CarenzaMm, t024LiberoN4, t024PrestaAgg, t024PrestaAggI, t024Combinata, t024PercAbbProv, t024PremiRicorr, t024UlFondo, t024UlTiporic, t024UlDatestr, t024UlDataggq, t024Bic, t024IbanIdPae, t024IbanCinPae, t024IbanCinConto, t024CodPtf);
    }
}
