
public class Triangulo extends PoligonoRegular{

    public Triangulo(int numLados, float tamLados) {
        super(numLados, tamLados);
    }

    @Override
    public float calcularArea() {
        return 0;
    }

    public float calculaArea(){
        return (getTamLados()*getTamLados())/2;
    }
}
