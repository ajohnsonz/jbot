package me.ramswaroop.jbot.core.slack.models.rtm;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by ajohnsonz on 25/10/2017
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RtmConnectResponse {

	private Boolean ok;
	private String error;
	private String url;
	private Team team;
	private Self self;
	
	
}
