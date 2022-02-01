package com.qa.configuration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.qa.data.entity.Spell;
import com.qa.data.repository.SpellRepository;

@Profile("dev")
@Configuration
public class ApplicationStartupListener implements ApplicationListener<ApplicationReadyEvent> {

	private SpellRepository spellRepository;

	@Autowired
	public ApplicationStartupListener(SpellRepository spellRepository) {
		this.spellRepository = spellRepository;
	}

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		spellRepository.saveAll(List.of(new Spell("Dimension Door", 4, "Conjuration"),
				new Spell("Booming Blade", 0, "Evocation"), new Spell("Foresight", 9, "Divination")));
	}

}