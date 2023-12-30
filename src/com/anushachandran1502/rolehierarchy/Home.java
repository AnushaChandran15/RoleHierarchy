package com.anushachandran1502.rolehierarchy;

import java.util.Scanner;

import com.anushachandran1502.rolehierarchy.addrole.AddRoleView;
import com.anushachandran1502.rolehierarchy.addsubrole.AddSubRoleView;
//import com.anushachandran1502.rolehierarchy.ui.view.View;

public class Home {
	public static void main(String[] args) {
		Home home=new Home();
		AddRoleView addRole=new AddRoleView();
		AddSubRoleView addSub=new AddSubRoleView();
		Scanner scanner=new Scanner(System.in);
		int choice=0;
		String role="";
		boolean terminate=true;
		do
		{
		System.out.println("1.Add Root Role\n2.Add sub role -1.Exit");
		choice=scanner.nextInt();
		switch(choice)
		{
		case 1:
			addRole.roleCreation();
			break;
		case 2:
			addSub.subRoleCreate();
			break;
		case -1:
			terminate=false;
			System.out.println("Exit....");
		default:
			System.out.println("wrong");
		}
		}
		while(terminate);
		
	}
}
//package com.anushachandran1502.rolehierarchy.ui.viewmodel;
//
//import com.anushachandran1502.rolehierarchy.dto.Employee;
//import com.anushachandran1502.rolehierarchy.repository.Repository;
//import com.anushachandran1502.rolehierarchy.ui.view.View;
//
//public class ViewModel {
//	private View view;
//	Repository repo=null;
//	Employee emp;
//
//	public ViewModel(View view) {
//		this.view=view;
//		repo=Repository.getInstance();
//	}
//
//	public String check(String string) {
//		emp=new Employee();
//		if(!string.equals(""))
//		{
//			//emp.setRole(string);
//			repo.insertRole(string);
//			//return emp.getRole();
//		}
//		//String result=
//		return null;
//	}
//
//}
//package com.anushachandran1502.rolehierarchy.ui.view;
//
//import java.util.Scanner;
//
//import com.anushachandran1502.rolehierarchy.dto.Employee;
//import com.anushachandran1502.rolehierarchy.ui.viewmodel.ViewModel;
//
//public class View {
//	private ViewModel viewModel;
//	private Employee emp;
//	Scanner scanner;
//	public View()
//	{
//		viewModel=new ViewModel(this);
//		//emp=new Employee();
//		scanner=new Scanner(System.in);
//	}
//	
//	public void roleCreation() {
//		emp=new Employee();
//		System.out.println("Enter the Role");
//		String role=scanner.nextLine();
//		viewModel.check(role);
//		//System.out.println(viewModel.roleCreation(emp.getRole());
//	}
//
//	public void subRoleCreate() {
//		// TODO Auto-generated method stub
//		System.out.println("Enter the Number of add sub role");
//		int n=scanner.nextInt();
//		String subRoleName="";
//		String reporterRoleName="";
//		for(int i=0;i<n;i++)
//		{
//			System.out.println("Enter sub role name");
//			subRoleName=scanner.nextLine();
//			System.out.println("Enter reporting to role name");
//			reporterRoleName=scanner.nextLine();
//		}
//		
//		
//	}
//
//}
////
