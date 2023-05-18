package com.qtc.dao.mappers;

import com.qtc.dao.repositories.projections.ItemsByAverageRatingLowerThanProjection;
import com.qtc.dao.responses.ItemsByAverageRatingLowerThanResponse;

public class ItemsByAverageRatingLowerThanMapper {
    public static ItemsByAverageRatingLowerThanResponse getItemsByAverageRatingLowerThan (ItemsByAverageRatingLowerThanProjection itemsByAverageRatingLowerThanProjection){
        return ItemsByAverageRatingLowerThanResponse
                .builder()
                .title(itemsByAverageRatingLowerThanProjection.getTitle())
                .build();
    }
}
