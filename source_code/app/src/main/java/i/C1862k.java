package i;

import Ec.aa;
import androidx.compose.foundation.lazy.layout.as;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1862k implements androidx.compose.foundation.lazy.layout.w {
    public final C1874w alpha;
    public final C1860i bravo;
    public final C1855d charlie;
    public final as delta;

    public C1862k(C1874w c1874w, C1860i c1860i, C1855d c1855d, as asVar) {
        this.alpha = c1874w;
        this.bravo = c1860i;
        this.charlie = c1855d;
        this.delta = asVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // androidx.compose.foundation.lazy.layout.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object alpha(int i4) {
        Object obj;
        as asVar = this.delta;
        int i5 = i4 - asVar.alpha;
        if (i5 >= 0) {
            Object[] objArr = (Object[]) asVar.charlie;
            if (i5 < objArr.length) {
                obj = objArr[i5];
                if (obj != null) {
                    return this.bravo.lima(i4);
                }
                return obj;
            }
        }
        obj = null;
        if (obj != null) {
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.w
    public final Object bravo(int i4) {
        return this.bravo.juliet(i4);
    }

    @Override // androidx.compose.foundation.lazy.layout.w
    public final int charlie(Object obj) {
        return this.delta.charlie(obj);
    }

    @Override // androidx.compose.foundation.lazy.layout.w
    public final void delta(int i4, Object obj, InterfaceC0581m interfaceC0581m, int i5) {
        int i10;
        int i11;
        int i12;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-462424778);
        if (c0585q.echo(i4)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i10 | i5;
        if (c0585q.india(obj)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i14 = i13 | i11;
        if (c0585q.golf(this)) {
            i12 = Barcode.FORMAT_QR_CODE;
        } else {
            i12 = 128;
        }
        int i15 = i14 | i12;
        if ((i15 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i15 & 1, z2)) {
            androidx.compose.foundation.lazy.layout.j.bravo(obj, i4, this.alpha.romeo, P.e.echo(-824725566, new C1861j(this, i4, 0), c0585q), c0585q, ((i15 >> 3) & 14) | 3072 | ((i15 << 3) & 112));
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new aa(this, i4, obj, i5, 19);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1862k)) {
            return false;
        }
        return Intrinsics.areEqual(this.bravo, ((C1862k) obj).bravo);
    }

    @Override // androidx.compose.foundation.lazy.layout.w
    public final int getItemCount() {
        return this.bravo.kilo().alpha;
    }

    public final int hashCode() {
        return this.bravo.hashCode();
    }
}
