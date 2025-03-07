package model;

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

}
