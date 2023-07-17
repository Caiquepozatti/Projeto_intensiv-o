package com.pozatticaique.dslist.DTO;

import com.pozatticaique.dslist.entities.Game;
import com.pozatticaique.dslist.projections.GameProjection;

public class GameMinDTO {
	
	private Long id;
	private String title;	
	private Integer year;
	private String imgUrl;	
	private String shortDescription;
	
	public GameMinDTO() {
	}
	
	public GameMinDTO(Game obj) {
		id = obj.getId();
		title = obj.getTitle();
		year = obj.getYear();
		imgUrl = obj.getImgUrl();
		shortDescription = obj.getShortDescription();
	}
	
	public GameMinDTO(GameProjection obj) {
		id = obj.getId();
		title = obj.getTitle();
		year = obj.getGameYear();
		imgUrl = obj.getImgUrl();
		shortDescription = obj.getShortDescription();
	}

	
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	
}
