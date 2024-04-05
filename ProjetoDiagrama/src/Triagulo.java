public class Triagulo extends PoligonoRegular{

    public Triagulo (int numLado, float tamLado){
        super (numLado,tamLado);
    }

    public float calcularArea(){
        return (getTamLados()*getTamLados()/2);
    }

}
