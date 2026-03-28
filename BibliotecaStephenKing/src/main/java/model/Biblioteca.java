package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Biblioteca {
    private List<Libro> libros = new ArrayList<>();
    private List<Libro> favoritos = new ArrayList<>();

}