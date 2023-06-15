public class ArbolPesado {
    private Integer root;
    private ArbolPesado left;
    private ArbolPesado right;

    public ArbolPesado() {
        root = null;
        left = null;
        right = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    private void setRoot(Integer dato) {
        root = dato;
    }

    public Integer getRoot() {
        return root;
    }

    public void insert(int dato) {
    if (isEmpty()) {
        setRoot(dato);
        left = new ArbolPesado();
        right = new ArbolPesado();
    } else {
        ArbolPesado nodo = this;
        while (true) {
            if (nodo.left.isEmpty()) {
                // Si el nodo izquierdo está vacío, se inserta el dato en ese nodo
                nodo.left = new ArbolPesado();
                nodo.left.setRoot(dato);
                nodo.left.left = new ArbolPesado();
                nodo.left.right = new ArbolPesado();
                break;
            } else if (nodo.right.isEmpty()) {
                // Si el nodo derecho está vacío, se inserta el dato en ese nodo
                nodo.right = new ArbolPesado();
                nodo.right.setRoot(dato);
                nodo.right.left = new ArbolPesado();
                nodo.right.right = new ArbolPesado();
                break;
            } else {
                // Ambos nodos están ocupados, se compara la altura de los hijos y se sigue la lógica del número pesado
                if (nodo.left.getHeight() <= nodo.right.getHeight()) {
                    // Si la altura del hijo izquierdo es menor o igual que la altura del hijo derecho, avanzamos al nodo hijo izquierdo
                    nodo = nodo.left;
                } else {
                    // Si la altura del hijo derecho es mayor que la altura del hijo izquierdo, avanzamos al nodo hijo derecho
                    nodo = nodo.right;
                }
            }
        }

      
    }
}


    private int getHeight() {
        if (isEmpty()) {
            return -1;
        } else {
            return 1 + Math.max(left.getHeight(), right.getHeight());
        }
    }

    public void imprimirArbol() {
        if (isEmpty()) {
            System.out.println("El árbol está vacío.");
            return;
        }
        imprimirArbol(this, 0);
    }

    private void imprimirArbol(ArbolPesado arbol, int nivel) {
        if (!arbol.isEmpty()) {
            imprimirArbol(arbol.right, nivel + 1);

            for (int i = 0; i < nivel; i++) {
                System.out.print("   ");
            }
            System.out.println(arbol.getRoot());

            imprimirArbol(arbol.left, nivel + 1);
        }
    }
}
