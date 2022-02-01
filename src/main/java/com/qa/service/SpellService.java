package com.qa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.data.entity.Spell;
import com.qa.data.repository.SpellRepository;
import com.qa.exceptions.SpellNotFoundException;

@Service
public class SpellService {

	private SpellRepository spellRepository;

	@Autowired
	public SpellService(SpellRepository spellRepository) {
		this.spellRepository = spellRepository;
	}

	public List<Spell> getAll() {
		return spellRepository.findAll();
	}

	public Spell getByName(String name) {
		return spellRepository.findById(name).orElseThrow(() -> {
			return new SpellNotFoundException("Spell with name '" + name + "' cannot be found");
		});
	}

	public Spell create(Spell spell) {
		Spell savedUser = spellRepository.save(spell);
		return savedUser;
	}

	public Spell update(String name, Spell spell) {
		if (spellRepository.existsById(name)) {
			Spell spellInDb = spellRepository.getById(name);
			spellInDb.setName(spell.getName());
			spellInDb.setLevel(spell.getLevel());
			spellInDb.setSchool(spell.getSchool());
			return spellRepository.save(spellInDb);
		} else {
			throw new SpellNotFoundException("Spell with name '" + name + "' cannot be found");
		}
	}

	public void delete(String name) {
		if (spellRepository.existsById(name)) {
			spellRepository.deleteById(name);
		} else {
			throw new SpellNotFoundException("Spell with name '" + name + "' cannot be found");
		}
	}

}
