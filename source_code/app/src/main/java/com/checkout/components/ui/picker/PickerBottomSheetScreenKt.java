package com.checkout.components.ui.picker;

import Cb.g;
import F.AbstractC0122j1;
import F.C0103e2;
import P.e;
import T.s;
import Xd.l;
import Xd.m;
import Y1.r;
import androidx.compose.foundation.layout.InterfaceC0555v;
import androidx.compose.foundation.layout.V;
import androidx.compose.foundation.layout.d0;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import com.google.mlkit.vision.barcode.common.Barcode;
import ge.InterfaceC1775g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t0.AbstractC2911e0;
import vf.ab;
import vf.ad;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aO\u0010\r\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/Function0;", "", "onBottomSheetDismissed", "LY1/r;", "navController", "La0/t;", "containerColor", "", "pickerScreenTestTag", "Lkotlin/Function1;", "pickerContentView", "PickerBottomSheetScreen-cf5BqRc", "(Lkotlin/jvm/functions/Function0;LY1/r;JLjava/lang/String;LXd/m;Landroidx/compose/runtime/m;I)V", "PickerBottomSheetScreen", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PickerBottomSheetScreenKt {
    /* renamed from: PickerBottomSheetScreen-cf5BqRc */
    public static final void m184PickerBottomSheetScreencf5BqRc(@NotNull final Function0<Unit> onBottomSheetDismissed, @NotNull final r navController, final long j5, @NotNull final String pickerScreenTestTag, @NotNull final m pickerContentView, @Nullable InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        boolean z2;
        C0585q c0585q;
        boolean z10;
        ab abVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Intrinsics.echo(onBottomSheetDismissed, "onBottomSheetDismissed");
        Intrinsics.echo(navController, "navController");
        Intrinsics.echo(pickerScreenTestTag, "pickerScreenTestTag");
        Intrinsics.echo(pickerContentView, "pickerContentView");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1954348016);
        if ((i4 & 6) == 0) {
            if (c0585q2.india(onBottomSheetDismissed)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i5 = i14 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.india(navController)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i5 |= i13;
        }
        if ((i4 & 384) == 0) {
            if (c0585q2.foxtrot(j5)) {
                i12 = Barcode.FORMAT_QR_CODE;
            } else {
                i12 = 128;
            }
            i5 |= i12;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q2.golf(pickerScreenTestTag)) {
                i11 = 2048;
            } else {
                i11 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i11;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q2.india(pickerContentView)) {
                i10 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i10 = 8192;
            }
            i5 |= i10;
        }
        int i15 = i5;
        if ((i15 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i15 & 1, z2)) {
            C0103e2 foxtrot = AbstractC0122j1.foxtrot(true, c0585q2, 6, 2);
            Object jade = c0585q2.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = C0564b.november(c0585q2);
                c0585q2.f(jade);
            }
            ab abVar2 = (ab) jade;
            float f5 = 24;
            C2093f delta = AbstractC2094g.delta(f5, f5);
            s alpha = T.a.alpha(androidx.compose.ui.platform.a.alpha(V.charlie, pickerScreenTestTag), AbstractC2911e0.alpha, new d0(4));
            boolean india = c0585q2.india(abVar2) | c0585q2.golf(foxtrot) | c0585q2.india(navController);
            if ((i15 & 14) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = india | z10;
            Object jade2 = c0585q2.jade();
            if (z11 || jade2 == asVar) {
                abVar = abVar2;
                F4.b bVar = new F4.b(abVar, foxtrot, navController, onBottomSheetDismissed, 3);
                c0585q2.f(bVar);
                jade2 = bVar;
            } else {
                abVar = abVar2;
            }
            c0585q = c0585q2;
            AbstractC0122j1.alpha((Function0) jade2, alpha, foxtrot, 0.0f, delta, j5, 0L, 0.0f, 0L, null, null, null, e.echo(1792352909, new g(pickerContentView, abVar, foxtrot, navController, onBottomSheetDismissed, 6), c0585q2), c0585q, (i15 << 9) & 458752, 4040);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new l() { // from class: com.checkout.components.ui.picker.a
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    Unit PickerBottomSheetScreen_cf5BqRc$lambda$4;
                    int intValue = ((Integer) obj2).intValue();
                    Function0 function0 = Function0.this;
                    r rVar = navController;
                    String str = pickerScreenTestTag;
                    m mVar = pickerContentView;
                    int i16 = i4;
                    PickerBottomSheetScreen_cf5BqRc$lambda$4 = PickerBottomSheetScreenKt.PickerBottomSheetScreen_cf5BqRc$lambda$4(function0, rVar, j5, str, mVar, i16, (InterfaceC0581m) obj, intValue);
                    return PickerBottomSheetScreen_cf5BqRc$lambda$4;
                }
            };
        }
    }

    public static final void PickerBottomSheetScreen_cf5BqRc$dismissBottomSheet(ab abVar, C0103e2 c0103e2, r rVar, Function0<Unit> function0) {
        ad.zulu(abVar, null, null, new PickerBottomSheetScreenKt$PickerBottomSheetScreen$dismissBottomSheet$1(c0103e2, rVar, function0, null), 3);
    }

    public static final Unit PickerBottomSheetScreen_cf5BqRc$lambda$1$lambda$0(ab abVar, C0103e2 c0103e2, r rVar, Function0 function0) {
        PickerBottomSheetScreen_cf5BqRc$dismissBottomSheet(abVar, c0103e2, rVar, function0);
        return Unit.INSTANCE;
    }

    public static final Unit PickerBottomSheetScreen_cf5BqRc$lambda$3(m mVar, ab abVar, C0103e2 c0103e2, r rVar, Function0 function0, InterfaceC0555v ModalBottomSheet, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        Intrinsics.echo(ModalBottomSheet, "$this$ModalBottomSheet");
        if ((i4 & 17) != 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            boolean india = c0585q.india(abVar) | c0585q.golf(c0103e2) | c0585q.india(rVar) | c0585q.golf(function0);
            Object jade = c0585q.jade();
            if (india || jade == C0580l.alpha) {
                jade = new PickerBottomSheetScreenKt$PickerBottomSheetScreen$2$1$1(abVar, c0103e2, rVar, function0);
                c0585q.f(jade);
            }
            mVar.invoke((InterfaceC1775g) jade, c0585q, 0);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit PickerBottomSheetScreen_cf5BqRc$lambda$4(Function0 function0, r rVar, long j5, String str, m mVar, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        m184PickerBottomSheetScreencf5BqRc(function0, rVar, j5, str, mVar, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit bravo(ab abVar, C0103e2 c0103e2, r rVar, Function0 function0) {
        return PickerBottomSheetScreen_cf5BqRc$lambda$1$lambda$0(abVar, c0103e2, rVar, function0);
    }
}
