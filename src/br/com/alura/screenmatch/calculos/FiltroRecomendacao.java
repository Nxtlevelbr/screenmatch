package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    public void filtra(Classificavel classificavel){
        if (Classificavel.getClassificacao()>=4){
            System.out.println("Esta entre os preferidos so momento");

        } else if(Classificavel.getClassificacao()>=2) {
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
        }
}
