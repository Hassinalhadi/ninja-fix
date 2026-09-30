package com.checkout.components.rememberme.di;

import android.content.Context;
import com.checkout.components.ui.utils.extensions.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/checkout/components/rememberme/di/RTLModule;", "", "<init>", "()V", "isRTL", "", "context", "Landroid/content/Context;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RTLModule {
    public static final int $stable = 0;

    public final boolean isRTL(@NotNull Context context) {
        Intrinsics.echo(context, "context");
        return Utils.INSTANCE.isRtl(context);
    }
}
