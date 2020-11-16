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
@Table(name = "com_com_naturalperson", schema = "datalake", catalog = "")
public class ComComNaturalpersonEntity {
    private int id;
    private int ecid;
    private String name;
    private String surname;
    private Integer gendercode;
    private Integer personaltitlecode;
    private Integer maritalstatuscode;
    private Integer qualificationlevel1Code;
    private Integer qualificationlevel2Code;
    private Integer qualificationlevel3Code;
    private BigInteger nameqi;
    private BigInteger surnameqi;
    private BigInteger gendercodeqi;
    private BigInteger personaltitlecodeqi;
    private BigInteger maritalstatuscodeqi;
    private BigInteger qualificationqi;
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
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "SURNAME")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "GENDERCODE")
    public Integer getGendercode() {
        return gendercode;
    }

    public void setGendercode(Integer gendercode) {
        this.gendercode = gendercode;
    }

    @Basic
    @Column(name = "PERSONALTITLECODE")
    public Integer getPersonaltitlecode() {
        return personaltitlecode;
    }

    public void setPersonaltitlecode(Integer personaltitlecode) {
        this.personaltitlecode = personaltitlecode;
    }

    @Basic
    @Column(name = "MARITALSTATUSCODE")
    public Integer getMaritalstatuscode() {
        return maritalstatuscode;
    }

    public void setMaritalstatuscode(Integer maritalstatuscode) {
        this.maritalstatuscode = maritalstatuscode;
    }

    @Basic
    @Column(name = "QUALIFICATIONLEVEL1CODE")
    public Integer getQualificationlevel1Code() {
        return qualificationlevel1Code;
    }

    public void setQualificationlevel1Code(Integer qualificationlevel1Code) {
        this.qualificationlevel1Code = qualificationlevel1Code;
    }

    @Basic
    @Column(name = "QUALIFICATIONLEVEL2CODE")
    public Integer getQualificationlevel2Code() {
        return qualificationlevel2Code;
    }

    public void setQualificationlevel2Code(Integer qualificationlevel2Code) {
        this.qualificationlevel2Code = qualificationlevel2Code;
    }

    @Basic
    @Column(name = "QUALIFICATIONLEVEL3CODE")
    public Integer getQualificationlevel3Code() {
        return qualificationlevel3Code;
    }

    public void setQualificationlevel3Code(Integer qualificationlevel3Code) {
        this.qualificationlevel3Code = qualificationlevel3Code;
    }

    @Basic
    @Column(name = "NAMEQI")
    public BigInteger getNameqi() {
        return nameqi;
    }

    public void setNameqi(BigInteger nameqi) {
        this.nameqi = nameqi;
    }

    @Basic
    @Column(name = "SURNAMEQI")
    public BigInteger getSurnameqi() {
        return surnameqi;
    }

    public void setSurnameqi(BigInteger surnameqi) {
        this.surnameqi = surnameqi;
    }

    @Basic
    @Column(name = "GENDERCODEQI")
    public BigInteger getGendercodeqi() {
        return gendercodeqi;
    }

    public void setGendercodeqi(BigInteger gendercodeqi) {
        this.gendercodeqi = gendercodeqi;
    }

    @Basic
    @Column(name = "PERSONALTITLECODEQI")
    public BigInteger getPersonaltitlecodeqi() {
        return personaltitlecodeqi;
    }

    public void setPersonaltitlecodeqi(BigInteger personaltitlecodeqi) {
        this.personaltitlecodeqi = personaltitlecodeqi;
    }

    @Basic
    @Column(name = "MARITALSTATUSCODEQI")
    public BigInteger getMaritalstatuscodeqi() {
        return maritalstatuscodeqi;
    }

    public void setMaritalstatuscodeqi(BigInteger maritalstatuscodeqi) {
        this.maritalstatuscodeqi = maritalstatuscodeqi;
    }

    @Basic
    @Column(name = "QUALIFICATIONQI")
    public BigInteger getQualificationqi() {
        return qualificationqi;
    }

    public void setQualificationqi(BigInteger qualificationqi) {
        this.qualificationqi = qualificationqi;
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
        ComComNaturalpersonEntity that = (ComComNaturalpersonEntity) o;
        return id == that.id &&
                ecid == that.ecid &&
                version == that.version &&
                Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(gendercode, that.gendercode) &&
                Objects.equals(personaltitlecode, that.personaltitlecode) &&
                Objects.equals(maritalstatuscode, that.maritalstatuscode) &&
                Objects.equals(qualificationlevel1Code, that.qualificationlevel1Code) &&
                Objects.equals(qualificationlevel2Code, that.qualificationlevel2Code) &&
                Objects.equals(qualificationlevel3Code, that.qualificationlevel3Code) &&
                Objects.equals(nameqi, that.nameqi) &&
                Objects.equals(surnameqi, that.surnameqi) &&
                Objects.equals(gendercodeqi, that.gendercodeqi) &&
                Objects.equals(personaltitlecodeqi, that.personaltitlecodeqi) &&
                Objects.equals(maritalstatuscodeqi, that.maritalstatuscodeqi) &&
                Objects.equals(qualificationqi, that.qualificationqi) &&
                Objects.equals(freshnessdate, that.freshnessdate) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(updatedate, that.updatedate) &&
                Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ecid, name, surname, gendercode, personaltitlecode, maritalstatuscode, qualificationlevel1Code, qualificationlevel2Code, qualificationlevel3Code, nameqi, surnameqi, gendercodeqi, personaltitlecodeqi, maritalstatuscodeqi, qualificationqi, freshnessdate, createdate, updatedate, version, username);
    }
}
