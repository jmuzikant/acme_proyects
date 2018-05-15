package com.acme.bookshelf.api;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookShelf {

	private String isbn;
	private String title;
	private String subtitle;
	private String[] authors;
	private Date published;
	private Integer pages;
	private String description;
	private Boolean instock;

	@JsonProperty
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	@JsonProperty
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@JsonProperty
	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	
	@JsonProperty
	public String[] getAuthors() {
		return authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

	@JsonProperty
	public Date getPublished() {
		return published;
	}

	public void setPublished(Date published) {
		this.published = published;
	}

	@JsonProperty
	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	@JsonProperty
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty
	public Boolean getInstock() {
		return instock;
	}

	public void setInstock(Boolean instock) {
		this.instock = instock;
	}
}
