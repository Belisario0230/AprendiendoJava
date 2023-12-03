public class Estudiante {

    String nombre;
    String apellido;
    int edad;

    
    public static void main(String[] args){
        Estudiante estudiante = new Estudiante();
        estudiante.nombre="Belisario";
        estudiante.apellido="Buitrago Lievano";
        estudiante.edad=45;

        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre="Leonardo";
        estudiante1.apellido="Buitrago Lievano";
        estudiante1.edad=38;

        System.out.println("El nombre del estudiante es:" + estudiante.nombre);
        System.out.println("Es apellido del estudiante es:" + estudiante.apellido);
        System.out.println("La edad del estudiante es:" +estudiante.edad);
        System.out.println("\n");

        System.out.println("El nombre del estudiante 1 es:" +estudiante1.nombre);
        System.out.println("El apellido del estudiante1 es:" +estudiante1.apellido);
        System.out.println("La edad del estudiante1 es:" + estudiante1.edad);
        System.out.println("\n");

        Computadora computadora = new Computadora();
        computadora.CPU="Nvia2023";
        computadora.almacenamiento="1000tb";
        computadora.cantidaddeRam="16gb";
        computadora.marca="hp";
        computadora.placamadre="hp2023";
        computadora.procesador="razer2023";
        computadora.tipoRAM="razer2012";
        computadora.video="hd";

        System.out.println("Tiene una muy buena CPU:" + computadora.CPU);
        System.out.println("Tiene una capacidad de 1000 gigas:" + computadora.almacenamiento);
        System.out.println("Su capacidad de Ram es impresionante:" + computadora.cantidaddeRam);
        System.out.println("Su marca es una de las mejores aqui en Colombia" +computadora.marca);
        System.out.println("La capacidad de la placa madre es de calidad" +computadora.placamadre);
        System.out.println("Su procesador es rizar2023:" +computadora.procesador);
        System.out.println("Es un buen tipo de Ram" + computadora.tipoRAM);
        System.out.println("Su capacidad de video tiene muy buena definicion:" +computadora.video);
        System.out.println("\n");

        Auto auto = new Auto();
        auto.clase="camioneta";
        auto.color="azul";
        auto.combustible="gasolina";
        auto.kilometraje=40000;
        auto.marca="mazda xlz";
        auto.placa="rky028";
        auto.modelo="sedan";

        System.out.println("La clase de este auto es :"  + auto.clase);
        System.out.println("El color de este auto es :" + auto.color);
        System.out.println("El combustible de este auto es :" + auto.combustible);
        System.out.println("El kilometraje es bajo esta en :" +auto.kilometraje);
        System.out.println("Es una gran marca aqui en colombia y es :" + auto.marca);
        System.out.println("Su placa es :" + auto.placa);
        System.out.println("Es un buen modelo y es :" + auto.modelo);

        



    
        

        
        
    }
}
