package com.aln1tech.dp.main;

import com.aln1tech.dp.component.Beverage;
import com.aln1tech.dp.component.concrete.Decaf;
import com.aln1tech.dp.component.concrete.Espresso;
import com.aln1tech.dp.decerator.addons.Chocolate;
import com.aln1tech.dp.decerator.addons.Cinnamon;
import com.aln1tech.dp.decerator.addons.WhippedCream;

public class Main {
	public static void main(String[] args) {
		Beverage decaf = new Decaf();
		System.out.println(decaf.getDescription() + "  -  " + decaf.getCost());
		
		Beverage espresso = new Espresso();
		System.out.println(espresso.getDescription() + "  -  " + espresso.getCost());
		
		Beverage cinnamon = new Cinnamon(decaf);
		System.out.println(cinnamon.getDescription() + "  -  " + cinnamon.getCost());
		
		Beverage chocolate = new Chocolate(decaf);
		System.out.println(chocolate.getDescription() + "  -  " + chocolate.getCost());
		
		Beverage whippedCream = new WhippedCream(espresso);
		System.out.println(whippedCream.getDescription() + "  -  " + whippedCream.getCost());
	}
}
