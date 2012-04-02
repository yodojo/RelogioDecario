Nos primeiros anos após a Revolução Francesa, intelectuais foram encarregados de erradicar da sociedade certas tradições e superstições da era negra da realeza. Algumas destas contribuições alcançaram um amplo sucesso, tais como o sistema métrico. Outras caíram em (quase) completo esquecimento, tais como o sistema de tempo decimal, inventado pelo matemático Gilbert Romme. O sistema de tempo decimal divide o dia em 10 horas decimais, que são divididas em 100 minutos decimais, que por sua vez são divididos em 100 segundos decimais.

Você foi encarregado pela mundialmente famosa fabricante de relógios "Splatch" para incluir mais uma característica inútil na próxima linha de produtos: um mostrador de tempo decimal. Sua primeira tarefa é implementar um programa que converte um tempo no formato tradicional para um tempo decimal com precisão de um centésimo de segundo.

Entrada

A entrada consiste de um seqüência de linhas, cada uma contendo exatamente um tempo tradicional, no formato HHMMSSCC, onde 0 = HH = 23, 0 = MM = 59, 0 = SS = 59 e 0 = CC = 99. A entrada é terminada com um fim de arquivo (EOF).

Saída

Para cada tempo tradicional, a saída deverá mostrar uma linha com o horário decimal correspondente, arredondado por truncamento, no formato HMMSSCC, onde 0 = H = 9, 0 = MM = 99, 0 = SS = 99 e 0 = CC = 99.

Exemplo

Entrada:
00000000
23595999
12000000
14273467
02475901

Saída:
0000000
9999998
5000000
6024846
1166552