package org.sidekickers.nametag.namesource;

import java.util.List;

public interface NameSource extends Cloneable {

	public List<String> getSource();

	public void setProduct(List<String> product);

	public List<String> getProduct();
}
