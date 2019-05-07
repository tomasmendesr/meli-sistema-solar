package meli.tmr.sistemasolar.modelo;

public class Posicion {

    private double X;
    private double Y;

    public Posicion(double X, double Y){
        this.setX(X);
        this.setY(Y);
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }
}
