package com.qa.data.comparators;

import java.util.Comparator;

import com.qa.data.entity.Spell;

public class SchoolComparator implements Comparator<Spell> {

	@Override
	public int compare(Spell o1, Spell o2) {
		// TODO Auto-generated method stub
		return o1.getSchool().compareToIgnoreCase(o2.getSchool());
	}

}
