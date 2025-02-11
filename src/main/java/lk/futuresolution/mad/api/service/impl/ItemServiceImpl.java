package lk.futuresolution.mad.api.service.impl;

import lk.futuresolution.mad.api.controller.Request.ItemRequest;
import lk.futuresolution.mad.api.controller.Response.ItemResponse;
import lk.futuresolution.mad.api.model.Item;
import lk.futuresolution.mad.api.repository.ItemRepository;
import lk.futuresolution.mad.api.service.ItemService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final ModelMapper modelMapper;

    @Override
    public ItemResponse create(ItemRequest itemRequest) {
        Item item = modelMapper.map(itemRequest, Item.class);
        itemRepository.save(item);

        return modelMapper.map(item, ItemResponse.class);
    }
}
