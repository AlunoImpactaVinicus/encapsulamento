# Parte 1: Abstração

1. Os atributos importantes seriam as características principais de um veiculo, sua cor, sua marca, seu modelo, seu ano. E os métodos importantes para essa classe seria um método onde exibe todas as informações do veículo e outra confirmando que está tudo certo com o veículo.

2. A classe usada como um modelo para as outras classes, cada veículo tem cor, marca, modelo, e ano diferentes um do outro e por isso deve-se criar uma classe modelo(abstrata), tendo essas características para não repetir código.

# Parte 2: Herança

1. Com a classe mãe, que é base para outras classes, crio um método mover, onde poderia aplicar para outras classes a partir da herança.

2. Não é necessário reescrever o mesmo código quando se usa herança. Quando criar a classe, Carro, Moto, Caminhão, não preciso recriar o mesmo método toda vez, apenas herdo da classe mão o método mover.

# Parte 3: Encapsulamento

1. Usando a classe informacoesVeiculo com os métodos getter e setter onde o setter iria receber o dado e getter retornaria se estiver de acordo.

2. A importância de usar encapsulamento é não deixar que a variável receba qualquer coisa diferente do que foi pedido, por exemplo se a classe não tiver encapsulamento, eu permito que a variável seja alterada por qualquer coisa, utilizando encapsulamento posso proteger e verificar para ver se a vin é válida ou não.
