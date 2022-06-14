package bg.softuni.MobileleMineVersion.repositories;

import bg.softuni.MobileleMineVersion.model.entities.OfferEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends JpaRepository<OfferEntity,Long> {


}
