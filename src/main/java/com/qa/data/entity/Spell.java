package com.qa.data.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "spell")
public class Spell {

	@Id
	@Length(min = 1, message = "Names cannot be empty")
	private String name;

	@Max(9)
	@Min(0)
	private Integer level;

	@NotNull
	@Length(min = 1, message = "School of magic cannot be empty")
	private String school;

	public Spell() {
		super();
	}

	public Spell(@Max(9) @Min(0) Integer level,
			@NotNull @Length(min = 1, message = "School of magic cannot be empty") String school) {
		super();
		this.level = level;
		this.school = school;
	}

	public Spell(@NotNull @Length(min = 1, message = "Names cannot be empty") String name,
			@Max(9) @Min(0) Integer level,
			@NotNull @Length(min = 1, message = "School of magic cannot be empty") String school) {
		super();
		this.name = name;
		this.level = level;
		this.school = school;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Spell: " + name + ", lv: " + level + ", School: " + school;
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
		Spell other = (Spell) obj;
		return Objects.equals(name, other.name) && Objects.equals(level, other.level)
				&& Objects.equals(school, other.school);
	}

}
