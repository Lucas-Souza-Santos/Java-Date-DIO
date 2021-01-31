# Java-Date-DIO
Curso de Java para tratamento de Datas

## O java.util.Date
### Date()
    Este construtor vai alocar um objeto da classe Date e o **inicializará com o 
    milissegundo mais próximo** do período da sua execução.

    OBS.: Os exemplos estaram na pasta codigos

### Date(long date)
    Diferente do construtoranterior, esse construtor espera
    que você passe os millissegundos com base padrão de tempo
    (epoch) que usa como referência 1 de janeiro de 1970 00:00:00

#####

*Uma pequena pausa... O que é o Epoch?*

    O epoch timestamp é um padrão largamente aceito para 
    representar um data como um inteiro 32-bits a partir 
    do início do **Unix Epoch...**

    Vamos testar com base no **System.currentTimeMillis()**

    Esse método estático vai nos retornar o milissegundo mais 
    próximo de sua execução com base no Sistema Operacional
