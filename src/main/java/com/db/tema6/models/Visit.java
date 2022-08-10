package com.db.tema6.models;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Visit {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private Patient patient;

    @NotNull
    private Date date;

    @ManyToOne
    private Doctor doctor;
}
