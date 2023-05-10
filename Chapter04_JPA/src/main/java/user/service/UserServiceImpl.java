package user.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.bean.UserDTO;
import user.dao.UserDAO;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public void write(UserDTO userDTO) {
		
		userDAO.save(userDTO);
	}

	@Override
	public List<UserDTO> getUserList() {
		
		return userDAO.findAll();
	}

	@Override
	public String isExistId(String id) {
		// findById(id) = select * from usertable where id=#{id}
		Optional<UserDTO> userDTO = userDAO.findById(id); //아이디가 없으면 Optional.empty 출력된다
		System.out.println(userDTO);
		
		if(userDTO.isPresent()) {
			return "exist";
		}
		else {
			return "non_exist";
		}
	}

	@Override
	public List<UserDTO> search(Map<String, String> map) {
		
		String searchOption = map.get("searchOption");
		String keyword = map.get("keyword");
		
		if(searchOption.equals("name")) {
			return userDAO.findByNameContaining(keyword);
		}
		else {
			return userDAO.findByIdContaining(keyword);
		}
		
		
	}

	@Override
	public Optional<UserDTO> getUser(String id) {
		// findById(id) = select * from usertable where id=#{id}
		Optional<UserDTO> userDTO = userDAO.findById(id); //아이디가 없으면 Optional.empty 출력된다
		System.out.println(userDTO);
		
		
		return userDTO;
	}



}
