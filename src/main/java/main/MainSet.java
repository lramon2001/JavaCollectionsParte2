package main;

import models.Pessoa;

import java.util.HashSet;

public class MainSet {
    public static void main(String[] args){
        Set<Pessoa> pessoas = new HashSet<Pessoa>();
        System.out.println(pessoas.add(new Pessoa(1,"Lucas Ramon")));
        System.out.println(pessoas);
        System.out.println(pessoas.add(new Pessoa(1,"Lucas Ramon")));
        System.out.println(pessoas);
        System.out.println(pessoas.add(new Pessoa(2,"Pedro")));
        System.out.println(pessoas.add(new Pessoa(3,"João")));
        System.out.println(pessoas.add(new Pessoa(4,"Paulo")));
        System.out.println(pessoas);
    }



}
