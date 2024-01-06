package edu.ebac;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author vinisantosn
 */
public class Main {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        Integer totalDeNotasParaLer = 4;
        Double somaDasNotas = 0.0;
        Double mediaDasNotas;

        Scanner scanner = new Scanner(System.in);
        
        for (int i=0; i<totalDeNotasParaLer;i++){
            System.out.printf("Insira a sua %dª nota: ",i+1);
            Double nota = scanner.nextDouble();
            notas.add(nota);
        }

        for (Double nota:notas
             ) {
            somaDasNotas+=nota;
        }

        mediaDasNotas = somaDasNotas/totalDeNotasParaLer;
        Boolean situacaoAprovado = mediaDasNotas>=7;
        Boolean situacaoRecuperacao = mediaDasNotas>=5 && mediaDasNotas<7;
        Boolean situacaoReprovado = mediaDasNotas<5;

        if (situacaoAprovado){
            System.out.println("Parabéns voce foi aprovado!");
        } else if (situacaoRecuperacao) {
            System.out.println("Ainda há esperança, voce esta de recuperação.");
        } else if (situacaoReprovado){
            System.out.println("Voce está reprovado");
        } else {
            System.out.println("Situção não identificada, por favor consulte  a coordenação.");
        }


    }
}