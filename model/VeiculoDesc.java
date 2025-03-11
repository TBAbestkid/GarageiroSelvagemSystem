package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VeiculoDesc {
    private boolean arCondicionado;
    private boolean direcaoHidraulica;
    private String placa;


    public VeiculoDesc(boolean arCondicionado, boolean direcaoHidraulica, String placa) {
        this.arCondicionado = arCondicionado;
        this.direcaoHidraulica = direcaoHidraulica;
        this.placa = placa;
    }
    

    public VeiculoDesc() {
    }
    

    public boolean isArCondicionado() {
        return this.arCondicionado;
    }

    public boolean getArCondicionado() {
        return this.arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean isDirecaoHidraulica() {
        return this.direcaoHidraulica;
    }

    public boolean getDirecaoHidraulica() {
        return this.direcaoHidraulica;
    }

    public void setDirecaoHidraulica(boolean direcaoHidraulica) {
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;

    }
    public Integer validarPlaca() {

        String mercosulPattern = "^[A-Z]{3}[0-9][A-Z][0-9]{2}$";
        String antigaPattern = "^[A-Z]{3}-[0-9]{4}$";

        Pattern patternMercosul = Pattern.compile(mercosulPattern);
        Pattern patternAntiga = Pattern.compile(antigaPattern);

        Matcher matcherMercosul = patternMercosul.matcher(this.placa);
        if (matcherMercosul.matches()) {
            return 1;
        }

        Matcher matcherAntiga = patternAntiga.matcher(this.placa);
        if (matcherAntiga.matches()) {
            return 1;
        }

        return 0;
    }
    
}
