package com.myairline.airport.adapter.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre")
    private String userName;

    @Column(name = "edad")
    private int age;

    @Column(name = "pasaporte")
    private String passport;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "vuelo_id", referencedColumnName = "id")
    private FlightEntity flight;

}
