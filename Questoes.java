package Atividade;

import java.util.Scanner;

public class Questoes {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// q1();
		// q2();
		// q3();
		// q4();
		// q5();
		// q6();
		// q7();
		// q8();
		// q9();
		// q10();
		// q11();
		// q12();
		// q13();
		// q14();
		// q15();
		// q16();
		// q17();
		// q18();
		// q19();
		// q20();
		// q21();
		// q22();
		// q23();
		// q24();
		// q25();
		// q26();
		// q27();
		// q28();
		// q29();
		// q30();
		// q31();
		// q32();
		// q33();
		// q34();
		// q35();
		// q36();
		// q37();
		// q38();
		// q39();
		// q40();
		// q41();
		// q42();
		// q43();
		// q44();
		// q45();
		// q46();
		// q47();
		// q48();
		// q49();
		// q50();
		// q51();
		// q52();
		// q53();
		// q54();
		// q55();

	}

	public static void q1() {
		/*
		 * Escreva um algoritmo que leia dois n�meros e ao final mostre a soma,
		 * subtra��o, multiplica��o e a divis�o dos n�meros lidos.
		 */

		double num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		num1 = sc.nextDouble();
		System.out.println("Digite o primeiro numero: ");
		num2 = sc.nextDouble();
		System.out.println("Soma: " + (num1 + num2));
		System.out.println("Subtra��o: " + (num1 - num2));
		System.out.println("Mutiplica��o: " + (num1 * num2));
		System.out.println("Divis�o: " + (num1 / num2));
	}

	public static void q2() {
		/*
		 * Escreva um algoritmo para determinar o consumo m�dio de um autom�vel sendo
		 * fornecida a dist�ncia total percorrida pelo autom�vel e o total de
		 * combust�vel gasto.
		 */

		Double distancia, totalCom;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a distancia percorrida em KM: ");
		distancia = sc.nextDouble();
		System.out.println("Digite o total de combustivel gasto em litros: ");
		totalCom = sc.nextDouble();
		System.out.println("O consumo m�dio de combustivel � " + (totalCom / distancia) + " litros.");
	}

	public static void q3() {
		/*
		 * Escreva um algoritmo que leia o nome de um vendedor, o seu sal�rio fixo e o
		 * total de vendas efetuadas por ele no m�s (em dinheiro). Sabendo que este
		 * vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, informar o seu
		 * nome, o sal�rio fixo e sal�rio no final do m�s.
		 */

		Scanner sc = new Scanner(System.in);
		String nome;
		Double salarioFixo, totalDeVendas;
		System.out.println("Digite o nome: ");
		nome = sc.next();
		System.out.println("Digite o salario fixo: ");
		salarioFixo = sc.nextDouble();
		System.out.println("Digite o total de vendas: ");
		totalDeVendas = sc.nextDouble();
		System.out.println("Nome: " + (nome));
		System.out.println("Salario fixo: " + (salarioFixo));
		System.out.println("Salario final: " + (salarioFixo + (totalDeVendas * 0.15)));
	}

	public static void q4() {
		/*
		 * Escreva um algoritmo que leia uma temperatura em graus Celsius e apresent�-la
		 * convertida em graus Fahrenheit. A f�rmula de convers�o �: F = (9*C+160)/5,
		 * sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
		 */

		Double tempCelsius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celcius: ");
		tempCelsius = sc.nextDouble();
		System.out.println("A temperatura em Fahrenheit �: " + (((9 * tempCelsius) + 160) / 5));
	}

	public static void q5() {
		/*
		 * Escreva um algoritmo que efetue a apresenta��o do valor da convers�o em real
		 * (R$) de um valor lido em d�lar (US$). O algoritmo dever� solicitar o valor da
		 * cota��o do d�lar e tamb�m a quantidade de d�lares dispon�veis com o usu�rio
		 */

		Scanner sc = new Scanner(System.in);
		Double dolar, cotacao;
		System.out.println("Digite a cota��o do dolar: ");
		cotacao = sc.nextDouble();
		System.out.println("Digite o valor em dolar: ");
		dolar = sc.nextDouble();
		System.out.println("O valor da convers�o do dolar para o real � R$ " + (dolar * cotacao));
	}

	public static void q6() {
		/*
		 * Escreva um algoritmo que receba um valor que foi depositado em uma conta
		 * poupan�a e exiba o valor com rendimento ap�s um m�s. Considere fixo o juro da
		 * conta poupan�a em 0,70% a.m
		 */

		Double valor;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor que deseja depositar: ");
		valor = sc.nextDouble();
		System.out.println("O valor com juros apos um mes ser�: " + (valor + (valor * 0.0070)));
	}

	public static void q7() {
		/*
		 * A Loja Mam�o com A��car est� vendendo seus produtos em 5 (cinco) presta��es
		 * sem juros. Fa�a um algoritmo que receba um valor de uma compra e mostre o
		 * valor das presta��es.
		 */

		Double valorDoProduto;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do seu produto: ");
		valorDoProduto = sc.nextDouble();
		System.out.println("Voc� pagar� 5 presta��es de " + (valorDoProduto / 5));
	}

	public static void q8() {
		/*
		 * Fa�a um algoritmo que receba o pre�o de custo de um produto e mostre o valor
		 * de venda. Sabe-se que o pre�o de custo receber� um acr�scimo de acordo com um
		 * percentual informado pelo usu�rio.
		 */

		Double precoDeCusto, percentual, acrescimo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o preco de custo do produto: ");
		precoDeCusto = sc.nextDouble();
		System.out.println("Digite a porcentagem que vai ser acrescida no produto: ");
		percentual = sc.nextDouble();
		acrescimo = (percentual / 100);
		System.out.println("O valor do produto ser� R$ " + (precoDeCusto + (precoDeCusto * acrescimo)));
	}

	public static void q9() {
		/*
		 * O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
		 * percentagem do distribuidor e dos impostos (aplicados, primeiro os impostos
		 * sobre o custo de f�brica, e depois a percentagem do distribuidor sobre o
		 * resultado). Supondo que a percentagem do distribuidor seja de 28% e os
		 * impostos 45%. Escrever um algoritmo que leia o custo de f�brica de um carro e
		 * informe o custo ao consumidor do mesmo.
		 */

		Scanner novo = new Scanner(System.in);
		double custoDeFabrica;
		double custoComImposto;

		System.out.println("Custo de f�brica: ");
		custoDeFabrica = novo.nextDouble();

		custoComImposto = +custoDeFabrica + (custoDeFabrica * 0.45);

		System.out.println("Custo ao consumidor:" + (custoComImposto + (custoComImposto * 0.28)));

	}

	public static void q10() {
		/*
		 * Escreva um algoritmo que armazene o valor 10 em uma vari�vel A e o valor 20
		 * em uma vari�vel B. A seguir (utilizando apenas atribui��es entre vari�veis)
		 * troque os seus conte�dos fazendo com que o valor que est� em A passe para B e
		 * vice-versa. Ao final, escrever os valores que ficaram armazenados nas
		 * vari�veis
		 */

		int A, B, x, y;
		A = 10;
		B = 20;
		System.out.println("A = " + (A) + " B = " + (B));
		x = A;
		y = B;
		A = y;
		B = x;
		System.out.println("A = " + (A) + " B = " + (B));
	}

	public static void q11() {
		/*
		 * Analise os algoritmos a baixo e diga o que ser� impresso na tela ao serem
		 * executados
		 */

		System.out.println("A) vai ser impresso 120, 100 e 234.");
		System.out.println("B) vai ser impresso 500, 140, 500, 300, 140 e 440.");
		System.out.println("C) vai ser impresso 34, 67 e 79.");
		System.out.println("D) vai dar erro porque Z n�o recebeu nada.");
	}

	public static void q12() {
		/**/

		System.out.println("Apenas a 1 - [A] tem resultados iguais!");
	}

	public static void q14() {
		/*
		 * Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o
		 * seu antecessor e seu sucessor
		 */

		double num;

		Scanner novo = new Scanner(System.in);
		System.out.println("Digite um n�mero:");
		num = novo.nextDouble();

		System.out.println("Antecessor:" + (num - 1) + "Sucessor:" + (num + 1));
	}

	public static void q15() {
		/*
		 * Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura),
		 * calcular e escrever a �rea do ret�ngulo
		 */

		double base;
		double altura;

		Scanner novo = new Scanner(System.in);

		System.out.println("informe a base do ret�ngulo em metros:");
		base = novo.nextDouble();
		System.out.println("informe a altura do ret�ngulo em metros:");
		altura = novo.nextDouble();

		System.out.println("A �rea do ret�ngulo �:" + (base * altura) + " m�");
	}

	public static void q16() {
		/*
		 * Fa�a um algoritmo que leia a idade de uma pessoa expressa em anos, meses e
		 * dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano
		 * com 365 dias e m�s com 30 dias.
		 */
		int ano;
		int meses;
		int dias;
		int aux, aux2;

		Scanner novo = new Scanner(System.in);

		System.out.println("informe sua idade exata com ano, m�s e dia:");
		ano = novo.nextInt();
		meses = novo.nextInt();
		dias = novo.nextInt();

		aux = ano * 365;
		aux2 = meses * 30;

		System.out.println("Idade em dias: " + (aux + aux2 + dias));
	}

	public static void q17() {
		/*
		 * Escreva um algoritmo para ler o n�mero total de eleitores de um munic�pio, o
		 * n�mero de votos brancos, nulos e v�lidos. Calcular e escrever o percentual
		 * que cada um representa em rela��o ao total de eleitores
		 */
		Scanner novo = new Scanner(System.in);
		int totalDeEleitores;
		int nulos;
		int brancos;
		int validos;

		System.out.println("Total de eleitores:");
		totalDeEleitores = novo.nextInt();
		System.out.println("Votos Nulos/Brancos/V�lidos:");
		nulos = novo.nextInt();
		brancos = novo.nextInt();
		validos = novo.nextInt();

		if ((nulos < totalDeEleitores) & (brancos < totalDeEleitores) & (validos < totalDeEleitores)) {
			System.out.println("Porcentagem nula:" + (100 * nulos / totalDeEleitores));
			System.out.println("Porcentagem brancos:" + (100 * brancos / totalDeEleitores));
			System.out.println("Porcentagem validos:" + (100 * validos / totalDeEleitores));
		} else {
			System.out.println("Sua contagem � incompat�vel!");
		}
	}

	public static void q18() {
		/*
		 * Escreva um algoritmo para ler o sal�rio mensal atual de um funcion�rio e o
		 * percentual de reajuste. Calcular e escrever o valor do novo sal�rio
		 */
		double salario;
		double reajuste;
		double pReajuste;

		Scanner novo = new Scanner(System.in);
		System.out.println("Sal�rio normal:");
		salario = novo.nextInt();
		System.out.println("Porcentagem de reajuste:");
		reajuste = novo.nextInt();

		pReajuste = reajuste / 100;

		System.out.println("Sal�rio reajustado: " + (salario + (salario * pReajuste)));
	}

	public static void q19() {
		/*
		 * O custo de um carro novo ao consumidor � a soma do custo de f�brica com a
		 * porcentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
		 * Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
		 * escrever um algoritmo para ler o custo de f�brica de um carro, calcular e
		 * escrever o custo final ao consumidor
		 */

		/** Quest�o repetida **/

		Scanner novo = new Scanner(System.in);
		double custoDeFabrica;
		double custoComImposto;

		System.out.println("Custo de f�brica: ");
		custoDeFabrica = novo.nextDouble();

		custoComImposto = +custoDeFabrica + (custoDeFabrica * 0.45);

		System.out.println("Custo ao consumidor:" + (custoComImposto + (custoComImposto * 0.28)));
	}

	public static void q20() {
		/*
		 * Uma revendedora de carros usados paga a seus funcion�rios vendedores um
		 * sal�rio fixo por m�s, mais uma comiss�o tamb�m fixa para cada carro vendido e
		 * mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo que leia
		 * o n�mero de carros por ele vendidos, o valor total de suas vendas, o sal�rio
		 * fixo e o valor que ele recebe por carro vendido. Calcule e escreva o sal�rio
		 * final do vendedor.
		 */

		double salarioFixo;
		int numCarrosV;
		double totalDeVenda;
		double valorPorCarro;

		Scanner novo = new Scanner(System.in);
		System.out.println("N�mero de carros vendidos:");
		numCarrosV = novo.nextInt();
		System.out.println("Valor total de vendas:");
		totalDeVenda = novo.nextDouble();
		System.out.println("Sal�rio fixo:");
		salarioFixo = novo.nextDouble();
		System.out.println("Valor por carro:");
		valorPorCarro = novo.nextDouble();

		System.out.println("Sal�rio final:" + (salarioFixo + (totalDeVenda * 0.05) + valorPorCarro * numCarrosV));
	}

	public static void q21() {
		/*
		 * Ler um valor e escrever a mensagem � MAIOR QUE 10! se o valor lido for maior
		 * que 10, caso contr�rio escrever N�O � MAIOR QUE 10!
		 */
		double valor;

		Scanner novo = new Scanner(System.in);
		System.out.println("Digite um n�mero:");
		valor = novo.nextInt();

		if (valor > 10) {
			System.out.println("Maior que 10!");
		} else {
			System.out.println("Menor que 10!");
		}
	}

	public static void q22() {
		/*
		 * Ler um valor e escrever se � positivo ou negativo (considere o valor zero
		 * como positivo).
		 */
		int valor;

		Scanner novo = new Scanner(System.in);
		System.out.println("Digite um n�mero:");
		valor = novo.nextInt();

		System.out.println((valor >= 0) ? "Positivo" : "negativo");
	}

	public static void q23() {
		/*
		 * As ma��s custam R$ 1,30 cada se forem compradas menos de uma d�zia, e R$ 1,00
		 * se forem compradas pelo menos 12. Escreva um programa que leia o n�mero de
		 * ma��s compradas, calcule e escreva o custo total da compra.
		 */
		int numDeCompra;

		Scanner novo = new Scanner(System.in);
		System.out.println("Quantas deseja comprar?");
		numDeCompra = novo.nextInt();

		System.out.println((numDeCompra >= 12) ? ("Total a pagar: " + (numDeCompra * 1))
				: ("Total a pagar" + (numDeCompra * 1.30)));
	}

	public static void q24() {
		float nota1;
		float nota2;
		float media;
		Scanner novo = new Scanner(System.in);

		System.out.println("Notas:");
		nota1 = novo.nextFloat();
		nota2 = novo.nextFloat();

		media = (nota1 + nota2) / 2;

		System.out.println((media >= 6) ? ("Aprovado com m�dia: " + (media)) : "Reprovado com m�dia: " + ((media)));
	}

	public static void q25() {
		int anoAtual;
		int anoNascimento;
		int votar;
		Scanner novo = new Scanner(System.in);

		System.out.println("Ano de nascimento:");
		anoNascimento = novo.nextInt();
		System.out.println("Ano atual:");
		anoAtual = novo.nextInt();

		votar = anoAtual - anoNascimento;

		System.out.println((votar >= 18) ? "Voc� pode votar!" : "Voc� n�o pode votar!");
	}

	public static void q26() {
		double valor1;
		double valor2;

		Scanner novo = new Scanner(System.in);
		System.out.println("Digite um n�mero:");
		valor1 = novo.nextInt();
		System.out.println("Digite um n�mero:");
		valor2 = novo.nextInt();

		System.out.println((valor1 > valor2) ? (valor1) + " � maior!" : (valor2) + " � maior!");
	}

	public static void q27() {
		double valor1;
		double valor2;

		Scanner novo = new Scanner(System.in);
		System.out.println("Digite um n�mero:");
		valor1 = novo.nextInt();
		System.out.println("Digite um n�mero:");
		valor2 = novo.nextInt();

		System.out.println((valor1 > valor2) ? (valor1) + ", " + (valor2) : (valor2) + ", " + (valor1));
	}

	public static void q28() {
		int horaI;
		int horaF;
		int hora;
		int dura;

		Scanner novo = new Scanner(System.in);
		System.out.println("Hora inicial:");
		horaI = novo.nextInt();
		System.out.println("Hora final:");
		horaF = novo.nextInt();

		hora = horaF - horaI;

		if (hora < 0) {
			dura = hora + 24;
			System.out.println("O jogo teve " + dura + " horas de dura��o");
		} else {
			System.out.println("O jogo teve " + hora + " horas de dura��o");
		}
	}

	public static void q29() {
		/*
		 * A jornada de trabalho semanal de um funcion�rio � de 40 horas. O funcion�rio
		 * que trabalhar mais de 40 horas receber� hora extra, cujo c�lculo � o valor da
		 * hora regular com um acr�scimo de 50%. Escreva um algoritmo que leia o n�mero
		 * de horas trabalhadas em um m�s, o sal�rio por hora e escreva o sal�rio total
		 * do funcion�rio, que dever� ser acrescido das horas extras, caso tenham sido
		 * trabalhadas (considere que o m�s possua 4 semanas exatas).
		 */

		Scanner sc = new Scanner(System.in);
		Double salarioPorHora, horaPorSemana, numHorasMes, horasExtras;
		System.out.println("Digite o numero de horas que vc trabalhou no mes: ");
		numHorasMes = sc.nextDouble();
		System.out.println("Digite seu salario por hora: ");
		salarioPorHora = sc.nextDouble();
		horaPorSemana = (numHorasMes / 4);
		horasExtras = numHorasMes - 160;

		if (horaPorSemana > 40) {
			System.out.println(
					"O salario no final do mes � " + ((salarioPorHora * 160) + (horasExtras * 0.50) * salarioPorHora));
		} else {
			System.out.println("O salario no final do mes � " + (salarioPorHora * numHorasMes));
		}
	}

	public static void q30() {
		/*
		 * Para o enunciado a seguir foi elaborado um algoritmo em Portugol que cont�m
		 * erros, identifique os erros no algoritmo apresentado abaixo: Enunciado: Tendo
		 * como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa,
		 * calcule e mostre seu peso ideal, utilizando as seguintes f�rmulas: para sexo
		 * masculino: peso ideal = (72.7 * altura) - 58 para sexo feminino: peso ideal =
		 * (62.1 * altura) - 44.7
		 */

		Scanner sc = new Scanner(System.in);
		String nome;
		Double alturaCm, alturaM, pesoIdeal;
		int sexo = 0;

		System.out.println("Digite seu nome: ");
		nome = sc.next();
		System.out.println("Digite sua altura em centimetros: ");
		alturaCm = sc.nextDouble();
		alturaM = alturaCm / 100;

		while ((sexo != 1) || (sexo != 2)) {
			System.out.println("Digite seu sexo (1) masculino ou (2) feminino: ");
			sexo = sc.nextInt();
			if (sexo == 1) {
				pesoIdeal = ((72.7 * alturaM) - 58);
				System.out.println("Seu peso ideal �: " + pesoIdeal);
				break;
			} else if (sexo == 2) {
				pesoIdeal = ((62.1 * alturaM) - 44.7);
				System.out.println("Seu peso ideal �: " + pesoIdeal);
				break;
			} else {
				System.out.println("opcao invalida!");
			}
		}
	}

	public static void q31() {
		Scanner novo = new Scanner(System.in);
		int salarioF;
		int totalVendas;

		System.out.println("Digite seu sal�rio fixo:");
		salarioF = novo.nextInt();
		System.out.println("Informe o valor das vendas efetuadas:");
		totalVendas = novo.nextInt();

		if (totalVendas > 1500)
			System.out.println("Salario final:" + (totalVendas * 0.05) + salarioF);
		else if (totalVendas <= 1500)
			System.out.println("Salario final:" + (totalVendas * 0.03) + salarioF);

	}

	public static void q32() {
		Scanner novo = new Scanner(System.in);
		int numeroConta;
		double saldo;
		double credito;
		double debito;
		double saldoAtual;

		System.out.println("Informe o numero da conta:");
		numeroConta = novo.nextInt();
		System.out.println("Informe seu saldo:");
		saldo = novo.nextDouble();
		System.out.println("Informe se �  credito ou debito:");
		credito = novo.nextInt();
		debito = novo.nextInt();

		saldoAtual = (saldo - debito) + credito;

		System.out.println((saldoAtual >= 0) ? "Saldo positivo: " + (saldoAtual) : "Saldo negativo: " + (saldoAtual));
	}

	public static void q33() {
		/*
		 * Fa�a um algoritmo para ler: quantidade atual em estoque, quantidade m�xima em
		 * estoque e quantidade m�nima em estoque de um produto. Calcular e escrever a
		 * quantidade m�dia ((quantidade m�dia = quantidade m�xima + quantidade
		 * m�nima)/2). Se a quantidade em estoque for maior ou igual a quantidade m�dia
		 * escrever a mensagem 'N�o efetuar compra', sen�o escrever a mensagem 'Efetuar
		 * compra'
		 */

		Scanner sc = new Scanner(System.in);
		Double quantidadeAtual, quantidadeMaxima, quantidadeMinima, quantidadeMedia;
		System.out.println("Digite a quantidade atual em estoque: ");
		quantidadeAtual = sc.nextDouble();
		System.out.println("Digite a quantidade maxima em estoque: ");
		quantidadeMaxima = sc.nextDouble();
		System.out.println("Digite a quantidade minima em estoque: ");
		quantidadeMinima = sc.nextDouble();
		quantidadeMedia = ((quantidadeMinima + quantidadeMaxima) / 2);

		if (quantidadeAtual >= quantidadeMedia) {
			System.out.println("N�o efetuar compra!");
		} else {
			System.out.println("Efetuar compra!");
		}

	}

	public static void q34() {
		/* Ler um valor e escrever se � positivo, negativo ou zero. */

		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite um numero: ");
		num = sc.nextInt();

		if (num > 0) {
			System.out.println("Positivo!");
		} else if (num < 0) {
			System.out.println("Negativo!");
		} else {
			System.out.println("Zero!");
		}
	}

	public static void q35() {
		/*
		 * Ler 3 valores (considere que n�o ser�o informados valores iguais) e escrever
		 * o maior deles.
		 */

		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, numMaior;
		System.out.println("Digite o primeiro numero: ");
		num1 = sc.nextInt();
		numMaior = num1;
		do {
			System.out.println("Digite o segundo numero: ");
			num2 = sc.nextInt();
		} while (num2 == num1);
		if (num2 > numMaior) {
			numMaior = num2;
		}
		do {
			System.out.println("Digite o terceiro numero: ");
			num3 = sc.nextInt();
		} while (num3 == num1 || num3 == num2);
		if (num3 > numMaior) {
			numMaior = num3;
		}
		System.out.println("O numero maior � " + numMaior);
	}

	public static void q36() {
		Scanner novo = new Scanner(System.in);
		double valor1;
		double valor2;
		double valor3;
		double soma;

		System.out.println("Valor1:");
		valor1 = novo.nextDouble();
		System.out.println("Valor2:");
		valor2 = novo.nextDouble();
		System.out.println("Valor3:");
		valor3 = novo.nextDouble();

		if ((valor1 < valor2) & (valor1 < valor3)) {

			soma = valor2 + valor3;
			System.out.println("A soma dos dois maiores numeros e: " + (soma));
		} else if ((valor2 < valor1) & (valor2 < valor3)) {
			soma = valor1 + valor3;
			System.out.println("A soma dos dois maiores numeros e: " + (soma));
		} else {
			soma = valor1 + valor2;
			System.out.println("A soma dos dois maiores valores e: " + soma);
		}
	}

	public static void q37() {
		/*
		 * Ler 3 valores (considere que n�o ser�o informados valores iguais) e
		 * escrev�-los em ordem crescente.
		 */

		double valor1;
		double valor2;
		double valor3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o 1� valor:  ");
		valor1 = sc.nextDouble();

		System.out.println("Digite o 2� valor:  ");
		valor2 = sc.nextDouble();

		System.out.println("Digite o 3� valor:  ");
		valor3 = sc.nextDouble();

		if ((valor1 > valor2) && (valor2 >= valor3)) {
			System.out.println(valor3 + " " + valor2 + " " + valor1);
		} else if ((valor2 >= valor1) && (valor2 > valor3) && (valor1 >= valor3)) {
			System.out.println(valor3 + " " + valor1 + " " + valor2);
		} else if ((valor2 > valor1) && (valor2 >= valor3) && (valor1 <= valor3)) {
			System.out.println(valor1 + " " + valor3 + " " + valor2);
		} else if ((valor2 < valor1) && (valor1 < valor3)) {
			System.out.println(valor2 + " " + valor1 + " " + valor3);
		} else if ((valor2 < valor3) && (valor3 <= valor1)) {
			System.out.println(valor2 + " " + valor3 + " " + valor1);
		} else {
			System.out.println(valor1 + " " + valor2 + " " + valor3);
		}

	}

	public static void q38() {
		/*
		 * Ler 3 valores (A, B e C) representando as medidas dos lados de um tri�ngulo e
		 * escrever se formam ou n�o um tri�ngulo. OBS: para formar um tri�ngulo, o
		 * valor de cada lado deve ser menor que a soma dos outros 2 lados.
		 */

		double l1;
		double l2;
		double l3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o 1� lado:  ");
		l1 = sc.nextDouble();

		System.out.println("Digite o 2� lado:  ");
		l2 = sc.nextDouble();

		System.out.println("Digite o 3� lado:  ");
		l3 = sc.nextDouble();

		if ((l1 < l2 + l3) && (l2 < l1 + l3) && (l3 < l1 + l2)) {
			System.out.println("� triangulo");
		} else {
			System.out.println("n�o � triangulo");
		}

	}

	public static void q39() {
		/*
		 * Ler o nome de 2 times e o n�mero de gols marcados na partida (para cada
		 * time). Escrever o nome do vencedor. Caso n�o haja vencedor dever� ser
		 * impressa a palavra EMPATE.
		 */

		String time1;
		String time2;
		int golT1;
		int golT2;

		Scanner sc = new Scanner(System.in);
		System.out.println("qual o 1� time:   ");
		time1 = sc.nextLine();

		System.out.println("qual o 2� time::  ");
		time2 = sc.nextLine();

		System.out.println("Quantos gols o  " + time1 + " fez: ");
		golT1 = sc.nextInt();

		System.out.println("Quantos gols o  " + time2 + " fez: ");
		golT2 = sc.nextInt();

		if ((golT1 > golT2)) {
			System.out.println(" O " + time1 + " ganhou ");
		} else if ((golT1 < golT2)) {
			System.out.println(" O " + time2 + " ganhou ");
		} else {
			System.out.println("houve empate.  ");
		}

	}

	public static void q40() {
		/*
		 * Ler dois valores e imprimir uma das tr�s mensagens a seguir: - �N�meros
		 * iguais�, caso os n�meros sejam iguais - �Primeiro � maior�, caso o primeiro
		 * seja maior que o segundo; - �Segundo maior�, caso o segundo seja maior que o
		 * primeiro.
		 */

		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);

		System.out.println("digite o 1� n�mero: ");
		num1 = sc.nextInt();

		System.out.println("digite o 2� n�mero: ");
		num2 = sc.nextInt();

		if ((num1 > num2)) {
			System.out.println(" Primeiro � maior");
		}

		else if ((num1 < num2)) {
			System.out.println(" segundo � maior");
		} else {
			System.out.println("n�meros iguais  ");
		}

	}

	public static void q41() {

		Scanner novo = new Scanner(System.in);
		int res;

		System.out.print("Digite x: ");
		int x = novo.nextInt();

		System.out.print("Digite y: ");
		int y = novo.nextInt();

		int z = (x * y) + 5;

		if (z <= 0) {
			res = 'A';
		} else if (z <= 100) {
			res = 'B';
		} else {
			res = 'C';
		}
		System.out.println(z + ", " + res);
	}

	public static void q42() {
		/*
		 * Escreva um algoritmo que leia o n�mero de litros vendidos e o tipo de
		 * combust�vel (codificado da seguinte forma: A-�lcool, G-gasolina), calcule e
		 * imprima o valor a ser pago pelo cliente sabendo-se que o pre�o do litro da
		 * gasolina � R$ 3,30 e o pre�o do litro do �lcool � R$ 2,90.
		 */

		Scanner novo = new Scanner(System.in);
		double desconto;
		int combustivel;
		System.out.print("N�mero de Litros vendidos: ");
		int litro = novo.nextInt();

		System.out.print("Combust�vel [1]-A [2]-G: ");
		combustivel = novo.nextInt();

		if (litro <= 20 && combustivel == 2) {
			desconto = 3.30 + (3.30 * 0.03);
			System.out.println("Desconto: " + desconto);
		} else if (litro > 20 && combustivel == 2) {
			desconto = 3.30 + (3.30 * 0.05);
			System.out.println("Desconto: " + desconto);
		} else if (litro <= 20 && combustivel == 1) {
			desconto = 2.90 + (2.90 * 0.04);
			System.out.println("Desconto: " + desconto);
		} else if (litro > 20 && combustivel == 2) {
			desconto = 2.90 + (2.90 * 0.06);
			System.out.println("Desconto: " + desconto);
		}
	}

	public static void q43() {
		/*
		 * Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres
		 * (considere que as idades dos homens ser�o sempre diferentes entre si, bem
		 * como as das mulheres). Calcule e escreva a soma das idades do homem mais
		 * velho com a mulher mais nova, e o produto das idades do homem mais novo com a
		 * mulher mais velha.
		 */

		Scanner novo = new Scanner(System.in);
		int idadeH1;
		int idadeH2;
		int idadeM1;
		int idadeM2;
		int velhoH;
		int velhoM;
		int novoH;
		int novoM;

		System.out.print("Idade Homem 1: ");
		idadeH1 = novo.nextInt();

		do {
			System.out.print("Idade Homem 2: ");
			idadeH2 = novo.nextInt();
		} while (idadeH1 == idadeH2);
		if (idadeH1 > idadeH2) {
			velhoH = idadeH1;
			novoH = idadeH2;
		} else {
			velhoH = idadeH2;
			novoH = idadeH1;
		}
		System.out.print("Idade Mulher 1: ");
		idadeM1 = novo.nextInt();

		do {
			System.out.print("Idade Mulher 2: ");
			idadeM2 = novo.nextInt();
		} while (idadeM1 == idadeM2);
		if (idadeM1 > idadeM2) {
			velhoM = idadeM1;
			novoM = idadeM2;
		} else {
			velhoM = idadeM2;
			novoM = idadeM1;
		}
		System.out.println("Soma 1: " + (velhoH + novoM));
		System.out.println("Soma 2: " + (novoH + velhoM));
	}

	public static void q44() {
		/*
		 * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra
		 * ultrapassar R$ 25,00, receber� ainda um desconto de 10% sobre este total.
		 * Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade
		 * (em Kg) de ma�as adquiridas e escreva o valor a ser pago pelo cliente
		 */

		Scanner novo = new Scanner(System.in);
		double precoMa = 1.80;
		double precoMo = 2.50;
		double pesoMa;
		double pesoMo;
		double totalMo;
		double totalMa;
		double precoFinal;

		System.out.print("Quantos Kilos de morango: ");
		pesoMo = novo.nextDouble();

		System.out.print("Quantos Kilos de ma��: ");
		pesoMa = novo.nextDouble();

		if (pesoMo > 5) {
			totalMo = (precoMo - 0.3) * pesoMo;
		} else {
			totalMo = precoMo * pesoMo;
		}

		if (pesoMa > 5) {
			totalMa = (precoMa - 0.3) * pesoMa;
		} else {
			totalMa = precoMa * pesoMa;
		}
		if ((totalMo + totalMa) > 25 || (pesoMo + pesoMa) > 8) {
			precoFinal = (totalMo + totalMa) * 0.9;
		} else {
			precoFinal = totalMo + totalMa;
		}

		System.out.println("Pre�o finl da compra: R$" + precoFinal);
	}

	public static void q45() {
		/*
		 * . Fa�a um algoritmo para ler um n�mero que � um c�digo de usu�rio. Caso este
		 * c�digo seja diferente de um c�digo armazenado internamente no algoritmo
		 * (igual a 1234) deve ser apresentada a mensagem �Usu�rio inv�lido!�. Caso o
		 * C�digo seja correto, deve ser lido outro valor que � a senha. Se esta senha
		 * estiver incorreta (a certa � 9999) deve ser mostrada a mensagem �senha
		 * incorreta�. Caso a senha esteja correta, deve ser mostrada a mensagem �Acesso
		 * permitido�
		 */

		Scanner novo = new Scanner(System.in);
		int usu;
		int senha;
		int cont = 0;

		do {
			if (cont > 0)
				System.out.println("USUARIO INVALIDO !!!");
			System.out.print("Usuario: ");
			usu = novo.nextInt();
			cont++;
		} while (usu != 1234);
		cont = 0;
		do {
			if (cont > 0)
				System.out.println("SENHA INVALIDA !!!");
			System.out.print("Senha: ");
			senha = novo.nextInt();
			cont++;
		} while (senha != 9999);
		System.out.println("ACESSO PERMITIDO !!!");
	}

	public static void q46() {
		/*
		 * Para A = V, B = V e C = F, qual o resultado da avalia��o das seguintes
		 * express�es: 1. (A e B) ou (A xou B) 2. (A ou B) e (A e C) 3. A ou C e B ou A
		 * e n�o B
		 */

		System.out.println("VERDADEIRO\nFALSO\nFALSO");
	}

	public static void q47() {
		/*
		 * . Fa�a um algoritmo para ler: a descri��o do produto (nome), a quantidade
		 * adquirida e o pre�o unit�rio. Calcular e escrever o total (total = quantidade
		 * adquirida * pre�o unit�rio), o desconto e o total a pagar (total a pagar =
		 * total - desconto), sabendo-se que: - Se quantidade <= 5 o desconto ser� de 2%
		 * - Se quantidade > 5 e quantidade <=10 o desconto ser� de 3% - Se quantidade >
		 * 10 o desconto ser� de 5%
		 */

		Scanner novo = new Scanner(System.in);
		double descMenor5 = 0.02;
		double descMenor10 = 0.03;
		double descMaior10 = 0.05;
		String produto;
		int quantidade;
		double preco;
		double total;
		double descont = 0;

		System.out.println("Nome do produto: ");
		produto = novo.nextLine();
		System.out.println("Quantidade: ");
		quantidade = novo.nextInt();
		System.out.println("Pre�o Unitario: ");
		preco = novo.nextDouble();

		total = quantidade * preco;

		if (quantidade <= 5) {
			descont = total * descMenor5;
		}
		if (quantidade > 5 && quantidade <= 10) {
			descont = total * descMenor10;
		}
		if (quantidade > 10) {
			descont = total * descMaior10;
		}
		System.out.println("Produto: " + produto);
		System.out.println("Pre�o unit�rio: " + preco);
		System.out.println("Total: " + total);
		System.out.println("Desconto: " + descont);
		System.out.println("Total a pagar: " + (total - descont));

	}

	public static void q48() {
		/*
		 * Uma empresa quer verificar se um empregado est� qualificado para a
		 * aposentadoria ou n�o. Para estar em condi��es, um dos seguintes requisitos
		 * deve ser satisfeito: - Ter no m�nimo 65 anos de idade. - Ter trabalhado no
		 * m�nimo 30 anos. - Ter no m�nimo 60 anos e ter trabalhado no m�nimo 25 anos.
		 * Com base nas informa��es acima, fa�a um algoritmo que leia: o n�mero do
		 * empregado (c�digo), o ano de seu nascimento e o ano de seu ingresso na
		 * empresa. O programa dever� escrever a idade e o tempo de trabalho do
		 * empregado e a mensagem 'Requerer aposentadoria' ou 'N�o requerer'.
		 */

		Scanner novo = new Scanner(System.in);
		int ano = 2011;

		System.out.println("Entre com seu codigo: ");
		int codigo = novo.nextInt();

		System.out.println("Entre com a data de nascimento: ");
		int data = novo.nextInt();

		System.out.println("Entre com o Ano de ingresso na empresa: ");
		int tempo = novo.nextInt();

		if (ano - data >= 16) {
			if (ano - data >= 65) {
				System.out.println("Requer Aposentadoria");
			} else {
				if (ano - tempo >= 30) {
					System.out.println("Requer Aposentadoria");
				} else {
					if ((ano - data >= 60) && (ano - tempo >= 25)) {
						System.out.println("Requer Aposentadoria");
					} else {
						System.out.println("N�O Requer Aposentadoria");
					}
				}
			}
		} else {
			System.out.println("Voc� n�o tem idade para trabalhar");
		}
	}

	public static void q49() {
		/* */

		Scanner novo = new Scanner(System.in);
		double a;
		double b;
		double c;
		String mens;

		System.out.println("Informe os lados do tri�ngulo:");
		a = novo.nextDouble();
		b = novo.nextDouble();
		c = novo.nextDouble();

		if ((a < b + c) & (b < a + c) & (c < a + b)) {
			if ((a == b) & (b == c)) {
				mens = "tri�ngulo equil�tero";
			} else if ((a == b) || (b == c) || (a == c)) {
				mens = "Tri�ngulo is�seles";
			} else {
				mens = "Tri�ngulo escaleno";
			}
		} else {
			mens = "N�o � poss�vel formar um tri�ngulo";
		}
		System.out.println(mens);

		System.out.println("*****RESPOSTAS*****");
		System.out.println("N�o � poss�vel formar um tri�ngulo");
		System.out.println("Tri�ngulo escaleno");
		System.out.println("Tri�ngulo is�seles");
		System.out.println("Tri�ngulo equil�tero");
		System.out.println("Tri�ngulo is�seles");
	}

	public static void q50() {
		/*
		 * Escreva um algoritmo para ler 2 valores e se o segundo valor informado for
		 * ZERO, deve ser lido um novo valor, ou seja, para o segundo valor n�o pode ser
		 * aceito o valor zero e imprimir o resultado da divis�o do primeiro valor lido
		 * pelo segundo valor lido. (utilizar a estrutura REPITA).
		 */

		Scanner novo = new Scanner(System.in);
		System.out.print("Digite: ");
		double n1 = novo.nextInt();
		double n2;
		do {
			System.out.print("Digite: ");
			n2 = novo.nextInt();
		} while (n2 == 0);

		System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
	}

	public static void q51() {
		/* Reescreva o exerc�cio anterior utilizando a estrutura ENQUANTO. */

		Scanner novo = new Scanner(System.in);
		System.out.print("Digite: ");
		double n1 = novo.nextInt();
		double n2;
		do {
			System.out.print("Digite: ");
			n2 = novo.nextInt();
		} while (n2 == 0);

		System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
	}

	public static void q52() {
		/*
		 * Acrescentar uma mensagem de 'VALOR INV�LIDO' no exerc�cio [41] caso o segundo
		 * valor informado seja ZERO.
		 */

		Scanner novo = new Scanner(System.in);
		int res;

		System.out.print("Digite x: ");
		int x = novo.nextInt();
		int y;
		do {
			System.out.print("Digite y: ");
			y = novo.nextInt();

		} while (y == 0);
		int z = (x * y) + 5;

		if (z <= 0) {
			res = 'A';
		} else if (z <= 100) {
			res = 'B';
		} else {
			res = 'C';
		}
		System.out.println(z + ", " + res);
	}

	public static void q53() {
		/*
		 * Acrescentar uma mensagem de 'VALOR INV�LIDO' no exerc�cio [42] caso o segundo
		 * valor informado seja ZERO
		 */

		Scanner novo = new Scanner(System.in);
		double desconto;
		int combustivel;
		System.out.print("N�mero de Litros vendidos: ");
		int litro = novo.nextInt();

		System.out.print("Combust�vel [1]-A [2]-G: ");
		combustivel = novo.nextInt();

		if (litro <= 20 && combustivel == 2) {
			desconto = 3.30 + (3.30 * 0.03);
			System.out.println("Desconto: " + desconto);
		} else if (litro > 20 && combustivel == 2) {
			desconto = 3.30 + (3.30 * 0.05);
			System.out.println("Desconto: " + desconto);
		} else if (litro <= 20 && combustivel == 1) {
			desconto = 2.90 + (2.90 * 0.04);
			System.out.println("Desconto: " + desconto);
		} else if (litro > 20 && combustivel == 2) {
			desconto = 2.90 + (2.90 * 0.06);
			System.out.println("Desconto: " + desconto);
		}
	}

	public static void q54() {
		/*
		 * Escreva um algoritmo para ler as notas da 1a. e 2a. avalia��es de um aluno,
		 * calcule e imprima a m�dia (simples) desse aluno. S� devem ser aceitos valores
		 * v�lidos durante a leitura (0 a 10) para cada nota.
		 */

		Scanner novo = new Scanner(System.in);
		double nota1;
		double nota2;
		do {
			System.out.println("Nota 1: ");
			nota1 = novo.nextDouble();
			System.out.println("Nota 2: ");
			nota2 = novo.nextDouble();
		} while (nota1 < 0 || nota2 < 0 || nota1 > 10 || nota2 > 10);

		System.out.println("M�dia Simples: " + (nota1 + nota2) / 2);

	}

	public static void q55() {
		/*
		 * Acrescente uma mensagem 'NOVO C�LCULO (S/N)?' ao final do exerc�cio [45]. Se
		 * for respondido 'S' deve retornar e executar um novo c�lculo, caso contr�rio
		 * dever� encerrar o algoritmo.
		 */

		Scanner novo = new Scanner(System.in);

		int usu;
		int senha;
		int cont = 0;

		do {
			if (cont > 0)
				System.out.println("USUARIO INVALIDO !!!");
			System.out.print("Usuario: ");
			usu = novo.nextInt();
			cont++;
		} while (usu != 1234);
		cont = 0;
		do {
			if (cont > 0)
				System.out.println("SENHA INVALIDA !!!");
			System.out.print("Senha: ");
			senha = novo.nextInt();
			cont++;
		} while (senha != 9999);
		System.out.println("ACESSO PERMITIDO !!!");
	}

}
