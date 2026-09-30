package R7;

import androidx.appcompat.widget.P0;
import java.util.List;

/* loaded from: classes2.dex */
public final class aj extends n0 {
    public final String alpha;
    public final String bravo;
    public final String charlie;
    public final long delta;
    public final Long echo;
    public final boolean foxtrot;
    public final ak golf;
    public final J hotel;
    public final I india;
    public final an juliet;
    public final List kilo;
    public final int lima;

    public aj(String str, String str2, String str3, long j5, Long l10, boolean z2, ak akVar, J j6, I i4, an anVar, List list, int i5) {
        this.alpha = str;
        this.bravo = str2;
        this.charlie = str3;
        this.delta = j5;
        this.echo = l10;
        this.foxtrot = z2;
        this.golf = akVar;
        this.hotel = j6;
        this.india = i4;
        this.juliet = anVar;
        this.kilo = list;
        this.lima = i5;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, R7.ai] */
    public final ai alpha() {
        ?? obj = new Object();
        obj.alpha = this.alpha;
        obj.bravo = this.bravo;
        obj.charlie = this.charlie;
        obj.delta = this.delta;
        obj.echo = this.echo;
        obj.foxtrot = this.foxtrot;
        obj.golf = this.golf;
        obj.hotel = this.hotel;
        obj.india = this.india;
        obj.juliet = this.juliet;
        obj.kilo = this.kilo;
        obj.lima = this.lima;
        obj.mike = (byte) 7;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof n0) {
                aj ajVar = (aj) ((n0) obj);
                if (this.alpha.equals(ajVar.alpha)) {
                    if (this.bravo.equals(ajVar.bravo)) {
                        String str = ajVar.charlie;
                        String str2 = this.charlie;
                        if (str2 == null) {
                            if (str != null) {
                                return false;
                            }
                        } else if (!str2.equals(str)) {
                            return false;
                        }
                        if (this.delta == ajVar.delta) {
                            Long l10 = ajVar.echo;
                            Long l11 = this.echo;
                            if (l11 == null) {
                                if (l10 != null) {
                                    return false;
                                }
                            } else if (!l11.equals(l10)) {
                                return false;
                            }
                            if (this.foxtrot == ajVar.foxtrot && this.golf.equals(ajVar.golf)) {
                                J j5 = ajVar.hotel;
                                J j6 = this.hotel;
                                if (j6 == null) {
                                    if (j5 != null) {
                                        return false;
                                    }
                                } else if (!j6.equals(j5)) {
                                    return false;
                                }
                                I i4 = ajVar.india;
                                I i5 = this.india;
                                if (i5 == null) {
                                    if (i4 != null) {
                                        return false;
                                    }
                                } else if (!i5.equals(i4)) {
                                    return false;
                                }
                                an anVar = ajVar.juliet;
                                an anVar2 = this.juliet;
                                if (anVar2 == null) {
                                    if (anVar != null) {
                                        return false;
                                    }
                                } else if (!anVar2.equals(anVar)) {
                                    return false;
                                }
                                List list = ajVar.kilo;
                                List list2 = this.kilo;
                                if (list2 == null) {
                                    if (list != null) {
                                        return false;
                                    }
                                } else if (!list2.equals(list)) {
                                    return false;
                                }
                                if (this.lima == ajVar.lima) {
                                    return true;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i4;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo.hashCode()) * 1000003;
        int i5 = 0;
        String str = this.charlie;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode6 ^ hashCode) * 1000003;
        long j5 = this.delta;
        int i11 = (i10 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        Long l10 = this.echo;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        if (this.foxtrot) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int hashCode7 = (((i12 ^ i4) * 1000003) ^ this.golf.hashCode()) * 1000003;
        J j6 = this.hotel;
        if (j6 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = j6.hashCode();
        }
        int i13 = (hashCode7 ^ hashCode3) * 1000003;
        I i14 = this.india;
        if (i14 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = i14.hashCode();
        }
        int i15 = (i13 ^ hashCode4) * 1000003;
        an anVar = this.juliet;
        if (anVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = anVar.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.kilo;
        if (list != null) {
            i5 = list.hashCode();
        }
        return ((i16 ^ i5) * 1000003) ^ this.lima;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.alpha);
        sb2.append(", identifier=");
        sb2.append(this.bravo);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.charlie);
        sb2.append(", startedAt=");
        sb2.append(this.delta);
        sb2.append(", endedAt=");
        sb2.append(this.echo);
        sb2.append(", crashed=");
        sb2.append(this.foxtrot);
        sb2.append(", app=");
        sb2.append(this.golf);
        sb2.append(", user=");
        sb2.append(this.hotel);
        sb2.append(", os=");
        sb2.append(this.india);
        sb2.append(", device=");
        sb2.append(this.juliet);
        sb2.append(", events=");
        sb2.append(this.kilo);
        sb2.append(", generatorType=");
        return P0.cyan(sb2, this.lima, "}");
    }
}
