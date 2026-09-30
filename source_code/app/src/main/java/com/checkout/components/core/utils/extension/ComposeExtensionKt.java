package com.checkout.components.core.utils.extension;

import H0.k;
import H0.n;
import H0.v;
import H0.z;
import a0.ao;
import com.checkout.components.interfaces.uicustomisation.font.FontFamily;
import com.checkout.components.interfaces.uicustomisation.font.FontStyle;
import com.checkout.components.interfaces.uicustomisation.font.FontWeight;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2715m5;

@Metadata(d1 = {"\u00000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "La0/t;", "toComposeColor", "(J)J", "Lcom/checkout/components/interfaces/uicustomisation/font/FontWeight;", "LH0/v;", "toComposeFontWeight", "(Lcom/checkout/components/interfaces/uicustomisation/font/FontWeight;)LH0/v;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;", "LH0/k;", "toComposeFontFamily", "(Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;)LH0/k;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontStyle;", "LH0/r;", "toComposeFontStyle", "(Lcom/checkout/components/interfaces/uicustomisation/font/FontStyle;)I", "core_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposeExtensionKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FontWeight.values().length];
            try {
                iArr[FontWeight.Light.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FontWeight.Normal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FontWeight.Medium.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FontWeight.SemiBold.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FontWeight.Bold.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FontWeight.ExtraBold.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final long toComposeColor(long j5) {
        return ao.delta(j5);
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

    public static final int toComposeFontStyle(@NotNull FontStyle fontStyle) {
        Intrinsics.echo(fontStyle, "<this>");
        if (fontStyle == FontStyle.Normal) {
            return 0;
        }
        return 1;
    }

    @NotNull
    public static final v toComposeFontWeight(@NotNull FontWeight fontWeight) {
        Intrinsics.echo(fontWeight, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[fontWeight.ordinal()]) {
            case 1:
                v vVar = v.purple;
                return v.white;
            case 2:
                v vVar2 = v.purple;
                return v.yellow;
            case 3:
                v vVar3 = v.purple;
                return v.f1407a;
            case 4:
                v vVar4 = v.purple;
                return v.f1408b;
            case 5:
                v vVar5 = v.purple;
                return v.f1409c;
            case 6:
                v vVar6 = v.purple;
                return v.f1410d;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
