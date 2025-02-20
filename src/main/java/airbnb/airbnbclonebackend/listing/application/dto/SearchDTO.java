package airbnb.airbnbclonebackend.listing.application.dto;

import airbnb.airbnbclonebackend.booking.application.dto.BookedDateDTO;
import airbnb.airbnbclonebackend.listing.application.dto.sub.ListingInfoDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;

public record SearchDTO(@Valid BookedDateDTO dates,
                        @Valid ListingInfoDTO infos,
                        @NotEmpty String location) {
}
