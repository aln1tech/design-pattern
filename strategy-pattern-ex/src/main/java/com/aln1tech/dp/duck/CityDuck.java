package com.aln1tech.dp.duck;

import com.aln1tech.dp.duck.behaviour.IDisplayBehaviour;
import com.aln1tech.dp.duck.behaviour.IFlyBehaviour;
import com.aln1tech.dp.duck.behaviour.IQuackBehaviour;

public class CityDuck extends Duck {

	public CityDuck(IQuackBehaviour iQuack, IDisplayBehaviour iDisplay, IFlyBehaviour iFly) {
		super(iQuack, iDisplay, iFly);
	}

}
