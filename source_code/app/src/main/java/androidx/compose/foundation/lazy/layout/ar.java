package androidx.compose.foundation.lazy.layout;

import a2.C0393r;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class ar implements R.g, R.c {
    public final R.h alpha;
    public final R.e purple;
    public final bv.am red;

    public ar(R.g gVar, Map map, R.e eVar) {
        Ya.c cVar = new Ya.c(10, gVar);
        E0 e02 = R.i.alpha;
        this.alpha = new R.h(map, cVar);
        this.purple = eVar;
        bv.am amVar = bv.av.alpha;
        this.red = new bv.am();
    }

    @Override // R.c
    public final void alpha(Object obj, P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        int i11;
        int i12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-858296452);
        if ((i4 & 6) == 0) {
            if (c0585q.india(obj)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i5 = i12 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(dVar)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i5 |= i11;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.india(this)) {
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
            this.purple.alpha(obj, dVar, c0585q, i5 & 126);
            boolean india = c0585q.india(this) | c0585q.india(obj);
            Object jade = c0585q.jade();
            if (india || jade == C0580l.alpha) {
                jade = new C0393r(8, this, obj);
                c0585q.f(jade);
            }
            C0564b.delta(obj, (Function1) jade, c0585q);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.al(this, obj, dVar, i4, 12);
        }
    }

    @Override // R.g
    public final boolean bravo(Object obj) {
        return this.alpha.bravo(obj);
    }

    @Override // R.g
    public final Map charlie() {
        bv.am amVar = this.red;
        Object[] objArr = amVar.bravo;
        long[] jArr = amVar.alpha;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j5 = jArr[i4];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i10 = 0; i10 < i5; i10++) {
                        if ((255 & j5) < 128) {
                            this.purple.foxtrot(objArr[(i4 << 3) + i10]);
                        }
                        j5 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i4++;
            }
        }
        return this.alpha.charlie();
    }

    @Override // R.g
    public final Object delta(String str) {
        return this.alpha.delta(str);
    }

    @Override // R.g
    public final R.f echo(String str, Function0 function0) {
        return this.alpha.echo(str, function0);
    }

    @Override // R.c
    public final void foxtrot(Object obj) {
        this.purple.foxtrot(obj);
    }
}
