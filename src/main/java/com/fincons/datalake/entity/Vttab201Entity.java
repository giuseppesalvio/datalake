package com.fincons.datalake.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;
@Entity
@Table(name = "vttab201", schema = "datalake", catalog = "")
@IdClass(com.fincons.datalake.entity.Vttab201EntityPk.class)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Vttab201Entity {
    private int t201Codsoc;
    private int t201Codcli;
    private String t201Cognome;
    private String t201Nome;
    private String t201Mail;
    private int t201Ndg;
    private String t201Abi;
    private String t201FlgStorico;
    private String t201FlgPec;
    private String t201CodAteco;
    private int t201Istat;
    private String t201FlgTeff;
    private String t201FlgForzRes;
    private String t201FlgForzDom;
    private Date t201DataOper;
    private String t201UserOper;
    private Date t201DataVar;
    private String t201UserVar;
    private String t201Tae;
    private int t201CodCittadin;
    private String t201DesCittadin;
    private String t201ResFiscale;
    private String t201DesResFiscale;
    private String t201CodUicRes;
    private String t201CodUicDom;
    private Date t201DtScadDocEx;
    private String t201DichPep;
    private String t201TipSocieta;
    private String t201TipSocietaNote;
    private String t201RelazFig;
    private String t201RelazFigNote;
    private String t201VarbenLegCc;
    private String t201BenTipoNom;
    private String t201PoliticoLocale;
    private String t201CaricaPoliticoLoc;
    private String t201Inquadramento;
    private String t201UltimaAttivita;
    private Date t201DataCostituzione;
    private String t201CodFiscaleSoc;
    private String t201SettoreEconomico;
    private String t201InfoAggSoc;
    private String t201AreaGeoAttivita;
    private String t201AreaGeoProv;
    private String t201AreaGeoLocalita;
    private String t201AreaGeoCap;
    private String t201NazEstAttivita;
    private String t201EsisteLrapp;
    private String t201RelazFigTipo;
    private String t201DocumentRacc;
    private String t201FlgNoComunicaz;
    private String t201ContrPa;
    private String t201PepTer;

    @Id
    @Column(name = "T201_CODSOC")
    public int getT201Codsoc() {
        return t201Codsoc;
    }

    public void setT201Codsoc(int t201Codsoc) {
        this.t201Codsoc = t201Codsoc;
    }

    @Id
    @Column(name = "T201_CODCLI")
    public int getT201Codcli() {
        return t201Codcli;
    }

    public void setT201Codcli(int t201Codcli) {
        this.t201Codcli = t201Codcli;
    }

    @Basic
    @Column(name = "T201_COGNOME")
    public String getT201Cognome() {
        return t201Cognome;
    }

    public void setT201Cognome(String t201Cognome) {
        this.t201Cognome = t201Cognome;
    }

    @Basic
    @Column(name = "T201_NOME")
    public String getT201Nome() {
        return t201Nome;
    }

    public void setT201Nome(String t201Nome) {
        this.t201Nome = t201Nome;
    }

    @Basic
    @Column(name = "T201_MAIL")
    public String getT201Mail() {
        return t201Mail;
    }

    public void setT201Mail(String t201Mail) {
        this.t201Mail = t201Mail;
    }

    @Basic
    @Column(name = "T201_NDG")
    public int getT201Ndg() {
        return t201Ndg;
    }

    public void setT201Ndg(int t201Ndg) {
        this.t201Ndg = t201Ndg;
    }

    @Basic
    @Column(name = "T201_ABI")
    public String getT201Abi() {
        return t201Abi;
    }

    public void setT201Abi(String t201Abi) {
        this.t201Abi = t201Abi;
    }

    @Basic
    @Column(name = "T201_FLG_STORICO")
    public String getT201FlgStorico() {
        return t201FlgStorico;
    }

    public void setT201FlgStorico(String t201FlgStorico) {
        this.t201FlgStorico = t201FlgStorico;
    }

    @Basic
    @Column(name = "T201_FLG_PEC")
    public String getT201FlgPec() {
        return t201FlgPec;
    }

    public void setT201FlgPec(String t201FlgPec) {
        this.t201FlgPec = t201FlgPec;
    }

    @Basic
    @Column(name = "T201_COD_ATECO")
    public String getT201CodAteco() {
        return t201CodAteco;
    }

    public void setT201CodAteco(String t201CodAteco) {
        this.t201CodAteco = t201CodAteco;
    }

    @Basic
    @Column(name = "T201_ISTAT")
    public int getT201Istat() {
        return t201Istat;
    }

    public void setT201Istat(int t201Istat) {
        this.t201Istat = t201Istat;
    }

    @Basic
    @Column(name = "T201_FLG_TEFF")
    public String getT201FlgTeff() {
        return t201FlgTeff;
    }

    public void setT201FlgTeff(String t201FlgTeff) {
        this.t201FlgTeff = t201FlgTeff;
    }

    @Basic
    @Column(name = "T201_FLG_FORZ_RES")
    public String getT201FlgForzRes() {
        return t201FlgForzRes;
    }

    public void setT201FlgForzRes(String t201FlgForzRes) {
        this.t201FlgForzRes = t201FlgForzRes;
    }

    @Basic
    @Column(name = "T201_FLG_FORZ_DOM")
    public String getT201FlgForzDom() {
        return t201FlgForzDom;
    }

    public void setT201FlgForzDom(String t201FlgForzDom) {
        this.t201FlgForzDom = t201FlgForzDom;
    }

    @Basic
    @Column(name = "T201_DATA_OPER")
    public Date getT201DataOper() {
        return t201DataOper;
    }

    public void setT201DataOper(Date t201DataOper) {
        this.t201DataOper = t201DataOper;
    }

    @Basic
    @Column(name = "T201_USER_OPER")
    public String getT201UserOper() {
        return t201UserOper;
    }

    public void setT201UserOper(String t201UserOper) {
        this.t201UserOper = t201UserOper;
    }

    @Basic
    @Column(name = "T201_DATA_VAR")
    public Date getT201DataVar() {
        return t201DataVar;
    }

    public void setT201DataVar(Date t201DataVar) {
        this.t201DataVar = t201DataVar;
    }

    @Basic
    @Column(name = "T201_USER_VAR")
    public String getT201UserVar() {
        return t201UserVar;
    }

    public void setT201UserVar(String t201UserVar) {
        this.t201UserVar = t201UserVar;
    }

    @Basic
    @Column(name = "T201_TAE")
    public String getT201Tae() {
        return t201Tae;
    }

    public void setT201Tae(String t201Tae) {
        this.t201Tae = t201Tae;
    }

    @Basic
    @Column(name = "T201_COD_CITTADIN")
    public int getT201CodCittadin() {
        return t201CodCittadin;
    }

    public void setT201CodCittadin(int t201CodCittadin) {
        this.t201CodCittadin = t201CodCittadin;
    }

    @Basic
    @Column(name = "T201_DES_CITTADIN")
    public String getT201DesCittadin() {
        return t201DesCittadin;
    }

    public void setT201DesCittadin(String t201DesCittadin) {
        this.t201DesCittadin = t201DesCittadin;
    }

    @Basic
    @Column(name = "T201_RES_FISCALE")
    public String getT201ResFiscale() {
        return t201ResFiscale;
    }

    public void setT201ResFiscale(String t201ResFiscale) {
        this.t201ResFiscale = t201ResFiscale;
    }

    @Basic
    @Column(name = "T201_DES_RES_FISCALE")
    public String getT201DesResFiscale() {
        return t201DesResFiscale;
    }

    public void setT201DesResFiscale(String t201DesResFiscale) {
        this.t201DesResFiscale = t201DesResFiscale;
    }

    @Basic
    @Column(name = "T201_COD_UIC_RES")
    public String getT201CodUicRes() {
        return t201CodUicRes;
    }

    public void setT201CodUicRes(String t201CodUicRes) {
        this.t201CodUicRes = t201CodUicRes;
    }

    @Basic
    @Column(name = "T201_COD_UIC_DOM")
    public String getT201CodUicDom() {
        return t201CodUicDom;
    }

    public void setT201CodUicDom(String t201CodUicDom) {
        this.t201CodUicDom = t201CodUicDom;
    }

    @Basic
    @Column(name = "T201_DT_SCAD_DOC_EX")
    public Date getT201DtScadDocEx() {
        return t201DtScadDocEx;
    }

    public void setT201DtScadDocEx(Date t201DtScadDocEx) {
        this.t201DtScadDocEx = t201DtScadDocEx;
    }

    @Basic
    @Column(name = "T201_DICH_PEP")
    public String getT201DichPep() {
        return t201DichPep;
    }

    public void setT201DichPep(String t201DichPep) {
        this.t201DichPep = t201DichPep;
    }

    @Basic
    @Column(name = "T201_TIP_SOCIETA")
    public String getT201TipSocieta() {
        return t201TipSocieta;
    }

    public void setT201TipSocieta(String t201TipSocieta) {
        this.t201TipSocieta = t201TipSocieta;
    }

    @Basic
    @Column(name = "T201_TIP_SOCIETA_NOTE")
    public String getT201TipSocietaNote() {
        return t201TipSocietaNote;
    }

    public void setT201TipSocietaNote(String t201TipSocietaNote) {
        this.t201TipSocietaNote = t201TipSocietaNote;
    }

    @Basic
    @Column(name = "T201_RELAZ_FIG")
    public String getT201RelazFig() {
        return t201RelazFig;
    }

    public void setT201RelazFig(String t201RelazFig) {
        this.t201RelazFig = t201RelazFig;
    }

    @Basic
    @Column(name = "T201_RELAZ_FIG_NOTE")
    public String getT201RelazFigNote() {
        return t201RelazFigNote;
    }

    public void setT201RelazFigNote(String t201RelazFigNote) {
        this.t201RelazFigNote = t201RelazFigNote;
    }

    @Basic
    @Column(name = "T201_VARBEN_LEG_CC")
    public String getT201VarbenLegCc() {
        return t201VarbenLegCc;
    }

    public void setT201VarbenLegCc(String t201VarbenLegCc) {
        this.t201VarbenLegCc = t201VarbenLegCc;
    }

    @Basic
    @Column(name = "T201_BEN_TIPO_NOM")
    public String getT201BenTipoNom() {
        return t201BenTipoNom;
    }

    public void setT201BenTipoNom(String t201BenTipoNom) {
        this.t201BenTipoNom = t201BenTipoNom;
    }

    @Basic
    @Column(name = "T201_POLITICO_LOCALE")
    public String getT201PoliticoLocale() {
        return t201PoliticoLocale;
    }

    public void setT201PoliticoLocale(String t201PoliticoLocale) {
        this.t201PoliticoLocale = t201PoliticoLocale;
    }

    @Basic
    @Column(name = "T201_CARICA_POLITICO_LOC")
    public String getT201CaricaPoliticoLoc() {
        return t201CaricaPoliticoLoc;
    }

    public void setT201CaricaPoliticoLoc(String t201CaricaPoliticoLoc) {
        this.t201CaricaPoliticoLoc = t201CaricaPoliticoLoc;
    }

    @Basic
    @Column(name = "T201_INQUADRAMENTO")
    public String getT201Inquadramento() {
        return t201Inquadramento;
    }

    public void setT201Inquadramento(String t201Inquadramento) {
        this.t201Inquadramento = t201Inquadramento;
    }

    @Basic
    @Column(name = "T201_ULTIMA_ATTIVITA")
    public String getT201UltimaAttivita() {
        return t201UltimaAttivita;
    }

    public void setT201UltimaAttivita(String t201UltimaAttivita) {
        this.t201UltimaAttivita = t201UltimaAttivita;
    }

    @Basic
    @Column(name = "T201_DATA_COSTITUZIONE")
    public Date getT201DataCostituzione() {
        return t201DataCostituzione;
    }

    public void setT201DataCostituzione(Date t201DataCostituzione) {
        this.t201DataCostituzione = t201DataCostituzione;
    }

    @Basic
    @Column(name = "T201_COD_FISCALE_SOC")
    public String getT201CodFiscaleSoc() {
        return t201CodFiscaleSoc;
    }

    public void setT201CodFiscaleSoc(String t201CodFiscaleSoc) {
        this.t201CodFiscaleSoc = t201CodFiscaleSoc;
    }

    @Basic
    @Column(name = "T201_SETTORE_ECONOMICO")
    public String getT201SettoreEconomico() {
        return t201SettoreEconomico;
    }

    public void setT201SettoreEconomico(String t201SettoreEconomico) {
        this.t201SettoreEconomico = t201SettoreEconomico;
    }

    @Basic
    @Column(name = "T201_INFO_AGG_SOC")
    public String getT201InfoAggSoc() {
        return t201InfoAggSoc;
    }

    public void setT201InfoAggSoc(String t201InfoAggSoc) {
        this.t201InfoAggSoc = t201InfoAggSoc;
    }

    @Basic
    @Column(name = "T201_AREA_GEO_ATTIVITA")
    public String getT201AreaGeoAttivita() {
        return t201AreaGeoAttivita;
    }

    public void setT201AreaGeoAttivita(String t201AreaGeoAttivita) {
        this.t201AreaGeoAttivita = t201AreaGeoAttivita;
    }

    @Basic
    @Column(name = "T201_AREA_GEO_PROV")
    public String getT201AreaGeoProv() {
        return t201AreaGeoProv;
    }

    public void setT201AreaGeoProv(String t201AreaGeoProv) {
        this.t201AreaGeoProv = t201AreaGeoProv;
    }

    @Basic
    @Column(name = "T201_AREA_GEO_LOCALITA")
    public String getT201AreaGeoLocalita() {
        return t201AreaGeoLocalita;
    }

    public void setT201AreaGeoLocalita(String t201AreaGeoLocalita) {
        this.t201AreaGeoLocalita = t201AreaGeoLocalita;
    }

    @Basic
    @Column(name = "T201_AREA_GEO_CAP")
    public String getT201AreaGeoCap() {
        return t201AreaGeoCap;
    }

    public void setT201AreaGeoCap(String t201AreaGeoCap) {
        this.t201AreaGeoCap = t201AreaGeoCap;
    }

    @Basic
    @Column(name = "T201_NAZ_EST_ATTIVITA")
    public String getT201NazEstAttivita() {
        return t201NazEstAttivita;
    }

    public void setT201NazEstAttivita(String t201NazEstAttivita) {
        this.t201NazEstAttivita = t201NazEstAttivita;
    }

    @Basic
    @Column(name = "T201_ESISTE_LRAPP")
    public String getT201EsisteLrapp() {
        return t201EsisteLrapp;
    }

    public void setT201EsisteLrapp(String t201EsisteLrapp) {
        this.t201EsisteLrapp = t201EsisteLrapp;
    }

    @Basic
    @Column(name = "T201_RELAZ_FIG_TIPO")
    public String getT201RelazFigTipo() {
        return t201RelazFigTipo;
    }

    public void setT201RelazFigTipo(String t201RelazFigTipo) {
        this.t201RelazFigTipo = t201RelazFigTipo;
    }

    @Basic
    @Column(name = "T201_DOCUMENT_RACC")
    public String getT201DocumentRacc() {
        return t201DocumentRacc;
    }

    public void setT201DocumentRacc(String t201DocumentRacc) {
        this.t201DocumentRacc = t201DocumentRacc;
    }

    @Basic
    @Column(name = "T201_FLG_NO_COMUNICAZ")
    public String getT201FlgNoComunicaz() {
        return t201FlgNoComunicaz;
    }

    public void setT201FlgNoComunicaz(String t201FlgNoComunicaz) {
        this.t201FlgNoComunicaz = t201FlgNoComunicaz;
    }

    @Basic
    @Column(name = "T201_CONTR_PA")
    public String getT201ContrPa() {
        return t201ContrPa;
    }

    public void setT201ContrPa(String t201ContrPa) {
        this.t201ContrPa = t201ContrPa;
    }

    @Basic
    @Column(name = "T201_PEP_TER")
    public String getT201PepTer() {
        return t201PepTer;
    }

    public void setT201PepTer(String t201PepTer) {
        this.t201PepTer = t201PepTer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vttab201Entity that = (Vttab201Entity) o;
        return t201Codsoc == that.t201Codsoc &&
                t201Codcli == that.t201Codcli &&
                t201Ndg == that.t201Ndg &&
                t201Istat == that.t201Istat &&
                t201CodCittadin == that.t201CodCittadin &&
                Objects.equals(t201Cognome, that.t201Cognome) &&
                Objects.equals(t201Nome, that.t201Nome) &&
                Objects.equals(t201Mail, that.t201Mail) &&
                Objects.equals(t201Abi, that.t201Abi) &&
                Objects.equals(t201FlgStorico, that.t201FlgStorico) &&
                Objects.equals(t201FlgPec, that.t201FlgPec) &&
                Objects.equals(t201CodAteco, that.t201CodAteco) &&
                Objects.equals(t201FlgTeff, that.t201FlgTeff) &&
                Objects.equals(t201FlgForzRes, that.t201FlgForzRes) &&
                Objects.equals(t201FlgForzDom, that.t201FlgForzDom) &&
                Objects.equals(t201DataOper, that.t201DataOper) &&
                Objects.equals(t201UserOper, that.t201UserOper) &&
                Objects.equals(t201DataVar, that.t201DataVar) &&
                Objects.equals(t201UserVar, that.t201UserVar) &&
                Objects.equals(t201Tae, that.t201Tae) &&
                Objects.equals(t201DesCittadin, that.t201DesCittadin) &&
                Objects.equals(t201ResFiscale, that.t201ResFiscale) &&
                Objects.equals(t201DesResFiscale, that.t201DesResFiscale) &&
                Objects.equals(t201CodUicRes, that.t201CodUicRes) &&
                Objects.equals(t201CodUicDom, that.t201CodUicDom) &&
                Objects.equals(t201DtScadDocEx, that.t201DtScadDocEx) &&
                Objects.equals(t201DichPep, that.t201DichPep) &&
                Objects.equals(t201TipSocieta, that.t201TipSocieta) &&
                Objects.equals(t201TipSocietaNote, that.t201TipSocietaNote) &&
                Objects.equals(t201RelazFig, that.t201RelazFig) &&
                Objects.equals(t201RelazFigNote, that.t201RelazFigNote) &&
                Objects.equals(t201VarbenLegCc, that.t201VarbenLegCc) &&
                Objects.equals(t201BenTipoNom, that.t201BenTipoNom) &&
                Objects.equals(t201PoliticoLocale, that.t201PoliticoLocale) &&
                Objects.equals(t201CaricaPoliticoLoc, that.t201CaricaPoliticoLoc) &&
                Objects.equals(t201Inquadramento, that.t201Inquadramento) &&
                Objects.equals(t201UltimaAttivita, that.t201UltimaAttivita) &&
                Objects.equals(t201DataCostituzione, that.t201DataCostituzione) &&
                Objects.equals(t201CodFiscaleSoc, that.t201CodFiscaleSoc) &&
                Objects.equals(t201SettoreEconomico, that.t201SettoreEconomico) &&
                Objects.equals(t201InfoAggSoc, that.t201InfoAggSoc) &&
                Objects.equals(t201AreaGeoAttivita, that.t201AreaGeoAttivita) &&
                Objects.equals(t201AreaGeoProv, that.t201AreaGeoProv) &&
                Objects.equals(t201AreaGeoLocalita, that.t201AreaGeoLocalita) &&
                Objects.equals(t201AreaGeoCap, that.t201AreaGeoCap) &&
                Objects.equals(t201NazEstAttivita, that.t201NazEstAttivita) &&
                Objects.equals(t201EsisteLrapp, that.t201EsisteLrapp) &&
                Objects.equals(t201RelazFigTipo, that.t201RelazFigTipo) &&
                Objects.equals(t201DocumentRacc, that.t201DocumentRacc) &&
                Objects.equals(t201FlgNoComunicaz, that.t201FlgNoComunicaz) &&
                Objects.equals(t201ContrPa, that.t201ContrPa) &&
                Objects.equals(t201PepTer, that.t201PepTer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(t201Codsoc, t201Codcli, t201Cognome, t201Nome, t201Mail, t201Ndg, t201Abi, t201FlgStorico, t201FlgPec, t201CodAteco, t201Istat, t201FlgTeff, t201FlgForzRes, t201FlgForzDom, t201DataOper, t201UserOper, t201DataVar, t201UserVar, t201Tae, t201CodCittadin, t201DesCittadin, t201ResFiscale, t201DesResFiscale, t201CodUicRes, t201CodUicDom, t201DtScadDocEx, t201DichPep, t201TipSocieta, t201TipSocietaNote, t201RelazFig, t201RelazFigNote, t201VarbenLegCc, t201BenTipoNom, t201PoliticoLocale, t201CaricaPoliticoLoc, t201Inquadramento, t201UltimaAttivita, t201DataCostituzione, t201CodFiscaleSoc, t201SettoreEconomico, t201InfoAggSoc, t201AreaGeoAttivita, t201AreaGeoProv, t201AreaGeoLocalita, t201AreaGeoCap, t201NazEstAttivita, t201EsisteLrapp, t201RelazFigTipo, t201DocumentRacc, t201FlgNoComunicaz, t201ContrPa, t201PepTer);
    }
}
