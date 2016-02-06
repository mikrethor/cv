package org.ablx.currency;

import org.ablx.currency.wsdl.binding.ConversionRate;
import org.ablx.currency.wsdl.binding.ConversionRateResponse;
import org.ablx.currency.wsdl.binding.Currency;
import org.ablx.currency.wsdl.binding.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class CurrencyService {
	@Autowired
	private WebServiceTemplate webServiceTemplate;

	public Double getConversionRate(Currency fromCurrency, Currency toCurrency) {
		ConversionRate conversionRate = new ObjectFactory().createConversionRate();
		conversionRate.setFromCurrency(fromCurrency);
		conversionRate.setToCurrency(toCurrency);

		ConversionRateResponse response = (ConversionRateResponse) webServiceTemplate
				.marshalSendAndReceive(conversionRate);

		return response.getConversionRateResult();
	}

}
