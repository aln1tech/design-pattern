package com.aln1tech.dp.duck;

import com.aln1tech.dp.duck.behaviour.IDisplayBehaviour;
import com.aln1tech.dp.duck.behaviour.IFlyBehaviour;
import com.aln1tech.dp.duck.behaviour.IQuackBehaviour;

public class WildDuck extends Duck {

	public WildDuck(IQuackBehaviour iQuack, IDisplayBehaviour iDisplay, IFlyBehaviour iFly) {
		super(iQuack, iDisplay, iFly);
	}

}
