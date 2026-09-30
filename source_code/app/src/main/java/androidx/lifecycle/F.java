package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class F extends AbstractC0645o {
    final /* synthetic */ G this$0;

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC0645o {
        final /* synthetic */ G this$0;

        public a(G g2) {
            this.this$0 = g2;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            Intrinsics.echo(activity, "activity");
            this.this$0.alpha();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            Intrinsics.echo(activity, "activity");
            G g2 = this.this$0;
            int i4 = g2.alpha + 1;
            g2.alpha = i4;
            if (i4 == 1 && g2.silver) {
                g2.white.foxtrot(aa.ON_START);
                g2.silver = false;
            }
        }
    }

    public F(G g2) {
        this.this$0 = g2;
    }

    @Override // androidx.lifecycle.AbstractC0645o, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.echo(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i4 = O.purple;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            Intrinsics.charlie(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((O) findFragmentByTag).alpha = this.this$0.f3129a;
        }
    }

    @Override // androidx.lifecycle.AbstractC0645o, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.echo(activity, "activity");
        G g2 = this.this$0;
        int i4 = g2.purple - 1;
        g2.purple = i4;
        if (i4 == 0) {
            Handler handler = g2.teal;
            Intrinsics.checkNotNull(handler);
            handler.postDelayed(g2.yellow, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        Intrinsics.echo(activity, "activity");
        E.alpha(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0645o, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.echo(activity, "activity");
        G g2 = this.this$0;
        int i4 = g2.alpha - 1;
        g2.alpha = i4;
        if (i4 == 0 && g2.red) {
            g2.white.foxtrot(aa.ON_STOP);
            g2.silver = true;
        }
    }
}
