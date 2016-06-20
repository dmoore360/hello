package spa;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

/**
 * Created by derek on 5/20/16.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    @JsonProperty("t")
    private String symbol;

    @JsonProperty("l")
    private String price;

    @JsonProperty("elt")
    private String utctime;


    private String volume;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUtctime() {
        return utctime;
    }

    public void setUtctime(String utctime) {
        this.utctime = utctime;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "symbol='" + symbol + '\'' +
                ", price='" + price + '\'' +
                ", utctime='" + utctime + '\'' +
                ", volume='" + volume + '\'' +
                '}';
    }
}
