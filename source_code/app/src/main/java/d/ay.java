package d;

/* loaded from: classes3.dex */
public final class ay {
    public final long alpha;
    public final long bravo;
    public final boolean charlie;

    public ay(long j5, long j6, boolean z2) {
        this.alpha = j5;
        this.bravo = j6;
        this.charlie = z2;
    }

    public final ay alpha(ay ayVar) {
        return new ay(Z.b.golf(this.alpha, ayVar.alpha), Math.max(this.bravo, ayVar.bravo), this.charlie);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ay) {
                ay ayVar = (ay) obj;
                if (!Z.b.bravo(this.alpha, ayVar.alpha) || this.bravo != ayVar.bravo || this.charlie != ayVar.charlie) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int echo = Z.b.echo(this.alpha) * 31;
        long j5 = this.bravo;
        int i5 = (echo + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        if (this.charlie) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return i5 + i4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MouseWheelScrollDelta(value=");
        sb2.append((Object) Z.b.india(this.alpha));
        sb2.append(", timeMillis=");
        sb2.append(this.bravo);
        sb2.append(", shouldApplyImmediately=");
        return androidx.appcompat.widget.P0.gray(sb2, this.charlie, ')');
    }
}
