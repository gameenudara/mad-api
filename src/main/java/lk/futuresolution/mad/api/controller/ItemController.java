package lk.futuresolution.mad.api.controller;

import lk.futuresolution.mad.api.controller.Request.ItemRequest;
import lk.futuresolution.mad.api.controller.Response.ItemResponse;
import lk.futuresolution.mad.api.service.ItemService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @PostMapping(value = "items",headers = "X-Api-Version")
    public ResponseEntity<ItemResponse> createItem(@RequestBody ItemRequest itemRequest){
        return new ResponseEntity<>(itemService.create(itemRequest), HttpStatus.CREATED);
    }

    @GetMapping(value = "items/{item-id}",headers = "X-Api-Version")
    public ResponseEntity<ItemResponse> getItem(@PathVariable("item-id") Long itemId){
        return new ResponseEntity<>(itemService.getById(itemId), HttpStatus.OK);
    }
}
