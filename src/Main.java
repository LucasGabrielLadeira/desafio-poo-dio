import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
public class Main {
    public static void main(String args[]){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargahoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria de Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos:" + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("_");
        System.out.println("Conteúdos Inscritos:" + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:" + devLucas.getConteudosConcluidos());
        System.out.println("XP: " + devLucas.calcularTotalXp());

        System.out.println("_________________________");
        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos:" + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        System.out.println("_");
        System.out.println("Conteúdos Inscritos:" + devGabriel.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:" + devGabriel.getConteudosConcluidos());
        System.out.println("XP: " + devGabriel.calcularTotalXp());
    }
}
