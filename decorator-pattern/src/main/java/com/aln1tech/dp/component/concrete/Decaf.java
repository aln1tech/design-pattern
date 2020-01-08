package com.aln1tech.dp.component.concrete;

import com.aln1tech.dp.component.Beverage;

public class Decaf extends Beverage {

	@Override
	public String getDescription() {
		return "Decaf";
	}

	@Override
	public int getCost() {
		return 1;
	}

}
