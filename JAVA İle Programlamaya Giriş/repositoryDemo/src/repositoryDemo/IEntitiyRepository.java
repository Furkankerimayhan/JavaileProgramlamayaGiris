package repositoryDemo;

public interface IEntitiyRepository<T extends IEntitity> {
	void add(T entity);
	void delete(T entity);
	void update(T entity);
	
}
