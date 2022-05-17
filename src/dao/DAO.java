package dao;

import java.util.ArrayList;


public interface DAO<T> {
    public boolean inserir(T t);
    public ArrayList<T> consultar(T t);
    public T atualizar(T t);
    public boolean excluir(T t);
}
