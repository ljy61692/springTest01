package com.ljy.springboot.bean;

public class Author {

	private String authorName;
	private String modifiedDate;
	private String remake;

	public Author(String authorName, String modifiedDate, String remake) {
		super();
		this.authorName = authorName;
		this.modifiedDate = modifiedDate;
		this.remake = remake;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getRemake() {
		return remake;
	}

	public void setRemake(String remake) {
		this.remake = remake;
	}

}
