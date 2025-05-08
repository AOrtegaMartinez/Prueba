package co.com.franchises.model.franchise.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Product {
    private String name;
    private Integer stock;

    public Product(String name, Integer stock) {
        this.name = name;
        this.stock  = stock;
    }
}
