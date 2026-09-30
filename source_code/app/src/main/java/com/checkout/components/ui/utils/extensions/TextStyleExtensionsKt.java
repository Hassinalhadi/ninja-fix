package com.checkout.components.ui.utils.extensions;

import D0.an;
import H0.k;
import H0.r;
import H0.v;
import O0.e;
import Q0.p;
import a0.C0366t;
import a0.ao;
import com.checkout.components.ui.model.style.base.TextStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2636d7;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/checkout/components/ui/model/style/base/TextStyle;", "", "isPreparingLabel", "LD0/an;", "toComposeTextStyle", "(Lcom/checkout/components/ui/model/style/base/TextStyle;Z)LD0/an;", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextStyleExtensionsKt {
    @NotNull
    public static final an toComposeTextStyle(@NotNull TextStyle textStyle, boolean z2) {
        long delta;
        long j5;
        long j6;
        Intrinsics.echo(textStyle, "<this>");
        long charlie = AbstractC2636d7.charlie(textStyle.getSize());
        if (z2) {
            delta = C0366t.kilo;
        } else {
            delta = ao.delta(textStyle.getColor());
        }
        int composeTextAlign = TextAlignExtensionKt.toComposeTextAlign(textStyle.getTextAlign());
        k fontFamily = FontExtensionsKt.toFontFamily(textStyle.getFontFamily());
        int composeFontStyle = FontStyleExtensionsKt.toComposeFontStyle(textStyle.getFontStyle());
        v composeFontWeight = FontWeightExtensionsKt.toComposeFontWeight(textStyle.getFontWeight());
        Integer lineHeight = textStyle.getLineHeight();
        if (lineHeight != null) {
            j5 = AbstractC2636d7.charlie(lineHeight.intValue());
        } else {
            j5 = p.charlie;
        }
        long j7 = j5;
        Integer letterSpacing = textStyle.getLetterSpacing();
        if (letterSpacing != null) {
            j6 = AbstractC2636d7.charlie(letterSpacing.intValue());
        } else {
            j6 = p.charlie;
        }
        return new an(delta, charlie, composeFontWeight, new r(composeFontStyle), fontFamily, j6, composeTextAlign, j7, e.charlie, 14516048);
    }

    public static /* synthetic */ an toComposeTextStyle$default(TextStyle textStyle, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z2 = false;
        }
        return toComposeTextStyle(textStyle, z2);
    }
}
