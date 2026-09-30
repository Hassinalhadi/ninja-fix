package av;

import androidx.camera.core.impl.C0509g;
import androidx.camera.core.impl.P;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.Z;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ s purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ P silver;
    public final /* synthetic */ Z teal;
    public final /* synthetic */ C0509g white;
    public final /* synthetic */ ArrayList yellow;

    public /* synthetic */ n(s sVar, String str, P p4, Z z2, C0509g c0509g, ArrayList arrayList, int i4) {
        this.alpha = i4;
        this.purple = sVar;
        this.red = str;
        this.silver = p4;
        this.teal = z2;
        this.white = c0509g;
        this.yellow = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                s sVar = this.purple;
                sVar.getClass();
                StringBuilder sb2 = new StringBuilder("Use case ");
                String str = this.red;
                sb2.append(str);
                sb2.append(" UPDATED");
                sVar.uniform(sb2.toString(), null);
                sVar.alpha.blue(str, this.silver, this.teal, this.white, this.yellow);
                sVar.gold();
                return;
            default:
                s sVar2 = this.purple;
                sVar2.getClass();
                StringBuilder sb3 = new StringBuilder("Use case ");
                String str2 = this.red;
                sb3.append(str2);
                sb3.append(" ACTIVE");
                sVar2.uniform(sb3.toString(), null);
                LinkedHashMap linkedHashMap = (LinkedHashMap) sVar2.alpha.red;
                X x4 = (X) linkedHashMap.get(str2);
                P p4 = this.silver;
                Z z2 = this.teal;
                C0509g c0509g = this.white;
                ArrayList arrayList = this.yellow;
                if (x4 == null) {
                    x4 = new X(p4, z2, c0509g, arrayList);
                    linkedHashMap.put(str2, x4);
                }
                x4.foxtrot = true;
                sVar2.alpha.blue(str2, p4, z2, c0509g, arrayList);
                sVar2.gold();
                return;
        }
    }
}
