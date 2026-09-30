package com.checkout.components.kmp.rememberme.utils;

import com.checkout.components.kmp.rememberme.shared.model.customization.Font;
import com.checkout.components.kmp.rememberme.shared.model.customization.FontStyle;
import com.checkout.components.kmp.rememberme.shared.model.customization.FontWeight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/checkout/components/kmp/rememberme/utils/DefaultFonts;", "", "<init>", "()V", "HEADLINE", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/Font;", "getHEADLINE", "()Lcom/checkout/components/kmp/rememberme/shared/model/customization/Font;", "SUBHEADLINE", "getSUBHEADLINE", "FOOTNOTE", "getFOOTNOTE", "BUTTON", "getBUTTON", "INPUT", "getINPUT", "LABEL", "getLABEL", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultFonts {
    public static final int $stable = 0;

    @NotNull
    private static final Font BUTTON;

    @NotNull
    private static final Font FOOTNOTE;

    @NotNull
    private static final Font HEADLINE;

    @NotNull
    private static final Font INPUT;

    @NotNull
    public static final DefaultFonts INSTANCE = new DefaultFonts();

    @NotNull
    private static final Font LABEL;

    @NotNull
    private static final Font SUBHEADLINE;

    static {
        FontStyle fontStyle = FontStyle.Normal;
        HEADLINE = new Font(null, fontStyle, FontWeight.SemiBold, 17, null, null, 1, null);
        FontWeight fontWeight = FontWeight.Normal;
        SUBHEADLINE = new Font(null, fontStyle, fontWeight, 15, null, null, 1, null);
        FOOTNOTE = new Font(null, fontStyle, fontWeight, 12, null, null, 1, null);
        BUTTON = new Font(null, fontStyle, fontWeight, 14, null, null, 1, null);
        INPUT = new Font(null, fontStyle, fontWeight, 16, null, null, 1, null);
        LABEL = new Font(null, fontStyle, FontWeight.Medium, 14, null, null, 1, null);
    }

    private DefaultFonts() {
    }

    @NotNull
    public final Font getBUTTON() {
        return BUTTON;
    }

    @NotNull
    public final Font getFOOTNOTE() {
        return FOOTNOTE;
    }

    @NotNull
    public final Font getHEADLINE() {
        return HEADLINE;
    }

    @NotNull
    public final Font getINPUT() {
        return INPUT;
    }

    @NotNull
    public final Font getLABEL() {
        return LABEL;
    }

    @NotNull
    public final Font getSUBHEADLINE() {
        return SUBHEADLINE;
    }
}
