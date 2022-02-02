package com.qa.data.comparators;

import java.util.Comparator;

import com.qa.data.entity.Spell;

public class NameComparator implements Comparator<Spell> {

	@Override
	public int compare(Spell o1, Spell o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareToIgnoreCase(o2.getName());
	}

}
