package com.example.principal;

import java.util.ArrayList;

public class ReduzTabela {
    public ArrayList<String[]> reduzTabela(ArrayList<String[]> instances, int coluna, String valor){
        ArrayList<String[]> novaInstancia = new ArrayList<>();
        int contador = 0;

        for (String[] instance : instances) {
            if (instance[coluna].equalsIgnoreCase(valor)) {
                novaInstancia.add(contador, instance);
                contador++;
            }
        }
        return novaInstancia;
    }
}
