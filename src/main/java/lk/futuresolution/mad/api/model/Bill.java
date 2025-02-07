package lk.futuresolution.mad.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "bills")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long billId;

    private LocalDate billDate;
    private Double totalAmount;
    private Long invoiceNumber;
    private BigDecimal billDiscount;

    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy = "bill",cascade = CascadeType.ALL)
    private List<BillItem> billItems = new ArrayList<>();

    @OneToMany(mappedBy = "bill")
    private List<Payment> payments = new ArrayList<>();

}
