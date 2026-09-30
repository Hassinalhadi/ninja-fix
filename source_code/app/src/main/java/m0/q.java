package m0;

import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import com.google.android.gms.internal.measurement.C1290a1;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class q {
    public static final C2095a alpha = new C2095a(1000);
    public static final C2095a bravo;
    public static final C2095a charlie;
    public static final StackTraceElement[] delta;

    static {
        new C2095a(1007);
        bravo = new C2095a(1008);
        charlie = new C2095a(1002);
        delta = new StackTraceElement[0];
    }

    public static final boolean alpha(r rVar) {
        if (!rVar.hotel && rVar.delta) {
            return true;
        }
        return false;
    }

    public static final boolean bravo(r rVar) {
        if (!rVar.bravo() && rVar.hotel && !rVar.delta) {
            return true;
        }
        return false;
    }

    public static final boolean charlie(r rVar) {
        if (rVar.hotel && !rVar.delta) {
            return true;
        }
        return false;
    }

    public static final boolean delta(long j5, long j6) {
        if (j5 == j6) {
            return true;
        }
        return false;
    }

    public static final boolean echo(r rVar, long j5, long j6) {
        int i4;
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (rVar.india == 1) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        long j7 = rVar.charlie;
        float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        float f5 = i4;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j6 >> 32)) * f5;
        float f10 = ((int) (j5 >> 32)) + intBitsToFloat3;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j6 & 4294967295L)) * f5;
        float f11 = ((int) (j5 & 4294967295L)) + intBitsToFloat4;
        if (intBitsToFloat < (-intBitsToFloat3)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (intBitsToFloat > f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z13 = z10 | z2;
        if (intBitsToFloat2 < (-intBitsToFloat4)) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z14 = z13 | z11;
        if (intBitsToFloat2 > f11) {
            z12 = true;
        }
        return z14 | z12;
    }

    public static T.s foxtrot(T.s sVar, C2095a c2095a) {
        return sVar.then(new PointerHoverIconModifierElement(c2095a));
    }

    public static final long golf(r rVar, boolean z2) {
        long foxtrot = Z.b.foxtrot(rVar.charlie, rVar.golf);
        if (!z2 && rVar.bravo()) {
            return 0L;
        }
        return foxtrot;
    }

    public static final void hotel(k kVar, long j5, Function1 function1, boolean z2) {
        MotionEvent motionEvent;
        C1290a1 c1290a1 = kVar.bravo;
        if (c1290a1 != null) {
            motionEvent = (MotionEvent) ((com.google.android.play.core.integrity.c) c1290a1.charlie).red;
        } else {
            motionEvent = null;
        }
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (z2) {
                motionEvent.setAction(3);
            }
            int i4 = (int) (j5 >> 32);
            int i5 = (int) (j5 & 4294967295L);
            motionEvent.offsetLocation(-Float.intBitsToFloat(i4), -Float.intBitsToFloat(i5));
            function1.invoke(motionEvent);
            motionEvent.offsetLocation(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5));
            motionEvent.setAction(action);
            return;
        }
        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
    }
}
