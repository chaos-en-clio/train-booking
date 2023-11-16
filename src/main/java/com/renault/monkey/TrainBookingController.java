package com.renault.monkey;



import com.renault.monkey.dto.Details;
import com.renault.monkey.dto.TrainBookingResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class TrainBookingController {


    @GetMapping("/trains")
    public TrainBookingResponse bookTrain() {
        return
               TrainBookingResponse.builder().trainReservationId("12234")
                       .date("20/12/2023  23h23min").price(999)
                       .details(Details.builder().
                               departure("Paris").destination("ST Quentin").build())
                       .build();
    }

    @GetMapping("/trains/{status}")
    public TrainBookingResponse bookTrain2(@PathVariable int status) {
        if (status == 1) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Invalid request parameter");
        } else{
            return TrainBookingResponse.builder()
                    .trainReservationId("12234")
                    .date("20/12/2023  23h23min")
                    .price(999)
                    .details(Details.builder()
                            .departure("Paris")
                            .destination("ST Quentin")
                            .build())
                    .build();
        }
    }
}
