package k3;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: k3.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2006e extends f {
    public final Long alpha;
    public final String bravo;
    public final Boolean charlie;

    public C2006e(Long l10, String str, Boolean bool) {
        this.alpha = l10;
        this.bravo = str;
        this.charlie = bool;
    }

    @Override // k3.f
    public final Boolean alpha() {
        return this.charlie;
    }

    @Override // k3.f
    public final Long bravo() {
        return this.alpha;
    }

    @Override // k3.f
    public final String charlie() {
        return "same_as_last";
    }

    @Override // k3.f
    public final String delta() {
        return this.bravo;
    }

    @Override // k3.f
    public final Boolean echo() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2006e) {
                C2006e c2006e = (C2006e) obj;
                c2006e.getClass();
                if (Intrinsics.areEqual("same_as_last", "same_as_last") && Intrinsics.areEqual(this.alpha, c2006e.alpha) && Intrinsics.areEqual(this.bravo, c2006e.bravo)) {
                    Boolean bool = Boolean.TRUE;
                    if (!Intrinsics.areEqual(bool, bool) || !Intrinsics.areEqual(this.charlie, c2006e.charlie)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.alpha.hashCode() + ((-1020219478) * 31)) * 31;
        String str = this.bravo;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.charlie.hashCode() + ((Boolean.TRUE.hashCode() + ((hashCode2 + hashCode) * 31)) * 31);
    }

    public final String toString() {
        return "SkippedSameAsLast(reason=same_as_last, lastLocationAgeMs=" + this.alpha + ", stompState=" + this.bravo + ", topicPresent=" + Boolean.TRUE + ", freshFix=" + this.charlie + ")";
    }
}
