package a1;

import androidx.appcompat.widget.P0;
import ao.ad;
import com.clevertap.android.sdk.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import r6.u;

/* loaded from: classes3.dex */
public final class n {
    public static int foxtrot;
    public ArrayList alpha;
    public int bravo;
    public int charlie;
    public ArrayList delta;
    public int echo;

    public final void alpha(ArrayList arrayList) {
        int size = this.alpha.size();
        if (this.echo != -1 && size > 0) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                n nVar = (n) arrayList.get(i4);
                if (this.echo == nVar.bravo) {
                    charlie(this.charlie, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int bravo(W0.c cVar, int i4) {
        int november;
        int november2;
        ArrayList arrayList = this.alpha;
        if (arrayList.size() == 0) {
            return 0;
        }
        Z0.e eVar = (Z0.e) ((Z0.d) arrayList.get(0)).magenta;
        cVar.tango();
        eVar.bravo(cVar, false);
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            ((Z0.d) arrayList.get(i5)).bravo(cVar, false);
        }
        if (i4 == 0 && eVar.f2465r > 0) {
            Z0.j.alpha(eVar, cVar, arrayList, 0);
        }
        if (i4 == 1 && eVar.f2466s > 0) {
            Z0.j.alpha(eVar, cVar, arrayList, 1);
        }
        try {
            cVar.papa();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace(Constants.AES_PREFIX, "   at ").replace(Constants.SEPARATOR_COMMA, "\n   at").replace(Constants.AES_SUFFIX, ""));
        }
        this.delta = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Z0.d dVar = (Z0.d) arrayList.get(i10);
            u uVar = new u(13);
            new WeakReference(dVar);
            W0.c.november(dVar.cyan);
            W0.c.november(dVar.emerald);
            W0.c.november(dVar.fuchsia);
            W0.c.november(dVar.gold);
            W0.c.november(dVar.gray);
            this.delta.add(uVar);
        }
        if (i4 == 0) {
            november = W0.c.november(eVar.cyan);
            november2 = W0.c.november(eVar.fuchsia);
            cVar.tango();
        } else {
            november = W0.c.november(eVar.emerald);
            november2 = W0.c.november(eVar.gold);
            cVar.tango();
        }
        return november2 - november;
    }

    public final void charlie(int i4, n nVar) {
        Iterator it = this.alpha.iterator();
        while (it.hasNext()) {
            Z0.d dVar = (Z0.d) it.next();
            ArrayList arrayList = nVar.alpha;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            int i5 = nVar.bravo;
            if (i4 == 0) {
                dVar.f2452f = i5;
            } else {
                dVar.f2453g = i5;
            }
        }
        this.echo = nVar.bravo;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i4 = this.charlie;
        if (i4 == 0) {
            str = "Horizontal";
        } else if (i4 == 1) {
            str = "Vertical";
        } else if (i4 == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb2.append(str);
        sb2.append(" [");
        String cyan = P0.cyan(sb2, this.bravo, "] <");
        Iterator it = this.alpha.iterator();
        while (it.hasNext()) {
            Z0.d dVar = (Z0.d) it.next();
            StringBuilder beige = ad.beige(cyan, " ");
            beige.append(dVar.yellow);
            cyan = beige.toString();
        }
        return P0.crimson(cyan, " >");
    }
}
