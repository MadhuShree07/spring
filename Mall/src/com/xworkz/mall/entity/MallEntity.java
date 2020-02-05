package com.xworkz.mall.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
@Table(name = "mall")
public class MallEntity implements Serializable{
	@Id
	@GenericGenerator(name = "madhu", strategy = "increment")
	@GeneratedValue(generator = "madhu")
	@Column(name = "oid")
	private int oid;
	@Column(name = "mallName")
	private String mallName;
	@Column(name = "noOfShopes")
	private int noOfShopes;
	@Column(name = "noOfFloors")
	private int noOfFloors;
	@Column(name = "location")
	private String location;

	public MallEntity(String mallName, int noOfShopes, int noOfFloors, String location) {
		super();
		this.mallName = mallName;
		this.noOfShopes = noOfShopes;
		this.noOfFloors = noOfFloors;
		this.location = location;
	}

}
