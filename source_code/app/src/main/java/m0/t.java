package m0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t {
    public final long alpha;
    public final long bravo;
    public final long charlie;
    public final long delta;
    public final boolean echo;
    public final float foxtrot;
    public final int golf;
    public final boolean hotel;
    public final ArrayList india;
    public final long juliet;
    public final long kilo;

    public t(long j5, long j6, long j7, long j10, boolean z2, float f5, int i4, boolean z10, ArrayList arrayList, long j11, long j12) {
        this.alpha = j5;
        this.bravo = j6;
        this.charlie = j7;
        this.delta = j10;
        this.echo = z2;
        this.foxtrot = f5;
        this.golf = i4;
        this.hotel = z10;
        this.india = arrayList;
        this.juliet = j11;
        this.kilo = j12;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t) {
                t tVar = (t) obj;
                if (q.delta(this.alpha, tVar.alpha) && this.bravo == tVar.bravo && Z.b.bravo(this.charlie, tVar.charlie) && Z.b.bravo(this.delta, tVar.delta) && this.echo == tVar.echo && Float.compare(this.foxtrot, tVar.foxtrot) == 0 && this.golf == tVar.golf && this.hotel == tVar.hotel && Intrinsics.areEqual(this.india, tVar.india) && Z.b.bravo(this.juliet, tVar.juliet) && Z.b.bravo(this.kilo, tVar.kilo)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        long j5 = this.alpha;
        long j6 = this.bravo;
        int echo = (Z.b.echo(this.delta) + ((Z.b.echo(this.charlie) + (((((int) (j5 ^ (j5 >>> 32))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31)) * 31)) * 31;
        int i5 = 1237;
        if (this.echo) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int sierra = (ao.ad.sierra(this.foxtrot, (echo + i4) * 31, 31) + this.golf) * 31;
        if (this.hotel) {
            i5 = 1231;
        }
        return Z.b.echo(this.kilo) + ((Z.b.echo(this.juliet) + ((this.india.hashCode() + ((sierra + i5) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PointerInputEventData(id=");
        sb2.append((Object) ("PointerId(value=" + this.alpha + ')'));
        sb2.append(", uptime=");
        sb2.append(this.bravo);
        sb2.append(", positionOnScreen=");
        sb2.append((Object) Z.b.india(this.charlie));
        sb2.append(", position=");
        sb2.append((Object) Z.b.india(this.delta));
        sb2.append(", down=");
        sb2.append(this.echo);
        sb2.append(", pressure=");
        sb2.append(this.foxtrot);
        sb2.append(", type=");
        int i4 = this.golf;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        str = "Unknown";
                    } else {
                        str = "Eraser";
                    }
                } else {
                    str = "Stylus";
                }
            } else {
                str = "Mouse";
            }
        } else {
            str = "Touch";
        }
        sb2.append((Object) str);
        sb2.append(", activeHover=");
        sb2.append(this.hotel);
        sb2.append(", historical=");
        sb2.append(this.india);
        sb2.append(", scrollDelta=");
        sb2.append((Object) Z.b.india(this.juliet));
        sb2.append(", originalEventPosition=");
        sb2.append((Object) Z.b.india(this.kilo));
        sb2.append(')');
        return sb2.toString();
    }
}
