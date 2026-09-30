package L5;

import androidx.appcompat.widget.P0;

/* loaded from: classes3.dex */
public final class a {
    public static final a foxtrot = new a(200, 10000, 81920, 10485760, 604800000);
    public final long alpha;
    public final int bravo;
    public final int charlie;
    public final long delta;
    public final int echo;

    public a(int i4, int i5, int i10, long j5, long j6) {
        this.alpha = j5;
        this.bravo = i4;
        this.charlie = i5;
        this.delta = j6;
        this.echo = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.alpha == aVar.alpha && this.bravo == aVar.bravo && this.charlie == aVar.charlie && this.delta == aVar.delta && this.echo == aVar.echo) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.alpha;
        int i4 = (((((((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003) ^ this.bravo) * 1000003) ^ this.charlie) * 1000003;
        long j6 = this.delta;
        return ((i4 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.echo;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.alpha);
        sb2.append(", loadBatchSize=");
        sb2.append(this.bravo);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.charlie);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.delta);
        sb2.append(", maxBlobByteSizePerRow=");
        return P0.cyan(sb2, this.echo, "}");
    }
}
