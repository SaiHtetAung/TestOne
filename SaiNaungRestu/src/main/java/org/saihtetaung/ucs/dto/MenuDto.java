package org.saihtetaung.ucs.dto;

public class MenuDto {

	private Long id;
	private String name;
	
	
	public MenuDto() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MenuDto(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
