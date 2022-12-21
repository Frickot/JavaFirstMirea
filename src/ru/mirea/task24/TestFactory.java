package ru.mirea.task24;
import ru.mirea.task24.ChairFactory;
import ru.mirea.task24.SuperChair;
import ru.mirea.task24.Chair;

public class TestFactory {
    public static void main(String[] args) {

        SuperChair MChair = ChairFactory.getChair("Универсальный", "Пластмасс", "Колесики","Прямая");
        SuperChair VChair = ChairFactory.getChair("Викторианский", "Дерево и ткань", "Изогнутые","Закругленная");
        SuperChair MagicChair = ChairFactory.getChair("Магический", "Пух кашмирской козы", "Левитируют", "По желанию");
        System.out.println(MagicChair);
        Seat(MagicChair);
    }

    public static void Seat(SuperChair ch)
    {

    }

}