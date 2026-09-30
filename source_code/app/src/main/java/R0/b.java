package R0;

import Q0.j;
import bv.ax;
import bv.v;

/* loaded from: classes3.dex */
public abstract class b {
    public static final float[] alpha = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile ax bravo = new ax(0);
    public static final Object[] charlie;

    static {
        Object[] objArr = new Object[0];
        charlie = objArr;
        synchronized (objArr) {
            bravo.foxtrot((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            bravo.foxtrot((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            bravo.foxtrot((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            bravo.foxtrot((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            bravo.foxtrot((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((bravo.echo(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        j.bravo("You should only apply non-linear scaling to font scales > 1");
    }

    public static a alpha(float f5) {
        float echo;
        a aVar;
        float f10;
        if (f5 >= 1.03f) {
            int i4 = (int) (f5 * 100.0f);
            a aVar2 = (a) bravo.delta(i4);
            if (aVar2 != null) {
                return aVar2;
            }
            ax axVar = bravo;
            if (axVar.alpha) {
                v.alpha(axVar);
            }
            int alpha2 = bw.a.alpha(axVar.silver, i4, axVar.purple);
            if (alpha2 >= 0) {
                return (a) bravo.hotel(alpha2);
            }
            int i5 = -(alpha2 + 1);
            int i10 = i5 - 1;
            if (i5 >= bravo.golf()) {
                c cVar = new c(new float[]{1.0f}, new float[]{f5});
                bravo(f5, cVar);
                return cVar;
            }
            float[] fArr = alpha;
            if (i10 < 0) {
                aVar = new c(fArr, fArr);
                echo = 1.0f;
            } else {
                echo = bravo.echo(i10) / 100.0f;
                aVar = (a) bravo.hotel(i10);
            }
            float echo2 = bravo.echo(i5) / 100.0f;
            if (echo == echo2) {
                f10 = 0.0f;
            } else {
                f10 = (f5 - echo) / (echo2 - echo);
            }
            float max = (Math.max(0.0f, Math.min(1.0f, f10)) * 1.0f) + 0.0f;
            a aVar3 = (a) bravo.hotel(i5);
            float[] fArr2 = new float[9];
            for (int i11 = 0; i11 < 9; i11++) {
                float f11 = fArr[i11];
                float bravo2 = aVar.bravo(f11);
                fArr2[i11] = ((aVar3.bravo(f11) - bravo2) * max) + bravo2;
            }
            c cVar2 = new c(fArr, fArr2);
            bravo(f5, cVar2);
            return cVar2;
        }
        return null;
    }

    public static void bravo(float f5, c cVar) {
        synchronized (charlie) {
            ax clone = bravo.clone();
            clone.foxtrot((int) (f5 * 100.0f), cVar);
            bravo = clone;
        }
    }
}
