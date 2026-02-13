package org.acme.application;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import org.acme.estructure.RepositorioVehiculo;


import org.acme.domain.Vehiculo;

@ApplicationScoped
public class ServiceVehiculo {
    @Inject
    private RepositorioVehiculo repositorioVehiculo;
    
    // metodo para guardar un vehiculo usando la clase vehiculo
    public void guardarVehiculo(Vehiculo vehiculo) {
        repositorioVehiculo.persist(vehiculo);
    }
    // metodo para obtener un vehiculo por su id
    public Vehiculo obtenerVehiculoPorId(Long id) {
        return repositorioVehiculo.findById(id);
    }
    // metodo para eliminar un vehiculo por su id
    public void eliminarVehiculoPorId(Long id) {
        repositorioVehiculo.deleteById(id);
    }

    

}
