package utils;

public enum Etalon {
    LOGIN_PAGE("src\\main\\resources\\loginPageEtalon.png"),
    SETTINGS_PAGE("src\\main\\resources\\settingsPageEtalon.png"),
    SETTINGS_PAGE_SCROLLED("src\\main\\resources\\settingsPageScrolled.png");

    String value;

    Etalon(String s) {
        this.value = s;
    }

    public String getValue(){
        return value;
    }
}
