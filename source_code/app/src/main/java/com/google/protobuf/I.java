package com.google.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class I extends K {
    public final /* synthetic */ int bravo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(Unsafe unsafe, int i4) {
        super(unsafe);
        this.bravo = i4;
    }

    @Override // com.google.protobuf.K
    public final boolean charlie(long j5, Object obj) {
        switch (this.bravo) {
            case 0:
                if (L.golf) {
                    if (L.hotel(j5, obj) == 0) {
                        return false;
                    }
                } else if (L.india(j5, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (L.golf) {
                    if (L.hotel(j5, obj) == 0) {
                        return false;
                    }
                } else if (L.india(j5, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.protobuf.K
    public final byte delta(long j5, Object obj) {
        switch (this.bravo) {
            case 0:
                if (L.golf) {
                    return L.hotel(j5, obj);
                }
                return L.india(j5, obj);
            default:
                if (L.golf) {
                    return L.hotel(j5, obj);
                }
                return L.india(j5, obj);
        }
    }

    @Override // com.google.protobuf.K
    public final double echo(long j5, Object obj) {
        switch (this.bravo) {
            case 0:
                return Double.longBitsToDouble(hotel(j5, obj));
            default:
                return Double.longBitsToDouble(hotel(j5, obj));
        }
    }

    @Override // com.google.protobuf.K
    public final float foxtrot(long j5, Object obj) {
        switch (this.bravo) {
            case 0:
                return Float.intBitsToFloat(golf(j5, obj));
            default:
                return Float.intBitsToFloat(golf(j5, obj));
        }
    }

    @Override // com.google.protobuf.K
    public final void kilo(Object obj, long j5, boolean z2) {
        switch (this.bravo) {
            case 0:
                if (L.golf) {
                    L.lima(obj, j5, z2 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    L.mike(obj, j5, z2 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (L.golf) {
                    L.lima(obj, j5, z2 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    L.mike(obj, j5, z2 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // com.google.protobuf.K
    public final void lima(Object obj, long j5, byte b2) {
        switch (this.bravo) {
            case 0:
                if (L.golf) {
                    L.lima(obj, j5, b2);
                    return;
                } else {
                    L.mike(obj, j5, b2);
                    return;
                }
            default:
                if (L.golf) {
                    L.lima(obj, j5, b2);
                    return;
                } else {
                    L.mike(obj, j5, b2);
                    return;
                }
        }
    }

    @Override // com.google.protobuf.K
    public final void mike(Object obj, long j5, double d4) {
        switch (this.bravo) {
            case 0:
                papa(obj, j5, Double.doubleToLongBits(d4));
                return;
            default:
                papa(obj, j5, Double.doubleToLongBits(d4));
                return;
        }
    }

    @Override // com.google.protobuf.K
    public final void november(Object obj, long j5, float f5) {
        switch (this.bravo) {
            case 0:
                oscar(j5, Float.floatToIntBits(f5), obj);
                return;
            default:
                oscar(j5, Float.floatToIntBits(f5), obj);
                return;
        }
    }

    @Override // com.google.protobuf.K
    public final boolean sierra() {
        switch (this.bravo) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
