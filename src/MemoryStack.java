public class MemoryStack {
//    Moдель памяти Java - написать код, в результате которого
//    программа падает с ошибкой переполнения стека.
//    В этом коде вы сам не должны писать что-то вроде throw new StackOverflowError
    public static void main(String[] args) {
        System.out.println(metod55());

    }

    public static double metod55 (){
        double a = 54545.5454;
        double b = 554687878.315478;
        double c = a + b + metod55();
        return c;
    }
}
