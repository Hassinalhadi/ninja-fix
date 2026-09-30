package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2332h;

/* loaded from: classes2.dex */
public abstract class i implements ap {
    public int alpha;
    public final ff.d bravo;

    public i(ff.o storageManager) {
        Intrinsics.echo(storageManager, "storageManager");
        this.bravo = new ff.d((ff.l) storageManager, new je.ab(6, this), g.alpha, new h(this, 2));
    }

    public abstract Collection bravo();

    public abstract y charlie();

    public List delta() {
        return CollectionsKt.emptyList();
    }

    public abstract pe.ao echo();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ap) && obj.hashCode() == hashCode()) {
            ap apVar = (ap) obj;
            if (apVar.getParameters().size() == getParameters().size()) {
                InterfaceC2332h kilo = kilo();
                InterfaceC2332h kilo2 = apVar.kilo();
                if (kilo2 == null || hf.i.foxtrot(kilo) || Qe.e.oscar(kilo) || hf.i.foxtrot(kilo2) || Qe.e.oscar(kilo2)) {
                    return false;
                }
                return golf(kilo2);
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    /* renamed from: foxtrot, reason: merged with bridge method [inline-methods] */
    public final List lima() {
        return ((f) this.bravo.invoke()).bravo;
    }

    public abstract boolean golf(InterfaceC2332h interfaceC2332h);

    public final int hashCode() {
        int identityHashCode;
        int i4 = this.alpha;
        if (i4 != 0) {
            return i4;
        }
        InterfaceC2332h kilo = kilo();
        if (!hf.i.foxtrot(kilo) && !Qe.e.oscar(kilo)) {
            identityHashCode = Qe.e.golf(kilo).alpha.hashCode();
        } else {
            identityHashCode = System.identityHashCode(this);
        }
        this.alpha = identityHashCode;
        return identityHashCode;
    }

    public List hotel(List supertypes) {
        Intrinsics.echo(supertypes, "supertypes");
        return supertypes;
    }

    public void india(y type) {
        Intrinsics.echo(type, "type");
    }
}
