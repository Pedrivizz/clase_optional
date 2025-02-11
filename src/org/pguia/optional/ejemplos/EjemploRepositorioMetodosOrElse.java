package org.pguia.optional.ejemplos;

import org.pguia.optional.ejemplos.models.Computador;
import org.pguia.optional.ejemplos.repositorio.ComputadorRepositorio;
import org.pguia.optional.ejemplos.repositorio.IRepositorio;

public class EjemploRepositorioMetodosOrElse {
    public static void main(String[] args) {

        IRepositorio<Computador> repositorio = new ComputadorRepositorio();

        // Computador defecto = new Computador("HP Omen", "LA0001");

        Computador pc = repositorio.filtrar("asus rog").orElse(valorDefecto());
        System.out.println(pc);

        pc = repositorio.filtrar("macbook pro").orElseGet(EjemploRepositorioMetodosOrElse::valorDefecto);
        System.out.println(pc);

    }

    public static Computador valorDefecto(){
        System.out.println("Obteniendo valor por defecto!!!");
        return new Computador("HP Omen", "LA0001");
    }
}

