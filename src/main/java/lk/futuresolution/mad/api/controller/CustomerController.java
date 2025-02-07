package lk.futuresolution.mad.api.controller;

import lk.futuresolution.mad.api.controller.Request.CustomerRequest;
import lk.futuresolution.mad.api.controller.Response.CustomerResponse;
import lk.futuresolution.mad.api.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping(value = "customers",headers = "X-Api-Version=v1")
    public CustomerResponse addCustomer(@RequestBody CustomerRequest customerRequest) {
        return customerService.create(customerRequest);
    }
}
