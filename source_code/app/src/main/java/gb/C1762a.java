package gb;

import H0.v;
import Q0.g;
import Q0.p;
import a0.C0366t;
import ao.ad;
import av.q;
import com.google.android.material.datepicker.j;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: gb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1762a {
    public final long alpha;
    public final long bravo;
    public final long charlie;
    public final v delta;
    public final float echo;
    public final float foxtrot;
    public final float golf;

    public C1762a(long j5, long j6, long j7, v fontWeight, float f5, float f10, float f11) {
        Intrinsics.echo(fontWeight, "fontWeight");
        this.alpha = j5;
        this.bravo = j6;
        this.charlie = j7;
        this.delta = fontWeight;
        this.echo = f5;
        this.foxtrot = f10;
        this.golf = f11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1762a) {
                C1762a c1762a = (C1762a) obj;
                if (!C0366t.charlie(this.alpha, c1762a.alpha) || !C0366t.charlie(this.bravo, c1762a.bravo) || !p.alpha(this.charlie, c1762a.charlie) || !Intrinsics.areEqual(this.delta, c1762a.delta) || !g.alpha(this.echo, c1762a.echo) || !g.alpha(this.foxtrot, c1762a.foxtrot) || !g.alpha(this.golf, c1762a.golf) || !Intrinsics.areEqual(null, null)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4 = C0366t.lima;
        return ad.sierra(this.golf, ad.sierra(this.foxtrot, ad.sierra(this.echo, (((p.delta(this.charlie) + ad.whiskey(kotlin.p.alpha(this.alpha) * 31, 31, this.bravo)) * 31) + this.delta.alpha) * 31, 31), 31), 31);
    }

    public final String toString() {
        String india = C0366t.india(this.alpha);
        String india2 = C0366t.india(this.bravo);
        String echo = p.echo(this.charlie);
        String bravo = g.bravo(this.echo);
        String bravo2 = g.bravo(this.foxtrot);
        String bravo3 = g.bravo(this.golf);
        StringBuilder india3 = q.india("TagStyle(background=", india, ", textColor=", india2, ", fontSize=");
        india3.append(echo);
        india3.append(", fontWeight=");
        india3.append(this.delta);
        india3.append(", paddingHorizontal=");
        india3.append(bravo);
        india3.append(", paddingVertical=");
        return j.lima(india3, bravo2, ", cornerRadius=", bravo3, ", lineHeight=null)");
    }
}
