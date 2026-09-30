package com.google.crypto.tink.shaded.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class J extends L {
    public final /* synthetic */ int bravo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(Unsafe unsafe, int i4) {
        super(unsafe);
        this.bravo = i4;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public final boolean charlie(long j5, Object obj) {
        switch (this.bravo) {
            case 0:
                if (M.hotel) {
                    if (M.golf(j5, obj) == 0) {
                        return false;
                    }
                } else if (M.hotel(j5, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (M.hotel) {
                    if (M.golf(j5, obj) == 0) {
                        return false;
                    }
                } else if (M.hotel(j5, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public final byte delta(long j5, Object obj) {
        switch (this.bravo) {
            case 0:
                if (M.hotel) {
                    return M.golf(j5, obj);
                }
                return M.hotel(j5, obj);
            default:
                if (M.hotel) {
                    return M.golf(j5, obj);
                }
                return M.hotel(j5, obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public final double echo(long j5, Object obj) {
        switch (this.bravo) {
            case 0:
                return Double.longBitsToDouble(hotel(j5, obj));
            default:
                return Double.longBitsToDouble(hotel(j5, obj));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public final float foxtrot(long j5, Object obj) {
        switch (this.bravo) {
            case 0:
                return Float.intBitsToFloat(golf(j5, obj));
            default:
                return Float.intBitsToFloat(golf(j5, obj));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public final void kilo(Object obj, long j5, boolean z2) {
        switch (this.bravo) {
            case 0:
                if (M.hotel) {
                    M.kilo(obj, j5, z2 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    M.lima(obj, j5, z2 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (M.hotel) {
                    M.kilo(obj, j5, z2 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    M.lima(obj, j5, z2 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public final void lima(Object obj, long j5, byte b2) {
        switch (this.bravo) {
            case 0:
                if (M.hotel) {
                    M.kilo(obj, j5, b2);
                    return;
                } else {
                    M.lima(obj, j5, b2);
                    return;
                }
            default:
                if (M.hotel) {
                    M.kilo(obj, j5, b2);
                    return;
                } else {
                    M.lima(obj, j5, b2);
                    return;
                }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
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

    @Override // com.google.crypto.tink.shaded.protobuf.L
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
}
