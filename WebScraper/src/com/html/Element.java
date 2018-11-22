package com.html;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Element.
 *
 * @author WilliamAhmed
 * @since 22 /11/2018
 */
public class Element {

	private String element;
	private ArrayList<Attribute> attributes;


	/**
	 * Instantiates a new Element.
	 *
	 * @param element the element
	 */
	public Element(String element) {
		this.element = element;
	}

	/**
	 * Instantiates a new Element.
	 *
	 * @param element   the element
	 * @param attibutes the attibutes
	 */
	public Element(String element, List attibutes) {
		this.element = element;
		this.attributes.addAll(attibutes);
	}

	/**
	 * Add attribute.
	 *
	 * @param attribute the attribute
	 */
	public void addAttribute(Attribute attribute) {
		if(!hasAttributes()) {
			this.attributes = new ArrayList<>();
		}
		attributes.add(attribute);
	}

	/**
	 * Gets attribute.
	 *
	 * @param attrName the attr name
	 * @return the attribute
	 */
	public Attribute getAttribute(String attrName) {
		Attribute attribute = null;
		if(this.hasAttributes()) {

			for (Attribute attr : this.attributes) {
				if (attr.getName().equals(attrName))
					attribute = attr;
			}

		}
		return attribute;
	}

	/**
	 * Has attributes boolean.
	 *
	 * @return the boolean
	 */
	public boolean hasAttributes() {
		return attributes != null && attributes.size() > 0;
	}
}
