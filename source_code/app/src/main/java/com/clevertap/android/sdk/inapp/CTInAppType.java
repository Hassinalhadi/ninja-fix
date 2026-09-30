package com.clevertap.android.sdk.inapp;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0019"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppType;", "", Constants.KEY_TYPE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "CTInAppTypeHTML", "CTInAppTypeCoverHTML", "CTInAppTypeInterstitialHTML", "CTInAppTypeHeaderHTML", "CTInAppTypeFooterHTML", "CTInAppTypeHalfInterstitialHTML", "CTInAppTypeCover", "CTInAppTypeInterstitial", "CTInAppTypeHalfInterstitial", "CTInAppTypeHeader", "CTInAppTypeFooter", "CTInAppTypeAlert", "CTInAppTypeCoverImageOnly", "CTInAppTypeInterstitialImageOnly", "CTInAppTypeHalfInterstitialImageOnly", "CTInAppTypeCustomCodeTemplate", "UNKNOWN", "toString", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CTInAppType {
    private static final /* synthetic */ Qd.a $ENTRIES;
    private static final /* synthetic */ CTInAppType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String type;
    public static final CTInAppType CTInAppTypeHTML = new CTInAppType("CTInAppTypeHTML", 0, Constants.INAPP_HTML_TAG);
    public static final CTInAppType CTInAppTypeCoverHTML = new CTInAppType("CTInAppTypeCoverHTML", 1, "coverHtml");
    public static final CTInAppType CTInAppTypeInterstitialHTML = new CTInAppType("CTInAppTypeInterstitialHTML", 2, "interstitialHtml");
    public static final CTInAppType CTInAppTypeHeaderHTML = new CTInAppType("CTInAppTypeHeaderHTML", 3, "headerHtml");
    public static final CTInAppType CTInAppTypeFooterHTML = new CTInAppType("CTInAppTypeFooterHTML", 4, "footerHtml");
    public static final CTInAppType CTInAppTypeHalfInterstitialHTML = new CTInAppType("CTInAppTypeHalfInterstitialHTML", 5, "halfInterstitialHtml");
    public static final CTInAppType CTInAppTypeCover = new CTInAppType("CTInAppTypeCover", 6, "cover");
    public static final CTInAppType CTInAppTypeInterstitial = new CTInAppType("CTInAppTypeInterstitial", 7, "interstitial");
    public static final CTInAppType CTInAppTypeHalfInterstitial = new CTInAppType("CTInAppTypeHalfInterstitial", 8, "half-interstitial");
    public static final CTInAppType CTInAppTypeHeader = new CTInAppType("CTInAppTypeHeader", 9, "header-template");
    public static final CTInAppType CTInAppTypeFooter = new CTInAppType("CTInAppTypeFooter", 10, "footer-template");
    public static final CTInAppType CTInAppTypeAlert = new CTInAppType("CTInAppTypeAlert", 11, "alert-template");
    public static final CTInAppType CTInAppTypeCoverImageOnly = new CTInAppType("CTInAppTypeCoverImageOnly", 12, "cover-image");
    public static final CTInAppType CTInAppTypeInterstitialImageOnly = new CTInAppType("CTInAppTypeInterstitialImageOnly", 13, "interstitial-image");
    public static final CTInAppType CTInAppTypeHalfInterstitialImageOnly = new CTInAppType("CTInAppTypeHalfInterstitialImageOnly", 14, "half-interstitial-image");
    public static final CTInAppType CTInAppTypeCustomCodeTemplate = new CTInAppType("CTInAppTypeCustomCodeTemplate", 15, "custom-code");
    public static final CTInAppType UNKNOWN = new CTInAppType("UNKNOWN", 16, "");

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppType$Companion;", "", "<init>", "()V", "fromString", "Lcom/clevertap/android/sdk/inapp/CTInAppType;", Constants.KEY_TYPE, "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CTInAppType fromString(@Nullable String type) {
            if (type != null) {
                switch (type.hashCode()) {
                    case -1824210231:
                        if (type.equals("custom-code")) {
                            return CTInAppType.CTInAppTypeCustomCodeTemplate;
                        }
                        break;
                    case -1698613420:
                        if (type.equals("half-interstitial-image")) {
                            return CTInAppType.CTInAppTypeHalfInterstitialImageOnly;
                        }
                        break;
                    case -1258935355:
                        if (type.equals("cover-image")) {
                            return CTInAppType.CTInAppTypeCoverImageOnly;
                        }
                        break;
                    case -1160074422:
                        if (type.equals("halfInterstitialHtml")) {
                            return CTInAppType.CTInAppTypeHalfInterstitialHTML;
                        }
                        break;
                    case -1141304454:
                        if (type.equals("interstitial-image")) {
                            return CTInAppType.CTInAppTypeInterstitialImageOnly;
                        }
                        break;
                    case -728863497:
                        if (type.equals("interstitialHtml")) {
                            return CTInAppType.CTInAppTypeInterstitialHTML;
                        }
                        break;
                    case -334055316:
                        if (type.equals("footer-template")) {
                            return CTInAppType.CTInAppTypeFooter;
                        }
                        break;
                    case -37253685:
                        if (type.equals("alert-template")) {
                            return CTInAppType.CTInAppTypeAlert;
                        }
                        break;
                    case 3213227:
                        if (type.equals(Constants.INAPP_HTML_TAG)) {
                            return CTInAppType.CTInAppTypeHTML;
                        }
                        break;
                    case 94852023:
                        if (type.equals("cover")) {
                            return CTInAppType.CTInAppTypeCover;
                        }
                        break;
                    case 604727084:
                        if (type.equals("interstitial")) {
                            return CTInAppType.CTInAppTypeInterstitial;
                        }
                        break;
                    case 894039686:
                        if (type.equals("half-interstitial")) {
                            return CTInAppType.CTInAppTypeHalfInterstitial;
                        }
                        break;
                    case 1189018554:
                        if (type.equals("header-template")) {
                            return CTInAppType.CTInAppTypeHeader;
                        }
                        break;
                    case 1420225510:
                        if (type.equals("footerHtml")) {
                            return CTInAppType.CTInAppTypeFooterHTML;
                        }
                        break;
                    case 1977176024:
                        if (type.equals("headerHtml")) {
                            return CTInAppType.CTInAppTypeHeaderHTML;
                        }
                        break;
                    case 1979390978:
                        if (type.equals("coverHtml")) {
                            return CTInAppType.CTInAppTypeCoverHTML;
                        }
                        break;
                }
            }
            return CTInAppType.UNKNOWN;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ CTInAppType[] $values() {
        return new CTInAppType[]{CTInAppTypeHTML, CTInAppTypeCoverHTML, CTInAppTypeInterstitialHTML, CTInAppTypeHeaderHTML, CTInAppTypeFooterHTML, CTInAppTypeHalfInterstitialHTML, CTInAppTypeCover, CTInAppTypeInterstitial, CTInAppTypeHalfInterstitial, CTInAppTypeHeader, CTInAppTypeFooter, CTInAppTypeAlert, CTInAppTypeCoverImageOnly, CTInAppTypeInterstitialImageOnly, CTInAppTypeHalfInterstitialImageOnly, CTInAppTypeCustomCodeTemplate, UNKNOWN};
    }

    static {
        CTInAppType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
        INSTANCE = new Companion(null);
    }

    private CTInAppType(String str, int i4, String str2) {
        this.type = str2;
    }

    @NotNull
    public static Qd.a getEntries() {
        return $ENTRIES;
    }

    public static CTInAppType valueOf(String str) {
        return (CTInAppType) Enum.valueOf(CTInAppType.class, str);
    }

    public static CTInAppType[] values() {
        return (CTInAppType[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.type;
    }
}
