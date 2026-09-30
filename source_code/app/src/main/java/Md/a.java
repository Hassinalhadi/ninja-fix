package Md;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a implements Comparator {
    public static final a purple = new a(0);
    public static final a red = new a(1);
    public final /* synthetic */ int alpha;

    public /* synthetic */ a(int i4) {
        this.alpha = i4;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                Comparable a6 = (Comparable) obj;
                Comparable b2 = (Comparable) obj2;
                Intrinsics.echo(a6, "a");
                Intrinsics.echo(b2, "b");
                return a6.compareTo(b2);
            default:
                Comparable a8 = (Comparable) obj;
                Comparable b4 = (Comparable) obj2;
                Intrinsics.echo(a8, "a");
                Intrinsics.echo(b4, "b");
                return b4.compareTo(a8);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.alpha) {
            case 0:
                return red;
            default:
                return purple;
        }
    }
}
