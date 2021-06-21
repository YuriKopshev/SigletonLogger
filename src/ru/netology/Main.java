package ru.netology;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            logger.log("Приветсвую Вас! Введите размер списка:");
            int size = scanner.nextInt();
            List<Integer> integerList = new ArrayList<>(size);
            logger.log("Введите верхнюю границу для значений:");
            int maxValue = scanner.nextInt();
            for (int i = 0; i < size; i++) {
                integerList.add(random.nextInt(maxValue));
            }
            logger.log("Вот случайный список: " + integerList);
            logger.log("Введите порог для фильтра:");
            int filterValue = scanner.nextInt();
            logger.log("Запускаем фильтрацию...");
            Filter filter = new Filter(filterValue);
            for (Integer value : integerList) {
                if (value <= filterValue) {
                    logger.log("Элемент " + value + " не подходит");
                } else {
                    logger.log("Элемент " + value + " подходит");
                }
            }
            List<Integer> resultList = filter.filterOut(integerList);
            logger.log("Прошло фильтр " + resultList.size() + " элемента из " + integerList.size());
            logger.log("Выводим результат на экран\n" +
                    "Отфильтрованный список: " + resultList);
            logger.log("Завершаем программу");
            break;
        }
    }
}
