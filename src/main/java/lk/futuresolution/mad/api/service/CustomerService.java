package lk.futuresolution.mad.api.service;

import lk.futuresolution.mad.api.controller.Request.CustomerRequest;
import lk.futuresolution.mad.api.controller.Response.CustomerResponse;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    CustomerResponse create (CustomerRequest customerRequest);
}
