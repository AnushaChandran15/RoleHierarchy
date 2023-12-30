package com.anushachandran1502.rolehierarchy.addrole;

import java.util.Scanner;

import com.anushachandran1502.rolehierarchy.dto.Employee;

public class AddRoleView {
	Employee emp=null;
	AddRoleViewModel addRole;
	Scanner scanner;
	public AddRoleView()
	{
		addRole=new AddRoleViewModel(this);
		scanner=new Scanner(System.in);
	}
	public void roleCreation() {
		System.out.println("Enter the Role");
		String role=scanner.nextLine();
		System.out.println(addRole.check(role));
	}
}
