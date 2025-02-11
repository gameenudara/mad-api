package lk.futuresolution.mad.api.controller.Request;

import lk.futuresolution.mad.api.model.Unit;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ItemRequest {

    private String itemName;
    private Double price;
    private BigDecimal stockQuantity;
    private Unit unit;
    private String description;
    private BigDecimal discountPercentage;
}
