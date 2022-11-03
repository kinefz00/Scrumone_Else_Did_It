package Scrumone_Else_Broke_It.WebShop.service;

import Scrumone_Else_Broke_It.WebShop.entity.Impressum;
import Scrumone_Else_Broke_It.WebShop.repository.ImpressumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpressumService {

    @Autowired
    private ImpressumRepository impressumRepository;

    public void saveImpressum(Impressum impressum){
        impressumRepository.save(impressum);
    }

    public Impressum getImpressumById(int id){
        return impressumRepository.findById(id).get();
    }

    public void edit(int id, Impressum impressum){
        impressum.setId(id);
        impressumRepository.save(impressum);
    }

}
