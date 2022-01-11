package com.rays.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.rays.conn.ConnDemo;

public class AssociatesDaoImpl implements AssociatesDao {

	Connection connection;
	public AssociatesDaoImpl() {
		this.connection = ConnDemo.createConn();
	}
	@Override
	public int addAssociates(Associates associates) {
		int result=0;
		try {
			PreparedStatement ps = connection.prepareStatement("insert into associates values(?,?,?,?,?)");
			ps.setInt(1, associates.getId());
			ps.setString(2, associates.getName());
			ps.setString(3, associates.getEmail());
			ps.setLong(4, associates.getMobile());
			java.sql.Date jd = new java.sql.Date(associates.getJoinDate().getTime());
			ps.setDate(5, jd);
			result = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error in Add Associates...: "+e);
		}
		return result;
	}

	@Override
	public List<Associates> getAllAssociates() {
		List<Associates> aList = new ArrayList<>();
		try {
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("select * from associates");
			while(rs.next()) {
				Associates associates = new Associates();
				associates.setId(rs.getInt(1));
				associates.setName(rs.getString(2));
				associates.setEmail(rs.getString(3));
				associates.setMobile(rs.getLong(4));
				associates.setJoinDate(rs.getDate(5));
				aList.add(associates);
			}
		} catch (Exception e) {
			System.out.println("Error in Get All : "+e);
		}
		return aList;
	}

	@Override
	public Associates getAssociatesById(int id) {
		Associates associates = new Associates();
		try {
			PreparedStatement pst = connection.prepareStatement("select * from associates where id=?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {				
				associates.setId(rs.getInt(1));
				associates.setName(rs.getString(2));
				associates.setEmail(rs.getString(3));
				associates.setMobile(rs.getLong(4));
				associates.setJoinDate(rs.getDate(5));				
			}
		} catch (Exception e) {
			System.out.println("Error in Get By ID : "+e);
		}
		return associates;
	}

	@Override
	public int updateAssociates(Associates associates) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAssociates(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
