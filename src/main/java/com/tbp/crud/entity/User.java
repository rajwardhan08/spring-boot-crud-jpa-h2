package com.tbp.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user")
public class User
{
@Id
@GeneratedValue
@Column(name="id")
private int id;
@Column(name="name")
private String name;
@Column(name="address")
private String address;
	
public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName() 
	{
		return name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ",name=" + name + ",address=" + address + "]";
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	public String getAddress()
	{
		return address;
	}
}
