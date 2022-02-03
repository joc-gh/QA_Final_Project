package com.qa.controller.requestObject;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Objects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.qa.data.entity.Spell;

public class SpellRequestTest {

	private SpellRequest spellRequest;

	@BeforeEach
	public void init() {
		Spell spell = new Spell("Prismatic Wall", 9, "Abjuration");
		spellRequest = new SpellRequest();
		spellRequest.setName(spell.getName());
		spellRequest.setLevel(spell.getLevel());
		spellRequest.setSchool(spell.getSchool());
	}

	@Test
	public void hashCodeTest() {
		Object expected = Objects.hash(spellRequest.getName(), spellRequest.getLevel(), spellRequest.getSchool());
		assertThat(spellRequest.hashCode()).isEqualTo(expected);
	}

	@Test
	public void equalsTest() {
		SpellRequest spellRequest2 = new SpellRequest();
		Integer i = 1;
		assertThat(spellRequest.equals(spellRequest)).isEqualTo(true);
		assertThat(spellRequest.equals(spellRequest2)).isEqualTo(false);
		assertThat(spellRequest.equals(null)).isEqualTo(false);
		assertThat(spellRequest.equals(i)).isEqualTo(false);
	}

}
