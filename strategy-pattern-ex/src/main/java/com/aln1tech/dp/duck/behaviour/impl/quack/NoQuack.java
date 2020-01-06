package com.aln1tech.dp.duck.behaviour.impl.quack;

import com.aln1tech.dp.duck.behaviour.IQuackBehaviour;

public class NoQuack implements IQuackBehaviour {

	public void quack() {
		System.out.println("No Quack");
	}

}
