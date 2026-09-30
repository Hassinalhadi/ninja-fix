package com.checkout.components.redirecthandler.extension;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import as.b;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0002H\u0000¨\u0006\u0006"}, d2 = {"findActivity", "Landroid/app/Activity;", "Landroid/content/Context;", "isCustomTabAvailable", "", "isAuthTabSupported", "redirect-handler_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExtensionsKt {
    @Nullable
    public static final Activity findActivity(@NotNull Context context) {
        Intrinsics.echo(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.delta(context, "getBaseContext(...)");
        }
        return null;
    }

    public static final boolean isAuthTabSupported(@NotNull Context context) {
        Intrinsics.echo(context, "<this>");
        try {
            String alpha = b.alpha(context, CollectionsKt.emptyList());
            if (alpha != null) {
                if (b.bravo(context, alpha)) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean isCustomTabAvailable(@NotNull Context context) {
        Intrinsics.echo(context, "<this>");
        try {
            if (findActivity(context) != null) {
                if (b.alpha(context, CollectionsKt.emptyList()) != null) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
