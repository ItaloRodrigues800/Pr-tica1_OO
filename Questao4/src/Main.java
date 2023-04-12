public class Main {
    public static void main(String[] args) {
        Quadrado q1 =new Quadrado(4,4);
        Triangulo t1 = new Triangulo(3,4);
        //PoligonoRegular q2 = new PoligonoRegular() {

        System.out.println("Area do Quadrado"+q1.calculaArea());
        System.out.println("Area do Trinagulo"+t1.calculaArea());

        System.out.println("Perimetro do Quadrado"+ q1.calculaPerimetro());
        System.out.println("Perimetro do Triangulo"+ t1.calculaPerimetro());
    }
}
