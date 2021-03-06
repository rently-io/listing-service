package io.rently.listingservice.configs;

import io.rently.listingservice.interfaces.ListingsRepository;
import org.mockito.Mockito;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@TestConfiguration
public class ListingServiceTestConfigs {

    @Bean
    @Primary
    public ListingsRepository listingsRepository() {
        return Mockito.mock(ListingsRepository.class);
    }
}