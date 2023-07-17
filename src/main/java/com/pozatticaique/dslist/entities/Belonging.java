package com.pozatticaique.dslist.entities;

import java.io.Serializable;
import java.util.Objects;

import com.pozatticaique.dslist.entities.PKs.BelongingPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BelongingPK id = new BelongingPK();

	private Integer position;
	
	public Belonging() {
	}
	
	public Belonging (Game game, GameList gameList, Integer position) {
		id.setGame(game);
		id.setList(gameList);
		this.position = position;
	}

	public void setGame(Game game) {
		id.setGame(game);
	}

	public Game getGame() {
		return id.getGame();
	}

	public void setList(GameList list) {
		id.setList(list);
	}

	public GameList getList() {
		return id.getList();
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Belonging other = (Belonging) obj;
		return Objects.equals(id, other.id);
	}
}
