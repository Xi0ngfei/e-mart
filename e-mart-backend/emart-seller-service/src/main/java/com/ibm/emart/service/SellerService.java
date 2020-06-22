package com.ibm.emart.service;

import com.ibm.emart.entity.eMartSellerEntity;
import java.util.List;
import org.springframework.data.domain.Page;

public interface SellerService {

  public Page<eMartSellerEntity> findAll(int page, int pageSize);

  public List<eMartSellerEntity> findAllUsers();

  public eMartSellerEntity findUserById(Integer id);

  public eMartSellerEntity findUserByUserName(String userName);

  public void delete(Integer id);
}
