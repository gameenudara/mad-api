package lk.futuresolution.mad.api.service;

import lk.futuresolution.mad.api.controller.Request.CustomerRequest;
import lk.futuresolution.mad.api.controller.Response.CustomerResponse;
import lk.futuresolution.mad.api.exception.CustomerNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {

    CustomerResponse create (CustomerRequest customerRequest);

    CustomerResponse findById(Long customerId)throws CustomerNotFoundException;

    List<CustomerResponse> findAll();

    CustomerResponse update(CustomerRequest customerRequest,Long customerId)throws CustomerNotFoundException;
}
