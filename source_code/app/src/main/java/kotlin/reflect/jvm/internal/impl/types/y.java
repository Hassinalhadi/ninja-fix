package kotlin.reflect.jvm.internal.impl.types;

import gf.C1791f;
import java.util.List;
import qe.InterfaceC2465a;
import qe.InterfaceC2472h;

/* loaded from: classes2.dex */
public abstract class y implements InterfaceC2465a, p000if.c {
    public int alpha;

    public abstract List cyan();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                if (indigo() == yVar.indigo()) {
                    if (c.tango(gf.m.alpha, ochre(), yVar.ochre())) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // qe.InterfaceC2465a
    public final InterfaceC2472h getAnnotations() {
        return k.alpha(gold());
    }

    public abstract al gold();

    public abstract ap green();

    public final int hashCode() {
        int hashCode;
        int i4 = this.alpha;
        if (i4 != 0) {
            return i4;
        }
        if (c.india(this)) {
            hashCode = super.hashCode();
        } else {
            hashCode = (indigo() ? 1 : 0) + ((cyan().hashCode() + (green().hashCode() * 31)) * 31);
        }
        this.alpha = hashCode;
        return hashCode;
    }

    public abstract boolean indigo();

    public abstract y ivory(C1791f c1791f);

    public abstract B ochre();

    public abstract Xe.n olive();
}
