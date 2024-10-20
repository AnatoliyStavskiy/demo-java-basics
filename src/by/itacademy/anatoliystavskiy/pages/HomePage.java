package by.itacademy.anatoliystavskiy.pages;

public class HomePage extends BasePage{
    protected String HOME_URL = BASE_URL;
    String title = "Домашняя страница";

    @Override
    public void open() {
        super.open();
    }

    public String getTitle(){
        return title;
    }

    public void click(){
        System.out.println("Пользователь кликнул по кнопке войти");
    }
}
