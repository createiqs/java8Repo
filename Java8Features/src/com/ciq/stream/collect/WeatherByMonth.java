package com.ciq.stream.collect;

public class WeatherByMonth {

	private String month;
	private int dayTimeTemperture;
	private int nightTimeTemperature;

	public WeatherByMonth(String month, int dayTimeTemperture, int nightTimeTemperature) {
		this.month = month;
		this.dayTimeTemperture = dayTimeTemperture;
		this.nightTimeTemperature = nightTimeTemperature;
	}

	public String getMonth() {
		return month;
	}

	public int getDayTimeTemperture() {
		return dayTimeTemperture;
	}

	public int getNightTimeTemperature() {
		return nightTimeTemperature;
	}

	@Override
	public String toString() {
		return "WeatherByMonth{" + "month='" + month + '\'' + ", dayTimeTemperature=" + dayTimeTemperture
				+ ", nightTimeTemperature=" + nightTimeTemperature + '}';
	}

}
