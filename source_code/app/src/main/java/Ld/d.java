package Ld;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d extends f implements Iterator, Yd.a {
    public final /* synthetic */ int teal;

    public d(g map, int i4) {
        this.teal = i4;
        Intrinsics.echo(map, "map");
        this.silver = map;
        this.purple = -1;
        this.red = map.f1832a;
        echo();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.teal) {
            case 0:
                bravo();
                int i4 = this.alpha;
                g gVar = (g) this.silver;
                if (i4 < gVar.white) {
                    this.alpha = i4 + 1;
                    this.purple = i4;
                    e eVar = new e(gVar, i4);
                    echo();
                    return eVar;
                }
                throw new NoSuchElementException();
            case 1:
                bravo();
                int i5 = this.alpha;
                g gVar2 = (g) this.silver;
                if (i5 < gVar2.white) {
                    this.alpha = i5 + 1;
                    this.purple = i5;
                    Object obj = gVar2.alpha[i5];
                    echo();
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                bravo();
                int i10 = this.alpha;
                g gVar3 = (g) this.silver;
                if (i10 < gVar3.white) {
                    this.alpha = i10 + 1;
                    this.purple = i10;
                    Object[] objArr = gVar3.purple;
                    Intrinsics.checkNotNull(objArr);
                    Object obj2 = objArr[this.purple];
                    echo();
                    return obj2;
                }
                throw new NoSuchElementException();
        }
    }
}
