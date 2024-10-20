package by.itacademy.anatoliystavskiy.pages;

public class Main {
    public static void main(String[] args) {
        BasePage basePage = new BasePage();
        basePage.open();
        HomePage homePage = new HomePage();
        homePage.open();
        homePage.click();
        LoginPage loginPage = new LoginPage();
        loginPage.open();
    }
}
