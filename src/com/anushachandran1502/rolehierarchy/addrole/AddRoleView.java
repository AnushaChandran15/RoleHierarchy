package com.anushachandran1502.rolehierarchy.addrole;

import java.sql.SQLException;
import java.util.Scanner;

import com.anushachandran1502.rolehierarchy.addsubrole.AddSubRoleView;
import com.anushachandran1502.rolehierarchy.dto.Role;

public class AddRoleView {
	
	Role emp=null;
	AddRoleViewModel addRole;
	Scanner scanner;
	public AddRoleView()
	{
		addRole=new AddRoleViewModel(this);
		scanner=new Scanner(System.in);
	}
	public void roleCreation() throws SQLException {
		AddSubRoleView subRole=new AddSubRoleView();
		System.out.println("Enter the Role");
		String rootRole=scanner.nextLine();
		Role role=new Role(rootRole);
		addRole.check(role);
		subRole.subRoleCreate();
	}
}
