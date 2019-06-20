package com.example.principal;

import java.util.ArrayList;

public class Doctor implements IDoctor {
    private ITableProducer producer;
    private IResponder responder;

    private ITableProducer suaviza;
    private SuavizaMaNoticia suaviza2 = new SuavizaMaNoticia();

    private ITableProducer tratamento;
    private TratamentoSintomatico tratamento2 = new TratamentoSintomatico();

    private ITableProducer pergunta;
    private PerguntaCompleta pergunta2 = new PerguntaCompleta();

    private Quarentena quarentena = new Quarentena();

    private ReduzTabela reduzTabela = new ReduzTabela();


    public void connect(ITableProducer producer) {
        this.producer = producer;
    }

    public void connect(IResponder responder) {
        this.responder = responder;
    }

    public void conectaSuaviza(ITableProducer suaviza){ this.suaviza = suaviza; }

    public void conectaTratamento(ITableProducer tratamento){
        this.tratamento = tratamento;
    }

    public void conectaPergunta(ITableProducer pergunta){
        this.pergunta = pergunta;
    }


    public void startInterview() {
        String[] attributes = producer.requestAttributes();
        String[][] instances = producer.requestInstances();

        String[][] tratamentoSintomatico = tratamento.requestInstances();
        String[][] suavizaMaNoticia = suaviza.requestInstances();
        String[][] perguntaCompleta = pergunta.requestInstances();

        ArrayList<String[]> Instancia = new ArrayList<>();
        for (int i = 0; i < instances.length; i++){
            Instancia.add(i, instances[i]);
        }

        System.out.println("Olá, eu sou o doutor Alan e serei seu médico hoje.");
        System.out.println("Vamos começar a consulta!\n");
        for (int a = 0; a < attributes.length - 1; a++) {
            pergunta2.perguntaCompleta(attributes[a], perguntaCompleta);
            String resposta = responder.ask(a);
            Instancia = reduzTabela.reduzTabela(Instancia, a, resposta);
            if(Instancia.size() <= 1){
                break;
            }

            if(Instancia.size() < 3){
                if(Instancia.get(0)[attributes.length - 1].equals(Instancia.get(1)[attributes.length - 1])){
                    Instancia.remove(0);
                    break;
                }
            }
        }

        if(Instancia.size() == 0){
            System.out.println("Seus sintomas não batem com nenhuma doença conhecida, você deverá ir para a quarentena por segurança!");
        }else{
            if(Instancia.size() > 1){
                System.out.println("* Seus sintomas batem com " + Instancia.size() + " doenças:");
                for (int i = 0; i < Instancia.size(); i++) {
                    suaviza2.suavizaMaNoticia(Instancia.get(i)[attributes.length - 1], suavizaMaNoticia);
                }
            }else{
                suaviza2.suavizaMaNoticia(Instancia.get(0)[attributes.length-1], suavizaMaNoticia);
            }

            System.out.println("\n* Para os sintomas, siga essas recomendaçōes:");
            for(int j = 0; j < attributes.length; j++) {
                if(Instancia.get(0)[j].equals("t")){
                    tratamento2.tratamentoSintomatico(attributes[j], tratamentoSintomatico);
                }
            }
            System.out.println();
            quarentena.quarentena(Instancia.get(0)[attributes.length - 1]);
        }
    }
}