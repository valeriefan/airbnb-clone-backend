package airbnb.airbnbclonebackend.listing.application.dto;

import airbnb.airbnbclonebackend.listing.application.dto.vo.PriceVO;

import java.util.UUID;

public record ListingCreateBookingDTO(
        UUID listingPublicId, PriceVO price) {
}
