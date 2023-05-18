package com.qtc.service.Impls;

import com.qtc.dao.dto.ItemsByAverageRatingLowerThanDTO;
import com.qtc.dao.mappers.ItemsByAverageRatingLowerThanMapper;
import com.qtc.dao.repositories.ItemsRepository;
import com.qtc.dao.repositories.projections.ItemsByAverageRatingLowerThanProjection;
import com.qtc.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemImpls implements ItemService {

    @Autowired
    ItemsRepository itemsRepository;
    @Override
    public ItemsByAverageRatingLowerThanDTO listItemsByAverageRatingLowerThan(Double rating) {
        List<ItemsByAverageRatingLowerThanProjection> items = itemsRepository.listItemsByAverageRatingLowerThan(rating);

        return ItemsByAverageRatingLowerThanDTO
                .builder()
                .itemsByAverageRatingLowerThanResponses(
                        items
                                .parallelStream()
                                .map(ItemsByAverageRatingLowerThanMapper::getItemsByAverageRatingLowerThan)
                                .collect(Collectors.toList())
                )
                .build();
    }
}
