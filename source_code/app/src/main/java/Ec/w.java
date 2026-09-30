package Ec;

import F.AbstractC0122j1;
import F.C0103e2;
import a0.C0366t;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;

/* loaded from: classes2.dex */
public abstract class w {
    public static final long alpha = a0.ao.delta(4292617766L);
    public static final long bravo = a0.ao.delta(4294898418L);
    public static final long charlie;
    public static final long delta;

    static {
        a0.ao.delta(4294888138L);
        charlie = a0.ao.delta(4294243573L);
        delta = a0.ao.delta(4293190887L);
    }

    public static final void alpha(List leaveReasons, Function1 onConfirm, Function0 onDismiss, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q;
        int i10;
        int i11;
        int i12;
        Intrinsics.echo(leaveReasons, "leaveReasons");
        Intrinsics.echo(onConfirm, "onConfirm");
        Intrinsics.echo(onDismiss, "onDismiss");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-135572705);
        if ((i4 & 6) == 0) {
            if (c0585q2.india(leaveReasons)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i5 = i12 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.india(onConfirm)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i5 |= i11;
        }
        if ((i4 & 384) == 0) {
            if (c0585q2.india(onDismiss)) {
                i10 = Barcode.FORMAT_QR_CODE;
            } else {
                i10 = 128;
            }
            i5 |= i10;
        }
        int i13 = i5;
        if ((i13 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i13 & 1, z2)) {
            C0103e2 foxtrot = AbstractC0122j1.foxtrot(true, c0585q2, 6, 2);
            Object jade = c0585q2.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = C0564b.zulu(null);
                c0585q2.f(jade);
            }
            androidx.compose.runtime.ax axVar = (androidx.compose.runtime.ax) jade;
            Object jade2 = c0585q2.jade();
            if (jade2 == asVar) {
                jade2 = C0564b.zulu(Boolean.FALSE);
                c0585q2.f(jade2);
            }
            float f5 = 20;
            c0585q = c0585q2;
            AbstractC0122j1.alpha(onDismiss, null, foxtrot, 0.0f, AbstractC2094g.delta(f5, f5), C0366t.echo, 0L, 0.0f, 0L, null, null, null, P.e.echo(-718750238, new Cb.g(onConfirm, onDismiss, leaveReasons, (Object) axVar, (androidx.compose.runtime.ax) jade2, 1), c0585q2), c0585q, ((i13 >> 6) & 14) | 196608, 4042);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new v(leaveReasons, onConfirm, onDismiss, i4, 0);
        }
    }
}
