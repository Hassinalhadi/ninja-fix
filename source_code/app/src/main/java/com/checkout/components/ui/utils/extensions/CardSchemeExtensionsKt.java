package com.checkout.components.ui.utils.extensions;

import com.checkout.components.ui.R;
import com.checkout.components.ui.model.CardScheme;
import com.incognia.PaymentMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0007\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002H\u0007\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006*\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0007\u001a\f\u0010\u0007\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\f\u0010\b\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010\t\u001a\u00020\u0002*\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"toSchemeIconResId", "", "", "toCardScheme", "Lcom/checkout/components/ui/model/CardScheme;", "toCardSchemes", "", "normalizeSchemeName", "normalize", "toSchemeName", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardSchemeExtensionsKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardScheme.values().length];
            try {
                iArr[CardScheme.AMERICAN_EXPRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardScheme.CARTES_BANCAIRES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardScheme.DINERS_CLUB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardScheme.DISCOVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CardScheme.JAYWAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CardScheme.JCB.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CardScheme.MADA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CardScheme.MAESTRO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CardScheme.MASTERCARD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CardScheme.UNION_PAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CardScheme.VISA.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CardScheme.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final String normalize(@NotNull String str) {
        Intrinsics.echo(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.delta(lowerCase, "toLowerCase(...)");
        return StringsKt.b(new Regex("[ -_]").foxtrot(lowerCase, "")).toString();
    }

    @NotNull
    public static final String normalizeSchemeName(@NotNull String str) {
        Intrinsics.echo(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.delta(lowerCase, "toLowerCase(...)");
        return r.oscar(lowerCase, " ", "_");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000d. Please report as an issue. */
    @Nullable
    public static final CardScheme toCardScheme(@NotNull String str) {
        Intrinsics.echo(str, "<this>");
        String normalize = normalize(str);
        switch (normalize.hashCode()) {
            case -2106302000:
                if (!normalize.equals("chinaunionpay")) {
                    return null;
                }
                return CardScheme.UNION_PAY;
            case -2038717326:
                if (normalize.equals(PaymentMethod.MASTERCARD_BRAND)) {
                    return CardScheme.MASTERCARD;
                }
                return null;
            case -2023486861:
                if (!normalize.equals("dinersclub")) {
                    return null;
                }
                return CardScheme.DINERS_CLUB;
            case -1331704771:
                if (!normalize.equals("diners")) {
                    return null;
                }
                return CardScheme.DINERS_CLUB;
            case -1166973566:
                if (normalize.equals("jaywan")) {
                    return CardScheme.JAYWAN;
                }
                return null;
            case -885176496:
                if (!normalize.equals("americanexpress")) {
                    return null;
                }
                return CardScheme.AMERICAN_EXPRESS;
            case -561831805:
                if (!normalize.equals("mastercardmada")) {
                    return null;
                }
                return CardScheme.MADA;
            case -296504455:
                if (!normalize.equals("unionpay")) {
                    return null;
                }
                return CardScheme.UNION_PAY;
            case 105033:
                if (normalize.equals("jcb")) {
                    return CardScheme.JCB;
                }
                return null;
            case 116014:
                if (!normalize.equals("upi")) {
                    return null;
                }
                return CardScheme.UNION_PAY;
            case 2997727:
                if (!normalize.equals(PaymentMethod.AMERICAN_EXPRESS_BRAND)) {
                    return null;
                }
                return CardScheme.AMERICAN_EXPRESS;
            case 3343633:
                if (!normalize.equals("mada")) {
                    return null;
                }
                return CardScheme.MADA;
            case 3619905:
                if (normalize.equals(PaymentMethod.VISA_BRAND)) {
                    return CardScheme.VISA;
                }
                return null;
            case 182304182:
                if (normalize.equals("cartesbancaires")) {
                    return CardScheme.CARTES_BANCAIRES;
                }
                return null;
            case 273184745:
                if (normalize.equals("discover")) {
                    return CardScheme.DISCOVER;
                }
                return null;
            case 827497775:
                if (normalize.equals("maestro")) {
                    return CardScheme.MASTERCARD;
                }
                return null;
            case 917518075:
                if (!normalize.equals("dinersclubinternational")) {
                    return null;
                }
                return CardScheme.DINERS_CLUB;
            case 1577072850:
                if (!normalize.equals("visamada")) {
                    return null;
                }
                return CardScheme.MADA;
            default:
                return null;
        }
    }

    @NotNull
    public static final List<CardScheme> toCardSchemes(@NotNull List<String> list) {
        Intrinsics.echo(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CardScheme cardScheme = toCardScheme((String) it.next());
            if (cardScheme != null) {
                arrayList.add(cardScheme);
            }
        }
        return arrayList;
    }

    public static final int toSchemeIconResId(@Nullable String str) {
        String normalizeSchemeName;
        CardScheme cardScheme;
        Integer imageId;
        if (str != null && (normalizeSchemeName = normalizeSchemeName(str)) != null && (cardScheme = toCardScheme(normalizeSchemeName)) != null && (imageId = cardScheme.getImageId()) != null) {
            return imageId.intValue();
        }
        return R.drawable.cko_ic_card;
    }

    @NotNull
    public static final String toSchemeName(@NotNull CardScheme cardScheme) {
        Intrinsics.echo(cardScheme, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[cardScheme.ordinal()]) {
            case 1:
                return "american_express";
            case 2:
                return "cartes_bancaires";
            case 3:
                return "diners_club_international";
            case 4:
                return "discover";
            case 5:
                return "jaywan";
            case 6:
                return "jcb";
            case 7:
                return "mada";
            case 8:
                return "maestro";
            case 9:
                return PaymentMethod.MASTERCARD_BRAND;
            case 10:
                return "upi";
            case 11:
                return PaymentMethod.VISA_BRAND;
            case 12:
                return "unknown";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
