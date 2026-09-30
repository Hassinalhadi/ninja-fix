package com.checkout.components.kmp.rememberme.view.dialog;

import F.AbstractC0149q0;
import F4.g;
import O0.l;
import T.a;
import T.d;
import T.p;
import T.s;
import Wf.e;
import Wf.m;
import a0.C0360n;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.Q;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import ao.ad;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.utils.ExtensionsKt;
import com.checkout.components.kmp.rememberme.view.ui.TextViewKt;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.AbstractC3087z;
import t6.W3;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a9\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LT/s;", "modifier", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;", "designTokens", "LWf/e;", Constants.KEY_ICON, "", "subtitle", "body", "", "InfoDialogRowView", "(LT/s;Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;LWf/e;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/m;II)V", "InfoDialogRowViewPreview", "(Landroidx/compose/runtime/m;I)V", "rememberme_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InfoDialogRowViewKt {
    public static final void InfoDialogRowView(@Nullable s sVar, @NotNull DesignTokens designTokens, @NotNull e icon, @NotNull String subtitle, @NotNull String body, @Nullable InterfaceC0581m interfaceC0581m, int i4, int i5) {
        s sVar2;
        int i10;
        int i11;
        boolean z2;
        s sVar3;
        s sVar4;
        int i12;
        int i13;
        int i14;
        int i15;
        Intrinsics.echo(designTokens, "designTokens");
        Intrinsics.echo(icon, "icon");
        Intrinsics.echo(subtitle, "subtitle");
        Intrinsics.echo(body, "body");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-782733200);
        int i16 = i5 & 1;
        if (i16 != 0) {
            i10 = i4 | 6;
            sVar2 = sVar;
        } else if ((i4 & 6) == 0) {
            sVar2 = sVar;
            if (c0585q.golf(sVar2)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i4;
        } else {
            sVar2 = sVar;
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(designTokens)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i10 |= i15;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(icon)) {
                i14 = Barcode.FORMAT_QR_CODE;
            } else {
                i14 = 128;
            }
            i10 |= i14;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.golf(subtitle)) {
                i13 = 2048;
            } else {
                i13 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i13;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q.golf(body)) {
                i12 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i12 = 8192;
            }
            i10 |= i12;
        }
        if ((i10 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            p pVar = p.alpha;
            if (i16 != 0) {
                sVar4 = AbstractC0538d.whiskey(pVar, 0.0f, 32, 0.0f, 0.0f, 13);
            } else {
                sVar4 = sVar2;
            }
            s charlie = V.charlie(sVar4, 1.0f);
            S alpha = Q.alpha(AbstractC0542h.golf(16), d.f2060c, c0585q, 6);
            int romeo = C0564b.romeo(c0585q);
            I mike = c0585q.mike();
            s charlie2 = a.charlie(charlie, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, alpha);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ad.blue(romeo, c0585q, romeo, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            W3.alpha(m.alpha(icon, c0585q, (i10 >> 6) & 14), null, AbstractC3087z.alpha(V.kilo(pVar, 24), AbstractC2094g.bravo(4)), null, null, 0.0f, new C0360n(ExtensionsKt.primaryColor(designTokens), 5), c0585q, 48, 56);
            c0585q = c0585q;
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, d.f2062f, c0585q, 0);
            int romeo2 = C0564b.romeo(c0585q);
            I mike2 = c0585q.mike();
            s charlie3 = a.charlie(pVar, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha2);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo2))) {
                ad.blue(romeo2, c0585q, romeo2, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie3);
            sVar3 = sVar4;
            TextViewKt.m126TextView7O2jLU0((s) null, ExtensionsKt.primaryColor(designTokens), designTokens.getFonts().getHeading(), subtitle, 0, (l) null, c0585q, i10 & 7168, 49);
            TextViewKt.m126TextView7O2jLU0((s) null, ExtensionsKt.secondaryColor(designTokens), designTokens.getFonts().getLabel(), body, 0, (l) null, c0585q, (i10 >> 3) & 7168, 49);
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
            sVar3 = sVar2;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new W4.a(sVar3, designTokens, icon, subtitle, body, i4, i5);
        }
    }

    public static final Unit InfoDialogRowView$lambda$2(s sVar, DesignTokens designTokens, e eVar, String str, String str2, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        InfoDialogRowView(sVar, designTokens, eVar, str, str2, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    private static final void InfoDialogRowViewPreview(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1001734387);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            AbstractC0149q0.alpha(null, null, null, ComposableSingletons$InfoDialogRowViewKt.INSTANCE.getLambda$483755207$rememberme_release(), c0585q, 3072, 7);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new g(i4, 16);
        }
    }

    public static final Unit InfoDialogRowViewPreview$lambda$3(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        InfoDialogRowViewPreview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }
}
