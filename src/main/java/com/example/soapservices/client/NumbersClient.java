package com.example.soapservices.client;

import com.example.soapservices.ws.model.NumberToDollars;
import com.example.soapservices.ws.model.NumberToDollarsResponse;
import com.example.soapservices.ws.model.NumberToWords;
import com.example.soapservices.ws.model.NumberToWordsResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumbersClient extends WebServiceGatewaySupport {

    public NumberToDollarsResponse numberToDollars(BigDecimal dnum){

        NumberToDollars request = new NumberToDollars();
        request.setDNum(dnum);

        return (NumberToDollarsResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public NumberToWordsResponse numberToWords(BigInteger dnum){
        NumberToWords request = new NumberToWords();
        request.setUbiNum(dnum);

        return (NumberToWordsResponse) getWebServiceTemplate().marshalSendAndReceive(request);

    }
}
