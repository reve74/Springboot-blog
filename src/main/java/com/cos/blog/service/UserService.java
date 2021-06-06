package com.cos.blog.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cos.blog.model.User;
import com.cos.blog.repository.UserRepository;

// 스프링이 컴포넌트 스캔을 통해서 Bean에 등록을 해줌. IOC 해준다
@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public void 회원가입(User user) {
			userRepository.save(user);
	}
}