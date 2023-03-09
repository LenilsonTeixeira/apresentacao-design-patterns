package com.lteixeira.adapter.exemplo1;

public class TesteAdapter {

    private static final String ORIGEM = "(19)99999-9999";
    private static final String DESTINO = "(18)88888-8888";

    public static void main(String[] args) {

        //Método antigo - Sistema legado
        Voip.fazChamadaNoLegado(ORIGEM, DESTINO);

        //Implementação com Adapter
        VoipAdapterImpl voipAdapter = new VoipAdapterImpl();
        voipAdapter.chamada(ORIGEM, DESTINO);

    }
}
