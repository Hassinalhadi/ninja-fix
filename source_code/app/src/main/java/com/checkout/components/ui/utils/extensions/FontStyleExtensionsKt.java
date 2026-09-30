package com.checkout.components.ui.utils.extensions;

import com.checkout.components.interfaces.uicustomisation.font.FontStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/font/FontStyle;", "LH0/r;", "toComposeFontStyle", "(Lcom/checkout/components/interfaces/uicustomisation/font/FontStyle;)I", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FontStyleExtensionsKt {
    public static final int toComposeFontStyle(@NotNull FontStyle fontStyle) {
        Intrinsics.echo(fontStyle, "<this>");
        if (fontStyle == FontStyle.Normal) {
            return 0;
        }
        return 1;
    }
}
