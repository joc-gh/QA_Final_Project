package com.qa.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.data.entity.Spell;

@Repository
public interface SpellRepository extends JpaRepository<Spell, String> {

}
