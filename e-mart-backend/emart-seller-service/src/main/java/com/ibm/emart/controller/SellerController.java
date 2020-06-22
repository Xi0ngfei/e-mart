package com.ibm.emart.controller;


import com.ibm.emart.repository.SellerRepository;
import com.ibm.emart.entity.eMartSellerEntity;
import com.ibm.emart.service.SellerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: UserController <br/> Function: TODO ADD FUNCTION. <br/> Reason: TODO ADD REASON(可选).
 * <br/> date: 2020年5月12日 下午7:33:18 <br/>
 *
 * @author
 * @since JDK 1.6
 */
@RestController
@RequestMapping("/api/user")
// @CrossOrigin(origins="http://localhost:4200")
public class SellerController {

  @Autowired
  private SellerService sellerService;

  @Autowired
  private SellerRepository sellerRepository;
//	@Autowired
//	private CompanyServiceClient companyServiceClient;

  /**
   *
   */
  @GetMapping
  public List<eMartSellerEntity> findAllUsers() {
    return sellerService.findAllUsers();
  }

  //	@GetMapping("/company/{id}")
//	public CompanyEntity findCompany(Long id){
//		return companyServiceClient.queryCompanyEntityById(id);
//	}
  @PostMapping("/eMartUser/save")
  public eMartSellerEntity save(eMartSellerEntity user) {
    eMartSellerEntity res = sellerRepository.save(user);
    return res;
  }
	
	/*@PostMapping
	public ResponseEntity<UserEntity> regist(@RequestBody @Valid UserModel user, BindingResult bindingResult) {
		if(bindingResult.hasErrors()){
			throw new StockRequestException(StockEXConstants.ERROR_REQUEST_PARAM, bindingResult);
		}
		
		UserEntity existedUser = userService.findUserByUserName(user.getUserName());
		if(existedUser != null){
			bindingResult.rejectValue("userName", "400001", "the user name is existed.");
			throw new StockRequestException(StockEXConstants.ERROR_REQUEST_PARAM, bindingResult);
		}
		
		UserEntity userEntity = userService.registUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(userEntity);
	}

	@PutMapping
	public ResponseEntity<UserEntity> update(UserEntity user) {
		UserEntity userEntity = userService.updateUser(user);
		return ResponseEntity.ok(userEntity);
	}

	@GetMapping("/active/{id}")
	public ResponseEntity<UserEntity> active(@PathVariable Integer id) {
		UserEntity user = userService.activeUser(id);
		return ResponseEntity.ok(user);
	}

	@DeleteMapping("/{id}")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<String> delete(@PathVariable Integer id) {
		userService.delete(id);
		return ResponseEntity.ok("Delete user successfully.");
	}*/
}
