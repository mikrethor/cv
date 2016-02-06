package org.ablx.currency;

import org.ablx.currency.wsdl.binding.Currency;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CurrencyServiceTest {
	@Test
	public void testCurrencyServvice() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		CurrencyService currencyService = ctx.getBean(CurrencyService.class);

		Currency fromCurrency = Currency.USD;
		Currency toCurrency = Currency.GBP;
		Double conversionRate = currencyService.getConversionRate(fromCurrency, toCurrency);
		Assert.assertNotNull(conversionRate);
		Assert.assertEquals(Double.valueOf(-1.0), conversionRate);
	}
}
