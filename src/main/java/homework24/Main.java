package homework24;

import homework24.entity.Account;
import homework24.entity.Client;
import homework24.entity.Status;
import homework24.service.AccountService;
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
    public static AccountService accountService = new AccountService();

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

//        List <Status> statusList = statusService.getAll(); // получение списка статусов
//        statusList.forEach(System.out::println);

        //3. РАБОТА С СУЩНОСТЬЮ "ACCOUNT"
//        saveToAccountTable();
//        updateAccountTable();
//        deleteAccountable();

        List<String> accounts = accountService.getListNumberByValue(120.55); // получение списка счетов по условию
        accounts.forEach(System.out::println);

        List<Account> accountList = accountService.getAll(); // получение списка счетов
        accountList.forEach(System.out::println);
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

    public static void saveToAccountTable() {
        Account account = new Account();
        account.setClient_id(17);
        account.setValue(12560.00);
        account.setNumber("26005325354");
        accountService.save(account);
    }

    public static void updateAccountTable() {
        Account account = new Account();
        account.setClient_id(17);
        account.setValue(456235.55);
        accountService.update(account);
    }

    public static void deleteAccountable() {
        Account account = new Account();
        account.setClient_id(17);
        accountService.delete(account);
    }

}
