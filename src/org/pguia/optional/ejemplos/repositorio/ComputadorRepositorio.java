package org.pguia.optional.ejemplos.repositorio;

import org.pguia.optional.ejemplos.models.Computador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio implements IRepositorio<Computador> {

    private List<Computador> dataSource;

    public ComputadorRepositorio() {
        dataSource  = new ArrayList<>();
        dataSource.add(new Computador("Asus ROG", "Strix G512"));
        dataSource.add(new Computador("MacBook Pro", "MVVK2CI"));
    }

    @Override
    public Optional<Computador> filtrar(String nombre) {
        return dataSource.stream()
                .filter(c -> c.getNombre().toLowerCase().equalsIgnoreCase(nombre.toLowerCase()))
                .findFirst();

        /*for (Computador c: dataSource) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return Optional.of(c);
            }
        }
        return Optional.empty();*/
    }
}
