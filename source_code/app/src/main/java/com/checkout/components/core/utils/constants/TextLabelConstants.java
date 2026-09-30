package com.checkout.components.core.utils.constants;

import H0.aa;
import H0.k;
import H0.v;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2636d7;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\bÁ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006¨\u0006$"}, d2 = {"Lcom/checkout/components/core/utils/constants/TextLabelConstants;", "", "LQ0/p;", "a", "J", "getFontTextSize-XSAIIZE", "()J", "fontTextSize", "", "b", "getTextColor", "textColor", "LH0/aa;", "c", "LH0/aa;", "getFontFamily", "()LH0/aa;", "fontFamily", "LH0/r;", Constants.INAPP_DATA_TAG, "I", "getFontStyle-_-LCdwA", "()I", "fontStyle", "LH0/v;", "e", "LH0/v;", "getFontWeight", "()LH0/v;", "fontWeight", "f", "getLetterSpacing-XSAIIZE", "letterSpacing", "g", "getLineHeight-XSAIIZE", "lineHeight", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextLabelConstants {
    public static final int $stable = 0;

    @NotNull
    public static final TextLabelConstants INSTANCE = new TextLabelConstants();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final long fontTextSize = AbstractC2636d7.charlie(16);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final long textColor = 4278190080L;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final aa fontFamily = k.alpha;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final int fontStyle = 0;

    /* renamed from: e, reason: from kotlin metadata */
    private static final v fontWeight = v.yellow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final long letterSpacing = AbstractC2636d7.charlie(0);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final long lineHeight = AbstractC2636d7.charlie(0);

    private TextLabelConstants() {
    }

    @NotNull
    public final aa getFontFamily() {
        return fontFamily;
    }

    /* renamed from: getFontStyle-_-LCdwA, reason: not valid java name */
    public final int m112getFontStyle_LCdwA() {
        return fontStyle;
    }

    /* renamed from: getFontTextSize-XSAIIZE, reason: not valid java name */
    public final long m113getFontTextSizeXSAIIZE() {
        return fontTextSize;
    }

    @NotNull
    public final v getFontWeight() {
        return fontWeight;
    }

    /* renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m114getLetterSpacingXSAIIZE() {
        return letterSpacing;
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m115getLineHeightXSAIIZE() {
        return lineHeight;
    }

    public final long getTextColor() {
        return textColor;
    }
}
