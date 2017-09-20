package geoex;

import org.geotools.data.DataStoreFactorySpi;
import org.geotools.data.DataAccessFactory.Param;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

import org.geotools.data.DataStore;
import org.geotools.util.KVP;

public class HelloDataStoreFactory implements DataStoreFactorySpi{

    public static final Param PARAM1 = new Param("p1", File.class, "p1 hello world", true,
            null, new KVP(Param.EXT, "p1"));
    
	@Override
	public boolean canProcess(Map<String, Serializable> arg0) {
		return true;
	}

	@Override
	public String getDescription() {
		return "minimal data store implementation";
	}

	@Override
	public String getDisplayName() {
		return "Demo data store";
	}

	@Override
	public Param[] getParametersInfo() {
		return new Param[] {PARAM1};
	}

	@Override
	public boolean isAvailable() {
		return true;
	}

	@Override
	public Map<Key, ?> getImplementationHints() {
		return Collections.emptyMap();
	}

	@Override
	public DataStore createDataStore(Map<String, Serializable> arg0) throws IOException {
		return new HelloDataStore();
	}

	@Override
	public DataStore createNewDataStore(Map<String, Serializable> arg0) throws IOException {
		return new HelloDataStore();
	}

}
