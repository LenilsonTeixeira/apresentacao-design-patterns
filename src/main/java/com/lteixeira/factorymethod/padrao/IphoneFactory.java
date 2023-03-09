package com.lteixeira.factorymethod.padrao;

public class IphoneFactory {
    public static Iphone obterIphone(IphoneType iphoneType) {
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
