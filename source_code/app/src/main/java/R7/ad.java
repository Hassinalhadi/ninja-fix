package R7;

import java.util.List;

/* loaded from: classes2.dex */
public final class ad extends P {
    public final int alpha;
    public final String bravo;
    public final int charlie;
    public final int delta;
    public final long echo;
    public final long foxtrot;
    public final long golf;
    public final String hotel;
    public final List india;

    public ad(int i4, String str, int i5, int i10, long j5, long j6, long j7, String str2, List list) {
        this.alpha = i4;
        this.bravo = str;
        this.charlie = i5;
        this.delta = i10;
        this.echo = j5;
        this.foxtrot = j6;
        this.golf = j7;
        this.hotel = str2;
        this.india = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof P) {
            P p4 = (P) obj;
            if (this.alpha == ((ad) p4).alpha) {
                ad adVar = (ad) p4;
                if (this.bravo.equals(adVar.bravo) && this.charlie == adVar.charlie && this.delta == adVar.delta && this.echo == adVar.echo && this.foxtrot == adVar.foxtrot && this.golf == adVar.golf) {
                    String str = adVar.hotel;
                    String str2 = this.hotel;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        List list = adVar.india;
                        List list2 = this.india;
                        if (list2 != null ? list2.equals(list) : list == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((((this.alpha ^ 1000003) * 1000003) ^ this.bravo.hashCode()) * 1000003) ^ this.charlie) * 1000003) ^ this.delta) * 1000003;
        long j5 = this.echo;
        int i4 = (hashCode2 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        long j6 = this.foxtrot;
        int i5 = (i4 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j7 = this.golf;
        int i10 = (i5 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        int i11 = 0;
        String str = this.hotel;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (i10 ^ hashCode) * 1000003;
        List list = this.india;
        if (list != null) {
            i11 = list.hashCode();
        }
        return i12 ^ i11;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.alpha + ", processName=" + this.bravo + ", reasonCode=" + this.charlie + ", importance=" + this.delta + ", pss=" + this.echo + ", rss=" + this.foxtrot + ", timestamp=" + this.golf + ", traceFile=" + this.hotel + ", buildIdMappingForArch=" + this.india + "}";
    }
}
