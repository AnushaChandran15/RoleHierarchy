package com.anushachandran1502.rolehierarchy.addrole;

import com.anushachandran1502.rolehierarchy.repository.Repository;

public class AddRoleViewModel {
	AddRoleView view;
	Repository repo;
	
	public AddRoleViewModel(AddRoleView view) {
		this.view=view;
		repo=Repository.getInstance();
		
	}

	public String check(String role) {
		String result="";
		if(!role.equals(role))
		{
			result=repo.insertRole(role);
		}
		return result;
	}
}
