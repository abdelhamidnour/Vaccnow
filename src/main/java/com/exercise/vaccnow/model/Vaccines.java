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
@Table(name = "VACCINES", schema = "PUBLIC", catalog = "DEFAULT")
public class Vaccines {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    @ManyToMany(mappedBy = "vaccines", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<Branch> branches = new HashSet<>();

}
