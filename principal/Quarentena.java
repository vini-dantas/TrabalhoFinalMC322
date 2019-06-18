package com.example.principal;

public class Quarentena {
    public void quarentena(String diagnostico){		//entra em quarentena se o paciente tem uma doença altamente contagiosa
        boolean q = false;

        if(diagnostico.contains("bacterial") || diagnostico.contains("bacteria")){
            q = true;
        }

        if(diagnostico.contains("viral") || diagnostico.contains("virus")){
            q = true;
        }

        if(q){
            System.out.println("Infelizmente, sua doença pode ser muito contagiosa e estaremos te levando para a quarentena!");
        }

    }
}
