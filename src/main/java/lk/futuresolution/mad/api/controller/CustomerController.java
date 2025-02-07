package lk.futuresolution.mad.api.controller;

import lk.futuresolution.mad.api.controller.Request.CustomerRequest;
import lk.futuresolution.mad.api.controller.Response.CustomerResponse;
import lk.futuresolution.mad.api.exception.CustomerNotFoundException;
import lk.futuresolution.mad.api.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping(value = "customers",headers = "X-Api-Version=v1")
    public ResponseEntity<CustomerResponse> addCustomer(@RequestBody CustomerRequest customerRequest) {
        return new ResponseEntity<>(customerService.create(customerRequest), HttpStatus.CREATED);
    }

    @GetMapping(value = "customers/{customer-id}",headers = "X-Api-Version=v1")
    public ResponseEntity<CustomerResponse> getCustomer(@PathVariable("customer-id") Long customerId) throws CustomerNotFoundException {
        return new ResponseEntity<>(customerService.findById(customerId),HttpStatus.OK);
    }

    @GetMapping(value = "customers",headers = "X-Api-Version=v1")
    public ResponseEntity<List<CustomerResponse>> getAllCustomers() {
        List<CustomerResponse> customerResponses = customerService.findAll();
        return new ResponseEntity<>(customerResponses,HttpStatus.OK);
    }

    @PutMapping(value = "customers/{customer-id}",headers = "X-Api-Version=v1")
    public ResponseEntity<CustomerResponse> updateCustomer (@RequestBody CustomerRequest customerRequest, @PathVariable("customer-id") Long customerId)throws CustomerNotFoundException {
        return new ResponseEntity<>(customerService.update(customerRequest,customerId),HttpStatus.OK);
    }
}
