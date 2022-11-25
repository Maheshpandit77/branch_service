package com.jbk.dao;

import com.jbk.entity.Branch;

public interface Branchdao {
	public Branch saveBranch(Branch branch);
	public Branch getBranchById(String branchId);

}
