package by.epam.courses.module6.task3.server;

//Задание 3: создайте клиент-серверное приложение “Архив”.
//Общие требования к заданию:
//• В архиве хранятся Дела (например, студентов). Архив находится на сервере.
//• Клиент, в зависимости от прав, может запросить дело на просмотр, внести в
//него изменения, или создать новое дело.
//Требования к коду лабораторной работы:
//• Для реализации сетевого соединения используйте сокеты.
//• Формат хранения данных на сервере – xml-файлы.

public class Server {
    public static void main(String[] args) {
        ServerLogic slog = ServerLogic.getInstance();
        slog.start();
        slog.getRequests();
        slog.exit();
    }
}
