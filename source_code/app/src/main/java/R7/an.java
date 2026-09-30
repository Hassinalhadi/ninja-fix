package R7;

import androidx.appcompat.widget.P0;

/* loaded from: classes2.dex */
public final class an extends W {
    public final int alpha;
    public final String bravo;
    public final int charlie;
    public final long delta;
    public final long echo;
    public final boolean foxtrot;
    public final int golf;
    public final String hotel;
    public final String india;

    public an(int i4, String str, int i5, long j5, long j6, boolean z2, int i10, String str2, String str3) {
        this.alpha = i4;
        this.bravo = str;
        this.charlie = i5;
        this.delta = j5;
        this.echo = j6;
        this.foxtrot = z2;
        this.golf = i10;
        this.hotel = str2;
        this.india = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof W) {
            W w4 = (W) obj;
            if (this.alpha == ((an) w4).alpha) {
                an anVar = (an) w4;
                if (this.bravo.equals(anVar.bravo) && this.charlie == anVar.charlie && this.delta == anVar.delta && this.echo == anVar.echo && this.foxtrot == anVar.foxtrot && this.golf == anVar.golf && this.hotel.equals(anVar.hotel) && this.india.equals(anVar.india)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode = (((((this.alpha ^ 1000003) * 1000003) ^ this.bravo.hashCode()) * 1000003) ^ this.charlie) * 1000003;
        long j5 = this.delta;
        int i5 = (hashCode ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        long j6 = this.echo;
        int i10 = (i5 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        if (this.foxtrot) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return ((((((i10 ^ i4) * 1000003) ^ this.golf) * 1000003) ^ this.hotel.hashCode()) * 1000003) ^ this.india.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.alpha);
        sb2.append(", model=");
        sb2.append(this.bravo);
        sb2.append(", cores=");
        sb2.append(this.charlie);
        sb2.append(", ram=");
        sb2.append(this.delta);
        sb2.append(", diskSpace=");
        sb2.append(this.echo);
        sb2.append(", simulator=");
        sb2.append(this.foxtrot);
        sb2.append(", state=");
        sb2.append(this.golf);
        sb2.append(", manufacturer=");
        sb2.append(this.hotel);
        sb2.append(", modelClass=");
        return P0.gold(sb2, this.india, "}");
    }
}
