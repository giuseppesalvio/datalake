package com.fincons.datalake.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "vttab022", schema = "datalake", catalog = "")
@IdClass(Vttab022EntityPK.class)
public class Vttab022Entity {
    private int t022Codsoc;
    private String t022Categoria;
    private String t022Agenzia;
    private int t022NumColl;
    private int t022NumPolizza;
    private String t022Stato;
    private String t022Causale;
    private Date t022DataCreaz;
    private String t022UserCreaz;
    private String t022Prodotto;
    private short t022NumeroUt;
    private String t022AgenziaGest;
    private String t022Subagente;
    private String t022Convenzione;
    private Date t022Decorrenza;
    private BigDecimal t022Durata;
    private Date t022Scadenza;
    private int t022CodContr;
    private int t022CodAssic;
    private int t022CodAssic2;
    private int t022CodBenv1;
    private int t022CodBenv2;
    private int t022CodBenv3;
    private int t022CodBenv4;
    private int t022CodBenv5;
    private int t022CodBenm1;
    private int t022CodBenm2;
    private int t022CodBenm3;
    private int t022CodBenm4;
    private int t022CodBenm5;
    private String t022Nominativo;
    private int t022SpeseMediche;
    private int t022CostoPolizza;
    private int t022CostoQuiet;
    private int t022Libero;
    private int t022Preventivo;
    private String t022CodDivisa;
    private String t022Esentasse;
    private String t022PremiRicorr;
    private short t022Periodicita;
    private int t022NumeroProp;
    private Date t022DataVariaz;
    private short t022UltProgSt;
    private String t022Statistico1;
    private String t022Statistico2;
    private String t022Statistico3;
    private String t022Statistico4;
    private String t022Sesso;
    private String t022Sesso2;
    private Date t022DecorrPur;
    private short t022UltposPur;
    private String t022AgenziaProp;
    private String t022TipoRiv;
    private String t022CodCompagnia;
    private String t022CodMatricola;
    private String t022LiberoF1;
    private String t022LiberoF2;
    private String t022LiberoF3;
    private String t022LiberoF4;
    private String t022LiberoF5;
    private Date t022LiberoD1;
    private Date t022LiberoD2;
    private String t022CodSconto;
    private String t022LiberoA2;
    private String t022LiberoA3;
    private String t022LiberoA4;
    private int t022NumAppendice;
    private int t022LiberoN2;
    private String t022NominAss;
    private short t022Fondo;
    private String t022Flag;
    private BigDecimal t022Valcompl;
    private BigDecimal t022Valatt;
    private String t022UlFondo;
    private Date t022Emissione;
    private int t022CodLrapp1;
    private int t022CodLrapp2;

    @Id
    @Column(name = "T022_CODSOC")
    public int getT022Codsoc() {
        return t022Codsoc;
    }

    public void setT022Codsoc(int t022Codsoc) {
        this.t022Codsoc = t022Codsoc;
    }

    @Id
    @Column(name = "T022_CATEGORIA")
    public String getT022Categoria() {
        return t022Categoria;
    }

    public void setT022Categoria(String t022Categoria) {
        this.t022Categoria = t022Categoria;
    }

    @Id
    @Column(name = "T022_AGENZIA")
    public String getT022Agenzia() {
        return t022Agenzia;
    }

    public void setT022Agenzia(String t022Agenzia) {
        this.t022Agenzia = t022Agenzia;
    }

    @Id
    @Column(name = "T022_NUM_COLL")
    public int getT022NumColl() {
        return t022NumColl;
    }

    public void setT022NumColl(int t022NumColl) {
        this.t022NumColl = t022NumColl;
    }

    @Id
    @Column(name = "T022_NUM_POLIZZA")
    public int getT022NumPolizza() {
        return t022NumPolizza;
    }

    public void setT022NumPolizza(int t022NumPolizza) {
        this.t022NumPolizza = t022NumPolizza;
    }

    @Basic
    @Column(name = "T022_STATO")
    public String getT022Stato() {
        return t022Stato;
    }

    public void setT022Stato(String t022Stato) {
        this.t022Stato = t022Stato;
    }

    @Basic
    @Column(name = "T022_CAUSALE")
    public String getT022Causale() {
        return t022Causale;
    }

    public void setT022Causale(String t022Causale) {
        this.t022Causale = t022Causale;
    }

    @Basic
    @Column(name = "T022_DATA_CREAZ")
    public Date getT022DataCreaz() {
        return t022DataCreaz;
    }

    public void setT022DataCreaz(Date t022DataCreaz) {
        this.t022DataCreaz = t022DataCreaz;
    }

    @Basic
    @Column(name = "T022_USER_CREAZ")
    public String getT022UserCreaz() {
        return t022UserCreaz;
    }

    public void setT022UserCreaz(String t022UserCreaz) {
        this.t022UserCreaz = t022UserCreaz;
    }

    @Basic
    @Column(name = "T022_PRODOTTO")
    public String getT022Prodotto() {
        return t022Prodotto;
    }

    public void setT022Prodotto(String t022Prodotto) {
        this.t022Prodotto = t022Prodotto;
    }

    @Basic
    @Column(name = "T022_NUMERO_UT")
    public short getT022NumeroUt() {
        return t022NumeroUt;
    }

    public void setT022NumeroUt(short t022NumeroUt) {
        this.t022NumeroUt = t022NumeroUt;
    }

    @Basic
    @Column(name = "T022_AGENZIA_GEST")
    public String getT022AgenziaGest() {
        return t022AgenziaGest;
    }

    public void setT022AgenziaGest(String t022AgenziaGest) {
        this.t022AgenziaGest = t022AgenziaGest;
    }

    @Basic
    @Column(name = "T022_SUBAGENTE")
    public String getT022Subagente() {
        return t022Subagente;
    }

    public void setT022Subagente(String t022Subagente) {
        this.t022Subagente = t022Subagente;
    }

    @Basic
    @Column(name = "T022_CONVENZIONE")
    public String getT022Convenzione() {
        return t022Convenzione;
    }

    public void setT022Convenzione(String t022Convenzione) {
        this.t022Convenzione = t022Convenzione;
    }

    @Basic
    @Column(name = "T022_DECORRENZA")
    public Date getT022Decorrenza() {
        return t022Decorrenza;
    }

    public void setT022Decorrenza(Date t022Decorrenza) {
        this.t022Decorrenza = t022Decorrenza;
    }

    @Basic
    @Column(name = "T022_DURATA")
    public BigDecimal getT022Durata() {
        return t022Durata;
    }

    public void setT022Durata(BigDecimal t022Durata) {
        this.t022Durata = t022Durata;
    }

    @Basic
    @Column(name = "T022_SCADENZA")
    public Date getT022Scadenza() {
        return t022Scadenza;
    }

    public void setT022Scadenza(Date t022Scadenza) {
        this.t022Scadenza = t022Scadenza;
    }

    @Basic
    @Column(name = "T022_COD_CONTR")
    public int getT022CodContr() {
        return t022CodContr;
    }

    public void setT022CodContr(int t022CodContr) {
        this.t022CodContr = t022CodContr;
    }

    @Basic
    @Column(name = "T022_COD_ASSIC")
    public int getT022CodAssic() {
        return t022CodAssic;
    }

    public void setT022CodAssic(int t022CodAssic) {
        this.t022CodAssic = t022CodAssic;
    }

    @Basic
    @Column(name = "T022_COD_ASSIC2")
    public int getT022CodAssic2() {
        return t022CodAssic2;
    }

    public void setT022CodAssic2(int t022CodAssic2) {
        this.t022CodAssic2 = t022CodAssic2;
    }

    @Basic
    @Column(name = "T022_COD_BENV1")
    public int getT022CodBenv1() {
        return t022CodBenv1;
    }

    public void setT022CodBenv1(int t022CodBenv1) {
        this.t022CodBenv1 = t022CodBenv1;
    }

    @Basic
    @Column(name = "T022_COD_BENV2")
    public int getT022CodBenv2() {
        return t022CodBenv2;
    }

    public void setT022CodBenv2(int t022CodBenv2) {
        this.t022CodBenv2 = t022CodBenv2;
    }

    @Basic
    @Column(name = "T022_COD_BENV3")
    public int getT022CodBenv3() {
        return t022CodBenv3;
    }

    public void setT022CodBenv3(int t022CodBenv3) {
        this.t022CodBenv3 = t022CodBenv3;
    }

    @Basic
    @Column(name = "T022_COD_BENV4")
    public int getT022CodBenv4() {
        return t022CodBenv4;
    }

    public void setT022CodBenv4(int t022CodBenv4) {
        this.t022CodBenv4 = t022CodBenv4;
    }

    @Basic
    @Column(name = "T022_COD_BENV5")
    public int getT022CodBenv5() {
        return t022CodBenv5;
    }

    public void setT022CodBenv5(int t022CodBenv5) {
        this.t022CodBenv5 = t022CodBenv5;
    }

    @Basic
    @Column(name = "T022_COD_BENM1")
    public int getT022CodBenm1() {
        return t022CodBenm1;
    }

    public void setT022CodBenm1(int t022CodBenm1) {
        this.t022CodBenm1 = t022CodBenm1;
    }

    @Basic
    @Column(name = "T022_COD_BENM2")
    public int getT022CodBenm2() {
        return t022CodBenm2;
    }

    public void setT022CodBenm2(int t022CodBenm2) {
        this.t022CodBenm2 = t022CodBenm2;
    }

    @Basic
    @Column(name = "T022_COD_BENM3")
    public int getT022CodBenm3() {
        return t022CodBenm3;
    }

    public void setT022CodBenm3(int t022CodBenm3) {
        this.t022CodBenm3 = t022CodBenm3;
    }

    @Basic
    @Column(name = "T022_COD_BENM4")
    public int getT022CodBenm4() {
        return t022CodBenm4;
    }

    public void setT022CodBenm4(int t022CodBenm4) {
        this.t022CodBenm4 = t022CodBenm4;
    }

    @Basic
    @Column(name = "T022_COD_BENM5")
    public int getT022CodBenm5() {
        return t022CodBenm5;
    }

    public void setT022CodBenm5(int t022CodBenm5) {
        this.t022CodBenm5 = t022CodBenm5;
    }

    @Basic
    @Column(name = "T022_NOMINATIVO")
    public String getT022Nominativo() {
        return t022Nominativo;
    }

    public void setT022Nominativo(String t022Nominativo) {
        this.t022Nominativo = t022Nominativo;
    }

    @Basic
    @Column(name = "T022_SPESE_MEDICHE")
    public int getT022SpeseMediche() {
        return t022SpeseMediche;
    }

    public void setT022SpeseMediche(int t022SpeseMediche) {
        this.t022SpeseMediche = t022SpeseMediche;
    }

    @Basic
    @Column(name = "T022_COSTO_POLIZZA")
    public int getT022CostoPolizza() {
        return t022CostoPolizza;
    }

    public void setT022CostoPolizza(int t022CostoPolizza) {
        this.t022CostoPolizza = t022CostoPolizza;
    }

    @Basic
    @Column(name = "T022_COSTO_QUIET")
    public int getT022CostoQuiet() {
        return t022CostoQuiet;
    }

    public void setT022CostoQuiet(int t022CostoQuiet) {
        this.t022CostoQuiet = t022CostoQuiet;
    }

    @Basic
    @Column(name = "T022_LIBERO")
    public int getT022Libero() {
        return t022Libero;
    }

    public void setT022Libero(int t022Libero) {
        this.t022Libero = t022Libero;
    }

    @Basic
    @Column(name = "T022_PREVENTIVO")
    public int getT022Preventivo() {
        return t022Preventivo;
    }

    public void setT022Preventivo(int t022Preventivo) {
        this.t022Preventivo = t022Preventivo;
    }

    @Basic
    @Column(name = "T022_COD_DIVISA")
    public String getT022CodDivisa() {
        return t022CodDivisa;
    }

    public void setT022CodDivisa(String t022CodDivisa) {
        this.t022CodDivisa = t022CodDivisa;
    }

    @Basic
    @Column(name = "T022_ESENTASSE")
    public String getT022Esentasse() {
        return t022Esentasse;
    }

    public void setT022Esentasse(String t022Esentasse) {
        this.t022Esentasse = t022Esentasse;
    }

    @Basic
    @Column(name = "T022_PREMI_RICORR")
    public String getT022PremiRicorr() {
        return t022PremiRicorr;
    }

    public void setT022PremiRicorr(String t022PremiRicorr) {
        this.t022PremiRicorr = t022PremiRicorr;
    }

    @Basic
    @Column(name = "T022_PERIODICITA")
    public short getT022Periodicita() {
        return t022Periodicita;
    }

    public void setT022Periodicita(short t022Periodicita) {
        this.t022Periodicita = t022Periodicita;
    }

    @Basic
    @Column(name = "T022_NUMERO_PROP")
    public int getT022NumeroProp() {
        return t022NumeroProp;
    }

    public void setT022NumeroProp(int t022NumeroProp) {
        this.t022NumeroProp = t022NumeroProp;
    }

    @Basic
    @Column(name = "T022_DATA_VARIAZ")
    public Date getT022DataVariaz() {
        return t022DataVariaz;
    }

    public void setT022DataVariaz(Date t022DataVariaz) {
        this.t022DataVariaz = t022DataVariaz;
    }

    @Basic
    @Column(name = "T022_ULT_PROG_ST")
    public short getT022UltProgSt() {
        return t022UltProgSt;
    }

    public void setT022UltProgSt(short t022UltProgSt) {
        this.t022UltProgSt = t022UltProgSt;
    }

    @Basic
    @Column(name = "T022_STATISTICO1")
    public String getT022Statistico1() {
        return t022Statistico1;
    }

    public void setT022Statistico1(String t022Statistico1) {
        this.t022Statistico1 = t022Statistico1;
    }

    @Basic
    @Column(name = "T022_STATISTICO2")
    public String getT022Statistico2() {
        return t022Statistico2;
    }

    public void setT022Statistico2(String t022Statistico2) {
        this.t022Statistico2 = t022Statistico2;
    }

    @Basic
    @Column(name = "T022_STATISTICO3")
    public String getT022Statistico3() {
        return t022Statistico3;
    }

    public void setT022Statistico3(String t022Statistico3) {
        this.t022Statistico3 = t022Statistico3;
    }

    @Basic
    @Column(name = "T022_STATISTICO4")
    public String getT022Statistico4() {
        return t022Statistico4;
    }

    public void setT022Statistico4(String t022Statistico4) {
        this.t022Statistico4 = t022Statistico4;
    }

    @Basic
    @Column(name = "T022_SESSO")
    public String getT022Sesso() {
        return t022Sesso;
    }

    public void setT022Sesso(String t022Sesso) {
        this.t022Sesso = t022Sesso;
    }

    @Basic
    @Column(name = "T022_SESSO2")
    public String getT022Sesso2() {
        return t022Sesso2;
    }

    public void setT022Sesso2(String t022Sesso2) {
        this.t022Sesso2 = t022Sesso2;
    }

    @Basic
    @Column(name = "T022_DECORR_PUR")
    public Date getT022DecorrPur() {
        return t022DecorrPur;
    }

    public void setT022DecorrPur(Date t022DecorrPur) {
        this.t022DecorrPur = t022DecorrPur;
    }

    @Basic
    @Column(name = "T022_ULTPOS_PUR")
    public short getT022UltposPur() {
        return t022UltposPur;
    }

    public void setT022UltposPur(short t022UltposPur) {
        this.t022UltposPur = t022UltposPur;
    }

    @Basic
    @Column(name = "T022_AGENZIA_PROP")
    public String getT022AgenziaProp() {
        return t022AgenziaProp;
    }

    public void setT022AgenziaProp(String t022AgenziaProp) {
        this.t022AgenziaProp = t022AgenziaProp;
    }

    @Basic
    @Column(name = "T022_TIPO_RIV")
    public String getT022TipoRiv() {
        return t022TipoRiv;
    }

    public void setT022TipoRiv(String t022TipoRiv) {
        this.t022TipoRiv = t022TipoRiv;
    }

    @Basic
    @Column(name = "T022_COD_COMPAGNIA")
    public String getT022CodCompagnia() {
        return t022CodCompagnia;
    }

    public void setT022CodCompagnia(String t022CodCompagnia) {
        this.t022CodCompagnia = t022CodCompagnia;
    }

    @Basic
    @Column(name = "T022_COD_MATRICOLA")
    public String getT022CodMatricola() {
        return t022CodMatricola;
    }

    public void setT022CodMatricola(String t022CodMatricola) {
        this.t022CodMatricola = t022CodMatricola;
    }

    @Basic
    @Column(name = "T022_LIBERO_F1")
    public String getT022LiberoF1() {
        return t022LiberoF1;
    }

    public void setT022LiberoF1(String t022LiberoF1) {
        this.t022LiberoF1 = t022LiberoF1;
    }

    @Basic
    @Column(name = "T022_LIBERO_F2")
    public String getT022LiberoF2() {
        return t022LiberoF2;
    }

    public void setT022LiberoF2(String t022LiberoF2) {
        this.t022LiberoF2 = t022LiberoF2;
    }

    @Basic
    @Column(name = "T022_LIBERO_F3")
    public String getT022LiberoF3() {
        return t022LiberoF3;
    }

    public void setT022LiberoF3(String t022LiberoF3) {
        this.t022LiberoF3 = t022LiberoF3;
    }

    @Basic
    @Column(name = "T022_LIBERO_F4")
    public String getT022LiberoF4() {
        return t022LiberoF4;
    }

    public void setT022LiberoF4(String t022LiberoF4) {
        this.t022LiberoF4 = t022LiberoF4;
    }

    @Basic
    @Column(name = "T022_LIBERO_F5")
    public String getT022LiberoF5() {
        return t022LiberoF5;
    }

    public void setT022LiberoF5(String t022LiberoF5) {
        this.t022LiberoF5 = t022LiberoF5;
    }

    @Basic
    @Column(name = "T022_LIBERO_D1")
    public Date getT022LiberoD1() {
        return t022LiberoD1;
    }

    public void setT022LiberoD1(Date t022LiberoD1) {
        this.t022LiberoD1 = t022LiberoD1;
    }

    @Basic
    @Column(name = "T022_LIBERO_D2")
    public Date getT022LiberoD2() {
        return t022LiberoD2;
    }

    public void setT022LiberoD2(Date t022LiberoD2) {
        this.t022LiberoD2 = t022LiberoD2;
    }

    @Basic
    @Column(name = "T022_COD_SCONTO")
    public String getT022CodSconto() {
        return t022CodSconto;
    }

    public void setT022CodSconto(String t022CodSconto) {
        this.t022CodSconto = t022CodSconto;
    }

    @Basic
    @Column(name = "T022_LIBERO_A2")
    public String getT022LiberoA2() {
        return t022LiberoA2;
    }

    public void setT022LiberoA2(String t022LiberoA2) {
        this.t022LiberoA2 = t022LiberoA2;
    }

    @Basic
    @Column(name = "T022_LIBERO_A3")
    public String getT022LiberoA3() {
        return t022LiberoA3;
    }

    public void setT022LiberoA3(String t022LiberoA3) {
        this.t022LiberoA3 = t022LiberoA3;
    }

    @Basic
    @Column(name = "T022_LIBERO_A4")
    public String getT022LiberoA4() {
        return t022LiberoA4;
    }

    public void setT022LiberoA4(String t022LiberoA4) {
        this.t022LiberoA4 = t022LiberoA4;
    }

    @Basic
    @Column(name = "T022_NUM_APPENDICE")
    public int getT022NumAppendice() {
        return t022NumAppendice;
    }

    public void setT022NumAppendice(int t022NumAppendice) {
        this.t022NumAppendice = t022NumAppendice;
    }

    @Basic
    @Column(name = "T022_LIBERO_N2")
    public int getT022LiberoN2() {
        return t022LiberoN2;
    }

    public void setT022LiberoN2(int t022LiberoN2) {
        this.t022LiberoN2 = t022LiberoN2;
    }

    @Basic
    @Column(name = "T022_NOMIN_ASS")
    public String getT022NominAss() {
        return t022NominAss;
    }

    public void setT022NominAss(String t022NominAss) {
        this.t022NominAss = t022NominAss;
    }

    @Basic
    @Column(name = "T022_FONDO")
    public short getT022Fondo() {
        return t022Fondo;
    }

    public void setT022Fondo(short t022Fondo) {
        this.t022Fondo = t022Fondo;
    }

    @Basic
    @Column(name = "T022_FLAG")
    public String getT022Flag() {
        return t022Flag;
    }

    public void setT022Flag(String t022Flag) {
        this.t022Flag = t022Flag;
    }

    @Basic
    @Column(name = "T022_VALCOMPL")
    public BigDecimal getT022Valcompl() {
        return t022Valcompl;
    }

    public void setT022Valcompl(BigDecimal t022Valcompl) {
        this.t022Valcompl = t022Valcompl;
    }

    @Basic
    @Column(name = "T022_VALATT")
    public BigDecimal getT022Valatt() {
        return t022Valatt;
    }

    public void setT022Valatt(BigDecimal t022Valatt) {
        this.t022Valatt = t022Valatt;
    }

    @Basic
    @Column(name = "T022_UL_FONDO")
    public String getT022UlFondo() {
        return t022UlFondo;
    }

    public void setT022UlFondo(String t022UlFondo) {
        this.t022UlFondo = t022UlFondo;
    }

    @Basic
    @Column(name = "T022_EMISSIONE")
    public Date getT022Emissione() {
        return t022Emissione;
    }

    public void setT022Emissione(Date t022Emissione) {
        this.t022Emissione = t022Emissione;
    }

    @Basic
    @Column(name = "T022_COD_LRAPP1")
    public int getT022CodLrapp1() {
        return t022CodLrapp1;
    }

    public void setT022CodLrapp1(int t022CodLrapp1) {
        this.t022CodLrapp1 = t022CodLrapp1;
    }

    @Basic
    @Column(name = "T022_COD_LRAPP2")
    public int getT022CodLrapp2() {
        return t022CodLrapp2;
    }

    public void setT022CodLrapp2(int t022CodLrapp2) {
        this.t022CodLrapp2 = t022CodLrapp2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vttab022Entity that = (Vttab022Entity) o;
        return t022Codsoc == that.t022Codsoc &&
                t022NumColl == that.t022NumColl &&
                t022NumPolizza == that.t022NumPolizza &&
                t022NumeroUt == that.t022NumeroUt &&
                t022CodContr == that.t022CodContr &&
                t022CodAssic == that.t022CodAssic &&
                t022CodAssic2 == that.t022CodAssic2 &&
                t022CodBenv1 == that.t022CodBenv1 &&
                t022CodBenv2 == that.t022CodBenv2 &&
                t022CodBenv3 == that.t022CodBenv3 &&
                t022CodBenv4 == that.t022CodBenv4 &&
                t022CodBenv5 == that.t022CodBenv5 &&
                t022CodBenm1 == that.t022CodBenm1 &&
                t022CodBenm2 == that.t022CodBenm2 &&
                t022CodBenm3 == that.t022CodBenm3 &&
                t022CodBenm4 == that.t022CodBenm4 &&
                t022CodBenm5 == that.t022CodBenm5 &&
                t022SpeseMediche == that.t022SpeseMediche &&
                t022CostoPolizza == that.t022CostoPolizza &&
                t022CostoQuiet == that.t022CostoQuiet &&
                t022Libero == that.t022Libero &&
                t022Preventivo == that.t022Preventivo &&
                t022Periodicita == that.t022Periodicita &&
                t022NumeroProp == that.t022NumeroProp &&
                t022UltProgSt == that.t022UltProgSt &&
                t022UltposPur == that.t022UltposPur &&
                t022NumAppendice == that.t022NumAppendice &&
                t022LiberoN2 == that.t022LiberoN2 &&
                t022Fondo == that.t022Fondo &&
                t022CodLrapp1 == that.t022CodLrapp1 &&
                t022CodLrapp2 == that.t022CodLrapp2 &&
                Objects.equals(t022Categoria, that.t022Categoria) &&
                Objects.equals(t022Agenzia, that.t022Agenzia) &&
                Objects.equals(t022Stato, that.t022Stato) &&
                Objects.equals(t022Causale, that.t022Causale) &&
                Objects.equals(t022DataCreaz, that.t022DataCreaz) &&
                Objects.equals(t022UserCreaz, that.t022UserCreaz) &&
                Objects.equals(t022Prodotto, that.t022Prodotto) &&
                Objects.equals(t022AgenziaGest, that.t022AgenziaGest) &&
                Objects.equals(t022Subagente, that.t022Subagente) &&
                Objects.equals(t022Convenzione, that.t022Convenzione) &&
                Objects.equals(t022Decorrenza, that.t022Decorrenza) &&
                Objects.equals(t022Durata, that.t022Durata) &&
                Objects.equals(t022Scadenza, that.t022Scadenza) &&
                Objects.equals(t022Nominativo, that.t022Nominativo) &&
                Objects.equals(t022CodDivisa, that.t022CodDivisa) &&
                Objects.equals(t022Esentasse, that.t022Esentasse) &&
                Objects.equals(t022PremiRicorr, that.t022PremiRicorr) &&
                Objects.equals(t022DataVariaz, that.t022DataVariaz) &&
                Objects.equals(t022Statistico1, that.t022Statistico1) &&
                Objects.equals(t022Statistico2, that.t022Statistico2) &&
                Objects.equals(t022Statistico3, that.t022Statistico3) &&
                Objects.equals(t022Statistico4, that.t022Statistico4) &&
                Objects.equals(t022Sesso, that.t022Sesso) &&
                Objects.equals(t022Sesso2, that.t022Sesso2) &&
                Objects.equals(t022DecorrPur, that.t022DecorrPur) &&
                Objects.equals(t022AgenziaProp, that.t022AgenziaProp) &&
                Objects.equals(t022TipoRiv, that.t022TipoRiv) &&
                Objects.equals(t022CodCompagnia, that.t022CodCompagnia) &&
                Objects.equals(t022CodMatricola, that.t022CodMatricola) &&
                Objects.equals(t022LiberoF1, that.t022LiberoF1) &&
                Objects.equals(t022LiberoF2, that.t022LiberoF2) &&
                Objects.equals(t022LiberoF3, that.t022LiberoF3) &&
                Objects.equals(t022LiberoF4, that.t022LiberoF4) &&
                Objects.equals(t022LiberoF5, that.t022LiberoF5) &&
                Objects.equals(t022LiberoD1, that.t022LiberoD1) &&
                Objects.equals(t022LiberoD2, that.t022LiberoD2) &&
                Objects.equals(t022CodSconto, that.t022CodSconto) &&
                Objects.equals(t022LiberoA2, that.t022LiberoA2) &&
                Objects.equals(t022LiberoA3, that.t022LiberoA3) &&
                Objects.equals(t022LiberoA4, that.t022LiberoA4) &&
                Objects.equals(t022NominAss, that.t022NominAss) &&
                Objects.equals(t022Flag, that.t022Flag) &&
                Objects.equals(t022Valcompl, that.t022Valcompl) &&
                Objects.equals(t022Valatt, that.t022Valatt) &&
                Objects.equals(t022UlFondo, that.t022UlFondo) &&
                Objects.equals(t022Emissione, that.t022Emissione);
    }

    @Override
    public int hashCode() {
        return Objects.hash(t022Codsoc, t022Categoria, t022Agenzia, t022NumColl, t022NumPolizza, t022Stato, t022Causale, t022DataCreaz, t022UserCreaz, t022Prodotto, t022NumeroUt, t022AgenziaGest, t022Subagente, t022Convenzione, t022Decorrenza, t022Durata, t022Scadenza, t022CodContr, t022CodAssic, t022CodAssic2, t022CodBenv1, t022CodBenv2, t022CodBenv3, t022CodBenv4, t022CodBenv5, t022CodBenm1, t022CodBenm2, t022CodBenm3, t022CodBenm4, t022CodBenm5, t022Nominativo, t022SpeseMediche, t022CostoPolizza, t022CostoQuiet, t022Libero, t022Preventivo, t022CodDivisa, t022Esentasse, t022PremiRicorr, t022Periodicita, t022NumeroProp, t022DataVariaz, t022UltProgSt, t022Statistico1, t022Statistico2, t022Statistico3, t022Statistico4, t022Sesso, t022Sesso2, t022DecorrPur, t022UltposPur, t022AgenziaProp, t022TipoRiv, t022CodCompagnia, t022CodMatricola, t022LiberoF1, t022LiberoF2, t022LiberoF3, t022LiberoF4, t022LiberoF5, t022LiberoD1, t022LiberoD2, t022CodSconto, t022LiberoA2, t022LiberoA3, t022LiberoA4, t022NumAppendice, t022LiberoN2, t022NominAss, t022Fondo, t022Flag, t022Valcompl, t022Valatt, t022UlFondo, t022Emissione, t022CodLrapp1, t022CodLrapp2);
    }
}
