package com.fincons.datalake.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "com_com_identificationdata", schema = "datalake", catalog = "")
public class ComComIdentificationdataEntity {
    private int id;
    private int ecid;
    private int identificationtypecode;
    private String identification;
    private Date begindate;
    private Date enddate;
    private Integer territoryid;
    private String issuer;
    private Integer issuertypecode;
    private BigInteger identificationqi;
    private BigInteger begindateqi;
    private BigInteger enddateqi;
    private BigInteger issuerqi;
    private Timestamp freshnessdate;
    private Timestamp createdate;
    private Timestamp updatedate;
    private int version;
    private String username;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ECID")
    public int getEcid() {
        return ecid;
    }

    public void setEcid(int ecid) {
        this.ecid = ecid;
    }

    @Basic
    @Column(name = "IDENTIFICATIONTYPECODE")
    public int getIdentificationtypecode() {
        return identificationtypecode;
    }

    public void setIdentificationtypecode(int identificationtypecode) {
        this.identificationtypecode = identificationtypecode;
    }

    @Basic
    @Column(name = "IDENTIFICATION")
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    @Basic
    @Column(name = "BEGINDATE")
    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    @Basic
    @Column(name = "ENDDATE")
    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    @Basic
    @Column(name = "TERRITORYID")
    public Integer getTerritoryid() {
        return territoryid;
    }

    public void setTerritoryid(Integer territoryid) {
        this.territoryid = territoryid;
    }

    @Basic
    @Column(name = "ISSUER")
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    @Basic
    @Column(name = "ISSUERTYPECODE")
    public Integer getIssuertypecode() {
        return issuertypecode;
    }

    public void setIssuertypecode(Integer issuertypecode) {
        this.issuertypecode = issuertypecode;
    }

    @Basic
    @Column(name = "IDENTIFICATIONQI")
    public BigInteger getIdentificationqi() {
        return identificationqi;
    }

    public void setIdentificationqi(BigInteger identificationqi) {
        this.identificationqi = identificationqi;
    }

    @Basic
    @Column(name = "BEGINDATEQI")
    public BigInteger getBegindateqi() {
        return begindateqi;
    }

    public void setBegindateqi(BigInteger begindateqi) {
        this.begindateqi = begindateqi;
    }

    @Basic
    @Column(name = "ENDDATEQI")
    public BigInteger getEnddateqi() {
        return enddateqi;
    }

    public void setEnddateqi(BigInteger enddateqi) {
        this.enddateqi = enddateqi;
    }

    @Basic
    @Column(name = "ISSUERQI")
    public BigInteger getIssuerqi() {
        return issuerqi;
    }

    public void setIssuerqi(BigInteger issuerqi) {
        this.issuerqi = issuerqi;
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
        ComComIdentificationdataEntity that = (ComComIdentificationdataEntity) o;
        return id == that.id &&
                ecid == that.ecid &&
                identificationtypecode == that.identificationtypecode &&
                version == that.version &&
                Objects.equals(identification, that.identification) &&
                Objects.equals(begindate, that.begindate) &&
                Objects.equals(enddate, that.enddate) &&
                Objects.equals(territoryid, that.territoryid) &&
                Objects.equals(issuer, that.issuer) &&
                Objects.equals(issuertypecode, that.issuertypecode) &&
                Objects.equals(identificationqi, that.identificationqi) &&
                Objects.equals(begindateqi, that.begindateqi) &&
                Objects.equals(enddateqi, that.enddateqi) &&
                Objects.equals(issuerqi, that.issuerqi) &&
                Objects.equals(freshnessdate, that.freshnessdate) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(updatedate, that.updatedate) &&
                Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ecid, identificationtypecode, identification, begindate, enddate, territoryid, issuer, issuertypecode, identificationqi, begindateqi, enddateqi, issuerqi, freshnessdate, createdate, updatedate, version, username);
    }
}
