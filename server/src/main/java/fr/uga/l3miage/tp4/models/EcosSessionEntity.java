package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.SessionStatus;

import javax.persistence.Column;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class EcosSessionEntity {
    @Id
    private long id;
    @Column(unique = true)
    private String name;

    private LocalDateTime startDate;

    private  LocalDateTime endDate;

    private SessionStatus status;
}
