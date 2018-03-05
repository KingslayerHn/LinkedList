public class   LinkedList {
    private Nodo head=null;
    private int longitud =0;
    public class Nodo {
        public Object data; 
        public Nodo siguiente = null;
       
        public Nodo(Object data){
            this.data = data;
        }
    }
    
    public boolean insertar(int n,Object data){
        Nodo nodo = new Nodo(data);
        if(head==null){
            head = nodo;
            longitud++;
            return true;
        }else{
            Nodo pointer = head; 
            int count =0;
            while(pointer.siguiente != null && count<n){
                pointer = pointer.siguiente;
                count++;
            }
                nodo.siguiente = pointer.siguiente;
                pointer.siguiente = nodo;
                longitud++;
                return true;
        }
    }
    
    public int longitudLista(){
        return longitud;
    }
    
    public boolean delete(int n){
    
        if(head != null){
            if(n==0){
                Nodo primero = head;
                head  = head.siguiente;
                primero.siguiente = null;
                longitud--;
                return true;
            }else if(n<longitud){
                Nodo pointer = head; 
                int contador =0;
                while(contador <(n-1) && pointer.siguiente != null){
                    pointer = pointer.siguiente;
                    contador++;
                }
                Nodo temp = pointer.siguiente;
                pointer.siguiente = temp.siguiente;
                temp.siguiente = null;
                longitud--;     
            }else{
                return false;
            }               
        }        
        return false;
    }
    
    public Object getObject(int n){
       if(head == null){
           return null;
       }else{
           Nodo pointer = head; 
           int count =0;
           while(pointer.siguiente != null && count<n){
                pointer = pointer.siguiente;
                count++;
            }
           if(count != n){
               return null;
           }else{
               return pointer.data;
           }   
        }      
    }
}
