package N8;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h {
    public final Boolean alpha;
    public final Double bravo;
    public final Integer charlie;
    public final Integer delta;
    public final Long echo;

    public h(Boolean bool, Double d4, Integer num, Integer num2, Long l10) {
        this.alpha = bool;
        this.bravo = d4;
        this.charlie = num;
        this.delta = num2;
        this.echo = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (Intrinsics.areEqual(this.alpha, hVar.alpha) && Intrinsics.areEqual(this.bravo, hVar.bravo) && Intrinsics.areEqual(this.charlie, hVar.charlie) && Intrinsics.areEqual(this.delta, hVar.delta) && Intrinsics.areEqual(this.echo, hVar.echo)) {
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
        Boolean bool = this.alpha;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i5 = hashCode * 31;
        Double d4 = this.bravo;
        if (d4 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d4.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        Integer num = this.charlie;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Integer num2 = this.delta;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Long l10 = this.echo;
        if (l10 != null) {
            i4 = l10.hashCode();
        }
        return i12 + i4;
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.alpha + ", sessionSamplingRate=" + this.bravo + ", sessionRestartTimeout=" + this.charlie + ", cacheDuration=" + this.delta + ", cacheUpdatedTime=" + this.echo + ')';
    }
}
