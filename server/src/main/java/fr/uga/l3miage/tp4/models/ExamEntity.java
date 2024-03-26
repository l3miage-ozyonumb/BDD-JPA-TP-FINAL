package fr.uga.l3miage.tp4.models;

import org.hibernate.internal.util.type.PrimitiveWrapperHelper;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class ExamEntity {
    @Id
    private Long id;

    private LocalDateTime startDate;
    private LocalDateTime endDate;
    @Column(unique = true)
    private String name;
    private int weight;



}
