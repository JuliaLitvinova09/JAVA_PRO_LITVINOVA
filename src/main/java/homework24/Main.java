package homework24;

import homework24.entity.Client;
import homework24.entity.Status;
import homework24.service.ClientService;
import homework24.service.StatusService;

import java.util.List;

//2. Создать сервисы для своих сущностей: ClientService, StatusService, AccountService,
// у каждого из которых реализовать CRUD методы для полного
// сохранения/обновления/получения списка/удаления сущностей соответствующих;


//  5. Добавить метод для получения number из Account, где value > переданного значения;
//  6. Добавить метод для получения всех Clients где id клиент = client_id
//  таблицы сущности Accounts;
//  7. Добавить метод для получения значений clients.name, clients.email, statuses.alias
//  из таблицы клиентов(Clients) и из таблицы статусов(Statuses)
//  используя join 3х таблиц и  где возраст пользователей старше 18 лет. (Если возраста нет,
//  надо что-то сделать чтобы был)
public class Main {
    public static ClientService clientService = new ClientService();
    public static StatusService statusService = new StatusService();

    public static void main(String[] args) {
        //1. РАБОТА С СУЩНОСТЬЮ "КЛИЕНТ"

        //saveToClientTable();   // Клиента Nadya сохраняем в таблицу клиентов
        //updateClientTable();  // изменение данных клиента Nadya
        // deleteClientTable();  // удаление клиента Nadya

       // List<Client> clients = clientService.getAll(); // получение списка клиентов
        // clients.forEach(System.out::println);

//        Client client = clientService.findByPhone(380661233321l); // поиск по номеру телефона
//        System.out.println(client);

        //2. РАБОТА С СУЩНОСТЬЮ "STATUS"
       // saveToStatusTable();   // Статус ид=4 сохраняем в базу
        //updateStatusTable();  //  меняем название  на верхний регистр
       //  deleteStatusTable();  // удаление статуса ид=4

//        List <Status> statusList = statusService.getAll(); // получение списка клиентов
//        statusList.forEach(System.out::println);
    }

    public static void saveToClientTable() {
        Client client = new Client();
        client.setName("Nadya");
        client.setPhone(380563402356L);
        client.setAbout("About Nadya");
        client.setEmail("Nadya@mail.ua");
        clientService.save(client);
    }

    public static void updateClientTable() {
        Client client = new Client();
        client.setName("Nadya");
        client.setPhone(380563402356L);
        client.setAbout("New info about Nadya");
        clientService.update(client);
    }

    public static void deleteClientTable() {
        Client client = new Client();
        client.setName("Nadya");
        clientService.delete(client);
    }

    public static void saveToStatusTable() {
        Status status = new Status();
        status.setId(4);
        status.setAlias("NEW ALIAS");
        status.setDescription("NEW DESCRIPTION");
        statusService.save(status);
    }

    public static void updateStatusTable() {
        Status status = new Status();
        status.setAlias("NEW ALIAS ***** ");
        status.setDescription("NEW DESCRIPTION ****");
        status.setId(4);
        statusService.update(status);
    }

    public static void deleteStatusTable() {
        Status status = new Status();
        status.setId(4);
        statusService.delete(status);
    }

}

