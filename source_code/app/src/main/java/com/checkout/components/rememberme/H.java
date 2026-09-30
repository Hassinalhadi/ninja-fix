package com.checkout.components.rememberme;

import Cb.ac;
import D0.af;
import D0.ah;
import D0.an;
import F.G2;
import a0.ar;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import ao.ad;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import n.at;

/* loaded from: classes3.dex */
public abstract class H {
    public static final Unit a(T.s sVar, TextLabelViewItem textLabelViewItem, Function0 function0, Function0 function02, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        a(sVar, textLabelViewItem, function0, function02, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    public static final void a(T.s sVar, TextLabelViewItem legalText, Function0 onTermsClick, Function0 onPrivacyNoticeClick, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        T.s sVar2;
        int i10;
        Intrinsics.echo(legalText, "legalText");
        Intrinsics.echo(onTermsClick, "onTermsClick");
        Intrinsics.echo(onPrivacyNoticeClick, "onPrivacyNoticeClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(544748549);
        int i11 = i5 & 1;
        if (i11 != 0) {
            i10 = i4 | 6;
            sVar2 = sVar;
        } else if ((i4 & 6) == 0) {
            sVar2 = sVar;
            i10 = (c0585q.golf(sVar2) ? 4 : 2) | i4;
        } else {
            sVar2 = sVar;
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            i10 |= (i4 & 64) == 0 ? c0585q.golf(legalText) : c0585q.india(legalText) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i10 |= c0585q.india(onTermsClick) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i10 |= c0585q.india(onPrivacyNoticeClick) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if (c0585q.magenta(i10 & 1, (i10 & 1171) != 1170)) {
            T.s sVar3 = i11 != 0 ? T.p.alpha : sVar2;
            an style = legalText.getStyle().getStyle();
            if (style == null) {
                c0585q.purple(-482643668);
                style = (an) c0585q.kilo(G2.alpha);
            } else {
                c0585q.purple(-482644908);
            }
            c0585q.quebec(false);
            D0.g a6 = a((String) legalText.getState().getText().getValue(), style.bravo());
            boolean golf = ((i10 & 896) == 256) | c0585q.golf(a6) | ((i10 & 7168) == 2048);
            Object jade = c0585q.jade();
            if (golf || jade == C0580l.alpha) {
                jade = new ac(a6, onTermsClick, onPrivacyNoticeClick, 12);
                c0585q.f(jade);
            }
            at.echo(a6, sVar3, style, false, 0, 0, null, (Function1) jade, c0585q, (i10 << 3) & 112);
            sVar2 = sVar3;
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Bb.e(sVar2, legalText, onTermsClick, onPrivacyNoticeClick, i4, i5, 3);
        }
    }

    public static final Unit a(D0.g gVar, Function0 function0, Function0 function02, int i4) {
        if (((D0.e) CollectionsKt.green(gVar.bravo(i4, i4, "terms"))) != null) {
            function0.invoke();
        }
        if (((D0.e) CollectionsKt.green(gVar.bravo(i4, i4, "privacy"))) != null) {
            function02.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final D0.g a(String str, long j5) {
        D0.d dVar = new D0.d();
        int i4 = 0;
        while (true) {
            if (i4 >= str.length()) {
                break;
            }
            int fuchsia = StringsKt.fuchsia(str, "<terms>", i4, false, 4);
            int fuchsia2 = StringsKt.fuchsia(str, "<privacy>", i4, false, 4);
            if (fuchsia != -1 && (fuchsia2 == -1 || fuchsia < fuchsia2)) {
                fuchsia2 = fuchsia;
            } else if (fuchsia2 == -1) {
                fuchsia2 = -1;
            }
            if (fuchsia2 == -1) {
                String substring = str.substring(i4);
                Intrinsics.delta(substring, "substring(...)");
                dVar.bravo(substring);
                break;
            }
            String substring2 = str.substring(i4, fuchsia2);
            Intrinsics.delta(substring2, "substring(...)");
            dVar.bravo(substring2);
            String str2 = fuchsia2 == fuchsia ? "terms" : "privacy";
            String gray = ad.gray("<", str2, ">");
            String gray2 = ad.gray("</", str2, ">");
            int length = gray.length() + fuchsia2;
            int fuchsia3 = StringsKt.fuchsia(str, gray2, length, false, 4);
            if (fuchsia3 == -1) {
                String substring3 = str.substring(i4);
                Intrinsics.delta(substring3, "substring(...)");
                dVar.bravo(substring3);
                break;
            }
            String substring4 = str.substring(length, fuchsia3);
            Intrinsics.delta(substring4, "substring(...)");
            D0.c cVar = new D0.c(new ah(str2), dVar.alpha.length(), 0, str2, 4);
            ArrayList arrayList = dVar.purple;
            arrayList.add(cVar);
            dVar.red.add(cVar);
            arrayList.size();
            int echo = dVar.echo(new af(j5, 0L, (H0.v) null, (H0.r) null, (H0.s) null, (H0.k) null, (String) null, 0L, (O0.a) null, (O0.p) null, (K0.b) null, 0L, O0.l.charlie, (ar) null, 61438));
            try {
                dVar.bravo(substring4);
                dVar.delta(echo);
                dVar.charlie();
                i4 = gray2.length() + fuchsia3;
            } catch (Throwable th) {
                dVar.delta(echo);
                throw th;
            }
        }
        return dVar.foxtrot();
    }
}
