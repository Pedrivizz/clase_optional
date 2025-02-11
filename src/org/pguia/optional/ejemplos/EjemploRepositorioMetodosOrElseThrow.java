package org.pguia.optional.ejemplos;

import org.pguia.optional.ejemplos.models.Computador;
import org.pguia.optional.ejemplos.repositorio.ComputadorRepositorio;
import org.pguia.optional.ejemplos.repositorio.IRepositorio;

import java.util.Optional;

public class EjemploRepositorioMetodosOrElseThrow {
    public static void main(String[] args) {

        IRepositorio<Computador> repositorio = new ComputadorRepositorio();

        Computador pc = repositorio.filtrar("asus rog").orElseThrow(IllegalStateException::new);
        System.out.println(pc);
        String archivo = "documento.pdf";
        String extension = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".") + 1))
                .orElseThrow();
        System.out.println(extension);
    }
}

