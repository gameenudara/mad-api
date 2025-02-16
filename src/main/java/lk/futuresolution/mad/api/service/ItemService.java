package lk.futuresolution.mad.api.service;

import lk.futuresolution.mad.api.controller.Request.ItemRequest;
import lk.futuresolution.mad.api.controller.Response.ItemResponse;
import lk.futuresolution.mad.api.exception.ItemNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface ItemService {

    ItemResponse create(ItemRequest itemRequest);

    ItemResponse getById(Long itemId)throws ItemNotFoundException;
}
