package com.swati.springboot.crudrole.dao;

import com.swati.springboot.crudrole.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
