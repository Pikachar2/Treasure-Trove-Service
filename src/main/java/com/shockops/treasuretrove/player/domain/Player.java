package com.shockops.treasuretrove.player.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLAYER")
public class Player {

	@Id
	@Column(name = "PLAYER_ID")
	private Long playerId;

	@Column(name = "PLAYER_NAME")
	private String playerName;

	@Column(name = "PLAYER_PASSWORD")
	private String password;

	@Column(name = "EMAIL")
	private String email;

	public Long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
