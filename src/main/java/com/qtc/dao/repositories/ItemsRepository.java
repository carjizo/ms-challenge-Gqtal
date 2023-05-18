package com.qtc.dao.repositories;

import com.qtc.dao.model.Item;
import com.qtc.dao.repositories.projections.ItemsByAverageRatingLowerThanProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemsRepository extends JpaRepository<Item, Long> {

    @Query(value = "SELECT i.title, i.description, i.price, COALESCE(AVG(r.rating), 0) AS average_rating FROM msgqtc.msgqtc.items i \n" +
            "left join msgqtc.msgqtc.reviews r on r.item_id = i.item_id group by i.title, i.description, i.price\n" +
            "HAVING COALESCE(AVG(r.rating), 0) < :rating", nativeQuery = true)

    List<ItemsByAverageRatingLowerThanProjection> listItemsByAverageRatingLowerThan(Double rating);
}
