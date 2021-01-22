package com.exercise.vaccnow.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TICKET", schema = "PUBLIC", catalog = "DEFAULT")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToOne
    @JoinColumn(name = "BRANCH_VACCINES_ID", referencedColumnName = "id")
    private Integer branchVaccinesId;
    @OneToOne
    @JoinColumn(name = "TIME_SLOT_Id", referencedColumnName = "id")
    private Integer timeSlotId;
    private Boolean confirmed;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;







}
