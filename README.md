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

####

    Vamos testar com base no **System.currentTimeMillis()**

    Esse método estático vai nos retornar o milissegundo mais 
    próximo de sua execução com base no Sistema Operacional

####
### Métodos úteis
* after(Date)
```
    Retorno
        boolean
    Descrição
        Checa se o objeto Datade referência é posterior ao comparado
```
* before(Date)
```
    Retorno
        boolean
    Descrição
        Checa se o objeto Data de referência é anterior ao comparado
```
* compareTo(Date)
```
    Retorno
        int 
    Descrição
        Compara dois objetos Data
```
* equals(Date)
```
    Retorno
        boolean
    Descrição
        Checa se os objetos são iguais
```
* getTime()
```
    Retorno
        long
    Descrição
        Retorna a data em milessegundos setTime(long)
```
* getTime(long)
```
    Retorno
        void
    Descrição
        Define uma data com base em millissegundos
```
* form(Instante)
```
    Retorno
        static Date
    Descrição
        Define uma data com base em um Instant
```
* toInstant()
```
    Retorno
        Instant
    Descrição
        Retorna um Instant com base em um Date
```