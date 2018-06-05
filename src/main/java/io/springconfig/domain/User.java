package io.springconfig.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="skills")
	private String[] skills;
	@Column(name="percentage")
	private double percentage;
	private String formatPerc;
	
	public User() {}

	public User(int id, String name, String[] skills, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.skills = skills;
		this.percentage = percentage;
	}
	
	public User(String name, String[] skills) {
		super();
		this.name = name;
		this.skills = skills;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	
	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getFormatPerc() {
		formatPerc = String.valueOf(percentage);
		
		if(formatPerc.startsWith("1"))
			formatPerc = "100";
		if(formatPerc.startsWith("0"))
			formatPerc = formatPerc.substring(2);
		
		if(formatPerc.length() == 1)
			formatPerc += "0";
		if(formatPerc.startsWith("0"))
			formatPerc = formatPerc.substring(1);
		
		return formatPerc;
	}

	public void setFormatPerc(String formatPerc) {
		this.formatPerc = formatPerc;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", skills=" + skills + ", percentage=" + percentage + "]";
	}
}
