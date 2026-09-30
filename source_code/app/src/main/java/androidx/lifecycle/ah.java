package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ah extends AbstractC0645o {
    @Override // androidx.lifecycle.AbstractC0645o, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.echo(activity, "activity");
        int i4 = O.purple;
        M.bravo(activity);
    }
}
