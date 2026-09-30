package g0;

import a0.AbstractC0362p;
import a0.C0366t;
import a0.au;
import androidx.appcompat.widget.P0;
import java.util.ArrayList;
import java.util.List;
import p0.AbstractC2264a;

/* renamed from: g0.e */
/* loaded from: classes3.dex */
public final class C1725e {
    public final String alpha;
    public final float bravo;
    public final float charlie;
    public final float delta;
    public final float echo;
    public final long foxtrot;
    public final int golf;
    public final boolean hotel;
    public final ArrayList india;
    public final C1724d juliet;
    public boolean kilo;

    public C1725e(String str, float f5, float f10, float f11, float f12, long j5, int i4, boolean z2, int i5) {
        long j6;
        int i10;
        boolean z10;
        str = (i5 & 1) != 0 ? "" : str;
        if ((i5 & 32) != 0) {
            j6 = C0366t.kilo;
        } else {
            j6 = j5;
        }
        if ((i5 & 64) != 0) {
            i10 = 5;
        } else {
            i10 = i4;
        }
        if ((i5 & 128) != 0) {
            z10 = false;
        } else {
            z10 = z2;
        }
        this.alpha = str;
        this.bravo = f5;
        this.charlie = f10;
        this.delta = f11;
        this.echo = f12;
        this.foxtrot = j6;
        this.golf = i10;
        this.hotel = z10;
        ArrayList arrayList = new ArrayList();
        this.india = arrayList;
        C1724d c1724d = new C1724d(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.juliet = c1724d;
        arrayList.add(c1724d);
    }

    public static void bravo(C1725e c1725e, String str, List list) {
        c1725e.alpha(str, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list);
    }

    public static /* synthetic */ void delta(C1725e c1725e, ArrayList arrayList, int i4, au auVar) {
        c1725e.charlie(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, i4, 0, 2, auVar, null, "", arrayList);
    }

    public final void alpha(String str, float f5, float f10, float f11, float f12, float f13, float f14, float f15, List list) {
        if (this.kilo) {
            AbstractC2264a.bravo("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        this.india.add(new C1724d(str, f5, f10, f11, f12, f13, f14, f15, list, 512));
    }

    public final void charlie(float f5, float f10, float f11, float f12, float f13, float f14, float f15, int i4, int i5, int i10, AbstractC0362p abstractC0362p, AbstractC0362p abstractC0362p2, String str, List list) {
        if (this.kilo) {
            AbstractC2264a.bravo("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((C1724d) P0.amber(1, this.india)).juliet.add(new ak(f5, f10, f11, f12, f13, f14, f15, i4, i5, i10, abstractC0362p, abstractC0362p2, str, list));
    }

    public final C1726f echo() {
        if (this.kilo) {
            AbstractC2264a.bravo("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (this.india.size() > 1) {
            foxtrot();
        }
        C1724d c1724d = this.juliet;
        C1726f c1726f = new C1726f(this.alpha, this.bravo, this.charlie, this.delta, this.echo, new ag(c1724d.alpha, c1724d.bravo, c1724d.charlie, c1724d.delta, c1724d.echo, c1724d.foxtrot, c1724d.golf, c1724d.hotel, c1724d.india, c1724d.juliet), this.foxtrot, this.golf, this.hotel);
        this.kilo = true;
        return c1726f;
    }

    public final void foxtrot() {
        if (this.kilo) {
            AbstractC2264a.bravo("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ArrayList arrayList = this.india;
        C1724d c1724d = (C1724d) arrayList.remove(arrayList.size() - 1);
        ((C1724d) P0.amber(1, arrayList)).juliet.add(new ag(c1724d.alpha, c1724d.bravo, c1724d.charlie, c1724d.delta, c1724d.echo, c1724d.foxtrot, c1724d.golf, c1724d.hotel, c1724d.india, c1724d.juliet));
    }
}
