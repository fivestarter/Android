package ru.fivestarter.android.game.activity;

import android.app.Activity;
import android.os.Bundle;
import ru.fivestarter.android.game.R;

/**
 * @author yuriy on 17.01.15.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }

}
