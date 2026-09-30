package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/O;", "Landroid/app/Fragment;", "<init>", "()V", "androidx/lifecycle/a", "a", "androidx/lifecycle/M", "lifecycle-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class O extends Fragment {
    public static final /* synthetic */ int purple = 0;
    public C0631a alpha;

    /* loaded from: classes3.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {

        @NotNull
        public static final N Companion = new Object();

        public static final void registerIn(@NotNull Activity activity) {
            Companion.getClass();
            Intrinsics.echo(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.echo(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            Intrinsics.echo(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.echo(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.echo(activity, "activity");
            int i4 = O.purple;
            M.alpha(activity, aa.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@NotNull Activity activity) {
            Intrinsics.echo(activity, "activity");
            int i4 = O.purple;
            M.alpha(activity, aa.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(@NotNull Activity activity) {
            Intrinsics.echo(activity, "activity");
            int i4 = O.purple;
            M.alpha(activity, aa.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(@NotNull Activity activity) {
            Intrinsics.echo(activity, "activity");
            int i4 = O.purple;
            M.alpha(activity, aa.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(@NotNull Activity activity) {
            Intrinsics.echo(activity, "activity");
            int i4 = O.purple;
            M.alpha(activity, aa.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(@NotNull Activity activity) {
            Intrinsics.echo(activity, "activity");
            int i4 = O.purple;
            M.alpha(activity, aa.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            Intrinsics.echo(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
            Intrinsics.echo(activity, "activity");
            Intrinsics.echo(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            Intrinsics.echo(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.echo(activity, "activity");
        }
    }

    public final void alpha(aa aaVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            Intrinsics.delta(activity, "getActivity(...)");
            M.alpha(activity, aaVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        alpha(aa.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        alpha(aa.ON_DESTROY);
        this.alpha = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        alpha(aa.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C0631a c0631a = this.alpha;
        if (c0631a != null) {
            ((G) c0631a.alpha).alpha();
        }
        alpha(aa.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C0631a c0631a = this.alpha;
        if (c0631a != null) {
            G g2 = (G) c0631a.alpha;
            int i4 = g2.alpha + 1;
            g2.alpha = i4;
            if (i4 == 1 && g2.silver) {
                g2.white.foxtrot(aa.ON_START);
                g2.silver = false;
            }
        }
        alpha(aa.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        alpha(aa.ON_STOP);
    }
}
