package com.solution.pmt.service;

import com.solution.pmt.dto.RegisterFormDto;
import com.solution.pmt.entity.Member;
import com.solution.pmt.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService implements UserDetailsService {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private FileService fileService;
    
    /* 회원 찾기*/
    public Member findMember(Long id){
        Optional<Member> op =memberRepository.findById(id);
        if(op.isPresent()){
            return op.get();
        }
        else return null;
    }


    /* 회원 저장*/
    /**
     *  registerFormDto에 있는걸 저장.
     **/
    public Member save(RegisterFormDto registerFormDto, MultipartFile photoFile){
        String photo = null, url = null;
        if(!photoFile.isEmpty()) {
            List<String> response = fileService.uploadFile(photoFile, "/user");
            photo = response.get(0);
            url = response.get(1);
        }
        Member user = Member.builder()
                .name(registerFormDto.getName())
                .phone(registerFormDto.getPhone())
                .address(registerFormDto.getAddress())
                .email(registerFormDto.getEmail())
                .password(passwordEncoder.encode(registerFormDto.getPassword()))
                .photo(photo)
                .url(url)
                .build();
        memberRepository.save(user);
        return user;
    }

    /* 로그인시 작동하는 메소드*/
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
