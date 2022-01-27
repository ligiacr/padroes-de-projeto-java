package me.dio.implementacao;

public class Cachorro {

    private Atitude atitude;

    public void setAtitude(Atitude atitude) {
        this.atitude = atitude;
    }

    public void latir() {
        atitude.latir();
    }
}
