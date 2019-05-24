package com.chainsys.jobportal.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.chainsys.jobportal.model.AddVaccancy;
import com.chainsys.jobportal.util.ConnectionUtil;

public class AddVaccancyDAO {
	
		public void add(AddVaccancy addVaccancy) throws Exception {
			try {
				java.sql.Connection connection = ConnectionUtil.getConnection();
				String sql = "insert into trn_recruiters(recruiters_id,recruiters_name,position,company_name,location,skill_required,vaccancy_position,vaccancy) values(trn_recruiters_id_seq.NEXTVAL,?,?,?,?,?,?,?)";
				PreparedStatement preparedStatement = connection
						.prepareStatement(sql);
				preparedStatement.setString(1, addVaccancy.getRecruiters_name());
				preparedStatement.setString(2, addVaccancy.getPosition());
				preparedStatement.setString(3, addVaccancy.getCompany_name());
				preparedStatement.setString(4, addVaccancy.getLocation());
				preparedStatement.setString(5, addVaccancy.getSkill_required());
				preparedStatement.setString(6, addVaccancy.getVaccancy_position());
				preparedStatement.setInt(7, addVaccancy.getVaccancy());
				@SuppressWarnings("unused")
				int rows = preparedStatement.executeUpdate();
				ConnectionUtil.close(connection, preparedStatement, null);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new Exception("unable to insert");
			}
		}
		public ArrayList<AddVaccancy> findVaccancyCompany() throws Exception {
			AddVaccancy addVaccancy = null;
			ArrayList<AddVaccancy> vaccancyCompany = new ArrayList<>();
			try {
				java.sql.Connection connection = ConnectionUtil.getConnection();
				String sql1 = "select about,recruiters_name,position,company_name,location ,skill_required,vaccancy_position,vaccancy,criteria,perks from trn_recruiters";
				PreparedStatement preparedStatement = connection
						.prepareStatement(sql1);
				ResultSet resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					addVaccancy = new AddVaccancy();
					addVaccancy.setAbout(resultSet.getString("about"));
					addVaccancy.setCompany_name(resultSet.getString("company_name"));
					addVaccancy.setRecruiters_name(resultSet.getString("recruiters_name"));
					addVaccancy.setPosition(resultSet.getString("position"));
					addVaccancy.setLocation(resultSet.getString("location"));
					addVaccancy.setVaccancy_position(resultSet.getString("vaccancy_position"));
					addVaccancy.setSkill_required(resultSet.getString("skill_required"));
					addVaccancy.setVaccancy(resultSet.getInt("vaccancy"));
					addVaccancy.setCriteria(resultSet.getString("criteria"));
					addVaccancy.setPerks(resultSet.getString("perks"));		
					vaccancyCompany.add(addVaccancy);
					
				}
				ConnectionUtil.close(connection, preparedStatement, resultSet);
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("unable findAll");
			}
			return vaccancyCompany;
		}
		
		public ArrayList<AddVaccancy> viewCompanyInfo(String companyname) throws Exception {
			AddVaccancy viewCompanyInfo = null;
			ArrayList<AddVaccancy> viewCompany = new ArrayList<>();
			try {
				java.sql.Connection connection = ConnectionUtil.getConnection();
				String sql1 = "select about,company_name,location ,skill_required,vaccancy_position,vaccancy,criteria,perks from trn_recruiters where company_name=?";
				
				PreparedStatement preparedStatement = connection
						.prepareStatement(sql1);
				preparedStatement.setString(1, companyname);
				ResultSet resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					viewCompanyInfo = new AddVaccancy();
					viewCompanyInfo.setAbout(resultSet.getString("about"));
					viewCompanyInfo.setCompany_name(resultSet.getString("company_name"));
					viewCompanyInfo.setLocation(resultSet.getString("location"));
				
					viewCompanyInfo.setSkill_required(resultSet.getString("skill_required"));
					viewCompanyInfo.setVaccancy_position(resultSet.getString("vaccancy_position"));
					viewCompanyInfo.setVaccancy(resultSet.getInt("vaccancy"));
					viewCompanyInfo.setCriteria(resultSet.getString("criteria"));
					viewCompanyInfo.setPerks(resultSet.getString("perks"));
					
					viewCompany.add(viewCompanyInfo);
					//System.out.println(viewCompany);
				}
				ConnectionUtil.close(connection, preparedStatement, resultSet);
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("unable findAll");
			}
			return viewCompany;
		}
	
		
}
