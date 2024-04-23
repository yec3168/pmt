package com.solution.pmt.service;

import com.solution.pmt.dto.MemberFormDto;
import com.solution.pmt.entity.Member;
import com.solution.pmt.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;
    
    /* 회원 찾기*/
    public Member findMember(Long id){
        Optional<Member> op =memberRepository.findById(id);
        if(op.isPresent()){
            return op.get();
        }
        else return null;
    }
    /* 회원 저장*/
    public Member save(MemberFormDto memberFormDto){

        return null;
    }
}
