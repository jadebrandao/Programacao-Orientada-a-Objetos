
public class Main {

    public static void main(String[] args) {

        Triagulo t = new Triagulo(3,4);
        Quadrado q = new Quadrado(4,4);
        //PoligonoRegular pr = new Quadrado(4,5);

        System.out.println("Area do Quadrado" + q.calcularArea());
        System.out.println("Area do triagulo:"+ t.calcularArea());


        System.out.println("Perimetro do quadrado: " + q.calculaPerimetro());
        System.out.println("Perimetro do triagulo: " + t.calculaPerimetro());


    }


}