package com.qtc.dao.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuperBuilder
public class ItemsByAverageRatingLowerThanResponse {
    private String title;

}
