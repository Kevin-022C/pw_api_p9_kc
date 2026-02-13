package org.acme.estructure;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.domain.Vehiculo;

@ApplicationScoped
public class RepositorioVehiculo implements PanacheRepository<Vehiculo> {

}
