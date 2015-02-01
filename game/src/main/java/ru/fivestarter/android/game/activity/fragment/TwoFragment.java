package ru.fivestarter.android.game.activity.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.fivestarter.android.game.R;

/**
 * @author yuriy on 01.02.15.
 */
public class TwoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.two_fragment, null);
    }
}
