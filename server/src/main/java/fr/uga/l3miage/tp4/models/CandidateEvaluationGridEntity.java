package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class CandidateEvaluationGridEntity {

    @Id
    private long sheetNumber;
    private double grade;
    private LocalDateTime submissionDate;

}
