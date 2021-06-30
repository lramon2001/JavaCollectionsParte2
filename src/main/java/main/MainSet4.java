package main;

import models.Pessoa;

import java.util.HashSet;

public class MainSet  {
    public static void main(String args[]){
        HashTable<String,Pessoa> tabelaPessoas = new Hashtable<String,Pessoa>();
        tabelaPessoas.put("legal",new Pessoa(1,"Lucas Ramon"));
        System.out.println(tabelaPessoas);
        tabelaPessoas.put("chato",new Pessoa(2,"Mateus"));
        System.out.println(tabelaPessoas);
        System.out.println(tabelaPessoas.get("legal"));
        tabelaPessoas.put("legal",new Pessoa(3,"Felipe"));
        System.out.println(tabelaPessoas.get("legal"));

    }



}
