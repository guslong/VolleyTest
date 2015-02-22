package net.anguslong.volleytest;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by gus on 22/02/15.
 */
public class VolleyApplication extends Application {

    private static VolleyApplication sInstance;

    /** we're going to create a request queue which will last for the lifetime of the application
     * it could also be implemented as a singleton
     */

    private RequestQueue mRequestQueue;

    @Override
    public void onCreate() {
        super.onCreate();
        mRequestQueue = Volley.newRequestQueue(this);
        sInstance = this;
    }

    public synchronized static VolleyApplication getInstance() {
        return sInstance;
    }

    public RequestQueue getRequestQueue() {
        return mRequestQueue;
    }
}
