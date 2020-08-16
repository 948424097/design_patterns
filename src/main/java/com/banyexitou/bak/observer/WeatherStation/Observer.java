package com.banyexitou.bak.observer.WeatherStation;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
