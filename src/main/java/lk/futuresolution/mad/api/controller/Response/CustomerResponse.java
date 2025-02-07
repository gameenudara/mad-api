package lk.futuresolution.mad.api.controller.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {

    private String CustomerName;
    private String Address;
    private String Phone;
}
