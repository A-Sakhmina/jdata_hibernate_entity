# Задача DAO слой c JPA Repositories
Код по [ссылке](https://github.com/A-Sakhmina/jdata_hibernate_entity/tree/jpa-repository/src/main/java/com/sakh/jdata_dao_persons_hibernate)

Приложение для работы с БД, использующее средства Spring по конфигурации и работе с Hibernate.

## Описание

Метод `findByCity(String city)` в `PersonsRepository` принимает название города и возвращает Entity из базы данных, 
которые соответствуют этому `city`.

Контроллер `PersonController` с методом-обработчиком GET-метода запроса с маппингом на endpoint `/persons/by-city`. 
В query params запроса будет приходить строковый параметр `city`, который передаётся дальше в репозиторий. 
То есть метод обрабатывает запрос вида `localhost:8080/persons/by-city?city=Moscow`.

Репозиторий переписан с использованием `JpaRepository<Person, PersonInfo>` на основе методов-запросов:

- основные методы для `CRUD` операций
- метод, который будет принимать название города(`city`) и возвращать `Entity` из базы данных, которые соответствуют этому `city`.
- метод, который будет принимать возраст(`age`) и возвращать `Entity` из базы данных, которые меньше переданного `age` и отсортированы по возрастанию.
- метод, который будет принимать имя и фамилию(`name` и `surname`) и возвращать `Entity` из базы данных, которые соответствуют сочетанию `name` и `surname` и является `Optional`.
