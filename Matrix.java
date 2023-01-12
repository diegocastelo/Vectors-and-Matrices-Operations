package AV1Algebra;

import java.util.Scanner;
public class Matriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha qual operação deseja realizar : ");
        System.out.println("(1) Montar uma Matriz");
        System.out.println("(2) Somar Matrizes ou Vetores");
        System.out.println("(3) Montar um Vetor");
        System.out.println("(4) Multiplicar Matrizes");
        System.out.println("(5) Realizar multiplicação escalar em uma Matriz/Vetor ou Realizar produto elemento por elemento");
        System.out.println("(6) Realizar a eliminação Gaussiana e solucionar um sistema de equações");
        System.out.println("(0) Para finalizar");

        int X = sc.nextInt();
        int Y = 0;
        int Z = 0;
        int W = 0;
        int M = 0;
        int B = 0;
        int C = 0;

        while (X != 0) {
            if (X == 1) {
                System.out.println("Digite a quantidade de linhas e colunas da matriz respectivamente: ");
                int linhas = sc.nextInt();

                int colunas = sc.nextInt();

                int[][] matriz = new int[linhas][colunas];

                System.out.println("Digite os elementos da matriz: ");
                for (int l = 0; l < linhas; l++) {
                    for (int c = 0; c < colunas; c++) {
                        matriz[l][c] = sc.nextInt();
                    }
                }
                System.out.println("Matriz A:");
                for (int l = 0; l < linhas; l++) {
                    for (int c = 0; c < colunas; c++) {
                        System.out.printf("%3d | ", matriz[l][c]);
                    }
                    System.out.printf("%n");
                }

                System.out.println("Matriz transposta de A:");

                for (int l = 0; l < colunas; l++) {
                    for (int c = 0; c < linhas; c++) {
                        System.out.printf("%3d | ", matriz[c][l]);
                    }
                    System.out.printf("%n");
                }

                while(B != 1 && B != 2){
                    System.out.println("(1) Saber elemento de uma posição (2) Trocar valor de um elemento");
                    B = sc.nextInt();
                }

                if(B == 1){
                    System.out.println("Digite a posição do elemento que você quer saber: ");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    int i = x - 1;
                    int j = y - 1;

                    System.out.printf("Elemento da linha %d coluna %d : %d\n", x, y, matriz[i][j]);
                    B = 0;
                }


                if(B == 2){
                    System.out.println("Digite a posição do elemento que você quer trocar o valor: ");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    int I = x - 1;
                    int J = y - 1;
                    System.out.println("Digite o novo valor desse elemento: ");
                    int Valor = sc.nextInt();

                    matriz[I][J] = Valor;

                    System.out.printf("Elemento da linha %d coluna %d alterado para : %d \n", x, y, matriz[I][J]);

                    System.out.println("Matriz A alterada:");
                    for (int l = 0; l < linhas; l++) {
                        for (int c = 0; c < colunas; c++) {
                            System.out.printf("%3d | ", matriz[l][c]);
                        }
                        System.out.printf("%n");
                    }
                    B = 0;
                }

            }

            if(X == 2){
                while(Y != 1 && Y != 2){
                    System.out.println("(1) Somar Matrizes ou (2) Somar Vetores");
                    Y = sc.nextInt();
                }

                if(Y == 1) {
                    System.out.println("Digite a quantidade de linhas e colunas da primeira matriz que deseja somar, respectivamente: ");
                    int linhas1s = sc.nextInt();
                    int colunas1s = sc.nextInt();
                    int[][] matriz1s = new int[linhas1s][colunas1s];

                    System.out.println("Digite os elementos da primeira matriz: ");
                    for (int l1 = 0; l1 < linhas1s; l1++) {
                        for (int c1 = 0; c1 < colunas1s; c1++) {
                            matriz1s[l1][c1] = sc.nextInt();
                        }
                    }
                    System.out.println("Primeira Matriz:");
                    for (int l = 0; l < linhas1s; l++) {
                        for (int c = 0; c < colunas1s; c++) {
                            System.out.printf("%3d | ", matriz1s[l][c]);
                        }
                        System.out.printf("%n");
                    }

                    System.out.println("Digite a quantidade de linhas e colunas da segunda matriz que deseja somar, respectivamente: ");
                    int linhas2s = sc.nextInt();
                    int colunas2s = sc.nextInt();
                    int[][] matriz2s = new int[linhas2s][colunas2s];

                    if (linhas1s != linhas2s || colunas1s != colunas2s) {
                        System.out.println("Impossível realizar a soma das matrizes");
                    } else {
                        System.out.println("Digite os elementos da segunda matriz: ");
                        for (int l2 = 0; l2 < linhas2s; l2++) {
                            for (int c2 = 0; c2 < colunas2s; c2++) {
                                matriz2s[l2][c2] = sc.nextInt();
                            }
                        }

                        System.out.println("Segunda Matriz:");
                        for (int l = 0; l < linhas2s; l++) {
                            for (int c = 0; c < colunas2s; c++) {
                                System.out.printf("%3d | ", matriz2s[l][c]);
                            }
                            System.out.printf("%n");
                        }

                        int[][] matriz3s = new int[linhas1s][colunas2s];

                        for (int is = 0; is < linhas1s; is++) {
                            for (int ks = 0; ks < colunas2s; ks++) {
                                matriz3s[is][ks] = matriz1s[is][ks] + matriz2s[is][ks];
                            }
                        }

                        System.out.println("Matriz Resultante: ");
                        for (int l = 0; l < linhas1s; l++) {
                            for (int c = 0; c < colunas2s; c++) {
                                System.out.printf("%3d | ", matriz3s[l][c]);
                            }
                            System.out.printf("%n");
                        }
                    }
                    Y = 0;
                }
                if(Y == 2){
                    System.out.println("Digite a dimensão do primeiro vetor que deseja somar");
                    int dimensao = sc.nextInt();
                    int[] vetor = new int[dimensao];

                    System.out.println("Digite os elementos do vetor: ");
                    for (int k = 0; k < dimensao; k++) {
                        vetor[k] = sc.nextInt();
                    }

                    System.out.print("Primeiro Vetor: ");
                    System.out.print("[");
                    for (int K = 0; K < dimensao - 1; K++) {
                        System.out.printf("%d, ", vetor[K]);
                    }
                    System.out.print(vetor[dimensao - 1]);
                    System.out.println("]");

                    System.out.println("Digite a dimensão do segundo vetor que deseja somar");
                    int dimensao2 = sc.nextInt();
                    int[] vetor2 = new int[dimensao2];

                    if(dimensao != dimensao2){
                        System.out.println("Impossível realizar a soma dos vetores");
                    }else{
                        System.out.println("Digite os elementos do segundo vetor: ");
                        for (int k2 = 0; k2 < dimensao2; k2++) {
                            vetor2[k2] = sc.nextInt();
                        }

                        System.out.print("Segundo Vetor: ");
                        System.out.print("[");
                        for (int K = 0; K < dimensao2 - 1; K++) {
                            System.out.printf("%d, ", vetor2[K]);
                        }
                        System.out.print(vetor2[dimensao - 1]);
                        System.out.println("]");

                        int[] vetor3 = new int[dimensao2];

                        for (int is = 0; is < dimensao; is++) {
                            vetor3[is] = vetor[is] + vetor2[is];
                        }

                        System.out.print("Vetor Resultante: ");
                        System.out.print("[");
                        for (int K = 0; K < dimensao - 1; K++) {
                            System.out.printf("%d, ", vetor3[K]);
                        }
                        System.out.print(vetor3[dimensao - 1]);
                        System.out.println("]");

                    }
                    Y = 0;
                }
            }

            if(X == 3){
                System.out.println("Digite a dimensão do vetor: ");
                int dimensao = sc.nextInt();

                int[] vetor = new int[dimensao];

                System.out.println("Digite os elementos do vetor: ");
                for (int k = 0; k < dimensao; k++) {
                    vetor[k] = sc.nextInt();
                }

                System.out.print("Vetor: ");
                System.out.print("[");
                for (int K = 0; K < dimensao - 1; K++) {
                    System.out.printf("%d, ", vetor[K]);
                }
                System.out.print(vetor[dimensao - 1]);
                System.out.println("]");

                while(C != 1 && C != 2){
                    System.out.println("(1) Saber elemento de uma posição (2) Trocar valor de um elemento");
                    C = sc.nextInt();
                }


                if(C == 1){
                    System.out.println("Digite o índice do vetor que deseja se obter: ");
                    int A = sc.nextInt();
                    int o = A - 1;

                    System.out.printf("Elemento %d do vetor : %d\n", A, vetor[o]);
                    C = 0;
                }

                if(C == 2){
                    System.out.println("Digite a posição do elemento que deseja-se alterar: ");
                    int A = sc.nextInt();

                    System.out.println("Digite o novo valor do elemento! ");

                    int O = A - 1;
                    int valor = sc.nextInt();

                    vetor[O] = valor;


                    System.out.printf("Elemento %d do vetor alterado para : %d \n", A, vetor[O]);

                    System.out.print("Vetor alterado: ");
                    System.out.print("[");
                    for (int K = 0; K < dimensao - 1; K++) {
                        System.out.printf("%d, ", vetor[K]);
                    }
                    System.out.print(vetor[dimensao - 1]);
                    System.out.print("]\n");
                    C = 0;
                }
            }

            if(X == 4){
                System.out.println("Digite a quantidade de linhas e colunas da primeira matriz que deseja realizar o produto, respectivamente: ");
                int linhas1 = sc.nextInt();
                int colunas1 = sc.nextInt();
                int[][] matriz1 = new int[linhas1][colunas1];

                System.out.println("Digite os elementos da primeira matriz: ");
                for (int l1 = 0; l1 < linhas1; l1++) {
                    for (int c1 = 0; c1 < colunas1; c1++) {
                        matriz1[l1][c1] = sc.nextInt();
                    }
                }

                System.out.println("Primeira Matriz:");
                for (int l = 0; l < linhas1; l++) {
                    for (int c = 0; c < colunas1; c++) {
                        System.out.printf("%3d | ", matriz1[l][c]);
                    }
                    System.out.printf("%n");
                }

                System.out.println("Digite a quantidade de linhas e colunas da segunda matriz que deseja realizar o produto, respectivamente: ");
                int linhas2 = sc.nextInt();
                int colunas2 = sc.nextInt();
                int[][] matriz2 = new int[linhas2][colunas2];


                if (colunas1 != linhas2) {
                    System.out.println("Impossível resolver o produto de matrizes");
                } else {
                    System.out.println("Digite os elementos da segunda matriz: ");
                    for (int l2 = 0; l2 < linhas2; l2++) {
                        for (int c2 = 0; c2 < colunas2; c2++) {
                            matriz2[l2][c2] = sc.nextInt();
                        }
                    }

                    System.out.println("Segunda Matriz:");
                    for (int l = 0; l < linhas2; l++) {
                        for (int c = 0; c < colunas2; c++) {
                            System.out.printf("%3d | ", matriz2[l][c]);
                        }
                        System.out.printf("%n");
                    }

                    int[][] matriz3 = new int[linhas1][colunas2];
                    for (int g = 0; g < linhas1; g++) {
                        for (int h = 0; h < colunas2; h++) {
                            matriz3[g][h] = 0;
                            for (int k = 0; k < colunas1; k++) {
                                matriz3[g][h] += matriz1[g][k] * matriz2[k][h];
                            }
                        }
                    }

                    System.out.println("Matriz Produto: ");
                    for (int l = 0; l < linhas1; l++) {
                        for (int c = 0; c < colunas2; c++) {
                            System.out.printf("%3d | ", matriz3[l][c]);
                        }
                        System.out.printf("%n");
                    }
                }
            }

            if(X == 5){
                while(Z != 1 && Z != 2){
                    System.out.println("(1) Realizar multiplicação Escalar ou (2) Realizar produto elemento por elemento de Matrizes/Vetores");
                    Z = sc.nextInt();
                }

                if(Z == 1){
                    System.out.println("Digite o valor que vai multiplicar a Matriz ou o Vetor");
                    int valor = sc.nextInt();

                    while(W != 1 && W != 2){
                        System.out.println("(1) Realizar multiplicação escalar com a Matriz ou (2) realizar o multiplicação escalar com Vetor");
                        W = sc.nextInt();
                    }
                    if(W == 1){
                        System.out.println("Digite a quantidade de linhas e colunas da matriz respectivamente: ");
                        int linhas4 = sc.nextInt();

                        int colunas4 = sc.nextInt();

                        int[][] matriz4 = new int[linhas4][colunas4];

                        System.out.println("Digite os elementos da matriz: ");
                        for (int l = 0; l < linhas4; l++) {
                            for (int c = 0; c < colunas4; c++) {
                                matriz4[l][c] = sc.nextInt();
                            }
                        }
                        System.out.println("Matriz :");
                        for (int l = 0; l < linhas4; l++) {
                            for (int c = 0; c < colunas4; c++) {
                                System.out.printf("%3d | ", matriz4[l][c]);
                            }
                            System.out.printf("%n");
                        }

                        int[][] matriz5 = new int[linhas4][colunas4];

                        for (int it = 0; it < linhas4; it++) {
                            for (int kt = 0; kt < colunas4; kt++) {
                                matriz5[it][kt] = matriz4[it][kt] * valor;
                            }
                        }

                        System.out.println("Matriz Resultante: ");
                        System.out.println(valor);
                        for (int l = 0; l < linhas4; l++) {
                            for (int c = 0; c < colunas4; c++) {
                                System.out.printf("%3d | ", matriz5[l][c]);
                            }
                            System.out.printf("%n");
                        }
                        W = 0;
                    }// fim do if w

                    if(W == 2){
                        System.out.println("Digite a dimensão do vetor: ");
                        int dimensao2 = sc.nextInt();

                        int[] vetor2 = new int[dimensao2];

                        System.out.println("Digite os elementos do vetor: ");
                        for (int k = 0; k < dimensao2; k++) {
                            vetor2[k] = sc.nextInt();
                        }

                        System.out.print("Vetor: ");
                        System.out.print("[");
                        for (int K = 0; K < dimensao2 - 1; K++) {
                            System.out.printf("%d, ", vetor2[K]);
                        }
                        System.out.print(vetor2[dimensao2 - 1]);
                        System.out.println("]");

                        int[] vetor3 = new int[dimensao2];

                        for (int it = 0; it < dimensao2; it++) {
                            vetor3[it] = vetor2[it] * valor;
                        }

                        System.out.print("Vetor Resultante: ");
                        System.out.print("[");
                        for (int K = 0; K < dimensao2 - 1; K++) {
                            System.out.printf("%d, ", vetor3[K]);
                        }
                        System.out.print(vetor3[dimensao2 - 1]);
                        System.out.println("]");
                        W = 0;
                    }
                    Z = 0;
                }

                if(Z == 2){
                    while(M != 1 && M != 2) {
                        System.out.println("(1) Realizar multiplicação elemento por elemento com a Matriz ou (2) Realizar multiplicação elemento por elemento com Vetor");
                        M = sc.nextInt();
                    }
                    if(M == 1){
                        System.out.println("Digite a quantidade de linhas e colunas da primeira matriz que deseja multiplicar elemento por elemento, respectivamente: ");
                        int linhas1t = sc.nextInt();
                        int colunas1t = sc.nextInt();
                        int[][] matriz1t = new int[linhas1t][colunas1t];

                        System.out.println("Digite os elementos da primeira matriz: ");
                        for (int l1 = 0; l1 < linhas1t; l1++) {
                            for (int c1 = 0; c1 < colunas1t; c1++) {
                                matriz1t[l1][c1] = sc.nextInt();
                            }
                        }

                        System.out.println("Primeira Matriz:");
                        for (int l = 0; l < linhas1t; l++) {
                            for (int c = 0; c < colunas1t; c++) {
                                System.out.printf("%3d | ", matriz1t[l][c]);
                            }
                            System.out.printf("%n");
                        }

                        System.out.println("Digite a quantidade de linhas e colunas da segunda matriz que deseja multiplicar elemento por elemento, respectivamente: ");
                        int linhas2t = sc.nextInt();
                        int colunas2t = sc.nextInt();
                        int[][] matriz2t = new int[linhas2t][colunas2t];

                        if (linhas1t != linhas2t || colunas1t != colunas2t) {
                            System.out.println("Impossível realizar a multiplicação elemento por elemento das matrizes");
                        } else {
                            System.out.println("Digite os elementos da segunda matriz: ");
                            for (int l2 = 0; l2 < linhas2t; l2++) {
                                for (int c2 = 0; c2 < colunas2t; c2++) {
                                    matriz2t[l2][c2] = sc.nextInt();
                                }
                            }

                            System.out.println("Segunda Matriz:");
                            for (int l = 0; l < linhas2t; l++) {
                                for (int c = 0; c < colunas2t; c++) {
                                    System.out.printf("%3d | ", matriz2t[l][c]);
                                }
                                System.out.printf("%n");
                            }

                            int[][] matriz3t = new int[linhas1t][colunas2t];

                            for (int it = 0; it < linhas1t; it++) {
                                for (int kt = 0; kt < colunas2t; kt++) {
                                    matriz3t[it][kt] = matriz1t[it][kt] * matriz2t[it][kt];
                                }
                            }

                            System.out.println("Matriz Resultante: ");
                            for (int l = 0; l < linhas1t; l++) {
                                for (int c = 0; c < colunas2t; c++) {
                                    System.out.printf("%3d | ", matriz3t[l][c]);
                                }
                                System.out.printf("%n");
                            }
                        }
                        M = 0;
                    }
                    if(M == 2){
                        System.out.println("Digite a dimensão do primeiro vetor que deseja multiplicar elemento por elemento");
                        int dimensaot = sc.nextInt();
                        int[] vetor1t = new int[dimensaot];

                        System.out.println("Digite os elementos do vetor: ");
                        for (int k = 0; k < dimensaot; k++) {
                            vetor1t[k] = sc.nextInt();
                        }

                        System.out.print("Primeiro Vetor: ");
                        System.out.print("[");
                        for (int K = 0; K < dimensaot - 1; K++) {
                            System.out.printf("%d, ", vetor1t[K]);
                        }
                        System.out.print(vetor1t[dimensaot - 1]);
                        System.out.println("]");

                        System.out.println("Digite a dimensão do segundo vetor que deseja somar");
                        int dimensao2t = sc.nextInt();
                        int[] vetor2t = new int[dimensao2t];

                        if(dimensaot != dimensao2t){
                            System.out.println("Impossível realizar a soma dos vetores");
                        }else{
                            System.out.println("Digite os elementos do segundo vetor: ");
                            for (int k2 = 0; k2 < dimensao2t; k2++) {
                                vetor2t[k2] = sc.nextInt();
                            }

                            System.out.print("Segundo Vetor: ");
                            System.out.print("[");
                            for (int K = 0; K < dimensao2t - 1; K++) {
                                System.out.printf("%d, ", vetor2t[K]);
                            }
                            System.out.print(vetor2t[dimensaot - 1]);
                            System.out.println("]");

                            int[] vetor3t = new int[dimensao2t];

                            for (int is = 0; is < dimensaot; is++) {
                                vetor3t[is] = vetor1t[is] * vetor2t[is];
                            }

                            System.out.print("Vetor Resultante: ");
                            System.out.print("[");
                            for (int K = 0; K < dimensaot - 1; K++) {
                                System.out.printf("%d, ", vetor3t[K]);
                            }
                            System.out.print(vetor3t[dimensaot - 1]);
                            System.out.println("]");

                        }
                        M = 0;
                    }
                    Z = 0;
                }
            }

            if(X == 6){
                System.out.println("Digite a quantidade de equações para aplicar o método de Gauss : ");
                int linhasgauss = sc.nextInt();
                int colunasgauss = linhasgauss;

                double[][] m = new double[linhasgauss][colunasgauss];
                double[] constants = new double[linhasgauss];
                double[] solution = new double[linhasgauss];

                System.out.println("Digite os coeficientes das incógnitas: ");
                for (int l2 = 0; l2 < linhasgauss; l2++) {
                    for (int c2 = 0; c2 < colunasgauss; c2++) {
                        m[l2][c2] = sc.nextDouble();
                    }
                }

                for(int l3 = 0; l3 < linhasgauss; l3++){
                    System.out.println("Digite as constantes (números após a igualdade sem nenhuma incógnita): ");
                    constants[l3]=sc.nextDouble();
                }

                System.out.println("Matriz Inicial: ");
                for (int l = 0; l < linhasgauss; l++) {
                    for (int c = 0; c < colunasgauss; c++) {
                        System.out.printf("%3f | ", m[l][c]);
                    }
                    System.out.printf("%n");
                }

                int ig,jg,kg,lg;
                for(ig=0;ig<linhasgauss;ig++){
                    double largest=Math.abs(m[ig][ig]);
                    int index=ig;
                    for(jg=ig+1;jg<linhasgauss;jg++){
                        if(Math.abs(m[jg][ig])>largest){
                            largest=m[jg][ig];
                            index=jg;
                        }
                    }

                    double temp;
                    for(int jgg=0;jgg<linhasgauss;jgg++){
                        temp=m[ig][jgg];
                        m[ig][jgg]=m[index][jgg];
                        m[index][jgg]=temp;
                    }
                    temp=constants[ig];
                    constants[ig]=constants[index];
                    constants[index]=temp;

                    for(kg=ig+1;kg<linhasgauss;kg++){
                        double factor=m[kg][ig]/m[ig][ig];

                        for(lg=ig;lg<linhasgauss;lg++){
                            m[kg][lg]-=factor*m[ig][lg];
                        }
                        constants[kg]-=factor*constants[ig];
                    }
                }

                for(int Ig=linhasgauss-1;Ig>=0;Ig--){
                    solution[Ig]=constants[Ig];
                    for(int Jg=linhasgauss-1;Jg>Ig;Jg--){
                        solution[Ig]-=m[Ig][Jg]*solution[Jg];
                    }
                    solution[Ig]/=m[Ig][Ig];
                }

                System.out.println("Matriz Final: ");
                for (int l = 0; l < linhasgauss; l++) {
                    for (int c = 0; c < colunasgauss; c++) {
                        System.out.printf("%3f | ", m[l][c]);
                    }
                    System.out.printf("%3f | ", constants[l]);
                    System.out.printf("%n");
                }

                System.out.println("\nConjunto Solução : ");
                for(int II=0;II<linhasgauss;II++)
                    System.out.println((char)('x'+II)+" = "+solution[II]);

            }


            System.out.println("");
            System.out.println("Escolha qual operação deseja realizar : ");
            System.out.println("(1) Montar uma Matriz");
            System.out.println("(2) Somar Matrizes ou Vetores");
            System.out.println("(3) Montar um Vetor");
            System.out.println("(4) Produto de Matrizes");
            System.out.println("(5) Realizar multiplicação escalar em uma Matriz/Vetor ou Realizar multiplicação elemento por elemento");
            System.out.println("(6) Realizar a eliminação Gaussiana e solucionar um sistema de equações");
            System.out.println("(0) Para finalizar");

            X = sc.nextInt();

        }
    }
}