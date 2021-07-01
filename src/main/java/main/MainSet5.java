package main;

import models.Pessoa;

import java.util.HashSet;

public class MainSet  {
public static void main(String args[]){
    Map<String,Pessoa> mapaPessoas = new HashMap<String,Pessoa>();
    System.out.println(mapaPessoas.put("legal", new Pessoa(1,"Lucas")));
    System.out.println(mapaPessoas);
    System.out.println(mapaPessoas.put("legal", new Pessoa(2,"Lucas Ramon")));
    System.out.println(mapaPessoas);
    mapaPessoas.put(null, new Pessoa(-1,"Nulo"));
    System.out.println(mapaPessoas);
    mapaPessoas.put(null, new Pessoa(-2,"Nulo 2"));
    System.out.println(mapaPessoas);
    mapaPessoas.put("teste",null);
    System.out.println(mapaPessoas);
}
}
