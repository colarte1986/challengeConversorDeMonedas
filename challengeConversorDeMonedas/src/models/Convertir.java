package models;

public class Convertir implements IConvertir{

    @Override
    public double convertir(double valorConvertir, double tasaDeCambio) {
        return valorConvertir * tasaDeCambio;
    }
    
}
