package av;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.C0496c;
import androidx.camera.core.impl.AbstractC0512j;
import androidx.camera.core.impl.InterfaceC0523v;
import androidx.lifecycle.RunnableC0643m;
import bd.ExecutorC0748a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import s6.T7;
import t6.AbstractC3066u3;
import t6.P3;
import t6.Z3;

/* loaded from: classes3.dex */
public final class u implements InterfaceC0523v {
    public final String alpha;
    public final androidx.camera.camera2.internal.compat.j bravo;
    public final ah charlie;
    public h echo;
    public final t foxtrot;
    public final Q3.c hotel;
    public final Object delta = new Object();
    public ArrayList golf = null;

    public u(androidx.camera.camera2.internal.compat.q qVar, String str) {
        str.getClass();
        this.alpha = str;
        androidx.camera.camera2.internal.compat.j bravo = qVar.bravo(str);
        this.bravo = bravo;
        ah ahVar = new ah(5);
        ahVar.purple = this;
        this.charlie = ahVar;
        this.hotel = P3.echo(bravo);
        new HashMap();
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            AbstractC3066u3.india("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
        }
        this.foxtrot = new t(new C0496c(5, null));
    }

    @Override // androidx.camera.core.impl.InterfaceC0523v
    public final int alpha() {
        return golf(0);
    }

    @Override // androidx.camera.core.impl.InterfaceC0523v
    public final String bravo() {
        return this.alpha;
    }

    @Override // androidx.camera.core.impl.InterfaceC0523v
    public final InterfaceC0523v charlie() {
        return this;
    }

    @Override // androidx.camera.core.impl.InterfaceC0523v
    public final void delta(ExecutorC0748a executorC0748a, f fVar) {
        synchronized (this.delta) {
            try {
                h hVar = this.echo;
                if (hVar == null) {
                    if (this.golf == null) {
                        this.golf = new ArrayList();
                    }
                    this.golf.add(new Pair(fVar, executorC0748a));
                } else {
                    hVar.purple.execute(new A2.s(hVar, executorC0748a, fVar, 16));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0523v
    public final int echo() {
        boolean z2;
        Integer num = (Integer) this.bravo.alpha(CameraCharacteristics.LENS_FACING);
        if (num != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        T7.bravo("Unable to get the lens facing of the camera.", z2);
        int intValue = num.intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue == 1) {
            return 1;
        }
        if (intValue == 2) {
            return 2;
        }
        throw new IllegalArgumentException(q.delta(intValue, "The given lens facing integer: ", " can not be recognized."));
    }

    @Override // androidx.camera.core.impl.InterfaceC0523v
    public final String foxtrot() {
        Integer num = (Integer) this.bravo.alpha(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        if (num.intValue() == 2) {
            return "androidx.camera.camera2.legacy";
        }
        return "androidx.camera.camera2";
    }

    @Override // androidx.camera.core.impl.InterfaceC0523v
    public final int golf(int i4) {
        Integer num = (Integer) this.bravo.alpha(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        int intValue = num.intValue();
        int bravo = Z3.bravo(i4);
        boolean z2 = true;
        if (1 != echo()) {
            z2 = false;
        }
        return Z3.alpha(bravo, intValue, z2);
    }

    @Override // androidx.camera.core.impl.InterfaceC0523v
    public final Q3.c hotel() {
        return this.hotel;
    }

    @Override // androidx.camera.core.impl.InterfaceC0523v
    public final List india(int i4) {
        Size[] november = this.bravo.bravo().november(i4);
        if (november != null) {
            return Arrays.asList(november);
        }
        return Collections.EMPTY_LIST;
    }

    @Override // androidx.camera.core.impl.InterfaceC0523v
    public final void juliet(AbstractC0512j abstractC0512j) {
        synchronized (this.delta) {
            try {
                h hVar = this.echo;
                if (hVar == null) {
                    ArrayList arrayList = this.golf;
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((Pair) it.next()).first == abstractC0512j) {
                            it.remove();
                        }
                    }
                    return;
                }
                hVar.purple.execute(new RunnableC0643m(1, hVar, abstractC0512j));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void kilo(h hVar) {
        String str;
        synchronized (this.delta) {
            try {
                this.echo = hVar;
                ArrayList arrayList = this.golf;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        h hVar2 = this.echo;
                        Executor executor = (Executor) pair.second;
                        AbstractC0512j abstractC0512j = (AbstractC0512j) pair.first;
                        hVar2.getClass();
                        hVar2.purple.execute(new A2.s(hVar2, executor, abstractC0512j, 16));
                    }
                    this.golf = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Integer num = (Integer) this.bravo.alpha(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 4) {
                            str = ao.ad.zulu(intValue, "Unknown value: ");
                        } else {
                            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
                        }
                    } else {
                        str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
                    }
                } else {
                    str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
                }
            } else {
                str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
            }
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        }
        String echo = q.echo("Device Level: ", str);
        String hotel = AbstractC3066u3.hotel("Camera2CameraInfo");
        if (AbstractC3066u3.foxtrot(4, hotel)) {
            Log.i(hotel, echo);
        }
    }
}
