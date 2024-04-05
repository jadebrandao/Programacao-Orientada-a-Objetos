public class Quadrado extends PoligonoRegular{

    public Quadrado(int numLado, float tamLado){
        super (numLado,tamLado);

    }
    public float calcularArea(){
        return getTamLados()*getTamLados();
    }
}
