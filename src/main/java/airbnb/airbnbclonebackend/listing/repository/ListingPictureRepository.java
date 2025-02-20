package airbnb.airbnbclonebackend.listing.repository;

import airbnb.airbnbclonebackend.listing.domain.ListingPicture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingPictureRepository extends JpaRepository<ListingPicture, Long> {
}
