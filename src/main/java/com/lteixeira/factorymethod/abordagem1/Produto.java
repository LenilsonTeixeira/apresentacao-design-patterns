package com.lteixeira.factorymethod.abordagem1;

public class Produto {
    // Demais métodos referente ao produto
    public Iphone consultarManual(IphoneType iphoneType) {
        if(IphoneType.PRO.equals(iphoneType)) {
            return new IphonePro();
        } else if(IphoneType.XS_MAX.equals(iphoneType)) {
            return new IphoneXSMax();
        } else if(IphoneType.X.equals(iphoneType)) {
            return new IphoneX();
        } else {
            throw new IllegalArgumentException("Tipo de Iphone inválido");
        }
    }

}
