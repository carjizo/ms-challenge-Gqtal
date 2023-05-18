package com.qtc.service;

import com.qtc.dao.dto.ItemsByAverageRatingLowerThanDTO;
import org.springframework.stereotype.Component;

@Component
public interface ItemService {

    ItemsByAverageRatingLowerThanDTO listItemsByAverageRatingLowerThan(Double rating);
}
