package com.example.service.impl;

import com.example.model.Member;
import com.example.repository.MemberRepository;
import com.example.service.MemberService;
import com.example.util.EncryptHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberRepository memberRepository;

    //    private EncryptHelper encryptHelper;
/*
    public MemberServiceImpl(MemberRepository memberRepository, EncryptHelper encryptHelper) {
        this.memberRepository = memberRepository;
        this.encryptHelper = encryptHelper;
    }
*/

    public void registMember(Member member){
        Member result = memberRepository.save(member);
        System.out.println("result : " + result.getMemberId());
    }

}
