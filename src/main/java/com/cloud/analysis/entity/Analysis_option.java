package com.cloud.analysis.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Analysis_option {
    @Id
    @Column(name = "option_id", nullable = false)
    private Integer optionId;

    @Column(name = "analysis_id", nullable = false)
    private Integer analysisId;

    @Column(name = "option_name", nullable = false)
    private Integer optionName;

    @Column(nullable = false)
    private Integer value;
}