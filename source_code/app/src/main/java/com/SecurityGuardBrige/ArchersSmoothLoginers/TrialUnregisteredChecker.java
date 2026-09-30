package com.SecurityGuardBrige.ArchersSmoothLoginers;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.content.Context;
import android.os.AsyncTask;
import java.lang.ref.WeakReference;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public class TrialUnregisteredChecker {
    private static final String ENDPOINT = "https://archerssmoothmograph.io/SmileMorden/server/trial_unregistered.php?action=status";
    private static final String PREF_KEY = "trial_unreg_enabled";

    /* compiled from: Dex2C */
    /* loaded from: classes.dex */
    static class FetchTask extends AsyncTask {
        private WeakReference contextRef;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(38, FetchTask.class);
            Hidden0.special_clinit_38_00(FetchTask.class);
        }

        FetchTask(Context context) {
            this.contextRef = new WeakReference(context);
        }

        protected native Boolean doInBackground(Void... voidArr);

        @Override // android.os.AsyncTask
        protected native /* bridge */ /* synthetic */ Object doInBackground(Object... objArr);

        protected native void onPostExecute(Boolean bool);

        @Override // android.os.AsyncTask
        protected native /* bridge */ /* synthetic */ void onPostExecute(Object obj);
    }

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(39, TrialUnregisteredChecker.class);
        Hidden0.special_clinit_39_00(TrialUnregisteredChecker.class);
    }

    private static native void fetchStatusAsync(Context context);

    public static native boolean isTrialActive(Context context);
}
