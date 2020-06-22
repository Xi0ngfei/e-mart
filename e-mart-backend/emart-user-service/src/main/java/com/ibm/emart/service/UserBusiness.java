package com.ibm.emart.service;

import com.ibm.emart.entity.eMartUserEntity;
import com.ibm.emart.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public abstract class UserBusiness implements UserService {

  @Autowired
  private UserRepository userRepository;
  @Autowired
  private RestTemplate restTemplate;

  final String SERVICE_NAME = "cloud-company-service";

  public Page<eMartUserEntity> findAll(int page, int pageSize) {
    // TODO Auto-generated method stub
    return null;
  }

  public Optional<eMartUserEntity> findUserById(Integer id) {
    return userRepository.findById(id);
  }

  public eMartUserEntity findUserByUserName(String userName) {
    return userRepository.findByUserName(userName);
  }

  public List<eMartUserEntity> findAllUsers() {
//    CommonResult<eMartUserEntity> result = restTemplate
//        .getForObject("http://cloud-company-service/api/company/1", CommonResult.class);
//    System.out.println("entity name: " + result.getResultBody().getName());

    return userRepository.findAll();
  }


  public eMartUserEntity registUser(eMartUserEntity user) throws Exception {
    throw new Exception();
//		return userRepository.saveAndFlush(user);
  }


  /**
   * 创建或者更新一个用户
   *
   * @author
   * @since JDK 1.6
   */
  public eMartUserEntity createUser(eMartUserEntity user) {
    return userRepository.save(user);
  }


  public eMartUserEntity updateUser(eMartUserEntity user) {
    return userRepository.save(user);
  }

  public Optional<eMartUserEntity> activeUser(Integer id) {
    int flag = userRepository.activeUser(id);
    return userRepository.findById(id);
  }

//  public void delete(Integer id) {
//    userRepository.delete(id);
//  }
}
