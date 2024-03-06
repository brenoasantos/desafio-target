1) Observe o trecho de código abaixo:

int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça

{

K = K + 1;

SOMA = SOMA + K;

}

imprimir(SOMA);



Ao final do processamento, qual será o valor da variável SOMA?

---------------------------RESPOSTA---------------------------

Resposta: 91

Valor das variáveis "K" e "SOMA" ao longo das iterações:

K = 0, SOMA = 0
K = 1, SOMA = 1
K = 2, SOMA = 3
K = 3, SOMA = 6
K = 4, SOMA = 10
K = 5, SOMA = 15
K = 6, SOMA = 21
K = 7, SOMA = 28
K = 8, SOMA = 36
K = 9, SOMA = 45
K = 10, SOMA = 55
K = 11, SOMA = 66
K = 12, SOMA = 78
K = 13, SOMA = 91

Para comprovar essa resposta, traduzi o pseudocódigo fornecido para um código em Java.