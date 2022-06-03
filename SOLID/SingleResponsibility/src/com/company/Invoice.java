package com.company;

import java.util.Collection;

public class Invoice {

    public Collection<LineItem> lineItems;
    public String Vendor;
    public String Vendee;
    public String Total;

    public Invoice(Collection<LineItem> lineItems, String vendor, String vendee) {
        this.lineItems = lineItems;
        Vendor = vendor;
        Vendee = vendee;
    }

    public float calculateTotal() {
        float total = 0;
        for(var lineItem : lineItems) {
            total += lineItem.price * lineItem.count * (1 + lineItem.getTaxRate());
        }
        return total;
    }


    public Collection<LineItem> getLineItems() {
        return lineItems;
    }

    public String getVendor() {
        return Vendor;
    }

    public String getVendee() {
        return Vendee;
    }

    public String getTotal() {
        return Total;
    }

    public void setLineItems(Collection<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public void setVendor(String vendor) {
        Vendor = vendor;
    }

    public void setVendee(String vendee) {
        Vendee = vendee;
    }

    public void setTotal(String total) {
        Total = total;
    }
}
