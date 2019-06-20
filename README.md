# Grupo `Comp017`


## Componente `Quarentena`
Campo | Valor
----- | -----
Classe | `.principal.Quarentena.java`
Autores | `Ana Clara Lacaze, Lucas Batista, Gabriela Resende, Maria Martins, Vinicius Dantas`
Objetivo | `Determina se o paciente deve ou nao entrar em quarentena analisando a doenca que ele apresenta. Se a doença for altamente contagiosa imprime que o paciente deve ser levado para quarentena`
Interface | `public interface IQuarentena`
~~~
public interface IQuarentena {
}
~~~

## Componente `reduzTabela`
Campo | Valor
----- | -----
Classe | `.principal.ReduzTabela.java`
Autores | `Ana Clara Lacaze, Lucas Batista, Gabriela Resende, Maria Martins, Vinicius Dantas`
Objetivo | `Elimina linhas conforme os sintomas analizados nao estao presentes naquelas, e analisa apenas as colunas em que os sintomas variam`
Interface | `public interface IReduzTabela`
~~~
public interface IReduzTabela {
}
~~~

## Componente `suavizaMaNoticia`
Campo | Valor
----- | -----
Classe | `.principal.SuavizaMaNoticia.java`
Autores | `Ana Clara Lacaze, Lucas Batista, Gabriela Resende, Maria Martins, Vinicius Dantas`
Objetivo | `Apresenta modos de dar o diagnostico ao paciente de forma mais leve`
Interface | `public interface ISuavizaMaNoticia`
~~~
public interface ISuavizaMaNoticia {
    void conectaSuaviza(ITableProducer suaviza);
}
~~~

## Componente `tratamentoSintomatico`
Campo | Valor
----- | -----
Classe | `.principal.TratamentoSintomatico.java`
Autores | `Ana Clara Lacaze, Lucas Batista, Gabriela Resende, Maria Martins, Vinicius Dantas`
Objetivo | `Devolve um tratameneto para sintomas especificos (amenizar desconforto) ex: febre - dipirona/banho gelado`
Interface | `public interface ITratamentoSintomatico`
~~~
public interface ITratamentoSintomatico {
    void conectaTratamento(ITableProducer tratamento);
}
~~~

## Componente `perguntaCompleta`
Campo | Valor
----- | -----
Classe | `.principal.PerguntaCompleta.java`
Autores | `Ana Clara Lacaze, Lucas Batista, Gabriela Resende, Maria Martins, Vinicius Dantas`
Objetivo | `Imprime a pergunta do sintoma de forma mais completa e humana`
Interface | `public interface IPerguntaCompleta`
~~~
public interface IPerguntaCompleta {
    void conectaPergunta(ITableProducer pergunta);
}
~~~
