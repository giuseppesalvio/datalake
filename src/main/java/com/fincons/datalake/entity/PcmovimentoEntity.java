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
@Table(name = "pcmovimento", schema = "datalake", catalog = "")
@IdClass(PcmovimentoEntityPK.class)
public class PcmovimentoEntity {
    private int idmovimento;
    private int nversione;
    private BigInteger btemporaneo;
    private String cdescrizione;
    private Date deffetto;
    private Date dscadenza;
    private Date demissione;
    private int idpolizza;
    private int idcausale;
    private Integer idgruppotitoli;
    private Integer nnumeroappendice;
    private String cnote;
    private Integer estato;
    private Integer iduser;
    private Timestamp doperazione;
    private BigInteger bannullato;
    private Integer estatoaut;
    private String coraeffetto;
    private BigInteger bmigrato;
    private Integer ecategoria;
    private Integer esottostato;
    private Integer idcompagnia;
    private Integer estatoregolazione;
    private Integer idmovregolazione;
    private Date dstorno;
    private Integer idmovannullato;
    private BigInteger bautoderogato;
    private Integer eappfedfiscale;
    private Integer eprovenienza;
    private Integer idcurrency;
    private Date dexchange;
    private BigDecimal nexchangerate;
    private Date dcarico;
    private Date dcaricostorno;
    private Integer idcausalestorno;
    private BigInteger bsupplettivo;
    private Timestamp temissionemov;

    @Id
    @Column(name = "IDMOVIMENTO")
    public int getIdmovimento() {
        return idmovimento;
    }

    public void setIdmovimento(int idmovimento) {
        this.idmovimento = idmovimento;
    }

    @Id
    @Column(name = "NVERSIONE")
    public int getNversione() {
        return nversione;
    }

    public void setNversione(int nversione) {
        this.nversione = nversione;
    }

    @Id
    @Column(name = "BTEMPORANEO")
    public BigInteger getBtemporaneo() {
        return btemporaneo;
    }

    public void setBtemporaneo(BigInteger btemporaneo) {
        this.btemporaneo = btemporaneo;
    }

    @Id
    @Column(name = "CDESCRIZIONE")
    public String getCdescrizione() {
        return cdescrizione;
    }

    public void setCdescrizione(String cdescrizione) {
        this.cdescrizione = cdescrizione;
    }

    @Id
    @Column(name = "DEFFETTO")
    public Date getDeffetto() {
        return deffetto;
    }

    public void setDeffetto(Date deffetto) {
        this.deffetto = deffetto;
    }

    @Basic
    @Column(name = "DSCADENZA")
    public Date getDscadenza() {
        return dscadenza;
    }

    public void setDscadenza(Date dscadenza) {
        this.dscadenza = dscadenza;
    }

    @Id
    @Column(name = "DEMISSIONE")
    public Date getDemissione() {
        return demissione;
    }

    public void setDemissione(Date demissione) {
        this.demissione = demissione;
    }

    @Id
    @Column(name = "IDPOLIZZA")
    public int getIdpolizza() {
        return idpolizza;
    }

    public void setIdpolizza(int idpolizza) {
        this.idpolizza = idpolizza;
    }

    @Id
    @Column(name = "IDCAUSALE")
    public int getIdcausale() {
        return idcausale;
    }

    public void setIdcausale(int idcausale) {
        this.idcausale = idcausale;
    }

    @Basic
    @Column(name = "IDGRUPPOTITOLI")
    public Integer getIdgruppotitoli() {
        return idgruppotitoli;
    }

    public void setIdgruppotitoli(Integer idgruppotitoli) {
        this.idgruppotitoli = idgruppotitoli;
    }

    @Basic
    @Column(name = "NNUMEROAPPENDICE")
    public Integer getNnumeroappendice() {
        return nnumeroappendice;
    }

    public void setNnumeroappendice(Integer nnumeroappendice) {
        this.nnumeroappendice = nnumeroappendice;
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
    @Column(name = "ESTATO")
    public Integer getEstato() {
        return estato;
    }

    public void setEstato(Integer estato) {
        this.estato = estato;
    }

    @Basic
    @Column(name = "IDUSER")
    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

    @Basic
    @Column(name = "DOPERAZIONE")
    public Timestamp getDoperazione() {
        return doperazione;
    }

    public void setDoperazione(Timestamp doperazione) {
        this.doperazione = doperazione;
    }

    @Basic
    @Column(name = "BANNULLATO")
    public BigInteger getBannullato() {
        return bannullato;
    }

    public void setBannullato(BigInteger bannullato) {
        this.bannullato = bannullato;
    }

    @Basic
    @Column(name = "ESTATOAUT")
    public Integer getEstatoaut() {
        return estatoaut;
    }

    public void setEstatoaut(Integer estatoaut) {
        this.estatoaut = estatoaut;
    }

    @Basic
    @Column(name = "CORAEFFETTO")
    public String getCoraeffetto() {
        return coraeffetto;
    }

    public void setCoraeffetto(String coraeffetto) {
        this.coraeffetto = coraeffetto;
    }

    @Basic
    @Column(name = "BMIGRATO")
    public BigInteger getBmigrato() {
        return bmigrato;
    }

    public void setBmigrato(BigInteger bmigrato) {
        this.bmigrato = bmigrato;
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
    @Column(name = "ESOTTOSTATO")
    public Integer getEsottostato() {
        return esottostato;
    }

    public void setEsottostato(Integer esottostato) {
        this.esottostato = esottostato;
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
    @Column(name = "ESTATOREGOLAZIONE")
    public Integer getEstatoregolazione() {
        return estatoregolazione;
    }

    public void setEstatoregolazione(Integer estatoregolazione) {
        this.estatoregolazione = estatoregolazione;
    }

    @Basic
    @Column(name = "IDMOVREGOLAZIONE")
    public Integer getIdmovregolazione() {
        return idmovregolazione;
    }

    public void setIdmovregolazione(Integer idmovregolazione) {
        this.idmovregolazione = idmovregolazione;
    }

    @Basic
    @Column(name = "DSTORNO")
    public Date getDstorno() {
        return dstorno;
    }

    public void setDstorno(Date dstorno) {
        this.dstorno = dstorno;
    }

    @Basic
    @Column(name = "IDMOVANNULLATO")
    public Integer getIdmovannullato() {
        return idmovannullato;
    }

    public void setIdmovannullato(Integer idmovannullato) {
        this.idmovannullato = idmovannullato;
    }

    @Basic
    @Column(name = "BAUTODEROGATO")
    public BigInteger getBautoderogato() {
        return bautoderogato;
    }

    public void setBautoderogato(BigInteger bautoderogato) {
        this.bautoderogato = bautoderogato;
    }

    @Basic
    @Column(name = "EAPPFEDFISCALE")
    public Integer getEappfedfiscale() {
        return eappfedfiscale;
    }

    public void setEappfedfiscale(Integer eappfedfiscale) {
        this.eappfedfiscale = eappfedfiscale;
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
    @Column(name = "IDCURRENCY")
    public Integer getIdcurrency() {
        return idcurrency;
    }

    public void setIdcurrency(Integer idcurrency) {
        this.idcurrency = idcurrency;
    }

    @Basic
    @Column(name = "DEXCHANGE")
    public Date getDexchange() {
        return dexchange;
    }

    public void setDexchange(Date dexchange) {
        this.dexchange = dexchange;
    }

    @Basic
    @Column(name = "NEXCHANGERATE")
    public BigDecimal getNexchangerate() {
        return nexchangerate;
    }

    public void setNexchangerate(BigDecimal nexchangerate) {
        this.nexchangerate = nexchangerate;
    }

    @Basic
    @Column(name = "DCARICO")
    public Date getDcarico() {
        return dcarico;
    }

    public void setDcarico(Date dcarico) {
        this.dcarico = dcarico;
    }

    @Basic
    @Column(name = "DCARICOSTORNO")
    public Date getDcaricostorno() {
        return dcaricostorno;
    }

    public void setDcaricostorno(Date dcaricostorno) {
        this.dcaricostorno = dcaricostorno;
    }

    @Basic
    @Column(name = "IDCAUSALESTORNO")
    public Integer getIdcausalestorno() {
        return idcausalestorno;
    }

    public void setIdcausalestorno(Integer idcausalestorno) {
        this.idcausalestorno = idcausalestorno;
    }

    @Basic
    @Column(name = "BSUPPLETTIVO")
    public BigInteger getBsupplettivo() {
        return bsupplettivo;
    }

    public void setBsupplettivo(BigInteger bsupplettivo) {
        this.bsupplettivo = bsupplettivo;
    }

    @Basic
    @Column(name = "TEMISSIONEMOV")
    public Timestamp getTemissionemov() {
        return temissionemov;
    }

    public void setTemissionemov(Timestamp temissionemov) {
        this.temissionemov = temissionemov;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PcmovimentoEntity that = (PcmovimentoEntity) o;

        if (idmovimento != that.idmovimento) return false;
        if (nversione != that.nversione) return false;
        if (idpolizza != that.idpolizza) return false;
        if (idcausale != that.idcausale) return false;
        if (btemporaneo != null ? !btemporaneo.equals(that.btemporaneo) : that.btemporaneo != null) return false;
        if (cdescrizione != null ? !cdescrizione.equals(that.cdescrizione) : that.cdescrizione != null) return false;
        if (deffetto != null ? !deffetto.equals(that.deffetto) : that.deffetto != null) return false;
        if (dscadenza != null ? !dscadenza.equals(that.dscadenza) : that.dscadenza != null) return false;
        if (demissione != null ? !demissione.equals(that.demissione) : that.demissione != null) return false;
        if (idgruppotitoli != null ? !idgruppotitoli.equals(that.idgruppotitoli) : that.idgruppotitoli != null)
            return false;
        if (nnumeroappendice != null ? !nnumeroappendice.equals(that.nnumeroappendice) : that.nnumeroappendice != null)
            return false;
        if (cnote != null ? !cnote.equals(that.cnote) : that.cnote != null) return false;
        if (estato != null ? !estato.equals(that.estato) : that.estato != null) return false;
        if (iduser != null ? !iduser.equals(that.iduser) : that.iduser != null) return false;
        if (doperazione != null ? !doperazione.equals(that.doperazione) : that.doperazione != null) return false;
        if (bannullato != null ? !bannullato.equals(that.bannullato) : that.bannullato != null) return false;
        if (estatoaut != null ? !estatoaut.equals(that.estatoaut) : that.estatoaut != null) return false;
        if (coraeffetto != null ? !coraeffetto.equals(that.coraeffetto) : that.coraeffetto != null) return false;
        if (bmigrato != null ? !bmigrato.equals(that.bmigrato) : that.bmigrato != null) return false;
        if (ecategoria != null ? !ecategoria.equals(that.ecategoria) : that.ecategoria != null) return false;
        if (esottostato != null ? !esottostato.equals(that.esottostato) : that.esottostato != null) return false;
        if (idcompagnia != null ? !idcompagnia.equals(that.idcompagnia) : that.idcompagnia != null) return false;
        if (estatoregolazione != null ? !estatoregolazione.equals(that.estatoregolazione) : that.estatoregolazione != null)
            return false;
        if (idmovregolazione != null ? !idmovregolazione.equals(that.idmovregolazione) : that.idmovregolazione != null)
            return false;
        if (dstorno != null ? !dstorno.equals(that.dstorno) : that.dstorno != null) return false;
        if (idmovannullato != null ? !idmovannullato.equals(that.idmovannullato) : that.idmovannullato != null)
            return false;
        if (bautoderogato != null ? !bautoderogato.equals(that.bautoderogato) : that.bautoderogato != null)
            return false;
        if (eappfedfiscale != null ? !eappfedfiscale.equals(that.eappfedfiscale) : that.eappfedfiscale != null)
            return false;
        if (eprovenienza != null ? !eprovenienza.equals(that.eprovenienza) : that.eprovenienza != null) return false;
        if (idcurrency != null ? !idcurrency.equals(that.idcurrency) : that.idcurrency != null) return false;
        if (dexchange != null ? !dexchange.equals(that.dexchange) : that.dexchange != null) return false;
        if (nexchangerate != null ? !nexchangerate.equals(that.nexchangerate) : that.nexchangerate != null)
            return false;
        if (dcarico != null ? !dcarico.equals(that.dcarico) : that.dcarico != null) return false;
        if (dcaricostorno != null ? !dcaricostorno.equals(that.dcaricostorno) : that.dcaricostorno != null)
            return false;
        if (idcausalestorno != null ? !idcausalestorno.equals(that.idcausalestorno) : that.idcausalestorno != null)
            return false;
        if (bsupplettivo != null ? !bsupplettivo.equals(that.bsupplettivo) : that.bsupplettivo != null) return false;
        if (temissionemov != null ? !temissionemov.equals(that.temissionemov) : that.temissionemov != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idmovimento;
        result = 31 * result + nversione;
        result = 31 * result + (btemporaneo != null ? btemporaneo.hashCode() : 0);
        result = 31 * result + (cdescrizione != null ? cdescrizione.hashCode() : 0);
        result = 31 * result + (deffetto != null ? deffetto.hashCode() : 0);
        result = 31 * result + (dscadenza != null ? dscadenza.hashCode() : 0);
        result = 31 * result + (demissione != null ? demissione.hashCode() : 0);
        result = 31 * result + idpolizza;
        result = 31 * result + idcausale;
        result = 31 * result + (idgruppotitoli != null ? idgruppotitoli.hashCode() : 0);
        result = 31 * result + (nnumeroappendice != null ? nnumeroappendice.hashCode() : 0);
        result = 31 * result + (cnote != null ? cnote.hashCode() : 0);
        result = 31 * result + (estato != null ? estato.hashCode() : 0);
        result = 31 * result + (iduser != null ? iduser.hashCode() : 0);
        result = 31 * result + (doperazione != null ? doperazione.hashCode() : 0);
        result = 31 * result + (bannullato != null ? bannullato.hashCode() : 0);
        result = 31 * result + (estatoaut != null ? estatoaut.hashCode() : 0);
        result = 31 * result + (coraeffetto != null ? coraeffetto.hashCode() : 0);
        result = 31 * result + (bmigrato != null ? bmigrato.hashCode() : 0);
        result = 31 * result + (ecategoria != null ? ecategoria.hashCode() : 0);
        result = 31 * result + (esottostato != null ? esottostato.hashCode() : 0);
        result = 31 * result + (idcompagnia != null ? idcompagnia.hashCode() : 0);
        result = 31 * result + (estatoregolazione != null ? estatoregolazione.hashCode() : 0);
        result = 31 * result + (idmovregolazione != null ? idmovregolazione.hashCode() : 0);
        result = 31 * result + (dstorno != null ? dstorno.hashCode() : 0);
        result = 31 * result + (idmovannullato != null ? idmovannullato.hashCode() : 0);
        result = 31 * result + (bautoderogato != null ? bautoderogato.hashCode() : 0);
        result = 31 * result + (eappfedfiscale != null ? eappfedfiscale.hashCode() : 0);
        result = 31 * result + (eprovenienza != null ? eprovenienza.hashCode() : 0);
        result = 31 * result + (idcurrency != null ? idcurrency.hashCode() : 0);
        result = 31 * result + (dexchange != null ? dexchange.hashCode() : 0);
        result = 31 * result + (nexchangerate != null ? nexchangerate.hashCode() : 0);
        result = 31 * result + (dcarico != null ? dcarico.hashCode() : 0);
        result = 31 * result + (dcaricostorno != null ? dcaricostorno.hashCode() : 0);
        result = 31 * result + (idcausalestorno != null ? idcausalestorno.hashCode() : 0);
        result = 31 * result + (bsupplettivo != null ? bsupplettivo.hashCode() : 0);
        result = 31 * result + (temissionemov != null ? temissionemov.hashCode() : 0);
        return result;
    }
}
