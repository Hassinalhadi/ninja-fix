package androidx.recyclerview.widget;

import com.google.android.gms.internal.measurement.C1298c;
import com.google.android.gms.tasks.OnFailureListener;
import e6.C1629a;
import java.util.concurrent.atomic.AtomicLong;
import s6.Q7;

/* renamed from: androidx.recyclerview.widget.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0665j implements OnFailureListener {
    public final /* synthetic */ int alpha;
    public long purple;
    public Object red;

    public /* synthetic */ C0665j(long j5, int i4, Object obj) {
        this.alpha = i4;
        this.red = obj;
        this.purple = j5;
    }

    public long alpha(m0.r rVar, float f5) {
        float abs;
        long j5;
        long golf = Z.b.golf(this.purple, Z.b.foxtrot(rVar.charlie, rVar.golf));
        this.purple = golf;
        d.K k6 = (d.K) this.red;
        if (k6 == null) {
            abs = Z.b.charlie(golf);
        } else {
            abs = Math.abs(golf(golf));
        }
        if (abs >= f5) {
            if (k6 == null) {
                long j6 = this.purple;
                float charlie = Z.b.charlie(j6);
                float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) / charlie;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) / charlie;
                return Z.b.foxtrot(this.purple, Z.b.hotel(f5, (4294967295L & Float.floatToRawIntBits(intBitsToFloat2)) | (Float.floatToRawIntBits(intBitsToFloat) << 32)));
            }
            float golf2 = golf(this.purple) - (Math.signum(golf(this.purple)) * f5);
            long j7 = this.purple;
            d.K k10 = d.K.purple;
            if (k6 == k10) {
                j5 = j7 & 4294967295L;
            } else {
                j5 = j7 >> 32;
            }
            float intBitsToFloat3 = Float.intBitsToFloat((int) j5);
            if (k6 == k10) {
                return (Float.floatToRawIntBits(golf2) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat3));
            }
            return (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (4294967295L & Float.floatToRawIntBits(golf2));
        }
        return 9205357640488583168L;
    }

    public void bravo(int i4) {
        if (i4 >= 64) {
            C0665j c0665j = (C0665j) this.red;
            if (c0665j != null) {
                c0665j.bravo(i4 - 64);
                return;
            }
            return;
        }
        this.purple &= ~(1 << i4);
    }

    public int charlie(int i4) {
        C0665j c0665j = (C0665j) this.red;
        if (c0665j == null) {
            if (i4 >= 64) {
                return Long.bitCount(this.purple);
            }
            return Long.bitCount(this.purple & ((1 << i4) - 1));
        }
        if (i4 < 64) {
            return Long.bitCount(this.purple & ((1 << i4) - 1));
        }
        return Long.bitCount(this.purple) + c0665j.charlie(i4 - 64);
    }

    public void delta() {
        if (((C0665j) this.red) == null) {
            this.red = new C0665j();
        }
    }

    public boolean echo(int i4) {
        if (i4 >= 64) {
            delta();
            return ((C0665j) this.red).echo(i4 - 64);
        }
        if ((this.purple & (1 << i4)) != 0) {
            return true;
        }
        return false;
    }

    public void foxtrot(int i4, boolean z2) {
        boolean z10;
        if (i4 >= 64) {
            delta();
            ((C0665j) this.red).foxtrot(i4 - 64, z2);
            return;
        }
        long j5 = this.purple;
        if ((Long.MIN_VALUE & j5) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j6 = (1 << i4) - 1;
        this.purple = ((j5 & (~j6)) << 1) | (j5 & j6);
        if (z2) {
            juliet(i4);
        } else {
            bravo(i4);
        }
        if (!z10 && ((C0665j) this.red) == null) {
            return;
        }
        delta();
        ((C0665j) this.red).foxtrot(0, z10);
    }

    public float golf(long j5) {
        long j6;
        if (((d.K) this.red) == d.K.purple) {
            j6 = j5 >> 32;
        } else {
            j6 = j5 & 4294967295L;
        }
        return Float.intBitsToFloat((int) j6);
    }

    public boolean hotel(int i4) {
        boolean z2;
        if (i4 >= 64) {
            delta();
            return ((C0665j) this.red).hotel(i4 - 64);
        }
        long j5 = 1 << i4;
        long j6 = this.purple;
        if ((j6 & j5) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j7 = j6 & (~j5);
        this.purple = j7;
        long j10 = j5 - 1;
        this.purple = (j7 & j10) | Long.rotateRight((~j10) & j7, 1);
        C0665j c0665j = (C0665j) this.red;
        if (c0665j != null) {
            if (c0665j.echo(0)) {
                juliet(63);
            }
            ((C0665j) this.red).hotel(0);
        }
        return z2;
    }

    public void india() {
        this.purple = 0L;
        C0665j c0665j = (C0665j) this.red;
        if (c0665j != null) {
            c0665j.india();
        }
    }

    public void juliet(int i4) {
        if (i4 >= 64) {
            delta();
            ((C0665j) this.red).juliet(i4 - 64);
        } else {
            this.purple |= 1 << i4;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.alpha) {
            case 1:
                ((AtomicLong) ((C1298c) this.red).silver).set(this.purple);
                return;
            default:
                ((Q7) this.red).bravo.set(this.purple);
                return;
        }
    }

    public String toString() {
        switch (this.alpha) {
            case 0:
                if (((C0665j) this.red) == null) {
                    return Long.toBinaryString(this.purple);
                }
                return ((C0665j) this.red).toString() + "xx" + Long.toBinaryString(this.purple);
            default:
                return super.toString();
        }
    }

    public C0665j(C1629a c1629a) {
        this.alpha = 2;
        V5.x.hotel(c1629a);
        this.red = c1629a;
    }

    public C0665j() {
        this.alpha = 0;
        this.purple = 0L;
    }
}
