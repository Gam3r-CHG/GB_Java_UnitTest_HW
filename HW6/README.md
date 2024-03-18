# Набор тестов для класса Utils

Тесты проверяют работу метода `compareLists()`, который сравнивает средние значения двух входных массивов. 

**Тесты проверяют:**
- случаи с пустым массивом
- null-значениями
- равными средними значениями 
- случаи, когда один из массивов имеет большее среднее значение

Покрытие кода: **100%**

Такие тесты были выбраны, чтобы убедиться, что метод `compareLists()` корректно обрабатывает различные сценарии и возвращает ожидаемые результаты.

`@BeforeEach` и `@AfterEach` используются для настройки и очистки тестового окружения перед и после каждого теста. 

В данном случае, они также используются для перенаправления стандартного вывода в `ByteArrayOutputStream`, чтобы можно было проверить вывод метода `compareLists()` в консоль.

Для класса `Utils` была выполнена проверка с помощью `checkstyle` с настройками `google`. Ошибок не выявлено. Отчет находится в папке `./checkstyle`.

# Test Suite for the Utils Class

The tests examine the functionality of the `compareLists()` method, which compares the average values of two input arrays.

**Tests cover:**

- Cases with an empty array
- Null values
- Equal average values
- Cases where one of the arrays has a larger average value

Code coverage: **100%**

These tests were chosen to ensure that the `compareLists()` method correctly handles various scenarios and returns expected results.

`@BeforeEach` and `@AfterEach` are used for setting up and cleaning up the test environment before and after each test.

In this case, they are also used to redirect the standard output to `ByteArrayOutputStream`, so that the output of the `compareLists()` method to the console can be checked.

The `Utils` class has been checked with `checkstyle` using `google` settings. No errors were found. The report is located in the `./checkstyle` folder.