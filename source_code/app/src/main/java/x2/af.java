package x2;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.measurement.internal.C1469t;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class af extends z {
    public int A;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f14063y = new ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public boolean f14064z = true;
    public boolean B = false;
    public int C = 0;

    @Override // x2.z
    public final z alpha(x xVar) {
        super.alpha(xVar);
        return this;
    }

    @Override // x2.z
    public final void amber() {
        this.f14092r = 0L;
        int i4 = 0;
        ae aeVar = new ae(this, i4);
        while (i4 < this.f14063y.size()) {
            z zVar = (z) this.f14063y.get(i4);
            zVar.alpha(aeVar);
            zVar.amber();
            long j5 = zVar.f14092r;
            if (this.f14064z) {
                this.f14092r = Math.max(this.f14092r, j5);
            } else {
                long j6 = this.f14092r;
                zVar.f14094t = j6;
                this.f14092r = j6 + j5;
            }
            i4++;
        }
    }

    @Override // x2.z
    public final z azure(x xVar) {
        super.azure(xVar);
        return this;
    }

    @Override // x2.z
    public final void beige(View view) {
        for (int i4 = 0; i4 < this.f14063y.size(); i4++) {
            ((z) this.f14063y.get(i4)).beige(view);
        }
        this.white.remove(view);
    }

    @Override // x2.z
    public final void black(View view) {
        super.black(view);
        int size = this.f14063y.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((z) this.f14063y.get(i4)).black(view);
        }
    }

    @Override // x2.z
    public final void blue() {
        if (this.f14063y.isEmpty()) {
            gray();
            mike();
            return;
        }
        ae aeVar = new ae();
        aeVar.bravo = this;
        Iterator it = this.f14063y.iterator();
        while (it.hasNext()) {
            ((z) it.next()).alpha(aeVar);
        }
        this.A = this.f14063y.size();
        if (!this.f14064z) {
            for (int i4 = 1; i4 < this.f14063y.size(); i4++) {
                ((z) this.f14063y.get(i4 - 1)).alpha(new ae((z) this.f14063y.get(i4), 2));
            }
            z zVar = (z) this.f14063y.get(0);
            if (zVar != null) {
                zVar.blue();
                return;
            }
            return;
        }
        Iterator it2 = this.f14063y.iterator();
        while (it2.hasNext()) {
            ((z) it2.next()).blue();
        }
    }

    @Override // x2.z
    public final void bravo(View view) {
        for (int i4 = 0; i4 < this.f14063y.size(); i4++) {
            ((z) this.f14063y.get(i4)).bravo(view);
        }
        this.white.add(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // x2.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bronze(long j5, long j6) {
        boolean z2;
        long j7;
        long j10 = this.f14092r;
        long j11 = 0;
        if (this.f14077b != null) {
            if (j5 >= 0 || j6 >= 0) {
                if (j5 > j10 && j6 > j10) {
                    return;
                }
            } else {
                return;
            }
        }
        if (j5 < j6) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((j5 >= 0 && j6 < 0) || (j5 <= j10 && j6 > j10)) {
            this.f14085k = false;
            yankee(this, y.navy, z2);
        }
        if (this.f14064z) {
            for (int i4 = 0; i4 < this.f14063y.size(); i4++) {
                ((z) this.f14063y.get(i4)).bronze(j5, j6);
            }
        } else {
            int i5 = 1;
            while (true) {
                if (i5 < this.f14063y.size()) {
                    if (((z) this.f14063y.get(i5)).f14094t > j6) {
                        break;
                    } else {
                        i5++;
                    }
                } else {
                    i5 = this.f14063y.size();
                    break;
                }
            }
            int i10 = i5 - 1;
            if (j5 >= j6) {
                while (i10 < this.f14063y.size()) {
                    z zVar = (z) this.f14063y.get(i10);
                    long j12 = zVar.f14094t;
                    j7 = j11;
                    long j13 = j5 - j12;
                    if (j13 < j7) {
                        break;
                    }
                    zVar.bronze(j13, j6 - j12);
                    i10++;
                    j11 = j7;
                }
            } else {
                j7 = 0;
                while (i10 >= 0) {
                    z zVar2 = (z) this.f14063y.get(i10);
                    long j14 = zVar2.f14094t;
                    long j15 = j5 - j14;
                    zVar2.bronze(j15, j6 - j14);
                    if (j15 >= 0) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            if (this.f14077b == null) {
                if ((j5 > j10 && j6 <= j10) || (j5 < 0 && j6 >= j7)) {
                    if (j5 > j10) {
                        this.f14085k = true;
                    }
                    yankee(this, y.ochre, z2);
                    return;
                }
                return;
            }
            return;
        }
        j7 = j11;
        if (this.f14077b == null) {
        }
    }

    @Override // x2.z
    public final void cancel() {
        super.cancel();
        int size = this.f14063y.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((z) this.f14063y.get(i4)).cancel();
        }
    }

    @Override // x2.z
    public final void crimson(C3287h c3287h) {
        this.f14090p = c3287h;
        this.C |= 8;
        int size = this.f14063y.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((z) this.f14063y.get(i4)).crimson(c3287h);
        }
    }

    @Override // x2.z
    public final void delta(ai aiVar) {
        if (whiskey(aiVar.bravo)) {
            Iterator it = this.f14063y.iterator();
            while (it.hasNext()) {
                z zVar = (z) it.next();
                if (zVar.whiskey(aiVar.bravo)) {
                    zVar.delta(aiVar);
                    aiVar.charlie.add(zVar);
                }
            }
        }
    }

    @Override // x2.z
    public final void emerald(C1469t c1469t) {
        super.emerald(c1469t);
        this.C |= 4;
        if (this.f14063y != null) {
            for (int i4 = 0; i4 < this.f14063y.size(); i4++) {
                ((z) this.f14063y.get(i4)).emerald(c1469t);
            }
        }
    }

    @Override // x2.z
    public final void foxtrot(ai aiVar) {
        super.foxtrot(aiVar);
        int size = this.f14063y.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((z) this.f14063y.get(i4)).foxtrot(aiVar);
        }
    }

    @Override // x2.z
    public final void fuchsia(o oVar) {
        this.f14089o = oVar;
        this.C |= 2;
        int size = this.f14063y.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((z) this.f14063y.get(i4)).fuchsia(oVar);
        }
    }

    @Override // x2.z
    public final void gold(long j5) {
        this.purple = j5;
    }

    @Override // x2.z
    public final void golf(ai aiVar) {
        if (whiskey(aiVar.bravo)) {
            Iterator it = this.f14063y.iterator();
            while (it.hasNext()) {
                z zVar = (z) it.next();
                if (zVar.whiskey(aiVar.bravo)) {
                    zVar.golf(aiVar);
                    aiVar.charlie.add(zVar);
                }
            }
        }
    }

    @Override // x2.z
    public final String green(String str) {
        String green = super.green(str);
        for (int i4 = 0; i4 < this.f14063y.size(); i4++) {
            StringBuilder beige = ao.ad.beige(green, "\n");
            beige.append(((z) this.f14063y.get(i4)).green(str + "  "));
            green = beige.toString();
        }
        return green;
    }

    public final void indigo(aa aaVar) {
        super.alpha(aaVar);
    }

    public final void ivory(z zVar) {
        this.f14063y.add(zVar);
        zVar.f14077b = this;
        long j5 = this.red;
        if (j5 >= 0) {
            zVar.coral(j5);
        }
        if ((this.C & 1) != 0) {
            zVar.cyan(this.silver);
        }
        if ((this.C & 2) != 0) {
            zVar.fuchsia(this.f14089o);
        }
        if ((this.C & 4) != 0) {
            zVar.emerald(this.f14091q);
        }
        if ((this.C & 8) != 0) {
            zVar.crimson(this.f14090p);
        }
    }

    public final z jade(int i4) {
        if (i4 >= 0 && i4 < this.f14063y.size()) {
            return (z) this.f14063y.get(i4);
        }
        return null;
    }

    @Override // x2.z
    /* renamed from: juliet */
    public final z clone() {
        af afVar = (af) super.clone();
        afVar.f14063y = new ArrayList();
        int size = this.f14063y.size();
        for (int i4 = 0; i4 < size; i4++) {
            z clone = ((z) this.f14063y.get(i4)).clone();
            afVar.f14063y.add(clone);
            clone.f14077b = afVar;
        }
        return afVar;
    }

    public final void lavender(x xVar) {
        super.azure(xVar);
    }

    @Override // x2.z
    public final void lima(ViewGroup viewGroup, J2.i iVar, J2.i iVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j5 = this.purple;
        int size = this.f14063y.size();
        for (int i4 = 0; i4 < size; i4++) {
            z zVar = (z) this.f14063y.get(i4);
            if (j5 > 0 && (this.f14064z || i4 == 0)) {
                long j6 = zVar.purple;
                if (j6 > 0) {
                    zVar.gold(j6 + j5);
                } else {
                    zVar.gold(j5);
                }
            }
            zVar.lima(viewGroup, iVar, iVar2, arrayList, arrayList2);
        }
    }

    @Override // x2.z
    /* renamed from: lime, reason: merged with bridge method [inline-methods] */
    public final void coral(long j5) {
        ArrayList arrayList;
        this.red = j5;
        if (j5 >= 0 && (arrayList = this.f14063y) != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((z) this.f14063y.get(i4)).coral(j5);
            }
        }
    }

    @Override // x2.z
    /* renamed from: magenta, reason: merged with bridge method [inline-methods] */
    public final void cyan(TimeInterpolator timeInterpolator) {
        this.C |= 1;
        ArrayList arrayList = this.f14063y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((z) this.f14063y.get(i4)).cyan(timeInterpolator);
            }
        }
        this.silver = timeInterpolator;
    }

    public final void maroon(int i4) {
        if (i4 != 0) {
            if (i4 == 1) {
                this.f14064z = false;
                return;
            }
            throw new AndroidRuntimeException(ao.ad.zulu(i4, "Invalid parameter for TransitionSet ordering: "));
        }
        this.f14064z = true;
    }

    @Override // x2.z
    public final void november(ViewGroup viewGroup) {
        super.november(viewGroup);
        int size = this.f14063y.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((z) this.f14063y.get(i4)).november(viewGroup);
        }
    }

    @Override // x2.z
    public final boolean tango() {
        for (int i4 = 0; i4 < this.f14063y.size(); i4++) {
            if (((z) this.f14063y.get(i4)).tango()) {
                return true;
            }
        }
        return false;
    }

    @Override // x2.z
    public final boolean uniform() {
        int size = this.f14063y.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!((z) this.f14063y.get(i4)).uniform()) {
                return false;
            }
        }
        return true;
    }

    @Override // x2.z
    public final void zulu(ViewGroup viewGroup) {
        super.zulu(viewGroup);
        int size = this.f14063y.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((z) this.f14063y.get(i4)).zulu(viewGroup);
        }
    }
}
