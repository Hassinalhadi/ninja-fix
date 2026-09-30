package com.checkout.components.redirecthandler.customtab;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\rJ!\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\rJ\u001f\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/checkout/components/redirecthandler/customtab/CustomTabCancellationObserver;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "callerActivity", "Lkotlin/Function0;", "", "onCancelled", "<init>", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function0;)V", "unregister", "()V", "activity", "onActivityPaused", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityDestroyed", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "onActivityStopped", "outState", "onActivitySaveInstanceState", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomTabCancellationObserver implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f5665a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f5666b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5667c;

    public CustomTabCancellationObserver(@NotNull Activity callerActivity, @NotNull Function0<Unit> onCancelled) {
        Intrinsics.echo(callerActivity, "callerActivity");
        Intrinsics.echo(onCancelled, "onCancelled");
        this.f5665a = callerActivity;
        this.f5666b = onCancelled;
        callerActivity.getApplication().registerActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        Intrinsics.echo(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.echo(activity, "activity");
        Activity activity2 = this.f5665a;
        if (activity == activity2) {
            activity2.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.echo(activity, "activity");
        if (activity == this.f5665a) {
            this.f5667c = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.echo(activity, "activity");
        Activity activity2 = this.f5665a;
        if (activity == activity2 && this.f5667c) {
            activity2.getApplication().unregisterActivityLifecycleCallbacks(this);
            this.f5666b.invoke();
        }
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
        this.f5665a.getApplication().unregisterActivityLifecycleCallbacks(this);
    }
}
