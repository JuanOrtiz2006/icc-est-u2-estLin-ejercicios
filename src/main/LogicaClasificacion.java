package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Invierte una cadena de texto utilizando una pila (Stack).
     *
     * @param texto Cadena original a invertir.
     * @return Cadena invertida.
     *
     *         Ejemplo:
     *         Entrada: "Hola Mundo"
     *         Salida: "odnuM aloH"
     */
    public String invertirCadena(String texto) {
        Stack<Character> pila = new Stack<>();
        for(Character caracter: texto.toCharArray()){
            pila.push(caracter);
        }
        StringBuilder resultado = new StringBuilder();
        while(!pila.isEmpty()){
            resultado.append(pila.pop());
        }
        return resultado.toString();
    }

    /**
     * Verifica si los símbolos de paréntesis, corchetes y llaves están bien
     * balanceados.
     *
     * @param expresion Cadena con símbolos.
     * @return true si está balanceada, false en caso contrario.
     *
     *         Ejemplo:
     *         Entrada: "{[()]}"
     *         Salida: true
     */
    public boolean validarSimbolos(String expresion) {
        Stack<Character> pila = new Stack<>();
        boolean resultado = true;
        for(Character simbolo: expresion.toCharArray()){
            if (simbolo=='{' || simbolo=='[' || simbolo=='('){
                pila.push(simbolo);
            } else if(simbolo=='}' || simbolo==']' || simbolo==')'){
                if(pila.isEmpty()){
                    return false;
                }
                char ultimo = pila.pop();
                if((simbolo=='}' && ultimo!='{') || (simbolo==']' && ultimo!='[') || (simbolo==')' && ultimo!='('))
                {
                    return false;
                } else{
                    resultado = true;
                }
            }

        }
        return resultado;
    }

    /**
     * Ordena una pila de enteros en orden ascendente usando otra pila auxiliar.
     *
     * @return Lista ordenada.
     *
     *         Ejemplo:
     *         Entrada: [3, 1, 4, 2]
     *         Salida: [1, 2, 3, 4]
     */
    public List<Integer> ordenarPila(Stack<Integer> pila) {
        Stack<Integer> pilaAux = new Stack<>();
        List<Integer> ordenado = new ArrayList<>();
        // Ordenar usando pila auxiliar
        while (!pila.isEmpty()) {
            int temp = pila.pop();
            while (!pilaAux.isEmpty() && pilaAux.peek() <    temp) {
                pila.push(pilaAux.pop());
            }
            pilaAux.push(temp);
        }
        // Pasar los elementos ordenados a la lista
        while (!pilaAux.isEmpty()) {
            ordenado.add(pilaAux.pop());
        }
        return ordenado;        
    }

    /**
     * Clasifica una lista de enteros separando pares e impares.
     * Usa LinkedList para mantener el orden de inserción.
     *
     * @return Lista con pares primero, luego impares.
     *
     *         Ejemplo:
     *         Entrada: [1, 2, 3, 4, 5, 6]
     *         Salida: [2, 4, 6, 1, 3, 5]
     */
    public List<Integer> clasificarPorParidad(LinkedList<Integer> original) {

        return new ArrayList<>();
    }
}
