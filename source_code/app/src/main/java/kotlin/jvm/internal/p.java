package kotlin.jvm.internal;

import ge.InterfaceC1771c;

/* loaded from: classes2.dex */
public abstract class p extends c implements ge.v {
    public final boolean alpha;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, r8);
        boolean z2;
        if ((i4 & 1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.alpha = (i4 & 2) == 2;
    }

    @Override // kotlin.jvm.internal.c
    public final InterfaceC1771c compute() {
        if (this.alpha) {
            return this;
        }
        return super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof p) {
                p pVar = (p) obj;
                if (getOwner().equals(pVar.getOwner()) && getName().equals(pVar.getName()) && getSignature().equals(pVar.getSignature()) && Intrinsics.areEqual(getBoundReceiver(), pVar.getBoundReceiver())) {
                    return true;
                }
                return false;
            }
            if (obj instanceof ge.v) {
                return obj.equals(compute());
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.jvm.internal.c
    /* renamed from: oscar, reason: merged with bridge method [inline-methods] */
    public final ge.v getReflected() {
        if (!this.alpha) {
            InterfaceC1771c compute = compute();
            if (compute != this) {
                return (ge.v) compute;
            }
            throw new Wd.a();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }

    public final String toString() {
        InterfaceC1771c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
