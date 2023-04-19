package lesson1.japanese.bank;

public class Account {
    private String id;
    private String owner;
    private int balance;

    public String getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public Account(String id, String owner, int balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;

    }


    // добавление денег на счет
    // и возвращение полученного баланса
    public int debit(int money){
        if (money < 0) {
            System.out.println("Отрицательная сумма для дебита");
        } else {
            balance += money;
        }
        return balance;
    }

    // удаление денег со счета
    // нельзя удалить больше чем на счете есть
    // при пытытке удалить больше, не нужно менять баланс счета, но нужно
    // печатать об этом сообщение
    // возвращается количество денег оставшихся на балансе
    public int credit(int money)
    {
        if(money > balance)
        {
            System.out.println("сумма больше баланса");
            return 0;
        }
        balance -= money;
        return balance;
    }


    // перевод денег со счета на счет
    // кредитуем свой счет и дебитуем account
    // возвращается баланс счета
    // при попытке снять больше чем есть на счете нужно печатать сообщение
    public int transfer(Account account, int amount)
    {
        // кредитуем наш счет (снимаем с него amount денег)
        // дебитуем счет account на количество реально снятых денег

        // сколько было - сколько стало
        int amountDebited = (balance - credit(amount));
        account.debit(amountDebited);

        return balance;
    }

}

