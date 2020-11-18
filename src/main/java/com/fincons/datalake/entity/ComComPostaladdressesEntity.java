package com.fincons.datalake.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "com_com_postaladdresses", schema = "datalake", catalog = "")
public class ComComPostaladdressesEntity {
    private int id;
    private int ecid;
    private int territoryid;
    private Integer typecode;
    private Integer usagecode;
    private String additionaldata1;
    private String additionaldata2;
    private String additionaldata3;
    private String additionaldata4;
    private String additionaldata5;
    private BigInteger typecodeqi;
    private BigInteger usagecodeqi;
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
    @Column(name = "TERRITORYID")
    public int getTerritoryid() {
        return territoryid;
    }

    public void setTerritoryid(int territoryid) {
        this.territoryid = territoryid;
    }

    @Basic
    @Column(name = "TYPECODE")
    public Integer getTypecode() {
        return typecode;
    }

    public void setTypecode(Integer typecode) {
        this.typecode = typecode;
    }

    @Basic
    @Column(name = "USAGECODE")
    public Integer getUsagecode() {
        return usagecode;
    }

    public void setUsagecode(Integer usagecode) {
        this.usagecode = usagecode;
    }

    @Basic
    @Column(name = "ADDITIONALDATA1")
    public String getAdditionaldata1() {
        return additionaldata1;
    }

    public void setAdditionaldata1(String additionaldata1) {
        this.additionaldata1 = additionaldata1;
    }

    @Basic
    @Column(name = "ADDITIONALDATA2")
    public String getAdditionaldata2() {
        return additionaldata2;
    }

    public void setAdditionaldata2(String additionaldata2) {
        this.additionaldata2 = additionaldata2;
    }

    @Basic
    @Column(name = "ADDITIONALDATA3")
    public String getAdditionaldata3() {
        return additionaldata3;
    }

    public void setAdditionaldata3(String additionaldata3) {
        this.additionaldata3 = additionaldata3;
    }

    @Basic
    @Column(name = "ADDITIONALDATA4")
    public String getAdditionaldata4() {
        return additionaldata4;
    }

    public void setAdditionaldata4(String additionaldata4) {
        this.additionaldata4 = additionaldata4;
    }

    @Basic
    @Column(name = "ADDITIONALDATA5")
    public String getAdditionaldata5() {
        return additionaldata5;
    }

    public void setAdditionaldata5(String additionaldata5) {
        this.additionaldata5 = additionaldata5;
    }

    @Basic
    @Column(name = "TYPECODEQI")
    public BigInteger getTypecodeqi() {
        return typecodeqi;
    }

    public void setTypecodeqi(BigInteger typecodeqi) {
        this.typecodeqi = typecodeqi;
    }

    @Basic
    @Column(name = "USAGECODEQI")
    public BigInteger getUsagecodeqi() {
        return usagecodeqi;
    }

    public void setUsagecodeqi(BigInteger usagecodeqi) {
        this.usagecodeqi = usagecodeqi;
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

        ComComPostaladdressesEntity that = (ComComPostaladdressesEntity) o;

        if (id != that.id) return false;
        if (ecid != that.ecid) return false;
        if (territoryid != that.territoryid) return false;
        if (version != that.version) return false;
        if (typecode != null ? !typecode.equals(that.typecode) : that.typecode != null) return false;
        if (usagecode != null ? !usagecode.equals(that.usagecode) : that.usagecode != null) return false;
        if (additionaldata1 != null ? !additionaldata1.equals(that.additionaldata1) : that.additionaldata1 != null)
            return false;
        if (additionaldata2 != null ? !additionaldata2.equals(that.additionaldata2) : that.additionaldata2 != null)
            return false;
        if (additionaldata3 != null ? !additionaldata3.equals(that.additionaldata3) : that.additionaldata3 != null)
            return false;
        if (additionaldata4 != null ? !additionaldata4.equals(that.additionaldata4) : that.additionaldata4 != null)
            return false;
        if (additionaldata5 != null ? !additionaldata5.equals(that.additionaldata5) : that.additionaldata5 != null)
            return false;
        if (typecodeqi != null ? !typecodeqi.equals(that.typecodeqi) : that.typecodeqi != null) return false;
        if (usagecodeqi != null ? !usagecodeqi.equals(that.usagecodeqi) : that.usagecodeqi != null) return false;
        if (freshnessdate != null ? !freshnessdate.equals(that.freshnessdate) : that.freshnessdate != null)
            return false;
        if (createdate != null ? !createdate.equals(that.createdate) : that.createdate != null) return false;
        if (updatedate != null ? !updatedate.equals(that.updatedate) : that.updatedate != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + ecid;
        result = 31 * result + territoryid;
        result = 31 * result + (typecode != null ? typecode.hashCode() : 0);
        result = 31 * result + (usagecode != null ? usagecode.hashCode() : 0);
        result = 31 * result + (additionaldata1 != null ? additionaldata1.hashCode() : 0);
        result = 31 * result + (additionaldata2 != null ? additionaldata2.hashCode() : 0);
        result = 31 * result + (additionaldata3 != null ? additionaldata3.hashCode() : 0);
        result = 31 * result + (additionaldata4 != null ? additionaldata4.hashCode() : 0);
        result = 31 * result + (additionaldata5 != null ? additionaldata5.hashCode() : 0);
        result = 31 * result + (typecodeqi != null ? typecodeqi.hashCode() : 0);
        result = 31 * result + (usagecodeqi != null ? usagecodeqi.hashCode() : 0);
        result = 31 * result + (freshnessdate != null ? freshnessdate.hashCode() : 0);
        result = 31 * result + (createdate != null ? createdate.hashCode() : 0);
        result = 31 * result + (updatedate != null ? updatedate.hashCode() : 0);
        result = 31 * result + version;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }
}
