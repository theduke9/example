package com.example.service;

import com.example.model.Member;
import com.example.repository.MemberRepository;
import com.example.util.EncryptHelper;

public interface MemberService {
    void registMember(Member member);
}
