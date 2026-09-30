package com.checkout.components.ui.view;

import Ac.n;
import Ec.al;
import F.K1;
import Lb.af;
import P.e;
import T.p;
import T.s;
import a0.C0360n;
import a0.ao;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import com.checkout.components.ui.R;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.utils.extensions.ModifierExtensionsKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import f0.AbstractC1680b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.Nullable;
import t6.AbstractC3076w3;
import t6.AbstractC3082y;
import t6.AbstractC3086y3;
import t6.W3;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/checkout/components/ui/model/style/base/ImageStyle;", "style", "", "testTag", "", "StyledImageView", "(Lcom/checkout/components/ui/model/style/base/ImageStyle;Ljava/lang/String;Landroidx/compose/runtime/m;II)V", "LT/s;", "modifier", "Lf0/b;", "painter", "ImageView", "(LT/s;Lf0/b;Lcom/checkout/components/ui/model/style/base/ImageStyle;Landroidx/compose/runtime/m;I)V", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StyledImageViewKt {
    private static final void ImageView(s sVar, AbstractC1680b abstractC1680b, ImageStyle imageStyle, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0360n c0360n;
        int i10;
        int i11;
        int i12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-68087275);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(sVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i5 = i12 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(abstractC1680b)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i5 |= i11;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(imageStyle)) {
                i10 = Barcode.FORMAT_QR_CODE;
            } else {
                i10 = 128;
            }
            i5 |= i10;
        }
        if ((i5 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            String bravo = AbstractC3086y3.bravo(c0585q, R.string.cko_content_description_image);
            Long tinColor = imageStyle.getTinColor();
            if (tinColor != null) {
                c0360n = new C0360n(ao.delta(tinColor.longValue()), 5);
            } else {
                c0360n = null;
            }
            W3.alpha(abstractC1680b, bravo, sVar, null, null, 0.0f, c0360n, c0585q, ((i5 >> 3) & 14) | ((i5 << 6) & 896), 56);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new al(sVar, (Object) abstractC1680b, (Object) imageStyle, i4, 18);
        }
    }

    public static final Unit ImageView$lambda$10(s sVar, AbstractC1680b abstractC1680b, ImageStyle imageStyle, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        ImageView(sVar, abstractC1680b, imageStyle, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final void StyledImageView(@Nullable ImageStyle imageStyle, @Nullable String str, @Nullable InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        boolean z2;
        String str2;
        String str3;
        Integer num;
        int i12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-277095315);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(imageStyle)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i4 | i12;
        } else {
            i10 = i4;
        }
        int i13 = i5 & 2;
        if (i13 != 0) {
            i10 |= 48;
        } else if ((i4 & 48) == 0) {
            if (c0585q.golf(str)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            Unit unit = null;
            if (i13 != 0) {
                str3 = null;
            } else {
                str3 = str;
            }
            if (imageStyle != null) {
                num = imageStyle.getImage();
            } else {
                num = null;
            }
            if (num == null) {
                c0585q.purple(-19201120);
                c0585q.quebec(false);
            } else {
                c0585q.purple(-19201119);
                AbstractC1680b charlie = AbstractC3076w3.charlie(num.intValue(), c0585q, 0);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.alpha = V.sierra(imageStyle.getModifier(), null, 3);
                Float opacity = imageStyle.getOpacity();
                if (opacity != null) {
                    objectRef.alpha = AbstractC3082y.charlie((s) objectRef.alpha, opacity.floatValue());
                }
                if (imageStyle.getPadding() != null) {
                    objectRef.alpha = AbstractC0538d.victor((s) objectRef.alpha, r3.getStart(), r3.getTop(), r3.getEnd(), r3.getBottom());
                }
                if (imageStyle.getHeight() != null) {
                    objectRef.alpha = V.echo((s) objectRef.alpha, r3.intValue());
                }
                if (imageStyle.getWidth() != null) {
                    objectRef.alpha = V.oscar((s) objectRef.alpha, r3.intValue());
                }
                Function0<Unit> onClick = imageStyle.getOnClick();
                if (onClick == null) {
                    c0585q.purple(-1008204227);
                    c0585q.quebec(false);
                } else {
                    c0585q.purple(-1008204226);
                    K1.foxtrot(onClick, ModifierExtensionsKt.optionalTestTag(p.alpha, str3), false, null, e.echo(553264102, new n(objectRef, charlie, imageStyle, 14), c0585q), c0585q, 196608, 28);
                    c0585q.quebec(false);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    c0585q.purple(-1008011995);
                    ImageView((s) objectRef.alpha, charlie, imageStyle, c0585q, (i10 << 6) & 896);
                    c0585q.quebec(false);
                } else {
                    c0585q.purple(1075855569);
                    c0585q.quebec(false);
                }
                c0585q.quebec(false);
            }
            str2 = str3;
        } else {
            c0585q.ochre();
            str2 = str;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new af(i4, imageStyle, str2, i5, 6);
        }
    }

    public static final Unit StyledImageView$lambda$7$lambda$5$lambda$4(Ref.ObjectRef objectRef, AbstractC1680b abstractC1680b, ImageStyle imageStyle, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            ImageView((s) objectRef.alpha, abstractC1680b, imageStyle, c0585q, 0);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit StyledImageView$lambda$8(ImageStyle imageStyle, String str, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        StyledImageView(imageStyle, str, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }
}
