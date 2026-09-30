package R;

import Cb.ac;
import Lb.C0222e;
import Lb.am;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.O;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import bv.al;
import bv.au;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p2.AbstractC2268a;

/* loaded from: classes3.dex */
public final class e implements c {
    public static final J2.l teal = new J2.l(new C0222e(26), new am(14));
    public final Map alpha;
    public final al purple;
    public g red;
    public final Aa.l silver;

    public e(Map map) {
        this.alpha = map;
        long[] jArr = au.alpha;
        this.purple = new al();
        this.silver = new Aa.l(20, this);
    }

    @Override // R.c
    public final void alpha(Object obj, P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        int i11;
        int i12;
        int i13 = 8;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(533563200);
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
            c0585q.teal(obj);
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                Aa.l lVar = this.silver;
                if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                    Map map = (Map) this.alpha.get(obj);
                    E0 e02 = i.alpha;
                    j jVar = new j(new h(map, lVar));
                    c0585q.f(jVar);
                    jade = jVar;
                } else {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
            }
            j jVar2 = (j) jade;
            C0564b.bravo(new O[]{i.alpha.alpha(jVar2), AbstractC2268a.alpha.alpha(jVar2)}, dVar, c0585q, (i5 & 112) | 8);
            Unit unit = Unit.INSTANCE;
            boolean india = c0585q.india(this) | c0585q.india(obj) | c0585q.india(jVar2);
            Object jade2 = c0585q.jade();
            if (india || jade2 == asVar) {
                jade2 = new ac(this, obj, jVar2, i13);
                c0585q.f(jade2);
            }
            C0564b.delta(unit, (Function1) jade2, c0585q);
            if (c0585q.yankee && c0585q.coral.india == c0585q.zulu) {
                c0585q.zulu = -1;
                c0585q.yankee = false;
            }
            c0585q.quebec(false);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.al(this, obj, dVar, i4, 4);
        }
    }

    @Override // R.c
    public final void foxtrot(Object obj) {
        if (this.purple.kilo(obj) == null) {
            this.alpha.remove(obj);
        }
    }
}
