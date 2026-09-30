package androidx.compose.foundation.lazy.layout;

import fe.C1715g;
import g.AbstractC1719b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class as {
    public int alpha;
    public final Object bravo;
    public Object charlie;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cb, code lost:
    
        if (r9 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public as(C1715g c1715g, j jVar) {
        Object defaultLazyKey;
        as kilo = jVar.kilo();
        int i4 = c1715g.alpha;
        if (i4 < 0) {
            AbstractC1719b.charlie("negative nearestRange.first");
        }
        int min = Math.min(c1715g.purple, kilo.alpha - 1);
        if (min < i4) {
            bv.ag agVar = bv.aq.alpha;
            Intrinsics.charlie(agVar, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
            this.bravo = agVar;
            this.charlie = new Object[0];
            this.alpha = 0;
            return;
        }
        int i5 = (min - i4) + 1;
        this.charlie = new Object[i5];
        this.alpha = i4;
        bv.ag agVar2 = new bv.ag(i5);
        if (i4 < 0 || i4 >= kilo.alpha) {
            StringBuilder sierra = Q0.c.sierra(i4, "Index ", ", size ");
            sierra.append(kilo.alpha);
            AbstractC1719b.echo(sierra.toString());
        }
        if (min < 0 || min >= kilo.alpha) {
            StringBuilder sierra2 = Q0.c.sierra(min, "Index ", ", size ");
            sierra2.append(kilo.alpha);
            AbstractC1719b.echo(sierra2.toString());
        }
        if (min < i4) {
            AbstractC1719b.alpha("toIndex (" + min + ") should be not smaller than fromIndex (" + i4 + ')');
        }
        J.e eVar = (J.e) kilo.bravo;
        int echo = j.echo(i4, eVar);
        int i10 = ((g) eVar.alpha[echo]).alpha;
        while (i10 <= min) {
            g gVar = (g) eVar.alpha[echo];
            Function1 key = gVar.charlie.getKey();
            int i11 = gVar.alpha;
            int max = Math.max(i4, i11);
            int min2 = Math.min(min, (gVar.bravo + i11) - 1);
            if (max <= min2) {
                while (true) {
                    if (key != null) {
                        defaultLazyKey = key.invoke(Integer.valueOf(max - i11));
                    }
                    defaultLazyKey = new DefaultLazyKey(max);
                    agVar2.hotel(max, defaultLazyKey);
                    ((Object[]) this.charlie)[max - this.alpha] = defaultLazyKey;
                    max = max != min2 ? max + 1 : max;
                }
            }
            i10 += gVar.bravo;
            echo++;
        }
        this.bravo = agVar2;
    }

    public void alpha(int i4, p pVar) {
        if (i4 < 0) {
            AbstractC1719b.alpha("size should be >=0");
        }
        if (i4 == 0) {
            return;
        }
        g gVar = new g(this.alpha, i4, pVar);
        this.alpha += i4;
        ((J.e) this.bravo).bravo(gVar);
    }

    public g bravo(int i4) {
        if (i4 < 0 || i4 >= this.alpha) {
            StringBuilder sierra = Q0.c.sierra(i4, "Index ", ", size ");
            sierra.append(this.alpha);
            AbstractC1719b.echo(sierra.toString());
        }
        g gVar = (g) this.charlie;
        if (gVar != null) {
            int i5 = gVar.alpha;
            if (i4 < gVar.bravo + i5 && i5 <= i4) {
                return gVar;
            }
        }
        J.e eVar = (J.e) this.bravo;
        g gVar2 = (g) eVar.alpha[j.echo(i4, eVar)];
        this.charlie = gVar2;
        return gVar2;
    }

    public int charlie(Object obj) {
        bv.ag agVar = (bv.ag) this.bravo;
        int delta = agVar.delta(obj);
        if (delta >= 0) {
            return agVar.charlie[delta];
        }
        return -1;
    }

    public as() {
        this.bravo = new J.e(new g[16]);
    }
}
