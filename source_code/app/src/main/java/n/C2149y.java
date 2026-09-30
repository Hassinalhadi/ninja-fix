package n;

import F.C0130l1;
import g.AbstractC1719b;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import q0.AbstractC2375K;
import t6.I2;
import y.C3344D;

/* renamed from: n.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2149y implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C3344D purple;

    public /* synthetic */ C2149y(C3344D c3344d, int i4) {
        this.alpha = i4;
        this.purple = c3344d;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0138  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Z.c cVar;
        ax axVar;
        q0.z zVar;
        long j5;
        char c3;
        long j6;
        long j7;
        float f5;
        q0.z charlie;
        float f10;
        q0.z charlie2;
        float f11;
        q0.z charlie3;
        q0.z charlie4;
        Z.c cVar2 = Z.c.echo;
        C3344D c3344d = this.purple;
        switch (this.alpha) {
            case 0:
                return new C0130l1(9, c3344d);
            case 1:
                c3344d.sierra();
                return Unit.INSTANCE;
            default:
                q0.z zVar2 = (q0.z) obj;
                ax axVar2 = c3344d.delta;
                if (axVar2 != null) {
                    if (axVar2.papa) {
                        axVar2 = null;
                    }
                    if (axVar2 != null) {
                        I0.t tVar = c3344d.bravo;
                        long j10 = c3344d.oscar().bravo;
                        int i4 = D0.am.charlie;
                        int originalToTransformed = tVar.originalToTransformed((int) (j10 >> 32));
                        int originalToTransformed2 = c3344d.bravo.originalToTransformed((int) (c3344d.oscar().bravo & 4294967295L));
                        ax axVar3 = c3344d.delta;
                        long j11 = 0;
                        if (axVar3 != null && (charlie4 = axVar3.charlie()) != null) {
                            j5 = charlie4.gray(c3344d.mike(true));
                        } else {
                            j5 = 0;
                        }
                        ax axVar4 = c3344d.delta;
                        if (axVar4 != null && (charlie3 = axVar4.charlie()) != null) {
                            j11 = charlie3.gray(c3344d.mike(false));
                        }
                        ax axVar5 = c3344d.delta;
                        float f12 = 0.0f;
                        if (axVar5 != null && (charlie2 = axVar5.charlie()) != null) {
                            e0 delta = axVar2.delta();
                            if (delta != null) {
                                f11 = delta.alpha.charlie(originalToTransformed).bravo;
                            } else {
                                f11 = 0.0f;
                            }
                            c3 = ' ';
                            j6 = j11;
                            j7 = 4294967295L;
                            f5 = Float.intBitsToFloat((int) (charlie2.gray((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)) & 4294967295L));
                        } else {
                            c3 = ' ';
                            j6 = j11;
                            j7 = 4294967295L;
                            f5 = 0.0f;
                        }
                        ax axVar6 = c3344d.delta;
                        if (axVar6 != null && (charlie = axVar6.charlie()) != null) {
                            e0 delta2 = axVar2.delta();
                            if (delta2 != null) {
                                f10 = delta2.alpha.charlie(originalToTransformed2).bravo;
                            } else {
                                f10 = 0.0f;
                            }
                            f12 = Float.intBitsToFloat((int) (charlie.gray((Float.floatToRawIntBits(0.0f) << c3) | (Float.floatToRawIntBits(f10) & j7)) & j7));
                        }
                        int i5 = (int) (j5 >> c3);
                        int i10 = (int) (j6 >> c3);
                        cVar = new Z.c(Math.min(Float.intBitsToFloat(i5), Float.intBitsToFloat(i10)), Math.min(f5, f12), Math.max(Float.intBitsToFloat(i5), Float.intBitsToFloat(i10)), (axVar2.alpha.golf.alpha() * 25) + Math.max(Float.intBitsToFloat((int) (j5 & j7)), Float.intBitsToFloat((int) (j6 & j7))));
                        axVar = c3344d.delta;
                        if (axVar == null) {
                            zVar = axVar.charlie();
                        } else {
                            zVar = null;
                        }
                        if (zVar == null) {
                            if (zVar.india() && zVar2.india()) {
                                return I2.alpha(zVar2.oscar(AbstractC2375K.hotel(zVar), cVar.charlie()), cVar.bravo());
                            }
                            return cVar2;
                        }
                        AbstractC1719b.delta("Required value was null.");
                        throw new KotlinNothingValueException();
                    }
                }
                cVar = cVar2;
                axVar = c3344d.delta;
                if (axVar == null) {
                }
                if (zVar == null) {
                }
                break;
        }
    }
}
