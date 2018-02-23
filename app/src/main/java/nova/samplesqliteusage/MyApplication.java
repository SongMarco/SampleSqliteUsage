package nova.samplesqliteusage;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by Administrator on 2018-02-24.
 */

public class MyApplication extends Application {
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}

