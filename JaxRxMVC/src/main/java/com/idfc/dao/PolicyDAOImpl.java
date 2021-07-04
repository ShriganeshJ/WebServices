package com.idfc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.idfc.bo.PolicyBo;

public class PolicyDAOImpl implements PolicyDAO {

	private static Connection con;
	private static PreparedStatement ps;
	private static ResultSet rs;
	private static String query = "select * from cancellationdata";
	private static List<PolicyBo> list;

	@Override
	public int insertDB() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<PolicyBo> selectDB() {

		try {

			// get connection using DBCPBasicDataSoucre
			con = DBConnectionUtility.getConnection();
			
			ps=con.prepareStatement(query);
			rs = ps.executeQuery();
			list  = new ArrayList<PolicyBo>();

			while (rs.next()) {
				PolicyBo bo = new PolicyBo();
				System.out.println(rs.getString(1));

				bo.setPolicyNumber(rs.getString(1));
				bo.setEndormsnetNumber(rs.getString(2));
				bo.setDcnNumber(rs.getString(3));
				bo.setPremiumAmount(rs.getDouble(5));
				
				list.add(bo);
				

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
		return list;
	}

}
