package org.pguia.optional.ejemplos;

import org.pguia.optional.ejemplos.models.Computador;
import org.pguia.optional.ejemplos.repositorio.ComputadorRepositorio;
import org.pguia.optional.ejemplos.repositorio.IRepositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {

        IRepositorio<Computador> repositorio = new ComputadorRepositorio();

        repositorio.filtrar("asus rog").ifPresentOrElse(System.out::println,
                () -> System.out.println("No se encontró"));
        /*Optional<Computador> pc = repositorio.filtrar("asus rog");

        if(pc.isPresent()) {
            System.out.println(pc.get().toString());
        }
        else {
            System.out.println("No se encontró");
        }*/
    }
}
