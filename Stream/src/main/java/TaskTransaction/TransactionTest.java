package TaskTransaction;

import java.util.Comparator;
import java.util.Optional;

import static java.util.Comparator.comparing;

public class TransactionTest {
    public static void main(String[] args) {

        //1- Find all transactions in 2011 and sort by value
        System.out.println("******Task-1************");
        TransactionData.getAll().stream()
                .filter(t->t.getYear()==2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        //2- What are all the unique cities where the traders work?
        System.out.println("******Task-2************");
        TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        //3- Find all traders from Cambridge and sort them by name
        System.out.println("******Task-3************");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getTrader)
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);


        //4- Return a string of all trader's names sorted alphabetically
        System.out.println("******Task-4************");
        String reduce = TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .sorted(comparing(Trader::getName))
                .map(Trader::getName)
                .distinct()
                .reduce("", (name1, name2) -> name1 + name2);
        System.out.println("reduce = " + reduce);

        //5- Are any traders based in Milan?
        System.out.println("******Task-5************");
        boolean milan = TransactionData.getAll().stream()
                .anyMatch(t -> t.getTrader().getCity().equals("Milan"));
        System.out.println("milan = " + milan);

        //6- Print the values of all transactions from the traders living in Cambridge
        System.out.println("******Task-6************");
        TransactionData.getAll().stream()
                .filter(t->t.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        //7 - What is the highest value of all the transactions
        System.out.println("******Task-7************");
        Optional<Integer> maxValue = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println("naxValue.get() = " + maxValue.get());

        //8-Find the transaction with the smallest value
        System.out.println("******Task-8************");
        Optional<Integer> minValue = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::min);
        System.out.println("minValue.get() = " + minValue.get());

        Optional<Transaction> Value2 = TransactionData.getAll().stream()
                .min(comparing(Transaction::getValue));
        System.out.println("Value2.get() = " + Value2.get());



    }
}
