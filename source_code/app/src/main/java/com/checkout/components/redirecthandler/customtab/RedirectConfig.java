package com.checkout.components.redirecthandler.customtab;

import android.content.Context;
import av.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/redirecthandler/customtab/RedirectConfig;", "", "Landroid/content/Context;", "context", "", "buildRedirectUrl$redirect_handler_standardRelease", "(Landroid/content/Context;)Ljava/lang/String;", "buildRedirectUrl", "SCHEME", "Ljava/lang/String;", "HOST", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RedirectConfig {

    @NotNull
    public static final String HOST = "redirect-callback";

    @NotNull
    public static final RedirectConfig INSTANCE = new RedirectConfig();

    @NotNull
    public static final String SCHEME = "cko-redirect";

    private RedirectConfig() {
    }

    @NotNull
    public final String buildRedirectUrl$redirect_handler_standardRelease(@NotNull Context context) {
        Intrinsics.echo(context, "context");
        return q.echo("cko-redirect://redirect-callback/", context.getPackageName());
    }
}
