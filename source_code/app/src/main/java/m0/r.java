package m0;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class r {
    public final long alpha;
    public final long bravo;
    public final long charlie;
    public final boolean delta;
    public final float echo;
    public final long foxtrot;
    public final long golf;
    public final boolean hotel;
    public final int india;
    public final long juliet;
    public final ArrayList kilo;
    public final long lima;
    public boolean mike;
    public boolean november;
    public r oscar;

    public r(long j5, long j6, long j7, boolean z2, float f5, long j10, long j11, boolean z10, boolean z11, int i4, long j12) {
        this.alpha = j5;
        this.bravo = j6;
        this.charlie = j7;
        this.delta = z2;
        this.echo = f5;
        this.foxtrot = j10;
        this.golf = j11;
        this.hotel = z10;
        this.india = i4;
        this.juliet = j12;
        this.lima = 0L;
        this.mike = z11;
        this.november = z11;
    }

    public final void alpha() {
        r rVar = this.oscar;
        if (rVar == null) {
            this.mike = true;
            this.november = true;
        } else if (rVar != null) {
            rVar.alpha();
        }
    }

    public final boolean bravo() {
        r rVar = this.oscar;
        if (rVar != null) {
            return rVar.bravo();
        }
        if (!this.mike && !this.november) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PointerInputChange(id=");
        sb2.append((Object) ("PointerId(value=" + this.alpha + ')'));
        sb2.append(", uptimeMillis=");
        sb2.append(this.bravo);
        sb2.append(", position=");
        sb2.append((Object) Z.b.india(this.charlie));
        sb2.append(", pressed=");
        sb2.append(this.delta);
        sb2.append(", pressure=");
        sb2.append(this.echo);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.foxtrot);
        sb2.append(", previousPosition=");
        sb2.append((Object) Z.b.india(this.golf));
        sb2.append(", previousPressed=");
        sb2.append(this.hotel);
        sb2.append(", isConsumed=");
        sb2.append(bravo());
        sb2.append(", type=");
        int i4 = this.india;
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
        sb2.append(", historical=");
        Object obj = this.kilo;
        if (obj == null) {
            obj = CollectionsKt.emptyList();
        }
        sb2.append(obj);
        sb2.append(",scrollDelta=");
        sb2.append((Object) Z.b.india(this.juliet));
        sb2.append(')');
        return sb2.toString();
    }

    public r(long j5, long j6, long j7, boolean z2, float f5, long j10, long j11, boolean z10, int i4, ArrayList arrayList, long j12, long j13) {
        this(j5, j6, j7, z2, f5, j10, j11, z10, false, i4, j12);
        this.kilo = arrayList;
        this.lima = j13;
    }
}
