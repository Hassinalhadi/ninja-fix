package Ec;

import F.Q1;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.p0;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* loaded from: classes2.dex */
public abstract class av {
    public static final void alpha(final Dc.e shiftsUiState, final boolean z2, final Xd.l onLeaveShift, final Function1 onShiftLocation, final Function0 onBookNewShift, final Function0 onRefresh, final Function0 onLoadMore, final Function1 onTakeBreak, final Dc.k historyUiState, final boolean z10, final Function0 onHistoryRefresh, final Function0 onHistoryLoadMore, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z11;
        C0585q c0585q;
        Intrinsics.echo(shiftsUiState, "shiftsUiState");
        Intrinsics.echo(onLeaveShift, "onLeaveShift");
        Intrinsics.echo(onShiftLocation, "onShiftLocation");
        Intrinsics.echo(onBookNewShift, "onBookNewShift");
        Intrinsics.echo(onRefresh, "onRefresh");
        Intrinsics.echo(onLoadMore, "onLoadMore");
        Intrinsics.echo(onTakeBreak, "onTakeBreak");
        Intrinsics.echo(historyUiState, "historyUiState");
        Intrinsics.echo(onHistoryRefresh, "onHistoryRefresh");
        Intrinsics.echo(onHistoryLoadMore, "onHistoryLoadMore");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1631865367);
        char c3 = 2;
        if (c0585q2.golf(shiftsUiState)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i19 = i4 | i5;
        char c4 = 16;
        if (c0585q2.hotel(z2)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i20 = i19 | i10;
        if (c0585q2.india(onLeaveShift)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i21 = i20 | i11;
        if (c0585q2.india(onShiftLocation)) {
            i12 = 2048;
        } else {
            i12 = Barcode.FORMAT_UPC_E;
        }
        int i22 = i21 | i12;
        if (c0585q2.india(onBookNewShift)) {
            i13 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i13 = 8192;
        }
        int i23 = i22 | i13;
        if (c0585q2.india(onRefresh)) {
            i14 = 131072;
        } else {
            i14 = 65536;
        }
        int i24 = i23 | i14;
        if (c0585q2.india(onLoadMore)) {
            i15 = 1048576;
        } else {
            i15 = 524288;
        }
        int i25 = i24 | i15;
        if (c0585q2.india(onTakeBreak)) {
            i16 = 8388608;
        } else {
            i16 = 4194304;
        }
        int i26 = i25 | i16;
        if (c0585q2.golf(historyUiState)) {
            i17 = 67108864;
        } else {
            i17 = 33554432;
        }
        int i27 = i26 | i17;
        if (c0585q2.hotel(z10)) {
            i18 = 536870912;
        } else {
            i18 = 268435456;
        }
        int i28 = i27 | i18;
        if (c0585q2.india(onHistoryRefresh)) {
            c3 = 4;
        }
        if (c0585q2.india(onHistoryLoadMore)) {
            c4 = ' ';
        }
        int i29 = c3 | c4;
        if ((306783379 & i28) == 306783378 && (i29 & 19) == 18) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (c0585q2.magenta(i28 & 1, z11)) {
            Object jade = c0585q2.jade();
            if (jade == C0580l.alpha) {
                jade = C0564b.whiskey(0);
                c0585q2.f(jade);
            }
            final p0 p0Var = (p0) jade;
            c0585q = c0585q2;
            Q1.alpha(null, null, P.e.echo(1919106926, new l(onBookNewShift, 1), c0585q2), null, null, 0, ay.india, 0L, null, P.e.echo(-1873719880, new Xd.m() { // from class: Ec.as
                @Override // Xd.m
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z12;
                    int i30;
                    L innerPadding = (L) obj;
                    InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    Intrinsics.echo(innerPadding, "innerPadding");
                    if ((intValue & 6) == 0) {
                        if (((C0585q) interfaceC0581m2).golf(innerPadding)) {
                            i30 = 4;
                        } else {
                            i30 = 2;
                        }
                        intValue |= i30;
                    }
                    if ((intValue & 19) != 18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    C0585q c0585q3 = (C0585q) interfaceC0581m2;
                    if (c0585q3.magenta(intValue & 1, z12)) {
                        FillElement fillElement = V.charlie;
                        T.s romeo = AbstractC0538d.romeo(fillElement, innerPadding);
                        C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q3, 0);
                        long j5 = c0585q3.magenta;
                        int i31 = (int) (j5 ^ (j5 >>> 32));
                        I mike = c0585q3.mike();
                        T.s charlie = T.a.charlie(romeo, c0585q3);
                        InterfaceC2552l.maroon.getClass();
                        C2550j c2550j = C2551k.bravo;
                        c0585q3.white();
                        if (c0585q3.lime) {
                            c0585q3.lima(c2550j);
                        } else {
                            c0585q3.i();
                        }
                        C0564b.blue(C2551k.foxtrot, c0585q3, alpha);
                        C0564b.blue(C2551k.echo, c0585q3, mike);
                        C2549i c2549i = C2551k.golf;
                        if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(i31))) {
                            ao.ad.blue(i31, c0585q3, i31, c2549i);
                        }
                        C0564b.blue(C2551k.delta, c0585q3, charlie);
                        p0 p0Var2 = p0Var;
                        int juliet = p0Var2.juliet();
                        Object jade2 = c0585q3.jade();
                        if (jade2 == C0580l.alpha) {
                            jade2 = new au(p0Var2, 0);
                            c0585q3.f(jade2);
                        }
                        t.delta(juliet, (Function1) jade2, c0585q3, 48);
                        int juliet2 = p0Var2.juliet();
                        if (juliet2 != 0) {
                            if (juliet2 != 1) {
                                c0585q3.purple(-1607577120);
                            } else {
                                c0585q3.purple(502439957);
                                ap.juliet(historyUiState, z10, onHistoryRefresh, onHistoryLoadMore, c0585q3, 0);
                            }
                            c0585q3.quebec(false);
                        } else {
                            c0585q3.purple(502422982);
                            G.l.alpha(z2, onRefresh, fillElement, null, null, null, P.e.echo(-1937912720, new Cb.g(shiftsUiState, onLeaveShift, onShiftLocation, onTakeBreak, onLoadMore, 2), c0585q3), c0585q3, 1573248);
                            c0585q3 = c0585q3;
                            c0585q3.quebec(false);
                        }
                        c0585q3.quebec(true);
                    } else {
                        c0585q3.ochre();
                    }
                    return Unit.INSTANCE;
                }
            }, c0585q2), c0585q, 806879616, 443);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l(z2, onLeaveShift, onShiftLocation, onBookNewShift, onRefresh, onLoadMore, onTakeBreak, historyUiState, z10, onHistoryRefresh, onHistoryLoadMore, i4) { // from class: Ec.at

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Function1 f989a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Dc.k f990b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f991c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Function0 f992d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ boolean purple;
                public final /* synthetic */ Xd.l red;
                public final /* synthetic */ Function1 silver;
                public final /* synthetic */ Function0 teal;
                public final /* synthetic */ Function0 white;
                public final /* synthetic */ Function0 yellow;

                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(1);
                    Function0 function0 = this.f992d;
                    Function0 function02 = this.e;
                    av.alpha(Dc.e.this, this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f989a, this.f990b, this.f991c, function0, function02, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
