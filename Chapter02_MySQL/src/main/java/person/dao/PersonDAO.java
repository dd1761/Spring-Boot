package person.dao;

import java.util.List;

import person.bean.PersonDTO;

public interface PersonDAO {

	void write(PersonDTO personDTO);

	List<PersonDTO> getPersonList();

}
