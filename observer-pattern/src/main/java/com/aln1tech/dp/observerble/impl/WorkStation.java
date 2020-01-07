package com.aln1tech.dp.observerble.impl;

import java.util.HashSet;
import java.util.Set;

import com.aln1tech.dp.observer.IObserver;
import com.aln1tech.dp.observerble.IObserverble;

public class WorkStation implements IObserverble {

	final Set<IObserver> observers = new HashSet<>();

	public void add(final IObserver iObserver) {
		observers.add(iObserver);
		System.out.println("New Observer Added :" + iObserver.toString());
	}

	public void remove(IObserver iObserver) {
		observers.remove(iObserver);
		System.out.println("Observer Removed :" + iObserver.toString());
	}

	public void notifier() {
		observers.forEach(IObserver::update);
		System.out.println("Notification Sent !!!");
	}

	@Override
	public Long getCurrentTempAsPerGivenMeasurment(int measurmentVal) {
		return (long) (measurmentVal * measurmentVal);
	}

}
