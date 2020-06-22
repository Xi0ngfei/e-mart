package com.ibm.emart.service;

import com.ibm.emart.entity.eMartUserEntity;
import java.util.List;

import java.util.Optional;
import org.springframework.data.domain.Page;

public interface UserService {

	public Page<eMartUserEntity> findAll(int page, int pageSize);
	
	public List<eMartUserEntity> findAllUsers();
	
	public Optional<eMartUserEntity> findUserById(Integer id);
	
	public eMartUserEntity findUserByUserName(String userName);
	
	public eMartUserEntity registUser(eMartUserEntity user) throws Exception;


	public eMartUserEntity updateUser(eMartUserEntity user);
	
	public Optional<eMartUserEntity> activeUser(Integer id);
	
	public void delete(Integer id);
	
}
