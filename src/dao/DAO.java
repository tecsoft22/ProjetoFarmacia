package dao;
/*Enderson PC testeee*/
import java.util.ArrayList;


public interface DAO<T> {
    public boolean inserir(T t);
    public T consultarItem(T t);
    public ArrayList<T> consultarAll();
    public boolean atualizar(T t);
    public boolean excluir(T t);
    
//    public T consultarUltimo();;
}
