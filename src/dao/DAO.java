package dao;


public interface DAO<T> {
    public boolean inserir(T t);
    public T consultar(T t);
    public T atualizar(T t);
    public boolean excluir(T t);
}
