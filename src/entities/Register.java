package entities;

public class Register {
    private Pessoa[] pessoas;

    public Register(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }

    public double alturaMedia() {
        double soma = 0.0;
        for (int i=0; i < pessoas.length; i++) {
            soma += pessoas[i].getAltura();
        }
        return soma / pessoas.length;
    }

    public double idadeMenor(){
        int total = pessoas.length;
        int menores = 0;

        for (int i=0; i < pessoas.length;i++){
            if (pessoas[i].getIdade() < 16){
                menores++;
            }
        }

        return (double) menores * 100 / total;
    }

    public String[] pessoasmenores() {
        int contador = 0;
        for (int i=0; i < pessoas.length; i++){
            if (pessoas[i].getIdade() < 16) {
                contador++;
            }
        }

        String[] nomes = new String[contador];
        int escolhidos = 0;
        for (int i=0; i < pessoas.length; i++){
            if (pessoas[i].getIdade() < 16) {
                nomes[escolhidos] = pessoas[i].getNome();
                escolhidos++;
            }
        }

        return nomes;
    }

}


