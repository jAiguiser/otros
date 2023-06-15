public class NodoDE<T>{
    //Este nodo tiene tres cosas 
    //Un nodo antecesor y su sucesor y el dato
    private NodoDE<T> ant;
    private NodoDE<T> suc;
    private T dato;
    //Construyo el nodo recibiendo como parametro un dato de tipo T
    public NodoDE(T dato){
      /**Por defecto el antecesor y sucesor no existen*/
      ant = suc = null; 
      this.dato = dato;
    }
    public T getDato(){
      return dato;
    }
    public void setDato(T dato){
       this.dato = dato;
    }
    public void setAnt(NodoDE<T> a){
       ant = a;
    }
    public void setSuc(NodoDE<T> s){
       suc = s;
    }
    public NodoDE<T> getAnt(){
      return ant;
    }
    public NodoDE<T> getSuc(){
      return suc;
    }
}
