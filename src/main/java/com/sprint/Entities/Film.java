package com.sprint.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;
import java.math.BigDecimal;

@Entity
@Table(name = "film")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Film {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    private Long filmId;
    
    @Column(name = "title", length = 255)
    private String title;
    
    @Column(name = "description", columnDefinition = "LONGTEXT")
    private String description;
    
    @Column(name = "release_year", length = 4)
    private String releaseYear;
    
    @ManyToOne
    @JoinColumn(name = "language_id", nullable = false)
    private Language language;
    
    @ManyToOne
    @JoinColumn(name = "original_language_id")
    private Language originalLanguage;
    
    @Column(name = "rental_duration")
    private Integer rentalDuration;
    
    @Column(name = "rental_rate", precision = 4, scale = 2)
    private BigDecimal rentalRate;
    
    @Column(name = "length")
    private Integer length;
    
    @Column(name = "replacement_cost", precision = 5, scale = 2)
    private BigDecimal replacementCost;
    
    @Column(name = "rating", length = 10)
    private String rating;
    
    @Column(name = "special_features", columnDefinition = "VARCHAR(100)")
    private String specialFeatures;
    
    @Column(name = "last_update")
    private Timestamp lastUpdate;
}
