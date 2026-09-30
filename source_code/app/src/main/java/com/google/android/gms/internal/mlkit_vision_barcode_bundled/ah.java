package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ah implements A {
    public static final ah bravo = new ah(0);
    public final /* synthetic */ int alpha;

    public /* synthetic */ ah(int i4) {
        this.alpha = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r14[r12] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r12 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
    
        if (r14[r12] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r14[r12] <= (-65)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int charlie(int i4, int i5, int i10, byte[] bArr) {
        int i11;
        int i12;
        if (i4 != 0) {
            if (i5 >= i10) {
                return i4;
            }
            byte b2 = (byte) i4;
            if (b2 < -32) {
                if (b2 >= -62) {
                    i12 = i5 + 1;
                }
                return -1;
            }
            int i13 = ~(i4 >> 8);
            if (b2 < -16) {
                byte b4 = (byte) i13;
                if (b4 == 0) {
                    int i14 = i5 + 1;
                    byte b6 = bArr[i5];
                    if (i14 < i10) {
                        i5 = i14;
                        b4 = b6;
                    } else {
                        return X.delta(b2, b6);
                    }
                }
                if (b4 <= -65 && ((b2 != -32 || b4 >= -96) && (b2 != -19 || b4 < -96))) {
                    i12 = i5 + 1;
                }
                return -1;
            }
            byte b10 = (byte) i13;
            if (b10 == 0) {
                int i15 = i5 + 1;
                b10 = bArr[i5];
                if (i15 < i10) {
                    i5 = i15;
                    i11 = 0;
                } else {
                    return X.delta(b2, b10);
                }
            } else {
                i11 = i4 >> 16;
            }
            if (i11 == 0) {
                int i16 = i5 + 1;
                byte b11 = bArr[i5];
                if (i16 < i10) {
                    i5 = i16;
                    i11 = b11;
                } else {
                    ah ahVar = X.alpha;
                    if (b2 > -12 || b10 > -65 || b11 > -65) {
                        return -1;
                    }
                    return ((b10 << 8) ^ b2) ^ (b11 << 16);
                }
            }
            if (b10 <= -65) {
                if ((((b10 + 112) + (b2 << 28)) >> 30) == 0 && i11 <= -65) {
                    i12 = i5 + 1;
                }
            }
            return -1;
        }
        while (i5 < i10 && bArr[i5] >= 0) {
            i5++;
        }
        if (i5 < i10) {
            while (i5 < i10) {
                int i17 = i5 + 1;
                byte b12 = bArr[i5];
                if (b12 < 0) {
                    if (b12 < -32) {
                        if (i17 >= i10) {
                            return b12;
                        }
                        if (b12 >= -62) {
                            i5 += 2;
                            if (bArr[i17] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b12 < -16) {
                        if (i17 >= i10 - 1) {
                            return X.alpha(bArr, i17, i10);
                        }
                        int i18 = i5 + 2;
                        byte b13 = bArr[i17];
                        if (b13 <= -65 && ((b12 != -32 || b13 >= -96) && (b12 != -19 || b13 < -96))) {
                            i5 += 3;
                            if (bArr[i18] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i17 >= i10 - 2) {
                        return X.alpha(bArr, i17, i10);
                    }
                    int i19 = i5 + 2;
                    byte b14 = bArr[i17];
                    if (b14 <= -65) {
                        if ((((b14 + 112) + (b12 << 28)) >> 30) == 0) {
                            int i20 = i5 + 3;
                            if (bArr[i19] <= -65) {
                                i5 += 4;
                                if (bArr[i20] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i5 = i17;
            }
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.LinkedHashMap, com.google.android.gms.internal.mlkit_vision_barcode_bundled.ay] */
    public static final ay delta(Object obj, Object obj2) {
        ay ayVar = (ay) obj;
        ay ayVar2 = (ay) obj2;
        if (!ayVar2.isEmpty()) {
            if (!ayVar.alpha) {
                if (ayVar.isEmpty()) {
                    ayVar = new ay();
                } else {
                    ?? linkedHashMap = new LinkedHashMap(ayVar);
                    linkedHashMap.alpha = true;
                    ayVar = linkedHashMap;
                }
            }
            ayVar.bravo();
            if (!ayVar2.isEmpty()) {
                ayVar.putAll(ayVar2);
            }
        }
        return ayVar;
    }

    public static void echo(ax axVar, Map.Entry entry) {
        ak akVar = (ak) entry.getKey();
        Y y10 = Y.purple;
        akVar.getClass();
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.A
    public J alpha(Class cls) {
        switch (this.alpha) {
            case 0:
                if (am.class.isAssignableFrom(cls)) {
                    try {
                        return (J) am.echo(cls.asSubclass(am.class)).mike(3, null);
                    } catch (Exception e) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                    }
                }
                throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.A
    public boolean bravo(Class cls) {
        switch (this.alpha) {
            case 0:
                return am.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
