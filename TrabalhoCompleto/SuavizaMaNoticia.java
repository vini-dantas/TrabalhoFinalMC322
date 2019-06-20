package com.example.principal;

public class SuavizaMaNoticia{

    public void suavizaMaNoticia(String diagnostico, String[][] tabelaSuaviza){
        for(int i = 0; i < tabelaSuaviza.length; i++){
            if(diagnostico.contains(tabelaSuaviza[i][0])){
                System.out.println(tabelaSuaviza[i][1]);
                return;
            }
        }
    }
}
