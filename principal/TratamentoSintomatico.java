package com.example.principal;

public class TratamentoSintomatico {

    public void tratamentoSintomatico(String sintoma, String[][] tabela){
        for(int i = 0; i < tabela.length; i++){
            if(sintoma.contains(tabela[i][0])){
                System.out.println(tabela[i][1]);
                return;
            }
        }
    }
}
