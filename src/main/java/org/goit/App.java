package org.goit;



import org.goit.entities.Client;
import org.goit.entities.Planet;
import org.goit.flyway.FlywayMigrationExecutor;
import org.goit.hibernate.HibernateUtil;
import org.goit.service.ClientCrudService;
import org.goit.service.PlanetCrudService;



public class App {
    public static void main(String[] args) {
        FlywayMigrationExecutor.executeMigration();
        try(HibernateUtil util = HibernateUtil.getInstance()){
            ClientCrudService clientService = new ClientCrudService();
            PlanetCrudService planetService = new PlanetCrudService();

            //create
            Client newClient = new Client();
            newClient.setName("I'm new client");

            Planet newPlanet = new Planet();
            newPlanet.setName("Mercury");

            clientService.save(newClient);
            planetService.save(newPlanet);


            //read
            Client client = clientService.findById(1);
            Planet planet = planetService.findById(3);

            //update
            client.setName("I have a new name now");
            planet.setName("Far far planet");

            clientService.update(client);
            planetService.update(planet);

            //delete
            clientService.delete(client);
            planetService.delete(planet);

        }
    }
}
