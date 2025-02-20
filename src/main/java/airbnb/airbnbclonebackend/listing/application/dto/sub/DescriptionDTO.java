package airbnb.airbnbclonebackend.listing.application.dto.sub;

import airbnb.airbnbclonebackend.listing.application.dto.vo.DescriptionVO;
import airbnb.airbnbclonebackend.listing.application.dto.vo.TitleVO;
import jakarta.validation.constraints.NotNull;

public record DescriptionDTO(
        @NotNull TitleVO title,
        @NotNull DescriptionVO description
        ) {
}
