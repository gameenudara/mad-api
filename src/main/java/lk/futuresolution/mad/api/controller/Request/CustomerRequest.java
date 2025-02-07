package lk.futuresolution.mad.api.controller.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest {

    private String CustomerName;
    private String Address;
    private String Phone;
}
