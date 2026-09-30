package com.checkout.components.kmp.rememberme.data.remote;

import com.clevertap.android.sdk.Constants;
import kd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/remote/DebugLogger;", "Lkd/g;", "<init>", "()V", "", Constants.KEY_MESSAGE, "", "log", "(Ljava/lang/String;)V", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugLogger implements g {
    public static final int $stable = 0;

    @Override // kd.g
    public void log(@NotNull String message) {
        Intrinsics.echo(message, "message");
        System.out.println((Object) "HTTP Client: ".concat(message));
    }
}
