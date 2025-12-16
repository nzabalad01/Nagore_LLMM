package mce.depurar;

public class RecorrerArray {
    public static void main(String[] args) {
        // Declaración e inicialización de un array
        int[] numeros = {5,8,9,12,6,7,21,69};
        int cont=0;
        // Bucle for para recorrer el array
        for (int i = 0; i < numeros.length; ++i) {
        	System.out.println(++cont);
        	// Imprimir el índice y el valor actual del array
            System.out.println("Índice: " + i + ", Valor: " + numeros[i]);

            // Aquí podrías colocar un punto de depuración, por ejemplo, usando el valor de 'i' y 'numeros[i]'
            // Si estás utilizando un IDE, puedes establecer un breakpoint en la siguiente línea
            // para verificar el valor de estas variables en cada iteración.
        }

        // También podrías verificar el array completo al final
        System.out.println("Array completo: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
