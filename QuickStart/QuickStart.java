package QuickStart;

class QuickStart { // Las clases puedes llamrlo  como deseas.
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int suma = add(5300, 11029);
        System.out.println("suma : " + suma);

        String greeting = greet("Arturo");
        System.out.println(greeting);

        int number = 4;
        boolean par = isEven(number);
        System.out.println("is " +  number + " even? " +  par);

        double area = calculateArea(5.0);
        System.out.println("Area of circle with radius 5.0 is " + area);
    }

    // Metodo que suma dos numeros y devuelve el resultado
    public static int add(int a, int b) {   // retorna la suma de numero enteros    
         return a + b;
    }
 

    public static String greet(String name) {  // contatena el saludo
         return "Hello " + name + "!";
    }

    public static boolean isEven(int number) {  // imprime el reciduo de  "2" que sea iguall == 0, vera si es true or false.
        return number % 2 == 0;
    } 

    public static double calculateArea(Double radius) {
         return Math.PI * radius * radius;
    }

    public static String getGreeting() {
        return "Hello World!";
    }

    public static int multiply(int a, int b){
        return a * b;
    }
}

