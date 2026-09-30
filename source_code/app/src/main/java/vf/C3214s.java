package vf;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: vf.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3214s {
    public final Object alpha;
    public final InterfaceC3205i bravo;
    public final Xd.m charlie;
    public final Object delta;
    public final Throwable echo;

    public C3214s(Object obj, InterfaceC3205i interfaceC3205i, Xd.m mVar, Object obj2, Throwable th) {
        this.alpha = obj;
        this.bravo = interfaceC3205i;
        this.charlie = mVar;
        this.delta = obj2;
        this.echo = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C3214s alpha(C3214s c3214s, InterfaceC3205i interfaceC3205i, CancellationException cancellationException, int i4) {
        Object obj = c3214s.alpha;
        if ((i4 & 2) != 0) {
            interfaceC3205i = c3214s.bravo;
        }
        InterfaceC3205i interfaceC3205i2 = interfaceC3205i;
        Xd.m mVar = c3214s.charlie;
        Object obj2 = c3214s.delta;
        CancellationException cancellationException2 = cancellationException;
        if ((i4 & 16) != 0) {
            cancellationException2 = c3214s.echo;
        }
        c3214s.getClass();
        return new C3214s(obj, interfaceC3205i2, mVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3214s)) {
            return false;
        }
        C3214s c3214s = (C3214s) obj;
        if (Intrinsics.areEqual(this.alpha, c3214s.alpha) && Intrinsics.areEqual(this.bravo, c3214s.bravo) && Intrinsics.areEqual(this.charlie, c3214s.charlie) && Intrinsics.areEqual(this.delta, c3214s.delta) && Intrinsics.areEqual(this.echo, c3214s.echo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i4 = 0;
        Object obj = this.alpha;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i5 = hashCode * 31;
        InterfaceC3205i interfaceC3205i = this.bravo;
        if (interfaceC3205i == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = interfaceC3205i.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        Xd.m mVar = this.charlie;
        if (mVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = mVar.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Object obj2 = this.delta;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Throwable th = this.echo;
        if (th != null) {
            i4 = th.hashCode();
        }
        return i12 + i4;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.alpha + ", cancelHandler=" + this.bravo + ", onCancellation=" + this.charlie + ", idempotentResume=" + this.delta + ", cancelCause=" + this.echo + ')';
    }

    public /* synthetic */ C3214s(Object obj, InterfaceC3205i interfaceC3205i, Xd.m mVar, CancellationException cancellationException, int i4) {
        this(obj, (i4 & 2) != 0 ? null : interfaceC3205i, (i4 & 4) != 0 ? null : mVar, (Object) null, (i4 & 16) != 0 ? null : cancellationException);
    }
}
