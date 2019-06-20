package com.example.principal;
import java.util.Scanner;

public class Patient implements IPatient {
    private ITableProducer producer;

    private String[] attributes;
    private String[] patientInstance;

    public void connect(ITableProducer producer) {
        this.producer = producer;

        attributes = producer.requestAttributes();
        String instances[][] = producer.requestInstances();
    }

    public String ask(int question) {
        Scanner resposta = new Scanner(System.in);
        String result;

        result = resposta.nextLine();

        if(result.equalsIgnoreCase("true") ||result.equalsIgnoreCase("t") || result.equalsIgnoreCase("sim") || result.equalsIgnoreCase("s")){
            return "t";
        }else if(result.equalsIgnoreCase("false") || result.equalsIgnoreCase("f") || result.equalsIgnoreCase("nao") || result.equalsIgnoreCase("n")){
            return "f";
        }
        return "n";
    }

    public boolean finalAnswer(String answer) { // mudar pq nao vai ser randomizado a parte de escolha de doenca do paciente
        boolean result = false;
        if (answer.equalsIgnoreCase(patientInstance[attributes.length - 1]))
            result = true;
        return result;

    }
}
