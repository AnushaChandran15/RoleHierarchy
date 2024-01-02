package com.anushachandran1502.rolehierarchy.dto;

public class Role {
	private int id;
	private String Name;
	private String reporterName;
	private String role;
	private String reporterRole;
	public Role(String rootRole) {
		role=rootRole;
	}
	
	public Role(String subRoleName, String reporterRoleName) {
		role=subRoleName;
		reporterRole=reporterRoleName;
	}

	public String getReporterRole() {
		return reporterRole;
	}
	public void setReporterRole(String reporterRole) {
		this.reporterRole = reporterRole;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public  String getRole() {
			return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getReporterName() {
		return reporterName;
	}
	public void setReporterName(String reporterName) {
		this.reporterName = reporterName;
	}
	

}
