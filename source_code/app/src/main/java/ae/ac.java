package ae;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class ac {

    @NotNull
    private final CopyOnWriteArrayList<InterfaceC0424c> cancellables = new CopyOnWriteArrayList<>();

    @Nullable
    private Function0<Unit> enabledChangedCallback;
    private boolean isEnabled;

    public ac(boolean z2) {
        this.isEnabled = z2;
    }

    public final void addCancellable(@NotNull InterfaceC0424c cancellable) {
        Intrinsics.echo(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    @Nullable
    public final Function0<Unit> getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    public void handleOnBackCancelled() {
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(@NotNull C0423b backEvent) {
        Intrinsics.echo(backEvent, "backEvent");
    }

    public void handleOnBackStarted(@NotNull C0423b backEvent) {
        Intrinsics.echo(backEvent, "backEvent");
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((InterfaceC0424c) it.next()).cancel();
        }
    }

    public final void removeCancellable(@NotNull InterfaceC0424c cancellable) {
        Intrinsics.echo(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }

    public final void setEnabled(boolean z2) {
        this.isEnabled = z2;
        Function0<Unit> function0 = this.enabledChangedCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(@Nullable Function0<Unit> function0) {
        this.enabledChangedCallback = function0;
    }
}
