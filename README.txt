Nos primeiros anos ap�s a Revolu��o Francesa, intelectuais foram encarregados de erradicar da sociedade certas tradi��es e supersti��es da era negra da realeza. Algumas destas contribui��es alcan�aram um amplo sucesso, tais como o sistema m�trico. Outras ca�ram em (quase) completo esquecimento, tais como o sistema de tempo decimal, inventado pelo matem�tico Gilbert Romme. O sistema de tempo decimal divide o dia em 10 horas decimais, que s�o divididas em 100 minutos decimais, que por sua vez s�o divididos em 100 segundos decimais.

Voc� foi encarregado pela mundialmente famosa fabricante de rel�gios "Splatch" para incluir mais uma caracter�stica in�til na pr�xima linha de produtos: um mostrador de tempo decimal. Sua primeira tarefa � implementar um programa que converte um tempo no formato tradicional para um tempo decimal com precis�o de um cent�simo de segundo.

Entrada

A entrada consiste de um seq��ncia de linhas, cada uma contendo exatamente um tempo tradicional, no formato HHMMSSCC, onde 0 = HH = 23, 0 = MM = 59, 0 = SS = 59 e 0 = CC = 99. A entrada � terminada com um fim de arquivo (EOF).

Sa�da

Para cada tempo tradicional, a sa�da dever� mostrar uma linha com o hor�rio decimal correspondente, arredondado por truncamento, no formato HMMSSCC, onde 0 = H = 9, 0 = MM = 99, 0 = SS = 99 e 0 = CC = 99.

Exemplo

Entrada:
00000000
23595999
12000000
14273467
02475901

Sa�da:
0000000
9999998
5000000
6024846
1166552