package com.fincons.datalake.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "vttab200", schema = "datalake", catalog = "")
@IdClass(Vttab200EntityPK.class)
public class Vttab200Entity {
    private int t200Codcli;
    private String t200Codfisc;
    private String t200Nominativo;
    private String t200Indirizzo;
    private String t200Localita;
    private int t200Cap;
    private String t200Provincia;
    private String t200Nazione;
    private Date t200Nato;
    private String t200Sesso;
    private String t200Professione;
    private int t200Codcustomer;
    private String t200Flag;
    private int t200Codsoc;
    private String t200TipoRelaz;
    private String t200CodiceRelaz;
    private String t200LocalitaEx;
    private String t200ProvinciaEx;
    private String t200NumDocEx;
    private String t200TipoDocEx;
    private String t200RilascioEx;
    private String t200Info1Ex;
    private String t200Info2Ex;
    private String t200LocrilEx;
    private String t200EnterilEx;
    private String t200Note;
    private String t200IndirizzoD;
    private String t200LocalitaD;
    private String t200CapD;
    private String t200ProvinciaD;
    private String t200NazioneD;
    private int t200CabEx;
    private String t200GruppoEx;
    private String t200SottgruppoEx;
    private String t200Telefono;
    private String t200PressoD;
    private String t200Forzfisc;
    private String t200Storico;
    private String t200PersonaFis;
    private String t200StatoCivile;
    private BigInteger t200NumeroFigli;
    private String t200Titolo;
    private String t200Teluff;
    private String t200Cell;
    private String t200Fax;
    private String t200CabD;
    private String t200Privacy;
    private String t200AbiCedola;
    private String t200CabCedola;
    private String t200CcCedola;
    private String t200FirmaDbs;
    private String t200Bic;
    private String t200IbanIdPae;
    private String t200IbanCinPae;
    private String t200IbanCinConto;
    private String t200FlgCustomer;
    private String t200FlgCommander;
    private int t200Codcommander;

    @Id
    @Column(name = "T200_CODCLI")
    public int getT200Codcli() {
        return t200Codcli;
    }

    public void setT200Codcli(int t200Codcli) {
        this.t200Codcli = t200Codcli;
    }

    @Basic
    @Column(name = "T200_CODFISC")
    public String getT200Codfisc() {
        return t200Codfisc;
    }

    public void setT200Codfisc(String t200Codfisc) {
        this.t200Codfisc = t200Codfisc;
    }

    @Basic
    @Column(name = "T200_NOMINATIVO")
    public String getT200Nominativo() {
        return t200Nominativo;
    }

    public void setT200Nominativo(String t200Nominativo) {
        this.t200Nominativo = t200Nominativo;
    }

    @Basic
    @Column(name = "T200_INDIRIZZO")
    public String getT200Indirizzo() {
        return t200Indirizzo;
    }

    public void setT200Indirizzo(String t200Indirizzo) {
        this.t200Indirizzo = t200Indirizzo;
    }

    @Basic
    @Column(name = "T200_LOCALITA")
    public String getT200Localita() {
        return t200Localita;
    }

    public void setT200Localita(String t200Localita) {
        this.t200Localita = t200Localita;
    }

    @Basic
    @Column(name = "T200_CAP")
    public int getT200Cap() {
        return t200Cap;
    }

    public void setT200Cap(int t200Cap) {
        this.t200Cap = t200Cap;
    }

    @Basic
    @Column(name = "T200_PROVINCIA")
    public String getT200Provincia() {
        return t200Provincia;
    }

    public void setT200Provincia(String t200Provincia) {
        this.t200Provincia = t200Provincia;
    }

    @Basic
    @Column(name = "T200_NAZIONE")
    public String getT200Nazione() {
        return t200Nazione;
    }

    public void setT200Nazione(String t200Nazione) {
        this.t200Nazione = t200Nazione;
    }

    @Basic
    @Column(name = "T200_NATO")
    public Date getT200Nato() {
        return t200Nato;
    }

    public void setT200Nato(Date t200Nato) {
        this.t200Nato = t200Nato;
    }

    @Basic
    @Column(name = "T200_SESSO")
    public String getT200Sesso() {
        return t200Sesso;
    }

    public void setT200Sesso(String t200Sesso) {
        this.t200Sesso = t200Sesso;
    }

    @Basic
    @Column(name = "T200_PROFESSIONE")
    public String getT200Professione() {
        return t200Professione;
    }

    public void setT200Professione(String t200Professione) {
        this.t200Professione = t200Professione;
    }

    @Basic
    @Column(name = "T200_CODCUSTOMER")
    public int getT200Codcustomer() {
        return t200Codcustomer;
    }

    public void setT200Codcustomer(int t200Codcustomer) {
        this.t200Codcustomer = t200Codcustomer;
    }

    @Basic
    @Column(name = "T200_FLAG")
    public String getT200Flag() {
        return t200Flag;
    }

    public void setT200Flag(String t200Flag) {
        this.t200Flag = t200Flag;
    }

    @Id
    @Column(name = "T200_CODSOC")
    public int getT200Codsoc() {
        return t200Codsoc;
    }

    public void setT200Codsoc(int t200Codsoc) {
        this.t200Codsoc = t200Codsoc;
    }

    @Basic
    @Column(name = "T200_TIPO_RELAZ")
    public String getT200TipoRelaz() {
        return t200TipoRelaz;
    }

    public void setT200TipoRelaz(String t200TipoRelaz) {
        this.t200TipoRelaz = t200TipoRelaz;
    }

    @Basic
    @Column(name = "T200_CODICE_RELAZ")
    public String getT200CodiceRelaz() {
        return t200CodiceRelaz;
    }

    public void setT200CodiceRelaz(String t200CodiceRelaz) {
        this.t200CodiceRelaz = t200CodiceRelaz;
    }

    @Basic
    @Column(name = "T200_LOCALITA_EX")
    public String getT200LocalitaEx() {
        return t200LocalitaEx;
    }

    public void setT200LocalitaEx(String t200LocalitaEx) {
        this.t200LocalitaEx = t200LocalitaEx;
    }

    @Basic
    @Column(name = "T200_PROVINCIA_EX")
    public String getT200ProvinciaEx() {
        return t200ProvinciaEx;
    }

    public void setT200ProvinciaEx(String t200ProvinciaEx) {
        this.t200ProvinciaEx = t200ProvinciaEx;
    }

    @Basic
    @Column(name = "T200_NUM_DOC_EX")
    public String getT200NumDocEx() {
        return t200NumDocEx;
    }

    public void setT200NumDocEx(String t200NumDocEx) {
        this.t200NumDocEx = t200NumDocEx;
    }

    @Basic
    @Column(name = "T200_TIPO_DOC_EX")
    public String getT200TipoDocEx() {
        return t200TipoDocEx;
    }

    public void setT200TipoDocEx(String t200TipoDocEx) {
        this.t200TipoDocEx = t200TipoDocEx;
    }

    @Basic
    @Column(name = "T200_RILASCIO_EX")
    public String getT200RilascioEx() {
        return t200RilascioEx;
    }

    public void setT200RilascioEx(String t200RilascioEx) {
        this.t200RilascioEx = t200RilascioEx;
    }

    @Basic
    @Column(name = "T200_INFO1_EX")
    public String getT200Info1Ex() {
        return t200Info1Ex;
    }

    public void setT200Info1Ex(String t200Info1Ex) {
        this.t200Info1Ex = t200Info1Ex;
    }

    @Basic
    @Column(name = "T200_INFO2_EX")
    public String getT200Info2Ex() {
        return t200Info2Ex;
    }

    public void setT200Info2Ex(String t200Info2Ex) {
        this.t200Info2Ex = t200Info2Ex;
    }

    @Basic
    @Column(name = "T200_LOCRIL_EX")
    public String getT200LocrilEx() {
        return t200LocrilEx;
    }

    public void setT200LocrilEx(String t200LocrilEx) {
        this.t200LocrilEx = t200LocrilEx;
    }

    @Basic
    @Column(name = "T200_ENTERIL_EX")
    public String getT200EnterilEx() {
        return t200EnterilEx;
    }

    public void setT200EnterilEx(String t200EnterilEx) {
        this.t200EnterilEx = t200EnterilEx;
    }

    @Basic
    @Column(name = "T200_NOTE")
    public String getT200Note() {
        return t200Note;
    }

    public void setT200Note(String t200Note) {
        this.t200Note = t200Note;
    }

    @Basic
    @Column(name = "T200_INDIRIZZO_D")
    public String getT200IndirizzoD() {
        return t200IndirizzoD;
    }

    public void setT200IndirizzoD(String t200IndirizzoD) {
        this.t200IndirizzoD = t200IndirizzoD;
    }

    @Basic
    @Column(name = "T200_LOCALITA_D")
    public String getT200LocalitaD() {
        return t200LocalitaD;
    }

    public void setT200LocalitaD(String t200LocalitaD) {
        this.t200LocalitaD = t200LocalitaD;
    }

    @Basic
    @Column(name = "T200_CAP_D")
    public String getT200CapD() {
        return t200CapD;
    }

    public void setT200CapD(String t200CapD) {
        this.t200CapD = t200CapD;
    }

    @Basic
    @Column(name = "T200_PROVINCIA_D")
    public String getT200ProvinciaD() {
        return t200ProvinciaD;
    }

    public void setT200ProvinciaD(String t200ProvinciaD) {
        this.t200ProvinciaD = t200ProvinciaD;
    }

    @Basic
    @Column(name = "T200_NAZIONE_D")
    public String getT200NazioneD() {
        return t200NazioneD;
    }

    public void setT200NazioneD(String t200NazioneD) {
        this.t200NazioneD = t200NazioneD;
    }

    @Basic
    @Column(name = "T200_CAB_EX")
    public int getT200CabEx() {
        return t200CabEx;
    }

    public void setT200CabEx(int t200CabEx) {
        this.t200CabEx = t200CabEx;
    }

    @Basic
    @Column(name = "T200_GRUPPO_EX")
    public String getT200GruppoEx() {
        return t200GruppoEx;
    }

    public void setT200GruppoEx(String t200GruppoEx) {
        this.t200GruppoEx = t200GruppoEx;
    }

    @Basic
    @Column(name = "T200_SOTTGRUPPO_EX")
    public String getT200SottgruppoEx() {
        return t200SottgruppoEx;
    }

    public void setT200SottgruppoEx(String t200SottgruppoEx) {
        this.t200SottgruppoEx = t200SottgruppoEx;
    }

    @Basic
    @Column(name = "T200_TELEFONO")
    public String getT200Telefono() {
        return t200Telefono;
    }

    public void setT200Telefono(String t200Telefono) {
        this.t200Telefono = t200Telefono;
    }

    @Basic
    @Column(name = "T200_PRESSO_D")
    public String getT200PressoD() {
        return t200PressoD;
    }

    public void setT200PressoD(String t200PressoD) {
        this.t200PressoD = t200PressoD;
    }

    @Basic
    @Column(name = "T200_FORZFISC")
    public String getT200Forzfisc() {
        return t200Forzfisc;
    }

    public void setT200Forzfisc(String t200Forzfisc) {
        this.t200Forzfisc = t200Forzfisc;
    }

    @Basic
    @Column(name = "T200_STORICO")
    public String getT200Storico() {
        return t200Storico;
    }

    public void setT200Storico(String t200Storico) {
        this.t200Storico = t200Storico;
    }

    @Basic
    @Column(name = "T200_PERSONA_FIS")
    public String getT200PersonaFis() {
        return t200PersonaFis;
    }

    public void setT200PersonaFis(String t200PersonaFis) {
        this.t200PersonaFis = t200PersonaFis;
    }

    @Basic
    @Column(name = "T200_STATO_CIVILE")
    public String getT200StatoCivile() {
        return t200StatoCivile;
    }

    public void setT200StatoCivile(String t200StatoCivile) {
        this.t200StatoCivile = t200StatoCivile;
    }

    @Basic
    @Column(name = "T200_NUMERO_FIGLI")
    public BigInteger getT200NumeroFigli() {
        return t200NumeroFigli;
    }

    public void setT200NumeroFigli(BigInteger t200NumeroFigli) {
        this.t200NumeroFigli = t200NumeroFigli;
    }

    @Basic
    @Column(name = "T200_TITOLO")
    public String getT200Titolo() {
        return t200Titolo;
    }

    public void setT200Titolo(String t200Titolo) {
        this.t200Titolo = t200Titolo;
    }

    @Basic
    @Column(name = "T200_TELUFF")
    public String getT200Teluff() {
        return t200Teluff;
    }

    public void setT200Teluff(String t200Teluff) {
        this.t200Teluff = t200Teluff;
    }

    @Basic
    @Column(name = "T200_CELL")
    public String getT200Cell() {
        return t200Cell;
    }

    public void setT200Cell(String t200Cell) {
        this.t200Cell = t200Cell;
    }

    @Basic
    @Column(name = "T200_FAX")
    public String getT200Fax() {
        return t200Fax;
    }

    public void setT200Fax(String t200Fax) {
        this.t200Fax = t200Fax;
    }

    @Basic
    @Column(name = "T200_CAB_D")
    public String getT200CabD() {
        return t200CabD;
    }

    public void setT200CabD(String t200CabD) {
        this.t200CabD = t200CabD;
    }

    @Basic
    @Column(name = "T200_PRIVACY")
    public String getT200Privacy() {
        return t200Privacy;
    }

    public void setT200Privacy(String t200Privacy) {
        this.t200Privacy = t200Privacy;
    }

    @Basic
    @Column(name = "T200_ABI_CEDOLA")
    public String getT200AbiCedola() {
        return t200AbiCedola;
    }

    public void setT200AbiCedola(String t200AbiCedola) {
        this.t200AbiCedola = t200AbiCedola;
    }

    @Basic
    @Column(name = "T200_CAB_CEDOLA")
    public String getT200CabCedola() {
        return t200CabCedola;
    }

    public void setT200CabCedola(String t200CabCedola) {
        this.t200CabCedola = t200CabCedola;
    }

    @Basic
    @Column(name = "T200_CC_CEDOLA")
    public String getT200CcCedola() {
        return t200CcCedola;
    }

    public void setT200CcCedola(String t200CcCedola) {
        this.t200CcCedola = t200CcCedola;
    }

    @Basic
    @Column(name = "T200_FIRMA_DBS")
    public String getT200FirmaDbs() {
        return t200FirmaDbs;
    }

    public void setT200FirmaDbs(String t200FirmaDbs) {
        this.t200FirmaDbs = t200FirmaDbs;
    }

    @Basic
    @Column(name = "T200_BIC")
    public String getT200Bic() {
        return t200Bic;
    }

    public void setT200Bic(String t200Bic) {
        this.t200Bic = t200Bic;
    }

    @Basic
    @Column(name = "T200_IBAN_ID_PAE")
    public String getT200IbanIdPae() {
        return t200IbanIdPae;
    }

    public void setT200IbanIdPae(String t200IbanIdPae) {
        this.t200IbanIdPae = t200IbanIdPae;
    }

    @Basic
    @Column(name = "T200_IBAN_CIN_PAE")
    public String getT200IbanCinPae() {
        return t200IbanCinPae;
    }

    public void setT200IbanCinPae(String t200IbanCinPae) {
        this.t200IbanCinPae = t200IbanCinPae;
    }

    @Basic
    @Column(name = "T200_IBAN_CIN_CONTO")
    public String getT200IbanCinConto() {
        return t200IbanCinConto;
    }

    public void setT200IbanCinConto(String t200IbanCinConto) {
        this.t200IbanCinConto = t200IbanCinConto;
    }

    @Basic
    @Column(name = "T200_FLG_CUSTOMER")
    public String getT200FlgCustomer() {
        return t200FlgCustomer;
    }

    public void setT200FlgCustomer(String t200FlgCustomer) {
        this.t200FlgCustomer = t200FlgCustomer;
    }

    @Basic
    @Column(name = "T200_FLG_COMMANDER")
    public String getT200FlgCommander() {
        return t200FlgCommander;
    }

    public void setT200FlgCommander(String t200FlgCommander) {
        this.t200FlgCommander = t200FlgCommander;
    }

    @Basic
    @Column(name = "T200_CODCOMMANDER")
    public int getT200Codcommander() {
        return t200Codcommander;
    }

    public void setT200Codcommander(int t200Codcommander) {
        this.t200Codcommander = t200Codcommander;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vttab200Entity that = (Vttab200Entity) o;
        return t200Codcli == that.t200Codcli &&
                t200Cap == that.t200Cap &&
                t200Codcustomer == that.t200Codcustomer &&
                t200Codsoc == that.t200Codsoc &&
                t200CabEx == that.t200CabEx &&
                t200Codcommander == that.t200Codcommander &&
                Objects.equals(t200Codfisc, that.t200Codfisc) &&
                Objects.equals(t200Nominativo, that.t200Nominativo) &&
                Objects.equals(t200Indirizzo, that.t200Indirizzo) &&
                Objects.equals(t200Localita, that.t200Localita) &&
                Objects.equals(t200Provincia, that.t200Provincia) &&
                Objects.equals(t200Nazione, that.t200Nazione) &&
                Objects.equals(t200Nato, that.t200Nato) &&
                Objects.equals(t200Sesso, that.t200Sesso) &&
                Objects.equals(t200Professione, that.t200Professione) &&
                Objects.equals(t200Flag, that.t200Flag) &&
                Objects.equals(t200TipoRelaz, that.t200TipoRelaz) &&
                Objects.equals(t200CodiceRelaz, that.t200CodiceRelaz) &&
                Objects.equals(t200LocalitaEx, that.t200LocalitaEx) &&
                Objects.equals(t200ProvinciaEx, that.t200ProvinciaEx) &&
                Objects.equals(t200NumDocEx, that.t200NumDocEx) &&
                Objects.equals(t200TipoDocEx, that.t200TipoDocEx) &&
                Objects.equals(t200RilascioEx, that.t200RilascioEx) &&
                Objects.equals(t200Info1Ex, that.t200Info1Ex) &&
                Objects.equals(t200Info2Ex, that.t200Info2Ex) &&
                Objects.equals(t200LocrilEx, that.t200LocrilEx) &&
                Objects.equals(t200EnterilEx, that.t200EnterilEx) &&
                Objects.equals(t200Note, that.t200Note) &&
                Objects.equals(t200IndirizzoD, that.t200IndirizzoD) &&
                Objects.equals(t200LocalitaD, that.t200LocalitaD) &&
                Objects.equals(t200CapD, that.t200CapD) &&
                Objects.equals(t200ProvinciaD, that.t200ProvinciaD) &&
                Objects.equals(t200NazioneD, that.t200NazioneD) &&
                Objects.equals(t200GruppoEx, that.t200GruppoEx) &&
                Objects.equals(t200SottgruppoEx, that.t200SottgruppoEx) &&
                Objects.equals(t200Telefono, that.t200Telefono) &&
                Objects.equals(t200PressoD, that.t200PressoD) &&
                Objects.equals(t200Forzfisc, that.t200Forzfisc) &&
                Objects.equals(t200Storico, that.t200Storico) &&
                Objects.equals(t200PersonaFis, that.t200PersonaFis) &&
                Objects.equals(t200StatoCivile, that.t200StatoCivile) &&
                Objects.equals(t200NumeroFigli, that.t200NumeroFigli) &&
                Objects.equals(t200Titolo, that.t200Titolo) &&
                Objects.equals(t200Teluff, that.t200Teluff) &&
                Objects.equals(t200Cell, that.t200Cell) &&
                Objects.equals(t200Fax, that.t200Fax) &&
                Objects.equals(t200CabD, that.t200CabD) &&
                Objects.equals(t200Privacy, that.t200Privacy) &&
                Objects.equals(t200AbiCedola, that.t200AbiCedola) &&
                Objects.equals(t200CabCedola, that.t200CabCedola) &&
                Objects.equals(t200CcCedola, that.t200CcCedola) &&
                Objects.equals(t200FirmaDbs, that.t200FirmaDbs) &&
                Objects.equals(t200Bic, that.t200Bic) &&
                Objects.equals(t200IbanIdPae, that.t200IbanIdPae) &&
                Objects.equals(t200IbanCinPae, that.t200IbanCinPae) &&
                Objects.equals(t200IbanCinConto, that.t200IbanCinConto) &&
                Objects.equals(t200FlgCustomer, that.t200FlgCustomer) &&
                Objects.equals(t200FlgCommander, that.t200FlgCommander);
    }

    @Override
    public int hashCode() {
        return Objects.hash(t200Codcli, t200Codfisc, t200Nominativo, t200Indirizzo, t200Localita, t200Cap, t200Provincia, t200Nazione, t200Nato, t200Sesso, t200Professione, t200Codcustomer, t200Flag, t200Codsoc, t200TipoRelaz, t200CodiceRelaz, t200LocalitaEx, t200ProvinciaEx, t200NumDocEx, t200TipoDocEx, t200RilascioEx, t200Info1Ex, t200Info2Ex, t200LocrilEx, t200EnterilEx, t200Note, t200IndirizzoD, t200LocalitaD, t200CapD, t200ProvinciaD, t200NazioneD, t200CabEx, t200GruppoEx, t200SottgruppoEx, t200Telefono, t200PressoD, t200Forzfisc, t200Storico, t200PersonaFis, t200StatoCivile, t200NumeroFigli, t200Titolo, t200Teluff, t200Cell, t200Fax, t200CabD, t200Privacy, t200AbiCedola, t200CabCedola, t200CcCedola, t200FirmaDbs, t200Bic, t200IbanIdPae, t200IbanCinPae, t200IbanCinConto, t200FlgCustomer, t200FlgCommander, t200Codcommander);
    }


}
