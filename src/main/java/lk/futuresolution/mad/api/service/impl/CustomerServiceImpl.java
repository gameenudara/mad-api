package lk.futuresolution.mad.api.service.impl;

import lk.futuresolution.mad.api.controller.Request.CustomerRequest;
import lk.futuresolution.mad.api.controller.Response.CustomerResponse;
import lk.futuresolution.mad.api.exception.CustomerNotFoundException;
import lk.futuresolution.mad.api.model.Customer;
import lk.futuresolution.mad.api.repository.CustomerRepository;
import lk.futuresolution.mad.api.service.CustomerService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;

    @Override
    public CustomerResponse create(CustomerRequest customerRequest) {
        Customer customer = modelMapper.map(customerRequest, Customer.class);
        Customer savedCustomer = customerRepository.save(customer);

        return modelMapper.map(savedCustomer, CustomerResponse.class);
    }

    @Override
    public CustomerResponse findById(Long customerId) throws CustomerNotFoundException {
        Customer customer = customerRepository.findById(customerId).orElseThrow(
                () -> new CustomerNotFoundException("Customer Id : "+customerId+ "Customer not found")
        );

        return modelMapper.map(customer, CustomerResponse.class);
    }
}
