package com.aln1tech.dp.main;

import com.aln1tech.dp.observer.IObserver;
import com.aln1tech.dp.observer.impl.PhoneDisplay;
import com.aln1tech.dp.observer.impl.WindowDisplay;
import com.aln1tech.dp.observerble.IObserverble;
import com.aln1tech.dp.observerble.impl.WorkStation;

public class Main {

	public static void main(String[] args) {
		IObserverble iObserverble = new WorkStation();
		IObserver phoneObserver = new PhoneDisplay(iObserverble);
		IObserver windowObserver = new WindowDisplay(iObserverble);

		iObserverble.add(phoneObserver);
		iObserverble.add(windowObserver);

		iObserverble.notifier();

		iObserverble.remove(phoneObserver);
		iObserverble.remove(windowObserver);

	}
}
