package com.example.quarts;

import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ResourceTest extends RouteBuilder {
	
	@Autowired
	private EncerramentoProcessor encerramentoProcessor;

	@Override
	public void configure() throws Exception {
		
		 from("quartz2://encerramento/diario?cron=0+0/1+7-19+*+*+?")
         .process(encerramentoProcessor);
	}

}
