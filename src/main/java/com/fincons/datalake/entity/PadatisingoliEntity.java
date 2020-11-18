package com.fincons.datalake.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "padatisingoli", schema = "datalake", catalog = "")
public class PadatisingoliEntity {
    private int iddatisingoli;
    private String cpartitaiva;
    private String cdenominazione;
    private String cnome;
    private String ccognome;
    private Integer idprofessione;
    private Integer eprivacy;
    private Date dconsensoprivacy;
    private Integer estatocivile;
    private String ccittadinanza;
    private Integer idsettoreattivita;
    private Integer idformasoc;
    private Integer estatoantiterroris;
    private Integer idsottogruppo;
    private Integer idgruppo;
    private Date dingressoinitalia;
    private Integer etipocliente;
    private String ccontocliente;
    private String ccontofornitore;
    private BigDecimal npercritenacc;
    private Integer idcodateco;
    private String coriginalsurname;
    private String coriginalname;
    private String corigcompanyname;
    private BigDecimal npublicshare;
    private BigDecimal nworkershare;
    private String csectornote;
    private BigInteger bgroup;
    private Integer idgrouptype;
    private String ccommercialname;
    private Integer efranchisingqual;
    private BigInteger bpoliticallyexp;
    private BigInteger binregistration;
    private Integer ematrimonialarrang;
    private Date dcounterterrorism;
    private String cbirthname;
    private Integer nsalaredworkers;
    private BigInteger bvariablecapital;
    private BigDecimal nsharecapital;
    private Integer idcurrency;
    private Integer ecodfamiglia;
    private String cndg;
    private String cramoattivita;
    private String csubgrpattivita;
    private String ccodateco;
    private Date discrizioneregimprese;
    private Date dinizioattivitaregimprese;
    private BigDecimal nfatturato;
    private Integer ndipendenti;
    private BigDecimal nretribuzioni2010;
    private Integer necid;
    private String ccodsaecommander;

    @Id
    @Column(name = "IDDATISINGOLI")
    public int getIddatisingoli() {
        return iddatisingoli;
    }

    public void setIddatisingoli(int iddatisingoli) {
        this.iddatisingoli = iddatisingoli;
    }

    @Basic
    @Column(name = "CPARTITAIVA")
    public String getCpartitaiva() {
        return cpartitaiva;
    }

    public void setCpartitaiva(String cpartitaiva) {
        this.cpartitaiva = cpartitaiva;
    }

    @Basic
    @Column(name = "CDENOMINAZIONE")
    public String getCdenominazione() {
        return cdenominazione;
    }

    public void setCdenominazione(String cdenominazione) {
        this.cdenominazione = cdenominazione;
    }

    @Basic
    @Column(name = "CNOME")
    public String getCnome() {
        return cnome;
    }

    public void setCnome(String cnome) {
        this.cnome = cnome;
    }

    @Basic
    @Column(name = "CCOGNOME")
    public String getCcognome() {
        return ccognome;
    }

    public void setCcognome(String ccognome) {
        this.ccognome = ccognome;
    }

    @Basic
    @Column(name = "IDPROFESSIONE")
    public Integer getIdprofessione() {
        return idprofessione;
    }

    public void setIdprofessione(Integer idprofessione) {
        this.idprofessione = idprofessione;
    }

    @Basic
    @Column(name = "EPRIVACY")
    public Integer getEprivacy() {
        return eprivacy;
    }

    public void setEprivacy(Integer eprivacy) {
        this.eprivacy = eprivacy;
    }

    @Basic
    @Column(name = "DCONSENSOPRIVACY")
    public Date getDconsensoprivacy() {
        return dconsensoprivacy;
    }

    public void setDconsensoprivacy(Date dconsensoprivacy) {
        this.dconsensoprivacy = dconsensoprivacy;
    }

    @Basic
    @Column(name = "ESTATOCIVILE")
    public Integer getEstatocivile() {
        return estatocivile;
    }

    public void setEstatocivile(Integer estatocivile) {
        this.estatocivile = estatocivile;
    }

    @Basic
    @Column(name = "CCITTADINANZA")
    public String getCcittadinanza() {
        return ccittadinanza;
    }

    public void setCcittadinanza(String ccittadinanza) {
        this.ccittadinanza = ccittadinanza;
    }

    @Basic
    @Column(name = "IDSETTOREATTIVITA")
    public Integer getIdsettoreattivita() {
        return idsettoreattivita;
    }

    public void setIdsettoreattivita(Integer idsettoreattivita) {
        this.idsettoreattivita = idsettoreattivita;
    }

    @Basic
    @Column(name = "IDFORMASOC")
    public Integer getIdformasoc() {
        return idformasoc;
    }

    public void setIdformasoc(Integer idformasoc) {
        this.idformasoc = idformasoc;
    }

    @Basic
    @Column(name = "ESTATOANTITERRORIS")
    public Integer getEstatoantiterroris() {
        return estatoantiterroris;
    }

    public void setEstatoantiterroris(Integer estatoantiterroris) {
        this.estatoantiterroris = estatoantiterroris;
    }

    @Basic
    @Column(name = "IDSOTTOGRUPPO")
    public Integer getIdsottogruppo() {
        return idsottogruppo;
    }

    public void setIdsottogruppo(Integer idsottogruppo) {
        this.idsottogruppo = idsottogruppo;
    }

    @Basic
    @Column(name = "IDGRUPPO")
    public Integer getIdgruppo() {
        return idgruppo;
    }

    public void setIdgruppo(Integer idgruppo) {
        this.idgruppo = idgruppo;
    }

    @Basic
    @Column(name = "DINGRESSOINITALIA")
    public Date getDingressoinitalia() {
        return dingressoinitalia;
    }

    public void setDingressoinitalia(Date dingressoinitalia) {
        this.dingressoinitalia = dingressoinitalia;
    }

    @Basic
    @Column(name = "ETIPOCLIENTE")
    public Integer getEtipocliente() {
        return etipocliente;
    }

    public void setEtipocliente(Integer etipocliente) {
        this.etipocliente = etipocliente;
    }

    @Basic
    @Column(name = "CCONTOCLIENTE")
    public String getCcontocliente() {
        return ccontocliente;
    }

    public void setCcontocliente(String ccontocliente) {
        this.ccontocliente = ccontocliente;
    }

    @Basic
    @Column(name = "CCONTOFORNITORE")
    public String getCcontofornitore() {
        return ccontofornitore;
    }

    public void setCcontofornitore(String ccontofornitore) {
        this.ccontofornitore = ccontofornitore;
    }

    @Basic
    @Column(name = "NPERCRITENACC")
    public BigDecimal getNpercritenacc() {
        return npercritenacc;
    }

    public void setNpercritenacc(BigDecimal npercritenacc) {
        this.npercritenacc = npercritenacc;
    }

    @Basic
    @Column(name = "IDCODATECO")
    public Integer getIdcodateco() {
        return idcodateco;
    }

    public void setIdcodateco(Integer idcodateco) {
        this.idcodateco = idcodateco;
    }

    @Basic
    @Column(name = "CORIGINALSURNAME")
    public String getCoriginalsurname() {
        return coriginalsurname;
    }

    public void setCoriginalsurname(String coriginalsurname) {
        this.coriginalsurname = coriginalsurname;
    }

    @Basic
    @Column(name = "CORIGINALNAME")
    public String getCoriginalname() {
        return coriginalname;
    }

    public void setCoriginalname(String coriginalname) {
        this.coriginalname = coriginalname;
    }

    @Basic
    @Column(name = "CORIGCOMPANYNAME")
    public String getCorigcompanyname() {
        return corigcompanyname;
    }

    public void setCorigcompanyname(String corigcompanyname) {
        this.corigcompanyname = corigcompanyname;
    }

    @Basic
    @Column(name = "NPUBLICSHARE")
    public BigDecimal getNpublicshare() {
        return npublicshare;
    }

    public void setNpublicshare(BigDecimal npublicshare) {
        this.npublicshare = npublicshare;
    }

    @Basic
    @Column(name = "NWORKERSHARE")
    public BigDecimal getNworkershare() {
        return nworkershare;
    }

    public void setNworkershare(BigDecimal nworkershare) {
        this.nworkershare = nworkershare;
    }

    @Basic
    @Column(name = "CSECTORNOTE")
    public String getCsectornote() {
        return csectornote;
    }

    public void setCsectornote(String csectornote) {
        this.csectornote = csectornote;
    }

    @Basic
    @Column(name = "BGROUP")
    public BigInteger getBgroup() {
        return bgroup;
    }

    public void setBgroup(BigInteger bgroup) {
        this.bgroup = bgroup;
    }

    @Basic
    @Column(name = "IDGROUPTYPE")
    public Integer getIdgrouptype() {
        return idgrouptype;
    }

    public void setIdgrouptype(Integer idgrouptype) {
        this.idgrouptype = idgrouptype;
    }

    @Basic
    @Column(name = "CCOMMERCIALNAME")
    public String getCcommercialname() {
        return ccommercialname;
    }

    public void setCcommercialname(String ccommercialname) {
        this.ccommercialname = ccommercialname;
    }

    @Basic
    @Column(name = "EFRANCHISINGQUAL")
    public Integer getEfranchisingqual() {
        return efranchisingqual;
    }

    public void setEfranchisingqual(Integer efranchisingqual) {
        this.efranchisingqual = efranchisingqual;
    }

    @Basic
    @Column(name = "BPOLITICALLYEXP")
    public BigInteger getBpoliticallyexp() {
        return bpoliticallyexp;
    }

    public void setBpoliticallyexp(BigInteger bpoliticallyexp) {
        this.bpoliticallyexp = bpoliticallyexp;
    }

    @Basic
    @Column(name = "BINREGISTRATION")
    public BigInteger getBinregistration() {
        return binregistration;
    }

    public void setBinregistration(BigInteger binregistration) {
        this.binregistration = binregistration;
    }

    @Basic
    @Column(name = "EMATRIMONIALARRANG")
    public Integer getEmatrimonialarrang() {
        return ematrimonialarrang;
    }

    public void setEmatrimonialarrang(Integer ematrimonialarrang) {
        this.ematrimonialarrang = ematrimonialarrang;
    }

    @Basic
    @Column(name = "DCOUNTERTERRORISM")
    public Date getDcounterterrorism() {
        return dcounterterrorism;
    }

    public void setDcounterterrorism(Date dcounterterrorism) {
        this.dcounterterrorism = dcounterterrorism;
    }

    @Basic
    @Column(name = "CBIRTHNAME")
    public String getCbirthname() {
        return cbirthname;
    }

    public void setCbirthname(String cbirthname) {
        this.cbirthname = cbirthname;
    }

    @Basic
    @Column(name = "NSALAREDWORKERS")
    public Integer getNsalaredworkers() {
        return nsalaredworkers;
    }

    public void setNsalaredworkers(Integer nsalaredworkers) {
        this.nsalaredworkers = nsalaredworkers;
    }

    @Basic
    @Column(name = "BVARIABLECAPITAL")
    public BigInteger getBvariablecapital() {
        return bvariablecapital;
    }

    public void setBvariablecapital(BigInteger bvariablecapital) {
        this.bvariablecapital = bvariablecapital;
    }

    @Basic
    @Column(name = "NSHARECAPITAL")
    public BigDecimal getNsharecapital() {
        return nsharecapital;
    }

    public void setNsharecapital(BigDecimal nsharecapital) {
        this.nsharecapital = nsharecapital;
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
    @Column(name = "ECODFAMIGLIA")
    public Integer getEcodfamiglia() {
        return ecodfamiglia;
    }

    public void setEcodfamiglia(Integer ecodfamiglia) {
        this.ecodfamiglia = ecodfamiglia;
    }

    @Basic
    @Column(name = "CNDG")
    public String getCndg() {
        return cndg;
    }

    public void setCndg(String cndg) {
        this.cndg = cndg;
    }

    @Basic
    @Column(name = "CRAMOATTIVITA")
    public String getCramoattivita() {
        return cramoattivita;
    }

    public void setCramoattivita(String cramoattivita) {
        this.cramoattivita = cramoattivita;
    }

    @Basic
    @Column(name = "CSUBGRPATTIVITA")
    public String getCsubgrpattivita() {
        return csubgrpattivita;
    }

    public void setCsubgrpattivita(String csubgrpattivita) {
        this.csubgrpattivita = csubgrpattivita;
    }

    @Basic
    @Column(name = "CCODATECO")
    public String getCcodateco() {
        return ccodateco;
    }

    public void setCcodateco(String ccodateco) {
        this.ccodateco = ccodateco;
    }

    @Basic
    @Column(name = "DISCRIZIONEREGIMPRESE")
    public Date getDiscrizioneregimprese() {
        return discrizioneregimprese;
    }

    public void setDiscrizioneregimprese(Date discrizioneregimprese) {
        this.discrizioneregimprese = discrizioneregimprese;
    }

    @Basic
    @Column(name = "DINIZIOATTIVITAREGIMPRESE")
    public Date getDinizioattivitaregimprese() {
        return dinizioattivitaregimprese;
    }

    public void setDinizioattivitaregimprese(Date dinizioattivitaregimprese) {
        this.dinizioattivitaregimprese = dinizioattivitaregimprese;
    }

    @Basic
    @Column(name = "NFATTURATO")
    public BigDecimal getNfatturato() {
        return nfatturato;
    }

    public void setNfatturato(BigDecimal nfatturato) {
        this.nfatturato = nfatturato;
    }

    @Basic
    @Column(name = "NDIPENDENTI")
    public Integer getNdipendenti() {
        return ndipendenti;
    }

    public void setNdipendenti(Integer ndipendenti) {
        this.ndipendenti = ndipendenti;
    }

    @Basic
    @Column(name = "NRETRIBUZIONI2010")
    public BigDecimal getNretribuzioni2010() {
        return nretribuzioni2010;
    }

    public void setNretribuzioni2010(BigDecimal nretribuzioni2010) {
        this.nretribuzioni2010 = nretribuzioni2010;
    }

    @Basic
    @Column(name = "NECID")
    public Integer getNecid() {
        return necid;
    }

    public void setNecid(Integer necid) {
        this.necid = necid;
    }

    @Basic
    @Column(name = "CCODSAECOMMANDER")
    public String getCcodsaecommander() {
        return ccodsaecommander;
    }

    public void setCcodsaecommander(String ccodsaecommander) {
        this.ccodsaecommander = ccodsaecommander;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PadatisingoliEntity that = (PadatisingoliEntity) o;

        if (iddatisingoli != that.iddatisingoli) return false;
        if (cpartitaiva != null ? !cpartitaiva.equals(that.cpartitaiva) : that.cpartitaiva != null) return false;
        if (cdenominazione != null ? !cdenominazione.equals(that.cdenominazione) : that.cdenominazione != null)
            return false;
        if (cnome != null ? !cnome.equals(that.cnome) : that.cnome != null) return false;
        if (ccognome != null ? !ccognome.equals(that.ccognome) : that.ccognome != null) return false;
        if (idprofessione != null ? !idprofessione.equals(that.idprofessione) : that.idprofessione != null)
            return false;
        if (eprivacy != null ? !eprivacy.equals(that.eprivacy) : that.eprivacy != null) return false;
        if (dconsensoprivacy != null ? !dconsensoprivacy.equals(that.dconsensoprivacy) : that.dconsensoprivacy != null)
            return false;
        if (estatocivile != null ? !estatocivile.equals(that.estatocivile) : that.estatocivile != null) return false;
        if (ccittadinanza != null ? !ccittadinanza.equals(that.ccittadinanza) : that.ccittadinanza != null)
            return false;
        if (idsettoreattivita != null ? !idsettoreattivita.equals(that.idsettoreattivita) : that.idsettoreattivita != null)
            return false;
        if (idformasoc != null ? !idformasoc.equals(that.idformasoc) : that.idformasoc != null) return false;
        if (estatoantiterroris != null ? !estatoantiterroris.equals(that.estatoantiterroris) : that.estatoantiterroris != null)
            return false;
        if (idsottogruppo != null ? !idsottogruppo.equals(that.idsottogruppo) : that.idsottogruppo != null)
            return false;
        if (idgruppo != null ? !idgruppo.equals(that.idgruppo) : that.idgruppo != null) return false;
        if (dingressoinitalia != null ? !dingressoinitalia.equals(that.dingressoinitalia) : that.dingressoinitalia != null)
            return false;
        if (etipocliente != null ? !etipocliente.equals(that.etipocliente) : that.etipocliente != null) return false;
        if (ccontocliente != null ? !ccontocliente.equals(that.ccontocliente) : that.ccontocliente != null)
            return false;
        if (ccontofornitore != null ? !ccontofornitore.equals(that.ccontofornitore) : that.ccontofornitore != null)
            return false;
        if (npercritenacc != null ? !npercritenacc.equals(that.npercritenacc) : that.npercritenacc != null)
            return false;
        if (idcodateco != null ? !idcodateco.equals(that.idcodateco) : that.idcodateco != null) return false;
        if (coriginalsurname != null ? !coriginalsurname.equals(that.coriginalsurname) : that.coriginalsurname != null)
            return false;
        if (coriginalname != null ? !coriginalname.equals(that.coriginalname) : that.coriginalname != null)
            return false;
        if (corigcompanyname != null ? !corigcompanyname.equals(that.corigcompanyname) : that.corigcompanyname != null)
            return false;
        if (npublicshare != null ? !npublicshare.equals(that.npublicshare) : that.npublicshare != null) return false;
        if (nworkershare != null ? !nworkershare.equals(that.nworkershare) : that.nworkershare != null) return false;
        if (csectornote != null ? !csectornote.equals(that.csectornote) : that.csectornote != null) return false;
        if (bgroup != null ? !bgroup.equals(that.bgroup) : that.bgroup != null) return false;
        if (idgrouptype != null ? !idgrouptype.equals(that.idgrouptype) : that.idgrouptype != null) return false;
        if (ccommercialname != null ? !ccommercialname.equals(that.ccommercialname) : that.ccommercialname != null)
            return false;
        if (efranchisingqual != null ? !efranchisingqual.equals(that.efranchisingqual) : that.efranchisingqual != null)
            return false;
        if (bpoliticallyexp != null ? !bpoliticallyexp.equals(that.bpoliticallyexp) : that.bpoliticallyexp != null)
            return false;
        if (binregistration != null ? !binregistration.equals(that.binregistration) : that.binregistration != null)
            return false;
        if (ematrimonialarrang != null ? !ematrimonialarrang.equals(that.ematrimonialarrang) : that.ematrimonialarrang != null)
            return false;
        if (dcounterterrorism != null ? !dcounterterrorism.equals(that.dcounterterrorism) : that.dcounterterrorism != null)
            return false;
        if (cbirthname != null ? !cbirthname.equals(that.cbirthname) : that.cbirthname != null) return false;
        if (nsalaredworkers != null ? !nsalaredworkers.equals(that.nsalaredworkers) : that.nsalaredworkers != null)
            return false;
        if (bvariablecapital != null ? !bvariablecapital.equals(that.bvariablecapital) : that.bvariablecapital != null)
            return false;
        if (nsharecapital != null ? !nsharecapital.equals(that.nsharecapital) : that.nsharecapital != null)
            return false;
        if (idcurrency != null ? !idcurrency.equals(that.idcurrency) : that.idcurrency != null) return false;
        if (ecodfamiglia != null ? !ecodfamiglia.equals(that.ecodfamiglia) : that.ecodfamiglia != null) return false;
        if (cndg != null ? !cndg.equals(that.cndg) : that.cndg != null) return false;
        if (cramoattivita != null ? !cramoattivita.equals(that.cramoattivita) : that.cramoattivita != null)
            return false;
        if (csubgrpattivita != null ? !csubgrpattivita.equals(that.csubgrpattivita) : that.csubgrpattivita != null)
            return false;
        if (ccodateco != null ? !ccodateco.equals(that.ccodateco) : that.ccodateco != null) return false;
        if (discrizioneregimprese != null ? !discrizioneregimprese.equals(that.discrizioneregimprese) : that.discrizioneregimprese != null)
            return false;
        if (dinizioattivitaregimprese != null ? !dinizioattivitaregimprese.equals(that.dinizioattivitaregimprese) : that.dinizioattivitaregimprese != null)
            return false;
        if (nfatturato != null ? !nfatturato.equals(that.nfatturato) : that.nfatturato != null) return false;
        if (ndipendenti != null ? !ndipendenti.equals(that.ndipendenti) : that.ndipendenti != null) return false;
        if (nretribuzioni2010 != null ? !nretribuzioni2010.equals(that.nretribuzioni2010) : that.nretribuzioni2010 != null)
            return false;
        if (necid != null ? !necid.equals(that.necid) : that.necid != null) return false;
        if (ccodsaecommander != null ? !ccodsaecommander.equals(that.ccodsaecommander) : that.ccodsaecommander != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = iddatisingoli;
        result = 31 * result + (cpartitaiva != null ? cpartitaiva.hashCode() : 0);
        result = 31 * result + (cdenominazione != null ? cdenominazione.hashCode() : 0);
        result = 31 * result + (cnome != null ? cnome.hashCode() : 0);
        result = 31 * result + (ccognome != null ? ccognome.hashCode() : 0);
        result = 31 * result + (idprofessione != null ? idprofessione.hashCode() : 0);
        result = 31 * result + (eprivacy != null ? eprivacy.hashCode() : 0);
        result = 31 * result + (dconsensoprivacy != null ? dconsensoprivacy.hashCode() : 0);
        result = 31 * result + (estatocivile != null ? estatocivile.hashCode() : 0);
        result = 31 * result + (ccittadinanza != null ? ccittadinanza.hashCode() : 0);
        result = 31 * result + (idsettoreattivita != null ? idsettoreattivita.hashCode() : 0);
        result = 31 * result + (idformasoc != null ? idformasoc.hashCode() : 0);
        result = 31 * result + (estatoantiterroris != null ? estatoantiterroris.hashCode() : 0);
        result = 31 * result + (idsottogruppo != null ? idsottogruppo.hashCode() : 0);
        result = 31 * result + (idgruppo != null ? idgruppo.hashCode() : 0);
        result = 31 * result + (dingressoinitalia != null ? dingressoinitalia.hashCode() : 0);
        result = 31 * result + (etipocliente != null ? etipocliente.hashCode() : 0);
        result = 31 * result + (ccontocliente != null ? ccontocliente.hashCode() : 0);
        result = 31 * result + (ccontofornitore != null ? ccontofornitore.hashCode() : 0);
        result = 31 * result + (npercritenacc != null ? npercritenacc.hashCode() : 0);
        result = 31 * result + (idcodateco != null ? idcodateco.hashCode() : 0);
        result = 31 * result + (coriginalsurname != null ? coriginalsurname.hashCode() : 0);
        result = 31 * result + (coriginalname != null ? coriginalname.hashCode() : 0);
        result = 31 * result + (corigcompanyname != null ? corigcompanyname.hashCode() : 0);
        result = 31 * result + (npublicshare != null ? npublicshare.hashCode() : 0);
        result = 31 * result + (nworkershare != null ? nworkershare.hashCode() : 0);
        result = 31 * result + (csectornote != null ? csectornote.hashCode() : 0);
        result = 31 * result + (bgroup != null ? bgroup.hashCode() : 0);
        result = 31 * result + (idgrouptype != null ? idgrouptype.hashCode() : 0);
        result = 31 * result + (ccommercialname != null ? ccommercialname.hashCode() : 0);
        result = 31 * result + (efranchisingqual != null ? efranchisingqual.hashCode() : 0);
        result = 31 * result + (bpoliticallyexp != null ? bpoliticallyexp.hashCode() : 0);
        result = 31 * result + (binregistration != null ? binregistration.hashCode() : 0);
        result = 31 * result + (ematrimonialarrang != null ? ematrimonialarrang.hashCode() : 0);
        result = 31 * result + (dcounterterrorism != null ? dcounterterrorism.hashCode() : 0);
        result = 31 * result + (cbirthname != null ? cbirthname.hashCode() : 0);
        result = 31 * result + (nsalaredworkers != null ? nsalaredworkers.hashCode() : 0);
        result = 31 * result + (bvariablecapital != null ? bvariablecapital.hashCode() : 0);
        result = 31 * result + (nsharecapital != null ? nsharecapital.hashCode() : 0);
        result = 31 * result + (idcurrency != null ? idcurrency.hashCode() : 0);
        result = 31 * result + (ecodfamiglia != null ? ecodfamiglia.hashCode() : 0);
        result = 31 * result + (cndg != null ? cndg.hashCode() : 0);
        result = 31 * result + (cramoattivita != null ? cramoattivita.hashCode() : 0);
        result = 31 * result + (csubgrpattivita != null ? csubgrpattivita.hashCode() : 0);
        result = 31 * result + (ccodateco != null ? ccodateco.hashCode() : 0);
        result = 31 * result + (discrizioneregimprese != null ? discrizioneregimprese.hashCode() : 0);
        result = 31 * result + (dinizioattivitaregimprese != null ? dinizioattivitaregimprese.hashCode() : 0);
        result = 31 * result + (nfatturato != null ? nfatturato.hashCode() : 0);
        result = 31 * result + (ndipendenti != null ? ndipendenti.hashCode() : 0);
        result = 31 * result + (nretribuzioni2010 != null ? nretribuzioni2010.hashCode() : 0);
        result = 31 * result + (necid != null ? necid.hashCode() : 0);
        result = 31 * result + (ccodsaecommander != null ? ccodsaecommander.hashCode() : 0);
        return result;
    }
}
