package lk.futuresolution.mad.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CustomerId;

    private String CustomerName;
    private String Address;
    private String Phone;

    @OneToMany(mappedBy = "customer")
    private List<Bill> bills = new ArrayList<>();
}
