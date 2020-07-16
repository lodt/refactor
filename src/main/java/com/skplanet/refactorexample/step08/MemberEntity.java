package com.skplanet.refactorexample.step08;

import java.sql.Timestamp;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@SuppressWarnings("unused")
public class MemberEntity {

    private Integer id;
    private String email;
    private String phoneNo;
    private String password;
    private String birthDate;
    private String name;
    private String gender;
    private String certPhoneYn;
    private String membersGrade;
    private Timestamp registDateTime;
    private Timestamp modifyDateTime;
    private Timestamp connectDateTime;

    @Id
    @Column(name = "cmn", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(final Integer cmn) {
        this.id = cmn;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 100)
    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phoneNo", nullable = false, length = 100)
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(final String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 50)
    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "birthDate", nullable = true, length = 100)
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(final String birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "gender", nullable = true, length = 1)
    public String getGender() {
        return gender;
    }

    public void setGender(final String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "certPhoneYN", nullable = true, length = 1)
    public String getCertPhoneYn() {
        return certPhoneYn;
    }

    public void setCertPhoneYn(final String certPhoneYn) {
        this.certPhoneYn = certPhoneYn;
    }

    @Basic
    @Column(name = "membersGrade", nullable = true, length = 2)
    public String getMembersGrade() {
        return membersGrade;
    }

    public void setMembersGrade(final String membersGrade) {
        this.membersGrade = membersGrade;
    }

    @Basic
    @Column(name = "registDateTime", nullable = true)
    public Timestamp getRegistDateTime() {
        return registDateTime;
    }

    public void setRegistDateTime(final Timestamp registDateTime) {
        this.registDateTime = registDateTime;
    }

    @Basic
    @Column(name = "modifyDateTime", nullable = true)
    public Timestamp getModifyDateTime() {
        return modifyDateTime;
    }

    public void setModifyDateTime(final Timestamp modifyDateTime) {
        this.modifyDateTime = modifyDateTime;
    }

    @Basic
    @Column(name = "connectDateTime", nullable = true)
    public Timestamp getConnectDateTime() {
        return connectDateTime;
    }

    public void setConnectDateTime(final Timestamp connectDateTime) {
        this.connectDateTime = connectDateTime;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MemberEntity that = (MemberEntity) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(email, that.email) &&
            Objects.equals(phoneNo, that.phoneNo) &&
            Objects.equals(password, that.password) &&
            Objects.equals(birthDate, that.birthDate) &&
            Objects.equals(name, that.name) &&
            Objects.equals(gender, that.gender) &&
            Objects.equals(certPhoneYn, that.certPhoneYn) &&
            Objects.equals(membersGrade, that.membersGrade) &&
            Objects.equals(registDateTime, that.registDateTime) &&
            Objects.equals(modifyDateTime, that.modifyDateTime) &&
            Objects.equals(connectDateTime, that.connectDateTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, email, phoneNo, password, birthDate, name, gender, certPhoneYn, membersGrade,
                registDateTime, modifyDateTime, connectDateTime);
    }
}
