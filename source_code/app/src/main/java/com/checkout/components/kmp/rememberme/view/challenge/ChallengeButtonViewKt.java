package com.checkout.components.kmp.rememberme.view.challenge;

import F.AbstractC0141o0;
import F.K1;
import F.ak;
import O0.l;
import T.d;
import T.j;
import T.p;
import T.s;
import Vc.o;
import Wf.e;
import Wf.m;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import ao.ad;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.utils.ExtensionsKt;
import com.checkout.components.kmp.rememberme.view.ui.TextViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aG\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"LWf/e;", "iconRes", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;", "designTokens", "", "buttonText", "Lkotlin/Function0;", "", "onClick", "La0/t;", "containerColor", "LT/s;", "modifier", "ChallengeButtonView-FHprtrg", "(LWf/e;Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;Ljava/lang/String;Lkotlin/jvm/functions/Function0;JLT/s;Landroidx/compose/runtime/m;II)V", "ChallengeButtonView", "rememberme_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChallengeButtonViewKt {
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* renamed from: ChallengeButtonView-FHprtrg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m119ChallengeButtonViewFHprtrg(@NotNull e iconRes, @NotNull DesignTokens designTokens, @NotNull String buttonText, @NotNull Function0<Unit> onClick, long j5, @Nullable s sVar, @Nullable InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        s sVar2;
        int i11;
        boolean z2;
        s sVar3;
        Q uniform;
        s sVar4;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Intrinsics.echo(iconRes, "iconRes");
        Intrinsics.echo(designTokens, "designTokens");
        Intrinsics.echo(buttonText, "buttonText");
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1286259875);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(iconRes)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i10 = i16 | i4;
        } else {
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
            if (c0585q.golf(buttonText)) {
                i14 = Barcode.FORMAT_QR_CODE;
            } else {
                i14 = 128;
            }
            i10 |= i14;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.india(onClick)) {
                i13 = 2048;
            } else {
                i13 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i13;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q.foxtrot(j5)) {
                i12 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i12 = 8192;
            }
            i10 |= i12;
        }
        int i17 = i5 & 32;
        if (i17 != 0) {
            i10 |= 196608;
        } else if ((196608 & i4) == 0) {
            sVar2 = sVar;
            if (c0585q.golf(sVar2)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i10 |= i11;
            if ((74899 & i10) == 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c0585q.magenta(i10 & 1, z2)) {
                if (i17 != 0) {
                    sVar4 = p.alpha;
                } else {
                    sVar4 = sVar2;
                }
                float f5 = 16;
                float f10 = 12;
                K1.bravo(onClick, V.charlie(sVar4, 1.0f), false, ExtensionsKt.buttonShape(designTokens), new ak(j5, ExtensionsKt.inverseColor(designTokens), ExtensionsKt.disabledColor(designTokens), ExtensionsKt.disabledColor(designTokens)), null, null, new M(f5, f10, f5, f10), P.e.echo(609472179, new o(iconRes, designTokens, buttonText, 2), c0585q), c0585q, ((i10 >> 9) & 14) | 817889280, 356);
                sVar3 = sVar4;
            } else {
                c0585q.ochre();
                sVar3 = sVar2;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new X4.a(iconRes, designTokens, buttonText, onClick, j5, sVar3, i4, i5);
                return;
            }
            return;
        }
        sVar2 = sVar;
        if ((74899 & i10) == 74898) {
        }
        if (!c0585q.magenta(i10 & 1, z2)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final Unit ChallengeButtonView_FHprtrg$lambda$1(e eVar, DesignTokens designTokens, String str, T Button, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        Intrinsics.echo(Button, "$this$Button");
        if ((i4 & 17) != 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            j jVar = d.f2061d;
            C0540f golf = AbstractC0542h.golf(6);
            p pVar = p.alpha;
            S alpha = androidx.compose.foundation.layout.Q.alpha(golf, jVar, c0585q, 54);
            int romeo = C0564b.romeo(c0585q);
            I mike = c0585q.mike();
            s charlie = T.a.charlie(pVar, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            AbstractC0141o0.alpha(m.alpha(eVar, c0585q, 0), null, null, ExtensionsKt.inverseColor(designTokens), c0585q, 48, 4);
            TextViewKt.m126TextView7O2jLU0((s) null, ExtensionsKt.inverseColor(designTokens), designTokens.getFonts().getButton(), str, 0, (l) null, c0585q, 0, 49);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit ChallengeButtonView_FHprtrg$lambda$2(e eVar, DesignTokens designTokens, String str, Function0 function0, long j5, s sVar, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        m119ChallengeButtonViewFHprtrg(eVar, designTokens, str, function0, j5, sVar, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }
}
