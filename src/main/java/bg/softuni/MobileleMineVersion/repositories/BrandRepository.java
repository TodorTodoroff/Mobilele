package bg.softuni.MobileleMineVersion.repositories;

import bg.softuni.MobileleMineVersion.model.entities.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<BrandEntity,Long> {
}
