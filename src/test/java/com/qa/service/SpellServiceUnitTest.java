package com.qa.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.qa.data.entity.Spell;
import com.qa.data.repository.SpellRepository;

@ExtendWith(MockitoExtension.class)
public class SpellServiceUnitTest {

	@Mock
	private SpellRepository spellRepository;

	@InjectMocks
	private SpellService spellService;

	private List<Spell> spells;
	private Spell expectedSpell;

	@BeforeEach
	public void init() {
		spells = List.of(new Spell("Wish", 9, "Conjuration"), new Spell("Blade Ward", 0, "Abjuration"),
				new Spell("Prismatic Wall", 9, "Abjuration"));
		expectedSpell = new Spell("Prismatic Wall", 9, "Abjuration");
	}

	@Test
	public void getAllSpellsTest() {
		when(spellRepository.findAll()).thenReturn(spells);
		assertThat(spellService.getAll()).isEqualTo(spells);
		verify(spellRepository).findAll();
	}

	@Test
	public void getAllSpellsByNameTest() {
		List<Spell> schoolOrder = spells.stream().sorted(Comparator.comparing(Spell::getName))
				.collect(Collectors.toList());

		when(spellRepository.findAll()).thenReturn(spells);
		assertThat(spellService.getAllByName()).isEqualTo(schoolOrder);
		verify(spellRepository).findAll();
	}

	@Test
	public void getAllSpellsByNameLevel() {
		List<Spell> levelOrder = spells.stream().sorted(Comparator.comparing(Spell::getLevel))
				.collect(Collectors.toList());

		when(spellRepository.findAll()).thenReturn(spells);
		assertThat(spellService.getAllByLevel()).isEqualTo(levelOrder);
		verify(spellRepository).findAll();
	}

	@Test
	public void getAllSpellsByNameSchool() {
		List<Spell> schoolOrder = spells.stream().sorted(Comparator.comparing(Spell::getSchool))
				.collect(Collectors.toList());

		when(spellRepository.findAll()).thenReturn(spells);
		assertThat(spellService.getAllBySchool()).isEqualTo(schoolOrder);
		verify(spellRepository).findAll();
	}

	@Test
	public void getByNameTest() {
		String school = expectedSpell.getName();

		when(spellRepository.findById(school)).thenReturn(Optional.of(expectedSpell));
		assertThat(spellService.getByName(school)).isEqualTo(expectedSpell);
		verify(spellRepository).findById(school);
	}

	@Test
	public void getByLevelTest() {
		// TODO
		List<Spell> levelOrder = spells.stream().sorted(Comparator.comparing(Spell::getLevel))
				.collect(Collectors.toList());
		int level = expectedSpell.getLevel();

		when(spellRepository.findSpellByLevel(level)).thenReturn(levelOrder);
		assertThat(spellService.getByLevel(level)).isEqualTo(levelOrder);
		verify(spellRepository).findSpellByLevel(level);
	}

	@Test
	public void getBySchoolTest() {
		// TODO
		List<Spell> schoolOrder = spells.stream().sorted(Comparator.comparing(Spell::getSchool))
				.collect(Collectors.toList());
		String school = expectedSpell.getSchool();

		when(spellRepository.findSpellBySchool(school)).thenReturn(schoolOrder);
		assertThat(spellService.getBySchool(school)).isEqualTo(schoolOrder);
		verify(spellRepository).findSpellBySchool(school);
	}

	@Test
	public void createSpellTest() {
		when(spellRepository.save(expectedSpell)).thenReturn(expectedSpell);
		assertThat(spellService.create(expectedSpell)).isEqualTo(expectedSpell);
		verify(spellRepository).save(expectedSpell);
	}

	@Test
	public void updateSpellTest() {
		String name = expectedSpell.getName();
		Spell updatesToMake = new Spell(expectedSpell.getLevel() + 1, expectedSpell.getSchool());
		Spell updatedSpell = new Spell(expectedSpell.getName(), expectedSpell.getLevel() + 1,
				expectedSpell.getSchool());

		when(spellRepository.existsById(name)).thenReturn(true);
		when(spellRepository.getById(name)).thenReturn(expectedSpell);
		when(spellRepository.save(expectedSpell)).thenReturn(updatedSpell);

		assertThat(spellService.update(name, updatesToMake)).isEqualTo(updatedSpell);

		verify(spellRepository).existsById(name);
		verify(spellRepository).getById(name);
		verify(spellRepository).save(expectedSpell);
	}

	@Test
	public void deleteSpellTest() {
		String name = expectedSpell.getName();
		when(spellRepository.existsById(name)).thenReturn(true);

		spellService.delete(name);

		assertThat(spellRepository.findById(name)).isEqualTo(Optional.empty());

		verify(spellRepository).existsById(name);
		verify(spellRepository).deleteById(name);
	}
}
