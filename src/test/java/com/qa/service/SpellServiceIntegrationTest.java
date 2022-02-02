package com.qa.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.qa.data.entity.Spell;
import com.qa.data.repository.SpellRepository;

@SpringBootTest
@Transactional
public class SpellServiceIntegrationTest {

	@Autowired
	private SpellService spellService;

	@Autowired
	private SpellRepository spellRepository;

	private List<Spell> spellsInDb;

	@BeforeEach
	public void init() {
		List<Spell> spells = List.of(new Spell("Wish", 9, "Conjuration"), new Spell("Blade Ward", 0, "Abjuration"),
				new Spell("Prismatic Wall", 9, "Abjuration"));
		spellsInDb = new ArrayList<>();
		spellsInDb.addAll(spellRepository.saveAll(spells));
	}

	@Test
	public void getAllSpellsTest() {
		assertThat(spellsInDb).isEqualTo(spellService.getAll());
	}

	@Test
	public void createSpellTest() {
		Spell newSpell = new Spell("Scrying", 5, "Divination");
		Spell expectedSpell = new Spell(newSpell.getName(), newSpell.getLevel(), newSpell.getSchool());

		assertThat(expectedSpell).isEqualTo(spellService.create(newSpell));
	}

	@Test
	public void getSpellByNameTest() {
		Spell expectedSpell = new Spell("Prismatic Wall", 9, "Abjuration");
		String spellName = "Prismatic Wall";

		assertThat(expectedSpell).isEqualTo(spellService.getByName(spellName));
	}

	@Test
	public void getSpellByLevelTest() {
		// TODO
		List<Spell> expectedSpells = List.of(new Spell("Wish", 9, "Conjuration"),
				new Spell("Prismatic Wall", 9, "Abjuration"));
		int spellLevel = 9;

		assertThat(expectedSpells).isEqualTo(spellService.getByLevel(spellLevel));
	}

	@Test
	public void getSpellBySchoolTest() {
		// TODO
		List<Spell> expectedSpells = List.of(new Spell("Blade Ward", 0, "Abjuration"),
				new Spell("Prismatic Wall", 9, "Abjuration"));
		String spellSchool = "Abjuration";

		assertThat(expectedSpells).isEqualTo(spellService.getBySchool(spellSchool));
	}

	@Test
	public void updateSpellTest() {
		// TODO
	}

}
