package com.company;

import lombok.*;

import java.time.LocalDateTime;
import java.util.Collection;

@Setter
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {
    public String number;
    public LocalDateTime date;
    public String vendor;
    public String vendee;
    public Collection<String> lineItems;
    public String note;
}
