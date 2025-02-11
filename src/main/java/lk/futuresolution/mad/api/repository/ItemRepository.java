package lk.futuresolution.mad.api.repository;

import lk.futuresolution.mad.api.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
