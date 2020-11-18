package com.fincons.datalake.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;

public class PcmovimentoEntityPK implements Serializable {
    private int idmovimento;
    private int nversione;
    private BigInteger btemporaneo;
    private String cdescrizione;
    private Date deffetto;
    private Date demissione;
    private int idpolizza;
    private int idcausale;

    @Column(name = "IDMOVIMENTO")
    @Id
    public int getIdmovimento() {
        return idmovimento;
    }

    public void setIdmovimento(int idmovimento) {
        this.idmovimento = idmovimento;
    }

    @Column(name = "NVERSIONE")
    @Id
    public int getNversione() {
        return nversione;
    }

    public void setNversione(int nversione) {
        this.nversione = nversione;
    }

    @Column(name = "BTEMPORANEO")
    @Id
    public BigInteger getBtemporaneo() {
        return btemporaneo;
    }

    public void setBtemporaneo(BigInteger btemporaneo) {
        this.btemporaneo = btemporaneo;
    }

    @Column(name = "CDESCRIZIONE")
    @Id
    public String getCdescrizione() {
        return cdescrizione;
    }

    public void setCdescrizione(String cdescrizione) {
        this.cdescrizione = cdescrizione;
    }

    @Column(name = "DEFFETTO")
    @Id
    public Date getDeffetto() {
        return deffetto;
    }

    public void setDeffetto(Date deffetto) {
        this.deffetto = deffetto;
    }

    @Column(name = "DEMISSIONE")
    @Id
    public Date getDemissione() {
        return demissione;
    }

    public void setDemissione(Date demissione) {
        this.demissione = demissione;
    }

    @Column(name = "IDPOLIZZA")
    @Id
    public int getIdpolizza() {
        return idpolizza;
    }

    public void setIdpolizza(int idpolizza) {
        this.idpolizza = idpolizza;
    }

    @Column(name = "IDCAUSALE")
    @Id
    public int getIdcausale() {
        return idcausale;
    }

    public void setIdcausale(int idcausale) {
        this.idcausale = idcausale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PcmovimentoEntityPK that = (PcmovimentoEntityPK) o;

        if (idmovimento != that.idmovimento) return false;
        if (nversione != that.nversione) return false;
        if (idpolizza != that.idpolizza) return false;
        if (idcausale != that.idcausale) return false;
        if (btemporaneo != null ? !btemporaneo.equals(that.btemporaneo) : that.btemporaneo != null) return false;
        if (cdescrizione != null ? !cdescrizione.equals(that.cdescrizione) : that.cdescrizione != null) return false;
        if (deffetto != null ? !deffetto.equals(that.deffetto) : that.deffetto != null) return false;
        if (demissione != null ? !demissione.equals(that.demissione) : that.demissione != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idmovimento;
        result = 31 * result + nversione;
        result = 31 * result + (btemporaneo != null ? btemporaneo.hashCode() : 0);
        result = 31 * result + (cdescrizione != null ? cdescrizione.hashCode() : 0);
        result = 31 * result + (deffetto != null ? deffetto.hashCode() : 0);
        result = 31 * result + (demissione != null ? demissione.hashCode() : 0);
        result = 31 * result + idpolizza;
        result = 31 * result + idcausale;
        return result;
    }
}
