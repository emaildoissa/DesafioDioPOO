package br.com.desafio.dominio;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        BootCamp bootCamp = new BootCamp();
       
        Dev dev1 = new Dev();
        Dev dev2 = new Dev();
        
        Mentoria mentoria = new Mentoria();
        
        
        curso1.setTitulo("Java");
        curso1.setDescricao("Collections");
        curso1.setCargaHoraria(5);
        
        curso2.setTitulo("Js");
        curso2.setDescricao("Introdução ao Js");
        curso2.setCargaHoraria(1);
        
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria");
        mentoria.setData(LocalDate.now());
        
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Descrição BootCamp Java Developer");
        
        
        bootCamp.setNome("BootCamp Js Developer");
        bootCamp.setDescricao("Descrição BootCamp Java Developer");
        
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(mentoria);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);
        
        
        dev1.setNome("Marcos Issa");
        dev1.inscrever(bootCamp);
        
        System.out.println("Conteudos inscritos Marcos:" + dev1.getConteudoInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos conluidos: "+ dev1.getConteudosConcluidos());
        System.out.println("Conteudos inscritos Marcos:" + dev1.getConteudoInscritos());
        System.out.println("Valor do XP: "+ dev1.calcularTotalXp());
        
        System.out.println("++++++++++++++++++");
        
        dev2.setNome("Maria");
        dev2.inscrever(bootCamp);
        
        System.out.println("Conteudos inscritos Maria:" + dev2.getConteudoInscritos());
        System.out.println("++++++++++++++++++");
        
        System.out.println("Conteudos conluidos: "+ dev2.getConteudosConcluidos());
        System.out.println("Conteudos inscritos Maria:" + dev2.getConteudoInscritos());
        System.out.println("Valor do XP: "+ dev2.calcularTotalXp());
               
    }
}
