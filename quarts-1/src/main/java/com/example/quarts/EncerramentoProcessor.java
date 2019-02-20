package com.example.quarts;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class EncerramentoProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		exchange.getContext();
		System.out.println("olá");
	}

}
