package W0;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class f implements Comparable {
    public boolean alpha;
    public int e;
    public float teal;
    public int purple = -1;
    public int red = -1;
    public int silver = 0;
    public boolean white = false;
    public final float[] yellow = new float[9];

    /* renamed from: a, reason: collision with root package name */
    public final float[] f2189a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public b[] f2190b = new b[16];

    /* renamed from: c, reason: collision with root package name */
    public int f2191c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f2192d = 0;

    public f(int i4) {
        this.e = i4;
    }

    public final void alpha(b bVar) {
        int i4 = 0;
        while (true) {
            int i5 = this.f2191c;
            if (i4 < i5) {
                if (this.f2190b[i4] == bVar) {
                    return;
                } else {
                    i4++;
                }
            } else {
                b[] bVarArr = this.f2190b;
                if (i5 >= bVarArr.length) {
                    this.f2190b = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f2190b;
                int i10 = this.f2191c;
                bVarArr2[i10] = bVar;
                this.f2191c = i10 + 1;
                return;
            }
        }
    }

    public final void bravo(b bVar) {
        int i4 = this.f2191c;
        int i5 = 0;
        while (i5 < i4) {
            if (this.f2190b[i5] == bVar) {
                while (i5 < i4 - 1) {
                    b[] bVarArr = this.f2190b;
                    int i10 = i5 + 1;
                    bVarArr[i5] = bVarArr[i10];
                    i5 = i10;
                }
                this.f2191c--;
                return;
            }
            i5++;
        }
    }

    public final void charlie() {
        this.e = 5;
        this.silver = 0;
        this.purple = -1;
        this.red = -1;
        this.teal = 0.0f;
        this.white = false;
        int i4 = this.f2191c;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f2190b[i5] = null;
        }
        this.f2191c = 0;
        this.f2192d = 0;
        this.alpha = false;
        Arrays.fill(this.f2189a, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.purple - ((f) obj).purple;
    }

    public final void delta(c cVar, float f5) {
        this.teal = f5;
        this.white = true;
        int i4 = this.f2191c;
        this.red = -1;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f2190b[i5].hotel(cVar, this, false);
        }
        this.f2191c = 0;
    }

    public final void echo(c cVar, b bVar) {
        int i4 = this.f2191c;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f2190b[i5].india(cVar, bVar, false);
        }
        this.f2191c = 0;
    }

    public final String toString() {
        return "" + this.purple;
    }
}
