package com.anushachandran1502.rolehierarchy.addsubrole;

import java.sql.SQLException;
import java.util.List;

import com.anushachandran1502.rolehierarchy.dto.Role;
import com.anushachandran1502.rolehierarchy.repository.Repository;

public class AddSubRoleViewModel {
	private AddSubRoleView addSubRole;
	private Repository repo;
	
	public AddSubRoleViewModel(AddSubRoleView addSubRoleView) {
		addSubRole=addSubRoleView;
		repo=Repository.getInstance();
	}
	public void addSubRole(String subRoleName, String reporterRoleName) {
		if(!subRoleName.equals("") && !reporterRoleName.equals(""))
		{
			Role role=new Role(subRoleName,reporterRoleName);
			repo.insertRole(role);
		}
	}
	public List<Role> getDisplayRolesList() throws SQLException {
	List<Role> list=repo.getRolesList();
		 return null;
	}
}
