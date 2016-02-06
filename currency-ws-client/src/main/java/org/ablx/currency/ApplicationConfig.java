package org.ablx.currency;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapVersion;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

@Configuration
@ComponentScan(basePackages = { "org.ablx.currency.wsdl.binding" })
public class ApplicationConfig {
	@Bean
	public static SaajSoapMessageFactory soapMessageFactory() {
		SaajSoapMessageFactory factory = new SaajSoapMessageFactory();
		factory.setSoapVersion(SoapVersion.SOAP_12);
		return factory;

	}

	@Bean
	public static WebServiceTemplate webServiceTemplate(SaajSoapMessageFactory factory) {
		WebServiceTemplate wst = new WebServiceTemplate(factory);
		wst.setDefaultUri("http://www.webservicex.net/CurrencyConvertor.asmx?WSDL");

		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("org.ablx.currency.wsdl.binding");
		wst.setMarshaller(marshaller);
		wst.setUnmarshaller(marshaller);
		return wst;

	}

	@Bean
	public static CurrencyService currencyService() {
		return new CurrencyService();
	}

}
