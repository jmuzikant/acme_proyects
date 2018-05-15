package com.acme.bookshelf;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;

public class BookShelfConfiguration extends Configuration {

	@Valid
    @NotNull
    @JsonProperty("database")
    private DataSourceFactory database = new DataSourceFactory();

    public DataSourceFactory getDataSourceFactory() {
        return database;
    }
    
	@JsonProperty("swagger")
	public SwaggerBundleConfiguration swaggerBundleConfiguration;

	@NotEmpty
	private String dateFormat;

	@JsonProperty
	public String getDateFormat() {
		return dateFormat;
	}

	@JsonProperty
	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}
}
