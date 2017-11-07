package algo.trader.first.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import algo.trader.first.domain.Currency;
import algo.trader.first.domain.MarketOrder;
import algo.trader.first.domain.Side;

@RestController
public class CurrencyController {

	@RequestMapping(value="/currencies",method=RequestMethod.GET)
	public List<Currency> getCurrencies(){
		return Arrays.asList(Currency.values());
	}
	
	@RequestMapping(value="/marketorder",method=RequestMethod.GET)
	public MarketOrder getMarketOrder(){
		return new MarketOrder(Currency.USD, 61.5, Side.BUY);
	}
	
}
