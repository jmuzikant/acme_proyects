package com.acme.bookshelf.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.acme.bookshelf.api.BookShelf;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Path("bookshelfs")
@Api("/bookshelfs")
@Produces(MediaType.APPLICATION_JSON)
public class BookShelfResource {

	@GET
	@ApiOperation("Get all bookshelfs")
	public List<BookShelf> allBookShelfs() {
		List<BookShelf> bookshelfs = new ArrayList<BookShelf>();
		BookShelf bookShelf = new BookShelf();
		bookShelf.setIsbn("978-1617291999");
		bookShelf.setTitle("Java 8 in Action");
		bookShelf.setSubtitle("Lambdas, Streams, and functional-style programming");

		bookshelfs.add(bookShelf);
		return bookshelfs;
	}
}
