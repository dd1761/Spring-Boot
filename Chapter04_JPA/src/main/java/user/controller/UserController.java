package user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import user.bean.UserDTO;
import user.service.UserService;

@Controller
@RequestMapping(value="/user") // 슬래시는 빼도 된다.
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value="/writeForm")
	public String writeForm() {
		
		return "/user/writeForm";
	}
	
	@PostMapping(value="/write")
	@ResponseBody
	public void write(@ModelAttribute UserDTO userDTO) {
		
		userService.write(userDTO);
	}
	
	@GetMapping(value="/list")
	public String list() {
		
		return "/user/list";
	}
	
	@PostMapping(value="/getUserList")
	@ResponseBody
	public List<UserDTO> getUserList(){
		//List<UserDTO> list = userService.getUserList();
		//return list;
		
		return userService.getUserList();
	}
	
	@PostMapping(value="/isExistId")
	@ResponseBody
	public String isExistId(@RequestParam String id) {
		
		String result = userService.isExistId(id);
		
		return result;
	}
}
