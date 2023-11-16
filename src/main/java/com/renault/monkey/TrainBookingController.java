package com.renault.monkey;


import java.util.Arrays;
import java.util.List;

import com.renault.monkey.dto.Details;
import com.renault.monkey.dto.TrainBookingResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainBookingController {

    @GetMapping("/test")
    public List<String> test() {
        return Arrays.asList("product1", "product2", "product3");
    }

    @GetMapping("/trains")
    public TrainBookingResponse bookTrain() {
        return
               TrainBookingResponse.builder().trainReservationId("12234")
                       .date("20/12/2023  23h23min")
                       .details(Details.builder().
                               departure("Paris").destination("ST Quentin").price(999).build())
                       .build();
    }


}
