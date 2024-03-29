/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Metodos_listas {

    Scanner entrada;
    Nodo head;
    Nodo tail;

    public Metodos_listas() {
        this.head = null;
        this.tail = null;
        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("Insertar dato   [1]");
        System.out.println("Recorrer    [2]");
        System.out.println("Insertar dato en orden  [3]");
        System.out.println("Salir       [4]");
        return entrada.nextInt();
    }

    public boolean listaVacia() {
        return (head == null);
    }

    public void insertar() {
        int num;
        System.out.println("Ingrese un dato:");
        num = entrada.nextInt();
        Nodo nuevo = new Nodo(num);

        if (listaVacia()) {
            head = nuevo;
        } else {
            Nodo nodoActual = head;
            while (nodoActual.sig != null) {
                nodoActual = nodoActual.sig;
            }
            nodoActual.sig = nuevo;
        }

    }

    public void recorrer() {
        Nodo actual = head;
        while (actual != null) {
            System.out.println(actual.dato + "-->");
            actual = actual.sig;
        }
    }

    public void insInicio() {
        int num;
        System.out.println("Ingrese un dato:");
        num = entrada.nextInt();
        Nodo nuevo = new Nodo(num);
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            nuevo.sig = head;
            head = nuevo;
        }
    }

    public void insOrden() {
        int num;
        System.out.println("Imgrese un dato:");
        num = entrada.nextInt();
        Nodo nuevo = new Nodo(num);
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            if (num < head.dato) {
                nuevo.sig = head;
                head = nuevo;
            } else {
                Nodo actual = head;
                while ((actual.sig != null) && (num > actual.sig.dato)) {
                    actual = actual.sig;
                }
                nuevo.sig = actual.sig;
                actual.sig = nuevo;
                if (nuevo.sig == null) {
                    tail = null;
                }
            }
        }
    }

    public void eliminar() {
        int num;
        System.out.println("Ingrese un dato a eliminar:");
        num = entrada.nextInt();
        if (num == head.dato) {
            if (head.sig == null) {
                tail = null;
            }
            head = head.sig;
        } else {
            Nodo actual = head;
            while ((actual.sig != null) && (actual.sig.dato != num)) {
                actual = actual.sig;
            }
            if (actual.sig == tail) {
                tail = actual;
            }
            if (actual.sig != null) {
                actual.sig = actual.sig.sig;
            } else {
                System.out.println("El elemento no existe");
            }
        }
    }
}
