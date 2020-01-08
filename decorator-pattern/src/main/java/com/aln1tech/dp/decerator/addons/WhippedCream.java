package com.aln1tech.dp.decerator.addons;

import com.aln1tech.dp.component.Beverage;
import com.aln1tech.dp.decerator.AddOnDecerator;

public class WhippedCream extends AddOnDecerator {

	private final Beverage beverage;

	public WhippedCream(final Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whipped Cream";
	}

	@Override
	public int getCost() {
		return beverage.getCost() + 20;
	}

}
