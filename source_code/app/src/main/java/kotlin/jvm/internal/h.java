package kotlin.jvm.internal;

import ge.InterfaceC1771c;
import ge.InterfaceC1775g;

/* loaded from: classes2.dex */
public abstract class h extends c implements g, InterfaceC1775g {
    private final int arity;
    private final int flags;

    public h(int i4) {
        this(i4, 0, null, c.NO_RECEIVER, null, null);
    }

    @Override // kotlin.jvm.internal.c
    public InterfaceC1771c computeReflected() {
        return u.alpha.alpha(this);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (getName().equals(hVar.getName()) && getSignature().equals(hVar.getSignature()) && this.flags == hVar.flags && this.arity == hVar.arity && Intrinsics.areEqual(getBoundReceiver(), hVar.getBoundReceiver()) && Intrinsics.areEqual(getOwner(), hVar.getOwner())) {
                    return true;
                }
                return false;
            }
            if (obj instanceof InterfaceC1775g) {
                return obj.equals(compute());
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.jvm.internal.g
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        int hashCode;
        if (getOwner() == null) {
            hashCode = 0;
        } else {
            hashCode = getOwner().hashCode() * 31;
        }
        return getSignature().hashCode() + ((getName().hashCode() + hashCode) * 31);
    }

    @Override // ge.InterfaceC1775g
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // ge.InterfaceC1775g
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // ge.InterfaceC1775g
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // ge.InterfaceC1775g
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // ge.InterfaceC1771c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC1771c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public h(int i4, Object obj) {
        this(i4, 0, null, obj, null, null);
    }

    @Override // kotlin.jvm.internal.c
    public InterfaceC1775g getReflected() {
        InterfaceC1771c compute = compute();
        if (compute != this) {
            return (InterfaceC1775g) compute;
        }
        throw new Wd.a();
    }

    public h(int i4, int i5, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i5 & 1) == 1);
        this.arity = i4;
        this.flags = 0;
    }
}
