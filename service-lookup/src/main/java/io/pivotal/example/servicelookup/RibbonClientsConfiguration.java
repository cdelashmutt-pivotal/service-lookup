package io.pivotal.example.servicelookup;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClientConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@RibbonClient(name="stores", configuration=RibbonClientConfiguration.class)
@Profile("dev")
public class RibbonClientsConfiguration {
}
