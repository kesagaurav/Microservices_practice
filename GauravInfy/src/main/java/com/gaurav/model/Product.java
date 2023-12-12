package com.gaurav.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Product {

	private int pid;
	private String prod_name;
	private String prod_vender;
	private String prodprice;
	private String productInStock;
}
