package a0;

/* loaded from: classes3.dex */
public final class ar {
    public static final ar delta = new ar();
    public final long alpha;
    public final long bravo;
    public final float charlie;

    public ar(long j5, long j6, float f5) {
        this.alpha = j5;
        this.bravo = j6;
        this.charlie = f5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ar) {
                ar arVar = (ar) obj;
                if (C0366t.charlie(this.alpha, arVar.alpha) && Z.b.bravo(this.bravo, arVar.bravo) && this.charlie == arVar.charlie) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4 = C0366t.lima;
        return Float.floatToIntBits(this.charlie) + ((Z.b.echo(this.bravo) + (kotlin.p.alpha(this.alpha) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(color=");
        ao.ad.bronze(this.alpha, ", offset=", sb2);
        sb2.append((Object) Z.b.india(this.bravo));
        sb2.append(", blurRadius=");
        return ao.ad.azure(sb2, this.charlie, ')');
    }

    public /* synthetic */ ar() {
        this(ao.delta(4278190080L), 0L, 0.0f);
    }
}
