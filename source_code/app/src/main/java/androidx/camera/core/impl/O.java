package androidx.camera.core.impl;

import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public final class O extends K {
    public final a3.l india = new a3.l(4);
    public boolean juliet = true;
    public boolean kilo = false;
    public final ArrayList lima = new ArrayList();

    public final void alpha(P p4) {
        Object obj;
        ad adVar = p4.golf;
        int i4 = adVar.charlie;
        S2.l lVar = this.bravo;
        if (i4 != -1) {
            this.kilo = true;
            int i5 = lVar.alpha;
            Integer valueOf = Integer.valueOf(i4);
            List list = P.india;
            if (list.indexOf(valueOf) < list.indexOf(Integer.valueOf(i5))) {
                i4 = i5;
            }
            lVar.alpha = i4;
        }
        C0505c c0505c = ad.juliet;
        Object obj2 = C0509g.foxtrot;
        B b2 = adVar.bravo;
        try {
            obj2 = b2.quebec(c0505c);
        } catch (IllegalArgumentException unused) {
        }
        Range range = (Range) obj2;
        Objects.requireNonNull(range);
        Range range2 = C0509g.foxtrot;
        if (!range.equals(range2)) {
            aw awVar = (aw) lVar.silver;
            C0505c c0505c2 = ad.juliet;
            awVar.getClass();
            try {
                obj = awVar.quebec(c0505c2);
            } catch (IllegalArgumentException unused2) {
                obj = range2;
            }
            if (((Range) obj).equals(range2)) {
                ((aw) lVar.silver).hotel(ad.juliet, range);
            } else {
                aw awVar2 = (aw) lVar.silver;
                C0505c c0505c3 = ad.juliet;
                Object obj3 = C0509g.foxtrot;
                awVar2.getClass();
                try {
                    obj3 = awVar2.quebec(c0505c3);
                } catch (IllegalArgumentException unused3) {
                }
                if (!((Range) obj3).equals(range)) {
                    this.juliet = false;
                    AbstractC3066u3.bravo("ValidatingBuilder", "Different ExpectedFrameRateRange values");
                }
            }
        }
        int alpha = adVar.alpha();
        if (alpha != 0) {
            lVar.getClass();
            if (alpha != 0) {
                ((aw) lVar.silver).hotel(Z.black, Integer.valueOf(alpha));
            }
        }
        int bravo = adVar.bravo();
        if (bravo != 0) {
            lVar.getClass();
            if (bravo != 0) {
                ((aw) lVar.silver).hotel(Z.blue, Integer.valueOf(bravo));
            }
        }
        ad adVar2 = p4.golf;
        ((ay) lVar.white).alpha.putAll((Map) adVar2.foxtrot.alpha);
        this.charlie.addAll(p4.charlie);
        this.delta.addAll(p4.delta);
        lVar.charlie(adVar2.delta);
        this.echo.addAll(p4.echo);
        N n5 = p4.foxtrot;
        if (n5 != null) {
            this.lima.add(n5);
        }
        InputConfiguration inputConfiguration = p4.hotel;
        if (inputConfiguration != null) {
            this.golf = inputConfiguration;
        }
        LinkedHashSet<C0507e> linkedHashSet = this.alpha;
        linkedHashSet.addAll(p4.alpha);
        HashSet hashSet = (HashSet) lVar.red;
        hashSet.addAll(Collections.unmodifiableList(adVar.alpha));
        ArrayList arrayList = new ArrayList();
        for (C0507e c0507e : linkedHashSet) {
            arrayList.add(c0507e.alpha);
            Iterator it = c0507e.bravo.iterator();
            while (it.hasNext()) {
                arrayList.add((ah) it.next());
            }
        }
        if (!arrayList.containsAll(hashSet)) {
            AbstractC3066u3.bravo("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
            this.juliet = false;
        }
        C0507e c0507e2 = p4.bravo;
        if (c0507e2 != null) {
            C0507e c0507e3 = this.hotel;
            if (c0507e3 != c0507e2 && c0507e3 != null) {
                AbstractC3066u3.bravo("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                this.juliet = false;
            } else {
                this.hotel = c0507e2;
            }
        }
        lVar.echo(b2);
    }

    public final P bravo() {
        androidx.camera.core.x xVar;
        if (this.juliet) {
            ArrayList arrayList = new ArrayList(this.alpha);
            a3.l lVar = this.india;
            if (lVar.alpha) {
                Collections.sort(arrayList, new A0.ae(2, lVar));
            }
            if (!this.lima.isEmpty()) {
                xVar = new androidx.camera.core.x(3, this);
            } else {
                xVar = null;
            }
            return new P(arrayList, new ArrayList(this.charlie), new ArrayList(this.delta), new ArrayList(this.echo), this.bravo.hotel(), xVar, this.golf, this.hotel);
        }
        throw new IllegalArgumentException("Unsupported session configuration combination");
    }
}
