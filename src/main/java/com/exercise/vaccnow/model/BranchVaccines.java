package com.exercise.vaccnow.model;

import lombok.*;

import javax.persistence.*;
import java.util.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BRANCH_VACCINES")
public class BranchVaccines {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @OneToOne
    private Branch branch;
    @OneToOne
    private Vaccines vaccines;

}
