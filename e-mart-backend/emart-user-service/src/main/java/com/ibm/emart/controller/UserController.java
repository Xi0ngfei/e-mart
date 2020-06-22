package com.ibm.emart.controller;

import com.ibm.emart.repository.UserRepository;
import com.ibm.emart.entity.eMartUserEntity;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ibm.emart.service.UserService;

/**
 * 
 * ClassName: UserController <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason: TODO ADD REASON(可选). <br/>  
 * date: 2020年5月12日 下午7:33:18 <br/>  
 *  
 * @author
 * @version   
 * @since JDK 1.6
 */
@RestController
@RequestMapping("/api/user")
 @CrossOrigin(origins="http://localhost:4200")
public class UserController {
	@Autowired
	private UserService userService;

	@Autowired
	private UserRepository userRepository;
//	@Autowired
//	private CompanyServiceClient companyServiceClient;
	
	/**
	 * 
	 * @return
	 */
	@GetMapping
	public List<eMartUserEntity> findAllUsers() {
		return userService.findAllUsers();
	}

	@PostMapping("/eMartUser/save")
	public eMartUserEntity save(eMartUserEntity user){
		eMartUserEntity res = userRepository.save(user);
    return res;
	}
	
	@PostMapping
	public ResponseEntity<eMartUserEntity> regist(@RequestBody @Valid eMartUserEntity user, BindingResult bindingResult)
			throws Exception {
		if(bindingResult.hasErrors()){
			throw new Exception();
		}
		
		eMartUserEntity existedUser = userService.findUserByUserName(user.getUserName());
		if(existedUser != null){
			bindingResult.rejectValue("userName", "400001", "the user name is existed.");
			throw new Exception();
		}
		
		eMartUserEntity userEntity = userService.registUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(userEntity);
	}

	@PutMapping
	public ResponseEntity<eMartUserEntity> update(eMartUserEntity user) {
		eMartUserEntity userEntity = userService.updateUser(user);
		return ResponseEntity.ok(userEntity);
	}

//	@GetMapping("/active/{id}")
//	public ResponseEntity<eMartUserEntity> active(@PathVariable Integer id) {
//		eMartUserEntity user = userService.activeUser(id);
//		return ResponseEntity.ok(user);
//	}

	@DeleteMapping("/{id}")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<String> delete(@PathVariable Integer id) {
		userService.delete(id);
		return ResponseEntity.ok("Delete user successfully.");
	}
}
