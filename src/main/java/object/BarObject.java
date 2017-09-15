package main.java.object;

import org.springframework.stereotype.Service;

@Service
public class BarObject {

    private String bar;

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    @Override
    public String toString() {
        return "BarObject{" +
                "bar='" + bar + '\'' +
                '}';
    }
}
