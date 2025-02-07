package lk.futuresolution.mad.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    private String itemName;
    private Double price;

    @Column(precision = 10, scale = 2)
    private BigDecimal stockQuantity;

    @Enumerated(EnumType.STRING)
    private Unit unit;

    private String description;
    private BigDecimal discountPercentage;

    @OneToMany(mappedBy = "item",cascade = CascadeType.ALL)
    private List<BillItem> billItems = new ArrayList<>();

}
