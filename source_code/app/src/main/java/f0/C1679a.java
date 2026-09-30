package f0;

import Q0.k;
import Q0.m;
import a0.AbstractC0367u;
import a0.C0352f;
import ao.ad;
import c0.d;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2627c7;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1679a extends AbstractC1680b {
    public final C0352f purple;
    public final long red;
    public int silver;
    public final long teal;
    public float white;
    public AbstractC0367u yellow;

    public C1679a(C0352f c0352f) {
        this(c0352f, (c0352f.alpha.getHeight() & 4294967295L) | (c0352f.alpha.getWidth() << 32));
    }

    @Override // f0.AbstractC1680b
    public final boolean applyAlpha(float f5) {
        this.white = f5;
        return true;
    }

    @Override // f0.AbstractC1680b
    public final boolean applyColorFilter(AbstractC0367u abstractC0367u) {
        this.yellow = abstractC0367u;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1679a) {
                C1679a c1679a = (C1679a) obj;
                if (Intrinsics.areEqual(this.purple, c1679a.purple) && k.alpha(0L, 0L) && m.alpha(this.red, c1679a.red) && this.silver == c1679a.silver) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // f0.AbstractC1680b
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo1getIntrinsicSizeNHjbRc() {
        return AbstractC2627c7.bravo(this.teal);
    }

    public final int hashCode() {
        int hashCode = (((int) 0) + (this.purple.hashCode() * 31)) * 31;
        long j5 = this.red;
        return ((((int) (j5 ^ (j5 >>> 32))) + hashCode) * 31) + this.silver;
    }

    @Override // f0.AbstractC1680b
    public final void onDraw(d dVar) {
        int round = Math.round(Float.intBitsToFloat((int) (dVar.bravo() >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (dVar.bravo() & 4294967295L)));
        ad.hotel(dVar, this.purple, this.red, (round << 32) | (round2 & 4294967295L), this.white, this.yellow, this.silver, 328);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BitmapPainter(image=");
        sb2.append(this.purple);
        sb2.append(", srcOffset=");
        sb2.append((Object) k.delta(0L));
        sb2.append(", srcSize=");
        sb2.append((Object) m.bravo(this.red));
        sb2.append(", filterQuality=");
        int i4 = this.silver;
        if (i4 == 0) {
            str = "None";
        } else if (i4 == 1) {
            str = "Low";
        } else if (i4 == 2) {
            str = "Medium";
        } else if (i4 == 3) {
            str = "High";
        } else {
            str = "Unknown";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }

    public C1679a(C0352f c0352f, long j5) {
        int i4;
        int i5;
        this.purple = c0352f;
        this.red = j5;
        this.silver = 1;
        if (((int) 0) >= 0 && ((int) 0) >= 0 && (i4 = (int) (j5 >> 32)) >= 0 && (i5 = (int) (4294967295L & j5)) >= 0 && i4 <= c0352f.alpha.getWidth() && i5 <= c0352f.alpha.getHeight()) {
            this.teal = j5;
            this.white = 1.0f;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
