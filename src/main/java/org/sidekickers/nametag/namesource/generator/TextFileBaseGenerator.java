package org.sidekickers.nametag.namesource.generator;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.sidekickers.nametag.namesource.GenericNameSource;
import org.sidekickers.nametag.namesource.NameSource;

public class TextFileBaseGenerator implements NameSourceGenerator {

	private static final String ENCODING_UTF8 = "UTF-8";

	private String resourcePath;

	private List<String> resources = null;

	public TextFileBaseGenerator() {

	}

	public TextFileBaseGenerator(String resPath) {
		this.resourcePath = resPath;

	}

	public NameSource generate() {
		if (resources == null) {
			this.fetch();
		}

		String res = resources.get((int) (resources.size() * Math.random()));

		return GenericNameSource.create(res);
	}

	public void fetch() {
		ClassLoader classloader = this.getClass().getClassLoader();

		try {
			resources = IOUtils.readLines(classloader.getResourceAsStream(resourcePath), ENCODING_UTF8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<String> getResources() {
		if (this.resources == null) {
			return null;
		}
		return Collections.unmodifiableList(resources);
	}

	public String getResourcePath() {
		return resourcePath;
	}

	public void setResourcePath(String resourcePath) {
		this.resourcePath = resourcePath;
	}

}
