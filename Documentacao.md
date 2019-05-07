# Componente `IVisualizacao`

Campo | Valor
----- | -----
Classe | `<caminho completo da classe com pacotes>` <br> Exemplo: `pt.c08componentes.s20catalog.s10ds.DataSetComponent`
Autores | `Ana Clara Lacaze, Lucas Batista, Gabriela Resende, Maria Martins, Vinicius Dantas`
Objetivo | `Melhorar a visualizacao do diagnostico e dos sintomas`
Interface | `<interface em Java do componente>`
~~~
public interface ITableProducer {
  String[] requestAttributes();
  String[][] requestInstances();
}
public interface IDataSource {
  public String getDataSource();
  public void setDataSource(String dataSource);
}
public interface IDataSet extends ITableProducer, IDataSource {
}
~~~

## Detalhamento das Interfaces

### Interface `IVisualizacao`
`Melhorar a visualizacao do diagnostico e dos sintomas`.

Método | Objetivo
-------| --------
`quarentena` | `Entra em quarentena se o paciente tem uma doença altamente contagiosa return true; se o paciente deve ser colocado em quarentena return false; se nao`
`escolhePergunta` | `Escolhe a proxima pergunta baseada em um sitoma anterior return proxPergunta; Elimina linhas conforme os sintomas analizados nao estao presentes naquelas, e analiza apenas as colunas em que os sintomas variam`
`sinalizaSintomas` | `Conforme descobre sintomas sao sinalizdos em 	uma imagem de um zumbi return parteDoCorpo; a ser sinalizada`
`suavizaMaNoticia` | `Randomiza modos de dar uma noticia ruim ao paciente e retorna um deles return noticia;`	
`tratamentoSintomatico` | `DÍevolve um tratameneto para sintomas especificos (amenizar desconforto) ex: febre - dipirona/banho gelado`	