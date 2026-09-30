package F8;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.L;
import bz.k0;
import i6.InterfaceC1892a;

/* loaded from: classes2.dex */
public final class q implements k0, InterfaceC1892a {
    public int alpha;

    public q() {
        this.alpha = 3;
    }

    @Override // bz.i0
    public /* synthetic */ boolean alpha() {
        return false;
    }

    @Override // bz.i0
    public long amber(bz.r rVar, bz.r rVar2, bz.r rVar3) {
        return jade() * 1000000;
    }

    @Override // i6.InterfaceC1892a
    public int bravo(Context context, String str, boolean z2) {
        return 0;
    }

    @Override // i6.InterfaceC1892a
    public int charlie(Context context, String str) {
        return this.alpha;
    }

    @Override // bz.i0
    public bz.r delta(bz.r rVar, bz.r rVar2, bz.r rVar3) {
        return rVar3;
    }

    @Override // bz.i0
    public bz.r foxtrot(long j5, bz.r rVar, bz.r rVar2, bz.r rVar3) {
        if (j5 < this.alpha * 1000000) {
            return rVar;
        }
        return rVar2;
    }

    @Override // bz.i0
    public bz.r gray(long j5, bz.r rVar, bz.r rVar2, bz.r rVar3) {
        return rVar3;
    }

    @Override // bz.k0
    public int jade() {
        return this.alpha;
    }

    @Override // bz.k0
    public int lavender() {
        return 0;
    }

    public /* synthetic */ q(int i4) {
        this.alpha = i4;
    }

    public q(L l10) {
        if (l10 instanceof GridLayoutManager) {
            this.alpha = ((GridLayoutManager) l10).bronze;
        } else {
            this.alpha = 1;
        }
    }
}
