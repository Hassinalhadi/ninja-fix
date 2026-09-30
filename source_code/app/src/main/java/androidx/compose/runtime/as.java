package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class as implements Nd.g, u0 {
    public static final /* synthetic */ as purple = new as(0);
    public static final as red = new as(1);
    public static final as silver = new as(2);
    public static final as teal = new as(3);
    public static final as white = new as(4);
    public final /* synthetic */ int alpha;

    public /* synthetic */ as(int i4) {
        this.alpha = i4;
    }

    @Override // androidx.compose.runtime.u0
    public boolean alpha(Object obj, Object obj2) {
        switch (this.alpha) {
            case 1:
                return false;
            case 2:
                if (obj == obj2) {
                    return true;
                }
                return false;
            default:
                return Intrinsics.areEqual(obj, obj2);
        }
    }

    public String toString() {
        switch (this.alpha) {
            case 1:
                return "NeverEqualPolicy";
            case 2:
                return "ReferentialEqualityPolicy";
            case 3:
            case 5:
            default:
                return super.toString();
            case 4:
                return "StructuralEqualityPolicy";
            case 6:
                return "Empty";
        }
    }
}
