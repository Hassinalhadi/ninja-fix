package com.checkout.components.kmp.rememberme.utils;

import H0.k;
import H0.n;
import H0.v;
import H0.z;
import com.checkout.components.kmp.rememberme.shared.model.customization.FontFamily;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2715m5;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "format", "arg", "formatString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontFamily;", "LH0/k;", "toComposeFontFamily", "(Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontFamily;)LH0/k;", "rememberme_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Extensions_androidKt {
    @NotNull
    public static final String formatString(@NotNull String format, @NotNull String arg) {
        Intrinsics.echo(format, "format");
        Intrinsics.echo(arg, "arg");
        return String.format(format, Arrays.copyOf(new Object[]{arg}, 1));
    }

    @NotNull
    public static final k toComposeFontFamily(@NotNull FontFamily fontFamily) {
        z zVar;
        z zVar2;
        z zVar3;
        z zVar4;
        z zVar5;
        Intrinsics.echo(fontFamily, "<this>");
        if (fontFamily instanceof FontFamily.Default) {
            return k.alpha;
        }
        if (fontFamily instanceof FontFamily.Serif) {
            return k.red;
        }
        if (fontFamily instanceof FontFamily.SansSerif) {
            return k.purple;
        }
        if (fontFamily instanceof FontFamily.Monospace) {
            return k.silver;
        }
        if (fontFamily instanceof FontFamily.Cursive) {
            return k.teal;
        }
        if (fontFamily instanceof FontFamily.Custom) {
            FontFamily.Custom custom = (FontFamily.Custom) fontFamily;
            int normalFont = custom.getNormalFont();
            v vVar = v.yellow;
            z alpha = AbstractC2715m5.alpha(normalFont, vVar, 0, 12);
            Integer normalItalicFont = custom.getNormalItalicFont();
            z zVar6 = null;
            if (normalItalicFont != null) {
                zVar = AbstractC2715m5.alpha(normalItalicFont.intValue(), vVar, 1, 8);
            } else {
                zVar = null;
            }
            Integer lightFont = custom.getLightFont();
            if (lightFont != null) {
                zVar2 = AbstractC2715m5.alpha(lightFont.intValue(), v.white, 0, 12);
            } else {
                zVar2 = null;
            }
            Integer mediumFont = custom.getMediumFont();
            if (mediumFont != null) {
                zVar3 = AbstractC2715m5.alpha(mediumFont.intValue(), v.f1407a, 0, 12);
            } else {
                zVar3 = null;
            }
            Integer semiBold = custom.getSemiBold();
            if (semiBold != null) {
                zVar4 = AbstractC2715m5.alpha(semiBold.intValue(), v.f1408b, 0, 12);
            } else {
                zVar4 = null;
            }
            Integer boldFont = custom.getBoldFont();
            if (boldFont != null) {
                zVar5 = AbstractC2715m5.alpha(boldFont.intValue(), v.f1409c, 0, 12);
            } else {
                zVar5 = null;
            }
            Integer extraBoldFont = custom.getExtraBoldFont();
            if (extraBoldFont != null) {
                zVar6 = AbstractC2715m5.alpha(extraBoldFont.intValue(), v.f1410d, 0, 12);
            }
            return new n(CollectionsKt.peach(alpha, zVar, zVar2, zVar3, zVar4, zVar5, zVar6));
        }
        throw new NoWhenBranchMatchedException();
    }
}
