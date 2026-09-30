package a0;

import androidx.appcompat.widget.P0;
import b0.AbstractC0713c;
import okhttp3.internal.ws.WebSocketProtocol;
import s6.AbstractC2698k6;

/* renamed from: a0.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0366t {
    public static final long bravo = ao.delta(4278190080L);
    public static final long charlie;
    public static final long delta;
    public static final long echo;
    public static final long foxtrot;
    public static final long golf;
    public static final long hotel;
    public static final long india;
    public static final long juliet;
    public static final long kilo;
    public static final /* synthetic */ int lima = 0;
    public final long alpha;

    static {
        ao.delta(4282664004L);
        charlie = ao.delta(4287137928L);
        delta = ao.delta(4291611852L);
        echo = ao.delta(4294967295L);
        foxtrot = ao.delta(4294901760L);
        golf = ao.delta(4278255360L);
        hotel = ao.delta(4278190335L);
        ao.delta(4294967040L);
        ao.delta(4278255615L);
        india = ao.delta(4294902015L);
        juliet = ao.charlie(0);
        kilo = ao.bravo(0.0f, 0.0f, 0.0f, 0.0f, b0.d.uniform);
    }

    public /* synthetic */ C0366t(long j5) {
        this.alpha = j5;
    }

    public static final long alpha(long j5, AbstractC0713c abstractC0713c) {
        b0.g gVar;
        AbstractC0713c foxtrot2 = foxtrot(j5);
        int i4 = foxtrot2.charlie;
        int i5 = abstractC0713c.charlie;
        if ((i4 | i5) < 0) {
            gVar = b0.j.echo(foxtrot2, abstractC0713c);
        } else {
            bv.aa aaVar = b0.h.alpha;
            int i10 = i4 | (i5 << 6);
            Object bravo2 = aaVar.bravo(i10);
            if (bravo2 == null) {
                bravo2 = b0.j.echo(foxtrot2, abstractC0713c);
                aaVar.hotel(i10, bravo2);
            }
            gVar = (b0.g) bravo2;
        }
        return gVar.alpha(j5);
    }

    public static long bravo(float f5, long j5) {
        return ao.bravo(hotel(j5), golf(j5), echo(j5), f5, foxtrot(j5));
    }

    public static final boolean charlie(long j5, long j6) {
        return j5 == j6;
    }

    public static final float delta(long j5) {
        float bravo2;
        float f5;
        if ((63 & j5) == 0) {
            bravo2 = (float) AbstractC2698k6.bravo((j5 >>> 56) & 255);
            f5 = 255.0f;
        } else {
            bravo2 = (float) AbstractC2698k6.bravo((j5 >>> 6) & 1023);
            f5 = 1023.0f;
        }
        return bravo2 / f5;
    }

    public static final float echo(long j5) {
        int i4;
        int i5;
        int i10;
        if ((63 & j5) == 0) {
            return ((float) AbstractC2698k6.bravo((j5 >>> 32) & 255)) / 255.0f;
        }
        short s3 = (short) ((j5 >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i11 = 32768 & s3;
        int i12 = ((65535 & s3) >>> 10) & 31;
        int i13 = s3 & 1023;
        if (i12 == 0) {
            if (i13 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i13 + 1056964608) - AbstractC0372z.alpha;
                if (i11 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i10 = 0;
            i5 = 0;
        } else {
            int i14 = i13 << 13;
            if (i12 == 31) {
                i4 = 255;
                if (i14 != 0) {
                    i14 |= 4194304;
                }
            } else {
                i4 = i12 + 112;
            }
            int i15 = i4;
            i5 = i14;
            i10 = i15;
        }
        return Float.intBitsToFloat((i10 << 23) | (i11 << 16) | i5);
    }

    public static final AbstractC0713c foxtrot(long j5) {
        float[] fArr = b0.d.alpha;
        return b0.d.yankee[(int) (j5 & 63)];
    }

    public static final float golf(long j5) {
        int i4;
        int i5;
        int i10;
        if ((63 & j5) == 0) {
            return ((float) AbstractC2698k6.bravo((j5 >>> 40) & 255)) / 255.0f;
        }
        short s3 = (short) ((j5 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i11 = 32768 & s3;
        int i12 = ((65535 & s3) >>> 10) & 31;
        int i13 = s3 & 1023;
        if (i12 == 0) {
            if (i13 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i13 + 1056964608) - AbstractC0372z.alpha;
                if (i11 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i10 = 0;
            i5 = 0;
        } else {
            int i14 = i13 << 13;
            if (i12 == 31) {
                i4 = 255;
                if (i14 != 0) {
                    i14 |= 4194304;
                }
            } else {
                i4 = i12 + 112;
            }
            int i15 = i4;
            i5 = i14;
            i10 = i15;
        }
        return Float.intBitsToFloat((i10 << 23) | (i11 << 16) | i5);
    }

    public static final float hotel(long j5) {
        int i4;
        int i5;
        int i10;
        if ((63 & j5) == 0) {
            return ((float) AbstractC2698k6.bravo((j5 >>> 48) & 255)) / 255.0f;
        }
        short s3 = (short) ((j5 >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i11 = 32768 & s3;
        int i12 = ((65535 & s3) >>> 10) & 31;
        int i13 = s3 & 1023;
        if (i12 == 0) {
            if (i13 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i13 + 1056964608) - AbstractC0372z.alpha;
                if (i11 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i10 = 0;
            i5 = 0;
        } else {
            int i14 = i13 << 13;
            if (i12 == 31) {
                i4 = 255;
                if (i14 != 0) {
                    i14 |= 4194304;
                }
            } else {
                i4 = i12 + 112;
            }
            int i15 = i4;
            i5 = i14;
            i10 = i15;
        }
        return Float.intBitsToFloat((i10 << 23) | (i11 << 16) | i5);
    }

    public static String india(long j5) {
        StringBuilder sb2 = new StringBuilder("Color(");
        sb2.append(hotel(j5));
        sb2.append(", ");
        sb2.append(golf(j5));
        sb2.append(", ");
        sb2.append(echo(j5));
        sb2.append(", ");
        sb2.append(delta(j5));
        sb2.append(", ");
        return P0.fuchsia(sb2, foxtrot(j5).alpha, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0366t) {
            if (this.alpha != ((C0366t) obj).alpha) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return kotlin.p.alpha(this.alpha);
    }

    public final String toString() {
        return india(this.alpha);
    }
}
