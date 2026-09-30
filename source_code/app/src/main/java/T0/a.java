package T0;

import android.view.View;
import android.view.ViewGroup;
import j1.C1929c;
import java.util.List;
import q0.AbstractC2375K;
import s0.C2563x;
import s1.I;
import s1.a0;
import s6.AbstractC2609a7;

/* loaded from: classes3.dex */
public final class a extends Pf.g {
    public final /* synthetic */ int red;
    public final /* synthetic */ ViewGroup silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ViewGroup viewGroup, int i4) {
        super(1);
        this.red = i4;
        this.silver = viewGroup;
    }

    @Override // Pf.g
    public final a0 foxtrot(a0 a0Var, List list) {
        switch (this.red) {
            case 0:
                return ((t) this.silver).foxtrot(a0Var);
            default:
                U0.s sVar = (U0.s) this.silver;
                if (!sVar.e) {
                    View childAt = sVar.getChildAt(0);
                    int max = Math.max(0, childAt.getLeft());
                    int max2 = Math.max(0, childAt.getTop());
                    int max3 = Math.max(0, sVar.getWidth() - childAt.getRight());
                    int max4 = Math.max(0, sVar.getHeight() - childAt.getBottom());
                    if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                        return a0Var.alpha.november(max, max2, max3, max4);
                    }
                    return a0Var;
                }
                return a0Var;
        }
    }

    @Override // Pf.g
    public final com.google.android.play.core.integrity.k golf(I i4, com.google.android.play.core.integrity.k kVar) {
        switch (this.red) {
            case 0:
                C2563x c2563x = (C2563x) ((t) this.silver).f2083r.f13305x.echo;
                if (c2563x.india()) {
                    long charlie = AbstractC2609a7.charlie(c2563x.gray(0L));
                    int i5 = (int) (charlie >> 32);
                    int i10 = 0;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    int i11 = (int) (charlie & 4294967295L);
                    if (i11 < 0) {
                        i11 = 0;
                    }
                    long kilo = AbstractC2375K.hotel(c2563x).kilo();
                    int i12 = (int) (kilo >> 32);
                    int i13 = (int) (kilo & 4294967295L);
                    long j5 = c2563x.red;
                    long charlie2 = AbstractC2609a7.charlie(c2563x.gray((Float.floatToRawIntBits((int) (j5 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j5 & 4294967295L)) & 4294967295L)));
                    int i14 = i12 - ((int) (charlie2 >> 32));
                    if (i14 < 0) {
                        i14 = 0;
                    }
                    int i15 = i13 - ((int) (4294967295L & charlie2));
                    if (i15 >= 0) {
                        i10 = i15;
                    }
                    if (i5 != 0 || i11 != 0 || i14 != 0 || i10 != 0) {
                        return new com.google.android.play.core.integrity.k(9, j.echo((C1929c) kVar.purple, i5, i11, i14, i10), j.echo((C1929c) kVar.red, i5, i11, i14, i10));
                    }
                    return kVar;
                }
                return kVar;
            default:
                U0.s sVar = (U0.s) this.silver;
                if (!sVar.e) {
                    View childAt = sVar.getChildAt(0);
                    int max = Math.max(0, childAt.getLeft());
                    int max2 = Math.max(0, childAt.getTop());
                    int max3 = Math.max(0, sVar.getWidth() - childAt.getRight());
                    int max4 = Math.max(0, sVar.getHeight() - childAt.getBottom());
                    if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                        C1929c bravo = C1929c.bravo(max, max2, max3, max4);
                        C1929c c1929c = (C1929c) kVar.purple;
                        int i16 = bravo.alpha;
                        int i17 = bravo.bravo;
                        int i18 = bravo.charlie;
                        int i19 = bravo.delta;
                        return new com.google.android.play.core.integrity.k(9, a0.echo(c1929c, i16, i17, i18, i19), a0.echo((C1929c) kVar.red, i16, i17, i18, i19));
                    }
                    return kVar;
                }
                return kVar;
        }
    }
}
