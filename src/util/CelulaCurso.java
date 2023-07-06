package util;

import entities.Curso;

public class CelulaCurso {
    public Curso elemento;
    public CelulaCurso prox;

    public CelulaCurso() {
        this(null);
    }

    public CelulaCurso (Curso curso) {
        this.elemento = curso;
        this.prox = null;
    }
}
