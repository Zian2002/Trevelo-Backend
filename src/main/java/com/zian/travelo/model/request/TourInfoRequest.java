package com.zian.travelo.model.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TourInfoRequest {
    private String name;
    private String description;
    private String itinerary;
    private LocalDate createdAt;
    private Long locationId;
}
