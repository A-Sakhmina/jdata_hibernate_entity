# Задача DAO слой c Hibernate
Код по [ссылке](https://github.com/A-Sakhmina/jdata_hibernate_entity/tree/master/src/main/java/com/sakh/jdata_dao_persons_hibernate)

Приложение для работы с БД, использующее средства Spring по конфигурации и работе с Hibernate.

## Описание

Метод `getPersonsByCity(String city)` в `PersonsRepository` принимает название города и возвращает Entity из базы данных, 
которые соответствуют этому `city`.

Контроллер `PersonController` с методом-обработчиком GET-метода запроса с маппингом на endpoint `/persons/by-city`. 
В query params запроса будет приходить строковый параметр `city`, который передаётся дальше в репозиторий. 
То есть метод обрабатывает запрос вида `localhost:8080/persons/by-city?city=Moscow`.