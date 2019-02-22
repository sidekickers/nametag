package org.sidekickers.nametag.namesource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class GenericNameSource implements NameSource {

	private List<String> source;

	private List<String> product;

	public static GenericNameSource create(String... s) {
		return new GenericNameSource(Arrays.asList(s));
	}

	public GenericNameSource(List<String> s) {
		this.source = s;
		ArrayList<String> productList = new ArrayList<String>(this.source);
		Collections.copy(productList, this.source);
		this.product = productList;
	}

	public List<String> getSource() {
		return Collections.unmodifiableList(source);
	}

	public void setProduct(List<String> product) {
		this.product = product;

	}

	public List<String> getProduct() {
		return this.product;
	}

	@Override
	public String toString() {
		return StringUtils.join(this.product, "");
	}

}
