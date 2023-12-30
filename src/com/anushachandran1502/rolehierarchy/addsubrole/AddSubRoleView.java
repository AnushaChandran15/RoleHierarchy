package com.anushachandran1502.rolehierarchy.addsubrole;

import java.util.Scanner;

//import com.anushachandran1502.rolehierarchy.addrole.AddRoleViewModel;
import com.anushachandran1502.rolehierarchy.dto.Employee;

public class AddSubRoleView {
	Employee emp=null;
	AddSubRoleViewModel addRole;
	Scanner scanner;
	public AddSubRoleView()
	{
		addRole=new AddSubRoleViewModel(this);
		scanner=new Scanner(System.in);
	}
	public void subRoleCreate() {
		
	}

}
