package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tower {
	@Id
	private Integer id;
	private String name;
	private Float height;
	private Integer sides;
	private Integer siteId;
	
	
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
	public Float getHeight() {
		return height;
	}
	public void setHeight(Float height) {
		this.height = height;
	}
	public Integer getSides() {
		return sides;
	}
	public void setSides(Integer sides) {
		this.sides = sides;
	}
	public Integer getSiteId() {
		return siteId;
	}
	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}
	
	public Tower(Integer id, String name, Float height, Integer sides,
			Integer siteId) {
		super();
		this.id = id;
		this.name = name;
		this.height = height;
		this.sides = sides;
		this.siteId = siteId;
	}
	
	public Tower() {
		super();
	}
	
}
