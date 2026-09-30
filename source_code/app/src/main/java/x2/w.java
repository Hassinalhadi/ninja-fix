package x2;

import android.view.animation.AnimationUtils;
import androidx.fragment.app.RunnableC0617l;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class w extends aa {
    public long alpha = -1;
    public boolean bravo;
    public boolean charlie;
    public J1.f delta;
    public final B0.a echo;
    public RunnableC0617l foxtrot;
    public final /* synthetic */ af golf;

    public w(af afVar) {
        this.golf = afVar;
        B0.a aVar = new B0.a((char) 0, 11);
        long[] jArr = new long[20];
        aVar.charlie = jArr;
        aVar.delta = new float[20];
        aVar.bravo = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
        this.echo = aVar;
    }

    public final void alpha() {
        float f5;
        int i4;
        if (this.delta == null) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f10 = (float) this.alpha;
            B0.a aVar = this.echo;
            char c3 = 20;
            int i5 = (aVar.bravo + 1) % 20;
            aVar.bravo = i5;
            ((long[]) aVar.charlie)[i5] = currentAnimationTimeMillis;
            ((float[]) aVar.delta)[i5] = f10;
            J1.e eVar = new J1.e(0);
            float f11 = 0.0f;
            eVar.bravo = 0.0f;
            this.delta = new J1.f(eVar);
            J1.g gVar = new J1.g();
            gVar.alpha(1.0f);
            gVar.bravo(200.0f);
            J1.f fVar = this.delta;
            fVar.mike = gVar;
            fVar.bravo = (float) this.alpha;
            fVar.charlie = true;
            if (!fVar.foxtrot) {
                ArrayList arrayList = fVar.lima;
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
                J1.f fVar2 = this.delta;
                int i10 = aVar.bravo;
                long[] jArr = (long[]) aVar.charlie;
                long j5 = Long.MIN_VALUE;
                if (i10 != 0 || jArr[i10] != Long.MIN_VALUE) {
                    long j6 = jArr[i10];
                    int i11 = 0;
                    long j7 = j6;
                    while (true) {
                        long j10 = jArr[i10];
                        if (j10 != j5) {
                            float f12 = (float) (j6 - j10);
                            float abs = (float) Math.abs(j10 - j7);
                            if (f12 > 100.0f || abs > 40.0f) {
                                break;
                            }
                            if (i10 == 0) {
                                i10 = 20;
                            }
                            i10--;
                            i11++;
                            if (i11 >= 20) {
                                break;
                            }
                            j7 = j10;
                            j5 = Long.MIN_VALUE;
                        } else {
                            break;
                        }
                    }
                    if (i11 >= 2) {
                        float[] fArr = (float[]) aVar.delta;
                        float f13 = 1000.0f;
                        if (i11 == 2) {
                            int i12 = aVar.bravo;
                            if (i12 == 0) {
                                i4 = 19;
                            } else {
                                i4 = i12 - 1;
                            }
                            float f14 = (float) (jArr[i12] - jArr[i4]);
                            if (f14 != 0.0f) {
                                f11 = ((fArr[i12] - fArr[i4]) / f14) * 1000.0f;
                            }
                        } else {
                            int i13 = aVar.bravo;
                            int i14 = ((i13 - i11) + 21) % 20;
                            int i15 = (i13 + 21) % 20;
                            long j11 = jArr[i14];
                            float f15 = fArr[i14];
                            int i16 = i14 + 1;
                            int i17 = i16 % 20;
                            float f16 = 0.0f;
                            while (i17 != i15) {
                                long j12 = jArr[i17];
                                char c4 = c3;
                                float[] fArr2 = fArr;
                                float f17 = (float) (j12 - j11);
                                if (f17 == 0.0f) {
                                    f5 = f13;
                                } else {
                                    float f18 = fArr2[i17];
                                    f5 = f13;
                                    float f19 = (f18 - f15) / f17;
                                    float abs2 = (Math.abs(f19) * (f19 - ((float) (Math.sqrt(2.0f * Math.abs(f16)) * Math.signum(f16))))) + f16;
                                    if (i17 == i16) {
                                        abs2 *= 0.5f;
                                    }
                                    f16 = abs2;
                                    f15 = f18;
                                    j11 = j12;
                                }
                                i17 = (i17 + 1) % 20;
                                c3 = c4;
                                fArr = fArr2;
                                f13 = f5;
                            }
                            f11 = ((float) (Math.sqrt(Math.abs(f16) * 2.0f) * Math.signum(f16))) * f13;
                        }
                    }
                }
                fVar2.alpha = f11;
                J1.f fVar3 = this.delta;
                fVar3.golf = (float) (this.golf.f14092r + 1);
                fVar3.hotel = -1.0f;
                fVar3.juliet = 4.0f;
                v vVar = new v(this);
                ArrayList arrayList2 = fVar3.kilo;
                if (!arrayList2.contains(vVar)) {
                    arrayList2.add(vVar);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
    }

    @Override // x2.aa, x2.x
    public final void onTransitionCancel(z zVar) {
        this.charlie = true;
    }
}
