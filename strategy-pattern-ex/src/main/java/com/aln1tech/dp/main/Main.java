package com.aln1tech.dp.main;

import com.aln1tech.dp.duck.CityDuck;
import com.aln1tech.dp.duck.Duck;
import com.aln1tech.dp.duck.WildDuck;
import com.aln1tech.dp.duck.behaviour.impl.display.GraphicalDisplayImpl;
import com.aln1tech.dp.duck.behaviour.impl.display.SimpleDisplayImpl;
import com.aln1tech.dp.duck.behaviour.impl.fly.JetFlyImpl;
import com.aln1tech.dp.duck.behaviour.impl.fly.SimpleFlyImpl;
import com.aln1tech.dp.duck.behaviour.impl.quack.NoQuack;
import com.aln1tech.dp.duck.behaviour.impl.quack.SimpleQuack;

public class Main {
	public static void main(String[] args) {
		Duck cityDuck = new CityDuck(new NoQuack(), new GraphicalDisplayImpl(), new SimpleFlyImpl());
		cityDuck.fly();
		cityDuck.quack();
		cityDuck.display();
		System.out.println("============================================================================");
		Duck wildDuck = new WildDuck(new SimpleQuack(), new SimpleDisplayImpl(), new JetFlyImpl());
		wildDuck.fly();
		wildDuck.quack();
		wildDuck.display();
	}
}
