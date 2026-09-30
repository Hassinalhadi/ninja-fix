package t6;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import java.nio.BufferUnderflowException;
import java.util.List;
import q0.AbstractC2375K;
import s6.AbstractC2618b7;
import z0.C3460i;

/* loaded from: classes2.dex */
public abstract class Q3 {
    public static boolean alpha(a4.u uVar) {
        Boolean bool;
        try {
            CameraCharacteristics.Key key = CameraCharacteristics.FLASH_INFO_AVAILABLE;
            uVar.getClass();
            bool = (Boolean) ((androidx.camera.camera2.internal.compat.j) uVar.purple).alpha(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException e) {
            if (ax.b.alpha.delta(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                AbstractC3066u3.bravo("FlashAvailability", String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)));
            } else {
                AbstractC3066u3.delta("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)), e);
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            AbstractC3066u3.india("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static final void bravo(A0.s sVar, int i4, hd.av avVar) {
        A0.s sVar2;
        J.e eVar = new J.e(new A0.s[16]);
        List india = sVar.india(false, false);
        while (true) {
            eVar.delta(eVar.red, india);
            while (true) {
                int i5 = eVar.red;
                if (i5 != 0) {
                    sVar2 = (A0.s) eVar.mike(i5 - 1);
                    if (!A0.v.echo(sVar2)) {
                        A0.ac acVar = A0.x.india;
                        A0.k kVar = sVar2.delta;
                        if (kVar.alpha.charlie(acVar)) {
                            continue;
                        } else {
                            s0.L delta = sVar2.delta();
                            if (delta != null) {
                                Q0.l bravo = AbstractC2618b7.bravo(AbstractC2375K.foxtrot(delta));
                                if (bravo.alpha < bravo.charlie && bravo.bravo < bravo.delta) {
                                    Xd.l lVar = (Xd.l) A0.v.delta(kVar, A0.j.echo);
                                    A0.i iVar = (A0.i) A0.v.delta(kVar, A0.x.uniform);
                                    if (lVar != null && iVar != null && ((Number) iVar.bravo.invoke()).floatValue() > 0.0f) {
                                        int i10 = i4 + 1;
                                        avVar.invoke(new C3460i(sVar2, i10, bravo, delta));
                                        bravo(sVar2, i10, avVar);
                                    }
                                }
                            } else {
                                throw Q0.c.xray("Expected semantics node to have a coordinator.");
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            india = sVar2.india(false, false);
        }
    }
}
