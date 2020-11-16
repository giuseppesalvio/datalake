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
@Table(name = "com_com_masterdata", schema = "datalake", catalog = "")
public class ComComMasterdataEntity {
    private int ecid;
    private Integer companyid;
    private String nominative;
    private Integer persontypecode;
    private Date versiondate;
    private String ucid;
    private BigInteger nominativeqi;
    private BigInteger persontypecodeqi;
    private BigInteger ucidqi;
    private BigDecimal completenessindex;
    private BigDecimal qualityindex;
    private Timestamp freshnessdate;
    private Timestamp createdate;
    private Timestamp updatedate;
    private int version;
    private String username;

    @Id
    @Column(name = "ECID")
    public int getEcid() {
        return ecid;
    }

    public void setEcid(int ecid) {
        this.ecid = ecid;
    }

    @Basic
    @Column(name = "COMPANYID")
    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    @Basic
    @Column(name = "NOMINATIVE")
    public String getNominative() {
        return nominative;
    }

    public void setNominative(String nominative) {
        this.nominative = nominative;
    }

    @Basic
    @Column(name = "PERSONTYPECODE")
    public Integer getPersontypecode() {
        return persontypecode;
    }

    public void setPersontypecode(Integer persontypecode) {
        this.persontypecode = persontypecode;
    }

    @Basic
    @Column(name = "VERSIONDATE")
    public Date getVersiondate() {
        return versiondate;
    }

    public void setVersiondate(Date versiondate) {
        this.versiondate = versiondate;
    }

    @Basic
    @Column(name = "UCID")
    public String getUcid() {
        return ucid;
    }

    public void setUcid(String ucid) {
        this.ucid = ucid;
    }

    @Basic
    @Column(name = "NOMINATIVEQI")
    public BigInteger getNominativeqi() {
        return nominativeqi;
    }

    public void setNominativeqi(BigInteger nominativeqi) {
        this.nominativeqi = nominativeqi;
    }

    @Basic
    @Column(name = "PERSONTYPECODEQI")
    public BigInteger getPersontypecodeqi() {
        return persontypecodeqi;
    }

    public void setPersontypecodeqi(BigInteger persontypecodeqi) {
        this.persontypecodeqi = persontypecodeqi;
    }

    @Basic
    @Column(name = "UCIDQI")
    public BigInteger getUcidqi() {
        return ucidqi;
    }

    public void setUcidqi(BigInteger ucidqi) {
        this.ucidqi = ucidqi;
    }

    @Basic
    @Column(name = "COMPLETENESSINDEX")
    public BigDecimal getCompletenessindex() {
        return completenessindex;
    }

    public void setCompletenessindex(BigDecimal completenessindex) {
        this.completenessindex = completenessindex;
    }

    @Basic
    @Column(name = "QUALITYINDEX")
    public BigDecimal getQualityindex() {
        return qualityindex;
    }

    public void setQualityindex(BigDecimal qualityindex) {
        this.qualityindex = qualityindex;
    }

    @Basic
    @Column(name = "FRESHNESSDATE")
    public Timestamp getFreshnessdate() {
        return freshnessdate;
    }

    public void setFreshnessdate(Timestamp freshnessdate) {
        this.freshnessdate = freshnessdate;
    }

    @Basic
    @Column(name = "CREATEDATE")
    public Timestamp getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }

    @Basic
    @Column(name = "UPDATEDATE")
    public Timestamp getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Timestamp updatedate) {
        this.updatedate = updatedate;
    }

    @Basic
    @Column(name = "VERSION")
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Basic
    @Column(name = "USERNAME")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComComMasterdataEntity that = (ComComMasterdataEntity) o;
        return ecid == that.ecid &&
                version == that.version &&
                Objects.equals(companyid, that.companyid) &&
                Objects.equals(nominative, that.nominative) &&
                Objects.equals(persontypecode, that.persontypecode) &&
                Objects.equals(versiondate, that.versiondate) &&
                Objects.equals(ucid, that.ucid) &&
                Objects.equals(nominativeqi, that.nominativeqi) &&
                Objects.equals(persontypecodeqi, that.persontypecodeqi) &&
                Objects.equals(ucidqi, that.ucidqi) &&
                Objects.equals(completenessindex, that.completenessindex) &&
                Objects.equals(qualityindex, that.qualityindex) &&
                Objects.equals(freshnessdate, that.freshnessdate) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(updatedate, that.updatedate) &&
                Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ecid, companyid, nominative, persontypecode, versiondate, ucid, nominativeqi, persontypecodeqi, ucidqi, completenessindex, qualityindex, freshnessdate, createdate, updatedate, version, username);
    }
}
