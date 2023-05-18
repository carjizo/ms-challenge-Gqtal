package com.qtc.dao.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.qtc.dao.responses.ItemsByAverageRatingLowerThanResponse;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuperBuilder
public class ItemsByAverageRatingLowerThanDTO {

    List<ItemsByAverageRatingLowerThanResponse> itemsByAverageRatingLowerThanResponses;
}
