package pl.javastart.equipy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.javastart.equipy.domain.Users;

@Repository
public interface UserRepository extends JpaRepository<Users,Long> {
}
