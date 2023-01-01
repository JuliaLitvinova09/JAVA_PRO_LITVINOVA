package homework26;

import homework26.model.Account;
import homework26.model.Book;
import homework26.model.Chain;
import homework26.model.Client;
import homework26.service.BookService;
import homework26.service.ClientService;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Chain chain = new Chain();
        chain.setName("METRO");


        Client client = new Client();
        ClientService clientService = new ClientService();
        client.setName("Nina Frolova");
        client.setPhone(3816566544542356L);
        client.setAbout("About Frolova");
        client.setEmail("nina_f@mail.ua");
        client.setAge(25);
        client.setChain(chain);

        Account account = new Account();
        account.setNumber("2600464646456");
        account.setValue(10000);
        account.setClient(client);

        HashSet<Account> accounts = new HashSet<>();
        accounts.add(account);

        client.setAccounts(accounts);

        Book book = new Book();
        BookService bookService = new BookService();

        book.setName("Harry Potter, part 1");
        bookService.save(book);

        HashSet<Book> books = new HashSet<>();
        books.add(book);

        client.setBooks(books);
        clientService.save(client);

    }
}
