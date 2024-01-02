package com.anushachandran1502.rolehierarchy;

import java.sql.SQLException;
import java.util.Scanner;

import com.anushachandran1502.rolehierarchy.addrole.AddRoleView;
import com.anushachandran1502.rolehierarchy.addsubrole.AddSubRoleView;
public class Home {
	public static void main(String[] args) throws SQLException {
		Home home=new Home();
		AddRoleView addRole=new AddRoleView();
		AddSubRoleView addSub=new AddSubRoleView();
		addSub.subRoleCreate();
//		Scanner scanner=new Scanner(System.in);
//		int choice=0;
//		String role="";
//		boolean terminate=true;
}
	}