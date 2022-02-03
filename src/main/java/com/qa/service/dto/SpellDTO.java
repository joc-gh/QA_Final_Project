package com.qa.service.dto;

import java.util.Objects;

import com.qa.data.entity.Spell;

public class SpellDTO {

	private String name;
	private String school;

	public SpellDTO(Spell spell) {
		this.name = spell.getName();
		this.school = spell.getSchool();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, school);
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
		return Objects.equals(name, other.name) && Objects.equals(school, other.school);
	}

}
