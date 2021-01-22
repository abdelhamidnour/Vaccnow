package com.exercise.vaccnow.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TIME_SLOT", schema = "PUBLIC", catalog = "DEFAULT")
public class TimeSlot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "TICKET_ID", referencedColumnName = "id")
    private Integer ticketId;
    private Date startTime;
    private Date dateTime;
}
