
public  abstract class PoligonoRegular {
    private int numLados;
    private float tamLados;

    public PoligonoRegular(int numLados, float tamLados) {
        this.numLados = numLados;
        this.tamLados = tamLados;
    }
    public float calculaPerimetro(){
        return numLados*tamLados;
    }
    public abstract float calcularArea();

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public float getTamLados() {
        return tamLados;
    }

    public void setTamLados(float tamLados) {
        this.tamLados = tamLados;
    }

}
