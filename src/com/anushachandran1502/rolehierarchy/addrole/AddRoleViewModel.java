package com.anushachandran1502.rolehierarchy.addrole;

import com.anushachandran1502.rolehierarchy.dto.Role;
import com.anushachandran1502.rolehierarchy.repository.Repository;

public class AddRoleViewModel {
	AddRoleView view;
	Repository repo;
	
	public AddRoleViewModel(AddRoleView view) {
		this.view=view;
		repo=Repository.getInstance();
		
	}

	public void check(Role role) {
		String result="";
		if(!role.equals(""))
		{
			repo.insertRole(role);
		}
	}
}
