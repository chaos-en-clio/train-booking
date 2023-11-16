package com.renault.monkey.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Data
@Builder
public class TrainBookingResponse {
    private String trainReservationId;
    private String date;
    private Details details;


}
