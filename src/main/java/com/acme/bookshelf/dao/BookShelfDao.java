package com.acme.bookshelf.dao;

import org.jooq.DSLContext;
import org.jooq.Record1;
import org.jooq.Result;
import org.jooq.impl.DSL;

public class BookShelfDao {

	private final DSLContext dslContext;

	public BookShelfDao(final DSLContext dslContext) {
		this.dslContext = dslContext;
	}

	public String findNameById(int id) {
		Result<Record1<Object>> result = this.dslContext.select(DSL.field("name")).from("users")
				.where(DSL.field("id").equal(id)).fetch();

		return (String) result.get(0).getValue(0);
	}

}
