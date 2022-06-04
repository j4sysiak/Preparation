package com.company.entity;

import com.company.model.LineItem;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Builder
@Getter
@Setter
public class Invoice {

    public Collection<LineItem> lineItems;
    public String vendor;
    public String vendee;
    public float total;

    public static Invoice create(Collection<LineItem> lineItems, String vendor, String vendee) {
        return Invoice.builder()
                .lineItems(lineItems)
                .vendor(vendor)
                .vendee(vendee)
                .total(calculateTotal(lineItems))
                .build();
    }

    public static float calculateTotal(Collection<LineItem> lineItems) {
        float total = 0;

        float tot = lineItems.stream()
                .map(x -> met(x.price, x.count, x.taxRate))
                ;

        for (var lineItem : lineItems) {
            total += lineItem.price * lineItem.count * (1 + lineItem.getTaxRate());
        }
        return total;
    }

    private static Object met(float price, float count, int taxRate) {
        total += lineItem.price * lineItem.count * (1 + lineItem.getTaxRate());
        return total;
    }
}
