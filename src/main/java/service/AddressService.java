package service;

import entity.Address;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Service;
import repository.AddressRepository;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public void addAddress()
    {
        Address address = new Address();
        address.setIl("Ankara");
        address.setIlce("Yenimahalle");
        address.setSokak("YeniBatı");
        address.setCadde("FSM Caddesi");
        address.setKapiNo(2);
        address.setPostaKodu(60300);
        addressRepository.save(address);
    }

    public void deleteAddress()
    {

    }

    public void findAddress(String il, Integer id)
    {
        addressRepository.findByIlOrPostaKodu(il, id);
    }
}
