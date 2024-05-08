public class Operacoes {

    public int somaMatrizes(int[][] matriz1, int[][] matriz2) {

        int linhas = matriz1.length;
        int colunas = matriz1[0].length;
        int[][] resultado = new int[linhas][colunas];
        int operacoes = 0;

        for(int i = 0; i < linhas; i++) {
            for(int j = 0; j < colunas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
                operacoes++;
            }
        }

        return operacoes;
    }
}
