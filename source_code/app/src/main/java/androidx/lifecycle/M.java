package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.O;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class M {
    /* JADX WARN: Multi-variable type inference failed */
    public static void alpha(Activity activity, aa event) {
        Intrinsics.echo(event, "event");
        if (activity instanceof al) {
            ac lifecycle = ((al) activity).getLifecycle();
            if (lifecycle instanceof an) {
                ((an) lifecycle).foxtrot(event);
            }
        }
    }

    public static void bravo(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            O.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new O.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new O(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
