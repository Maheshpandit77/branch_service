package com.jbk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.Branchdao;
import com.jbk.entity.Branch;
@Service
public class BranchService_impl implements BranchService {
@Autowired
private Branchdao dao;
	@Override
	public Branch saveBranch(Branch branch) {
		
		return dao.saveBranch(branch);
	}

	@Override
	public Branch getBranchById(String branchId) {
		
		return dao.getBranchById(branchId);
	}

}
