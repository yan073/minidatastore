package geoex;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.geotools.data.Query;
import org.geotools.data.store.ContentDataStore;
import org.geotools.data.store.ContentEntry;
import org.geotools.data.store.ContentFeatureSource;
import org.geotools.feature.NameImpl;
import org.opengis.feature.type.Name;

public class HelloDataStore extends  ContentDataStore{

	@Override
	protected ContentFeatureSource createFeatureSource(ContentEntry entry) throws IOException {
		return new HelloFeatureSource(entry, Query.ALL);
	}

	@Override
	protected List<Name> createTypeNames() throws IOException {
        String name = "Hello World";
        return Collections.singletonList(new NameImpl( name ));
	}

}
