package com.libertese.hackathon.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "indication_log")
public class IndicacaoLog implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "indicacao_id")
    private Indication indicacao;

    @Column(name = "log")
    @NotBlank( message = "Campo obrigatório")
    private String log;

    @Column(name="data_criacao", columnDefinition="TIMESTAMP")
    @DateTimeFormat(pattern = "dd-MM-yyyy H:m:s")
    private Timestamp data_criacao;

    public Indication getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(Indication indicacao) {
        this.indicacao = indicacao;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public Timestamp getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(Timestamp data_criacao) {
        this.data_criacao = data_criacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
