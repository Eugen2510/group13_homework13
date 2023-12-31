package org.goit.service;

import org.goit.crud.ClientCrud;
import org.goit.entities.Client;

public class ClientCrudService {
    private final ClientCrud clientCrud = new ClientCrud();

    public void save(Client entity) {
        clientCrud.save(entity);
    }


    public Client findById(long id) {
       return clientCrud.findById(id);
    }


    public void update(Client entity) {
        clientCrud.update(entity);
    }


    public void delete(Client entity) {
       clientCrud.delete(entity);
    }
}
