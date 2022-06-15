package bg.softuni.MobileleMineVersion.repositories;

import bg.softuni.MobileleMineVersion.model.entities.ModelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<ModelEntity, Long> {
}
