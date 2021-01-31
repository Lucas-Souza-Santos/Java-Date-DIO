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
## O java.util.Calendar
    Já na JDK 1.1 foi observada a necessidade de facilitar 
    alguns recursos que a class Date oferecia. 

    Sendo assim, a classe Calendar foi criada. 

    Com isso uma série de métodos e construtores da classe
    Date foi depreciada. Por exemplo o construtor 
    Date(int year, int month, int date).

## java.util.text.DateFormat
    Nesse ponto em que estamos existem, basicamente, duas classes para formatação
    de datas. O DateFormat e o SimpleDateFormat.

    Ambos oferecem maneiras de formatar e parsear a saída das datas.

### O java.text.DateFormat 
    Já o simpleDateFormat traz uma grande facilidade que é definir um padrão
    de formatação para a saída de data que você deseja.


## Datas no Java *+
    O java 8 veio com uma série de novidades para facilitar o 
    trabalho com Datas.

    E a grande melhoria está no pacote java.time que foi herdado
    do projeto Joda Time.

    Trabalhar com datas nunca foi tão fácil com esse novo pacote.

    Nele destacam-se três classes:
        - LocalDate;
            é uma classe imutável para representar uma data. 
            Seu formato padrão é yyyy-MM-dd
        - LocalTime;
            é uma classe imutável que representa um padrão de hora-minuto-segundo

            pode ser representado até o nível de nanosegundos.
        - LocalDateTime.
            funciona como uma espécie de junção entre o LocalTime e o 
            LocalDate

            Também é uma classe imutável e você consegue trabalhar com 
            dia e hora de uma só vez 

            Você pode manipular a data e hora com precisão de 
            nanosegundos.


