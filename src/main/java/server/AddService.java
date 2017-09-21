package server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddService {
	
	protected static final Logger LOG = LoggerFactory.getLogger(AddService.class);
	
	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(12345);
			IAdd add = new AddImpl();
			Naming.bind("//localhost:12345/add", add);
			LOG.debug("Add Service is started!");
		} catch (Exception e) {
			e.printStackTrace();
			LOG.debug("Service error!");
		}
	}
}
