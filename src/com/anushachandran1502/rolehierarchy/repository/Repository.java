package com.anushachandran1502.rolehierarchy.repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.anushachandran1502.rolehierarchy.dto.Role;
//import java.sql.DriverManager;


public class Repository {
	private static Repository repo=null;
	String url;
	String userName;
	String passWord;
	Connection con;
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
	public void insertRole(Role role) {
		try {
String query = "INSERT INTO  role (roleName,reporter_role) VALUES('"+role.getRole()+"','"+role.getReporterName()+"')";
			Statement s=con.createStatement();
			s.executeUpdate(query);
		} 
		 catch (Exception e) {
			e.printStackTrace();
		}
			}
	public List<Role> getRolesList() throws SQLException {
		
		ArrayList<Role> roles=new ArrayList<Role>();
		Queue<Role> roleQueue = new LinkedList<Role>();
       String query ="SELECT * FROM role WHERE roleName='CEO";
       Statement statement=con.createStatement();
       ResultSet resultSet=statement.executeQuery(query);
       Role role=null;
       if(resultSet.next())
       {
    	   role=new Role(resultSet.getString("roleName"),resultSet.getString("reporter_role"));
       }
       roles.add(role);
       roleQueue.add(role);
       	while(!roleQueue.isEmpty())
       	{
       		Role del=roleQueue.poll();
       		query = "SELECT * FROM table_role WHERE reporting_role = '" + del.getRole() + "'";
       		statement = con.createStatement();
       		resultSet = statement.executeQuery(query);
       		while (resultSet.next()) {
       			String roleName = resultSet.getString("roleName");
       			String reportingRoleName = resultSet.getString("reporter_role");
       			role = new Role(roleName, reportingRoleName);
       			roles.add(role);
       			roleQueue.add(role);
       		}
       	}
		return roles;
	}
}
