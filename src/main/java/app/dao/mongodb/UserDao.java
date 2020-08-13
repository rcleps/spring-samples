package app.dao.mongodb;

import app.rest.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends PagingAndSortingRepository<User,String> {

}
