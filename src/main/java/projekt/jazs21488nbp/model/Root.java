package projekt.jazs21488nbp.model;

import java.util.List;

public class Root{
    public String table;
    public String currency;
    public String code;
    public List<Rate> rates;

    public Root() {
    }

    public void setTable(String table) {
        this.table = table;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }

    public String getTable() {
        return table;
    }

    public String getCurrency() {
        return currency;
    }

    public String getCode() {
        return code;
    }

    public List<Rate> getRates() {
        return rates;
    }
}
