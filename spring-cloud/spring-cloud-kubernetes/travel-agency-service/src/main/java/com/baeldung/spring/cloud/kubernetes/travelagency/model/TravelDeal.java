package com.baeldung.spring.cloud.kubernetes.travelagency.model;

import org.springframework.data.annotation.Id;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class TravelDeal {

    @Id
    private BigInteger id;

    private String name;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
