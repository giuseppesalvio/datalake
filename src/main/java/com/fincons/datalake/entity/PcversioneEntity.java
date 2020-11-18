package com.fincons.datalake.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "pcversione", schema = "datalake", catalog = "")
@IdClass(PcversioneEntityPK.class)
public class PcversioneEntity {
    private int idpolizza;
    private int nverinizio;
    private int nverfine;
    private Date dscadregolazione;
    private BigInteger bregolazione;
    private BigInteger bindicizzazione;
    private Integer idproduttore;
    private int idpvgestione;
    private Integer idconvenzione;
    private BigDecimal npercnostra;
    private int etipocoass;
    private Date deffettopolizza;
    private Date dscadenzapolizza;
    private Integer idfraz;
    private Integer nfreqrescindibilta;
    private Integer idfiliale;
    private Integer idtiporegpremio;
    private Integer ngiorniregolazione;
    private Integer idrecapito;
    private Date dtariffa;
    private String coraeffettocop;
    private BigInteger bincassocoass100;
    private BigDecimal nvaloreindice;
    private Integer idfrazproroga;
    private Integer idfrazregolaz;
    private Date drescindibilita;
    private BigInteger briass;
    private Integer nggpremio;
    private BigDecimal npercintfraz;
    private Integer nproroghetotali;
    private BigInteger brimborsoimposte;
    private BigDecimal ndirittipr;
    private BigDecimal ndirittirs;
    private BigDecimal npercprovvdiritti;
    private Integer idversione;
    private BigInteger btacitorinnovo;
    private BigInteger bproroga;
    private BigInteger bvincolo;
    private BigInteger brischiocomune;
    private BigInteger bcoassindiretta;
    private BigInteger bsecondorischio;
    private BigInteger bcompagnieestere;
    private Integer idtipoindicizz;
    private BigInteger blps;
    private Integer eplafonapremio;
    private BigInteger bdiritti;
    private BigInteger bcomplementare;
    private Integer eregprovvattive;
    private Integer eregprovvpassive;
    private Date dscadregolazricdoc;
    private BigDecimal npremiominregolaz;
    private BigDecimal npercpremioregolaz;
    private Date dricdocregolaz;
    private BigDecimal npercpreminregolaz;
    private BigDecimal npercsconto;
    private BigDecimal npercsconto2;
    private BigDecimal nimpsconto;
    private BigDecimal nimpsconto2;
    private Integer emodoinsersconto;
    private Integer emodoinsersconto2;
    private BigInteger binterrompicatena;
    private String ccodicesede;
    private BigDecimal npercscontoeff;
    private BigDecimal nimpscontoeff;
    private BigDecimal nimptotimponibile;
    private BigDecimal nimptotlordo;
    private String ccodicecampagna;
    private Date dcambio;
    private BigDecimal ntassocambio;
    private BigDecimal npercacc;
    private BigDecimal nimptotnetto;
    private BigDecimal nimptotintfraz;
    private BigDecimal nimptotimposte;
    private BigDecimal nimpssn;
    private Integer idcoupon;
    private Integer nggmora;
    private Integer eprovenienzaprop;
    private Integer idaddress;
    private Integer idpartner;
    private Integer idpartneragency;

    @Id
    @Column(name = "IDPOLIZZA")
    public int getIdpolizza() {
        return idpolizza;
    }

    public void setIdpolizza(int idpolizza) {
        this.idpolizza = idpolizza;
    }

    @Id
    @Column(name = "NVERINIZIO")
    public int getNverinizio() {
        return nverinizio;
    }

    public void setNverinizio(int nverinizio) {
        this.nverinizio = nverinizio;
    }

    @Id
    @Column(name = "NVERFINE")
    public int getNverfine() {
        return nverfine;
    }

    public void setNverfine(int nverfine) {
        this.nverfine = nverfine;
    }

    @Basic
    @Column(name = "DSCADREGOLAZIONE")
    public Date getDscadregolazione() {
        return dscadregolazione;
    }

    public void setDscadregolazione(Date dscadregolazione) {
        this.dscadregolazione = dscadregolazione;
    }

    @Basic
    @Column(name = "BREGOLAZIONE")
    public BigInteger getBregolazione() {
        return bregolazione;
    }

    public void setBregolazione(BigInteger bregolazione) {
        this.bregolazione = bregolazione;
    }

    @Basic
    @Column(name = "BINDICIZZAZIONE")
    public BigInteger getBindicizzazione() {
        return bindicizzazione;
    }

    public void setBindicizzazione(BigInteger bindicizzazione) {
        this.bindicizzazione = bindicizzazione;
    }

    @Basic
    @Column(name = "IDPRODUTTORE")
    public Integer getIdproduttore() {
        return idproduttore;
    }

    public void setIdproduttore(Integer idproduttore) {
        this.idproduttore = idproduttore;
    }

    @Id
    @Column(name = "IDPVGESTIONE")
    public int getIdpvgestione() {
        return idpvgestione;
    }

    public void setIdpvgestione(int idpvgestione) {
        this.idpvgestione = idpvgestione;
    }

    @Basic
    @Column(name = "IDCONVENZIONE")
    public Integer getIdconvenzione() {
        return idconvenzione;
    }

    public void setIdconvenzione(Integer idconvenzione) {
        this.idconvenzione = idconvenzione;
    }

    @Basic
    @Column(name = "NPERCNOSTRA")
    public BigDecimal getNpercnostra() {
        return npercnostra;
    }

    public void setNpercnostra(BigDecimal npercnostra) {
        this.npercnostra = npercnostra;
    }

    @Id
    @Column(name = "ETIPOCOASS")
    public int getEtipocoass() {
        return etipocoass;
    }

    public void setEtipocoass(int etipocoass) {
        this.etipocoass = etipocoass;
    }

    @Basic
    @Column(name = "DEFFETTOPOLIZZA")
    public Date getDeffettopolizza() {
        return deffettopolizza;
    }

    public void setDeffettopolizza(Date deffettopolizza) {
        this.deffettopolizza = deffettopolizza;
    }

    @Basic
    @Column(name = "DSCADENZAPOLIZZA")
    public Date getDscadenzapolizza() {
        return dscadenzapolizza;
    }

    public void setDscadenzapolizza(Date dscadenzapolizza) {
        this.dscadenzapolizza = dscadenzapolizza;
    }

    @Basic
    @Column(name = "IDFRAZ")
    public Integer getIdfraz() {
        return idfraz;
    }

    public void setIdfraz(Integer idfraz) {
        this.idfraz = idfraz;
    }

    @Basic
    @Column(name = "NFREQRESCINDIBILTA")
    public Integer getNfreqrescindibilta() {
        return nfreqrescindibilta;
    }

    public void setNfreqrescindibilta(Integer nfreqrescindibilta) {
        this.nfreqrescindibilta = nfreqrescindibilta;
    }

    @Basic
    @Column(name = "IDFILIALE")
    public Integer getIdfiliale() {
        return idfiliale;
    }

    public void setIdfiliale(Integer idfiliale) {
        this.idfiliale = idfiliale;
    }

    @Basic
    @Column(name = "IDTIPOREGPREMIO")
    public Integer getIdtiporegpremio() {
        return idtiporegpremio;
    }

    public void setIdtiporegpremio(Integer idtiporegpremio) {
        this.idtiporegpremio = idtiporegpremio;
    }

    @Basic
    @Column(name = "NGIORNIREGOLAZIONE")
    public Integer getNgiorniregolazione() {
        return ngiorniregolazione;
    }

    public void setNgiorniregolazione(Integer ngiorniregolazione) {
        this.ngiorniregolazione = ngiorniregolazione;
    }

    @Basic
    @Column(name = "IDRECAPITO")
    public Integer getIdrecapito() {
        return idrecapito;
    }

    public void setIdrecapito(Integer idrecapito) {
        this.idrecapito = idrecapito;
    }

    @Basic
    @Column(name = "DTARIFFA")
    public Date getDtariffa() {
        return dtariffa;
    }

    public void setDtariffa(Date dtariffa) {
        this.dtariffa = dtariffa;
    }

    @Basic
    @Column(name = "CORAEFFETTOCOP")
    public String getCoraeffettocop() {
        return coraeffettocop;
    }

    public void setCoraeffettocop(String coraeffettocop) {
        this.coraeffettocop = coraeffettocop;
    }

    @Basic
    @Column(name = "BINCASSOCOASS100")
    public BigInteger getBincassocoass100() {
        return bincassocoass100;
    }

    public void setBincassocoass100(BigInteger bincassocoass100) {
        this.bincassocoass100 = bincassocoass100;
    }

    @Basic
    @Column(name = "NVALOREINDICE")
    public BigDecimal getNvaloreindice() {
        return nvaloreindice;
    }

    public void setNvaloreindice(BigDecimal nvaloreindice) {
        this.nvaloreindice = nvaloreindice;
    }

    @Basic
    @Column(name = "IDFRAZPROROGA")
    public Integer getIdfrazproroga() {
        return idfrazproroga;
    }

    public void setIdfrazproroga(Integer idfrazproroga) {
        this.idfrazproroga = idfrazproroga;
    }

    @Basic
    @Column(name = "IDFRAZREGOLAZ")
    public Integer getIdfrazregolaz() {
        return idfrazregolaz;
    }

    public void setIdfrazregolaz(Integer idfrazregolaz) {
        this.idfrazregolaz = idfrazregolaz;
    }

    @Basic
    @Column(name = "DRESCINDIBILITA")
    public Date getDrescindibilita() {
        return drescindibilita;
    }

    public void setDrescindibilita(Date drescindibilita) {
        this.drescindibilita = drescindibilita;
    }

    @Basic
    @Column(name = "BRIASS")
    public BigInteger getBriass() {
        return briass;
    }

    public void setBriass(BigInteger briass) {
        this.briass = briass;
    }

    @Basic
    @Column(name = "NGGPREMIO")
    public Integer getNggpremio() {
        return nggpremio;
    }

    public void setNggpremio(Integer nggpremio) {
        this.nggpremio = nggpremio;
    }

    @Basic
    @Column(name = "NPERCINTFRAZ")
    public BigDecimal getNpercintfraz() {
        return npercintfraz;
    }

    public void setNpercintfraz(BigDecimal npercintfraz) {
        this.npercintfraz = npercintfraz;
    }

    @Basic
    @Column(name = "NPROROGHETOTALI")
    public Integer getNproroghetotali() {
        return nproroghetotali;
    }

    public void setNproroghetotali(Integer nproroghetotali) {
        this.nproroghetotali = nproroghetotali;
    }

    @Basic
    @Column(name = "BRIMBORSOIMPOSTE")
    public BigInteger getBrimborsoimposte() {
        return brimborsoimposte;
    }

    public void setBrimborsoimposte(BigInteger brimborsoimposte) {
        this.brimborsoimposte = brimborsoimposte;
    }

    @Basic
    @Column(name = "NDIRITTIPR")
    public BigDecimal getNdirittipr() {
        return ndirittipr;
    }

    public void setNdirittipr(BigDecimal ndirittipr) {
        this.ndirittipr = ndirittipr;
    }

    @Basic
    @Column(name = "NDIRITTIRS")
    public BigDecimal getNdirittirs() {
        return ndirittirs;
    }

    public void setNdirittirs(BigDecimal ndirittirs) {
        this.ndirittirs = ndirittirs;
    }

    @Basic
    @Column(name = "NPERCPROVVDIRITTI")
    public BigDecimal getNpercprovvdiritti() {
        return npercprovvdiritti;
    }

    public void setNpercprovvdiritti(BigDecimal npercprovvdiritti) {
        this.npercprovvdiritti = npercprovvdiritti;
    }

    @Basic
    @Column(name = "IDVERSIONE")
    public Integer getIdversione() {
        return idversione;
    }

    public void setIdversione(Integer idversione) {
        this.idversione = idversione;
    }

    @Basic
    @Column(name = "BTACITORINNOVO")
    public BigInteger getBtacitorinnovo() {
        return btacitorinnovo;
    }

    public void setBtacitorinnovo(BigInteger btacitorinnovo) {
        this.btacitorinnovo = btacitorinnovo;
    }

    @Basic
    @Column(name = "BPROROGA")
    public BigInteger getBproroga() {
        return bproroga;
    }

    public void setBproroga(BigInteger bproroga) {
        this.bproroga = bproroga;
    }

    @Basic
    @Column(name = "BVINCOLO")
    public BigInteger getBvincolo() {
        return bvincolo;
    }

    public void setBvincolo(BigInteger bvincolo) {
        this.bvincolo = bvincolo;
    }

    @Basic
    @Column(name = "BRISCHIOCOMUNE")
    public BigInteger getBrischiocomune() {
        return brischiocomune;
    }

    public void setBrischiocomune(BigInteger brischiocomune) {
        this.brischiocomune = brischiocomune;
    }

    @Basic
    @Column(name = "BCOASSINDIRETTA")
    public BigInteger getBcoassindiretta() {
        return bcoassindiretta;
    }

    public void setBcoassindiretta(BigInteger bcoassindiretta) {
        this.bcoassindiretta = bcoassindiretta;
    }

    @Basic
    @Column(name = "BSECONDORISCHIO")
    public BigInteger getBsecondorischio() {
        return bsecondorischio;
    }

    public void setBsecondorischio(BigInteger bsecondorischio) {
        this.bsecondorischio = bsecondorischio;
    }

    @Basic
    @Column(name = "BCOMPAGNIEESTERE")
    public BigInteger getBcompagnieestere() {
        return bcompagnieestere;
    }

    public void setBcompagnieestere(BigInteger bcompagnieestere) {
        this.bcompagnieestere = bcompagnieestere;
    }

    @Basic
    @Column(name = "IDTIPOINDICIZZ")
    public Integer getIdtipoindicizz() {
        return idtipoindicizz;
    }

    public void setIdtipoindicizz(Integer idtipoindicizz) {
        this.idtipoindicizz = idtipoindicizz;
    }

    @Basic
    @Column(name = "BLPS")
    public BigInteger getBlps() {
        return blps;
    }

    public void setBlps(BigInteger blps) {
        this.blps = blps;
    }

    @Basic
    @Column(name = "EPLAFONAPREMIO")
    public Integer getEplafonapremio() {
        return eplafonapremio;
    }

    public void setEplafonapremio(Integer eplafonapremio) {
        this.eplafonapremio = eplafonapremio;
    }

    @Basic
    @Column(name = "BDIRITTI")
    public BigInteger getBdiritti() {
        return bdiritti;
    }

    public void setBdiritti(BigInteger bdiritti) {
        this.bdiritti = bdiritti;
    }

    @Basic
    @Column(name = "BCOMPLEMENTARE")
    public BigInteger getBcomplementare() {
        return bcomplementare;
    }

    public void setBcomplementare(BigInteger bcomplementare) {
        this.bcomplementare = bcomplementare;
    }

    @Basic
    @Column(name = "EREGPROVVATTIVE")
    public Integer getEregprovvattive() {
        return eregprovvattive;
    }

    public void setEregprovvattive(Integer eregprovvattive) {
        this.eregprovvattive = eregprovvattive;
    }

    @Basic
    @Column(name = "EREGPROVVPASSIVE")
    public Integer getEregprovvpassive() {
        return eregprovvpassive;
    }

    public void setEregprovvpassive(Integer eregprovvpassive) {
        this.eregprovvpassive = eregprovvpassive;
    }

    @Basic
    @Column(name = "DSCADREGOLAZRICDOC")
    public Date getDscadregolazricdoc() {
        return dscadregolazricdoc;
    }

    public void setDscadregolazricdoc(Date dscadregolazricdoc) {
        this.dscadregolazricdoc = dscadregolazricdoc;
    }

    @Basic
    @Column(name = "NPREMIOMINREGOLAZ")
    public BigDecimal getNpremiominregolaz() {
        return npremiominregolaz;
    }

    public void setNpremiominregolaz(BigDecimal npremiominregolaz) {
        this.npremiominregolaz = npremiominregolaz;
    }

    @Basic
    @Column(name = "NPERCPREMIOREGOLAZ")
    public BigDecimal getNpercpremioregolaz() {
        return npercpremioregolaz;
    }

    public void setNpercpremioregolaz(BigDecimal npercpremioregolaz) {
        this.npercpremioregolaz = npercpremioregolaz;
    }

    @Basic
    @Column(name = "DRICDOCREGOLAZ")
    public Date getDricdocregolaz() {
        return dricdocregolaz;
    }

    public void setDricdocregolaz(Date dricdocregolaz) {
        this.dricdocregolaz = dricdocregolaz;
    }

    @Basic
    @Column(name = "NPERCPREMINREGOLAZ")
    public BigDecimal getNpercpreminregolaz() {
        return npercpreminregolaz;
    }

    public void setNpercpreminregolaz(BigDecimal npercpreminregolaz) {
        this.npercpreminregolaz = npercpreminregolaz;
    }

    @Basic
    @Column(name = "NPERCSCONTO")
    public BigDecimal getNpercsconto() {
        return npercsconto;
    }

    public void setNpercsconto(BigDecimal npercsconto) {
        this.npercsconto = npercsconto;
    }

    @Basic
    @Column(name = "NPERCSCONTO2")
    public BigDecimal getNpercsconto2() {
        return npercsconto2;
    }

    public void setNpercsconto2(BigDecimal npercsconto2) {
        this.npercsconto2 = npercsconto2;
    }

    @Basic
    @Column(name = "NIMPSCONTO")
    public BigDecimal getNimpsconto() {
        return nimpsconto;
    }

    public void setNimpsconto(BigDecimal nimpsconto) {
        this.nimpsconto = nimpsconto;
    }

    @Basic
    @Column(name = "NIMPSCONTO2")
    public BigDecimal getNimpsconto2() {
        return nimpsconto2;
    }

    public void setNimpsconto2(BigDecimal nimpsconto2) {
        this.nimpsconto2 = nimpsconto2;
    }

    @Basic
    @Column(name = "EMODOINSERSCONTO")
    public Integer getEmodoinsersconto() {
        return emodoinsersconto;
    }

    public void setEmodoinsersconto(Integer emodoinsersconto) {
        this.emodoinsersconto = emodoinsersconto;
    }

    @Basic
    @Column(name = "EMODOINSERSCONTO2")
    public Integer getEmodoinsersconto2() {
        return emodoinsersconto2;
    }

    public void setEmodoinsersconto2(Integer emodoinsersconto2) {
        this.emodoinsersconto2 = emodoinsersconto2;
    }

    @Basic
    @Column(name = "BINTERROMPICATENA")
    public BigInteger getBinterrompicatena() {
        return binterrompicatena;
    }

    public void setBinterrompicatena(BigInteger binterrompicatena) {
        this.binterrompicatena = binterrompicatena;
    }

    @Basic
    @Column(name = "CCODICESEDE")
    public String getCcodicesede() {
        return ccodicesede;
    }

    public void setCcodicesede(String ccodicesede) {
        this.ccodicesede = ccodicesede;
    }

    @Basic
    @Column(name = "NPERCSCONTOEFF")
    public BigDecimal getNpercscontoeff() {
        return npercscontoeff;
    }

    public void setNpercscontoeff(BigDecimal npercscontoeff) {
        this.npercscontoeff = npercscontoeff;
    }

    @Basic
    @Column(name = "NIMPSCONTOEFF")
    public BigDecimal getNimpscontoeff() {
        return nimpscontoeff;
    }

    public void setNimpscontoeff(BigDecimal nimpscontoeff) {
        this.nimpscontoeff = nimpscontoeff;
    }

    @Basic
    @Column(name = "NIMPTOTIMPONIBILE")
    public BigDecimal getNimptotimponibile() {
        return nimptotimponibile;
    }

    public void setNimptotimponibile(BigDecimal nimptotimponibile) {
        this.nimptotimponibile = nimptotimponibile;
    }

    @Basic
    @Column(name = "NIMPTOTLORDO")
    public BigDecimal getNimptotlordo() {
        return nimptotlordo;
    }

    public void setNimptotlordo(BigDecimal nimptotlordo) {
        this.nimptotlordo = nimptotlordo;
    }

    @Basic
    @Column(name = "CCODICECAMPAGNA")
    public String getCcodicecampagna() {
        return ccodicecampagna;
    }

    public void setCcodicecampagna(String ccodicecampagna) {
        this.ccodicecampagna = ccodicecampagna;
    }

    @Basic
    @Column(name = "DCAMBIO")
    public Date getDcambio() {
        return dcambio;
    }

    public void setDcambio(Date dcambio) {
        this.dcambio = dcambio;
    }

    @Basic
    @Column(name = "NTASSOCAMBIO")
    public BigDecimal getNtassocambio() {
        return ntassocambio;
    }

    public void setNtassocambio(BigDecimal ntassocambio) {
        this.ntassocambio = ntassocambio;
    }

    @Basic
    @Column(name = "NPERCACC")
    public BigDecimal getNpercacc() {
        return npercacc;
    }

    public void setNpercacc(BigDecimal npercacc) {
        this.npercacc = npercacc;
    }

    @Basic
    @Column(name = "NIMPTOTNETTO")
    public BigDecimal getNimptotnetto() {
        return nimptotnetto;
    }

    public void setNimptotnetto(BigDecimal nimptotnetto) {
        this.nimptotnetto = nimptotnetto;
    }

    @Basic
    @Column(name = "NIMPTOTINTFRAZ")
    public BigDecimal getNimptotintfraz() {
        return nimptotintfraz;
    }

    public void setNimptotintfraz(BigDecimal nimptotintfraz) {
        this.nimptotintfraz = nimptotintfraz;
    }

    @Basic
    @Column(name = "NIMPTOTIMPOSTE")
    public BigDecimal getNimptotimposte() {
        return nimptotimposte;
    }

    public void setNimptotimposte(BigDecimal nimptotimposte) {
        this.nimptotimposte = nimptotimposte;
    }

    @Basic
    @Column(name = "NIMPSSN")
    public BigDecimal getNimpssn() {
        return nimpssn;
    }

    public void setNimpssn(BigDecimal nimpssn) {
        this.nimpssn = nimpssn;
    }

    @Basic
    @Column(name = "IDCOUPON")
    public Integer getIdcoupon() {
        return idcoupon;
    }

    public void setIdcoupon(Integer idcoupon) {
        this.idcoupon = idcoupon;
    }

    @Basic
    @Column(name = "NGGMORA")
    public Integer getNggmora() {
        return nggmora;
    }

    public void setNggmora(Integer nggmora) {
        this.nggmora = nggmora;
    }

    @Basic
    @Column(name = "EPROVENIENZAPROP")
    public Integer getEprovenienzaprop() {
        return eprovenienzaprop;
    }

    public void setEprovenienzaprop(Integer eprovenienzaprop) {
        this.eprovenienzaprop = eprovenienzaprop;
    }

    @Basic
    @Column(name = "IDADDRESS")
    public Integer getIdaddress() {
        return idaddress;
    }

    public void setIdaddress(Integer idaddress) {
        this.idaddress = idaddress;
    }

    @Basic
    @Column(name = "IDPARTNER")
    public Integer getIdpartner() {
        return idpartner;
    }

    public void setIdpartner(Integer idpartner) {
        this.idpartner = idpartner;
    }

    @Basic
    @Column(name = "IDPARTNERAGENCY")
    public Integer getIdpartneragency() {
        return idpartneragency;
    }

    public void setIdpartneragency(Integer idpartneragency) {
        this.idpartneragency = idpartneragency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PcversioneEntity that = (PcversioneEntity) o;

        if (idpolizza != that.idpolizza) return false;
        if (nverinizio != that.nverinizio) return false;
        if (nverfine != that.nverfine) return false;
        if (idpvgestione != that.idpvgestione) return false;
        if (etipocoass != that.etipocoass) return false;
        if (dscadregolazione != null ? !dscadregolazione.equals(that.dscadregolazione) : that.dscadregolazione != null)
            return false;
        if (bregolazione != null ? !bregolazione.equals(that.bregolazione) : that.bregolazione != null) return false;
        if (bindicizzazione != null ? !bindicizzazione.equals(that.bindicizzazione) : that.bindicizzazione != null)
            return false;
        if (idproduttore != null ? !idproduttore.equals(that.idproduttore) : that.idproduttore != null) return false;
        if (idconvenzione != null ? !idconvenzione.equals(that.idconvenzione) : that.idconvenzione != null)
            return false;
        if (npercnostra != null ? !npercnostra.equals(that.npercnostra) : that.npercnostra != null) return false;
        if (deffettopolizza != null ? !deffettopolizza.equals(that.deffettopolizza) : that.deffettopolizza != null)
            return false;
        if (dscadenzapolizza != null ? !dscadenzapolizza.equals(that.dscadenzapolizza) : that.dscadenzapolizza != null)
            return false;
        if (idfraz != null ? !idfraz.equals(that.idfraz) : that.idfraz != null) return false;
        if (nfreqrescindibilta != null ? !nfreqrescindibilta.equals(that.nfreqrescindibilta) : that.nfreqrescindibilta != null)
            return false;
        if (idfiliale != null ? !idfiliale.equals(that.idfiliale) : that.idfiliale != null) return false;
        if (idtiporegpremio != null ? !idtiporegpremio.equals(that.idtiporegpremio) : that.idtiporegpremio != null)
            return false;
        if (ngiorniregolazione != null ? !ngiorniregolazione.equals(that.ngiorniregolazione) : that.ngiorniregolazione != null)
            return false;
        if (idrecapito != null ? !idrecapito.equals(that.idrecapito) : that.idrecapito != null) return false;
        if (dtariffa != null ? !dtariffa.equals(that.dtariffa) : that.dtariffa != null) return false;
        if (coraeffettocop != null ? !coraeffettocop.equals(that.coraeffettocop) : that.coraeffettocop != null)
            return false;
        if (bincassocoass100 != null ? !bincassocoass100.equals(that.bincassocoass100) : that.bincassocoass100 != null)
            return false;
        if (nvaloreindice != null ? !nvaloreindice.equals(that.nvaloreindice) : that.nvaloreindice != null)
            return false;
        if (idfrazproroga != null ? !idfrazproroga.equals(that.idfrazproroga) : that.idfrazproroga != null)
            return false;
        if (idfrazregolaz != null ? !idfrazregolaz.equals(that.idfrazregolaz) : that.idfrazregolaz != null)
            return false;
        if (drescindibilita != null ? !drescindibilita.equals(that.drescindibilita) : that.drescindibilita != null)
            return false;
        if (briass != null ? !briass.equals(that.briass) : that.briass != null) return false;
        if (nggpremio != null ? !nggpremio.equals(that.nggpremio) : that.nggpremio != null) return false;
        if (npercintfraz != null ? !npercintfraz.equals(that.npercintfraz) : that.npercintfraz != null) return false;
        if (nproroghetotali != null ? !nproroghetotali.equals(that.nproroghetotali) : that.nproroghetotali != null)
            return false;
        if (brimborsoimposte != null ? !brimborsoimposte.equals(that.brimborsoimposte) : that.brimborsoimposte != null)
            return false;
        if (ndirittipr != null ? !ndirittipr.equals(that.ndirittipr) : that.ndirittipr != null) return false;
        if (ndirittirs != null ? !ndirittirs.equals(that.ndirittirs) : that.ndirittirs != null) return false;
        if (npercprovvdiritti != null ? !npercprovvdiritti.equals(that.npercprovvdiritti) : that.npercprovvdiritti != null)
            return false;
        if (idversione != null ? !idversione.equals(that.idversione) : that.idversione != null) return false;
        if (btacitorinnovo != null ? !btacitorinnovo.equals(that.btacitorinnovo) : that.btacitorinnovo != null)
            return false;
        if (bproroga != null ? !bproroga.equals(that.bproroga) : that.bproroga != null) return false;
        if (bvincolo != null ? !bvincolo.equals(that.bvincolo) : that.bvincolo != null) return false;
        if (brischiocomune != null ? !brischiocomune.equals(that.brischiocomune) : that.brischiocomune != null)
            return false;
        if (bcoassindiretta != null ? !bcoassindiretta.equals(that.bcoassindiretta) : that.bcoassindiretta != null)
            return false;
        if (bsecondorischio != null ? !bsecondorischio.equals(that.bsecondorischio) : that.bsecondorischio != null)
            return false;
        if (bcompagnieestere != null ? !bcompagnieestere.equals(that.bcompagnieestere) : that.bcompagnieestere != null)
            return false;
        if (idtipoindicizz != null ? !idtipoindicizz.equals(that.idtipoindicizz) : that.idtipoindicizz != null)
            return false;
        if (blps != null ? !blps.equals(that.blps) : that.blps != null) return false;
        if (eplafonapremio != null ? !eplafonapremio.equals(that.eplafonapremio) : that.eplafonapremio != null)
            return false;
        if (bdiritti != null ? !bdiritti.equals(that.bdiritti) : that.bdiritti != null) return false;
        if (bcomplementare != null ? !bcomplementare.equals(that.bcomplementare) : that.bcomplementare != null)
            return false;
        if (eregprovvattive != null ? !eregprovvattive.equals(that.eregprovvattive) : that.eregprovvattive != null)
            return false;
        if (eregprovvpassive != null ? !eregprovvpassive.equals(that.eregprovvpassive) : that.eregprovvpassive != null)
            return false;
        if (dscadregolazricdoc != null ? !dscadregolazricdoc.equals(that.dscadregolazricdoc) : that.dscadregolazricdoc != null)
            return false;
        if (npremiominregolaz != null ? !npremiominregolaz.equals(that.npremiominregolaz) : that.npremiominregolaz != null)
            return false;
        if (npercpremioregolaz != null ? !npercpremioregolaz.equals(that.npercpremioregolaz) : that.npercpremioregolaz != null)
            return false;
        if (dricdocregolaz != null ? !dricdocregolaz.equals(that.dricdocregolaz) : that.dricdocregolaz != null)
            return false;
        if (npercpreminregolaz != null ? !npercpreminregolaz.equals(that.npercpreminregolaz) : that.npercpreminregolaz != null)
            return false;
        if (npercsconto != null ? !npercsconto.equals(that.npercsconto) : that.npercsconto != null) return false;
        if (npercsconto2 != null ? !npercsconto2.equals(that.npercsconto2) : that.npercsconto2 != null) return false;
        if (nimpsconto != null ? !nimpsconto.equals(that.nimpsconto) : that.nimpsconto != null) return false;
        if (nimpsconto2 != null ? !nimpsconto2.equals(that.nimpsconto2) : that.nimpsconto2 != null) return false;
        if (emodoinsersconto != null ? !emodoinsersconto.equals(that.emodoinsersconto) : that.emodoinsersconto != null)
            return false;
        if (emodoinsersconto2 != null ? !emodoinsersconto2.equals(that.emodoinsersconto2) : that.emodoinsersconto2 != null)
            return false;
        if (binterrompicatena != null ? !binterrompicatena.equals(that.binterrompicatena) : that.binterrompicatena != null)
            return false;
        if (ccodicesede != null ? !ccodicesede.equals(that.ccodicesede) : that.ccodicesede != null) return false;
        if (npercscontoeff != null ? !npercscontoeff.equals(that.npercscontoeff) : that.npercscontoeff != null)
            return false;
        if (nimpscontoeff != null ? !nimpscontoeff.equals(that.nimpscontoeff) : that.nimpscontoeff != null)
            return false;
        if (nimptotimponibile != null ? !nimptotimponibile.equals(that.nimptotimponibile) : that.nimptotimponibile != null)
            return false;
        if (nimptotlordo != null ? !nimptotlordo.equals(that.nimptotlordo) : that.nimptotlordo != null) return false;
        if (ccodicecampagna != null ? !ccodicecampagna.equals(that.ccodicecampagna) : that.ccodicecampagna != null)
            return false;
        if (dcambio != null ? !dcambio.equals(that.dcambio) : that.dcambio != null) return false;
        if (ntassocambio != null ? !ntassocambio.equals(that.ntassocambio) : that.ntassocambio != null) return false;
        if (npercacc != null ? !npercacc.equals(that.npercacc) : that.npercacc != null) return false;
        if (nimptotnetto != null ? !nimptotnetto.equals(that.nimptotnetto) : that.nimptotnetto != null) return false;
        if (nimptotintfraz != null ? !nimptotintfraz.equals(that.nimptotintfraz) : that.nimptotintfraz != null)
            return false;
        if (nimptotimposte != null ? !nimptotimposte.equals(that.nimptotimposte) : that.nimptotimposte != null)
            return false;
        if (nimpssn != null ? !nimpssn.equals(that.nimpssn) : that.nimpssn != null) return false;
        if (idcoupon != null ? !idcoupon.equals(that.idcoupon) : that.idcoupon != null) return false;
        if (nggmora != null ? !nggmora.equals(that.nggmora) : that.nggmora != null) return false;
        if (eprovenienzaprop != null ? !eprovenienzaprop.equals(that.eprovenienzaprop) : that.eprovenienzaprop != null)
            return false;
        if (idaddress != null ? !idaddress.equals(that.idaddress) : that.idaddress != null) return false;
        if (idpartner != null ? !idpartner.equals(that.idpartner) : that.idpartner != null) return false;
        if (idpartneragency != null ? !idpartneragency.equals(that.idpartneragency) : that.idpartneragency != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idpolizza;
        result = 31 * result + nverinizio;
        result = 31 * result + nverfine;
        result = 31 * result + (dscadregolazione != null ? dscadregolazione.hashCode() : 0);
        result = 31 * result + (bregolazione != null ? bregolazione.hashCode() : 0);
        result = 31 * result + (bindicizzazione != null ? bindicizzazione.hashCode() : 0);
        result = 31 * result + (idproduttore != null ? idproduttore.hashCode() : 0);
        result = 31 * result + idpvgestione;
        result = 31 * result + (idconvenzione != null ? idconvenzione.hashCode() : 0);
        result = 31 * result + (npercnostra != null ? npercnostra.hashCode() : 0);
        result = 31 * result + etipocoass;
        result = 31 * result + (deffettopolizza != null ? deffettopolizza.hashCode() : 0);
        result = 31 * result + (dscadenzapolizza != null ? dscadenzapolizza.hashCode() : 0);
        result = 31 * result + (idfraz != null ? idfraz.hashCode() : 0);
        result = 31 * result + (nfreqrescindibilta != null ? nfreqrescindibilta.hashCode() : 0);
        result = 31 * result + (idfiliale != null ? idfiliale.hashCode() : 0);
        result = 31 * result + (idtiporegpremio != null ? idtiporegpremio.hashCode() : 0);
        result = 31 * result + (ngiorniregolazione != null ? ngiorniregolazione.hashCode() : 0);
        result = 31 * result + (idrecapito != null ? idrecapito.hashCode() : 0);
        result = 31 * result + (dtariffa != null ? dtariffa.hashCode() : 0);
        result = 31 * result + (coraeffettocop != null ? coraeffettocop.hashCode() : 0);
        result = 31 * result + (bincassocoass100 != null ? bincassocoass100.hashCode() : 0);
        result = 31 * result + (nvaloreindice != null ? nvaloreindice.hashCode() : 0);
        result = 31 * result + (idfrazproroga != null ? idfrazproroga.hashCode() : 0);
        result = 31 * result + (idfrazregolaz != null ? idfrazregolaz.hashCode() : 0);
        result = 31 * result + (drescindibilita != null ? drescindibilita.hashCode() : 0);
        result = 31 * result + (briass != null ? briass.hashCode() : 0);
        result = 31 * result + (nggpremio != null ? nggpremio.hashCode() : 0);
        result = 31 * result + (npercintfraz != null ? npercintfraz.hashCode() : 0);
        result = 31 * result + (nproroghetotali != null ? nproroghetotali.hashCode() : 0);
        result = 31 * result + (brimborsoimposte != null ? brimborsoimposte.hashCode() : 0);
        result = 31 * result + (ndirittipr != null ? ndirittipr.hashCode() : 0);
        result = 31 * result + (ndirittirs != null ? ndirittirs.hashCode() : 0);
        result = 31 * result + (npercprovvdiritti != null ? npercprovvdiritti.hashCode() : 0);
        result = 31 * result + (idversione != null ? idversione.hashCode() : 0);
        result = 31 * result + (btacitorinnovo != null ? btacitorinnovo.hashCode() : 0);
        result = 31 * result + (bproroga != null ? bproroga.hashCode() : 0);
        result = 31 * result + (bvincolo != null ? bvincolo.hashCode() : 0);
        result = 31 * result + (brischiocomune != null ? brischiocomune.hashCode() : 0);
        result = 31 * result + (bcoassindiretta != null ? bcoassindiretta.hashCode() : 0);
        result = 31 * result + (bsecondorischio != null ? bsecondorischio.hashCode() : 0);
        result = 31 * result + (bcompagnieestere != null ? bcompagnieestere.hashCode() : 0);
        result = 31 * result + (idtipoindicizz != null ? idtipoindicizz.hashCode() : 0);
        result = 31 * result + (blps != null ? blps.hashCode() : 0);
        result = 31 * result + (eplafonapremio != null ? eplafonapremio.hashCode() : 0);
        result = 31 * result + (bdiritti != null ? bdiritti.hashCode() : 0);
        result = 31 * result + (bcomplementare != null ? bcomplementare.hashCode() : 0);
        result = 31 * result + (eregprovvattive != null ? eregprovvattive.hashCode() : 0);
        result = 31 * result + (eregprovvpassive != null ? eregprovvpassive.hashCode() : 0);
        result = 31 * result + (dscadregolazricdoc != null ? dscadregolazricdoc.hashCode() : 0);
        result = 31 * result + (npremiominregolaz != null ? npremiominregolaz.hashCode() : 0);
        result = 31 * result + (npercpremioregolaz != null ? npercpremioregolaz.hashCode() : 0);
        result = 31 * result + (dricdocregolaz != null ? dricdocregolaz.hashCode() : 0);
        result = 31 * result + (npercpreminregolaz != null ? npercpreminregolaz.hashCode() : 0);
        result = 31 * result + (npercsconto != null ? npercsconto.hashCode() : 0);
        result = 31 * result + (npercsconto2 != null ? npercsconto2.hashCode() : 0);
        result = 31 * result + (nimpsconto != null ? nimpsconto.hashCode() : 0);
        result = 31 * result + (nimpsconto2 != null ? nimpsconto2.hashCode() : 0);
        result = 31 * result + (emodoinsersconto != null ? emodoinsersconto.hashCode() : 0);
        result = 31 * result + (emodoinsersconto2 != null ? emodoinsersconto2.hashCode() : 0);
        result = 31 * result + (binterrompicatena != null ? binterrompicatena.hashCode() : 0);
        result = 31 * result + (ccodicesede != null ? ccodicesede.hashCode() : 0);
        result = 31 * result + (npercscontoeff != null ? npercscontoeff.hashCode() : 0);
        result = 31 * result + (nimpscontoeff != null ? nimpscontoeff.hashCode() : 0);
        result = 31 * result + (nimptotimponibile != null ? nimptotimponibile.hashCode() : 0);
        result = 31 * result + (nimptotlordo != null ? nimptotlordo.hashCode() : 0);
        result = 31 * result + (ccodicecampagna != null ? ccodicecampagna.hashCode() : 0);
        result = 31 * result + (dcambio != null ? dcambio.hashCode() : 0);
        result = 31 * result + (ntassocambio != null ? ntassocambio.hashCode() : 0);
        result = 31 * result + (npercacc != null ? npercacc.hashCode() : 0);
        result = 31 * result + (nimptotnetto != null ? nimptotnetto.hashCode() : 0);
        result = 31 * result + (nimptotintfraz != null ? nimptotintfraz.hashCode() : 0);
        result = 31 * result + (nimptotimposte != null ? nimptotimposte.hashCode() : 0);
        result = 31 * result + (nimpssn != null ? nimpssn.hashCode() : 0);
        result = 31 * result + (idcoupon != null ? idcoupon.hashCode() : 0);
        result = 31 * result + (nggmora != null ? nggmora.hashCode() : 0);
        result = 31 * result + (eprovenienzaprop != null ? eprovenienzaprop.hashCode() : 0);
        result = 31 * result + (idaddress != null ? idaddress.hashCode() : 0);
        result = 31 * result + (idpartner != null ? idpartner.hashCode() : 0);
        result = 31 * result + (idpartneragency != null ? idpartneragency.hashCode() : 0);
        return result;
    }
}
