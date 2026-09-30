package D5;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class t extends af {
    public final long alpha;
    public final Integer bravo;
    public final o charlie;
    public final long delta;
    public final byte[] echo;
    public final String foxtrot;
    public final long golf;
    public final w hotel;
    public final p india;

    public t(long j5, Integer num, o oVar, long j6, byte[] bArr, String str, long j7, w wVar, p pVar) {
        this.alpha = j5;
        this.bravo = num;
        this.charlie = oVar;
        this.delta = j6;
        this.echo = bArr;
        this.foxtrot = str;
        this.golf = j7;
        this.hotel = wVar;
        this.india = pVar;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj != this) {
            if (obj instanceof af) {
                af afVar = (af) obj;
                t tVar = (t) afVar;
                if (this.alpha == tVar.alpha) {
                    Integer num = this.bravo;
                    if (num == null) {
                        if (tVar.bravo != null) {
                            return false;
                        }
                    } else if (!num.equals(tVar.bravo)) {
                        return false;
                    }
                    o oVar = this.charlie;
                    if (oVar == null) {
                        if (tVar.charlie != null) {
                            return false;
                        }
                    } else if (!oVar.equals(tVar.charlie)) {
                        return false;
                    }
                    if (this.delta == tVar.delta) {
                        if (afVar instanceof t) {
                            bArr = ((t) afVar).echo;
                        } else {
                            bArr = tVar.echo;
                        }
                        if (Arrays.equals(this.echo, bArr)) {
                            String str = tVar.foxtrot;
                            String str2 = this.foxtrot;
                            if (str2 == null) {
                                if (str != null) {
                                    return false;
                                }
                            } else if (!str2.equals(str)) {
                                return false;
                            }
                            if (this.golf == tVar.golf) {
                                w wVar = tVar.hotel;
                                w wVar2 = this.hotel;
                                if (wVar2 == null) {
                                    if (wVar != null) {
                                        return false;
                                    }
                                } else if (!wVar2.equals(wVar)) {
                                    return false;
                                }
                                p pVar = tVar.india;
                                p pVar2 = this.india;
                                if (pVar2 == null) {
                                    if (pVar == null) {
                                        return true;
                                    }
                                    return false;
                                }
                                if (pVar2.equals(pVar)) {
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
        int hashCode3;
        int hashCode4;
        long j5 = this.alpha;
        int i4 = (((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003;
        int i5 = 0;
        Integer num = this.bravo;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = (i4 ^ hashCode) * 1000003;
        o oVar = this.charlie;
        if (oVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = oVar.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        long j6 = this.delta;
        int hashCode5 = (((i11 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.echo)) * 1000003;
        String str = this.foxtrot;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i12 = (hashCode5 ^ hashCode3) * 1000003;
        long j7 = this.golf;
        int i13 = (i12 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        w wVar = this.hotel;
        if (wVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = wVar.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        p pVar = this.india;
        if (pVar != null) {
            i5 = pVar.hashCode();
        }
        return i14 ^ i5;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.alpha + ", eventCode=" + this.bravo + ", complianceData=" + this.charlie + ", eventUptimeMs=" + this.delta + ", sourceExtension=" + Arrays.toString(this.echo) + ", sourceExtensionJsonProto3=" + this.foxtrot + ", timezoneOffsetSeconds=" + this.golf + ", networkConnectionInfo=" + this.hotel + ", experimentIds=" + this.india + "}";
    }
}
