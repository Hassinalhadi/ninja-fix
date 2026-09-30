package W0;

import Sb.k;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class e extends b {
    public f[] foxtrot;
    public f[] golf;
    public int hotel;
    public J2.c india;

    @Override // W0.b
    public final f delta(boolean[] zArr) {
        int i4 = -1;
        for (int i5 = 0; i5 < this.hotel; i5++) {
            f[] fVarArr = this.foxtrot;
            f fVar = fVarArr[i5];
            if (!zArr[fVar.purple]) {
                J2.c cVar = this.india;
                cVar.purple = fVar;
                int i10 = 8;
                if (i4 == -1) {
                    while (i10 >= 0) {
                        float f5 = ((f) cVar.purple).f2189a[i10];
                        if (f5 <= 0.0f) {
                            if (f5 < 0.0f) {
                                i4 = i5;
                                break;
                            }
                            i10--;
                        }
                    }
                } else {
                    f fVar2 = fVarArr[i4];
                    while (true) {
                        if (i10 >= 0) {
                            float f10 = fVar2.f2189a[i10];
                            float f11 = ((f) cVar.purple).f2189a[i10];
                            if (f11 == f10) {
                                i10--;
                            } else if (f11 >= f10) {
                            }
                        }
                    }
                }
            }
        }
        if (i4 == -1) {
            return null;
        }
        return this.foxtrot[i4];
    }

    @Override // W0.b
    public final boolean echo() {
        if (this.hotel == 0) {
            return true;
        }
        return false;
    }

    @Override // W0.b
    public final void india(c cVar, b bVar, boolean z2) {
        f fVar = bVar.alpha;
        if (fVar == null) {
            return;
        }
        a aVar = bVar.delta;
        int delta = aVar.delta();
        for (int i4 = 0; i4 < delta; i4++) {
            f echo = aVar.echo(i4);
            float foxtrot = aVar.foxtrot(i4);
            J2.c cVar2 = this.india;
            cVar2.purple = echo;
            boolean z10 = echo.alpha;
            float[] fArr = fVar.f2189a;
            if (z10) {
                boolean z11 = true;
                for (int i5 = 0; i5 < 9; i5++) {
                    float[] fArr2 = ((f) cVar2.purple).f2189a;
                    float f5 = (fArr[i5] * foxtrot) + fArr2[i5];
                    fArr2[i5] = f5;
                    if (Math.abs(f5) < 1.0E-4f) {
                        ((f) cVar2.purple).f2189a[i5] = 0.0f;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    ((e) cVar2.red).kilo((f) cVar2.purple);
                }
            } else {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f10 = fArr[i10];
                    if (f10 != 0.0f) {
                        float f11 = f10 * foxtrot;
                        if (Math.abs(f11) < 1.0E-4f) {
                            f11 = 0.0f;
                        }
                        ((f) cVar2.purple).f2189a[i10] = f11;
                    } else {
                        ((f) cVar2.purple).f2189a[i10] = 0.0f;
                    }
                }
                juliet(echo);
            }
            this.bravo = (bVar.bravo * foxtrot) + this.bravo;
        }
        kilo(fVar);
    }

    public final void juliet(f fVar) {
        int i4;
        int i5 = this.hotel + 1;
        f[] fVarArr = this.foxtrot;
        if (i5 > fVarArr.length) {
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
            this.foxtrot = fVarArr2;
            this.golf = (f[]) Arrays.copyOf(fVarArr2, fVarArr2.length * 2);
        }
        f[] fVarArr3 = this.foxtrot;
        int i10 = this.hotel;
        fVarArr3[i10] = fVar;
        int i11 = i10 + 1;
        this.hotel = i11;
        if (i11 > 1 && fVarArr3[i10].purple > fVar.purple) {
            int i12 = 0;
            while (true) {
                i4 = this.hotel;
                if (i12 >= i4) {
                    break;
                }
                this.golf[i12] = this.foxtrot[i12];
                i12++;
            }
            Arrays.sort(this.golf, 0, i4, new k(2));
            for (int i13 = 0; i13 < this.hotel; i13++) {
                this.foxtrot[i13] = this.golf[i13];
            }
        }
        fVar.alpha = true;
        fVar.alpha(this);
    }

    public final void kilo(f fVar) {
        int i4 = 0;
        while (i4 < this.hotel) {
            if (this.foxtrot[i4] == fVar) {
                while (true) {
                    int i5 = this.hotel;
                    if (i4 < i5 - 1) {
                        f[] fVarArr = this.foxtrot;
                        int i10 = i4 + 1;
                        fVarArr[i4] = fVarArr[i10];
                        i4 = i10;
                    } else {
                        this.hotel = i5 - 1;
                        fVar.alpha = false;
                        return;
                    }
                }
            } else {
                i4++;
            }
        }
    }

    @Override // W0.b
    public final String toString() {
        String str = " goal -> (" + this.bravo + ") : ";
        for (int i4 = 0; i4 < this.hotel; i4++) {
            f fVar = this.foxtrot[i4];
            J2.c cVar = this.india;
            cVar.purple = fVar;
            str = str + cVar + " ";
        }
        return str;
    }
}
