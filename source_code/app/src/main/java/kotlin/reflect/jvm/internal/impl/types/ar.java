package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ar {
    public final pe.aq alpha;
    public final De.a bravo;

    public ar(pe.aq typeParameter, De.a typeAttr) {
        Intrinsics.echo(typeParameter, "typeParameter");
        Intrinsics.echo(typeAttr, "typeAttr");
        this.alpha = typeParameter;
        this.bravo = typeAttr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ar)) {
            return false;
        }
        ar arVar = (ar) obj;
        if (!Intrinsics.areEqual(arVar.alpha, this.alpha) || !Intrinsics.areEqual(arVar.bravo, this.bravo)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.alpha.hashCode();
        return this.bravo.hashCode() + (hashCode * 31) + hashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.alpha + ", typeAttr=" + this.bravo + ')';
    }
}
