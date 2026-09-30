package com.checkout.components.interfaces.utils;

import com.checkout.components.interfaces.localisation.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0001¨\u0006\u0004"}, d2 = {"mapToLocale", "Lcom/checkout/components/interfaces/localisation/Locale;", "", "Ljava/util/Locale;", "interfaces_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExtensionsKt {
    @NotNull
    public static final Locale mapToLocale(@NotNull String str) {
        Intrinsics.echo(str, "<this>");
        switch (str.hashCode()) {
            case -1274560964:
                if (str.equals("fil-PH")) {
                    return Locale.Fil.INSTANCE;
                }
                break;
            case 3121:
                if (str.equals("ar")) {
                    return Locale.Ar.INSTANCE;
                }
                break;
            case 3239:
                if (str.equals("el")) {
                    return Locale.El.INSTANCE;
                }
                break;
            case 95287255:
                if (str.equals("da-DK")) {
                    return Locale.Da.INSTANCE;
                }
                break;
            case 95406413:
                if (str.equals("de-DE")) {
                    return Locale.De.INSTANCE;
                }
                break;
            case 96598143:
                if (str.equals("en-GB")) {
                    return Locale.En.INSTANCE;
                }
                break;
            case 96747053:
                if (str.equals("es-ES")) {
                    return Locale.Es.INSTANCE;
                }
                break;
            case 97372685:
                if (str.equals("fi-FI")) {
                    return Locale.Fi.INSTANCE;
                }
                break;
            case 97640813:
                if (str.equals("fr-FR")) {
                    return Locale.Fr.INSTANCE;
                }
                break;
            case 99219825:
                if (str.equals("hi-IN")) {
                    return Locale.Hi.INSTANCE;
                }
                break;
            case 99994381:
                if (str.equals("id-ID")) {
                    return Locale.Id.INSTANCE;
                }
                break;
            case 100471053:
                if (str.equals("it-IT")) {
                    return Locale.It.INSTANCE;
                }
                break;
            case 100828572:
                if (str.equals("ja-JP")) {
                    return Locale.Ja.INSTANCE;
                }
                break;
            case 104135475:
                if (str.equals("ms-MY")) {
                    return Locale.Ms.INSTANCE;
                }
                break;
            case 104552570:
                if (str.equals("nb-NO")) {
                    return Locale.Nb.INSTANCE;
                }
                break;
            case 104850477:
                if (str.equals("nl-NL")) {
                    return Locale.Nl.INSTANCE;
                }
                break;
            case 106935917:
                if (str.equals("pt-PT")) {
                    return Locale.Pt.INSTANCE;
                }
                break;
            case 109766140:
                if (str.equals("sv-SE")) {
                    return Locale.Sv.INSTANCE;
                }
                break;
            case 110272621:
                if (str.equals("th-TH")) {
                    return Locale.Th.INSTANCE;
                }
                break;
            case 112149522:
                if (str.equals("vi-VN")) {
                    return Locale.Vi.INSTANCE;
                }
                break;
            case 115813226:
                if (str.equals("zh-CN")) {
                    return Locale.Zh.INSTANCE;
                }
                break;
            case 115813378:
                if (str.equals("zh-HK")) {
                    return Locale.ZhHk.INSTANCE;
                }
                break;
            case 115813762:
                if (str.equals("zh-TW")) {
                    return Locale.ZhTw.INSTANCE;
                }
                break;
        }
        return new Locale.Customised(str);
    }

    @NotNull
    public static final java.util.Locale mapToLocale(@NotNull Locale locale) {
        Intrinsics.echo(locale, "<this>");
        if (Intrinsics.areEqual(locale, Locale.Ar.INSTANCE)) {
            return new java.util.Locale("ar");
        }
        if (Intrinsics.areEqual(locale, Locale.Da.INSTANCE)) {
            return new java.util.Locale("da");
        }
        if (Intrinsics.areEqual(locale, Locale.De.INSTANCE)) {
            return new java.util.Locale("de");
        }
        if (Intrinsics.areEqual(locale, Locale.El.INSTANCE)) {
            return new java.util.Locale("el");
        }
        if (Intrinsics.areEqual(locale, Locale.En.INSTANCE)) {
            return new java.util.Locale("en");
        }
        if (Intrinsics.areEqual(locale, Locale.Es.INSTANCE)) {
            return new java.util.Locale("es");
        }
        if (Intrinsics.areEqual(locale, Locale.Fi.INSTANCE)) {
            return new java.util.Locale("fi");
        }
        if (Intrinsics.areEqual(locale, Locale.Fil.INSTANCE)) {
            return new java.util.Locale("fil");
        }
        if (Intrinsics.areEqual(locale, Locale.Fr.INSTANCE)) {
            return new java.util.Locale("fr");
        }
        if (Intrinsics.areEqual(locale, Locale.Hi.INSTANCE)) {
            return new java.util.Locale("hi");
        }
        if (Intrinsics.areEqual(locale, Locale.Id.INSTANCE)) {
            return new java.util.Locale("in");
        }
        if (Intrinsics.areEqual(locale, Locale.It.INSTANCE)) {
            return new java.util.Locale("it");
        }
        if (Intrinsics.areEqual(locale, Locale.Ja.INSTANCE)) {
            return new java.util.Locale("ja");
        }
        if (Intrinsics.areEqual(locale, Locale.Ms.INSTANCE)) {
            return new java.util.Locale("ms");
        }
        if (Intrinsics.areEqual(locale, Locale.Nb.INSTANCE)) {
            return new java.util.Locale("nb");
        }
        if (Intrinsics.areEqual(locale, Locale.Nl.INSTANCE)) {
            return new java.util.Locale("nl");
        }
        if (Intrinsics.areEqual(locale, Locale.Pt.INSTANCE)) {
            return new java.util.Locale("pt");
        }
        if (Intrinsics.areEqual(locale, Locale.Sv.INSTANCE)) {
            return new java.util.Locale("sv");
        }
        if (Intrinsics.areEqual(locale, Locale.Th.INSTANCE)) {
            return new java.util.Locale("th");
        }
        if (Intrinsics.areEqual(locale, Locale.Vi.INSTANCE)) {
            return new java.util.Locale("vi");
        }
        if (Intrinsics.areEqual(locale, Locale.Zh.INSTANCE)) {
            return new java.util.Locale("zh");
        }
        if (Intrinsics.areEqual(locale, Locale.ZhHk.INSTANCE)) {
            return new java.util.Locale("zh", "hk");
        }
        if (Intrinsics.areEqual(locale, Locale.ZhTw.INSTANCE)) {
            return new java.util.Locale("zh", "tw");
        }
        if (locale instanceof Locale.Customised) {
            return mapToLocale(Constants.INSTANCE.getDEFAULT_LOCALE());
        }
        throw new NoWhenBranchMatchedException();
    }
}
