package qe;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pe.C2323af;
import pf.AbstractC2360j;
import pf.C2355e;
import s6.E7;

/* renamed from: qe.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2473i implements InterfaceC2472h {
    public final /* synthetic */ int alpha;
    public final Object purple;

    public C2473i(int i4, List delegates) {
        this.alpha = i4;
        switch (i4) {
            case 1:
                Intrinsics.echo(delegates, "delegates");
                this.purple = delegates;
                return;
            default:
                this.purple = delegates;
                return;
        }
    }

    @Override // qe.InterfaceC2472h
    public final boolean D(Ne.c fqName) {
        switch (this.alpha) {
            case 0:
                return E7.delta(this, fqName);
            case 1:
                Intrinsics.echo(fqName, "fqName");
                Iterator it = ((Iterable) CollectionsKt.beige((List) this.purple).bravo).iterator();
                while (it.hasNext()) {
                    if (((InterfaceC2472h) it.next()).D(fqName)) {
                        return true;
                    }
                }
                return false;
            default:
                return E7.delta(this, fqName);
        }
    }

    @Override // qe.InterfaceC2472h
    public final InterfaceC2466b gray(Ne.c fqName) {
        switch (this.alpha) {
            case 0:
                return E7.charlie(this, fqName);
            case 1:
                Intrinsics.echo(fqName, "fqName");
                return (InterfaceC2466b) AbstractC2360j.india(AbstractC2360j.papa(CollectionsKt.beige((List) this.purple), new C2323af(fqName, 1)));
            default:
                Intrinsics.echo(fqName, "fqName");
                if (Intrinsics.areEqual(fqName, (Ne.c) this.purple)) {
                    return Fe.b.alpha;
                }
                return null;
        }
    }

    @Override // qe.InterfaceC2472h
    public final boolean isEmpty() {
        boolean z2;
        switch (this.alpha) {
            case 0:
                return ((List) this.purple).isEmpty();
            case 1:
                List list = (List) this.purple;
                if (list != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((InterfaceC2472h) it.next()).isEmpty()) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.alpha) {
            case 0:
                return ((List) this.purple).iterator();
            case 1:
                return new C2355e(AbstractC2360j.juliet(CollectionsKt.beige((List) this.purple), C2476l.alpha));
            default:
                return CollectionsKt.emptyList().iterator();
        }
    }

    public String toString() {
        switch (this.alpha) {
            case 0:
                return ((List) this.purple).toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2473i(InterfaceC2472h[] interfaceC2472hArr) {
        this(1, ArraysKt.b(interfaceC2472hArr));
        this.alpha = 1;
    }

    public C2473i(Ne.c fqNameToMatch) {
        this.alpha = 2;
        Intrinsics.echo(fqNameToMatch, "fqNameToMatch");
        this.purple = fqNameToMatch;
    }
}
