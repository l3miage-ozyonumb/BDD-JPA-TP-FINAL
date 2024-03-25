package fr.uga.l3miage.tp4.models;

import org.hibernate.internal.util.type.PrimitiveWrapperHelper;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class ExamEntity {
    @Id
    private long id;

    private LocalDateTime startDate;
    private LocalDateTime endDate;
    @Column(unique = true)
    private String name;
    private int weight;
}
