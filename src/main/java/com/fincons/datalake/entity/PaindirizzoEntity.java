package com.fincons.datalake.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "paindirizzo", schema = "datalake", catalog = "")
public class PaindirizzoEntity {
    private int idindirizzo;
    private String cprovincia;
    private String ccap;
    private Integer idtoponimo;
    private String csiglanazione;
    private String cnumerocivico;
    private String ccomune;
    private String cindirizzo;
    private String cfrazione;
    private String cpresso;
    private BigInteger bforzatoindirizzo;
    private BigInteger bnormalizzato;
    private String ccab;
    private BigInteger bprincipale;
    private String ccodice;
    private String clatitudine;
    private String clongitudine;
    private String ccodedettaglio;
    private String ccodiceistat;
    private String ccomuneestero;

    @Id
    @Column(name = "IDINDIRIZZO")
    public int getIdindirizzo() {
        return idindirizzo;
    }

    public void setIdindirizzo(int idindirizzo) {
        this.idindirizzo = idindirizzo;
    }

    @Basic
    @Column(name = "CPROVINCIA")
    public String getCprovincia() {
        return cprovincia;
    }

    public void setCprovincia(String cprovincia) {
        this.cprovincia = cprovincia;
    }

    @Basic
    @Column(name = "CCAP")
    public String getCcap() {
        return ccap;
    }

    public void setCcap(String ccap) {
        this.ccap = ccap;
    }

    @Basic
    @Column(name = "IDTOPONIMO")
    public Integer getIdtoponimo() {
        return idtoponimo;
    }

    public void setIdtoponimo(Integer idtoponimo) {
        this.idtoponimo = idtoponimo;
    }

    @Basic
    @Column(name = "CSIGLANAZIONE")
    public String getCsiglanazione() {
        return csiglanazione;
    }

    public void setCsiglanazione(String csiglanazione) {
        this.csiglanazione = csiglanazione;
    }

    @Basic
    @Column(name = "CNUMEROCIVICO")
    public String getCnumerocivico() {
        return cnumerocivico;
    }

    public void setCnumerocivico(String cnumerocivico) {
        this.cnumerocivico = cnumerocivico;
    }

    @Basic
    @Column(name = "CCOMUNE")
    public String getCcomune() {
        return ccomune;
    }

    public void setCcomune(String ccomune) {
        this.ccomune = ccomune;
    }

    @Basic
    @Column(name = "CINDIRIZZO")
    public String getCindirizzo() {
        return cindirizzo;
    }

    public void setCindirizzo(String cindirizzo) {
        this.cindirizzo = cindirizzo;
    }

    @Basic
    @Column(name = "CFRAZIONE")
    public String getCfrazione() {
        return cfrazione;
    }

    public void setCfrazione(String cfrazione) {
        this.cfrazione = cfrazione;
    }

    @Basic
    @Column(name = "CPRESSO")
    public String getCpresso() {
        return cpresso;
    }

    public void setCpresso(String cpresso) {
        this.cpresso = cpresso;
    }

    @Basic
    @Column(name = "BFORZATOINDIRIZZO")
    public BigInteger getBforzatoindirizzo() {
        return bforzatoindirizzo;
    }

    public void setBforzatoindirizzo(BigInteger bforzatoindirizzo) {
        this.bforzatoindirizzo = bforzatoindirizzo;
    }

    @Basic
    @Column(name = "BNORMALIZZATO")
    public BigInteger getBnormalizzato() {
        return bnormalizzato;
    }

    public void setBnormalizzato(BigInteger bnormalizzato) {
        this.bnormalizzato = bnormalizzato;
    }

    @Basic
    @Column(name = "CCAB")
    public String getCcab() {
        return ccab;
    }

    public void setCcab(String ccab) {
        this.ccab = ccab;
    }

    @Basic
    @Column(name = "BPRINCIPALE")
    public BigInteger getBprincipale() {
        return bprincipale;
    }

    public void setBprincipale(BigInteger bprincipale) {
        this.bprincipale = bprincipale;
    }

    @Basic
    @Column(name = "CCODICE")
    public String getCcodice() {
        return ccodice;
    }

    public void setCcodice(String ccodice) {
        this.ccodice = ccodice;
    }

    @Basic
    @Column(name = "CLATITUDINE")
    public String getClatitudine() {
        return clatitudine;
    }

    public void setClatitudine(String clatitudine) {
        this.clatitudine = clatitudine;
    }

    @Basic
    @Column(name = "CLONGITUDINE")
    public String getClongitudine() {
        return clongitudine;
    }

    public void setClongitudine(String clongitudine) {
        this.clongitudine = clongitudine;
    }

    @Basic
    @Column(name = "CCODEDETTAGLIO")
    public String getCcodedettaglio() {
        return ccodedettaglio;
    }

    public void setCcodedettaglio(String ccodedettaglio) {
        this.ccodedettaglio = ccodedettaglio;
    }

    @Basic
    @Column(name = "CCODICEISTAT")
    public String getCcodiceistat() {
        return ccodiceistat;
    }

    public void setCcodiceistat(String ccodiceistat) {
        this.ccodiceistat = ccodiceistat;
    }

    @Basic
    @Column(name = "CCOMUNEESTERO")
    public String getCcomuneestero() {
        return ccomuneestero;
    }

    public void setCcomuneestero(String ccomuneestero) {
        this.ccomuneestero = ccomuneestero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PaindirizzoEntity that = (PaindirizzoEntity) o;

        if (idindirizzo != that.idindirizzo) return false;
        if (cprovincia != null ? !cprovincia.equals(that.cprovincia) : that.cprovincia != null) return false;
        if (ccap != null ? !ccap.equals(that.ccap) : that.ccap != null) return false;
        if (idtoponimo != null ? !idtoponimo.equals(that.idtoponimo) : that.idtoponimo != null) return false;
        if (csiglanazione != null ? !csiglanazione.equals(that.csiglanazione) : that.csiglanazione != null)
            return false;
        if (cnumerocivico != null ? !cnumerocivico.equals(that.cnumerocivico) : that.cnumerocivico != null)
            return false;
        if (ccomune != null ? !ccomune.equals(that.ccomune) : that.ccomune != null) return false;
        if (cindirizzo != null ? !cindirizzo.equals(that.cindirizzo) : that.cindirizzo != null) return false;
        if (cfrazione != null ? !cfrazione.equals(that.cfrazione) : that.cfrazione != null) return false;
        if (cpresso != null ? !cpresso.equals(that.cpresso) : that.cpresso != null) return false;
        if (bforzatoindirizzo != null ? !bforzatoindirizzo.equals(that.bforzatoindirizzo) : that.bforzatoindirizzo != null)
            return false;
        if (bnormalizzato != null ? !bnormalizzato.equals(that.bnormalizzato) : that.bnormalizzato != null)
            return false;
        if (ccab != null ? !ccab.equals(that.ccab) : that.ccab != null) return false;
        if (bprincipale != null ? !bprincipale.equals(that.bprincipale) : that.bprincipale != null) return false;
        if (ccodice != null ? !ccodice.equals(that.ccodice) : that.ccodice != null) return false;
        if (clatitudine != null ? !clatitudine.equals(that.clatitudine) : that.clatitudine != null) return false;
        if (clongitudine != null ? !clongitudine.equals(that.clongitudine) : that.clongitudine != null) return false;
        if (ccodedettaglio != null ? !ccodedettaglio.equals(that.ccodedettaglio) : that.ccodedettaglio != null)
            return false;
        if (ccodiceistat != null ? !ccodiceistat.equals(that.ccodiceistat) : that.ccodiceistat != null) return false;
        if (ccomuneestero != null ? !ccomuneestero.equals(that.ccomuneestero) : that.ccomuneestero != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idindirizzo;
        result = 31 * result + (cprovincia != null ? cprovincia.hashCode() : 0);
        result = 31 * result + (ccap != null ? ccap.hashCode() : 0);
        result = 31 * result + (idtoponimo != null ? idtoponimo.hashCode() : 0);
        result = 31 * result + (csiglanazione != null ? csiglanazione.hashCode() : 0);
        result = 31 * result + (cnumerocivico != null ? cnumerocivico.hashCode() : 0);
        result = 31 * result + (ccomune != null ? ccomune.hashCode() : 0);
        result = 31 * result + (cindirizzo != null ? cindirizzo.hashCode() : 0);
        result = 31 * result + (cfrazione != null ? cfrazione.hashCode() : 0);
        result = 31 * result + (cpresso != null ? cpresso.hashCode() : 0);
        result = 31 * result + (bforzatoindirizzo != null ? bforzatoindirizzo.hashCode() : 0);
        result = 31 * result + (bnormalizzato != null ? bnormalizzato.hashCode() : 0);
        result = 31 * result + (ccab != null ? ccab.hashCode() : 0);
        result = 31 * result + (bprincipale != null ? bprincipale.hashCode() : 0);
        result = 31 * result + (ccodice != null ? ccodice.hashCode() : 0);
        result = 31 * result + (clatitudine != null ? clatitudine.hashCode() : 0);
        result = 31 * result + (clongitudine != null ? clongitudine.hashCode() : 0);
        result = 31 * result + (ccodedettaglio != null ? ccodedettaglio.hashCode() : 0);
        result = 31 * result + (ccodiceistat != null ? ccodiceistat.hashCode() : 0);
        result = 31 * result + (ccomuneestero != null ? ccomuneestero.hashCode() : 0);
        return result;
    }
}
