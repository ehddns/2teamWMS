package com.cafe2team.domain;

public class Member {
	private String m_Id;
	private String m_Pw;
	private String m_Name;
	private String m_Level;
	private String m_Addr;
	private String m_Email;
	private String m_Phone;
	private String m_Acnt_Status;
	private String m_Incentive;
	public String getM_Id() {
		return m_Id;
	}
	public void setM_Id(String m_Id) {
		this.m_Id = m_Id;
	}
	public String getM_Pw() {
		return m_Pw;
	}
	public void setM_Pw(String m_Pw) {
		this.m_Pw = m_Pw;
	}
	public String getM_Name() {
		return m_Name;
	}
	public void setM_Name(String m_Name) {
		this.m_Name = m_Name;
	}
	public String getM_Level() {
		return m_Level;
	}
	public void setM_Level(String m_Level) {
		this.m_Level = m_Level;
	}
	public String getM_Addr() {
		return m_Addr;
	}
	public void setM_Addr(String m_Addr) {
		this.m_Addr = m_Addr;
	}
	public String getM_Email() {
		return m_Email;
	}
	public void setM_Email(String m_Email) {
		this.m_Email = m_Email;
	}
	public String getM_Phone() {
		return m_Phone;
	}
	public void setM_Phone(String m_Phone) {
		this.m_Phone = m_Phone;
	}
	public String getM_Acnt_Status() {
		return m_Acnt_Status;
	}
	public void setM_Acnt_Status(String m_Acnt_Status) {
		this.m_Acnt_Status = m_Acnt_Status;
	}
	public String getM_Incentive() {
		return m_Incentive;
	}
	public void setM_Incentive(String m_Incentive) {
		this.m_Incentive = m_Incentive;
	}
	@Override
	public String toString() {
		return "Member [m_Id=" + m_Id + ", m_Pw=" + m_Pw + ", m_Name=" + m_Name + ", m_Level=" + m_Level + ", m_Addr="
				+ m_Addr + ", m_Email=" + m_Email + ", m_Phone=" + m_Phone + ", m_Acnt_Status=" + m_Acnt_Status
				+ ", m_Incentive=" + m_Incentive + "]";
	}
	
	
	
}
