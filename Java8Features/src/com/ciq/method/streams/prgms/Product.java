package com.ciq.method.streams.prgms;

public class Product {

	private final String brand;
	private final String name;
	private double price;
	private double rating;

	public Product(String brand, String name, double price, double rating) {
		super();
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.rating = rating;
	}

	public String getBrand() {
		return brand;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return "Product [brand=" + brand + ", name=" + name + ", price=" + price + ", rating=" + rating + "]";
	}

}
