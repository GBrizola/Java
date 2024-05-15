public class Main {
    public static void main(String[] args) {
        Arquivo opa = new Arquivo("eaemano","");

        System.out.println(opa.abrir());
        System.out.println();

        opa.editar("Brizola Lindo");
        System.out.println(opa.abrir());
        System.out.println();

        opa.renomear("eita");
        System.out.println(opa.abrir());
        System.out.println();

        opa.limpar();
        System.out.println(opa.abrir());
    }
}