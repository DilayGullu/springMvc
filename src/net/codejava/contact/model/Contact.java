package net.codejava.contact.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Contact {

	private Integer id;
	private String name;
	private String surname;
	private String tc;
	private String address;
	private String phone;
	private String email;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;
	private String iscommers;
	private String ischoice;
	private String county;
	private Float amount;
	private String notes;
	
	
	
	public Contact() {
		
	}
	

	public Contact(Integer id, String name, String surname, String tc, String address,String phone, String email,Date date, String iscommers, String ischoice, String county, Float amount, String notes) {
		this(name, surname, tc, address, phone, email, date, iscommers, ischoice, county, amount, notes);
		this.id = id;
	}
	
	public Contact( String name, String surname, String tc, String address,String phone, String email, Date date, String iscommers, String ischoice, String county, Float amount, String notes) {
		this.name = name;
		this.surname = surname;
		this.tc = tc;
		this.address= address;
		this.phone = phone;
		this.email = email;
		this.date = date;
		this.iscommers = iscommers;
		this.ischoice = ischoice;
		this.county = county;
		this.amount = amount;
		this.notes = notes;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getIscommers() {
		return iscommers;
	}

	public void setIscommers(String iscommers) {
		this.iscommers = iscommers;
	}

	public String getIschoice() {
		return ischoice;
	}

	public void setIschoice(String ischoice) {
		this.ischoice = ischoice;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", surname=" + surname + ", tc=" + tc + ", address=" + address
				+ ", phone=" + phone + ", email=" + email + ", date=" + date + ", iscommers=" + iscommers
				+ ", ischoice=" + ischoice + ", county=" + county + ", amount=" + amount + ", notes=" + notes + "]";
	}

	


}
