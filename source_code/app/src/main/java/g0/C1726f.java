package g0;

import a0.C0366t;
import com.google.android.gms.measurement.internal.C1469t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1726f {
    public static int kilo;
    public static final C1469t lima = new C1469t(9);
    public final String alpha;
    public final float bravo;
    public final float charlie;
    public final float delta;
    public final float echo;
    public final ag foxtrot;
    public final long golf;
    public final int hotel;
    public final boolean india;
    public final int juliet;

    public C1726f(String str, float f5, float f10, float f11, float f12, ag agVar, long j5, int i4, boolean z2) {
        int i5;
        synchronized (lima) {
            i5 = kilo;
            kilo = i5 + 1;
        }
        this.alpha = str;
        this.bravo = f5;
        this.charlie = f10;
        this.delta = f11;
        this.echo = f12;
        this.foxtrot = agVar;
        this.golf = j5;
        this.hotel = i4;
        this.india = z2;
        this.juliet = i5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1726f) {
                C1726f c1726f = (C1726f) obj;
                if (Intrinsics.areEqual(this.alpha, c1726f.alpha) && Q0.g.alpha(this.bravo, c1726f.bravo) && Q0.g.alpha(this.charlie, c1726f.charlie) && this.delta == c1726f.delta && this.echo == c1726f.echo && Intrinsics.areEqual(this.foxtrot, c1726f.foxtrot) && C0366t.charlie(this.golf, c1726f.golf) && this.hotel == c1726f.hotel && this.india == c1726f.india) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int hashCode = (this.foxtrot.hashCode() + ao.ad.sierra(this.echo, ao.ad.sierra(this.delta, ao.ad.sierra(this.charlie, ao.ad.sierra(this.bravo, this.alpha.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i5 = C0366t.lima;
        int whiskey = (ao.ad.whiskey(hashCode, 31, this.golf) + this.hotel) * 31;
        if (this.india) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return whiskey + i4;
    }
}
