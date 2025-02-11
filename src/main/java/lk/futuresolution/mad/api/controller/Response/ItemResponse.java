package lk.futuresolution.mad.api.controller.Response;

import lk.futuresolution.mad.api.model.Unit;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ItemResponse {

    private String itemName;
    private Double price;
    private BigDecimal stockQuantity;
    private Unit unit;
    private String description;
    private BigDecimal discountPercentage;
}
