package com.html;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author WilliamAhmed
 * @since 22/11/2018
 */
public class Attribute {

	private String name;
	private ArrayList<String> values;

	public Attribute(String name) {
		this.name = name;
	}

	public Attribute(String name, String... values) {
		this.name = name;
		this.values.addAll(Arrays.asList(values));
	}

	public String getName() {
		return this.name;
	}

	public void addValue(String value) {
		this.values.add(value);
	}

	public void addValues(String... values) {
		this.values.addAll(Arrays.asList(values));
	}

	public ArrayList<String> getValues() {
		return this.values;
	}

	@Override
	public String toString() {
		return "Attribute{" +
				"name='" + name + '\'' +
				", values=" + values +
				'}';
	}
}
