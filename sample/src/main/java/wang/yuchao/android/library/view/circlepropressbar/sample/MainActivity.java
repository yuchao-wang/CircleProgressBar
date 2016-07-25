package wang.yuchao.android.library.view.circlepropressbar.sample;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import wang.yuchao.android.library.view.circleprogressbar.CircleProgressBar;
import wang.yuchao.android.library.view.sample.circleprogressbar.R;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CircleProgressBar circleProgressBar1 = (CircleProgressBar) findViewById(R.id.circleProgressBar1);
        final CircleProgressBar circleProgressBar2 = (CircleProgressBar) findViewById(R.id.circleProgressBar2);

        new AsyncTask<Void, Integer, Void>() {

            @Override
            protected void onProgressUpdate(Integer... values) {
                super.onProgressUpdate(values);
                circleProgressBar1.setProgress(values[0]);
                circleProgressBar2.setProgress(values[0]);
            }

            @Override
            protected Void doInBackground(Void... params) {
                for (int i = 0; i <= 100; i++) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    publishProgress(i);
                }
                return null;
            }
        }.execute();
    }

}
