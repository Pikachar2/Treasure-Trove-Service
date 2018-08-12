package com.shockops.treasuretrove.player.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CAMPAIGN")
public class Campaign {

	@Id
	@Column(name = "CAMPAIGN_ID")
	private Long campaignId;

	@Column(name = "CAMPAIGN_NAME")
	private String campaignName;

	@Column(name = "PLAYER_ID")
	private String playerId;

	@Column(name = "EMAIL")
	private String email;

}
