package com.checkout.components.redirecthandler.customtab;

import ae.o;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/checkout/components/redirecthandler/customtab/AuthTabReRegistrationObserver;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Application;", "application", "Ljava/lang/Class;", "Landroid/app/Activity;", "callerActivityClass", "Lkotlin/Function1;", "Lae/o;", "", "onActivityRecreated", "<init>", "(Landroid/app/Application;Ljava/lang/Class;Lkotlin/jvm/functions/Function1;)V", "unregister", "()V", "activity", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AuthTabReRegistrationObserver implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final Application f5662a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f5663b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f5664c;

    public AuthTabReRegistrationObserver(@NotNull Application application, @NotNull Class<? extends Activity> callerActivityClass, @NotNull Function1<? super o, Unit> onActivityRecreated) {
        Intrinsics.echo(application, "application");
        Intrinsics.echo(callerActivityClass, "callerActivityClass");
        Intrinsics.echo(onActivityRecreated, "onActivityRecreated");
        this.f5662a = application;
        this.f5663b = callerActivityClass;
        this.f5664c = onActivityRecreated;
        application.registerActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        Intrinsics.echo(activity, "activity");
        if (savedInstanceState != null && Intrinsics.areEqual(activity.getClass(), this.f5663b) && (activity instanceof o)) {
            this.f5664c.invoke(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.echo(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.echo(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.echo(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.echo(activity, "activity");
        Intrinsics.echo(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.echo(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.echo(activity, "activity");
    }

    public final void unregister() {
        this.f5662a.unregisterActivityLifecycleCallbacks(this);
    }
}
