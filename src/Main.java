public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Bruno", 3038026-1);
        Pessoa p2 = new Pessoa("Flávia", 30333724-0);

        if(p1.equals(p2)){
            System.out.println("São Iguais");
        } else {
            System.out.println("São Diferentes");
        }

    }
}
