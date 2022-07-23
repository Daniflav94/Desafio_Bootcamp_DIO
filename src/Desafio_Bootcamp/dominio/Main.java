package Desafio_Bootcamp.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Boas-vindas ao Santander Code Girls");
        curso1.setDescricao("Curso introdutório sobre o Bootcamp.");
        curso1.setCargaHoraria(1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Conheça as Oportunidades da DIO");
        curso2.setDescricao("Curso introdutório sobre a DIO.");
        curso2.setCargaHoraria(1);

        Curso curso3 = new Curso();
        curso3.setTitulo("Seja Protagonista Neste Bootcamp");
        curso3.setDescricao("Dicas para realizar o Bootcamp com sucesso.");
        curso3.setCargaHoraria(1);

        Curso curso4 = new Curso();
        curso4.setTitulo("Introdução à Programação e Pensamento Computacional");
        curso4.setDescricao("Curso introdutório sobre programação e conceitos de Pensamento Computacional.");
        curso4.setCargaHoraria(5);

        Curso curso5 = new Curso();
        curso5.setTitulo("Introdução ao Git e ao Github");
        curso5.setDescricao("Curso que ensina a utilizar a ferramenta Git e criar repositórios no GitHub.");
        curso5.setCargaHoraria(5);

        Curso curso6 = new Curso();
        curso6.setTitulo("Dominando IDEs Java");
        curso6.setDescricao("Apresentação das IDEs Eclipse e IntelliJ, instruções de como instalar, principais atalhos e exemplos de como criar um projeto.");
        curso6.setCargaHoraria(4);

        Curso curso7 = new Curso();
        curso7.setTitulo("Variáveis, Tipos de Dados e Operadores Matemáticos em Java");
        curso7.setDescricao("Conceitos básicos da linguagem Java.");
        curso7.setCargaHoraria(2);

        Curso curso8 = new Curso();
        curso8.setTitulo("Entendendo Métodos Java");
        curso8.setDescricao("Explicação detalhada sobre métodos.");
        curso8.setCargaHoraria(2);

        Curso curso9 = new Curso();
        curso9.setTitulo("Lógica Condicional e Controle de Fluxos Java");
        curso9.setDescricao("Abordagem de estruturas condicionais, como if, else if e else.");
        curso9.setCargaHoraria(2);

        Curso curso10 = new Curso();
        curso10.setTitulo("Estruturas de Repetição e Arrays em Java");
        curso10.setDescricao("Apresentação das estruturas de repetição while, do while e for e conceitos de Arrays.");
        curso10.setCargaHoraria(3);

        Curso curso11 = new Curso();
        curso11.setTitulo("Trabalhando com Collections Java");
        curso11.setDescricao("Teoria e exemplos práticos sobre Collections.");
        curso11.setCargaHoraria(4);

        Curso curso12 = new Curso();
        curso12.setTitulo("Programação orientada a Objetos");
        curso12.setDescricao("Conceitos sobre o que é POO e suas características.");
        curso12.setCargaHoraria(4);

        Curso curso13 = new Curso();
        curso13.setTitulo("Praticando Orientação a Objetos com Java");
        curso13.setDescricao("Live com exemplo prático de POO.");
        curso13.setCargaHoraria(2);

        Curso curso14 = new Curso();
        curso14.setTitulo("Debbuging Java");
        curso14.setDescricao("Como executar a depuração do código com a ferramenta IntelliJ e Eclipse.");
        curso14.setCargaHoraria(1);

        Curso curso15 = new Curso();
        curso15.setTitulo("Tratamento de Excessões em Java");
        curso15.setDescricao("Tipos de erros e excessões e como resolver.");
        curso15.setCargaHoraria(2);

        Curso curso16 = new Curso();
        curso16.setTitulo("Principais Protocolos de Comunicação da Internet");
        curso16.setDescricao("Conceitos sobre protocolos HTTP, HTTPS e WebSocket.");
        curso16.setCargaHoraria(3);

        Curso curso17 = new Curso();
        curso17.setTitulo("Gerenciamento de Dependências e Build em Java com Maven");
        curso17.setDescricao("Definição e exemplo de um projeto Maven.");
        curso17.setCargaHoraria(3);

        Curso curso18 = new Curso();
        curso18.setTitulo("Introdução ao Spring Framework");
        curso18.setDescricao("Curso introdutório sobre o framework Spring.");
        curso18.setCargaHoraria(3);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Santander Code Girls | Aula inaugural");
        mentoria1.setDescricao("Apresentação do Bootcamp e dicas.");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Primeiros passos com Banco de Dados Relacional SQL");
        mentoria2.setDescricao("Conceitos básicos e exemplos de SQL.");
        mentoria2.setData(LocalDate.now());

        Mentoria mentoria3 = new Mentoria();
        mentoria3.setTitulo("Introdução ao Docker e a Containers");
        mentoria3.setDescricao("Apresentação da ferramenta Docker.");
        mentoria3.setData(LocalDate.now());

        Mentoria mentoria4 = new Mentoria();
        mentoria4.setTitulo("Como se tornar uma desenvolvedora de sucesso no Santander");
        mentoria4.setDescricao("Dicas valiosas de profissionais do Santander.");
        mentoria4.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Santander Code Girls");
        bootcamp.setDescricao("Jornada trilha Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(curso4);
        bootcamp.getConteudos().add(curso5);
        bootcamp.getConteudos().add(curso6);
        bootcamp.getConteudos().add(curso7);
        bootcamp.getConteudos().add(curso8);
        bootcamp.getConteudos().add(curso9);
        bootcamp.getConteudos().add(curso10);
        bootcamp.getConteudos().add(curso11);
        bootcamp.getConteudos().add(curso12);
        bootcamp.getConteudos().add(curso13);
        bootcamp.getConteudos().add(curso14);
        bootcamp.getConteudos().add(curso15);
        bootcamp.getConteudos().add(curso16);
        bootcamp.getConteudos().add(curso17);
        bootcamp.getConteudos().add(curso18);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);
        bootcamp.getConteudos().add(mentoria3);
        bootcamp.getConteudos().add(mentoria4);

        Dev devDaniele = new Dev();
        devDaniele.setNome("Daniele");
        devDaniele.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devDaniele.getConteudosInscritos());
        devDaniele.progredir();
        System.out.println("Conteúdos Inscritos" + devDaniele.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devDaniele.getConteudosConcluidos());
        System.out.println("XP:" + devDaniele.calcularTotalXp());



    }
}
