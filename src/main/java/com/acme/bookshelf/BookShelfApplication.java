package com.acme.bookshelf;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;

import com.acme.bookshelf.resources.BookShelfResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;
import io.github.djhworld.dropwizard.jooq.JooqDSLContextFactory;

public class BookShelfApplication extends Application<BookShelfConfiguration> {

	public static void main(final String[] args) throws Exception {
		new BookShelfApplication().run(args);
	}

	@Override
	public String getName() {
		return "BookShelf";
	}
	
	
	@Override
    public void initialize(Bootstrap<BookShelfConfiguration> bootstrap) {
        bootstrap.addBundle(new SwaggerBundle<BookShelfConfiguration>() {
            @Override
            protected SwaggerBundleConfiguration getSwaggerBundleConfiguration(BookShelfConfiguration bookShelfConfiguration) {
                // this would be the preferred way to set up swagger, you can also construct the object here programtically if you want
                return bookShelfConfiguration.swaggerBundleConfiguration;
            }
        });
        
    }
	

	@Override
	public void run(final BookShelfConfiguration configuration, final Environment environment) throws ClassNotFoundException {
		DateFormat bookShelfDateFormat = new SimpleDateFormat(configuration.getDateFormat());
		environment.getObjectMapper().setDateFormat(bookShelfDateFormat);

		BookShelfResource bookShelfResource = new BookShelfResource();
		environment.jersey().register(bookShelfResource);
		
		 final JooqDSLContextFactory dslContextFactory = new JooqDSLContextFactory();
		 DSLContext  dslContext = dslContextFactory.build(environment, configuration.getDataSourceFactory(), SQLDialect.POSTGRES);
//			final UserDAO dao =  new UserDAO(dslContext);

	}

}
