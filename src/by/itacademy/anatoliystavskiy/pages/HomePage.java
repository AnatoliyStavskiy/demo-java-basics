package by.itacademy.anatoliystavskiy.pages;

public class HomePage extends BasePage{
    protected String HOME_URL = BASE_URL;
    String title = "Домашняя страница";

    public String getTitle(){
        return title;
    }

    @Override
    public void open() {
        System.out.println("Пользователь открыл страницу " + HOME_URL + "/" + getTitle());
    }

    public void click(){
        System.out.println("Пользователь кликнул по кнопке войти");
    }
}
