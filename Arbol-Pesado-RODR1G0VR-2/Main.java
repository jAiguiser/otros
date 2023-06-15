public class Main {
    public static void main(String[] args) {
      // Crear un árbol pesado
      ArbolPesado arbol = new ArbolPesado();
      arbol.insert(10);
      // arbol.imprimirArbol();
      arbol.insert(7);
      // arbol.imprimirArbol();
      arbol.insert(17);
      arbol.insert(1);
      arbol.insert(17);
      System.out.println("Árbol original:");
      arbol.imprimirArbol();

      arbol.ordenarArbolPesado();

      System.out.println("\nÁrbol ordenado:");
      arbol.imprimirArbol();
  }

}
