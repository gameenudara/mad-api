package lk.futuresolution.mad.api.repository;

import lk.futuresolution.mad.api.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
