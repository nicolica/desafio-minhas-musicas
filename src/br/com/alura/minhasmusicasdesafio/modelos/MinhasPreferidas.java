package br.com.alura.minhasmusicasdesafio.modelos;

public class MinhasPreferidas {
    public void inclui (Audio audio) {
        if (audio.getClassficacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto curtido por todos");
        } else {
            System.out.println(audio.getTitulo() + " também é um dos que todos estão curtindo");
        }
    }
}
