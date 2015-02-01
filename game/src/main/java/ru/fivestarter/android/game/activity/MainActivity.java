package ru.fivestarter.android.game.activity;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import ru.fivestarter.android.game.R;
import ru.fivestarter.android.game.activity.fragment.OneFragment;
import ru.fivestarter.android.game.activity.fragment.TwoFragment;

/**
 * @author yuriy on 17.01.15.
 */
public class MainActivity extends Activity {

    private OneFragment oneFragment;
    private TwoFragment twoFragment;

    private FragmentManager manager;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        manager = getFragmentManager();

        oneFragment = new OneFragment();
        twoFragment = new TwoFragment();
    }

    public void onClickFragment(View view) {
        transaction = manager.beginTransaction();

        switch (view.getId()) {
            case R.id.btnAdd:
                transaction.add(R.id.container, oneFragment);
                break;
        }

        transaction.commit();
    }

}
