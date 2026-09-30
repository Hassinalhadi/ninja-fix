package androidx.navigation.internal;

import androidx.lifecycle.P;
import androidx.lifecycle.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/navigation/internal/NavBackStackEntryImpl$SavedStateViewModel", "Landroidx/lifecycle/Y;", "Landroidx/lifecycle/P;", "handle", "<init>", "(Landroidx/lifecycle/P;)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NavBackStackEntryImpl$SavedStateViewModel extends Y {
    public final P alpha;

    public NavBackStackEntryImpl$SavedStateViewModel(@NotNull P handle) {
        Intrinsics.echo(handle, "handle");
        this.alpha = handle;
    }
}
