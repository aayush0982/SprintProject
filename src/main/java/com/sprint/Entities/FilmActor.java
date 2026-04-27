package com.sprint.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Entity
@Table(name = "film_actor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmActor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "film_id", nullable = false)
    private Film film;
    
    @ManyToOne
    @JoinColumn(name = "actor_id", nullable = false)
    private Actor actor;
    
    @Column(name = "last_update")
    private Timestamp lastUpdate;
}
