package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<OutsourcedPart> newParts = new ArrayList<>();  // ArrayList for new parts

        // Create and configure the part 1
        OutsourcedPart part1 = new OutsourcedPart();
        part1.setCompanyName("HAL 9000");
        part1.setName("AI Behavior Module");
        part1.setInv(12);
        part1.setPrice(500.0);
        newParts.add(part1);

        // part 2
        OutsourcedPart part2 = new OutsourcedPart();
        part2.setCompanyName("Thermonator");
        part2.setName("Flamethrower Arm");
        part2.setInv(7);
        part2.setPrice(250.0);
        newParts.add(part2);

        // part 3
        OutsourcedPart part3 = new OutsourcedPart();
        part3.setCompanyName("SAM");
        part3.setName("Acid Spray Gun");
        part3.setInv(21);
        part3.setPrice(430.0);
        newParts.add(part3);

        // part 4
        OutsourcedPart part4 = new OutsourcedPart();
        part4.setCompanyName("Cybot Galactica");
        part4.setName("TranLang III Communication Module");
        part4.setInv(16);
        part4.setPrice(780.0);
        newParts.add(part4);

        // part 5
        OutsourcedPart part5 = new OutsourcedPart();
        part5.setCompanyName("T.O. Morrow Corp");
        part5.setName("Tornado Vacuum Attachment");
        part5.setInv(6);
        part5.setPrice(320.0);
        newParts.add(part5);

        // Iterate through the new parts and save them
        for (OutsourcedPart newPart : newParts) {
            outsourcedPartRepository.save(newPart);
        }

        // Retrieve and print the parts
        List<OutsourcedPart> savedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for (OutsourcedPart savedPart : savedParts) {
            System.out.println(savedPart.getName() + " " + savedPart.getCompanyName());
        }

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */



        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        Product battleDroid = new Product("Battle Droid",10000.0,18);
        Product cleaningRobot = new Product("Cleaning Robot",5000.0,12);
        Product gundam = new Product("Gundam: Wing 0",50000.0,3);
        Product butlerRobot = new Product("Alfred the Robot",15000.0,5);
        Product drinkingRobot = new Product("Drinking Buddy Robot",5.0,150);
        productRepository.save(battleDroid);
        productRepository.save(cleaningRobot);
        productRepository.save(gundam);
        productRepository.save(butlerRobot);
        productRepository.save(drinkingRobot);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}

