package geoex;

import java.io.IOException;

import org.geotools.data.FeatureReader;
import org.geotools.data.Query;
import org.geotools.data.store.ContentEntry;
import org.geotools.data.store.ContentFeatureSource;
import org.geotools.geometry.jts.ReferencedEnvelope;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;

public class HelloFeatureSource extends ContentFeatureSource {

	public HelloFeatureSource(ContentEntry entry, Query query) {
		super(entry, query);
	}

	@Override
	protected SimpleFeatureType buildFeatureType() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected ReferencedEnvelope getBoundsInternal(Query arg0) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected int getCountInternal(Query arg0) throws IOException {
		return 0;
	}

	@Override
	protected FeatureReader<SimpleFeatureType, SimpleFeature> getReaderInternal(Query arg0) throws IOException {
		return null;
	}

}
