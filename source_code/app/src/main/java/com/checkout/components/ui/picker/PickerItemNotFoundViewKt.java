package com.checkout.components.ui.picker;

import Ec.aa;
import T.d;
import T.i;
import T.s;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import ao.ad;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.view.TextLabelViewKt;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/checkout/components/ui/model/TextLabelViewItem;", Constants.KEY_TITLE, "subtitle", "", "PickerItemNotFoundView", "(Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Landroidx/compose/runtime/m;I)V", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PickerItemNotFoundViewKt {
    public static final void PickerItemNotFoundView(@NotNull TextLabelViewItem title, @NotNull TextLabelViewItem subtitle, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        int i11;
        Intrinsics.echo(title, "title");
        Intrinsics.echo(subtitle, "subtitle");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1425948549);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(title)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i11 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(subtitle)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i5 |= i10;
        }
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            i iVar = d.f2063g;
            C0537c c0537c = AbstractC0542h.alpha;
            C0540f india = AbstractC0542h.india(4, d.f2061d);
            FillElement fillElement = V.charlie;
            C0554u alpha = AbstractC0553t.alpha(india, iVar, c0585q, 54);
            long j5 = c0585q.magenta;
            int i12 = (int) ((j5 >>> 32) ^ j5);
            I mike = c0585q.mike();
            s charlie = T.a.charlie(fillElement, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                ad.blue(i12, c0585q, i12, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            TextLabelViewKt.TextLabelView(title.getStyle(), title.getState(), c0585q, 0);
            TextLabelViewKt.TextLabelView(subtitle.getStyle(), subtitle.getState(), c0585q, 0);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new aa(i4, 15, title, subtitle);
        }
    }

    public static final Unit PickerItemNotFoundView$lambda$1(TextLabelViewItem textLabelViewItem, TextLabelViewItem textLabelViewItem2, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        PickerItemNotFoundView(textLabelViewItem, textLabelViewItem2, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }
}
