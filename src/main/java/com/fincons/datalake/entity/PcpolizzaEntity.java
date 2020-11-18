package com.fincons.datalake.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "pcpolizza", schema = "datalake", catalog = "")
public class PcpolizzaEntity {
    private int idpolizza;
    private Integer emotivoannulprop;
    private Date demissione;
    private int emotivocreazione;
    private String cdescrizione;
    private BigInteger bpolizza;
    private String cnumproposta;
    private String cnumpolizza;
    private Date dfinevalprop;
    private Integer idprodotto;
    private int iddivisa;
    private int idpvproduzione;
    private int iduserins;
    private Timestamp dins;
    private int iduseragg;
    private Timestamp dagg;
    private Date dannullamento;
    private BigInteger baccorparata;
    private Date deffettooriginale;
    private BigInteger bprovvprec;
    private Date dproposta;
    private Integer emotivosost;
    private BigInteger bdanni;
    private BigInteger bvita;
    private Date dscadenzaoriginale;
    private BigInteger bmigrata;
    private Integer eusoimposta;
    private Integer idcompagnia;
    private Date dbloccoquiet;
    private String ccodiceramotecnico;
    private Date dtrasflegale;
    private Date dtrasfagenzia;
    private String cnumapplicazione;
    private Integer etipopolizza;
    private BigInteger bmodello;
    private Integer nmaxversione;
    private Integer ecategoria;
    private Date deffettocorrente;
    private Date dscadenzacorrente;
    private Integer idpvgestcorrente;
    private Integer idmotsostituzione;
    private Date duscitaesposizione;
    private Integer eprovenienza;
    private Integer nggdisdetta;
    private Date dinviocomannullo;
    private Integer idpassautorizz;
    private String cnote;
    private Date dbloccooperativita;
    private String cnumlotto;
    private String cnumfinanziamento;
    private String cnumquote;
    private Integer idcontext;
    private String clockcode;
    private BigDecimal ncpratio;
    private Date dupdcpratio;
    private BigInteger bprivacycommerciale;

    @Id
    @Column(name = "IDPOLIZZA")
    public int getIdpolizza() {
        return idpolizza;
    }

    public void setIdpolizza(int idpolizza) {
        this.idpolizza = idpolizza;
    }

    @Basic
    @Column(name = "EMOTIVOANNULPROP")
    public Integer getEmotivoannulprop() {
        return emotivoannulprop;
    }

    public void setEmotivoannulprop(Integer emotivoannulprop) {
        this.emotivoannulprop = emotivoannulprop;
    }

    @Basic
    @Column(name = "DEMISSIONE")
    public Date getDemissione() {
        return demissione;
    }

    public void setDemissione(Date demissione) {
        this.demissione = demissione;
    }

    @Basic
    @Column(name = "EMOTIVOCREAZIONE")
    public int getEmotivocreazione() {
        return emotivocreazione;
    }

    public void setEmotivocreazione(int emotivocreazione) {
        this.emotivocreazione = emotivocreazione;
    }

    @Basic
    @Column(name = "CDESCRIZIONE")
    public String getCdescrizione() {
        return cdescrizione;
    }

    public void setCdescrizione(String cdescrizione) {
        this.cdescrizione = cdescrizione;
    }

    @Basic
    @Column(name = "BPOLIZZA")
    public BigInteger getBpolizza() {
        return bpolizza;
    }

    public void setBpolizza(BigInteger bpolizza) {
        this.bpolizza = bpolizza;
    }

    @Basic
    @Column(name = "CNUMPROPOSTA")
    public String getCnumproposta() {
        return cnumproposta;
    }

    public void setCnumproposta(String cnumproposta) {
        this.cnumproposta = cnumproposta;
    }

    @Basic
    @Column(name = "CNUMPOLIZZA")
    public String getCnumpolizza() {
        return cnumpolizza;
    }

    public void setCnumpolizza(String cnumpolizza) {
        this.cnumpolizza = cnumpolizza;
    }

    @Basic
    @Column(name = "DFINEVALPROP")
    public Date getDfinevalprop() {
        return dfinevalprop;
    }

    public void setDfinevalprop(Date dfinevalprop) {
        this.dfinevalprop = dfinevalprop;
    }

    @Basic
    @Column(name = "IDPRODOTTO")
    public Integer getIdprodotto() {
        return idprodotto;
    }

    public void setIdprodotto(Integer idprodotto) {
        this.idprodotto = idprodotto;
    }

    @Basic
    @Column(name = "IDDIVISA")
    public int getIddivisa() {
        return iddivisa;
    }

    public void setIddivisa(int iddivisa) {
        this.iddivisa = iddivisa;
    }

    @Basic
    @Column(name = "IDPVPRODUZIONE")
    public int getIdpvproduzione() {
        return idpvproduzione;
    }

    public void setIdpvproduzione(int idpvproduzione) {
        this.idpvproduzione = idpvproduzione;
    }

    @Basic
    @Column(name = "IDUSERINS")
    public int getIduserins() {
        return iduserins;
    }

    public void setIduserins(int iduserins) {
        this.iduserins = iduserins;
    }

    @Basic
    @Column(name = "DINS")
    public Timestamp getDins() {
        return dins;
    }

    public void setDins(Timestamp dins) {
        this.dins = dins;
    }

    @Basic
    @Column(name = "IDUSERAGG")
    public int getIduseragg() {
        return iduseragg;
    }

    public void setIduseragg(int iduseragg) {
        this.iduseragg = iduseragg;
    }

    @Basic
    @Column(name = "DAGG")
    public Timestamp getDagg() {
        return dagg;
    }

    public void setDagg(Timestamp dagg) {
        this.dagg = dagg;
    }

    @Basic
    @Column(name = "DANNULLAMENTO")
    public Date getDannullamento() {
        return dannullamento;
    }

    public void setDannullamento(Date dannullamento) {
        this.dannullamento = dannullamento;
    }

    @Basic
    @Column(name = "BACCORPARATA")
    public BigInteger getBaccorparata() {
        return baccorparata;
    }

    public void setBaccorparata(BigInteger baccorparata) {
        this.baccorparata = baccorparata;
    }

    @Basic
    @Column(name = "DEFFETTOORIGINALE")
    public Date getDeffettooriginale() {
        return deffettooriginale;
    }

    public void setDeffettooriginale(Date deffettooriginale) {
        this.deffettooriginale = deffettooriginale;
    }

    @Basic
    @Column(name = "BPROVVPREC")
    public BigInteger getBprovvprec() {
        return bprovvprec;
    }

    public void setBprovvprec(BigInteger bprovvprec) {
        this.bprovvprec = bprovvprec;
    }

    @Basic
    @Column(name = "DPROPOSTA")
    public Date getDproposta() {
        return dproposta;
    }

    public void setDproposta(Date dproposta) {
        this.dproposta = dproposta;
    }

    @Basic
    @Column(name = "EMOTIVOSOST")
    public Integer getEmotivosost() {
        return emotivosost;
    }

    public void setEmotivosost(Integer emotivosost) {
        this.emotivosost = emotivosost;
    }

    @Basic
    @Column(name = "BDANNI")
    public BigInteger getBdanni() {
        return bdanni;
    }

    public void setBdanni(BigInteger bdanni) {
        this.bdanni = bdanni;
    }

    @Basic
    @Column(name = "BVITA")
    public BigInteger getBvita() {
        return bvita;
    }

    public void setBvita(BigInteger bvita) {
        this.bvita = bvita;
    }

    @Basic
    @Column(name = "DSCADENZAORIGINALE")
    public Date getDscadenzaoriginale() {
        return dscadenzaoriginale;
    }

    public void setDscadenzaoriginale(Date dscadenzaoriginale) {
        this.dscadenzaoriginale = dscadenzaoriginale;
    }

    @Basic
    @Column(name = "BMIGRATA")
    public BigInteger getBmigrata() {
        return bmigrata;
    }

    public void setBmigrata(BigInteger bmigrata) {
        this.bmigrata = bmigrata;
    }

    @Basic
    @Column(name = "EUSOIMPOSTA")
    public Integer getEusoimposta() {
        return eusoimposta;
    }

    public void setEusoimposta(Integer eusoimposta) {
        this.eusoimposta = eusoimposta;
    }

    @Basic
    @Column(name = "IDCOMPAGNIA")
    public Integer getIdcompagnia() {
        return idcompagnia;
    }

    public void setIdcompagnia(Integer idcompagnia) {
        this.idcompagnia = idcompagnia;
    }

    @Basic
    @Column(name = "DBLOCCOQUIET")
    public Date getDbloccoquiet() {
        return dbloccoquiet;
    }

    public void setDbloccoquiet(Date dbloccoquiet) {
        this.dbloccoquiet = dbloccoquiet;
    }

    @Basic
    @Column(name = "CCODICERAMOTECNICO")
    public String getCcodiceramotecnico() {
        return ccodiceramotecnico;
    }

    public void setCcodiceramotecnico(String ccodiceramotecnico) {
        this.ccodiceramotecnico = ccodiceramotecnico;
    }

    @Basic
    @Column(name = "DTRASFLEGALE")
    public Date getDtrasflegale() {
        return dtrasflegale;
    }

    public void setDtrasflegale(Date dtrasflegale) {
        this.dtrasflegale = dtrasflegale;
    }

    @Basic
    @Column(name = "DTRASFAGENZIA")
    public Date getDtrasfagenzia() {
        return dtrasfagenzia;
    }

    public void setDtrasfagenzia(Date dtrasfagenzia) {
        this.dtrasfagenzia = dtrasfagenzia;
    }

    @Basic
    @Column(name = "CNUMAPPLICAZIONE")
    public String getCnumapplicazione() {
        return cnumapplicazione;
    }

    public void setCnumapplicazione(String cnumapplicazione) {
        this.cnumapplicazione = cnumapplicazione;
    }

    @Basic
    @Column(name = "ETIPOPOLIZZA")
    public Integer getEtipopolizza() {
        return etipopolizza;
    }

    public void setEtipopolizza(Integer etipopolizza) {
        this.etipopolizza = etipopolizza;
    }

    @Basic
    @Column(name = "BMODELLO")
    public BigInteger getBmodello() {
        return bmodello;
    }

    public void setBmodello(BigInteger bmodello) {
        this.bmodello = bmodello;
    }

    @Basic
    @Column(name = "NMAXVERSIONE")
    public Integer getNmaxversione() {
        return nmaxversione;
    }

    public void setNmaxversione(Integer nmaxversione) {
        this.nmaxversione = nmaxversione;
    }

    @Basic
    @Column(name = "ECATEGORIA")
    public Integer getEcategoria() {
        return ecategoria;
    }

    public void setEcategoria(Integer ecategoria) {
        this.ecategoria = ecategoria;
    }

    @Basic
    @Column(name = "DEFFETTOCORRENTE")
    public Date getDeffettocorrente() {
        return deffettocorrente;
    }

    public void setDeffettocorrente(Date deffettocorrente) {
        this.deffettocorrente = deffettocorrente;
    }

    @Basic
    @Column(name = "DSCADENZACORRENTE")
    public Date getDscadenzacorrente() {
        return dscadenzacorrente;
    }

    public void setDscadenzacorrente(Date dscadenzacorrente) {
        this.dscadenzacorrente = dscadenzacorrente;
    }

    @Basic
    @Column(name = "IDPVGESTCORRENTE")
    public Integer getIdpvgestcorrente() {
        return idpvgestcorrente;
    }

    public void setIdpvgestcorrente(Integer idpvgestcorrente) {
        this.idpvgestcorrente = idpvgestcorrente;
    }

    @Basic
    @Column(name = "IDMOTSOSTITUZIONE")
    public Integer getIdmotsostituzione() {
        return idmotsostituzione;
    }

    public void setIdmotsostituzione(Integer idmotsostituzione) {
        this.idmotsostituzione = idmotsostituzione;
    }

    @Basic
    @Column(name = "DUSCITAESPOSIZIONE")
    public Date getDuscitaesposizione() {
        return duscitaesposizione;
    }

    public void setDuscitaesposizione(Date duscitaesposizione) {
        this.duscitaesposizione = duscitaesposizione;
    }

    @Basic
    @Column(name = "EPROVENIENZA")
    public Integer getEprovenienza() {
        return eprovenienza;
    }

    public void setEprovenienza(Integer eprovenienza) {
        this.eprovenienza = eprovenienza;
    }

    @Basic
    @Column(name = "NGGDISDETTA")
    public Integer getNggdisdetta() {
        return nggdisdetta;
    }

    public void setNggdisdetta(Integer nggdisdetta) {
        this.nggdisdetta = nggdisdetta;
    }

    @Basic
    @Column(name = "DINVIOCOMANNULLO")
    public Date getDinviocomannullo() {
        return dinviocomannullo;
    }

    public void setDinviocomannullo(Date dinviocomannullo) {
        this.dinviocomannullo = dinviocomannullo;
    }

    @Basic
    @Column(name = "IDPASSAUTORIZZ")
    public Integer getIdpassautorizz() {
        return idpassautorizz;
    }

    public void setIdpassautorizz(Integer idpassautorizz) {
        this.idpassautorizz = idpassautorizz;
    }

    @Basic
    @Column(name = "CNOTE")
    public String getCnote() {
        return cnote;
    }

    public void setCnote(String cnote) {
        this.cnote = cnote;
    }

    @Basic
    @Column(name = "DBLOCCOOPERATIVITA")
    public Date getDbloccooperativita() {
        return dbloccooperativita;
    }

    public void setDbloccooperativita(Date dbloccooperativita) {
        this.dbloccooperativita = dbloccooperativita;
    }

    @Basic
    @Column(name = "CNUMLOTTO")
    public String getCnumlotto() {
        return cnumlotto;
    }

    public void setCnumlotto(String cnumlotto) {
        this.cnumlotto = cnumlotto;
    }

    @Basic
    @Column(name = "CNUMFINANZIAMENTO")
    public String getCnumfinanziamento() {
        return cnumfinanziamento;
    }

    public void setCnumfinanziamento(String cnumfinanziamento) {
        this.cnumfinanziamento = cnumfinanziamento;
    }

    @Basic
    @Column(name = "CNUMQUOTE")
    public String getCnumquote() {
        return cnumquote;
    }

    public void setCnumquote(String cnumquote) {
        this.cnumquote = cnumquote;
    }

    @Basic
    @Column(name = "IDCONTEXT")
    public Integer getIdcontext() {
        return idcontext;
    }

    public void setIdcontext(Integer idcontext) {
        this.idcontext = idcontext;
    }

    @Basic
    @Column(name = "CLOCKCODE")
    public String getClockcode() {
        return clockcode;
    }

    public void setClockcode(String clockcode) {
        this.clockcode = clockcode;
    }

    @Basic
    @Column(name = "NCPRATIO")
    public BigDecimal getNcpratio() {
        return ncpratio;
    }

    public void setNcpratio(BigDecimal ncpratio) {
        this.ncpratio = ncpratio;
    }

    @Basic
    @Column(name = "DUPDCPRATIO")
    public Date getDupdcpratio() {
        return dupdcpratio;
    }

    public void setDupdcpratio(Date dupdcpratio) {
        this.dupdcpratio = dupdcpratio;
    }

    @Basic
    @Column(name = "BPRIVACYCOMMERCIALE")
    public BigInteger getBprivacycommerciale() {
        return bprivacycommerciale;
    }

    public void setBprivacycommerciale(BigInteger bprivacycommerciale) {
        this.bprivacycommerciale = bprivacycommerciale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PcpolizzaEntity that = (PcpolizzaEntity) o;

        if (idpolizza != that.idpolizza) return false;
        if (emotivocreazione != that.emotivocreazione) return false;
        if (iddivisa != that.iddivisa) return false;
        if (idpvproduzione != that.idpvproduzione) return false;
        if (iduserins != that.iduserins) return false;
        if (iduseragg != that.iduseragg) return false;
        if (emotivoannulprop != null ? !emotivoannulprop.equals(that.emotivoannulprop) : that.emotivoannulprop != null)
            return false;
        if (demissione != null ? !demissione.equals(that.demissione) : that.demissione != null) return false;
        if (cdescrizione != null ? !cdescrizione.equals(that.cdescrizione) : that.cdescrizione != null) return false;
        if (bpolizza != null ? !bpolizza.equals(that.bpolizza) : that.bpolizza != null) return false;
        if (cnumproposta != null ? !cnumproposta.equals(that.cnumproposta) : that.cnumproposta != null) return false;
        if (cnumpolizza != null ? !cnumpolizza.equals(that.cnumpolizza) : that.cnumpolizza != null) return false;
        if (dfinevalprop != null ? !dfinevalprop.equals(that.dfinevalprop) : that.dfinevalprop != null) return false;
        if (idprodotto != null ? !idprodotto.equals(that.idprodotto) : that.idprodotto != null) return false;
        if (dins != null ? !dins.equals(that.dins) : that.dins != null) return false;
        if (dagg != null ? !dagg.equals(that.dagg) : that.dagg != null) return false;
        if (dannullamento != null ? !dannullamento.equals(that.dannullamento) : that.dannullamento != null)
            return false;
        if (baccorparata != null ? !baccorparata.equals(that.baccorparata) : that.baccorparata != null) return false;
        if (deffettooriginale != null ? !deffettooriginale.equals(that.deffettooriginale) : that.deffettooriginale != null)
            return false;
        if (bprovvprec != null ? !bprovvprec.equals(that.bprovvprec) : that.bprovvprec != null) return false;
        if (dproposta != null ? !dproposta.equals(that.dproposta) : that.dproposta != null) return false;
        if (emotivosost != null ? !emotivosost.equals(that.emotivosost) : that.emotivosost != null) return false;
        if (bdanni != null ? !bdanni.equals(that.bdanni) : that.bdanni != null) return false;
        if (bvita != null ? !bvita.equals(that.bvita) : that.bvita != null) return false;
        if (dscadenzaoriginale != null ? !dscadenzaoriginale.equals(that.dscadenzaoriginale) : that.dscadenzaoriginale != null)
            return false;
        if (bmigrata != null ? !bmigrata.equals(that.bmigrata) : that.bmigrata != null) return false;
        if (eusoimposta != null ? !eusoimposta.equals(that.eusoimposta) : that.eusoimposta != null) return false;
        if (idcompagnia != null ? !idcompagnia.equals(that.idcompagnia) : that.idcompagnia != null) return false;
        if (dbloccoquiet != null ? !dbloccoquiet.equals(that.dbloccoquiet) : that.dbloccoquiet != null) return false;
        if (ccodiceramotecnico != null ? !ccodiceramotecnico.equals(that.ccodiceramotecnico) : that.ccodiceramotecnico != null)
            return false;
        if (dtrasflegale != null ? !dtrasflegale.equals(that.dtrasflegale) : that.dtrasflegale != null) return false;
        if (dtrasfagenzia != null ? !dtrasfagenzia.equals(that.dtrasfagenzia) : that.dtrasfagenzia != null)
            return false;
        if (cnumapplicazione != null ? !cnumapplicazione.equals(that.cnumapplicazione) : that.cnumapplicazione != null)
            return false;
        if (etipopolizza != null ? !etipopolizza.equals(that.etipopolizza) : that.etipopolizza != null) return false;
        if (bmodello != null ? !bmodello.equals(that.bmodello) : that.bmodello != null) return false;
        if (nmaxversione != null ? !nmaxversione.equals(that.nmaxversione) : that.nmaxversione != null) return false;
        if (ecategoria != null ? !ecategoria.equals(that.ecategoria) : that.ecategoria != null) return false;
        if (deffettocorrente != null ? !deffettocorrente.equals(that.deffettocorrente) : that.deffettocorrente != null)
            return false;
        if (dscadenzacorrente != null ? !dscadenzacorrente.equals(that.dscadenzacorrente) : that.dscadenzacorrente != null)
            return false;
        if (idpvgestcorrente != null ? !idpvgestcorrente.equals(that.idpvgestcorrente) : that.idpvgestcorrente != null)
            return false;
        if (idmotsostituzione != null ? !idmotsostituzione.equals(that.idmotsostituzione) : that.idmotsostituzione != null)
            return false;
        if (duscitaesposizione != null ? !duscitaesposizione.equals(that.duscitaesposizione) : that.duscitaesposizione != null)
            return false;
        if (eprovenienza != null ? !eprovenienza.equals(that.eprovenienza) : that.eprovenienza != null) return false;
        if (nggdisdetta != null ? !nggdisdetta.equals(that.nggdisdetta) : that.nggdisdetta != null) return false;
        if (dinviocomannullo != null ? !dinviocomannullo.equals(that.dinviocomannullo) : that.dinviocomannullo != null)
            return false;
        if (idpassautorizz != null ? !idpassautorizz.equals(that.idpassautorizz) : that.idpassautorizz != null)
            return false;
        if (cnote != null ? !cnote.equals(that.cnote) : that.cnote != null) return false;
        if (dbloccooperativita != null ? !dbloccooperativita.equals(that.dbloccooperativita) : that.dbloccooperativita != null)
            return false;
        if (cnumlotto != null ? !cnumlotto.equals(that.cnumlotto) : that.cnumlotto != null) return false;
        if (cnumfinanziamento != null ? !cnumfinanziamento.equals(that.cnumfinanziamento) : that.cnumfinanziamento != null)
            return false;
        if (cnumquote != null ? !cnumquote.equals(that.cnumquote) : that.cnumquote != null) return false;
        if (idcontext != null ? !idcontext.equals(that.idcontext) : that.idcontext != null) return false;
        if (clockcode != null ? !clockcode.equals(that.clockcode) : that.clockcode != null) return false;
        if (ncpratio != null ? !ncpratio.equals(that.ncpratio) : that.ncpratio != null) return false;
        if (dupdcpratio != null ? !dupdcpratio.equals(that.dupdcpratio) : that.dupdcpratio != null) return false;
        if (bprivacycommerciale != null ? !bprivacycommerciale.equals(that.bprivacycommerciale) : that.bprivacycommerciale != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idpolizza;
        result = 31 * result + (emotivoannulprop != null ? emotivoannulprop.hashCode() : 0);
        result = 31 * result + (demissione != null ? demissione.hashCode() : 0);
        result = 31 * result + emotivocreazione;
        result = 31 * result + (cdescrizione != null ? cdescrizione.hashCode() : 0);
        result = 31 * result + (bpolizza != null ? bpolizza.hashCode() : 0);
        result = 31 * result + (cnumproposta != null ? cnumproposta.hashCode() : 0);
        result = 31 * result + (cnumpolizza != null ? cnumpolizza.hashCode() : 0);
        result = 31 * result + (dfinevalprop != null ? dfinevalprop.hashCode() : 0);
        result = 31 * result + (idprodotto != null ? idprodotto.hashCode() : 0);
        result = 31 * result + iddivisa;
        result = 31 * result + idpvproduzione;
        result = 31 * result + iduserins;
        result = 31 * result + (dins != null ? dins.hashCode() : 0);
        result = 31 * result + iduseragg;
        result = 31 * result + (dagg != null ? dagg.hashCode() : 0);
        result = 31 * result + (dannullamento != null ? dannullamento.hashCode() : 0);
        result = 31 * result + (baccorparata != null ? baccorparata.hashCode() : 0);
        result = 31 * result + (deffettooriginale != null ? deffettooriginale.hashCode() : 0);
        result = 31 * result + (bprovvprec != null ? bprovvprec.hashCode() : 0);
        result = 31 * result + (dproposta != null ? dproposta.hashCode() : 0);
        result = 31 * result + (emotivosost != null ? emotivosost.hashCode() : 0);
        result = 31 * result + (bdanni != null ? bdanni.hashCode() : 0);
        result = 31 * result + (bvita != null ? bvita.hashCode() : 0);
        result = 31 * result + (dscadenzaoriginale != null ? dscadenzaoriginale.hashCode() : 0);
        result = 31 * result + (bmigrata != null ? bmigrata.hashCode() : 0);
        result = 31 * result + (eusoimposta != null ? eusoimposta.hashCode() : 0);
        result = 31 * result + (idcompagnia != null ? idcompagnia.hashCode() : 0);
        result = 31 * result + (dbloccoquiet != null ? dbloccoquiet.hashCode() : 0);
        result = 31 * result + (ccodiceramotecnico != null ? ccodiceramotecnico.hashCode() : 0);
        result = 31 * result + (dtrasflegale != null ? dtrasflegale.hashCode() : 0);
        result = 31 * result + (dtrasfagenzia != null ? dtrasfagenzia.hashCode() : 0);
        result = 31 * result + (cnumapplicazione != null ? cnumapplicazione.hashCode() : 0);
        result = 31 * result + (etipopolizza != null ? etipopolizza.hashCode() : 0);
        result = 31 * result + (bmodello != null ? bmodello.hashCode() : 0);
        result = 31 * result + (nmaxversione != null ? nmaxversione.hashCode() : 0);
        result = 31 * result + (ecategoria != null ? ecategoria.hashCode() : 0);
        result = 31 * result + (deffettocorrente != null ? deffettocorrente.hashCode() : 0);
        result = 31 * result + (dscadenzacorrente != null ? dscadenzacorrente.hashCode() : 0);
        result = 31 * result + (idpvgestcorrente != null ? idpvgestcorrente.hashCode() : 0);
        result = 31 * result + (idmotsostituzione != null ? idmotsostituzione.hashCode() : 0);
        result = 31 * result + (duscitaesposizione != null ? duscitaesposizione.hashCode() : 0);
        result = 31 * result + (eprovenienza != null ? eprovenienza.hashCode() : 0);
        result = 31 * result + (nggdisdetta != null ? nggdisdetta.hashCode() : 0);
        result = 31 * result + (dinviocomannullo != null ? dinviocomannullo.hashCode() : 0);
        result = 31 * result + (idpassautorizz != null ? idpassautorizz.hashCode() : 0);
        result = 31 * result + (cnote != null ? cnote.hashCode() : 0);
        result = 31 * result + (dbloccooperativita != null ? dbloccooperativita.hashCode() : 0);
        result = 31 * result + (cnumlotto != null ? cnumlotto.hashCode() : 0);
        result = 31 * result + (cnumfinanziamento != null ? cnumfinanziamento.hashCode() : 0);
        result = 31 * result + (cnumquote != null ? cnumquote.hashCode() : 0);
        result = 31 * result + (idcontext != null ? idcontext.hashCode() : 0);
        result = 31 * result + (clockcode != null ? clockcode.hashCode() : 0);
        result = 31 * result + (ncpratio != null ? ncpratio.hashCode() : 0);
        result = 31 * result + (dupdcpratio != null ? dupdcpratio.hashCode() : 0);
        result = 31 * result + (bprivacycommerciale != null ? bprivacycommerciale.hashCode() : 0);
        return result;
    }
}
