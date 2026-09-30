package E5;

import B9.C0058p;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class h {
    public final String alpha;
    public final Integer bravo;
    public final l charlie;
    public final long delta;
    public final long echo;
    public final HashMap foxtrot;
    public final Integer golf;
    public final String hotel;
    public final byte[] india;
    public final byte[] juliet;

    public h(String str, Integer num, l lVar, long j5, long j6, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.alpha = str;
        this.bravo = num;
        this.charlie = lVar;
        this.delta = j5;
        this.echo = j6;
        this.foxtrot = hashMap;
        this.golf = num2;
        this.hotel = str2;
        this.india = bArr;
        this.juliet = bArr2;
    }

    public final String alpha(String str) {
        String str2 = (String) this.foxtrot.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int bravo(String str) {
        String str2 = (String) this.foxtrot.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final C0058p charlie() {
        C0058p c0058p = new C0058p();
        String str = this.alpha;
        if (str != null) {
            c0058p.bravo = str;
            c0058p.charlie = this.bravo;
            c0058p.hotel = this.golf;
            c0058p.india = this.hotel;
            c0058p.juliet = this.india;
            c0058p.kilo = this.juliet;
            l lVar = this.charlie;
            if (lVar != null) {
                c0058p.echo = lVar;
                c0058p.foxtrot = Long.valueOf(this.delta);
                c0058p.golf = Long.valueOf(this.echo);
                c0058p.delta = new HashMap(this.foxtrot);
                return c0058p;
            }
            throw new NullPointerException("Null encodedPayload");
        }
        throw new NullPointerException("Null transportName");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (this.alpha.equals(hVar.alpha)) {
                    Integer num = hVar.bravo;
                    Integer num2 = this.bravo;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    if (this.charlie.equals(hVar.charlie) && this.delta == hVar.delta && this.echo == hVar.echo && this.foxtrot.equals(hVar.foxtrot)) {
                        Integer num3 = hVar.golf;
                        Integer num4 = this.golf;
                        if (num4 == null) {
                            if (num3 != null) {
                                return false;
                            }
                        } else if (!num4.equals(num3)) {
                            return false;
                        }
                        String str = hVar.hotel;
                        String str2 = this.hotel;
                        if (str2 == null) {
                            if (str != null) {
                                return false;
                            }
                        } else if (!str2.equals(str)) {
                            return false;
                        }
                        if (Arrays.equals(this.india, hVar.india) && Arrays.equals(this.juliet, hVar.juliet)) {
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
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.alpha.hashCode() ^ 1000003) * 1000003;
        int i4 = 0;
        Integer num = this.bravo;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode4 = (((hashCode3 ^ hashCode) * 1000003) ^ this.charlie.hashCode()) * 1000003;
        long j5 = this.delta;
        int i5 = (hashCode4 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        long j6 = this.echo;
        int hashCode5 = (((i5 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.foxtrot.hashCode()) * 1000003;
        Integer num2 = this.golf;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i10 = (hashCode5 ^ hashCode2) * 1000003;
        String str = this.hotel;
        if (str != null) {
            i4 = str.hashCode();
        }
        return ((((i10 ^ i4) * 1000003) ^ Arrays.hashCode(this.india)) * 1000003) ^ Arrays.hashCode(this.juliet);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.alpha + ", code=" + this.bravo + ", encodedPayload=" + this.charlie + ", eventMillis=" + this.delta + ", uptimeMillis=" + this.echo + ", autoMetadata=" + this.foxtrot + ", productId=" + this.golf + ", pseudonymousId=" + this.hotel + ", experimentIdsClear=" + Arrays.toString(this.india) + ", experimentIdsEncrypted=" + Arrays.toString(this.juliet) + "}";
    }
}
