package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Curso extends Conteudo {

    //atributos


    private int cargaHoraria;

    //construtor padrao

    public Curso() {
    }

    //metodo acessores get e set

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    //metodo
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


}
