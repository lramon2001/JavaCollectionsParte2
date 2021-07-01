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
        // Iteração explícita- (Fail-Fast)
        Iterator<String> iterator = tabelaPessoas.KeySet().iterator();
        while(iterator.hasNext()){
            String chave = iterator.next();
            System.out.println(tabelaPessoas.get(chave).toString);
        }
        // Enumeration Non-Fail-Fast
        Enumeration<String> chaves = tabelaPessoas.keys();
        while(chaves.hasMoreElements()){
            String chave = chaves.nextElement();
            System.out.println(tabelaPessoas.get(chave).toString());
        }
        Pessoa p = null;
       /* if(tabelaPessoas.containsKey("legal")){
            p= tabelaPessoas.get("legal");
        } else {
            p = new Pessoa (-1,"Não existe");
        }
        System.out.println(p);

        */
        Pessoa p = tabelaPessoas.getOrDefault("legal",new Pessoa(-1,"Não existe"));
        System.out.println(p);
        /*if(!tabelaPessoas.containsKey("legal")){
            tabelaPessoas.put("legal",new Pessoa(1,"Lucas Ramon"));
        }

         */
        tabelaPessoas.putIfAbsent("legal", new Pessoa (1,"Lucas Ramon"));
        System.out.println(tabelaPessoas);
        tabelaPessoas.forEach((chave,valor)->{
            System.out.println(String.format("[%s] %s",chave,valor.toString()));
        });
    }



}
