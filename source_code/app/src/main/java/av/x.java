package av;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import androidx.camera.core.impl.C0505c;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.Z;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes3.dex */
public class x {
    public static final x alpha = new Object();

    public void alpha(androidx.camera.core.impl.am amVar, S2.l lVar) {
        androidx.camera.core.impl.ad adVar = (androidx.camera.core.impl.ad) amVar.plum(Z.victor, null);
        androidx.camera.core.impl.B b2 = androidx.camera.core.impl.B.red;
        C0505c c0505c = androidx.camera.core.impl.ad.hotel;
        HashSet hashSet = new HashSet();
        androidx.camera.core.impl.aw bravo = androidx.camera.core.impl.aw.bravo();
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.ay alpha2 = androidx.camera.core.impl.ay.alpha();
        ArrayList arrayList2 = new ArrayList(hashSet);
        androidx.camera.core.impl.B alpha3 = androidx.camera.core.impl.B.alpha(bravo);
        ArrayList arrayList3 = new ArrayList(arrayList);
        V v4 = V.bravo;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = alpha2.alpha;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        int i4 = -1;
        new androidx.camera.core.impl.ad(arrayList2, alpha3, -1, arrayList3, false, new V(arrayMap), null);
        if (adVar != null) {
            lVar.charlie(adVar.delta);
            b2 = adVar.bravo;
            i4 = adVar.charlie;
        }
        lVar.silver = androidx.camera.core.impl.aw.delta(b2);
        lVar.alpha = ((Integer) amVar.plum(au.a.f3240a, Integer.valueOf(i4))).intValue();
        lVar.delta(new ae((CameraCaptureSession.CaptureCallback) amVar.plum(au.a.e, new CameraCaptureSession.CaptureCallback())));
        lVar.echo(androidx.camera.core.r.delta(amVar).charlie());
    }
}
