package kotlin.jvm.internal;

import ge.InterfaceC1774f;
import java.io.Serializable;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public class a implements g, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel = false;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public a(int i4, int i5, Class cls, Object obj, String str, String str2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.arity = i4;
        this.flags = i5 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.isTopLevel == aVar.isTopLevel && this.arity == aVar.arity && this.flags == aVar.flags && Intrinsics.areEqual(this.receiver, aVar.receiver) && Intrinsics.areEqual(this.owner, aVar.owner) && this.name.equals(aVar.name) && this.signature.equals(aVar.signature)) {
            return true;
        }
        return false;
    }

    @Override // kotlin.jvm.internal.g
    public int getArity() {
        return this.arity;
    }

    public InterfaceC1774f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return u.alpha.charlie(cls, "");
        }
        return u.alpha.bravo(cls);
    }

    public int hashCode() {
        int i4;
        int i5;
        Object obj = this.receiver;
        int i10 = 0;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = i4 * 31;
        Class cls = this.owner;
        if (cls != null) {
            i10 = cls.hashCode();
        }
        int sierra = AbstractC2327c.sierra(AbstractC2327c.sierra((i11 + i10) * 31, 31, this.name), 31, this.signature);
        if (this.isTopLevel) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        return ((((sierra + i5) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return u.alpha.india(this);
    }
}
