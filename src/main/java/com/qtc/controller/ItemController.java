package com.qtc.controller;


import com.qtc.dao.dto.ItemsByAverageRatingLowerThanDTO;
import com.qtc.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items-average-rating-lower-than")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping(value = "/titles/{rating}", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public ItemsByAverageRatingLowerThanDTO listTitles (@PathVariable("rating") Double rating) {
        return itemService.listItemsByAverageRatingLowerThan(rating);
    }
}
