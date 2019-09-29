package lista1deprog2;
import java.util.Scanner;

public class Lista1DeProg2 {
static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        
        
    System.out.println("INFORME OS DASDOS A BAIXO");
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
    
    static void q1(){
        System.out.println("PRIMEIRO NUMERO:");
        double num1 = sc.nextDouble();
        
        System.out.println("SEGUNDO NUMERO:");
        double num2 = sc.nextDouble();
        
        System.out.println("A SOMA DE:\t\t"+(num1)+" + "+ (num2)+" = "+(num1 + num2));
        System.out.println("A SUBTRAÇÃO DE:\t\t"+(num1)+" - "+ (num2)+" = "+(num1 - num2));
        System.out.println("A MULTIPLICAÇÃO DE:\t"+(num1)+" x "+ (num2)+" = "+(num1 * num2));
        System.out.println("A DIVISÃO DE:\t\t"+(num1)+" / "+ (num2)+" = "+(num1 / num2));
    }
    
    static void q2(){
        System.out.println("TOTAL DO PERCUSO PERCORRIDO(KM):");
        double km = sc.nextDouble();
        
        System.out.println("COMBUSTIVEL GASTO(L):");
        double comb = sc.nextDouble();
        
        System.out.println("O CONSUMO MÉDIO FOI DE:\t"+(km/comb)+"KM/L");
    }
    
    static void q3(){
        System.out.println("NOME COMPLETO DO FUNCIONÁRIO:");
        String nome = sc.nextLine();
        
        System.out.println("SALÁRIO FIXO(EM REAIS(R$)):");
        double salFixo = sc.nextDouble();
        
        System.out.println("VALOR TOTAL DAS VENDAS REALIZADAS NESTE MÊS(EM REAIS(R$)):");
        double valTotalVendas = sc.nextDouble();
        
        System.out.println("\n\nO FUNCIONARIO: "+(nome)+"\nPOSSUI: "+(salFixo)+" DE SALÁRIO FIXO\nE DEVERÁ RECEBER: "+(salFixo+(valTotalVendas * 0.15)+" COMO SALÁRIO FINAL."));
    }
    
    static void q4(){
        System.out.println("TEMPERATURA EM GRAUS CELSIUS:");
        double grausC = sc.nextDouble();
        
        System.out.println("A TEMPERATURA "+(grausC)+"C = "+(((9*grausC)+160)/5)+"F");
    }
    
    static void q5(){
        System.out.println("VALOR EM RAIS(R$) QUE DESEJA SER COTADO:");
        double reais = sc.nextDouble();
        
        System.out.println("QUANTO ESTA VALENDO 1,00R$ EM DOALR(US$) ATUALMENTE?");
        double dolar = sc.nextDouble();
        
        double reaisConvertido = reais * dolar;
        System.out.println(reaisConvertido);
        double VALORDISPONIVEL = 1000;
        
        
        if(VALORDISPONIVEL >= reaisConvertido){
             System.out.println("COTAÇÃO CONCLUIDA");
             System.out.println((reais)+ " = " + (reaisConvertido));
             VALORDISPONIVEL -= reaisConvertido;
        }else{
        System.out.println("COTAÇÃO NÃO CONCLUIDA\nOBS: no memento a quantidade de dolar(US$) é insuficiente para efetuar essa operação");
        }
            
        
    }
    
    static void q6(){
        System.out.println("VALOR(EM R$) DEPOSITADO:");
        double valDepo = sc.nextDouble();
        
        System.out.println("AO FIM DO MÊS O SEU VALOR SERÁ:" + ((valDepo*0.0070)+ valDepo));
        
    }
    
    static void q7(){
        
        System.out.println("VALOR DA COMPRA(R$):");
        double valComp = sc.nextDouble();
        
        System.out.println((valComp)+ " FICA EM 5 PARCELAS DE " +(valComp/5)+"R$ sem juros");
}
    
    static void q8(){
        System.out.println("CUSTO DO PRODUTO(R$)");
        double custo = sc.nextDouble();
        
        System.out.println("PERCENTUAL QUE SERÁ ACRESCENTADO NO CUSTO DO PRODUTO");
        double percentual = sc.nextDouble();
        
        percentual /= 100;
        
        System.out.println("O VALOR DO PRODUTO É:"+(( percentual * custo)+ custo));
        
}

    static void q9(){
        System.out.println("CUSTO DE FÁBRICA:");
        double custFabric = sc.nextDouble();
        
        System.out.println("O CUSTO AO CONSUMIDOR SERÁ DE:"+(custFabric + (custFabric*0.28)+(custFabric*0.45))+"R$");
        
    }
    
    static void q10(){
        
        double A = 10, B = 20, C = A;
        
        System.out.println("A = "+ (A = B));
        System.out.println("B = "+ (B = C ));
    }
    
    static void q11(){
        System.out.println("\t\t\t11");
        System.out.println("a.120\t\tb.67, 34, 79\t\tc.500");
        System.out.println("  100,234\t\t\t\t 140,500\t\td.-22");
        System.out.println("\t\t\t\t\t 300, 140, 440");
    }
    
    static void q12(){
        System.out.println("\t\t12");
        System.out.println("a. SIM\t\tb.NÃO\t\tc.NÃO");
    }
    
    static void q13(){
        System.out.println("\t\t13.");
        System.out.println("A) A ← 6*(3+2)\nB) B ← 2+6*(3+2)\nC) C ← 2+ 3*6 /(2+4) \nD) D ← 2*(8/(3+1))\nE) E ← 3+(16-2)/2*(9-2) \nF) F ← 6/3 + 8/2\nG) G ← (3+(8/2))*4+3*2 \nH) H ← 6*(3*3)+6-10\nI) I ← (10*8+3)*9 \nJ) J ← -12*(-4)+ 3*(-4)");
    }
    
    static void q14(){
        System.out.println("UM NUMERO QUALQUE:");
        double valor =sc.nextDouble();
        
        System.out.println("O ANTECESSOR DE É:\t"+(valor-1)+ "\nO SUCESSOR DE:  É:\t"+(valor+1));
    }
    
    static void q15(){
        System.out.println("A MEDIDA DA BASE DO RETÂNGULO");
        double baseRetangulo = sc.nextDouble();
        
        System.out.println("A MEDIDA DA ALTUDA");
        double alturaRetangulo = sc.nextDouble();
        
        System.out.println("A AREA DO RETANGULO É DE "+(alturaRetangulo * baseRetangulo ));
    }
    
    static void q16(){
        System.out.println("QUANTIDADE DE ANOS:");
        int ano = sc.nextInt();
        
        System.out.println("QUANTIDADE DE MESES:");
        int mes = sc.nextInt();
        
        System.out.println("QUANTIDADE DE DIAS:");
        int dias = sc.nextInt();
        
        System.out.println("SUA EXPRESSA EM DIAS É:\t" + (ano*365 + mes * 30 + dias));
    }
    
    static void q17(){
        
        System.out.println("NUMERO TOTAL DE ELEITORES:");
        double totalEleitor = sc.nextDouble();
        
        System.out.println("TOTAL DE VOTOS EM BRANCO:");
        int votoBranco = sc.nextInt();
        
        System.out.println("TOTAL DE VOTOS NULOS:");
        int votoNulo = sc.nextInt();
        
        System.out.println("TOTAL DE VOTOS VÁLIDOS");
        int votoValido = sc.nextInt();
        
        System.out.println("RELAÇÃO\n\nPERCENTUAL DE VOTOS EM BRANCO:\t"+((votoBranco * 100)/totalEleitor)+"%");
        System.out.println("OERCENTUAL DE VOTOS NULOS:\t"+((votoNulo*100)/totalEleitor)+"%");
        System.out.println("OERCENTUAL DE VOTOS VÁLIDOS:\t"+((votoValido*100)/totalEleitor)+"%");
    }
    
    static void q18(){
        System.out.println("SALÁRIO MENSAL ATUAL EM R$:");
        double salAtual = sc.nextDouble();
        
        System.out.println("PERCENTUAL DE REAJUSTE EM %:");
        double reajuste = sc.nextDouble();
        
        System.out.println("SEU NOVO SALÁRIO SERÁ:"+ ((salAtual*reajuste/100) + salAtual)+"R$");
    }
    
    static void q19(){
    
        System.out.println("CUSTO DE FÁBRICA:");
        double custoDeFab = sc.nextDouble();
        
        System.out.println("CUSTO FINAL:\t"+ (custoDeFab * 0.28 + custoDeFab * 0.45 + custoDeFab));
        
    }
    
    static void q20(){
     
        System.out.println("SALÁRIO FIXO(R$):");
        double salFixo = sc.nextDouble();
        
        System.out.println("NUMERO DE CARROS VENDIDOS:");
        int carroVend = sc.nextInt();
        
        System.out.println("VALOR TOTAL DA VENDA(R$):");
        double totalVenda = sc.nextDouble();
        
        System.out.println("COMISSÃO FIXA(R$/CAR)");
        double comissao = sc.nextDouble();
        
        System.out.println("SALÁRIO FINAL:\t"+ (salFixo + comissao*carroVend + 0.5*totalVenda));
        
    }

    static void q21(){
        System.out.println("UM VALOR QUALQUER:");
        float valor = sc.nextFloat();
        
        if(valor>10){
            System.out.println("É MAIOR QUE 10!");
        }else{
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }
    
    static void q22() {
        
        System.out.println("UM VALOR QUALQUER:");
        float valor = sc.nextFloat();
        
        if (valor<0){
        System.out.println("\n\n"+(valor)+":\tÉ NEGATIVO");
    }else{
            System.out.println((valor)+":\tÉ POSSITIVO");
        } 
    }
    
    static void q23(){
        System.out.println("NUMERO DE MAÇAS COMPRADAS:");
        int numeroDeMaca = sc.nextInt();
        
        if(numeroDeMaca < 12){
            System.out.println("CUSTO TOTAL:\t"+(float) (numeroDeMaca * 1.30)+"R$");
        }else{
            System.out.println("CUSTO TOTAL:\t"+(float) (numeroDeMaca * 1)+"R$");
        }
    }
    
    static void q24(){
        System.out.println("PRIMEIRA NOTA:");
        float nota1 = sc.nextFloat();
        
        System.out.println("SEGUNDA NOTA");
        float nota2 = sc.nextFloat();
        
        if (((nota1+nota2)/2) < 6){
            System.out.println("ALUNO REPROVADO COM A MEDIA DE:\t"+(nota1+nota2)/2);
        }else{
            System.out.println("ALUNO APROVADO COM A MEDIA DE:\t"+(nota1+nota2)/2);
        }
        
    }
    
    static void q25(){
        System.out.println("ANO ATUAL:");
        int anoAtual = sc.nextInt();
        
        System.out.println("ANO DE NASCIMENTO:");
        int anoNascimento = sc.nextInt();
        
        if ((anoAtual-anoNascimento)<16){
            System.out.println("NÃO PODERÁ VOTAR");
        }else{
            System.out.println("PODERÁ VOTAR");
        }
    }
    
    static void q26(){
        System.out.println("UM VALOR QUALQUER");
        float valor1 = sc.nextFloat();
        
        System.out.println("OUTRO VALOR QUALQUER");
        float valor2 = sc.nextFloat();
        
        float maior = (valor1>valor2)? valor1:valor2;
        
        System.out.println("O MAIOR É"+(maior));
    }
    
    static void q27(){
        System.out.println("UM VALOR QUALQUER");
        int valor1 = sc.nextInt();
        
        System.out.println("OUTRO VALOR QUALQUER");
        int valor2 = sc.nextInt();
        
        if (valor1<valor2){System.out.println("ORDEM CRESCENTE É:"+valor1 +" "+ valor2);
        }else{
            System.out.println("ORDEM CRESCENTE É:"+valor2 +" "+ valor1);
        }
    }
    
    static void q28(){
        System.out.println("HORA DE INICIO DO JOGO:");
        int horaInicio = sc.nextInt();
        
        System.out.println("HORA DO TERMINO DO JOGO:");
        int horaTermino = sc.nextInt();
        
        if ((horaTermino - horaInicio) >= 24){
            System.out.println("TEMPO MAXIMO ATINGIDO");
        }else{
        System.out.println("A DURAÇÃO DO JOGO FOI DE: "+ (horaTermino - horaInicio)+"H");
    }
    }
    
    static void q29(){
        
        System.out.println("NUMEDO DE HORAS TRABALHADAS NO MÊS:");
        int horasTrab = sc.nextInt();
        
        
        System.out.println("SÁLARIO POR HORA EM REAIS(R$)");
        float salPorHoras = sc.nextFloat();
        
        if (horasTrab > 160 ){
            System.out.println("SALÁRIO FINAL:\t"+((horasTrab * salPorHoras)+(((horasTrab-160)*salPorHoras)*0.5)));
            }else{
            System.out.println("SALÁRIO FINAL:\t"+(salPorHoras* horasTrab));
        }
    }
    
    static void q30(){
        System.out.println("O ERRO FOI: SE NÃO COM ACENTO E NÃO FOI DECLARADO AS VÁRIAVEIS");
    }
    
    static void q31(){
        System.out.println("SALÁRIO FIXO");
        float salFixo = sc.nextFloat();
        
        System.out.println("VALOR TOTAL DE VENDAS EFETUADAS");
        float vendEfetuadas = sc.nextFloat ();
        
        float acrecimo3 = vendEfetuadas - 1500;
        
        if (vendEfetuadas <= 1500){
            System.out.println("SALÁRIO FINAL:\t"+(vendEfetuadas *0.03 + salFixo));
        }else{
            System.out.println(""+(( 1500  * 0.03 + salFixo + (vendEfetuadas-1500) * 0.05)));
        }
    }
    
    static void q32() {
        System.out.println("AGENCIA BANCÁRIA:");
        int agencia = sc.nextInt();
        
        System.out.println("TIPO DA CONTA:");
        int tipoDaConta = sc.nextInt();
        
        System.out.println("NUMERO DA CONTA:");
        int numDaConta = sc.nextInt();
        
        System.out.println("SALDO ATUAL:");
        float saldo = sc.nextFloat();
        
        System.out.println("VALOR DO DÉBITO:");
        float valDebito = sc.nextFloat();
        
        System.out.println("VALOR DO CREDITO:");
        float valCredito = sc.nextFloat();
        
        float saldoAtual = saldo - (valDebito + valCredito);
        
        if (saldoAtual >= 0){
            System.out.println("SALDO POSSITIVO");
        }else {
            System.out.println("SALDO NEGATIVO");
        }
    }
    
    static void q33(){
        
        System.out.println("QUANTIDADE ATUAL EM ESTOQUE:");
        int quantAtual = sc.nextInt();
        
        System.out.println("QUANTIDADE ATUAL EM MÁXIMA:");
        int quantMaxima = sc.nextInt();
        
        System.out.println("QUANTIDADE ATUAL EM MINIMA:");
        int quantMinima = sc.nextInt();
        
        
        float quantMedia= (quantMaxima+quantMinima)/2;
        
        if (quantAtual >= quantMedia){
            System.out.println("NÃO EFETUAR COMPRA");
        }else{
            System.out.println("EFETUAR COMPRA");
        }
    }
    
    static void q34(){
        
        System.out.println("UM VALOR QUALQUER:");
        float valQualquer = sc.nextFloat();
        
        if (valQualquer > 0){
            System.out.println((valQualquer)+" É POSITICO");
        }else if (valQualquer < 0){
            System.out.println((valQualquer)+" É NEGATIVO");
        }else{
            
            System.out.println((valQualquer)+" IGUAL A ZERO");
        }
    }
    
    static void q35(){
        
        System.out.println("UM VALOR QUALQUER");
        float valor1 = sc.nextFloat();
        
        System.out.println("OUTRO VALOR QUALQUER");
        float valor2 = sc.nextFloat();
        
        System.out.println("MAIS UM VALOR QUALQUER");
        float valor3 = sc.nextFloat();
        
        if (valor1 > valor2 && valor1 >valor3){
            System.out.println("O MAIOR É:\t"+(valor1));
        }
        else if (valor2 > valor1 && valor2 >valor3){
            System.out.println("O MAIOR É:\t"+(valor2));
        }else{
             System.out.println("O MAIOR É:\t"+(valor3));
        }
    }
    
    static void q36(){
     
        System.out.println("UM VALOR QUALQUER");
        float valor1 = sc.nextFloat();
        
        System.out.println("OUTRO VALOR QUALQUER");
        float valor2 = sc.nextFloat();
        
        System.out.println("MAIS UM VALOR QUALQUER");
        float valor3 = sc.nextFloat();
        
        if(valor1 > valor2 && valor2 > valor3){
            float soma = valor1 + valor2;
            System.out.println("A SOMA DOS MAIORES RESULTA EM:\t"+(soma));
        }else if(valor2 > valor1 && valor1 > valor3){
            float soma = valor1 + valor2;
            System.out.println("A SOMA DOS MAIORES RESULTA EM:\t"+(soma));
        }
        
        else if(valor1 > valor3 && valor3 > valor2){
            float soma = valor1 + valor3;
            System.out.println("A SOMA DOS MAIORES RESULTA EM:\t"+(soma));
        }else if(valor3 > valor1 && valor1 > valor2){
            float soma = valor1 + valor3;
            System.out.println("A SOMA DOS MAIORES RESULTA EM:\t"+(soma));
        }
        
        else if(valor2 > valor3 && valor3 > valor1){
            float soma = valor2 + valor3;
            System.out.println("A SOMA DOS MAIORES RESULTA EM:\t"+(soma));
        }else if(valor3 > valor2 && valor2 > valor1){
            float soma = valor2 + valor3;
            System.out.println("A SOMA DOS MAIORES RESULTA EM:\t"+(soma));
        }
    }
    
    static void q37(){
        System.out.println("UM VALOR QUALQUER");
        float valor1 = sc.nextFloat();
        
        System.out.println("OUTRO VALOR QUALQUER");
        float valor2 = sc.nextFloat();
        
        System.out.println("MAIS UM VALOR QUALQUER");
        float valor3 = sc.nextFloat();
        
        if (valor1 > valor2 && valor2>valor3){
            System.out.println("OS NUMEROS INFORMADOS EM ORDEM CRESCENTE É IGUAL:\n"+(valor3)+", "+( valor2)+", "+(valor1));
        }else if (valor2 > valor1 && valor1 >valor3){
            System.out.println("OS NUMEROS INFORMADOS EM ORDEM CRESCENTE É IGUAL:\n"+(valor3)+", "+( valor1)+", "+(valor2));
        }
        
        else if (valor1 > valor3 && valor3 >valor2){
            System.out.println("OS NUMEROS INFORMADOS EM ORDEM CRESCENTE É IGUAL:\n"+(valor2)+", "+( valor3)+", "+(valor1));
        }else if (valor3 > valor1 && valor1 >valor2){
            System.out.println("OS NUMEROS INFORMADOS EM ORDEM CRESCENTE É IGUAL:\n"+(valor2)+", "+( valor1)+", "+(valor3));
        }
        
        
        else if (valor2 > valor3 && valor3 >valor1){
            System.out.println("OS NUMEROS INFORMADOS EM ORDEM CRESCENTE É IGUAL:\n"+(valor1)+", "+( valor3)+", "+(valor2));
        }else if (valor3 > valor2 && valor2 >valor1){
            System.out.println("OS NUMEROS INFORMADOS EM ORDEM CRESCENTE É IGUAL:\n"+(valor1)+", "+( valor2)+", "+(valor3));
        }
    }
    
    static void q38(){
        
         System.out.println("UM VALOR QUALQUER:");
        float a = sc.nextFloat();
        
        System.out.println("OUTRO VALOR QUALQUER:");
        float b = sc.nextFloat();
        
        System.out.println("MAIS UM VALOR QUALQUER:");
        float c = sc.nextFloat();
      
        if (a < (b+c)){
            if (b < (a+c)){
                if (c < (b+a)){
                    System.out.println("FORMA UM TRIÂNGULO");
                    }else{
                    System.out.println("NÃO É UM TRIANGULO");
                }
                }else{
                    System.out.println("NÃO É UM TRIANGULO");
                }
        }else{
                    System.out.println("NÃO É UM TRIANGULO");
                }
    }
    
    static void q39(){
        System.out.println("NOME DO PRIMEIRO TIME:");
        String nomeTime1 = sc.nextLine();
        System.out.println("NOME DO SEGUNDO TIME:");
        String nomeTime2 = sc.nextLine();
        
        System.out.println("QUANTIDADE DE GOLS FEITO DO TIME:"+(nomeTime1));
        int goolsTime1 = sc.nextInt();
        System.out.println("QUANTIDADE DE GOLS FEITO DO TIME:"+(nomeTime2));
        int goolsTime2 = sc.nextInt();
        
        
        if (goolsTime2 > goolsTime1){
            System.out.println("O VENCEDOR É O TIME:\t" +(nomeTime2)+" COM "+(goolsTime2)+"GOOLS");
        }else if(goolsTime1 > goolsTime2){
            System.out.println("O VENCEDOR É O TIME:\t" +(nomeTime1)+" COM "+(goolsTime1)+"GOOLS");
        }else{
            System.out.println("EMPATE");
        }
    }
    
    static void q40(){
        
        System.out.println("UM VALOR QUALQUER:");
        float primeiroNum = sc.nextFloat();
        
        System.out.println("OUTRO VALOR QUALQUER:");
        float segundoNum = sc.nextFloat();
        
        if (primeiroNum > segundoNum){
            System.out.println("PRIMEIRO É MAIOR");
        }else if (primeiroNum < segundoNum){
            System.out.println("SEGUNDO É MAIOR");
        }else{
            System.out.println("NUMEROS IGUAIS");
        }
        
    }
    
    static void q41(){
        System.out.println("\t\tVARIAVEIS");
        System.out.println("X\t|\tY\t|\tZ\t|\tRESPOSTA");
        System.out.println("3\t|\t2\t|\t10\t|\t   B");
        System.out.println("150\t|\t3\t|\t455\t|\t   C");
        System.out.println("7\t|\t-1\t|\t-2\t|\t   A");
        System.out.println("-2\t|\t5\t|\t-5\t|\t   A");
        System.out.println("50\t|\t3\t|\t155\t|\t   C");
    }
    
    static void q42(){
        
        System.out.println("TIPO DE COMBUSTIVEL\n(A)ALCOOL\t\t(G)GÁSOLINA");
        String tipoComb = sc.nextLine();
        
        System.out.println("NUMERO DE LITROS VENDIDOS:");
        float litroDeComb = sc.nextFloat();
        
        switch (tipoComb){
            case "A":
                if (litroDeComb <= 20){
                    System.out.println("VALOR A SER PAGO: "+(litroDeComb * 3.201)+"R$");
                }else{
                    System.out.println("VALOR A SER PAGO: "+(litroDeComb * 3.135)+"R$");
                }
            break;
            case "a":
                if (litroDeComb <= 20){
                    System.out.println("VALOR A SER PAGO: "+(litroDeComb * 3.201)+"R$");
                }else{
                    System.out.println("VALOR A SER PAGO: "+(litroDeComb * 3.135)+"R$");
                }
            break;
            case "G":
                if (litroDeComb <= 20){
                    System.out.println("VALOR A SER PAGO: "+(litroDeComb * 2.894)+"R$");
                }else{
                    System.out.println("VALOR A SER PAGO: "+(litroDeComb * 2.726)+"R$");
                }
                break;
            case "g":
                if (litroDeComb <= 20){
                    System.out.println("VALOR A SER PAGO: "+(litroDeComb * 2.894)+"R$");
                }else{
                    System.out.println("VALOR A SER PAGO: "+(litroDeComb * 2.726)+"R$");
                }
                break;
        }
        
    }
    
    static void q43(){
        
        System.out.println("IDADE DO PRIMEIRO HOMEM:");
        int idadeHomem1 = sc.nextInt();
        
        System.out.println("IDADE DO SEGUNDO HOMEM:");
        int idadeHomem2 = sc.nextInt();
        
        System.out.println("IDADE DA PRIMEIRA MULHER:");
        int idadeMulher1 = sc.nextInt();
        
        System.out.println("IDADE DA SEGUNDA MULHER:");
        int idadeMulher2 = sc.nextInt();
        
        if (idadeHomem1>idadeHomem2){
            if(idadeMulher1>idadeMulher2){
                System.out.println("SOMA DA IDADE DO HOMEM MAIS VELHO COM A IDADE DA MULHER MAIS NOVA:\t"+(idadeHomem1 + idadeMulher2));
                System.out.println("PROSUTO DA IDADE DO HOMEM MAIS NOVO COM A IDADE DA MULHER MAIS VELHA:\t"+(idadeHomem2 * idadeMulher1));
            }else{
                System.out.println("SOMA DA IDADE DO HOMEM MAIS VELHO COM A IDADE DA MULHER MAIS NOVA:\t"+(idadeHomem1 + idadeMulher1));
                System.out.println("PROSUTO DA IDADE DO HOMEM MAIS NOVO COM A IDADE DA MULHER MAIS VELHA:\t"+(idadeHomem2 * idadeMulher2));
            }
        }else if(idadeHomem2>idadeHomem1){
            
            if (idadeMulher1>idadeMulher2){
                System.out.println("SOMA DA IDADE DO HOMEM MAIS VELHO COM A IDADE DA MULHER MAIS NOVA:\t"+(idadeHomem2+idadeMulher2));
                System.out.println("PROSUTO DA IDADE DO HOMEM MAIS NOVO COM A IDADE DA MULHER MAIS VELHA:\\t"+(idadeHomem1*idadeMulher1));
            }else{
                System.out.println("SOMA DA IDADE DO HOMEM MAIS VELHO COM A IDADE DA MULHER MAIS NOVA:\t"+(idadeHomem2+idadeMulher1));
                System.out.println("PROSUTO DA IDADE DO HOMEM MAIS NOVO COM A IDADE DA MULHER MAIS VELHA:\\t"+(idadeHomem1*idadeMulher2));
            
            }
            
        }
        
        
        
    }
    
    static void q44(){
        
        System.out.println("QUANTIDADE DE MAÇÃS EM KG:");
        double kgMaca = sc.nextDouble();
        
        System.out.println("QUANTIDADE DE MORANGO EM KG:");
        double kgMorango = sc.nextDouble();
        
        double valorMaca = 0;
        double valorMorango = 0;
        
        if(kgMaca <=5){
            valorMaca = kgMaca * 2.50;
        }else{
            valorMaca = kgMaca*2.20;
        }
        
        if(kgMorango <=5){
            valorMorango = kgMorango * 1.80;
        }else{
            valorMorango = kgMorango* 2.20;
        }
        double kgTotal =  kgMorango+kgMaca;
        double valorTotal = valorMorango + valorMaca;
        
        if (valorTotal > 25 ||kgTotal > 8 ){
            System.out.println("TOTAL A PAGAS"+(valorTotal - (valorTotal*0.1))+"RS");
        }
    }
    
    static void q45(){
        
        System.out.println("CÓDIGO DO USÚARIO");
        int codDigitado = sc. nextInt ();
        
        int codUsuario = 1234;
        int senhaUsuario = 9999;
        
        if (codDigitado == codUsuario){
        System.out.println("INFORME SUA SENHA:");
        int senhaDigitada = sc.nextInt();
            if (senhaDigitada == senhaUsuario){
                System.out.println("ACESSO PERMITIDO");
            }else{
                System.out.println("SENHA INVALIDA");
            }
        
    }else{
            System.out.println("USÚARIO INVALIDO");
        }
}

    static void q46(){
        System.out.println("1.\t V\n2.\tF\n3.\tF");
    }
    
    static void q47(){
        System.out.println("DESCRIÇÃO DO PRODUTO:");
        String nomeProduto = sc.nextLine();
        
        System.out.println("QUANTIDADE ADQUIRIDA:");
        int quantidadeAdquirida = sc.nextInt();
        
        System.out.println("PREÇO UNITÁRIO");
        double valorUnitario = sc.nextDouble();
        
        if (quantidadeAdquirida <= 5){
            System.out.println("TOTAL:\t"+(quantidadeAdquirida * valorUnitario)+"R$");
            System.out.println("DESCONTO:\t"+((quantidadeAdquirida*valorUnitario)*0.02)+"R$");
            System.out.println("TOTAL COM DESCONTO:\t"+(((quantidadeAdquirida*valorUnitario)*0.02)-(quantidadeAdquirida * valorUnitario))+"R$");
        }
        
        else if (quantidadeAdquirida > 5 && quantidadeAdquirida <= 10){
            System.out.println("TOTAL:\t"+(quantidadeAdquirida * valorUnitario)+"R$");
            System.out.println("DESCONTO:\t"+((quantidadeAdquirida*valorUnitario)*0.03)+"R$");
            System.out.println("TOTAL COM DESCONTO:\t"+(((quantidadeAdquirida*valorUnitario)*0.03)-(quantidadeAdquirida * valorUnitario))+"R$");
        } 
        
        else{
            System.out.println("TOTAL:\t"+(quantidadeAdquirida * valorUnitario)+"R$");
            System.out.println("DESCONTO:\t"+((quantidadeAdquirida*valorUnitario)*0.05)+"R$");
            System.out.println("TOTAL COM DESCONTO:\t"+(((quantidadeAdquirida*valorUnitario)*0.05)-(quantidadeAdquirida * valorUnitario))+"R$");
       
        }
    }
    
    static void q48(){
        
        System.out.println("CÓDIGO DO EMPREGADO:");
        int codEmpregado = sc.nextInt();
        
        System.out.println("ANO DE NASCIMENTO:");
        int anoNascimento = sc.nextInt();
        
        
        System.out.println("ANO DE INGRESSO NA EMPRESA:");
        int anoEngreso = sc.nextInt();
        
        int anoAtual = 2019;
        
        if ((anoAtual - anoNascimento) >= 65){
            System.out.println("REQUER APOSENTADORÍA");
        }
        
        else if((anoAtual - anoEngreso) >= 30){
            System.out.println("REQUER APOSENTADORÍA");
        }
        
        else if((anoAtual - anoNascimento) >= 60 && (anoAtual - anoEngreso) >= 25){
            System.out.println("REQUER APOSENTADORÍA");
        }
        
        else {
            System.out.println("NÃO REQUER APOSENTADORÍA");
        }
    }
    
    static void q49(){
        System.out.println("\t\tVARIAVEIS");
        System.out.println("A\t|\tB\t|\tC\t|\tmens");
        System.out.println("1\t|\t2\t|\t3\t|\tNão é possivel formar um triangulo");
        System.out.println("3\t|\t4\t|\t5\t|\tTiângulo escaleno");
        System.out.println("4\t|\t7\t|\t7\t|\tTriângolo isóseles");
        System.out.println("4\t|\t4\t|\t4\t|\tTriangulo equilátero");
        System.out.println("5\t|\t3\t|\t3\t|\tTriângulo isóseles");
        
    }

    static void q50(){
        
        System.out.println("UM VALOR QUALQUER:");
        double valor1 = sc.nextDouble();
        
        System.out.println("OUTRO VALOR QUALQUER:");
        double valor2 = sc.nextDouble();
        
        if (valor2 == 0 ){
        for( int x = 0 ; x == 0; x++){
        System.out.println("OUTRO VALOR QUALQUER:");
        valor2 = sc.nextDouble();
        x=0;
        }
        }
        
        System.out.println(valor1/valor2);
        
    }
    
    static void q51(){
        
        System.out.println("UM VALOR QUALQUER:");
        double valor1 = sc.nextDouble();
        
        System.out.println("OUTRO VALOR QUALQUER:");
        double valor2 = sc.nextDouble();
        
        while(valor2==0){
        System.out.println("OUTRO VALOR QUALQUER:");
        valor2 = sc.nextDouble();
        }
        
        System.out.println(valor1/valor2);
    }
    
    static void q52(){
        System.out.println("OUTRO VALOR QUALQUER:");
        double x = sc.nextDouble();
        
        System.out.println("OUTRO VALOR QUALQUER:");
        double y = sc.nextDouble();
        
        String resposta = "A";
        double z = (x*y)+5;
        if(y==0){
            System.out.println("VALOR INVALIDO");
        }else if (z<=0){
            resposta = "A";
        }else if (z<=100){
            resposta = "B";
        }else{
            resposta= "C";
        }
        
        System.out.println(resposta);
    }
    
    static void q53(){
        
        
         System.out.println("TIPO DE COMBUSTIVEL\n(A)ALCOOL\t\t(G)GÁSOLINA");
        String tipoComb = sc.nextLine();
        
        System.out.println("NUMERO DE LITROS VENDIDOS:");
        float litroDeComb = sc.nextFloat();
        
        if (litroDeComb == 0){
            System.out.println("VALOR INVÁLIDO");
        }
        switch (tipoComb){
            case "A":
                if (litroDeComb <= 20){
                    System.out.println("VALOR A SER PAGO: "+(litroDeComb * 3.201)+"R$");
                }else{
                    System.out.println("VALOR A SER PAGO: "+(litroDeComb * 3.135)+"R$");
                }
            break;
            case "a":
                if (litroDeComb <= 20){
                    System.out.println("VALOR A SER PAGO: "+(litroDeComb * 3.201)+"R$");
                }else{
                    System.out.println("VALOR A SER PAGO: "+(litroDeComb * 3.135)+"R$");
                }
            break;
            case "G":
                if (litroDeComb <= 20){
                    System.out.println("VALOR A SER PAGO: "+(litroDeComb * 2.894)+"R$");
                }else{
                    System.out.println("VALOR A SER PAGO: "+(litroDeComb * 2.726)+"R$");
                }
                break;
            case "g":
                if (litroDeComb <= 20){
                    System.out.println("VALOR A SER PAGO: "+(litroDeComb * 2.894)+"R$");
                }else{
                    System.out.println("VALOR A SER PAGO: "+(litroDeComb * 2.726)+"R$");
                }
                break;
        }
        
    }
    
    static void q54(){
        
        System.out.println("PRIMEIRA NOTA:");
        float nota1 = sc.nextFloat();
        
        while (nota1 < 0){
        System.out.println("PRIMEIRA NOTA:");
        nota1 = sc.nextFloat();
        }
        while (nota1 > 10){
        System.out.println("PRIMEIRA NOTA:");
        nota1 = sc.nextFloat();
        }
        
        System.out.println("SEGUNDA NOTA:");
        float nota2 = sc.nextFloat();
        
        while (nota2 < 0){
        System.out.println("SEGUNDA NOTA:");
        nota2 = sc.nextFloat();
        }
        while (nota2 > 10){
        System.out.println("SEGUNDA NOTA:");
        nota2 = sc.nextFloat();
        }
        
        System.out.println("MEDIA DO ALUNO:\t"+((nota1+nota2)/2));
    }
    
    static void q55(){
         int x = 1;
         while(x<2){
             
             System.out.println("CÓDIGO DO USÚARIO");
        int codDigitado = sc. nextInt ();
        
        int codUsuario = 1234;
        int senhaUsuario = 9999;
        
        if (codDigitado == codUsuario){
        System.out.println("INFORME SUA SENHA:");
        int senhaDigitada = sc.nextInt();
            if (senhaDigitada == senhaUsuario){
                System.out.println("ACESSO PERMITIDO");
            }else{
                System.out.println("SENHA INVALIDA");
            }
        
    }else{
            System.out.println("USÚARIO INVALIDO");
        }
        
        System.out.println("NOVO CALCULO(S/N):");
        String respetir = sc.nextLine();
             
        switch(respetir){
                 case "S":
                     x=1;
                     break;
                 default:
                     x=2;
                     break;
             }
         }
    }
    
    
    }