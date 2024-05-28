public class Circulo extends Figura{

    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public void setRaio(double base){
        this.raio = raio;
    }

    public double getRaio(){
        return raio;
    }

    public double area(){
        double area = raio*raio*3,14;
    }

    public double getDiametro(){
        double diametro = 2 * raio;
        return diametro;
    }

    public String toString(){
        return super.toString();
    }
}
