package com.example.model;


import com.example.configuration.ApplicationContextHolder;
import com.example.util.BCryptImpl;
import com.example.util.EncryptHelper;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "member")
//@Data
public class Member implements Serializable {

//    @Autowired
//    static EncryptHelper encryptHelper;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_sn", nullable = false)
    private Long memberSn;

    @Column(name = "member_id")
    private String memberId;

    @Column(name = "member_pw")
    @Convert(converter = MemberPwConverter.class)
    private String memberPw;
    public static class MemberPwConverter implements AttributeConverter<String, String> {

        @Override
        public String convertToDatabaseColumn(String attribute) {
            if ((attribute != null) && !attribute.isEmpty()) {
                //encryptHelper.class.encrypt(attribute);
                return ApplicationContextHolder.getBean(EncryptHelper.class).encrypt(attribute);
            }
            return attribute;
        }

        @Override
        public String convertToEntityAttribute(String dbData) {
            if ((dbData != null) && !dbData.isEmpty()) {
//                encryptHelper.isMatch(dbData, "");
                return ApplicationContextHolder.getBean(EncryptHelper.class).isMatch(dbData, "").toString();
            }
            return "";
        }
    }

    @Column(name = "member_nm")
    private String memberNm;

    @Column(name = "member_birth")
    private String memberBirth;

    @Column(name = "created_dt")
    private Date createdDt;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_dt")
    private Date updatedDt;

    @Column(name = "updated_by")
    private String updatedBy;


    public Long getMemberSn() {
        return memberSn;
    }

    public void setMemberSn(Long memberSn) {
        this.memberSn = memberSn;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberPw() {
        return memberPw;
    }

    public void setMemberPw(String memberPw) {
        this.memberPw = memberPw;
    }

    public String getMemberNm() {
        return memberNm;
    }

    public void setMemberNm(String memberNm) {
        this.memberNm = memberNm;
    }

    public String getMemberBirth() {
        return memberBirth;
    }

    public void setMemberBirth(String memberBirth) {
        this.memberBirth = memberBirth;
    }

    public Date getCreatedDt() {
        return createdDt;
    }

    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedDt() {
        return updatedDt;
    }

    public void setUpdatedDt(Date updatedDt) {
        this.updatedDt = updatedDt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
