package com.checkout.components.kmp.rememberme.utils;

import android.content.res.Configuration;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.O;
import androidx.compose.runtime.aa;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.checkout.components.kmp.rememberme.shared.model.CheckoutLocale;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/checkout/components/kmp/rememberme/utils/LocaleProvider;", "", "<init>", "()V", "Lcom/checkout/components/kmp/rememberme/shared/model/CheckoutLocale;", "locale", "Landroidx/compose/runtime/O;", "provides", "(Lcom/checkout/components/kmp/rememberme/shared/model/CheckoutLocale;Landroidx/compose/runtime/m;I)Landroidx/compose/runtime/O;", "", "getCurrent", "(Landroidx/compose/runtime/m;I)Ljava/lang/String;", "current", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LocaleProvider {
    public static final int $stable = 0;

    @NotNull
    public static final LocaleProvider INSTANCE = new LocaleProvider();

    private LocaleProvider() {
    }

    @NotNull
    public final String getCurrent(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        String locale = Locale.getDefault().toString();
        Intrinsics.delta(locale, "toString(...)");
        return locale;
    }

    @NotNull
    public final O provides(@NotNull CheckoutLocale locale, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        Locale locale2;
        Intrinsics.echo(locale, "locale");
        aa aaVar = AndroidCompositionLocals_androidKt.alpha;
        Configuration configuration = (Configuration) ((C0585q) interfaceC0581m).kilo(aaVar);
        String country = locale.getCountry();
        if (country != null) {
            locale2 = new Locale(locale.getLanguage(), country);
        } else {
            locale2 = new Locale(locale.getLanguage());
        }
        configuration.setLocale(locale2);
        Locale.setDefault(locale2);
        return aaVar.alpha(configuration);
    }
}
