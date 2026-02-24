public class Classification {

    public double indice;

    public static String resultClassificacao(float indice) {
        String msg;
        if (indice <= 50) {
            msg = "Classificação: Boa";
        } else if (indice >= 51 && indice < 100) {
            msg = "Classificação: Regular";
        } else if (indice >= 100 && indice <= 199) {
            msg = "Classificação: Inadequada";
        } else if (indice >= 200 && indice <= 299) {
            msg = "Classificação: Má";
        } else if (indice >= 300 && indice <= 399) {
            msg = "Classificação: Péssima";
        } else {
            msg = "Classificação: Crítica";
        }

        return msg;

    }

    public static String resultEfeitos(float indice) {
        String msg;
        if (indice <= 100) {
            msg = "Efeitos: Ausência de sintomas.";
        } else if (indice >= 101 && indice <= 199) {
            msg = "Efeitos: Leve agravamento dos sintomas de pessoas susceptíveis.";
        }  else if (indice >= 200 && indice <= 299) {
            msg = "Efeitos: Decréscimo da resistência física e significativo agravamento.";
        }  else if (indice >= 300 && indice <= 399) {
            msg = "Efeitos: Aparecimento prematuro de certas doenças.";
        } else {
            msg = "Efeitos: Morte prematura de pessoas doentes e pessoas idosas.";
        }

        return msg;

    }

}
