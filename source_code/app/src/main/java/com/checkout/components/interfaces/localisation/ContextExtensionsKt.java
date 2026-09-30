package com.checkout.components.interfaces.localisation;

import android.content.Context;
import android.content.res.Configuration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"toConfigContext", "Landroid/content/Context;", "locale", "Ljava/util/Locale;", "interfaces_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContextExtensionsKt {
    @NotNull
    public static final Context toConfigContext(@NotNull Context context, @NotNull java.util.Locale locale) {
        Intrinsics.echo(context, "<this>");
        Intrinsics.echo(locale, "locale");
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        Intrinsics.delta(createConfigurationContext, "createConfigurationContext(...)");
        return createConfigurationContext;
    }
}
