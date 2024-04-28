package edu.remad.ical4jbuilder.models;

import java.time.LocalDateTime;
import java.util.List;

public interface User {

	Long getId();

	void setId(Long id);

	String getUsername();

	void setUsername(String username);

	String getEmail();

	void setEmail(String email);

	String getPassword();

	void setPassword(String password);

	public Boolean getEnabled();

	void setEnabled(Boolean enabled);

	List<IRole> getRoles();

	void setRoles(List<IRole> roles);

	String getFirstName();

	void setFirstName(String firstName);

	String getLastName();

	void setLastName(String lastName);

	String getGender();

	void setGender(String gender);

	String getCellPhone();

	void setCellPhone(String cellPhone);

	List<Address> getAddresses();

	void setAddresses(List<Address> addresses);

	LocalDateTime getCreationDate();

	void setCreationDate(LocalDateTime creationDate);

	int hashCode();

	boolean equals(Object obj);

	String toString();
}
