package homework25;

import homework25.model.Account;
import homework25.model.Client;
import homework25.model.Status;
import homework25.service.AccountService;
import homework25.service.ClientService;
import homework25.service.StatusService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // CLIENTS
        ClientService clientService = new ClientService();

        Client client = new Client();
        client.setName("Alina");
        client.setPhone(380633402123L);
        client.setAbout("About Alina");
        client.setEmail("Alina@mail.ua");
        client.setAge(27);

        clientService.save(client);

        Client clientById = clientService.getById(1);
        System.out.println(clientById.toString());

        Client clientByPhone = clientService.getByPhone(380633402123L);
        System.out.println(clientByPhone);

        clientById.setAbout("About Alina NEW");
        clientService.update(clientById);
        clientService.delete(clientById);

        List<Client> clientList = clientService.getAll();
        clientList.forEach(System.out::println);

//        // STATUSES
//        StatusService statusService = new StatusService();
//        Status status = new Status();
//        status.setAlias("PRIME_DOUBLE");
//        status.setDescription("PRIME_DOUBLE");
//        statusService.save(status);

//        Status statusById = statusService.getById(7);
//        System.out.println(statusById.toString());
//
//        statusById.setDescription("About new status");
//        statusService.update(statusById);
//        statusService.delete(statusById);
//
//        List<Status> statusList = statusService.getAll();
//        statusList.forEach(System.out::println);
//
//        // ACCOUNTS
//
//        AccountService accountService = new AccountService();
//        Account account = new Account();
//        account.setNumber("260036565656");
//        account.setValue(112.34);
//        account.setClientId(1);
//        accountService.save(account);

//        Account accountById = accountService.getById(17);
//        System.out.println(accountById.toString());
//
//        accountById.setValue(146);
//        accountService.update(accountById);
//        accountService.delete(accountById);
//
//        List<Account> accountList = accountService.getAll();
//        accountList.forEach(System.out::println);
    }
}