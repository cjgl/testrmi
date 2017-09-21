package client;

import java.rmi.Naming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import server.IAdd;

public class AddClient {
	
	protected static final Logger LOG = LoggerFactory.getLogger(AddClient.class);
	
	public static void main(String[] args) {
		try {
			IAdd addRef = (IAdd)Naming.lookup("//localhost:12345/add");
			int sum = addRef.add(20, 30);
			LOG.debug("Result is "+sum);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
