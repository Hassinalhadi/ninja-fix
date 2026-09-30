package D5;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class u extends ag {
    public final long alpha;
    public final long bravo;
    public final n charlie;
    public final Integer delta;
    public final String echo;
    public final ArrayList foxtrot;

    public u(long j5, long j6, n nVar, Integer num, String str, ArrayList arrayList) {
        ak akVar = ak.alpha;
        this.alpha = j5;
        this.bravo = j6;
        this.charlie = nVar;
        this.delta = num;
        this.echo = str;
        this.foxtrot = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ag) {
                u uVar = (u) ((ag) obj);
                if (this.alpha == uVar.alpha) {
                    if (this.bravo == uVar.bravo) {
                        if (this.charlie.equals(uVar.charlie)) {
                            Integer num = uVar.delta;
                            Integer num2 = this.delta;
                            if (num2 == null) {
                                if (num != null) {
                                    return false;
                                }
                            } else if (!num2.equals(num)) {
                                return false;
                            }
                            String str = uVar.echo;
                            String str2 = this.echo;
                            if (str2 == null) {
                                if (str != null) {
                                    return false;
                                }
                            } else if (!str2.equals(str)) {
                                return false;
                            }
                            if (this.foxtrot.equals(uVar.foxtrot)) {
                                Object obj2 = ak.alpha;
                                if (obj2.equals(obj2)) {
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
        long j5 = this.alpha;
        long j6 = this.bravo;
        int hashCode2 = (((((((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.charlie.hashCode()) * 1000003;
        int i4 = 0;
        Integer num = this.delta;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i5 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.echo;
        if (str != null) {
            i4 = str.hashCode();
        }
        return ((((i5 ^ i4) * 1000003) ^ this.foxtrot.hashCode()) * 1000003) ^ ak.alpha.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.alpha + ", requestUptimeMs=" + this.bravo + ", clientInfo=" + this.charlie + ", logSource=" + this.delta + ", logSourceName=" + this.echo + ", logEvents=" + this.foxtrot + ", qosTier=" + ak.alpha + "}";
    }
}
