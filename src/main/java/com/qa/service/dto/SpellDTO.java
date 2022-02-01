package com.qa.service.dto;

import java.util.Objects;

public class SpellDTO {

	private String name;
	private int level;
	private String school;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, level, school);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SpellDTO other = (SpellDTO) obj;
		return Objects.equals(name, other.name) && Objects.equals(level, other.level)
				&& Objects.equals(school, other.school);
	}

}
