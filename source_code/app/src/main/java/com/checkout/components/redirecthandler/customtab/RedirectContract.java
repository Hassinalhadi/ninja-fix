package com.checkout.components.redirecthandler.customtab;

import android.app.Activity;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000b\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R8\u0010\u001d\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u00172\u0010\u0010\u0018\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u00178\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/checkout/components/redirecthandler/customtab/RedirectContract;", "", "Landroid/app/Activity;", "callerActivity", "Lkotlin/Function1;", "", "", "handler", "setResultHandler", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function1;)V", "listener", "setDroppedRedirectListener", "(Lkotlin/jvm/functions/Function1;)V", "reason", "notifyRedirectDropped", "(Ljava/lang/String;)V", Constants.KEY_URL, "deliverResult", "", "hasHandler", "()Z", "clear", "()V", "Ljava/lang/Class;", "value", "c", "Ljava/lang/Class;", "getCallerActivityClass", "()Ljava/lang/Class;", "callerActivityClass", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RedirectContract {

    @NotNull
    public static final RedirectContract INSTANCE = new RedirectContract();

    /* renamed from: a, reason: collision with root package name */
    private static Function1 f5673a;

    /* renamed from: b, reason: collision with root package name */
    private static Function1 f5674b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static Class callerActivityClass;

    private RedirectContract() {
    }

    public final void clear() {
        f5673a = null;
        callerActivityClass = null;
        f5674b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void deliverResult(@NotNull String url) {
        Intrinsics.echo(url, "url");
        Function1 function1 = f5673a;
        if (function1 != null) {
            try {
                function1.invoke(url);
            } finally {
                f5673a = null;
                callerActivityClass = null;
                f5674b = null;
            }
        }
    }

    @Nullable
    public final Class<? extends Activity> getCallerActivityClass() {
        return callerActivityClass;
    }

    public final boolean hasHandler() {
        if (f5673a != null) {
            return true;
        }
        return false;
    }

    public final void notifyRedirectDropped(@NotNull String reason) {
        Intrinsics.echo(reason, "reason");
        Function1 function1 = f5674b;
        if (function1 != null) {
            function1.invoke(reason);
        }
    }

    public final void setDroppedRedirectListener(@NotNull Function1<? super String, Unit> listener) {
        Intrinsics.echo(listener, "listener");
        f5674b = listener;
    }

    public final void setResultHandler(@NotNull Activity callerActivity, @NotNull Function1<? super String, Unit> handler) {
        Intrinsics.echo(callerActivity, "callerActivity");
        Intrinsics.echo(handler, "handler");
        callerActivityClass = callerActivity.getClass();
        f5673a = handler;
    }
}
