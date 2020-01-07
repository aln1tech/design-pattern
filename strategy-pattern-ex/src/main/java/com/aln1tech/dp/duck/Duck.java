package com.aln1tech.dp.duck;

import com.aln1tech.dp.duck.behaviour.IDisplayBehaviour;
import com.aln1tech.dp.duck.behaviour.IFlyBehaviour;
import com.aln1tech.dp.duck.behaviour.IQuackBehaviour;

public class Duck implements IQuackBehaviour, IFlyBehaviour, IDisplayBehaviour {

	private IQuackBehaviour iQuack;

	private IDisplayBehaviour iDisplay;

	private IFlyBehaviour iFly;

	public Duck(final IQuackBehaviour iQuack, final IDisplayBehaviour iDisplay, final IFlyBehaviour iFly) {
		super();
		this.iQuack = iQuack;
		this.iDisplay = iDisplay;
		this.iFly = iFly;
	}

	public void fly() {
		iFly.fly();
	}

	public void display() {
		iDisplay.display();
	}

	public void quack() {
		this.iQuack.quack();
	}

}
