package com.hmm.apaya;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "answer_counter")
public class AnswerCounter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "yes_count")
    private int yesCount;

    @Column(name = "no_count")
    private int noCount;

    public Long getId() { return id; }

    public int getYesCount() { return yesCount; }
    public void setYesCount(int yesCount) { this.yesCount = yesCount; }

    public int getNoCount() { return noCount; }
    public void setNoCount(int noCount) { this.noCount = noCount; }
}