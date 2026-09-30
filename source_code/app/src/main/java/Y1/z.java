package Y1;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z implements Comparable {
    public final aa alpha;
    public final Bundle purple;
    public final boolean red;
    public final int silver;
    public final boolean teal;
    public final int white;

    public z(aa destination, Bundle bundle, boolean z2, int i4, boolean z10, int i5) {
        Intrinsics.echo(destination, "destination");
        this.alpha = destination;
        this.purple = bundle;
        this.red = z2;
        this.silver = i4;
        this.teal = z10;
        this.white = i5;
    }

    @Override // java.lang.Comparable
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public final int compareTo(z other) {
        Intrinsics.echo(other, "other");
        boolean z2 = other.red;
        boolean z10 = this.red;
        if (z10 && !z2) {
            return 1;
        }
        if (!z10 && z2) {
            return -1;
        }
        int i4 = this.silver - other.silver;
        if (i4 > 0) {
            return 1;
        }
        if (i4 < 0) {
            return -1;
        }
        Bundle source = other.purple;
        Bundle source2 = this.purple;
        if (source2 != null && source == null) {
            return 1;
        }
        if (source2 == null && source != null) {
            return -1;
        }
        if (source2 != null) {
            Intrinsics.echo(source2, "source");
            int size = source2.size();
            Intrinsics.checkNotNull(source);
            Intrinsics.echo(source, "source");
            int size2 = size - source.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z11 = other.teal;
        boolean z12 = this.teal;
        if (z12 && !z11) {
            return 1;
        }
        if (!z12 && z11) {
            return -1;
        }
        return this.white - other.white;
    }
}
