package testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    final String login = "John_Doe";
    final String email = "johnDoe@someweb.net";


    /* Создайте тест, который выполнит тестирование создания объекта User с передачей в него двух параметров.
    Такая функция лишь должна проверять устанавливаются ли данные при создании объекта;*/

    @Test
    void isUserCreated(){
        var user = new User(login,email);
        assertNotNull(user);
    }

/*    Создайте аналогичный тест, который выполнит
    тестирование по созданию объекта без передачи в него параметров;*/

    @Test
    void isNewUserEmpty(){
        var user = new User();
        assertNull(user.getLogin());
        assertNull(user.getEmail());
    }

 /*   Создайте тест, который протестирует установлен ли
    корректный Email адрес в поле email в классе User.*/

    @Test
    void isUserEmailSetCorrectly(){
        var user = new User(login,email);
        assertTrue(user.getEmail().contains("@"));
        assertTrue(user.getEmail().contains("."));
    }

/*
    Создайте тест, который определяет, равны ли login и email
*/

    @Test
    void isUserLoginAndEmailEqual(){
        var user = new User(login,email);
        assertFalse(user.getLogin().length() == user.getEmail().length());
    }

}