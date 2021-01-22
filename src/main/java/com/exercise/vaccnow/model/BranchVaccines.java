package com.exercise.vaccnow.model;

import lombok.*;

import javax.persistence.*;
import java.util.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BRANCH_VACCINES", schema = "PUBLIC", catalog = "DEFAULT")
public class BranchVaccines {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private List<Integer> branches;
    private List<Integer>  vaccinesId;

    @OneToOne
    @JoinColumn(name = "TICKET", referencedColumnName = "id")
    private Integer ticket;

}
