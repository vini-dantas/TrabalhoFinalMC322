package com.example.principal;

public class Principal {
    public static void main(String[] args) {
// instanciando o componente DataSet
        IDataSet dataset = new DataSetComponent();
        dataset.setDataSource("./zombie-health-spreadsheet-ml-training.csv");

        IDataSet suaviza = new DataSetComponent();
        suaviza.setDataSource("./suaviza.csv");

        IDataSet tratamento = new DataSetComponent();
        tratamento.setDataSource("./sintomas.csv");

        IDataSet pergunta = new DataSetComponent();
        pergunta.setDataSource("./perguntas.csv");

// instanciando o componente paciente
        IPatient aPatient = new Patient();

// conectando-o no componente DataSet
        aPatient.connect(dataset);

// instanciando o componente doutor louco
        IDoctor cDoctor = new Doctor();

// conectando-o ao componente DataSet
        cDoctor.connect(dataset);

// conectando-o ao componente paciente
        cDoctor.connect(aPatient);

        cDoctor.conectaSuaviza(suaviza);

        cDoctor.conectaTratamento(tratamento);

        cDoctor.conectaPergunta(pergunta);

// executando a entrevista
        cDoctor.startInterview();
    }
}
