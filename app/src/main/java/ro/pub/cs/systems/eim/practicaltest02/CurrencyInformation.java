package ro.pub.cs.systems.eim.practicaltest02;

public class CurrencyInformation {
    private final String currencyEur;
    private final String currencyUsd;

    public CurrencyInformation(String currencyEur, String currencyUsd) {
        this.currencyEur = currencyEur;
        this.currencyUsd = currencyUsd;
    }

    public String getCurrencyEur() {
        return currencyEur;
    }

    public String getCurrencyUsd() {
        return currencyUsd;
    }

    @Override
    public String toString() {
        return "CurrencyInformation{" + "currencyEur='" + currencyEur + '\'' + ", currencyUsd='" + currencyUsd + '\'' + '}';
    }

}
