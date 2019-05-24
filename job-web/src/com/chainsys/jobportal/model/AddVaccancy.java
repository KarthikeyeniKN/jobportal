package com.chainsys.jobportal.model;

public class AddVaccancy {
	private String recruiters_name;
	private String position;
	private String company_name;
	private String location;
	private String skill_required;
	private String vaccancy_position;
	private int vaccancy;
	private String about;
	private String criteria;
	private String perks;
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getCriteria() {
		return criteria;
	}
	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}
	public String getPerks() {
		return perks;
	}
	public void setPerks(String perks) {
		this.perks = perks;
	}
	public String getRecruiters_name() {
		return recruiters_name;
	}
	public void setRecruiters_name(String recruiters_name) {
		this.recruiters_name = recruiters_name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSkill_required() {
		return skill_required;
	}
	public void setSkill_required(String skill_required) {
		this.skill_required = skill_required;
	}
	public String getVaccancy_position() {
		return vaccancy_position;
	}
	public void setVaccancy_position(String vaccancy_position) {
		this.vaccancy_position = vaccancy_position;
	}
	public int getVaccancy() {
		return vaccancy;
	}
	public void setVaccancy(int vaccancy) {
		this.vaccancy = vaccancy;
	}
	@Override
	public String toString() {
		return "AddVaccancy [recruiters_name=" + recruiters_name + ", position=" + position + ", company_name="
				+ company_name + ", location=" + location + ", skill_required=" + skill_required
				+ ", vaccancy_position=" + vaccancy_position + ", vaccancy=" + vaccancy + ", about=" + about
				+ ", criteria=" + criteria + ", perks=" + perks + "]";
	}
	
}