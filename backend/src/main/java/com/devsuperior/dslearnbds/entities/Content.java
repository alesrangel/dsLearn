package com.devsuperior.dslearnbds.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_content")
public class Content extends Lesson{
	private static final long serialVersionUID = 1L;

	private String textContet;
	private String videoUri;
	
	public Content() {}

	public Content(Long id, String title, Integer position, Section section, String textContet, String videoUri) {
		super(id, title, position, section);
		this.textContet = textContet;
		this.videoUri = videoUri;
	}

	public String getTextContet() {
		return textContet;
	}

	public void setTextContet(String textContet) {
		this.textContet = textContet;
	}

	public String getVideoUri() {
		return videoUri;
	}

	public void setVideoUri(String videoUri) {
		this.videoUri = videoUri;
	}
	
}
