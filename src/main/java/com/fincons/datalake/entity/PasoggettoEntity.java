package com.fincons.datalake.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "pasoggetto", schema = "datalake", catalog = "")
@IdClass(PasoggettoEntityPK.class)
public class PasoggettoEntity {
    private int idsoggetto;
    private Integer idcompagnia;
    private Integer egiuridicofisico;
    private Integer etiposoggetto;
    private int iddatisingoli;
    private Integer idresidenza;
    private String ccodicefiscale;
    private Integer esesso;
    private Date dnascita;
    private String cnazionenascita;
    private String cprovincianascita;
    private Integer ecanaleacq;
    private Integer iduserins;
    private Integer iduseragg;
    private Timestamp tagg;
    private Timestamp tins;
    private Integer idtitoloonorifico;
    private BigInteger besenzioneimposte;
    private Integer idultimafoto;
    private Integer etipoanagrafica;
    private String clocalitanascita;
    private Date daperturasocieta;
    private String cnumcarpetta;
    private BigInteger bmigrato;
    private Integer idtitolostudio;
    private BigInteger baltraanag;
    private String ccodiceconsorzio;
    private Integer idlingua;
    private Date ddecesso;
    private Integer idresidence;
    private Integer idbirthaddress;
    private String clockreason;
    private BigInteger bforzatocf;

    @Id
    @Column(name = "IDSOGGETTO")
    public int getIdsoggetto() {
        return idsoggetto;
    }

    public void setIdsoggetto(int idsoggetto) {
        this.idsoggetto = idsoggetto;
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
    @Column(name = "EGIURIDICOFISICO")
    public Integer getEgiuridicofisico() {
        return egiuridicofisico;
    }

    public void setEgiuridicofisico(Integer egiuridicofisico) {
        this.egiuridicofisico = egiuridicofisico;
    }

    @Basic
    @Column(name = "ETIPOSOGGETTO")
    public Integer getEtiposoggetto() {
        return etiposoggetto;
    }

    public void setEtiposoggetto(Integer etiposoggetto) {
        this.etiposoggetto = etiposoggetto;
    }

    @Id
    @Column(name = "IDDATISINGOLI")
    public int getIddatisingoli() {
        return iddatisingoli;
    }

    public void setIddatisingoli(int iddatisingoli) {
        this.iddatisingoli = iddatisingoli;
    }

    @Basic
    @Column(name = "IDRESIDENZA")
    public Integer getIdresidenza() {
        return idresidenza;
    }

    public void setIdresidenza(Integer idresidenza) {
        this.idresidenza = idresidenza;
    }

    @Basic
    @Column(name = "CCODICEFISCALE")
    public String getCcodicefiscale() {
        return ccodicefiscale;
    }

    public void setCcodicefiscale(String ccodicefiscale) {
        this.ccodicefiscale = ccodicefiscale;
    }

    @Basic
    @Column(name = "ESESSO")
    public Integer getEsesso() {
        return esesso;
    }

    public void setEsesso(Integer esesso) {
        this.esesso = esesso;
    }

    @Basic
    @Column(name = "DNASCITA")
    public Date getDnascita() {
        return dnascita;
    }

    public void setDnascita(Date dnascita) {
        this.dnascita = dnascita;
    }

    @Basic
    @Column(name = "CNAZIONENASCITA")
    public String getCnazionenascita() {
        return cnazionenascita;
    }

    public void setCnazionenascita(String cnazionenascita) {
        this.cnazionenascita = cnazionenascita;
    }

    @Basic
    @Column(name = "CPROVINCIANASCITA")
    public String getCprovincianascita() {
        return cprovincianascita;
    }

    public void setCprovincianascita(String cprovincianascita) {
        this.cprovincianascita = cprovincianascita;
    }

    @Basic
    @Column(name = "ECANALEACQ")
    public Integer getEcanaleacq() {
        return ecanaleacq;
    }

    public void setEcanaleacq(Integer ecanaleacq) {
        this.ecanaleacq = ecanaleacq;
    }

    @Basic
    @Column(name = "IDUSERINS")
    public Integer getIduserins() {
        return iduserins;
    }

    public void setIduserins(Integer iduserins) {
        this.iduserins = iduserins;
    }

    @Basic
    @Column(name = "IDUSERAGG")
    public Integer getIduseragg() {
        return iduseragg;
    }

    public void setIduseragg(Integer iduseragg) {
        this.iduseragg = iduseragg;
    }

    @Basic
    @Column(name = "TAGG")
    public Timestamp getTagg() {
        return tagg;
    }

    public void setTagg(Timestamp tagg) {
        this.tagg = tagg;
    }

    @Basic
    @Column(name = "TINS")
    public Timestamp getTins() {
        return tins;
    }

    public void setTins(Timestamp tins) {
        this.tins = tins;
    }

    @Basic
    @Column(name = "IDTITOLOONORIFICO")
    public Integer getIdtitoloonorifico() {
        return idtitoloonorifico;
    }

    public void setIdtitoloonorifico(Integer idtitoloonorifico) {
        this.idtitoloonorifico = idtitoloonorifico;
    }

    @Basic
    @Column(name = "BESENZIONEIMPOSTE")
    public BigInteger getBesenzioneimposte() {
        return besenzioneimposte;
    }

    public void setBesenzioneimposte(BigInteger besenzioneimposte) {
        this.besenzioneimposte = besenzioneimposte;
    }

    @Basic
    @Column(name = "IDULTIMAFOTO")
    public Integer getIdultimafoto() {
        return idultimafoto;
    }

    public void setIdultimafoto(Integer idultimafoto) {
        this.idultimafoto = idultimafoto;
    }

    @Basic
    @Column(name = "ETIPOANAGRAFICA")
    public Integer getEtipoanagrafica() {
        return etipoanagrafica;
    }

    public void setEtipoanagrafica(Integer etipoanagrafica) {
        this.etipoanagrafica = etipoanagrafica;
    }

    @Basic
    @Column(name = "CLOCALITANASCITA")
    public String getClocalitanascita() {
        return clocalitanascita;
    }

    public void setClocalitanascita(String clocalitanascita) {
        this.clocalitanascita = clocalitanascita;
    }

    @Basic
    @Column(name = "DAPERTURASOCIETA")
    public Date getDaperturasocieta() {
        return daperturasocieta;
    }

    public void setDaperturasocieta(Date daperturasocieta) {
        this.daperturasocieta = daperturasocieta;
    }

    @Basic
    @Column(name = "CNUMCARPETTA")
    public String getCnumcarpetta() {
        return cnumcarpetta;
    }

    public void setCnumcarpetta(String cnumcarpetta) {
        this.cnumcarpetta = cnumcarpetta;
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
    @Column(name = "IDTITOLOSTUDIO")
    public Integer getIdtitolostudio() {
        return idtitolostudio;
    }

    public void setIdtitolostudio(Integer idtitolostudio) {
        this.idtitolostudio = idtitolostudio;
    }

    @Basic
    @Column(name = "BALTRAANAG")
    public BigInteger getBaltraanag() {
        return baltraanag;
    }

    public void setBaltraanag(BigInteger baltraanag) {
        this.baltraanag = baltraanag;
    }

    @Basic
    @Column(name = "CCODICECONSORZIO")
    public String getCcodiceconsorzio() {
        return ccodiceconsorzio;
    }

    public void setCcodiceconsorzio(String ccodiceconsorzio) {
        this.ccodiceconsorzio = ccodiceconsorzio;
    }

    @Basic
    @Column(name = "IDLINGUA")
    public Integer getIdlingua() {
        return idlingua;
    }

    public void setIdlingua(Integer idlingua) {
        this.idlingua = idlingua;
    }

    @Basic
    @Column(name = "DDECESSO")
    public Date getDdecesso() {
        return ddecesso;
    }

    public void setDdecesso(Date ddecesso) {
        this.ddecesso = ddecesso;
    }

    @Basic
    @Column(name = "IDRESIDENCE")
    public Integer getIdresidence() {
        return idresidence;
    }

    public void setIdresidence(Integer idresidence) {
        this.idresidence = idresidence;
    }

    @Basic
    @Column(name = "IDBIRTHADDRESS")
    public Integer getIdbirthaddress() {
        return idbirthaddress;
    }

    public void setIdbirthaddress(Integer idbirthaddress) {
        this.idbirthaddress = idbirthaddress;
    }

    @Basic
    @Column(name = "CLOCKREASON")
    public String getClockreason() {
        return clockreason;
    }

    public void setClockreason(String clockreason) {
        this.clockreason = clockreason;
    }

    @Basic
    @Column(name = "BFORZATOCF")
    public BigInteger getBforzatocf() {
        return bforzatocf;
    }

    public void setBforzatocf(BigInteger bforzatocf) {
        this.bforzatocf = bforzatocf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PasoggettoEntity that = (PasoggettoEntity) o;

        if (idsoggetto != that.idsoggetto) return false;
        if (iddatisingoli != that.iddatisingoli) return false;
        if (idcompagnia != null ? !idcompagnia.equals(that.idcompagnia) : that.idcompagnia != null) return false;
        if (egiuridicofisico != null ? !egiuridicofisico.equals(that.egiuridicofisico) : that.egiuridicofisico != null)
            return false;
        if (etiposoggetto != null ? !etiposoggetto.equals(that.etiposoggetto) : that.etiposoggetto != null)
            return false;
        if (idresidenza != null ? !idresidenza.equals(that.idresidenza) : that.idresidenza != null) return false;
        if (ccodicefiscale != null ? !ccodicefiscale.equals(that.ccodicefiscale) : that.ccodicefiscale != null)
            return false;
        if (esesso != null ? !esesso.equals(that.esesso) : that.esesso != null) return false;
        if (dnascita != null ? !dnascita.equals(that.dnascita) : that.dnascita != null) return false;
        if (cnazionenascita != null ? !cnazionenascita.equals(that.cnazionenascita) : that.cnazionenascita != null)
            return false;
        if (cprovincianascita != null ? !cprovincianascita.equals(that.cprovincianascita) : that.cprovincianascita != null)
            return false;
        if (ecanaleacq != null ? !ecanaleacq.equals(that.ecanaleacq) : that.ecanaleacq != null) return false;
        if (iduserins != null ? !iduserins.equals(that.iduserins) : that.iduserins != null) return false;
        if (iduseragg != null ? !iduseragg.equals(that.iduseragg) : that.iduseragg != null) return false;
        if (tagg != null ? !tagg.equals(that.tagg) : that.tagg != null) return false;
        if (tins != null ? !tins.equals(that.tins) : that.tins != null) return false;
        if (idtitoloonorifico != null ? !idtitoloonorifico.equals(that.idtitoloonorifico) : that.idtitoloonorifico != null)
            return false;
        if (besenzioneimposte != null ? !besenzioneimposte.equals(that.besenzioneimposte) : that.besenzioneimposte != null)
            return false;
        if (idultimafoto != null ? !idultimafoto.equals(that.idultimafoto) : that.idultimafoto != null) return false;
        if (etipoanagrafica != null ? !etipoanagrafica.equals(that.etipoanagrafica) : that.etipoanagrafica != null)
            return false;
        if (clocalitanascita != null ? !clocalitanascita.equals(that.clocalitanascita) : that.clocalitanascita != null)
            return false;
        if (daperturasocieta != null ? !daperturasocieta.equals(that.daperturasocieta) : that.daperturasocieta != null)
            return false;
        if (cnumcarpetta != null ? !cnumcarpetta.equals(that.cnumcarpetta) : that.cnumcarpetta != null) return false;
        if (bmigrato != null ? !bmigrato.equals(that.bmigrato) : that.bmigrato != null) return false;
        if (idtitolostudio != null ? !idtitolostudio.equals(that.idtitolostudio) : that.idtitolostudio != null)
            return false;
        if (baltraanag != null ? !baltraanag.equals(that.baltraanag) : that.baltraanag != null) return false;
        if (ccodiceconsorzio != null ? !ccodiceconsorzio.equals(that.ccodiceconsorzio) : that.ccodiceconsorzio != null)
            return false;
        if (idlingua != null ? !idlingua.equals(that.idlingua) : that.idlingua != null) return false;
        if (ddecesso != null ? !ddecesso.equals(that.ddecesso) : that.ddecesso != null) return false;
        if (idresidence != null ? !idresidence.equals(that.idresidence) : that.idresidence != null) return false;
        if (idbirthaddress != null ? !idbirthaddress.equals(that.idbirthaddress) : that.idbirthaddress != null)
            return false;
        if (clockreason != null ? !clockreason.equals(that.clockreason) : that.clockreason != null) return false;
        if (bforzatocf != null ? !bforzatocf.equals(that.bforzatocf) : that.bforzatocf != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idsoggetto;
        result = 31 * result + (idcompagnia != null ? idcompagnia.hashCode() : 0);
        result = 31 * result + (egiuridicofisico != null ? egiuridicofisico.hashCode() : 0);
        result = 31 * result + (etiposoggetto != null ? etiposoggetto.hashCode() : 0);
        result = 31 * result + iddatisingoli;
        result = 31 * result + (idresidenza != null ? idresidenza.hashCode() : 0);
        result = 31 * result + (ccodicefiscale != null ? ccodicefiscale.hashCode() : 0);
        result = 31 * result + (esesso != null ? esesso.hashCode() : 0);
        result = 31 * result + (dnascita != null ? dnascita.hashCode() : 0);
        result = 31 * result + (cnazionenascita != null ? cnazionenascita.hashCode() : 0);
        result = 31 * result + (cprovincianascita != null ? cprovincianascita.hashCode() : 0);
        result = 31 * result + (ecanaleacq != null ? ecanaleacq.hashCode() : 0);
        result = 31 * result + (iduserins != null ? iduserins.hashCode() : 0);
        result = 31 * result + (iduseragg != null ? iduseragg.hashCode() : 0);
        result = 31 * result + (tagg != null ? tagg.hashCode() : 0);
        result = 31 * result + (tins != null ? tins.hashCode() : 0);
        result = 31 * result + (idtitoloonorifico != null ? idtitoloonorifico.hashCode() : 0);
        result = 31 * result + (besenzioneimposte != null ? besenzioneimposte.hashCode() : 0);
        result = 31 * result + (idultimafoto != null ? idultimafoto.hashCode() : 0);
        result = 31 * result + (etipoanagrafica != null ? etipoanagrafica.hashCode() : 0);
        result = 31 * result + (clocalitanascita != null ? clocalitanascita.hashCode() : 0);
        result = 31 * result + (daperturasocieta != null ? daperturasocieta.hashCode() : 0);
        result = 31 * result + (cnumcarpetta != null ? cnumcarpetta.hashCode() : 0);
        result = 31 * result + (bmigrato != null ? bmigrato.hashCode() : 0);
        result = 31 * result + (idtitolostudio != null ? idtitolostudio.hashCode() : 0);
        result = 31 * result + (baltraanag != null ? baltraanag.hashCode() : 0);
        result = 31 * result + (ccodiceconsorzio != null ? ccodiceconsorzio.hashCode() : 0);
        result = 31 * result + (idlingua != null ? idlingua.hashCode() : 0);
        result = 31 * result + (ddecesso != null ? ddecesso.hashCode() : 0);
        result = 31 * result + (idresidence != null ? idresidence.hashCode() : 0);
        result = 31 * result + (idbirthaddress != null ? idbirthaddress.hashCode() : 0);
        result = 31 * result + (clockreason != null ? clockreason.hashCode() : 0);
        result = 31 * result + (bforzatocf != null ? bforzatocf.hashCode() : 0);
        return result;
    }
}
