package oe;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: oe.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2232c {
    public final Ne.b alpha;
    public final Ne.b bravo;
    public final Ne.b charlie;

    public C2232c(Ne.b bVar, Ne.b bVar2, Ne.b bVar3) {
        this.alpha = bVar;
        this.bravo = bVar2;
        this.charlie = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2232c)) {
            return false;
        }
        C2232c c2232c = (C2232c) obj;
        if (Intrinsics.areEqual(this.alpha, c2232c.alpha) && Intrinsics.areEqual(this.bravo, c2232c.bravo) && Intrinsics.areEqual(this.charlie, c2232c.charlie)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.charlie.hashCode() + ((this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.alpha + ", kotlinReadOnly=" + this.bravo + ", kotlinMutable=" + this.charlie + ')';
    }
}
