package ru.fivestarter.android.game.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import ru.fivestarter.android.game.R;
import ru.fivestarter.android.game.util.Language;

/**
 * @author yuriy on 17.01.15.
 */
public class LanguageActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.language_layout);
    }

    public void onEnglish(View view) {
        returnLanguage(Language.ENGLISH.getLanguage());
    }

    public void onRussian(View view) {
        returnLanguage(Language.RUSSIAN.getLanguage());
    }

    public void onBeloRussian(View view) {
        returnLanguage(Language.BELORUSSIAN.getLanguage());
    }

    private void returnLanguage(String language) {
        Intent intent = new Intent();
        intent.putExtra("language", language);
        setResult(RESULT_OK, intent);
        finish();
    }
}
