package com.jbk.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity

public class Branch {
	@Id
private String branchId;
private String branchName;
private String branchCode;
public Branch() {
	super();
	// TODO Auto-generated constructor stub
}
public Branch(String branchId, String branchName, String branchCode) {
	super();
	this.branchId = branchId;
	this.branchName = branchName;
	this.branchCode = branchCode;
}
public String getBranchId() {
	return branchId;
}
public void setBranchId(String branchId) {
	this.branchId = branchId;
}
public String getBranchName() {
	return branchName;
}
public void setBranchName(String branchName) {
	this.branchName = branchName;
}
public String getBranchCode() {
	return branchCode;
}
public void setBranchCode(String branchCode) {
	this.branchCode = branchCode;
}
@Override
public String toString() {
	return "Branch [branchId=" + branchId + ", branchName=" + branchName + ", branchCode=" + branchCode + "]";
}

}
