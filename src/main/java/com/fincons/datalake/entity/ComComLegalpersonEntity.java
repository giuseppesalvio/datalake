package com.fincons.datalake.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "com_com_legalperson", schema = "datalake", catalog = "")
public class ComComLegalpersonEntity {
    private int id;
    private int ecid;
    private String denomination;
    private Integer legalformcode;
    private Integer organizationtypecode;
    private Integer publicauthoritytypecode;
    private BigInteger denominationqi;
    private BigInteger legalformcodeqi;
    private BigInteger organizationtypecodeqi;
    private BigInteger publicauthoritytypecodeqi;
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
    @Column(name = "DENOMINATION")
    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    @Basic
    @Column(name = "LEGALFORMCODE")
    public Integer getLegalformcode() {
        return legalformcode;
    }

    public void setLegalformcode(Integer legalformcode) {
        this.legalformcode = legalformcode;
    }

    @Basic
    @Column(name = "ORGANIZATIONTYPECODE")
    public Integer getOrganizationtypecode() {
        return organizationtypecode;
    }

    public void setOrganizationtypecode(Integer organizationtypecode) {
        this.organizationtypecode = organizationtypecode;
    }

    @Basic
    @Column(name = "PUBLICAUTHORITYTYPECODE")
    public Integer getPublicauthoritytypecode() {
        return publicauthoritytypecode;
    }

    public void setPublicauthoritytypecode(Integer publicauthoritytypecode) {
        this.publicauthoritytypecode = publicauthoritytypecode;
    }

    @Basic
    @Column(name = "DENOMINATIONQI")
    public BigInteger getDenominationqi() {
        return denominationqi;
    }

    public void setDenominationqi(BigInteger denominationqi) {
        this.denominationqi = denominationqi;
    }

    @Basic
    @Column(name = "LEGALFORMCODEQI")
    public BigInteger getLegalformcodeqi() {
        return legalformcodeqi;
    }

    public void setLegalformcodeqi(BigInteger legalformcodeqi) {
        this.legalformcodeqi = legalformcodeqi;
    }

    @Basic
    @Column(name = "ORGANIZATIONTYPECODEQI")
    public BigInteger getOrganizationtypecodeqi() {
        return organizationtypecodeqi;
    }

    public void setOrganizationtypecodeqi(BigInteger organizationtypecodeqi) {
        this.organizationtypecodeqi = organizationtypecodeqi;
    }

    @Basic
    @Column(name = "PUBLICAUTHORITYTYPECODEQI")
    public BigInteger getPublicauthoritytypecodeqi() {
        return publicauthoritytypecodeqi;
    }

    public void setPublicauthoritytypecodeqi(BigInteger publicauthoritytypecodeqi) {
        this.publicauthoritytypecodeqi = publicauthoritytypecodeqi;
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
        ComComLegalpersonEntity that = (ComComLegalpersonEntity) o;
        return id == that.id &&
                ecid == that.ecid &&
                version == that.version &&
                Objects.equals(denomination, that.denomination) &&
                Objects.equals(legalformcode, that.legalformcode) &&
                Objects.equals(organizationtypecode, that.organizationtypecode) &&
                Objects.equals(publicauthoritytypecode, that.publicauthoritytypecode) &&
                Objects.equals(denominationqi, that.denominationqi) &&
                Objects.equals(legalformcodeqi, that.legalformcodeqi) &&
                Objects.equals(organizationtypecodeqi, that.organizationtypecodeqi) &&
                Objects.equals(publicauthoritytypecodeqi, that.publicauthoritytypecodeqi) &&
                Objects.equals(freshnessdate, that.freshnessdate) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(updatedate, that.updatedate) &&
                Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ecid, denomination, legalformcode, organizationtypecode, publicauthoritytypecode, denominationqi, legalformcodeqi, organizationtypecodeqi, publicauthoritytypecodeqi, freshnessdate, createdate, updatedate, version, username);
    }
}
