package by.itacademy.anatoliystavskiy.pages;

public class LoginPage extends BasePage{
    protected String LOGIN_PAGE = BASE_URL;
    String title = "Форма логина";

    public String getTitle(){
        return title;

    }
    @Override
    public void open() {
        System.out.println(LOGIN_PAGE + "/" + getTitle());
    }
}
