package com.example.soapservices.config;

import com.example.soapservices.client.NumbersClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class NumbersClientConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.example.soapservices.ws.model");
        return marshaller;
    }

    @Bean
    public NumbersClient numbersClient(Jaxb2Marshaller marshaller) {
        NumbersClient client = new NumbersClient();
        client.setDefaultUri("https://www.dataaccess.com/webservicesserver/NumberConversion.wso");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
