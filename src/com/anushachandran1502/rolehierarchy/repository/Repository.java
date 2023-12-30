package com.anushachandran1502.rolehierarchy.repository;

import java.sql.*;

import com.anushachandran1502.rolehierarchy.dto.Employee;
//import java.sql.DriverManager;


public class Repository {
	private static Repository repo=null;
	String url;
	String userName;
	String passWord;
	Connection con;
	Employee employee;
	private Repository()
	{
		 url = "jdbc:mysql://localhost:3306/RoleHierarchy";
		 userName = "root";
		 passWord = "root";
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				 this.con = DriverManager.getConnection(url, userName, passWord);
		 }
		 catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Repository getInstance()
	{
		if(repo==null)
		{
		 repo=new Repository();
		}
		return repo;
	}
	public String insertRole(String role) {
		employee=new Employee();
		employee.setRole(role);
		try {
			String query = "INSERT INTO  role (roleName,active_Stutus) VALUES('"+employee.getRole()+"',"+true+")";
			Statement s=con.createStatement();
			s.executeUpdate(query);
			con.close();
			return "CEO";
		} 
		 catch (Exception e) {
			e.printStackTrace();
		}
return "Role not added";
			}


}
