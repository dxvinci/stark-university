package util;

import entities.Curso;

public class ListaCursos {
    private CelulaCurso primeiro;
    private CelulaCurso ultimo;

    public ListaCursos(){
        primeiro = new CelulaCurso();
        ultimo = primeiro;
    }

    public void inserirFim(Curso x) {
        ultimo.prox = new CelulaCurso(x);
        ultimo = ultimo.prox;
    }

    public Curso pesquisar(int idCurso) {
        for (CelulaCurso i = primeiro.prox; i != null; i = i.prox) {
            if (i.elemento.getId() == idCurso) {
                return i.elemento;
            }
        }
        return null;
    }

}
