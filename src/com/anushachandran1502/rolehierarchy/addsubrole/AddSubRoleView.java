package com.anushachandran1502.rolehierarchy.addsubrole;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

//import com.anushachandran1502.rolehierarchy.addrole.AddRoleViewModel;
import com.anushachandran1502.rolehierarchy.dto.Role;

public class AddSubRoleView {
	Role emp=null;
	AddSubRoleViewModel addSubRole;
	Scanner scanner;
	public AddSubRoleView()
	{
		addSubRole=new AddSubRoleViewModel(this);
		scanner=new Scanner(System.in);
	}
	public void subRoleCreate() throws SQLException {
		AddSubRoleView view=new AddSubRoleView();
		boolean terminate=true;
		while(terminate)
		{
			System.out.println("1.Add Sub Role\n2.Display Roles\n3.Delete Role0.Exit");
		int n=scanner.nextInt();
		//scanner.next();
		switch(n)
		{
		case 1:
			view.subRole();
			break;
		case 2:
			view.displayRoles();
			break;
		case 0:
			terminate=false;
			System.out.println("Exit");
			break;
		}
		}
	}
	private void displayRoles() throws SQLException {
		//return addSubRole.getDisplayRolesList();
	}
	private void subRole() {
		String subRoleName="";
		String reporterRoleName="";
			System.out.println("Enter sub role name");
			subRoleName=scanner.nextLine();
			System.out.println("Enter reporting to role name");
			reporterRoleName=scanner.nextLine();
			addSubRole.addSubRole(subRoleName,reporterRoleName);
	}
}
