package repository;

import entity.Insurance;
import org.springframework.stereotype.Repository;
import service.InsuranceService;

import java.util.Set;

@Repository
public interface InsuranceRepository {

    Set<Insurance> findById (Integer id);

}
