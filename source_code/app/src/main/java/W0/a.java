package W0;

import androidx.appcompat.widget.P0;
import id.C1915c;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a {
    public final b bravo;
    public final C1915c charlie;
    public int alpha = 0;
    public int delta = 8;
    public int[] echo = new int[8];
    public int[] foxtrot = new int[8];
    public float[] golf = new float[8];
    public int hotel = -1;
    public int india = -1;
    public boolean juliet = false;

    public a(b bVar, C1915c c1915c) {
        this.bravo = bVar;
        this.charlie = c1915c;
    }

    public final void alpha(f fVar, float f5, boolean z2) {
        if (f5 <= -0.001f || f5 >= 0.001f) {
            int i4 = this.hotel;
            b bVar = this.bravo;
            if (i4 == -1) {
                this.hotel = 0;
                this.golf[0] = f5;
                this.echo[0] = fVar.purple;
                this.foxtrot[0] = -1;
                fVar.f2192d++;
                fVar.alpha(bVar);
                this.alpha++;
                if (!this.juliet) {
                    int i5 = this.india + 1;
                    this.india = i5;
                    int[] iArr = this.echo;
                    if (i5 >= iArr.length) {
                        this.juliet = true;
                        this.india = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i10 = -1;
            for (int i11 = 0; i4 != -1 && i11 < this.alpha; i11++) {
                int i12 = this.echo[i4];
                int i13 = fVar.purple;
                if (i12 == i13) {
                    float[] fArr = this.golf;
                    float f10 = fArr[i4] + f5;
                    if (f10 > -0.001f && f10 < 0.001f) {
                        f10 = 0.0f;
                    }
                    fArr[i4] = f10;
                    if (f10 == 0.0f) {
                        if (i4 == this.hotel) {
                            this.hotel = this.foxtrot[i4];
                        } else {
                            int[] iArr2 = this.foxtrot;
                            iArr2[i10] = iArr2[i4];
                        }
                        if (z2) {
                            fVar.bravo(bVar);
                        }
                        if (this.juliet) {
                            this.india = i4;
                        }
                        fVar.f2192d--;
                        this.alpha--;
                        return;
                    }
                    return;
                }
                if (i12 < i13) {
                    i10 = i4;
                }
                i4 = this.foxtrot[i4];
            }
            int i14 = this.india;
            int i15 = i14 + 1;
            if (this.juliet) {
                int[] iArr3 = this.echo;
                if (iArr3[i14] != -1) {
                    i14 = iArr3.length;
                }
            } else {
                i14 = i15;
            }
            int[] iArr4 = this.echo;
            if (i14 >= iArr4.length && this.alpha < iArr4.length) {
                int i16 = 0;
                while (true) {
                    int[] iArr5 = this.echo;
                    if (i16 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i16] == -1) {
                        i14 = i16;
                        break;
                    }
                    i16++;
                }
            }
            int[] iArr6 = this.echo;
            if (i14 >= iArr6.length) {
                i14 = iArr6.length;
                int i17 = this.delta * 2;
                this.delta = i17;
                this.juliet = false;
                this.india = i14 - 1;
                this.golf = Arrays.copyOf(this.golf, i17);
                this.echo = Arrays.copyOf(this.echo, this.delta);
                this.foxtrot = Arrays.copyOf(this.foxtrot, this.delta);
            }
            this.echo[i14] = fVar.purple;
            this.golf[i14] = f5;
            if (i10 != -1) {
                int[] iArr7 = this.foxtrot;
                iArr7[i14] = iArr7[i10];
                iArr7[i10] = i14;
            } else {
                this.foxtrot[i14] = this.hotel;
                this.hotel = i14;
            }
            fVar.f2192d++;
            fVar.alpha(bVar);
            this.alpha++;
            if (!this.juliet) {
                this.india++;
            }
            int i18 = this.india;
            int[] iArr8 = this.echo;
            if (i18 >= iArr8.length) {
                this.juliet = true;
                this.india = iArr8.length - 1;
            }
        }
    }

    public final void bravo() {
        int i4 = this.hotel;
        for (int i5 = 0; i4 != -1 && i5 < this.alpha; i5++) {
            f fVar = ((f[]) this.charlie.silver)[this.echo[i4]];
            if (fVar != null) {
                fVar.bravo(this.bravo);
            }
            i4 = this.foxtrot[i4];
        }
        this.hotel = -1;
        this.india = -1;
        this.juliet = false;
        this.alpha = 0;
    }

    public final float charlie(f fVar) {
        int i4 = this.hotel;
        for (int i5 = 0; i4 != -1 && i5 < this.alpha; i5++) {
            if (this.echo[i4] == fVar.purple) {
                return this.golf[i4];
            }
            i4 = this.foxtrot[i4];
        }
        return 0.0f;
    }

    public final int delta() {
        return this.alpha;
    }

    public final f echo(int i4) {
        int i5 = this.hotel;
        for (int i10 = 0; i5 != -1 && i10 < this.alpha; i10++) {
            if (i10 == i4) {
                return ((f[]) this.charlie.silver)[this.echo[i5]];
            }
            i5 = this.foxtrot[i5];
        }
        return null;
    }

    public final float foxtrot(int i4) {
        int i5 = this.hotel;
        for (int i10 = 0; i5 != -1 && i10 < this.alpha; i10++) {
            if (i10 == i4) {
                return this.golf[i5];
            }
            i5 = this.foxtrot[i5];
        }
        return 0.0f;
    }

    public final void golf(f fVar, float f5) {
        if (f5 == 0.0f) {
            hotel(fVar, true);
            return;
        }
        int i4 = this.hotel;
        b bVar = this.bravo;
        if (i4 == -1) {
            this.hotel = 0;
            this.golf[0] = f5;
            this.echo[0] = fVar.purple;
            this.foxtrot[0] = -1;
            fVar.f2192d++;
            fVar.alpha(bVar);
            this.alpha++;
            if (!this.juliet) {
                int i5 = this.india + 1;
                this.india = i5;
                int[] iArr = this.echo;
                if (i5 >= iArr.length) {
                    this.juliet = true;
                    this.india = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i10 = -1;
        for (int i11 = 0; i4 != -1 && i11 < this.alpha; i11++) {
            int i12 = this.echo[i4];
            int i13 = fVar.purple;
            if (i12 == i13) {
                this.golf[i4] = f5;
                return;
            }
            if (i12 < i13) {
                i10 = i4;
            }
            i4 = this.foxtrot[i4];
        }
        int i14 = this.india;
        int i15 = i14 + 1;
        if (this.juliet) {
            int[] iArr2 = this.echo;
            if (iArr2[i14] != -1) {
                i14 = iArr2.length;
            }
        } else {
            i14 = i15;
        }
        int[] iArr3 = this.echo;
        if (i14 >= iArr3.length && this.alpha < iArr3.length) {
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.echo;
                if (i16 >= iArr4.length) {
                    break;
                }
                if (iArr4[i16] == -1) {
                    i14 = i16;
                    break;
                }
                i16++;
            }
        }
        int[] iArr5 = this.echo;
        if (i14 >= iArr5.length) {
            i14 = iArr5.length;
            int i17 = this.delta * 2;
            this.delta = i17;
            this.juliet = false;
            this.india = i14 - 1;
            this.golf = Arrays.copyOf(this.golf, i17);
            this.echo = Arrays.copyOf(this.echo, this.delta);
            this.foxtrot = Arrays.copyOf(this.foxtrot, this.delta);
        }
        this.echo[i14] = fVar.purple;
        this.golf[i14] = f5;
        if (i10 != -1) {
            int[] iArr6 = this.foxtrot;
            iArr6[i14] = iArr6[i10];
            iArr6[i10] = i14;
        } else {
            this.foxtrot[i14] = this.hotel;
            this.hotel = i14;
        }
        fVar.f2192d++;
        fVar.alpha(bVar);
        int i18 = this.alpha + 1;
        this.alpha = i18;
        if (!this.juliet) {
            this.india++;
        }
        int[] iArr7 = this.echo;
        if (i18 >= iArr7.length) {
            this.juliet = true;
        }
        if (this.india >= iArr7.length) {
            this.juliet = true;
            this.india = iArr7.length - 1;
        }
    }

    public final float hotel(f fVar, boolean z2) {
        int i4 = this.hotel;
        if (i4 != -1) {
            int i5 = 0;
            int i10 = -1;
            while (i4 != -1 && i5 < this.alpha) {
                if (this.echo[i4] == fVar.purple) {
                    if (i4 == this.hotel) {
                        this.hotel = this.foxtrot[i4];
                    } else {
                        int[] iArr = this.foxtrot;
                        iArr[i10] = iArr[i4];
                    }
                    if (z2) {
                        fVar.bravo(this.bravo);
                    }
                    fVar.f2192d--;
                    this.alpha--;
                    this.echo[i4] = -1;
                    if (this.juliet) {
                        this.india = i4;
                    }
                    return this.golf[i4];
                }
                i5++;
                i10 = i4;
                i4 = this.foxtrot[i4];
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final String toString() {
        int i4 = this.hotel;
        String str = "";
        for (int i5 = 0; i4 != -1 && i5 < this.alpha; i5++) {
            StringBuilder tango = Q0.c.tango(P0.crimson(str, " -> "));
            tango.append(this.golf[i4]);
            tango.append(" : ");
            StringBuilder tango2 = Q0.c.tango(tango.toString());
            tango2.append(((f[]) this.charlie.silver)[this.echo[i4]]);
            str = tango2.toString();
            i4 = this.foxtrot[i4];
        }
        return str;
    }
}
