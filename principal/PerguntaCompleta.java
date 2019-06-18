package com.example.principal;

public class PerguntaCompleta {

    public void perguntaCompleta(String pergunta, String[][] tabela){
        for(int i = 0; i < tabela.length; i++){
            if(pergunta.contains(tabela[i][0])){
                System.out.println(tabela[i][1]);
                return;
            }
        }
        System.out.println("Você apresenta " + pergunta + "?");
    }
}
