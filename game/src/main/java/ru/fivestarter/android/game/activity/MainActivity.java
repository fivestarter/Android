package ru.fivestarter.android.game.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import ru.fivestarter.android.game.R;
import ru.fivestarter.android.game.util.RequestCode;

/**
 * @author yuriy on 17.01.15.
 */
public class MainActivity extends Activity {

    private TextView textName;
    private TextView textLanguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        textName = (TextView) findViewById(R.id.textName);
        textLanguage = (TextView) findViewById(R.id.textLanguage);
    }

/*    public void onShow(View view) {
        Intent intent;

        switch (view.getId()) {
            case R.id.btnPresented:
                intent = new Intent(this, PresentedActivity.class);
                startActivityForResult(intent, RequestCode.PRESENTED.getCode());
                break;

            case R.id.btnLanguage:
                intent = new Intent(this, LanguageActivity.class);
                startActivityForResult(intent, RequestCode.LANGUAGE.getCode());
                break;

            default:
                break;
        }
    }*/

    public void onPresent(View view) {
        Intent intent = new Intent(this, PresentedActivity.class);
        startActivityForResult(intent, RequestCode.PRESENTED);

    }

    public void onChoiceLanguage(View view) {
        Intent intent = new Intent(this, LanguageActivity.class);
        startActivityForResult(intent, RequestCode.LANGUAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case RequestCode.PRESENTED:
                    String name = data.getStringExtra("name");
                    textName.setText("Рад знакомству " + name);
                    break;

                case RequestCode.LANGUAGE:
                    String language = data.getStringExtra("language");
                    textLanguage.setText("Ваш язык: " + language);
                    break;

                default:
                    break;
            }

        } else {
            Toast.makeText(this, "Error!", Toast.LENGTH_SHORT).show();
        }
    }
}
