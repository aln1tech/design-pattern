package com.aln1tech.dp.observer.impl;

import com.aln1tech.dp.observer.IObserver;
import com.aln1tech.dp.observerble.IObserverble;

public class WindowDisplay implements IObserver {

	private final int measurmentVal = 20;

	private final IObserverble iObserverble;

	public WindowDisplay(IObserverble iObserverble) {
		super();
		this.iObserverble = iObserverble;
	}

	@Override
	public void update() {
		System.out.println(iObserverble.getCurrentTempAsPerGivenMeasurment(measurmentVal));
	}

}
