package service;

import org.springframework.stereotype.Service;
import repository.InsuranceRepository;

@Service
public class InsuranceService {

    private final InsuranceRepository insuranceRepository;

    public InsuranceService(InsuranceRepository insuranceRepository) {
        this.insuranceRepository = insuranceRepository;
    }

    public void addInsurance()
    {

    }

    public void findByInsurance(Integer id)
    {
        insuranceRepository.findById(id);
    }
}
