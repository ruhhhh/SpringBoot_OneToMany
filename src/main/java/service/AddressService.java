package service;

import entity.Address;
import entity.Human;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AddressRepository;
import repository.HumanRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    private final AddressRepository addressRepository;
    private final HumanRepository humanRepository;

    public AddressService(AddressRepository addressRepository, HumanRepository humanRepository) {
        this.addressRepository = addressRepository;
        this.humanRepository = humanRepository;
    }

    public void addAddress()
    {
        Address address = new Address("Ankara", "Yenimahalle", "YeniBatı", "Caddesi", 2 , 60300) ;
        addressRepository.save(address);

        Human human = new Human("Umut", 30);
        human.setAddress(address);
        humanRepository.save(human);
    }

    public void deleteAddress(Integer id)
    {
        Optional<Address> deleteItem = addressRepository.findById(id);
        addressRepository.delete(deleteItem.orElse(new Address()));
    }


}
