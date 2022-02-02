package com.qa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.qa.data.entity.Spell;
import com.qa.data.repository.SpellRepository;
import com.qa.service.SpellService;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpellService spellService;
		SpellRepository spellRepository;
		List<Spell> spellsInDb;
		List<Spell> spells = List.of(new Spell("Wish", 9, "Conjuration"), new Spell("Blade Ward", 0, "Abjuration"),
				new Spell("Prismatic Wall", 9, "Abjuration"));
		spellsInDb = new ArrayList<>();
		spellsInDb.addAll(spells);
//		List<Spell> nameOrder = spells.stream().sorted().collect(Collectors.toList());

		System.out.println(spellsInDb);
//		System.out.println(nameOrder);
//		nameOrder.forEach(System.out::println);
		List<Spell> spell = spells.stream().sorted(Comparator.comparing(Spell::getName)).collect(Collectors.toList());
//		Collections.sort(spells, spells.hashCode());;
		System.out.println(spells.hashCode());

//		Collections.sort(spells);
//		System.out.println(spells);
		spells.stream().sorted(Comparator.comparing(Spell::getName)).forEach(System.out::println);
		System.out.println(spell);
	}

}
