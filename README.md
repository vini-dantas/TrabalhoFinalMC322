# Grupo `Comp017`

Campo | Valor
----- | -----
Classe | `<caminho completo da classe com pacotes>` <br> Exemplo: `pt.c08componentes.s20catalog.s10ds.DataSetComponent`
Autores | `Ana Clara Lacaze, Lucas Batista, Gabriela Resende, Maria Martins, Vinicius Dantas`
Objetivo | `Melhorar a visualizacao do diagnostico e dos sintomas`
Interface | `public interface IVisualizacao`
~~~
public interface IVisualizacao {
  String[] doencaPaciente();
  String[][] matrizDoencas();
}
~~~

## Detalhamento das Interfaces

### Interface `IVisualizacao`
`Melhorar a visualizacao do diagnostico e dos sintomas`.

Método | Objetivo
-------| --------
`quarentena` | `Determina se o paciente deve ou nao entrar em quarentena analisando a doenca que ele apresenta. Se a doença for altamente contagiosa returna true se nao returna false`
`reduzTabela` | `Elimina linhas conforme os sintomas analizados nao estao presentes naquelas, e analisa apenas as colunas em que os sintomas variam`
`sinalizaSintomas` | `Conforme descobre sintomas sao sinalizados em uma imagem de um zumbi returna a parteDoCorpo a ser sinalizada`
`suavizaMaNoticia` | `Apresenta modos de dar uma noticia ruim ao paciente de forma mais leve`	
`tratamentoSintomatico` | `Devolve um tratameneto para sintomas especificos (amenizar desconforto) ex: febre - dipirona/banho gelado`	
`perguntaCompleta` | `Imprime a pergunta de forma mais completa e humana`	
