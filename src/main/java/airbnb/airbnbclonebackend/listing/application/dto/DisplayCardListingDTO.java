package airbnb.airbnbclonebackend.listing.application.dto;


import airbnb.airbnbclonebackend.listing.application.dto.sub.PictureDTO;
import airbnb.airbnbclonebackend.listing.application.dto.vo.PriceVO;
import airbnb.airbnbclonebackend.listing.domain.BookingCategory;

import java.util.UUID;

public record DisplayCardListingDTO(PriceVO price,
                                    String location,
                                    PictureDTO cover,
                                    BookingCategory bookingCategory,
                                    UUID publicId) {
}
