package k3;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: k3.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2003b extends f {
    public final String alpha;
    public final Long bravo;
    public final String charlie;
    public final Boolean delta;
    public final Boolean echo;

    public C2003b(String str, Long l10, String str2, Boolean bool, Boolean bool2) {
        this.alpha = str;
        this.bravo = l10;
        this.charlie = str2;
        this.delta = bool;
        this.echo = bool2;
    }

    @Override // k3.f
    public final Boolean alpha() {
        return this.echo;
    }

    @Override // k3.f
    public final Long bravo() {
        return this.bravo;
    }

    @Override // k3.f
    public final String charlie() {
        return this.alpha;
    }

    @Override // k3.f
    public final String delta() {
        return this.charlie;
    }

    @Override // k3.f
    public final Boolean echo() {
        return this.delta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2003b)) {
            return false;
        }
        C2003b c2003b = (C2003b) obj;
        if (Intrinsics.areEqual(this.alpha, c2003b.alpha) && Intrinsics.areEqual(this.bravo, c2003b.bravo) && Intrinsics.areEqual(this.charlie, c2003b.charlie) && Intrinsics.areEqual(this.delta, c2003b.delta) && Intrinsics.areEqual(this.echo, c2003b.echo)) {
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
        String str = this.alpha;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        Long l10 = this.bravo;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        String str2 = this.charlie;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Boolean bool = this.delta;
        if (bool == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Boolean bool2 = this.echo;
        if (bool2 != null) {
            i4 = bool2.hashCode();
        }
        return i12 + i4;
    }

    public final String toString() {
        return "Failed(reason=" + this.alpha + ", lastLocationAgeMs=" + this.bravo + ", stompState=" + this.charlie + ", topicPresent=" + this.delta + ", freshFix=" + this.echo + ")";
    }

    public /* synthetic */ C2003b(String str, String str2, Boolean bool, int i4) {
        this(str, null, (i4 & 4) != 0 ? null : str2, (i4 & 8) != 0 ? null : bool, null);
    }
}
