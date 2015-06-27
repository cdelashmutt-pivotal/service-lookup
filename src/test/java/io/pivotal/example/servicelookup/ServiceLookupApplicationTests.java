package io.pivotal.example.servicelookup;

import javax.annotation.Resource;

import io.pivotal.example.servicelookup.clients.StoreClient;

import org.apache.catalina.Store;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ServiceLookupApplication.class)
public class ServiceLookupApplicationTests {

	@Resource
	StoreClient storeClient;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void callStoreClient() {
		for( Store store : storeClient.getStores())
		{
			System.out.println(store.toString());
		}
	}

}
