package av;

import android.text.TextUtils;
import id.C1915c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import s6.T7;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ s purple;
    public final /* synthetic */ ArrayList red;

    public /* synthetic */ j(s sVar, ArrayList arrayList, int i4) {
        this.alpha = i4;
        this.purple = sVar;
        this.red = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1915c c1915c;
        switch (this.alpha) {
            case 0:
                s sVar = this.purple;
                ArrayList arrayList = this.red;
                sVar.getClass();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                boolean z2 = false;
                boolean z10 = false;
                while (it.hasNext()) {
                    C0682b c0682b = (C0682b) it.next();
                    if (sVar.alpha.whiskey(c0682b.alpha)) {
                        ((LinkedHashMap) sVar.alpha.red).remove(c0682b.alpha);
                        arrayList2.add(c0682b.alpha);
                        if (c0682b.bravo == androidx.camera.core.az.class) {
                            z10 = true;
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    sVar.uniform("Use cases [" + TextUtils.join(", ", arrayList2) + "] now DETACHED for camera", null);
                    if (z10) {
                        sVar.yellow.yellow.getClass();
                    }
                    sVar.quebec();
                    if (sVar.alpha.romeo().isEmpty()) {
                        sVar.yellow.f3248d.charlie = false;
                    } else {
                        sVar.gray();
                    }
                    if (sVar.alpha.quebec().isEmpty()) {
                        sVar.yellow.bravo();
                        sVar.blue();
                        sVar.yellow.hotel(false);
                        sVar.e = sVar.amber();
                        sVar.uniform("Closing camera.", null);
                        switch (q.mike(sVar.A)) {
                            case 3:
                                if (sVar.f3262c == null) {
                                    z2 = true;
                                }
                                T7.golf(null, z2);
                                sVar.coral(3);
                                return;
                            case 4:
                            default:
                                sVar.uniform("close() ignored due to being in state: ".concat(q.november(sVar.A)), null);
                                return;
                            case 5:
                            case 6:
                            case 7:
                                if (sVar.f3260a.alpha() || ((c1915c = (C1915c) sVar.f3284z.purple) != null && !((AtomicBoolean) c1915c.red).get())) {
                                    z2 = true;
                                }
                                sVar.f3284z.juliet();
                                sVar.coral(5);
                                if (z2) {
                                    T7.golf(null, sVar.f3264f.isEmpty());
                                    sVar.sierra();
                                    return;
                                }
                                return;
                            case 8:
                            case 9:
                                sVar.coral(5);
                                sVar.romeo();
                                return;
                        }
                    }
                    sVar.gold();
                    sVar.blue();
                    if (sVar.A == 9) {
                        sVar.beige();
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList3 = this.red;
                s sVar2 = this.purple;
                h hVar = sVar2.yellow;
                try {
                    sVar2.cyan(arrayList3);
                    return;
                } finally {
                    hVar.bravo();
                }
        }
    }
}
