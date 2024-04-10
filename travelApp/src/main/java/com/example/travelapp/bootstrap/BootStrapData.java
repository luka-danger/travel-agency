package com.example.travelapp.bootstrap;

import com.example.travelapp.dao.CustomerRepository;
import com.example.travelapp.dao.DivisionRepository;
import com.example.travelapp.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        // Reset Repo
        // customerRepository.deleteAll();

        Customer jesse = new Customer("Jesse", "Pinkman", "9809 Margo Street", "87104", "(505)148-3369");
        Customer walt = new Customer("Walter", "White", "308 Negra Arroyo Lane", "87104", "(505)555-5555");
        Customer lucille = new Customer("Lucille", "Bluth", "1 Lucille Lane", "92603", "(949)-555-5555");
        Customer michael = new Customer("Michael", "Scott", "1725 Slough Avenue", "18505", "(407)555-5555");
        Customer elaine = new Customer ("Elaine", "Benes", "78 West 86th St Apt 33", "10009", "(646)-555-5555");

        if (customerRepository.count() == 0) {
            customerRepository.save(jesse);
            customerRepository.save(walt);
            customerRepository.save(lucille);
            customerRepository.save(michael);
            customerRepository.save(elaine);
        }


    }



}
