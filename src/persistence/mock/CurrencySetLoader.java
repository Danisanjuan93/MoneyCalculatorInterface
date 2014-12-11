package persistence.mock;

import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader implements persistence.CurrencySetLoader {

    @Override
    public CurrencySet load() {
        CurrencySet set = new CurrencySet();
        set.add(new Currency("EUR", "Euro", "€"));
        set.add(new Currency("USD", "Dollar", "$"));
        set.add(new Currency("HKD", "Dollar Hong Kong", "$"));
        return set;
    }

}
