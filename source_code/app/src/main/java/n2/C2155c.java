package n2;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: n2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2155c implements Comparable {
    public final int alpha;
    public final int purple;
    public final String red;
    public final String silver;

    public C2155c(String str, int i4, int i5, String str2) {
        this.alpha = i4;
        this.purple = i5;
        this.red = str;
        this.silver = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2155c other = (C2155c) obj;
        Intrinsics.echo(other, "other");
        int i4 = this.alpha - other.alpha;
        if (i4 == 0) {
            return this.purple - other.purple;
        }
        return i4;
    }
}
