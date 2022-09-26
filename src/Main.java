public class Main {
    public static void main(String[] args) {

        String nombres[] = new String[]{"Juan", "Ana", "Pedro"};

        System.out.println(concatenarNombres(nombres));


    }

    private static String concatenarNombres(String[] nombres) {
        String result = "";
        for(String nombre : nombres)
        {
            result += nombre + " ";
        }

        return result;
    }
}