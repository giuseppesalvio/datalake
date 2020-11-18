package com.fincons.datalake.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "com_meta_territory", schema = "datalake", catalog = "")
public class ComMetaTerritoryEntity {
    private int id;
    private Integer adminlevel;
    private String adminarea1;
    private String adminarea2;
    private String adminarea3;
    private String adminarea4;
    private String adminarea5;
    private String address;
    private String streetname;
    private String streettype;
    private String housenumber;
    private String postalcode;
    private String adminarea1Code;
    private String adminarea2Code;
    private String adminarea3Code;
    private String adminarea4Code;
    private String adminarea5Code;
    private String additionalcode1;
    private String additionalcode2;
    private String additionalcode3;
    private String additionalcode4;
    private String additionalcode5;
    private BigInteger adminareaqi;
    private BigInteger streetqi;
    private BigInteger postalcodeqi;
    private String matchingcode;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private BigDecimal altitude;
    private BigInteger coordinateqi;
    private String coordinatereference;
    private Integer adminarea1Legacyid;
    private Integer adminarea2Legacyid;
    private Integer adminarea3Legacyid;
    private Integer adminarea4Legacyid;
    private Integer adminarea5Legacyid;
    private Integer streetnamelegacyid;
    private Integer streettypelegacyid;
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
    @Column(name = "ADMINLEVEL")
    public Integer getAdminlevel() {
        return adminlevel;
    }

    public void setAdminlevel(Integer adminlevel) {
        this.adminlevel = adminlevel;
    }

    @Basic
    @Column(name = "ADMINAREA1")
    public String getAdminarea1() {
        return adminarea1;
    }

    public void setAdminarea1(String adminarea1) {
        this.adminarea1 = adminarea1;
    }

    @Basic
    @Column(name = "ADMINAREA2")
    public String getAdminarea2() {
        return adminarea2;
    }

    public void setAdminarea2(String adminarea2) {
        this.adminarea2 = adminarea2;
    }

    @Basic
    @Column(name = "ADMINAREA3")
    public String getAdminarea3() {
        return adminarea3;
    }

    public void setAdminarea3(String adminarea3) {
        this.adminarea3 = adminarea3;
    }

    @Basic
    @Column(name = "ADMINAREA4")
    public String getAdminarea4() {
        return adminarea4;
    }

    public void setAdminarea4(String adminarea4) {
        this.adminarea4 = adminarea4;
    }

    @Basic
    @Column(name = "ADMINAREA5")
    public String getAdminarea5() {
        return adminarea5;
    }

    public void setAdminarea5(String adminarea5) {
        this.adminarea5 = adminarea5;
    }

    @Basic
    @Column(name = "ADDRESS")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "STREETNAME")
    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    @Basic
    @Column(name = "STREETTYPE")
    public String getStreettype() {
        return streettype;
    }

    public void setStreettype(String streettype) {
        this.streettype = streettype;
    }

    @Basic
    @Column(name = "HOUSENUMBER")
    public String getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    @Basic
    @Column(name = "POSTALCODE")
    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    @Basic
    @Column(name = "ADMINAREA1CODE")
    public String getAdminarea1Code() {
        return adminarea1Code;
    }

    public void setAdminarea1Code(String adminarea1Code) {
        this.adminarea1Code = adminarea1Code;
    }

    @Basic
    @Column(name = "ADMINAREA2CODE")
    public String getAdminarea2Code() {
        return adminarea2Code;
    }

    public void setAdminarea2Code(String adminarea2Code) {
        this.adminarea2Code = adminarea2Code;
    }

    @Basic
    @Column(name = "ADMINAREA3CODE")
    public String getAdminarea3Code() {
        return adminarea3Code;
    }

    public void setAdminarea3Code(String adminarea3Code) {
        this.adminarea3Code = adminarea3Code;
    }

    @Basic
    @Column(name = "ADMINAREA4CODE")
    public String getAdminarea4Code() {
        return adminarea4Code;
    }

    public void setAdminarea4Code(String adminarea4Code) {
        this.adminarea4Code = adminarea4Code;
    }

    @Basic
    @Column(name = "ADMINAREA5CODE")
    public String getAdminarea5Code() {
        return adminarea5Code;
    }

    public void setAdminarea5Code(String adminarea5Code) {
        this.adminarea5Code = adminarea5Code;
    }

    @Basic
    @Column(name = "ADDITIONALCODE1")
    public String getAdditionalcode1() {
        return additionalcode1;
    }

    public void setAdditionalcode1(String additionalcode1) {
        this.additionalcode1 = additionalcode1;
    }

    @Basic
    @Column(name = "ADDITIONALCODE2")
    public String getAdditionalcode2() {
        return additionalcode2;
    }

    public void setAdditionalcode2(String additionalcode2) {
        this.additionalcode2 = additionalcode2;
    }

    @Basic
    @Column(name = "ADDITIONALCODE3")
    public String getAdditionalcode3() {
        return additionalcode3;
    }

    public void setAdditionalcode3(String additionalcode3) {
        this.additionalcode3 = additionalcode3;
    }

    @Basic
    @Column(name = "ADDITIONALCODE4")
    public String getAdditionalcode4() {
        return additionalcode4;
    }

    public void setAdditionalcode4(String additionalcode4) {
        this.additionalcode4 = additionalcode4;
    }

    @Basic
    @Column(name = "ADDITIONALCODE5")
    public String getAdditionalcode5() {
        return additionalcode5;
    }

    public void setAdditionalcode5(String additionalcode5) {
        this.additionalcode5 = additionalcode5;
    }

    @Basic
    @Column(name = "ADMINAREAQI")
    public BigInteger getAdminareaqi() {
        return adminareaqi;
    }

    public void setAdminareaqi(BigInteger adminareaqi) {
        this.adminareaqi = adminareaqi;
    }

    @Basic
    @Column(name = "STREETQI")
    public BigInteger getStreetqi() {
        return streetqi;
    }

    public void setStreetqi(BigInteger streetqi) {
        this.streetqi = streetqi;
    }

    @Basic
    @Column(name = "POSTALCODEQI")
    public BigInteger getPostalcodeqi() {
        return postalcodeqi;
    }

    public void setPostalcodeqi(BigInteger postalcodeqi) {
        this.postalcodeqi = postalcodeqi;
    }

    @Basic
    @Column(name = "MATCHINGCODE")
    public String getMatchingcode() {
        return matchingcode;
    }

    public void setMatchingcode(String matchingcode) {
        this.matchingcode = matchingcode;
    }

    @Basic
    @Column(name = "LATITUDE")
    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "LONGITUDE")
    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "ALTITUDE")
    public BigDecimal getAltitude() {
        return altitude;
    }

    public void setAltitude(BigDecimal altitude) {
        this.altitude = altitude;
    }

    @Basic
    @Column(name = "COORDINATEQI")
    public BigInteger getCoordinateqi() {
        return coordinateqi;
    }

    public void setCoordinateqi(BigInteger coordinateqi) {
        this.coordinateqi = coordinateqi;
    }

    @Basic
    @Column(name = "COORDINATEREFERENCE")
    public String getCoordinatereference() {
        return coordinatereference;
    }

    public void setCoordinatereference(String coordinatereference) {
        this.coordinatereference = coordinatereference;
    }

    @Basic
    @Column(name = "ADMINAREA1LEGACYID")
    public Integer getAdminarea1Legacyid() {
        return adminarea1Legacyid;
    }

    public void setAdminarea1Legacyid(Integer adminarea1Legacyid) {
        this.adminarea1Legacyid = adminarea1Legacyid;
    }

    @Basic
    @Column(name = "ADMINAREA2LEGACYID")
    public Integer getAdminarea2Legacyid() {
        return adminarea2Legacyid;
    }

    public void setAdminarea2Legacyid(Integer adminarea2Legacyid) {
        this.adminarea2Legacyid = adminarea2Legacyid;
    }

    @Basic
    @Column(name = "ADMINAREA3LEGACYID")
    public Integer getAdminarea3Legacyid() {
        return adminarea3Legacyid;
    }

    public void setAdminarea3Legacyid(Integer adminarea3Legacyid) {
        this.adminarea3Legacyid = adminarea3Legacyid;
    }

    @Basic
    @Column(name = "ADMINAREA4LEGACYID")
    public Integer getAdminarea4Legacyid() {
        return adminarea4Legacyid;
    }

    public void setAdminarea4Legacyid(Integer adminarea4Legacyid) {
        this.adminarea4Legacyid = adminarea4Legacyid;
    }

    @Basic
    @Column(name = "ADMINAREA5LEGACYID")
    public Integer getAdminarea5Legacyid() {
        return adminarea5Legacyid;
    }

    public void setAdminarea5Legacyid(Integer adminarea5Legacyid) {
        this.adminarea5Legacyid = adminarea5Legacyid;
    }

    @Basic
    @Column(name = "STREETNAMELEGACYID")
    public Integer getStreetnamelegacyid() {
        return streetnamelegacyid;
    }

    public void setStreetnamelegacyid(Integer streetnamelegacyid) {
        this.streetnamelegacyid = streetnamelegacyid;
    }

    @Basic
    @Column(name = "STREETTYPELEGACYID")
    public Integer getStreettypelegacyid() {
        return streettypelegacyid;
    }

    public void setStreettypelegacyid(Integer streettypelegacyid) {
        this.streettypelegacyid = streettypelegacyid;
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

        ComMetaTerritoryEntity that = (ComMetaTerritoryEntity) o;

        if (id != that.id) return false;
        if (version != that.version) return false;
        if (adminlevel != null ? !adminlevel.equals(that.adminlevel) : that.adminlevel != null) return false;
        if (adminarea1 != null ? !adminarea1.equals(that.adminarea1) : that.adminarea1 != null) return false;
        if (adminarea2 != null ? !adminarea2.equals(that.adminarea2) : that.adminarea2 != null) return false;
        if (adminarea3 != null ? !adminarea3.equals(that.adminarea3) : that.adminarea3 != null) return false;
        if (adminarea4 != null ? !adminarea4.equals(that.adminarea4) : that.adminarea4 != null) return false;
        if (adminarea5 != null ? !adminarea5.equals(that.adminarea5) : that.adminarea5 != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (streetname != null ? !streetname.equals(that.streetname) : that.streetname != null) return false;
        if (streettype != null ? !streettype.equals(that.streettype) : that.streettype != null) return false;
        if (housenumber != null ? !housenumber.equals(that.housenumber) : that.housenumber != null) return false;
        if (postalcode != null ? !postalcode.equals(that.postalcode) : that.postalcode != null) return false;
        if (adminarea1Code != null ? !adminarea1Code.equals(that.adminarea1Code) : that.adminarea1Code != null)
            return false;
        if (adminarea2Code != null ? !adminarea2Code.equals(that.adminarea2Code) : that.adminarea2Code != null)
            return false;
        if (adminarea3Code != null ? !adminarea3Code.equals(that.adminarea3Code) : that.adminarea3Code != null)
            return false;
        if (adminarea4Code != null ? !adminarea4Code.equals(that.adminarea4Code) : that.adminarea4Code != null)
            return false;
        if (adminarea5Code != null ? !adminarea5Code.equals(that.adminarea5Code) : that.adminarea5Code != null)
            return false;
        if (additionalcode1 != null ? !additionalcode1.equals(that.additionalcode1) : that.additionalcode1 != null)
            return false;
        if (additionalcode2 != null ? !additionalcode2.equals(that.additionalcode2) : that.additionalcode2 != null)
            return false;
        if (additionalcode3 != null ? !additionalcode3.equals(that.additionalcode3) : that.additionalcode3 != null)
            return false;
        if (additionalcode4 != null ? !additionalcode4.equals(that.additionalcode4) : that.additionalcode4 != null)
            return false;
        if (additionalcode5 != null ? !additionalcode5.equals(that.additionalcode5) : that.additionalcode5 != null)
            return false;
        if (adminareaqi != null ? !adminareaqi.equals(that.adminareaqi) : that.adminareaqi != null) return false;
        if (streetqi != null ? !streetqi.equals(that.streetqi) : that.streetqi != null) return false;
        if (postalcodeqi != null ? !postalcodeqi.equals(that.postalcodeqi) : that.postalcodeqi != null) return false;
        if (matchingcode != null ? !matchingcode.equals(that.matchingcode) : that.matchingcode != null) return false;
        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;
        if (altitude != null ? !altitude.equals(that.altitude) : that.altitude != null) return false;
        if (coordinateqi != null ? !coordinateqi.equals(that.coordinateqi) : that.coordinateqi != null) return false;
        if (coordinatereference != null ? !coordinatereference.equals(that.coordinatereference) : that.coordinatereference != null)
            return false;
        if (adminarea1Legacyid != null ? !adminarea1Legacyid.equals(that.adminarea1Legacyid) : that.adminarea1Legacyid != null)
            return false;
        if (adminarea2Legacyid != null ? !adminarea2Legacyid.equals(that.adminarea2Legacyid) : that.adminarea2Legacyid != null)
            return false;
        if (adminarea3Legacyid != null ? !adminarea3Legacyid.equals(that.adminarea3Legacyid) : that.adminarea3Legacyid != null)
            return false;
        if (adminarea4Legacyid != null ? !adminarea4Legacyid.equals(that.adminarea4Legacyid) : that.adminarea4Legacyid != null)
            return false;
        if (adminarea5Legacyid != null ? !adminarea5Legacyid.equals(that.adminarea5Legacyid) : that.adminarea5Legacyid != null)
            return false;
        if (streetnamelegacyid != null ? !streetnamelegacyid.equals(that.streetnamelegacyid) : that.streetnamelegacyid != null)
            return false;
        if (streettypelegacyid != null ? !streettypelegacyid.equals(that.streettypelegacyid) : that.streettypelegacyid != null)
            return false;
        if (createdate != null ? !createdate.equals(that.createdate) : that.createdate != null) return false;
        if (updatedate != null ? !updatedate.equals(that.updatedate) : that.updatedate != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (adminlevel != null ? adminlevel.hashCode() : 0);
        result = 31 * result + (adminarea1 != null ? adminarea1.hashCode() : 0);
        result = 31 * result + (adminarea2 != null ? adminarea2.hashCode() : 0);
        result = 31 * result + (adminarea3 != null ? adminarea3.hashCode() : 0);
        result = 31 * result + (adminarea4 != null ? adminarea4.hashCode() : 0);
        result = 31 * result + (adminarea5 != null ? adminarea5.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (streetname != null ? streetname.hashCode() : 0);
        result = 31 * result + (streettype != null ? streettype.hashCode() : 0);
        result = 31 * result + (housenumber != null ? housenumber.hashCode() : 0);
        result = 31 * result + (postalcode != null ? postalcode.hashCode() : 0);
        result = 31 * result + (adminarea1Code != null ? adminarea1Code.hashCode() : 0);
        result = 31 * result + (adminarea2Code != null ? adminarea2Code.hashCode() : 0);
        result = 31 * result + (adminarea3Code != null ? adminarea3Code.hashCode() : 0);
        result = 31 * result + (adminarea4Code != null ? adminarea4Code.hashCode() : 0);
        result = 31 * result + (adminarea5Code != null ? adminarea5Code.hashCode() : 0);
        result = 31 * result + (additionalcode1 != null ? additionalcode1.hashCode() : 0);
        result = 31 * result + (additionalcode2 != null ? additionalcode2.hashCode() : 0);
        result = 31 * result + (additionalcode3 != null ? additionalcode3.hashCode() : 0);
        result = 31 * result + (additionalcode4 != null ? additionalcode4.hashCode() : 0);
        result = 31 * result + (additionalcode5 != null ? additionalcode5.hashCode() : 0);
        result = 31 * result + (adminareaqi != null ? adminareaqi.hashCode() : 0);
        result = 31 * result + (streetqi != null ? streetqi.hashCode() : 0);
        result = 31 * result + (postalcodeqi != null ? postalcodeqi.hashCode() : 0);
        result = 31 * result + (matchingcode != null ? matchingcode.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (altitude != null ? altitude.hashCode() : 0);
        result = 31 * result + (coordinateqi != null ? coordinateqi.hashCode() : 0);
        result = 31 * result + (coordinatereference != null ? coordinatereference.hashCode() : 0);
        result = 31 * result + (adminarea1Legacyid != null ? adminarea1Legacyid.hashCode() : 0);
        result = 31 * result + (adminarea2Legacyid != null ? adminarea2Legacyid.hashCode() : 0);
        result = 31 * result + (adminarea3Legacyid != null ? adminarea3Legacyid.hashCode() : 0);
        result = 31 * result + (adminarea4Legacyid != null ? adminarea4Legacyid.hashCode() : 0);
        result = 31 * result + (adminarea5Legacyid != null ? adminarea5Legacyid.hashCode() : 0);
        result = 31 * result + (streetnamelegacyid != null ? streetnamelegacyid.hashCode() : 0);
        result = 31 * result + (streettypelegacyid != null ? streettypelegacyid.hashCode() : 0);
        result = 31 * result + (createdate != null ? createdate.hashCode() : 0);
        result = 31 * result + (updatedate != null ? updatedate.hashCode() : 0);
        result = 31 * result + version;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }
}
