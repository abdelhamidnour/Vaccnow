package com.exercise.vaccnow.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.*;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BRANCH", schema = "PUBLIC", catalog = "DEFAULT")
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String address;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "BRANCH_VACCINES",
            joinColumns = {@JoinColumn(name = "branch_id")},
            inverseJoinColumns = {@JoinColumn(name = "vaccine_id")}
    )
    private Set<Vaccines> vaccines = new HashSet<>();


}
