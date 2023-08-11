package com.br.amerex.tfinterface.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "source_system")
public class SourceSystem {

	@Id
	String source_system;
	int feed_active;

	public String getSource_system() {
		return source_system;
	}

	public void setSource_system(String source_system) {
		this.source_system = source_system;
	}

	public int getFeed_active() {
		return feed_active;
	}

	public void setFeed_active(int feed_active) {
		this.feed_active = feed_active;
	}

}
