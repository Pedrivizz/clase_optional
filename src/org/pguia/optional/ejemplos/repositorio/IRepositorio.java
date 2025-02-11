package org.pguia.optional.ejemplos.repositorio;

import org.pguia.optional.ejemplos.models.Computador;

import java.util.Optional;

public interface IRepositorio<T> {

    Optional<Computador> filtrar(String nombre);

}
