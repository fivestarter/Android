package ru.fivestarter.android.game.util;

/**
 * @author yuriy on 17.01.15.
 */
public enum Language {
    ENGLISH("Английский"),
    RUSSIAN("Русский"),
    BELORUSSIAN("Белорусский");
    private String language;

    Language(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}
