package dao;
import java.util.List;

import models.*;
public interface IUserDao {

	public boolean insert(User u);
	public List<User> select(User u);
	public boolean update(User u);
	public boolean delete(User u);
}
