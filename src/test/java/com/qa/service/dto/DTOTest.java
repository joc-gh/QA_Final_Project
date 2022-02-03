package com.qa.service.dto;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Objects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.qa.data.entity.Spell;

public class DTOTest {

	private SpellDTO spellDTO;

	@BeforeEach
	public void init() {
		Spell spell = new Spell("Prismatic Wall", 9, "Abjuration");
		spellDTO = new SpellDTO(spell);
		spellDTO.setName(spell.getName());
		spellDTO.setSchool(spell.getSchool());
	}

//	@Test
//	public void setNameTest() {
//		Spell spell = new Spell("Wish", 9, "Conjuration");
//		String name = "Test";
//		spell.setName(name);
//		SpellDTO expected = new SpellDTO(spell);
//
//		assertThat(spellDTO.setName(name)).isEqualTo(expected);
//	}

	@Test
	public void hashCodeTest() {
		Object expected = Objects.hash(spellDTO.getName(), spellDTO.getSchool());
		assertThat(spellDTO.hashCode()).isEqualTo(expected);
	}

	@Test
	public void equalsTest() {
		Spell spell2 = new Spell();
		SpellDTO spellDTO2 = new SpellDTO(spell2);
		Integer i = 1;
		assertThat(spellDTO.equals(spellDTO)).isEqualTo(true);
		assertThat(spellDTO.equals(spellDTO2)).isEqualTo(false);
		assertThat(spellDTO.equals(null)).isEqualTo(false);
		assertThat(spellDTO.equals(i)).isEqualTo(false);
	}

}
