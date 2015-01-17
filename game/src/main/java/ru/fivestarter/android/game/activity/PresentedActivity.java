package ru.fivestarter.android.game.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import ru.fivestarter.android.game.R;

/**
 * @author yuriy on 17.01.15.
 */
public class PresentedActivity extends Activity {

    private EditText editName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.presented_layout);

        editName = (EditText) findViewById(R.id.editName);
    }

    public void onPresented(View view) {
        Intent intent = new Intent();
        intent.putExtra("name", editName.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}
