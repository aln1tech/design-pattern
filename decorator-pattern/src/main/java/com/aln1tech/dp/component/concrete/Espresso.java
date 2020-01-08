package com.aln1tech.dp.component.concrete;

import com.aln1tech.dp.component.Beverage;

public class Espresso extends Beverage {

	@Override
	public String getDescription() {
		return "Espresso";
	}

	@Override
	public int getCost() {
		return 2;
	}

}
