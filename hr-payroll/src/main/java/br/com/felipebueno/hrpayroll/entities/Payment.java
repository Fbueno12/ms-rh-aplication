package br.com.felipebueno.hrpayroll.entities;

import lombok.*;
import java.io.Serializable;

@Getter @Setter @NoArgsConstructor
@AllArgsConstructor @Builder
public class Payment implements Serializable{
    private static final long serialVersionUID = 1L;

    private String name;
    private Double dailyIncome;
    private Integer days;

    public Double getTotal() {
        return days * dailyIncome;
    }

}
