package com.aln1tech.dp.observerble;

import com.aln1tech.dp.observer.IObserver;

public interface IObserverble {
	void add(final IObserver iObserver);

	void remove(final IObserver iObserver);

	void notifier();

	Long getCurrentTempAsPerGivenMeasurment(int measurmentVal);
}
