public class Day010 {

    public static void main(String[] args) {
        
        converter(10);
    }

    public static void converter(double valor){

        double celsius  = (valor * 1.8) + 32;
        System.out.println("O valor em celsius é: " + celsius);


        double fahrenheit = (valor / 1.8) + 32;
        System.out.println("O valor em fahrenheit é: " + fahrenheit);

    }
    
    
}
