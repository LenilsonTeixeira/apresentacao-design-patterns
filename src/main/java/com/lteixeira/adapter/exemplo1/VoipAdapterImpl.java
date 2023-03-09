package com.lteixeira.adapter.exemplo1;

public class VoipAdapterImpl implements VoipAdapter {

    @Override
    public void chamada(String origem, String destino) {
        Voip.fazChamadaNoLegado(origem, destino);
    }
}
