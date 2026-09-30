package com.checkout.components.ui.utils.extensions;

import H0.aa;
import H0.g;
import H0.i;
import H0.k;
import H0.n;
import H0.r;
import H0.v;
import com.checkout.components.interfaces.uicustomisation.font.FontFamily;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2715m5;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a/\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;", "LH0/k;", "toFontFamily", "(Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;)LH0/k;", "", "resId", "LH0/v;", "weight", "LH0/r;", "style", "LH0/i;", "createFont-9y9KoKQ", "(Ljava/lang/Integer;LH0/v;LH0/r;)LH0/i;", "createFont", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FontExtensionsKt {
    /* renamed from: createFont-9y9KoKQ, reason: not valid java name */
    private static final i m189createFont9y9KoKQ(Integer num, v vVar, r rVar) {
        int i4;
        if (num != null) {
            int intValue = num.intValue();
            if (rVar != null) {
                i4 = rVar.alpha;
            } else {
                i4 = 0;
            }
            return AbstractC2715m5.alpha(intValue, vVar, i4, 8);
        }
        return null;
    }

    /* renamed from: createFont-9y9KoKQ$default, reason: not valid java name */
    public static /* synthetic */ i m190createFont9y9KoKQ$default(Integer num, v vVar, r rVar, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            rVar = null;
        }
        return m189createFont9y9KoKQ(num, vVar, rVar);
    }

    @NotNull
    public static final k toFontFamily(@NotNull FontFamily fontFamily) {
        Intrinsics.echo(fontFamily, "<this>");
        FontFamily.Default r62 = FontFamily.Default.INSTANCE;
        g gVar = k.alpha;
        aa aaVar = (aa) y.sierra(new Pair(r62, gVar), new Pair(FontFamily.Serif.INSTANCE, k.red), new Pair(FontFamily.SansSerif.INSTANCE, k.purple), new Pair(FontFamily.Monospace.INSTANCE, k.silver), new Pair(FontFamily.Cursive.INSTANCE, k.teal)).get(fontFamily);
        if (aaVar != null) {
            return aaVar;
        }
        if (fontFamily instanceof FontFamily.Custom) {
            FontFamily.Custom custom = (FontFamily.Custom) fontFamily;
            Integer valueOf = Integer.valueOf(custom.getNormalFont());
            v vVar = v.yellow;
            return new n(CollectionsKt.peach(m190createFont9y9KoKQ$default(valueOf, vVar, null, 4, null), m189createFont9y9KoKQ(custom.getNormalItalicFont(), vVar, new r(1)), m190createFont9y9KoKQ$default(custom.getLightFont(), v.white, null, 4, null), m190createFont9y9KoKQ$default(custom.getMediumFont(), v.f1407a, null, 4, null), m190createFont9y9KoKQ$default(custom.getSemiBold(), v.f1408b, null, 4, null), m190createFont9y9KoKQ$default(custom.getBoldFont(), v.f1409c, null, 4, null), m190createFont9y9KoKQ$default(custom.getExtraBoldFont(), v.f1410d, null, 4, null)));
        }
        return gVar;
    }
}
