package edu.remad.ical4jbuilder.models;

import java.util.List;

public interface IRole {

	void setId(long id);

	Long getId();

	void setName(String name);

	String getName();

	List<User> getUsers();

	void setUsers();
}
