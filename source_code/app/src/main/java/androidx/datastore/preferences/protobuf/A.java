package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class A extends C {
    public final /* synthetic */ int bravo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(Unsafe unsafe, int i4) {
        super(unsafe);
        this.bravo = i4;
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final boolean charlie(long j5, Object obj) {
        switch (this.bravo) {
            case 0:
                if (D.golf) {
                    return D.bravo(j5, obj);
                }
                return D.charlie(j5, obj);
            default:
                if (D.golf) {
                    return D.bravo(j5, obj);
                }
                return D.charlie(j5, obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final double delta(long j5, Object obj) {
        switch (this.bravo) {
            case 0:
                return Double.longBitsToDouble(golf(j5, obj));
            default:
                return Double.longBitsToDouble(golf(j5, obj));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final float echo(long j5, Object obj) {
        switch (this.bravo) {
            case 0:
                return Float.intBitsToFloat(foxtrot(j5, obj));
            default:
                return Float.intBitsToFloat(foxtrot(j5, obj));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final void juliet(Object obj, long j5, boolean z2) {
        switch (this.bravo) {
            case 0:
                if (D.golf) {
                    D.kilo(obj, j5, z2 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    D.lima(obj, j5, z2 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (D.golf) {
                    D.kilo(obj, j5, z2 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    D.lima(obj, j5, z2 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final void kilo(Object obj, long j5, byte b2) {
        switch (this.bravo) {
            case 0:
                if (D.golf) {
                    D.kilo(obj, j5, b2);
                    return;
                } else {
                    D.lima(obj, j5, b2);
                    return;
                }
            default:
                if (D.golf) {
                    D.kilo(obj, j5, b2);
                    return;
                } else {
                    D.lima(obj, j5, b2);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final void lima(Object obj, long j5, double d4) {
        switch (this.bravo) {
            case 0:
                oscar(obj, j5, Double.doubleToLongBits(d4));
                return;
            default:
                oscar(obj, j5, Double.doubleToLongBits(d4));
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final void mike(Object obj, long j5, float f5) {
        switch (this.bravo) {
            case 0:
                november(j5, Float.floatToIntBits(f5), obj);
                return;
            default:
                november(j5, Float.floatToIntBits(f5), obj);
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final boolean romeo() {
        switch (this.bravo) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
