package org.acme.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "vehiculo")
@SequenceGenerator(name = "vehiculo_seq", sequenceName = "vehiculo_seq", allocationSize = 1)
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehiculo_seq")
    public Long id;
    public String marca;
    public String modelo;
    public String chasis;

    public Vehiculo() {
    }

}
