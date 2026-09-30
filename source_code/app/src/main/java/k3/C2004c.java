package k3;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: k3.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2004c extends f {
    public final Long alpha;
    public final String bravo;
    public final Boolean charlie;

    public C2004c(Long l10, String str, Boolean bool) {
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
        return null;
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
            if (obj instanceof C2004c) {
                C2004c c2004c = (C2004c) obj;
                c2004c.getClass();
                if (Intrinsics.areEqual(null, null) && Intrinsics.areEqual(this.alpha, c2004c.alpha) && Intrinsics.areEqual(this.bravo, c2004c.bravo)) {
                    Boolean bool = Boolean.TRUE;
                    if (!Intrinsics.areEqual(bool, bool) || !Intrinsics.areEqual(this.charlie, c2004c.charlie)) {
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
        int hashCode2 = this.alpha.hashCode() * 31;
        String str = this.bravo;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.charlie.hashCode() + ((Boolean.TRUE.hashCode() + ((hashCode2 + hashCode) * 31)) * 31);
    }

    public final String toString() {
        return "Sent(reason=null, lastLocationAgeMs=" + this.alpha + ", stompState=" + this.bravo + ", topicPresent=" + Boolean.TRUE + ", freshFix=" + this.charlie + ")";
    }
}
