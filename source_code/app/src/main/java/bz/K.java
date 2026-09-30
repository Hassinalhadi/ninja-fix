package bz;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class K implements i0 {
    public final i0 alpha;
    public final long purple;

    public K(i0 i0Var, long j5) {
        this.alpha = i0Var;
        this.purple = j5;
    }

    @Override // bz.i0
    public final boolean alpha() {
        return this.alpha.alpha();
    }

    @Override // bz.i0
    public final long amber(r rVar, r rVar2, r rVar3) {
        return this.alpha.amber(rVar, rVar2, rVar3) + this.purple;
    }

    @Override // bz.i0
    public final r delta(r rVar, r rVar2, r rVar3) {
        return gray(amber(rVar, rVar2, rVar3), rVar, rVar2, rVar3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof K)) {
            return false;
        }
        K k6 = (K) obj;
        if (k6.purple != this.purple || !Intrinsics.areEqual(k6.alpha, this.alpha)) {
            return false;
        }
        return true;
    }

    @Override // bz.i0
    public final r foxtrot(long j5, r rVar, r rVar2, r rVar3) {
        long j6 = this.purple;
        if (j5 < j6) {
            return rVar;
        }
        return this.alpha.foxtrot(j5 - j6, rVar, rVar2, rVar3);
    }

    @Override // bz.i0
    public final r gray(long j5, r rVar, r rVar2, r rVar3) {
        long j6 = this.purple;
        if (j5 < j6) {
            return rVar3;
        }
        return this.alpha.gray(j5 - j6, rVar, rVar2, rVar3);
    }

    public final int hashCode() {
        int hashCode = this.alpha.hashCode() * 31;
        long j5 = this.purple;
        return hashCode + ((int) (j5 ^ (j5 >>> 32)));
    }
}
