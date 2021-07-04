package com.idfc.dao;

import java.util.List;

import com.idfc.bo.PolicyBo;

public interface PolicyDAO {
	
	
	public abstract int insertDB();
	public abstract List<PolicyBo> selectDB();

}
