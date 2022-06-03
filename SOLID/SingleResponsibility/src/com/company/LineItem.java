package com.company;

import java.math.BigDecimal;

public class LineItem {
    public float price;
    public float count;

    public float getTaxRate() {
        return 1.99f;
    }
}
