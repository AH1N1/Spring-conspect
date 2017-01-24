package AH1N1.entity.repository;

import AH1N1.entity.Hotel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by RENT on 2017-01-24.
 */
@Repository
public interface HotelsRepository extends JpaRepository<Hotel, Long> {
}
