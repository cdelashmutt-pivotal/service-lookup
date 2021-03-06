package io.pivotal.example.servicelookup.clients;

import java.util.List;

import org.apache.catalina.Store;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClientConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("stores")
public interface StoreClient {
	@RequestMapping(method = RequestMethod.GET, value = "/stores")
	List<Store> getStores();

	@RequestMapping(method = RequestMethod.POST, value = "/stores/{storeId}", consumes = "application/json")
	Store update(@PathVariable("storeId") Long storeId, Store store);
}