public class Quadrado extends PoligonoRegular {
    public Quadrado(int numLados, float tamLados) {
        super(numLados, tamLados);
    }

    @Override
    public float calcularArea() {
        return 0;
    }

    public float calculaArea(){
        return getNumLados()*getTamLados();
    }
}
