package com.db.tema6.models;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private String cnp;

    @OneToMany
    private List<Visit> visits = new ArrayList<>();

    @OneToOne
    private Doctor doctor;
}
