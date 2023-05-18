package com.qtc.dao.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
@Entity
@Table(name = "reviews", schema = "msgqtc")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id", nullable = false)
    private Long reviewId;

    @Column(name = "item_id")
    private Long itemId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "rating")
    private Double rating;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
