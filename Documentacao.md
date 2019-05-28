# Componente `IVisualizacao`

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
`localDeTratamento` | `recomenda um local de tratamento específico caso não seja curado`
`escolhePergunta` | `Escolhe a proxima pergunta baseada em um sintoma anterior return proxPergunta; Elimina linhas conforme os sintomas analizados nao estao presentes naquelas, e analiza apenas as colunas em que os sintomas variam`
`sinalizaSintomas` | `Conforme descobre sintomas sao sinalizdos em uma imagem de um zumbi returna a parteDoCorpo a ser sinalizada`
`suavizaMaNoticia` | `Randomiza modos de dar uma noticia ruim ao paciente e retorna uma delas`	
`tratamentoSintomatico` | `Devolve um tratameneto para sintomas especificos (amenizar desconforto) ex: febre - dipirona/banho gelado`	