package user.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import user.bean.UserDTO;

@Repository
public interface UserDAO extends JpaRepository<UserDTO, String>{
	
	// 쿼리 메소드
	// select * from usertable where name like '%' || ? || '%'
	
	public List<UserDTO> findByNameContaining(String keyword);
	
	// select * from usertable where id like '%' || ? || '%'
	
	public List<UserDTO> findByIdContaining(String keyword);
	
	//------------------------------------------------------
	//어노테이션
	//검색 대상이 테이블이 아니라 영속성 컨텐트에 등록된 엔티티이다.
	//변수 이름은 대소문자를 구분하여 정확하게 지정해야 한다.
	//UserDTO dto = new UserDTO();
	//insert into 테이블 values(?1, ?2, ?3)으로 되어있기에 아래의 
	//?1은 String keyword로 들어가게 된다.
	// 만약 String keyword뿐 아니라 String cc같은 값이 들어왔을 때 ?2번에 들어가게 된다.
	/*
	@Query("select dto from UserDTO dto where dto.name like '%' || ?1 || '%'")
	public List<UserDTO> getUserSearchName(String keyword);

	@Query("select dto from UserDTO dto where dto.id like '%' || ?1 || '%'")
	public List<UserDTO> getUserSearchId(String keyword);
	*/
	
	@Query("select dto from UserDTO dto where dto.name like '%' || :keyword || '%'")
	public List<UserDTO> getUserSearchName(String keyword);

	@Query("select dto from UserDTO dto where dto.id like '%' || :keyword || '%'")
	public List<UserDTO> getUserSearchId(String keyword);
}














