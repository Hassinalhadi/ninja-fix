package com.checkout.components.ui.view;

import T.a;
import T.d;
import T.j;
import T.p;
import T.s;
import a0.C0360n;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.Q;
import androidx.compose.foundation.layout.S;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ao.ad;
import com.checkout.components.ui.R;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.utils.constants.DesignConstants;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import jb.C1956a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.AbstractC3076w3;
import t6.W3;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a'\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"La0/t;", Constants.KEY_COLOR, "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "style", "Lcom/checkout/components/ui/model/state/TextLabelState;", "state", "", "InputFieldErrorMessageView-3J-VO9M", "(JLcom/checkout/components/ui/model/style/view/TextLabelViewStyle;Lcom/checkout/components/ui/model/state/TextLabelState;Landroidx/compose/runtime/m;I)V", "InputFieldErrorMessageView", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InputFieldErrorMessageViewKt {
    /* renamed from: InputFieldErrorMessageView-3J-VO9M */
    public static final void m194InputFieldErrorMessageView3JVO9M(long j5, @NotNull TextLabelViewStyle style, @NotNull TextLabelState state, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        int i11;
        int i12;
        Intrinsics.echo(style, "style");
        Intrinsics.echo(state, "state");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-751533692);
        if ((i4 & 6) == 0) {
            if (c0585q.foxtrot(j5)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i5 = i12 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(style)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i5 |= i11;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(state)) {
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
            j jVar = d.f2061d;
            p pVar = p.alpha;
            DesignConstants designConstants = DesignConstants.INSTANCE;
            s whiskey = AbstractC0538d.whiskey(pVar, 0.0f, designConstants.m186getErrorMessagePaddingD9Ej5fM(), 0.0f, 0.0f, 13);
            C0537c c0537c = AbstractC0542h.alpha;
            S alpha = Q.alpha(AbstractC0542h.golf(designConstants.m186getErrorMessagePaddingD9Ej5fM()), jVar, c0585q, 48);
            long j6 = c0585q.magenta;
            int i13 = (int) ((j6 >>> 32) ^ j6);
            I mike = c0585q.mike();
            s charlie = a.charlie(whiskey, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                ad.blue(i13, c0585q, i13, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            W3.alpha(AbstractC3076w3.charlie(R.drawable.cko_ic_error, c0585q, 0), ((Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo)).getString(R.string.cko_content_description_error_icon), null, null, null, 0.0f, new C0360n(j5, 5), c0585q, 0, 60);
            TextLabelViewKt.TextLabelView(style, state, c0585q, (i5 >> 3) & 126);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C1956a(j5, style, state, i4, 2);
        }
    }

    public static final Unit InputFieldErrorMessageView_3J_VO9M$lambda$1(long j5, TextLabelViewStyle textLabelViewStyle, TextLabelState textLabelState, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        m194InputFieldErrorMessageView3JVO9M(j5, textLabelViewStyle, textLabelState, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }
}
