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
@Table(name = "pgtitolo", schema = "datalake", catalog = "")
public class PgtitoloEntity {
    private int idtitolo;
    private BigInteger btitoloapporto;
    private Integer estatopagamento;
    private Date dattilegali;
    private BigDecimal nimportoprovv;
    private String cnumpolizza;
    private BigInteger bproposta;
    private Integer estato;
    private BigDecimal nimporto;
    private Date dscadenza;
    private BigInteger bincasso100;
    private Date deffetto;
    private BigDecimal nimportototale;
    private Integer ecaricosottotipo;
    private Integer nappendice;
    private String cnumproposta;
    private Date demissione;
    private Date dbollato;
    private Integer ecaricotipo;
    private Date dcarico;
    private Integer idcompagnia;
    private Integer idnodo;
    private Integer idcausale;
    private Integer iddivisa;
    private Integer idcontorb;
    private Integer idpagamento;
    private Integer idprodotto;
    private Integer idcontraente;
    private Integer idassicurato;
    private BigInteger bstornato;
    private Integer idmotivoannullo;
    private BigInteger bsuppletivo;
    private BigInteger binviatocoge;
    private Integer idgruppotitoli;
    private Integer idtitolocollegato;
    private BigInteger bgruppotitoli;
    private Integer idnodosecondario;
    private Integer idfiliale;
    private BigInteger bprincipale;
    private BigInteger bprovvprec;
    private Integer etipocoass;
    private BigDecimal nsopravvenienza;
    private Integer idproduttore;
    private String cnumsinistro;
    private String cnumrecupero;
    private Integer iduserins;
    private Integer idusermod;
    private Timestamp dins;
    private Timestamp dmod;
    private String cprovrescontraente;
    private Timestamp dnotifica;
    private Integer idsoggettorecupero;
    private BigInteger baltrioneri;
    private BigDecimal nimportototquote;
    private BigDecimal npercnostra;
    private Date dcompetenzariass;
    private Integer idnodogestione;
    private BigInteger bemessodirezione;
    private BigDecimal nimportospese;
    private Integer idnodoincasso;
    private Date dincasso;
    private BigInteger bmigrato;
    private String cnote;
    private BigInteger bripristinato;
    private Integer idtitolostornato;
    private BigInteger briass;
    private Date desigibilita;
    private BigInteger bannullocontabile;
    private String ccodicegestione;
    private Timestamp dtrasfcont;
    private BigDecimal nimportofondo;
    private String cnumliquid;
    private BigDecimal nlpsimporto;
    private String cdescappendice;
    private Date dstorno;
    private Integer etiporappel;
    private Integer etipoincasso;
    private Date dannullo;
    private Integer emodincassocoass;
    private BigInteger briservapremi;
    private BigInteger besenteimposte;
    private Integer ecategoriaprodotto;
    private Date deffettivoincasso;
    private BigInteger bvita;
    private BigInteger bautoesitato;
    private Date dsistemaannullo;
    private Date ddatacaricostorno;
    private Integer idfraz;
    private Date ddataeffettopol;
    private Date ddatascadenzapol;
    private Integer etiporiservapremi;
    private Date ddatacambio;
    private BigDecimal nimptassocambio;
    private Integer idcontraentelock;
    private Integer idassicuratolock;
    private String csiglanazione;
    private String cprovtassazione;
    private Integer idmeanpaymentdata;
    private BigDecimal npartialcollamount;
    private Integer ereversereasonddo;
    private Integer eprovenienza;
    private Integer etipodociva;
    private String cnumdociva;
    private String cnumprotiva;
    private Date dinvoice;
    private String cnumdocivaann;
    private String cnumprotivaann;
    private Integer idcontext;
    private Integer ecreditcontrol;
    private Integer ecommissionstatus;
    private Integer ecashable;
    private Integer idpayerlock;
    private BigDecimal nextracommnet;
    private BigDecimal nextracommfee;
    private Integer emarker;
    private String cmasterpolicy;

    @Id
    @Column(name = "IDTITOLO")
    public int getIdtitolo() {
        return idtitolo;
    }

    public void setIdtitolo(int idtitolo) {
        this.idtitolo = idtitolo;
    }

    @Basic
    @Column(name = "BTITOLOAPPORTO")
    public BigInteger getBtitoloapporto() {
        return btitoloapporto;
    }

    public void setBtitoloapporto(BigInteger btitoloapporto) {
        this.btitoloapporto = btitoloapporto;
    }

    @Basic
    @Column(name = "ESTATOPAGAMENTO")
    public Integer getEstatopagamento() {
        return estatopagamento;
    }

    public void setEstatopagamento(Integer estatopagamento) {
        this.estatopagamento = estatopagamento;
    }

    @Basic
    @Column(name = "DATTILEGALI")
    public Date getDattilegali() {
        return dattilegali;
    }

    public void setDattilegali(Date dattilegali) {
        this.dattilegali = dattilegali;
    }

    @Basic
    @Column(name = "NIMPORTOPROVV")
    public BigDecimal getNimportoprovv() {
        return nimportoprovv;
    }

    public void setNimportoprovv(BigDecimal nimportoprovv) {
        this.nimportoprovv = nimportoprovv;
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
    @Column(name = "BPROPOSTA")
    public BigInteger getBproposta() {
        return bproposta;
    }

    public void setBproposta(BigInteger bproposta) {
        this.bproposta = bproposta;
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
    @Column(name = "NIMPORTO")
    public BigDecimal getNimporto() {
        return nimporto;
    }

    public void setNimporto(BigDecimal nimporto) {
        this.nimporto = nimporto;
    }

    @Basic
    @Column(name = "DSCADENZA")
    public Date getDscadenza() {
        return dscadenza;
    }

    public void setDscadenza(Date dscadenza) {
        this.dscadenza = dscadenza;
    }

    @Basic
    @Column(name = "BINCASSO100")
    public BigInteger getBincasso100() {
        return bincasso100;
    }

    public void setBincasso100(BigInteger bincasso100) {
        this.bincasso100 = bincasso100;
    }

    @Basic
    @Column(name = "DEFFETTO")
    public Date getDeffetto() {
        return deffetto;
    }

    public void setDeffetto(Date deffetto) {
        this.deffetto = deffetto;
    }

    @Basic
    @Column(name = "NIMPORTOTOTALE")
    public BigDecimal getNimportototale() {
        return nimportototale;
    }

    public void setNimportototale(BigDecimal nimportototale) {
        this.nimportototale = nimportototale;
    }

    @Basic
    @Column(name = "ECARICOSOTTOTIPO")
    public Integer getEcaricosottotipo() {
        return ecaricosottotipo;
    }

    public void setEcaricosottotipo(Integer ecaricosottotipo) {
        this.ecaricosottotipo = ecaricosottotipo;
    }

    @Basic
    @Column(name = "NAPPENDICE")
    public Integer getNappendice() {
        return nappendice;
    }

    public void setNappendice(Integer nappendice) {
        this.nappendice = nappendice;
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
    @Column(name = "DEMISSIONE")
    public Date getDemissione() {
        return demissione;
    }

    public void setDemissione(Date demissione) {
        this.demissione = demissione;
    }

    @Basic
    @Column(name = "DBOLLATO")
    public Date getDbollato() {
        return dbollato;
    }

    public void setDbollato(Date dbollato) {
        this.dbollato = dbollato;
    }

    @Basic
    @Column(name = "ECARICOTIPO")
    public Integer getEcaricotipo() {
        return ecaricotipo;
    }

    public void setEcaricotipo(Integer ecaricotipo) {
        this.ecaricotipo = ecaricotipo;
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
    @Column(name = "IDCOMPAGNIA")
    public Integer getIdcompagnia() {
        return idcompagnia;
    }

    public void setIdcompagnia(Integer idcompagnia) {
        this.idcompagnia = idcompagnia;
    }

    @Basic
    @Column(name = "IDNODO")
    public Integer getIdnodo() {
        return idnodo;
    }

    public void setIdnodo(Integer idnodo) {
        this.idnodo = idnodo;
    }

    @Basic
    @Column(name = "IDCAUSALE")
    public Integer getIdcausale() {
        return idcausale;
    }

    public void setIdcausale(Integer idcausale) {
        this.idcausale = idcausale;
    }

    @Basic
    @Column(name = "IDDIVISA")
    public Integer getIddivisa() {
        return iddivisa;
    }

    public void setIddivisa(Integer iddivisa) {
        this.iddivisa = iddivisa;
    }

    @Basic
    @Column(name = "IDCONTORB")
    public Integer getIdcontorb() {
        return idcontorb;
    }

    public void setIdcontorb(Integer idcontorb) {
        this.idcontorb = idcontorb;
    }

    @Basic
    @Column(name = "IDPAGAMENTO")
    public Integer getIdpagamento() {
        return idpagamento;
    }

    public void setIdpagamento(Integer idpagamento) {
        this.idpagamento = idpagamento;
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
    @Column(name = "IDCONTRAENTE")
    public Integer getIdcontraente() {
        return idcontraente;
    }

    public void setIdcontraente(Integer idcontraente) {
        this.idcontraente = idcontraente;
    }

    @Basic
    @Column(name = "IDASSICURATO")
    public Integer getIdassicurato() {
        return idassicurato;
    }

    public void setIdassicurato(Integer idassicurato) {
        this.idassicurato = idassicurato;
    }

    @Basic
    @Column(name = "BSTORNATO")
    public BigInteger getBstornato() {
        return bstornato;
    }

    public void setBstornato(BigInteger bstornato) {
        this.bstornato = bstornato;
    }

    @Basic
    @Column(name = "IDMOTIVOANNULLO")
    public Integer getIdmotivoannullo() {
        return idmotivoannullo;
    }

    public void setIdmotivoannullo(Integer idmotivoannullo) {
        this.idmotivoannullo = idmotivoannullo;
    }

    @Basic
    @Column(name = "BSUPPLETIVO")
    public BigInteger getBsuppletivo() {
        return bsuppletivo;
    }

    public void setBsuppletivo(BigInteger bsuppletivo) {
        this.bsuppletivo = bsuppletivo;
    }

    @Basic
    @Column(name = "BINVIATOCOGE")
    public BigInteger getBinviatocoge() {
        return binviatocoge;
    }

    public void setBinviatocoge(BigInteger binviatocoge) {
        this.binviatocoge = binviatocoge;
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
    @Column(name = "IDTITOLOCOLLEGATO")
    public Integer getIdtitolocollegato() {
        return idtitolocollegato;
    }

    public void setIdtitolocollegato(Integer idtitolocollegato) {
        this.idtitolocollegato = idtitolocollegato;
    }

    @Basic
    @Column(name = "BGRUPPOTITOLI")
    public BigInteger getBgruppotitoli() {
        return bgruppotitoli;
    }

    public void setBgruppotitoli(BigInteger bgruppotitoli) {
        this.bgruppotitoli = bgruppotitoli;
    }

    @Basic
    @Column(name = "IDNODOSECONDARIO")
    public Integer getIdnodosecondario() {
        return idnodosecondario;
    }

    public void setIdnodosecondario(Integer idnodosecondario) {
        this.idnodosecondario = idnodosecondario;
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
    @Column(name = "BPRINCIPALE")
    public BigInteger getBprincipale() {
        return bprincipale;
    }

    public void setBprincipale(BigInteger bprincipale) {
        this.bprincipale = bprincipale;
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
    @Column(name = "ETIPOCOASS")
    public Integer getEtipocoass() {
        return etipocoass;
    }

    public void setEtipocoass(Integer etipocoass) {
        this.etipocoass = etipocoass;
    }

    @Basic
    @Column(name = "NSOPRAVVENIENZA")
    public BigDecimal getNsopravvenienza() {
        return nsopravvenienza;
    }

    public void setNsopravvenienza(BigDecimal nsopravvenienza) {
        this.nsopravvenienza = nsopravvenienza;
    }

    @Basic
    @Column(name = "IDPRODUTTORE")
    public Integer getIdproduttore() {
        return idproduttore;
    }

    public void setIdproduttore(Integer idproduttore) {
        this.idproduttore = idproduttore;
    }

    @Basic
    @Column(name = "CNUMSINISTRO")
    public String getCnumsinistro() {
        return cnumsinistro;
    }

    public void setCnumsinistro(String cnumsinistro) {
        this.cnumsinistro = cnumsinistro;
    }

    @Basic
    @Column(name = "CNUMRECUPERO")
    public String getCnumrecupero() {
        return cnumrecupero;
    }

    public void setCnumrecupero(String cnumrecupero) {
        this.cnumrecupero = cnumrecupero;
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
    @Column(name = "IDUSERMOD")
    public Integer getIdusermod() {
        return idusermod;
    }

    public void setIdusermod(Integer idusermod) {
        this.idusermod = idusermod;
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
    @Column(name = "DMOD")
    public Timestamp getDmod() {
        return dmod;
    }

    public void setDmod(Timestamp dmod) {
        this.dmod = dmod;
    }

    @Basic
    @Column(name = "CPROVRESCONTRAENTE")
    public String getCprovrescontraente() {
        return cprovrescontraente;
    }

    public void setCprovrescontraente(String cprovrescontraente) {
        this.cprovrescontraente = cprovrescontraente;
    }

    @Basic
    @Column(name = "DNOTIFICA")
    public Timestamp getDnotifica() {
        return dnotifica;
    }

    public void setDnotifica(Timestamp dnotifica) {
        this.dnotifica = dnotifica;
    }

    @Basic
    @Column(name = "IDSOGGETTORECUPERO")
    public Integer getIdsoggettorecupero() {
        return idsoggettorecupero;
    }

    public void setIdsoggettorecupero(Integer idsoggettorecupero) {
        this.idsoggettorecupero = idsoggettorecupero;
    }

    @Basic
    @Column(name = "BALTRIONERI")
    public BigInteger getBaltrioneri() {
        return baltrioneri;
    }

    public void setBaltrioneri(BigInteger baltrioneri) {
        this.baltrioneri = baltrioneri;
    }

    @Basic
    @Column(name = "NIMPORTOTOTQUOTE")
    public BigDecimal getNimportototquote() {
        return nimportototquote;
    }

    public void setNimportototquote(BigDecimal nimportototquote) {
        this.nimportototquote = nimportototquote;
    }

    @Basic
    @Column(name = "NPERCNOSTRA")
    public BigDecimal getNpercnostra() {
        return npercnostra;
    }

    public void setNpercnostra(BigDecimal npercnostra) {
        this.npercnostra = npercnostra;
    }

    @Basic
    @Column(name = "DCOMPETENZARIASS")
    public Date getDcompetenzariass() {
        return dcompetenzariass;
    }

    public void setDcompetenzariass(Date dcompetenzariass) {
        this.dcompetenzariass = dcompetenzariass;
    }

    @Basic
    @Column(name = "IDNODOGESTIONE")
    public Integer getIdnodogestione() {
        return idnodogestione;
    }

    public void setIdnodogestione(Integer idnodogestione) {
        this.idnodogestione = idnodogestione;
    }

    @Basic
    @Column(name = "BEMESSODIREZIONE")
    public BigInteger getBemessodirezione() {
        return bemessodirezione;
    }

    public void setBemessodirezione(BigInteger bemessodirezione) {
        this.bemessodirezione = bemessodirezione;
    }

    @Basic
    @Column(name = "NIMPORTOSPESE")
    public BigDecimal getNimportospese() {
        return nimportospese;
    }

    public void setNimportospese(BigDecimal nimportospese) {
        this.nimportospese = nimportospese;
    }

    @Basic
    @Column(name = "IDNODOINCASSO")
    public Integer getIdnodoincasso() {
        return idnodoincasso;
    }

    public void setIdnodoincasso(Integer idnodoincasso) {
        this.idnodoincasso = idnodoincasso;
    }

    @Basic
    @Column(name = "DINCASSO")
    public Date getDincasso() {
        return dincasso;
    }

    public void setDincasso(Date dincasso) {
        this.dincasso = dincasso;
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
    @Column(name = "CNOTE")
    public String getCnote() {
        return cnote;
    }

    public void setCnote(String cnote) {
        this.cnote = cnote;
    }

    @Basic
    @Column(name = "BRIPRISTINATO")
    public BigInteger getBripristinato() {
        return bripristinato;
    }

    public void setBripristinato(BigInteger bripristinato) {
        this.bripristinato = bripristinato;
    }

    @Basic
    @Column(name = "IDTITOLOSTORNATO")
    public Integer getIdtitolostornato() {
        return idtitolostornato;
    }

    public void setIdtitolostornato(Integer idtitolostornato) {
        this.idtitolostornato = idtitolostornato;
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
    @Column(name = "DESIGIBILITA")
    public Date getDesigibilita() {
        return desigibilita;
    }

    public void setDesigibilita(Date desigibilita) {
        this.desigibilita = desigibilita;
    }

    @Basic
    @Column(name = "BANNULLOCONTABILE")
    public BigInteger getBannullocontabile() {
        return bannullocontabile;
    }

    public void setBannullocontabile(BigInteger bannullocontabile) {
        this.bannullocontabile = bannullocontabile;
    }

    @Basic
    @Column(name = "CCODICEGESTIONE")
    public String getCcodicegestione() {
        return ccodicegestione;
    }

    public void setCcodicegestione(String ccodicegestione) {
        this.ccodicegestione = ccodicegestione;
    }

    @Basic
    @Column(name = "DTRASFCONT")
    public Timestamp getDtrasfcont() {
        return dtrasfcont;
    }

    public void setDtrasfcont(Timestamp dtrasfcont) {
        this.dtrasfcont = dtrasfcont;
    }

    @Basic
    @Column(name = "NIMPORTOFONDO")
    public BigDecimal getNimportofondo() {
        return nimportofondo;
    }

    public void setNimportofondo(BigDecimal nimportofondo) {
        this.nimportofondo = nimportofondo;
    }

    @Basic
    @Column(name = "CNUMLIQUID")
    public String getCnumliquid() {
        return cnumliquid;
    }

    public void setCnumliquid(String cnumliquid) {
        this.cnumliquid = cnumliquid;
    }

    @Basic
    @Column(name = "NLPSIMPORTO")
    public BigDecimal getNlpsimporto() {
        return nlpsimporto;
    }

    public void setNlpsimporto(BigDecimal nlpsimporto) {
        this.nlpsimporto = nlpsimporto;
    }

    @Basic
    @Column(name = "CDESCAPPENDICE")
    public String getCdescappendice() {
        return cdescappendice;
    }

    public void setCdescappendice(String cdescappendice) {
        this.cdescappendice = cdescappendice;
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
    @Column(name = "ETIPORAPPEL")
    public Integer getEtiporappel() {
        return etiporappel;
    }

    public void setEtiporappel(Integer etiporappel) {
        this.etiporappel = etiporappel;
    }

    @Basic
    @Column(name = "ETIPOINCASSO")
    public Integer getEtipoincasso() {
        return etipoincasso;
    }

    public void setEtipoincasso(Integer etipoincasso) {
        this.etipoincasso = etipoincasso;
    }

    @Basic
    @Column(name = "DANNULLO")
    public Date getDannullo() {
        return dannullo;
    }

    public void setDannullo(Date dannullo) {
        this.dannullo = dannullo;
    }

    @Basic
    @Column(name = "EMODINCASSOCOASS")
    public Integer getEmodincassocoass() {
        return emodincassocoass;
    }

    public void setEmodincassocoass(Integer emodincassocoass) {
        this.emodincassocoass = emodincassocoass;
    }

    @Basic
    @Column(name = "BRISERVAPREMI")
    public BigInteger getBriservapremi() {
        return briservapremi;
    }

    public void setBriservapremi(BigInteger briservapremi) {
        this.briservapremi = briservapremi;
    }

    @Basic
    @Column(name = "BESENTEIMPOSTE")
    public BigInteger getBesenteimposte() {
        return besenteimposte;
    }

    public void setBesenteimposte(BigInteger besenteimposte) {
        this.besenteimposte = besenteimposte;
    }

    @Basic
    @Column(name = "ECATEGORIAPRODOTTO")
    public Integer getEcategoriaprodotto() {
        return ecategoriaprodotto;
    }

    public void setEcategoriaprodotto(Integer ecategoriaprodotto) {
        this.ecategoriaprodotto = ecategoriaprodotto;
    }

    @Basic
    @Column(name = "DEFFETTIVOINCASSO")
    public Date getDeffettivoincasso() {
        return deffettivoincasso;
    }

    public void setDeffettivoincasso(Date deffettivoincasso) {
        this.deffettivoincasso = deffettivoincasso;
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
    @Column(name = "BAUTOESITATO")
    public BigInteger getBautoesitato() {
        return bautoesitato;
    }

    public void setBautoesitato(BigInteger bautoesitato) {
        this.bautoesitato = bautoesitato;
    }

    @Basic
    @Column(name = "DSISTEMAANNULLO")
    public Date getDsistemaannullo() {
        return dsistemaannullo;
    }

    public void setDsistemaannullo(Date dsistemaannullo) {
        this.dsistemaannullo = dsistemaannullo;
    }

    @Basic
    @Column(name = "DDATACARICOSTORNO")
    public Date getDdatacaricostorno() {
        return ddatacaricostorno;
    }

    public void setDdatacaricostorno(Date ddatacaricostorno) {
        this.ddatacaricostorno = ddatacaricostorno;
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
    @Column(name = "DDATAEFFETTOPOL")
    public Date getDdataeffettopol() {
        return ddataeffettopol;
    }

    public void setDdataeffettopol(Date ddataeffettopol) {
        this.ddataeffettopol = ddataeffettopol;
    }

    @Basic
    @Column(name = "DDATASCADENZAPOL")
    public Date getDdatascadenzapol() {
        return ddatascadenzapol;
    }

    public void setDdatascadenzapol(Date ddatascadenzapol) {
        this.ddatascadenzapol = ddatascadenzapol;
    }

    @Basic
    @Column(name = "ETIPORISERVAPREMI")
    public Integer getEtiporiservapremi() {
        return etiporiservapremi;
    }

    public void setEtiporiservapremi(Integer etiporiservapremi) {
        this.etiporiservapremi = etiporiservapremi;
    }

    @Basic
    @Column(name = "DDATACAMBIO")
    public Date getDdatacambio() {
        return ddatacambio;
    }

    public void setDdatacambio(Date ddatacambio) {
        this.ddatacambio = ddatacambio;
    }

    @Basic
    @Column(name = "NIMPTASSOCAMBIO")
    public BigDecimal getNimptassocambio() {
        return nimptassocambio;
    }

    public void setNimptassocambio(BigDecimal nimptassocambio) {
        this.nimptassocambio = nimptassocambio;
    }

    @Basic
    @Column(name = "IDCONTRAENTELOCK")
    public Integer getIdcontraentelock() {
        return idcontraentelock;
    }

    public void setIdcontraentelock(Integer idcontraentelock) {
        this.idcontraentelock = idcontraentelock;
    }

    @Basic
    @Column(name = "IDASSICURATOLOCK")
    public Integer getIdassicuratolock() {
        return idassicuratolock;
    }

    public void setIdassicuratolock(Integer idassicuratolock) {
        this.idassicuratolock = idassicuratolock;
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
    @Column(name = "CPROVTASSAZIONE")
    public String getCprovtassazione() {
        return cprovtassazione;
    }

    public void setCprovtassazione(String cprovtassazione) {
        this.cprovtassazione = cprovtassazione;
    }

    @Basic
    @Column(name = "IDMEANPAYMENTDATA")
    public Integer getIdmeanpaymentdata() {
        return idmeanpaymentdata;
    }

    public void setIdmeanpaymentdata(Integer idmeanpaymentdata) {
        this.idmeanpaymentdata = idmeanpaymentdata;
    }

    @Basic
    @Column(name = "NPARTIALCOLLAMOUNT")
    public BigDecimal getNpartialcollamount() {
        return npartialcollamount;
    }

    public void setNpartialcollamount(BigDecimal npartialcollamount) {
        this.npartialcollamount = npartialcollamount;
    }

    @Basic
    @Column(name = "EREVERSEREASONDDO")
    public Integer getEreversereasonddo() {
        return ereversereasonddo;
    }

    public void setEreversereasonddo(Integer ereversereasonddo) {
        this.ereversereasonddo = ereversereasonddo;
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
    @Column(name = "ETIPODOCIVA")
    public Integer getEtipodociva() {
        return etipodociva;
    }

    public void setEtipodociva(Integer etipodociva) {
        this.etipodociva = etipodociva;
    }

    @Basic
    @Column(name = "CNUMDOCIVA")
    public String getCnumdociva() {
        return cnumdociva;
    }

    public void setCnumdociva(String cnumdociva) {
        this.cnumdociva = cnumdociva;
    }

    @Basic
    @Column(name = "CNUMPROTIVA")
    public String getCnumprotiva() {
        return cnumprotiva;
    }

    public void setCnumprotiva(String cnumprotiva) {
        this.cnumprotiva = cnumprotiva;
    }

    @Basic
    @Column(name = "DINVOICE")
    public Date getDinvoice() {
        return dinvoice;
    }

    public void setDinvoice(Date dinvoice) {
        this.dinvoice = dinvoice;
    }

    @Basic
    @Column(name = "CNUMDOCIVAANN")
    public String getCnumdocivaann() {
        return cnumdocivaann;
    }

    public void setCnumdocivaann(String cnumdocivaann) {
        this.cnumdocivaann = cnumdocivaann;
    }

    @Basic
    @Column(name = "CNUMPROTIVAANN")
    public String getCnumprotivaann() {
        return cnumprotivaann;
    }

    public void setCnumprotivaann(String cnumprotivaann) {
        this.cnumprotivaann = cnumprotivaann;
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
    @Column(name = "ECREDITCONTROL")
    public Integer getEcreditcontrol() {
        return ecreditcontrol;
    }

    public void setEcreditcontrol(Integer ecreditcontrol) {
        this.ecreditcontrol = ecreditcontrol;
    }

    @Basic
    @Column(name = "ECOMMISSIONSTATUS")
    public Integer getEcommissionstatus() {
        return ecommissionstatus;
    }

    public void setEcommissionstatus(Integer ecommissionstatus) {
        this.ecommissionstatus = ecommissionstatus;
    }

    @Basic
    @Column(name = "ECASHABLE")
    public Integer getEcashable() {
        return ecashable;
    }

    public void setEcashable(Integer ecashable) {
        this.ecashable = ecashable;
    }

    @Basic
    @Column(name = "IDPAYERLOCK")
    public Integer getIdpayerlock() {
        return idpayerlock;
    }

    public void setIdpayerlock(Integer idpayerlock) {
        this.idpayerlock = idpayerlock;
    }

    @Basic
    @Column(name = "NEXTRACOMMNET")
    public BigDecimal getNextracommnet() {
        return nextracommnet;
    }

    public void setNextracommnet(BigDecimal nextracommnet) {
        this.nextracommnet = nextracommnet;
    }

    @Basic
    @Column(name = "NEXTRACOMMFEE")
    public BigDecimal getNextracommfee() {
        return nextracommfee;
    }

    public void setNextracommfee(BigDecimal nextracommfee) {
        this.nextracommfee = nextracommfee;
    }

    @Basic
    @Column(name = "EMARKER")
    public Integer getEmarker() {
        return emarker;
    }

    public void setEmarker(Integer emarker) {
        this.emarker = emarker;
    }

    @Basic
    @Column(name = "CMASTERPOLICY")
    public String getCmasterpolicy() {
        return cmasterpolicy;
    }

    public void setCmasterpolicy(String cmasterpolicy) {
        this.cmasterpolicy = cmasterpolicy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PgtitoloEntity that = (PgtitoloEntity) o;

        if (idtitolo != that.idtitolo) return false;
        if (btitoloapporto != null ? !btitoloapporto.equals(that.btitoloapporto) : that.btitoloapporto != null)
            return false;
        if (estatopagamento != null ? !estatopagamento.equals(that.estatopagamento) : that.estatopagamento != null)
            return false;
        if (dattilegali != null ? !dattilegali.equals(that.dattilegali) : that.dattilegali != null) return false;
        if (nimportoprovv != null ? !nimportoprovv.equals(that.nimportoprovv) : that.nimportoprovv != null)
            return false;
        if (cnumpolizza != null ? !cnumpolizza.equals(that.cnumpolizza) : that.cnumpolizza != null) return false;
        if (bproposta != null ? !bproposta.equals(that.bproposta) : that.bproposta != null) return false;
        if (estato != null ? !estato.equals(that.estato) : that.estato != null) return false;
        if (nimporto != null ? !nimporto.equals(that.nimporto) : that.nimporto != null) return false;
        if (dscadenza != null ? !dscadenza.equals(that.dscadenza) : that.dscadenza != null) return false;
        if (bincasso100 != null ? !bincasso100.equals(that.bincasso100) : that.bincasso100 != null) return false;
        if (deffetto != null ? !deffetto.equals(that.deffetto) : that.deffetto != null) return false;
        if (nimportototale != null ? !nimportototale.equals(that.nimportototale) : that.nimportototale != null)
            return false;
        if (ecaricosottotipo != null ? !ecaricosottotipo.equals(that.ecaricosottotipo) : that.ecaricosottotipo != null)
            return false;
        if (nappendice != null ? !nappendice.equals(that.nappendice) : that.nappendice != null) return false;
        if (cnumproposta != null ? !cnumproposta.equals(that.cnumproposta) : that.cnumproposta != null) return false;
        if (demissione != null ? !demissione.equals(that.demissione) : that.demissione != null) return false;
        if (dbollato != null ? !dbollato.equals(that.dbollato) : that.dbollato != null) return false;
        if (ecaricotipo != null ? !ecaricotipo.equals(that.ecaricotipo) : that.ecaricotipo != null) return false;
        if (dcarico != null ? !dcarico.equals(that.dcarico) : that.dcarico != null) return false;
        if (idcompagnia != null ? !idcompagnia.equals(that.idcompagnia) : that.idcompagnia != null) return false;
        if (idnodo != null ? !idnodo.equals(that.idnodo) : that.idnodo != null) return false;
        if (idcausale != null ? !idcausale.equals(that.idcausale) : that.idcausale != null) return false;
        if (iddivisa != null ? !iddivisa.equals(that.iddivisa) : that.iddivisa != null) return false;
        if (idcontorb != null ? !idcontorb.equals(that.idcontorb) : that.idcontorb != null) return false;
        if (idpagamento != null ? !idpagamento.equals(that.idpagamento) : that.idpagamento != null) return false;
        if (idprodotto != null ? !idprodotto.equals(that.idprodotto) : that.idprodotto != null) return false;
        if (idcontraente != null ? !idcontraente.equals(that.idcontraente) : that.idcontraente != null) return false;
        if (idassicurato != null ? !idassicurato.equals(that.idassicurato) : that.idassicurato != null) return false;
        if (bstornato != null ? !bstornato.equals(that.bstornato) : that.bstornato != null) return false;
        if (idmotivoannullo != null ? !idmotivoannullo.equals(that.idmotivoannullo) : that.idmotivoannullo != null)
            return false;
        if (bsuppletivo != null ? !bsuppletivo.equals(that.bsuppletivo) : that.bsuppletivo != null) return false;
        if (binviatocoge != null ? !binviatocoge.equals(that.binviatocoge) : that.binviatocoge != null) return false;
        if (idgruppotitoli != null ? !idgruppotitoli.equals(that.idgruppotitoli) : that.idgruppotitoli != null)
            return false;
        if (idtitolocollegato != null ? !idtitolocollegato.equals(that.idtitolocollegato) : that.idtitolocollegato != null)
            return false;
        if (bgruppotitoli != null ? !bgruppotitoli.equals(that.bgruppotitoli) : that.bgruppotitoli != null)
            return false;
        if (idnodosecondario != null ? !idnodosecondario.equals(that.idnodosecondario) : that.idnodosecondario != null)
            return false;
        if (idfiliale != null ? !idfiliale.equals(that.idfiliale) : that.idfiliale != null) return false;
        if (bprincipale != null ? !bprincipale.equals(that.bprincipale) : that.bprincipale != null) return false;
        if (bprovvprec != null ? !bprovvprec.equals(that.bprovvprec) : that.bprovvprec != null) return false;
        if (etipocoass != null ? !etipocoass.equals(that.etipocoass) : that.etipocoass != null) return false;
        if (nsopravvenienza != null ? !nsopravvenienza.equals(that.nsopravvenienza) : that.nsopravvenienza != null)
            return false;
        if (idproduttore != null ? !idproduttore.equals(that.idproduttore) : that.idproduttore != null) return false;
        if (cnumsinistro != null ? !cnumsinistro.equals(that.cnumsinistro) : that.cnumsinistro != null) return false;
        if (cnumrecupero != null ? !cnumrecupero.equals(that.cnumrecupero) : that.cnumrecupero != null) return false;
        if (iduserins != null ? !iduserins.equals(that.iduserins) : that.iduserins != null) return false;
        if (idusermod != null ? !idusermod.equals(that.idusermod) : that.idusermod != null) return false;
        if (dins != null ? !dins.equals(that.dins) : that.dins != null) return false;
        if (dmod != null ? !dmod.equals(that.dmod) : that.dmod != null) return false;
        if (cprovrescontraente != null ? !cprovrescontraente.equals(that.cprovrescontraente) : that.cprovrescontraente != null)
            return false;
        if (dnotifica != null ? !dnotifica.equals(that.dnotifica) : that.dnotifica != null) return false;
        if (idsoggettorecupero != null ? !idsoggettorecupero.equals(that.idsoggettorecupero) : that.idsoggettorecupero != null)
            return false;
        if (baltrioneri != null ? !baltrioneri.equals(that.baltrioneri) : that.baltrioneri != null) return false;
        if (nimportototquote != null ? !nimportototquote.equals(that.nimportototquote) : that.nimportototquote != null)
            return false;
        if (npercnostra != null ? !npercnostra.equals(that.npercnostra) : that.npercnostra != null) return false;
        if (dcompetenzariass != null ? !dcompetenzariass.equals(that.dcompetenzariass) : that.dcompetenzariass != null)
            return false;
        if (idnodogestione != null ? !idnodogestione.equals(that.idnodogestione) : that.idnodogestione != null)
            return false;
        if (bemessodirezione != null ? !bemessodirezione.equals(that.bemessodirezione) : that.bemessodirezione != null)
            return false;
        if (nimportospese != null ? !nimportospese.equals(that.nimportospese) : that.nimportospese != null)
            return false;
        if (idnodoincasso != null ? !idnodoincasso.equals(that.idnodoincasso) : that.idnodoincasso != null)
            return false;
        if (dincasso != null ? !dincasso.equals(that.dincasso) : that.dincasso != null) return false;
        if (bmigrato != null ? !bmigrato.equals(that.bmigrato) : that.bmigrato != null) return false;
        if (cnote != null ? !cnote.equals(that.cnote) : that.cnote != null) return false;
        if (bripristinato != null ? !bripristinato.equals(that.bripristinato) : that.bripristinato != null)
            return false;
        if (idtitolostornato != null ? !idtitolostornato.equals(that.idtitolostornato) : that.idtitolostornato != null)
            return false;
        if (briass != null ? !briass.equals(that.briass) : that.briass != null) return false;
        if (desigibilita != null ? !desigibilita.equals(that.desigibilita) : that.desigibilita != null) return false;
        if (bannullocontabile != null ? !bannullocontabile.equals(that.bannullocontabile) : that.bannullocontabile != null)
            return false;
        if (ccodicegestione != null ? !ccodicegestione.equals(that.ccodicegestione) : that.ccodicegestione != null)
            return false;
        if (dtrasfcont != null ? !dtrasfcont.equals(that.dtrasfcont) : that.dtrasfcont != null) return false;
        if (nimportofondo != null ? !nimportofondo.equals(that.nimportofondo) : that.nimportofondo != null)
            return false;
        if (cnumliquid != null ? !cnumliquid.equals(that.cnumliquid) : that.cnumliquid != null) return false;
        if (nlpsimporto != null ? !nlpsimporto.equals(that.nlpsimporto) : that.nlpsimporto != null) return false;
        if (cdescappendice != null ? !cdescappendice.equals(that.cdescappendice) : that.cdescappendice != null)
            return false;
        if (dstorno != null ? !dstorno.equals(that.dstorno) : that.dstorno != null) return false;
        if (etiporappel != null ? !etiporappel.equals(that.etiporappel) : that.etiporappel != null) return false;
        if (etipoincasso != null ? !etipoincasso.equals(that.etipoincasso) : that.etipoincasso != null) return false;
        if (dannullo != null ? !dannullo.equals(that.dannullo) : that.dannullo != null) return false;
        if (emodincassocoass != null ? !emodincassocoass.equals(that.emodincassocoass) : that.emodincassocoass != null)
            return false;
        if (briservapremi != null ? !briservapremi.equals(that.briservapremi) : that.briservapremi != null)
            return false;
        if (besenteimposte != null ? !besenteimposte.equals(that.besenteimposte) : that.besenteimposte != null)
            return false;
        if (ecategoriaprodotto != null ? !ecategoriaprodotto.equals(that.ecategoriaprodotto) : that.ecategoriaprodotto != null)
            return false;
        if (deffettivoincasso != null ? !deffettivoincasso.equals(that.deffettivoincasso) : that.deffettivoincasso != null)
            return false;
        if (bvita != null ? !bvita.equals(that.bvita) : that.bvita != null) return false;
        if (bautoesitato != null ? !bautoesitato.equals(that.bautoesitato) : that.bautoesitato != null) return false;
        if (dsistemaannullo != null ? !dsistemaannullo.equals(that.dsistemaannullo) : that.dsistemaannullo != null)
            return false;
        if (ddatacaricostorno != null ? !ddatacaricostorno.equals(that.ddatacaricostorno) : that.ddatacaricostorno != null)
            return false;
        if (idfraz != null ? !idfraz.equals(that.idfraz) : that.idfraz != null) return false;
        if (ddataeffettopol != null ? !ddataeffettopol.equals(that.ddataeffettopol) : that.ddataeffettopol != null)
            return false;
        if (ddatascadenzapol != null ? !ddatascadenzapol.equals(that.ddatascadenzapol) : that.ddatascadenzapol != null)
            return false;
        if (etiporiservapremi != null ? !etiporiservapremi.equals(that.etiporiservapremi) : that.etiporiservapremi != null)
            return false;
        if (ddatacambio != null ? !ddatacambio.equals(that.ddatacambio) : that.ddatacambio != null) return false;
        if (nimptassocambio != null ? !nimptassocambio.equals(that.nimptassocambio) : that.nimptassocambio != null)
            return false;
        if (idcontraentelock != null ? !idcontraentelock.equals(that.idcontraentelock) : that.idcontraentelock != null)
            return false;
        if (idassicuratolock != null ? !idassicuratolock.equals(that.idassicuratolock) : that.idassicuratolock != null)
            return false;
        if (csiglanazione != null ? !csiglanazione.equals(that.csiglanazione) : that.csiglanazione != null)
            return false;
        if (cprovtassazione != null ? !cprovtassazione.equals(that.cprovtassazione) : that.cprovtassazione != null)
            return false;
        if (idmeanpaymentdata != null ? !idmeanpaymentdata.equals(that.idmeanpaymentdata) : that.idmeanpaymentdata != null)
            return false;
        if (npartialcollamount != null ? !npartialcollamount.equals(that.npartialcollamount) : that.npartialcollamount != null)
            return false;
        if (ereversereasonddo != null ? !ereversereasonddo.equals(that.ereversereasonddo) : that.ereversereasonddo != null)
            return false;
        if (eprovenienza != null ? !eprovenienza.equals(that.eprovenienza) : that.eprovenienza != null) return false;
        if (etipodociva != null ? !etipodociva.equals(that.etipodociva) : that.etipodociva != null) return false;
        if (cnumdociva != null ? !cnumdociva.equals(that.cnumdociva) : that.cnumdociva != null) return false;
        if (cnumprotiva != null ? !cnumprotiva.equals(that.cnumprotiva) : that.cnumprotiva != null) return false;
        if (dinvoice != null ? !dinvoice.equals(that.dinvoice) : that.dinvoice != null) return false;
        if (cnumdocivaann != null ? !cnumdocivaann.equals(that.cnumdocivaann) : that.cnumdocivaann != null)
            return false;
        if (cnumprotivaann != null ? !cnumprotivaann.equals(that.cnumprotivaann) : that.cnumprotivaann != null)
            return false;
        if (idcontext != null ? !idcontext.equals(that.idcontext) : that.idcontext != null) return false;
        if (ecreditcontrol != null ? !ecreditcontrol.equals(that.ecreditcontrol) : that.ecreditcontrol != null)
            return false;
        if (ecommissionstatus != null ? !ecommissionstatus.equals(that.ecommissionstatus) : that.ecommissionstatus != null)
            return false;
        if (ecashable != null ? !ecashable.equals(that.ecashable) : that.ecashable != null) return false;
        if (idpayerlock != null ? !idpayerlock.equals(that.idpayerlock) : that.idpayerlock != null) return false;
        if (nextracommnet != null ? !nextracommnet.equals(that.nextracommnet) : that.nextracommnet != null)
            return false;
        if (nextracommfee != null ? !nextracommfee.equals(that.nextracommfee) : that.nextracommfee != null)
            return false;
        if (emarker != null ? !emarker.equals(that.emarker) : that.emarker != null) return false;
        if (cmasterpolicy != null ? !cmasterpolicy.equals(that.cmasterpolicy) : that.cmasterpolicy != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idtitolo;
        result = 31 * result + (btitoloapporto != null ? btitoloapporto.hashCode() : 0);
        result = 31 * result + (estatopagamento != null ? estatopagamento.hashCode() : 0);
        result = 31 * result + (dattilegali != null ? dattilegali.hashCode() : 0);
        result = 31 * result + (nimportoprovv != null ? nimportoprovv.hashCode() : 0);
        result = 31 * result + (cnumpolizza != null ? cnumpolizza.hashCode() : 0);
        result = 31 * result + (bproposta != null ? bproposta.hashCode() : 0);
        result = 31 * result + (estato != null ? estato.hashCode() : 0);
        result = 31 * result + (nimporto != null ? nimporto.hashCode() : 0);
        result = 31 * result + (dscadenza != null ? dscadenza.hashCode() : 0);
        result = 31 * result + (bincasso100 != null ? bincasso100.hashCode() : 0);
        result = 31 * result + (deffetto != null ? deffetto.hashCode() : 0);
        result = 31 * result + (nimportototale != null ? nimportototale.hashCode() : 0);
        result = 31 * result + (ecaricosottotipo != null ? ecaricosottotipo.hashCode() : 0);
        result = 31 * result + (nappendice != null ? nappendice.hashCode() : 0);
        result = 31 * result + (cnumproposta != null ? cnumproposta.hashCode() : 0);
        result = 31 * result + (demissione != null ? demissione.hashCode() : 0);
        result = 31 * result + (dbollato != null ? dbollato.hashCode() : 0);
        result = 31 * result + (ecaricotipo != null ? ecaricotipo.hashCode() : 0);
        result = 31 * result + (dcarico != null ? dcarico.hashCode() : 0);
        result = 31 * result + (idcompagnia != null ? idcompagnia.hashCode() : 0);
        result = 31 * result + (idnodo != null ? idnodo.hashCode() : 0);
        result = 31 * result + (idcausale != null ? idcausale.hashCode() : 0);
        result = 31 * result + (iddivisa != null ? iddivisa.hashCode() : 0);
        result = 31 * result + (idcontorb != null ? idcontorb.hashCode() : 0);
        result = 31 * result + (idpagamento != null ? idpagamento.hashCode() : 0);
        result = 31 * result + (idprodotto != null ? idprodotto.hashCode() : 0);
        result = 31 * result + (idcontraente != null ? idcontraente.hashCode() : 0);
        result = 31 * result + (idassicurato != null ? idassicurato.hashCode() : 0);
        result = 31 * result + (bstornato != null ? bstornato.hashCode() : 0);
        result = 31 * result + (idmotivoannullo != null ? idmotivoannullo.hashCode() : 0);
        result = 31 * result + (bsuppletivo != null ? bsuppletivo.hashCode() : 0);
        result = 31 * result + (binviatocoge != null ? binviatocoge.hashCode() : 0);
        result = 31 * result + (idgruppotitoli != null ? idgruppotitoli.hashCode() : 0);
        result = 31 * result + (idtitolocollegato != null ? idtitolocollegato.hashCode() : 0);
        result = 31 * result + (bgruppotitoli != null ? bgruppotitoli.hashCode() : 0);
        result = 31 * result + (idnodosecondario != null ? idnodosecondario.hashCode() : 0);
        result = 31 * result + (idfiliale != null ? idfiliale.hashCode() : 0);
        result = 31 * result + (bprincipale != null ? bprincipale.hashCode() : 0);
        result = 31 * result + (bprovvprec != null ? bprovvprec.hashCode() : 0);
        result = 31 * result + (etipocoass != null ? etipocoass.hashCode() : 0);
        result = 31 * result + (nsopravvenienza != null ? nsopravvenienza.hashCode() : 0);
        result = 31 * result + (idproduttore != null ? idproduttore.hashCode() : 0);
        result = 31 * result + (cnumsinistro != null ? cnumsinistro.hashCode() : 0);
        result = 31 * result + (cnumrecupero != null ? cnumrecupero.hashCode() : 0);
        result = 31 * result + (iduserins != null ? iduserins.hashCode() : 0);
        result = 31 * result + (idusermod != null ? idusermod.hashCode() : 0);
        result = 31 * result + (dins != null ? dins.hashCode() : 0);
        result = 31 * result + (dmod != null ? dmod.hashCode() : 0);
        result = 31 * result + (cprovrescontraente != null ? cprovrescontraente.hashCode() : 0);
        result = 31 * result + (dnotifica != null ? dnotifica.hashCode() : 0);
        result = 31 * result + (idsoggettorecupero != null ? idsoggettorecupero.hashCode() : 0);
        result = 31 * result + (baltrioneri != null ? baltrioneri.hashCode() : 0);
        result = 31 * result + (nimportototquote != null ? nimportototquote.hashCode() : 0);
        result = 31 * result + (npercnostra != null ? npercnostra.hashCode() : 0);
        result = 31 * result + (dcompetenzariass != null ? dcompetenzariass.hashCode() : 0);
        result = 31 * result + (idnodogestione != null ? idnodogestione.hashCode() : 0);
        result = 31 * result + (bemessodirezione != null ? bemessodirezione.hashCode() : 0);
        result = 31 * result + (nimportospese != null ? nimportospese.hashCode() : 0);
        result = 31 * result + (idnodoincasso != null ? idnodoincasso.hashCode() : 0);
        result = 31 * result + (dincasso != null ? dincasso.hashCode() : 0);
        result = 31 * result + (bmigrato != null ? bmigrato.hashCode() : 0);
        result = 31 * result + (cnote != null ? cnote.hashCode() : 0);
        result = 31 * result + (bripristinato != null ? bripristinato.hashCode() : 0);
        result = 31 * result + (idtitolostornato != null ? idtitolostornato.hashCode() : 0);
        result = 31 * result + (briass != null ? briass.hashCode() : 0);
        result = 31 * result + (desigibilita != null ? desigibilita.hashCode() : 0);
        result = 31 * result + (bannullocontabile != null ? bannullocontabile.hashCode() : 0);
        result = 31 * result + (ccodicegestione != null ? ccodicegestione.hashCode() : 0);
        result = 31 * result + (dtrasfcont != null ? dtrasfcont.hashCode() : 0);
        result = 31 * result + (nimportofondo != null ? nimportofondo.hashCode() : 0);
        result = 31 * result + (cnumliquid != null ? cnumliquid.hashCode() : 0);
        result = 31 * result + (nlpsimporto != null ? nlpsimporto.hashCode() : 0);
        result = 31 * result + (cdescappendice != null ? cdescappendice.hashCode() : 0);
        result = 31 * result + (dstorno != null ? dstorno.hashCode() : 0);
        result = 31 * result + (etiporappel != null ? etiporappel.hashCode() : 0);
        result = 31 * result + (etipoincasso != null ? etipoincasso.hashCode() : 0);
        result = 31 * result + (dannullo != null ? dannullo.hashCode() : 0);
        result = 31 * result + (emodincassocoass != null ? emodincassocoass.hashCode() : 0);
        result = 31 * result + (briservapremi != null ? briservapremi.hashCode() : 0);
        result = 31 * result + (besenteimposte != null ? besenteimposte.hashCode() : 0);
        result = 31 * result + (ecategoriaprodotto != null ? ecategoriaprodotto.hashCode() : 0);
        result = 31 * result + (deffettivoincasso != null ? deffettivoincasso.hashCode() : 0);
        result = 31 * result + (bvita != null ? bvita.hashCode() : 0);
        result = 31 * result + (bautoesitato != null ? bautoesitato.hashCode() : 0);
        result = 31 * result + (dsistemaannullo != null ? dsistemaannullo.hashCode() : 0);
        result = 31 * result + (ddatacaricostorno != null ? ddatacaricostorno.hashCode() : 0);
        result = 31 * result + (idfraz != null ? idfraz.hashCode() : 0);
        result = 31 * result + (ddataeffettopol != null ? ddataeffettopol.hashCode() : 0);
        result = 31 * result + (ddatascadenzapol != null ? ddatascadenzapol.hashCode() : 0);
        result = 31 * result + (etiporiservapremi != null ? etiporiservapremi.hashCode() : 0);
        result = 31 * result + (ddatacambio != null ? ddatacambio.hashCode() : 0);
        result = 31 * result + (nimptassocambio != null ? nimptassocambio.hashCode() : 0);
        result = 31 * result + (idcontraentelock != null ? idcontraentelock.hashCode() : 0);
        result = 31 * result + (idassicuratolock != null ? idassicuratolock.hashCode() : 0);
        result = 31 * result + (csiglanazione != null ? csiglanazione.hashCode() : 0);
        result = 31 * result + (cprovtassazione != null ? cprovtassazione.hashCode() : 0);
        result = 31 * result + (idmeanpaymentdata != null ? idmeanpaymentdata.hashCode() : 0);
        result = 31 * result + (npartialcollamount != null ? npartialcollamount.hashCode() : 0);
        result = 31 * result + (ereversereasonddo != null ? ereversereasonddo.hashCode() : 0);
        result = 31 * result + (eprovenienza != null ? eprovenienza.hashCode() : 0);
        result = 31 * result + (etipodociva != null ? etipodociva.hashCode() : 0);
        result = 31 * result + (cnumdociva != null ? cnumdociva.hashCode() : 0);
        result = 31 * result + (cnumprotiva != null ? cnumprotiva.hashCode() : 0);
        result = 31 * result + (dinvoice != null ? dinvoice.hashCode() : 0);
        result = 31 * result + (cnumdocivaann != null ? cnumdocivaann.hashCode() : 0);
        result = 31 * result + (cnumprotivaann != null ? cnumprotivaann.hashCode() : 0);
        result = 31 * result + (idcontext != null ? idcontext.hashCode() : 0);
        result = 31 * result + (ecreditcontrol != null ? ecreditcontrol.hashCode() : 0);
        result = 31 * result + (ecommissionstatus != null ? ecommissionstatus.hashCode() : 0);
        result = 31 * result + (ecashable != null ? ecashable.hashCode() : 0);
        result = 31 * result + (idpayerlock != null ? idpayerlock.hashCode() : 0);
        result = 31 * result + (nextracommnet != null ? nextracommnet.hashCode() : 0);
        result = 31 * result + (nextracommfee != null ? nextracommfee.hashCode() : 0);
        result = 31 * result + (emarker != null ? emarker.hashCode() : 0);
        result = 31 * result + (cmasterpolicy != null ? cmasterpolicy.hashCode() : 0);
        return result;
    }
}
