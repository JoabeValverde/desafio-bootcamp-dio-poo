import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Kotlin");
        curso2.setDescricao("Descrição Curso Kotlin");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo(" Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now()); // mostra a data da criaçao

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJoabe = new Dev();
        devJoabe.setNome("Joabe");
        devJoabe.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joabe " + devJoabe.getConteudosInscritos());

        devJoabe.progredir();
        devJoabe.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Joabe " + devJoabe.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joabe " + devJoabe.getConteudosConcluidos());
        System.out.println("XP:" + devJoabe.calcularTotalXp());

        System.out.println("------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao " + devJoabe.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Joao " + devJoabe.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao " + devJoabe.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}
