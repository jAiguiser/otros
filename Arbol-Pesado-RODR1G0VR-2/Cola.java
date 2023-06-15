public class Cola<T>
{
   /**Toda cola tiene dos elementos clave 
      Un Frente y un Final que son Nodos de Doble Enlace para mayor movilidad */
   protected NodoDE<T> frente,fin;
   /**Constructor de la Cola*/
   public Cola(){
     /**Toda Estructura al crearse debe ser Vacia*/
     frente = null; 
     fin = null;
   }
   
   public boolean esVacia(){
     return frente == null;
   }
   
   public void encolar(T dato){
      //Pongo el dato dentro de un nuevo NodoDE asi para poder enlazar 
      NodoDE<T> nuevo = new NodoDE<T>(dato);
      if(esVacia()){
          //Si mi cola es vacia, entonces ese nodo será el frente y el final
          frente = fin = nuevo;
      }else{
          //Caso contrario este nodo debe ir al final y enlazarse con este
          fin.setSuc(nuevo);
          nuevo.setAnt(fin);
          //Y ahora mi nuevo final es ese nuevo Nodo
          fin = nuevo;
      }
   }
   
   public T decolar(){
      T dato;
      if(esVacia()){
          //Si la lista es vacia entonces no existe datro a eliminar 
          dato = null;
      }else{
          //Entonces por lo menos existe un dato el cual puedo eliminar
          dato = frente.getDato();
          frente = frente.getSuc();
          if(frente == null){
               //Para borrar algun vestigio de que alguna vez existió una lista
               fin = null;
          }else{
              //Si el frente no es vacio, entonces debo eliminar conexión con el anterior
              //Garbage Collector lo quitara del proceso
              frente.setAnt(null);
            }
      }
      return dato;
   }
   
   public T ver(){
     T dato;
     if(esVacia()){
          dato = null;
        }else{
          dato = frente.getDato();
        }
     return dato;
   }
}