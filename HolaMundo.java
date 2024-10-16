public class HolaMundo {
    public static void main(String[] args) {
        String verde = "\033[32m";
        String rojo = "\033[31m";
        String amarillo = "\033[33m";
        System.out.println(rojo+"Hola Mundo en rojo");
        System.out.println(verde+"Hola Mundo en verde");
        System.out.println(amarillo+"Hola Mundo en amarillo");
    }
}   