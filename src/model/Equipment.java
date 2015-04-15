package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Equipment {
	@Id
	private Integer id;
	private String name;
	private String brand;
	private String description;
	private Float price;
	private Integer towerId;
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getTowerId() {
		return towerId;
	}
	public void setTowerId(Integer towerId) {
		this.towerId = towerId;
	}
	
	public Equipment(Integer id, String name, String brand, String description,
			Float price, Integer towerId) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.description = description;
		this.price = price;
		this.towerId = towerId;
	}
	
	public Equipment() {
		super();
	}
	
	
}
