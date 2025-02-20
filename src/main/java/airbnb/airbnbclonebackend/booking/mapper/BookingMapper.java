package airbnb.airbnbclonebackend.booking.mapper;

import airbnb.airbnbclonebackend.booking.application.dto.BookedDateDTO;
import airbnb.airbnbclonebackend.booking.application.dto.NewBookingDTO;
import airbnb.airbnbclonebackend.booking.domain.Booking;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookingMapper {

    Booking newBookingToBooking(NewBookingDTO newBookingDTO);

    BookedDateDTO bookingToCheckAvailability(Booking booking);
}
