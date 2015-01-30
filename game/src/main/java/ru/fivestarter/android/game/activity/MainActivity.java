package ru.fivestarter.android.game.activity;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import ru.fivestarter.android.game.R;

/**
 * @author yuriy on 17.01.15.
 */
public class MainActivity extends Activity {

    private NotificationManager nm;
    private final int NOTIFICATION_ID = 127;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        nm = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);

    }

    public void showNotification(View view) {
        Notification.Builder builder = new Notification.Builder(getApplicationContext());

        Intent intent = new Intent(getApplicationContext(), FinishActivity.class);
        PendingIntent pendingIntent =
                PendingIntent.getActivity(getApplicationContext(), 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);

        builder.setContentIntent(pendingIntent);
        builder.setSmallIcon(R.drawable.ic_launcher);
        builder.setLargeIcon(
                BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.ic_launcher));
        builder.setTicker("Новое уведомление");
        builder.setWhen(System.currentTimeMillis());
        builder.setAutoCancel(true);
        builder.setContentTitle("Уведомление");
        builder.setContentText("Press if you want know a secret");
        builder.setProgress(100, 20, false);

        Notification build = builder.build();
       build.defaults = Notification.DEFAULT_SOUND;
//        build.sound = Uri.parse("android.resource://ru.fivestarter.android.game/" + R.raw.blind);*/
//        long[] vibrate = new long[] {1500, 1000, 1500, 1000};
//        build.vibrate = vibrate;

        build.flags = build.flags | Notification.FLAG_INSISTENT;
        nm.notify(NOTIFICATION_ID, build);
    }

    public void cancelNotification(View view) {
        nm.cancel(NOTIFICATION_ID);
    }
}
