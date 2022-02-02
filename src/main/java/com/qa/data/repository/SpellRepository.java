package com.qa.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.data.entity.Spell;

@Repository
public interface SpellRepository extends JpaRepository<Spell, String> {

//	Optional<Spell> findByLevel(int level);
//
//	Optional<Spell> findBySchool(String school);

	List<Spell> findSpellByLevel(int level);

	List<Spell> findSpellBySchool(String school);
}
