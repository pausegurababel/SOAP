package com.example.soapservices;


import com.example.soapservices.client.NumbersClient;
import com.example.soapservices.config.NumbersClientConfig;

import com.example.soapservices.ws.model.NumberToWordsResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = NumbersClientConfig.class, loader = AnnotationConfigContextLoader.class)
public class NumberClientLiveTest {

    @Autowired
    private NumbersClient numberClient;

    @Test
    public void whenSendNumber_thenReceiveWordsResponse() {
        NumbersClient numbersClient = new NumbersClient();
        BigInteger dnum = BigInteger.valueOf(500);
        NumberToWordsResponse response = numbersClient.numberToWords(dnum);

        assertEquals("five hundred", response.getNumberToWordsResult());
    }

}
