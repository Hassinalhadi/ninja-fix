package D0;

import a0.AbstractC0358l;
import a0.C0354h;
import android.graphics.RectF;
import android.text.Layout;
import androidx.compose.foundation.layout.aw;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ak {
    public final aj alpha;
    public final o bravo;
    public final long charlie;
    public final float delta;
    public final float echo;
    public final ArrayList foxtrot;

    public ak(aj ajVar, o oVar, long j5) {
        float delta;
        this.alpha = ajVar;
        this.bravo = oVar;
        this.charlie = j5;
        ArrayList arrayList = oVar.hotel;
        float f5 = 0.0f;
        if (arrayList.isEmpty()) {
            delta = 0.0f;
        } else {
            delta = ((q) arrayList.get(0)).alpha.delta.delta(0);
        }
        this.delta = delta;
        if (!arrayList.isEmpty()) {
            q qVar = (q) CollectionsKt.ochre(arrayList);
            f5 = qVar.alpha.delta.delta(r4.golf - 1) + qVar.foxtrot;
        }
        this.echo = f5;
        this.foxtrot = oVar.golf;
    }

    public final O0.j alpha(int i4) {
        int delta;
        o oVar = this.bravo;
        oVar.lima(i4);
        int length = ((g) oVar.alpha.purple).purple.length();
        ArrayList arrayList = oVar.hotel;
        if (i4 == length) {
            delta = CollectionsKt.ivory(arrayList);
        } else {
            delta = ae.delta(i4, arrayList);
        }
        q qVar = (q) arrayList.get(delta);
        a aVar = qVar.alpha;
        if (aVar.delta.foxtrot.isRtlCharAt(qVar.delta(i4))) {
            return O0.j.purple;
        }
        return O0.j.alpha;
    }

    public final Z.c bravo(int i4) {
        boolean z2;
        float india;
        float india2;
        float hotel;
        float hotel2;
        o oVar = this.bravo;
        oVar.kilo(i4);
        ArrayList arrayList = oVar.hotel;
        q qVar = (q) arrayList.get(ae.delta(i4, arrayList));
        a aVar = qVar.alpha;
        int delta = qVar.delta(i4);
        CharSequence charSequence = aVar.echo;
        if (delta < 0 || delta >= charSequence.length()) {
            StringBuilder sierra = Q0.c.sierra(delta, "offset(", ") is out of bounds [0,");
            sierra.append(charSequence.length());
            sierra.append(')');
            J0.a.alpha(sierra.toString());
        }
        E0.r rVar = aVar.delta;
        Layout layout = rVar.foxtrot;
        int lineForOffset = layout.getLineForOffset(delta);
        float golf = rVar.golf(lineForOffset);
        float echo = rVar.echo(lineForOffset);
        if (layout.getParagraphDirection(lineForOffset) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean isRtlCharAt = layout.isRtlCharAt(delta);
        if (z2 && !isRtlCharAt) {
            india = rVar.hotel(delta, false);
            india2 = rVar.hotel(delta + 1, true);
        } else {
            if (z2 && isRtlCharAt) {
                hotel = rVar.india(delta, false);
                hotel2 = rVar.india(delta + 1, true);
            } else if (isRtlCharAt) {
                hotel = rVar.hotel(delta, false);
                hotel2 = rVar.hotel(delta + 1, true);
            } else {
                india = rVar.india(delta, false);
                india2 = rVar.india(delta + 1, true);
            }
            float f5 = hotel;
            india = hotel2;
            india2 = f5;
        }
        RectF rectF = new RectF(india, golf, india2, echo);
        return qVar.alpha(new Z.c(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final Z.c charlie(int i4) {
        int delta;
        o oVar = this.bravo;
        oVar.lima(i4);
        int length = ((g) oVar.alpha.purple).purple.length();
        ArrayList arrayList = oVar.hotel;
        if (i4 == length) {
            delta = CollectionsKt.ivory(arrayList);
        } else {
            delta = ae.delta(i4, arrayList);
        }
        q qVar = (q) arrayList.get(delta);
        a aVar = qVar.alpha;
        int delta2 = qVar.delta(i4);
        CharSequence charSequence = aVar.echo;
        if (delta2 < 0 || delta2 > charSequence.length()) {
            StringBuilder sierra = Q0.c.sierra(delta2, "offset(", ") is out of bounds [0,");
            sierra.append(charSequence.length());
            sierra.append(']');
            J0.a.alpha(sierra.toString());
        }
        E0.r rVar = aVar.delta;
        float hotel = rVar.hotel(delta2, false);
        int lineForOffset = rVar.foxtrot.getLineForOffset(delta2);
        return qVar.alpha(new Z.c(hotel, rVar.golf(lineForOffset), hotel, rVar.echo(lineForOffset)));
    }

    public final float delta(int i4) {
        float f5;
        o oVar = this.bravo;
        oVar.mike(i4);
        ArrayList arrayList = oVar.hotel;
        q qVar = (q) arrayList.get(ae.echo(i4, arrayList));
        a aVar = qVar.alpha;
        int i5 = i4 - qVar.delta;
        E0.r rVar = aVar.delta;
        float lineLeft = rVar.foxtrot.getLineLeft(i5);
        if (i5 == rVar.golf - 1) {
            f5 = rVar.juliet;
        } else {
            f5 = 0.0f;
        }
        return lineLeft + f5;
    }

    public final float echo(int i4) {
        float f5;
        o oVar = this.bravo;
        oVar.mike(i4);
        ArrayList arrayList = oVar.hotel;
        q qVar = (q) arrayList.get(ae.echo(i4, arrayList));
        a aVar = qVar.alpha;
        int i5 = i4 - qVar.delta;
        E0.r rVar = aVar.delta;
        float lineRight = rVar.foxtrot.getLineRight(i5);
        if (i5 == rVar.golf - 1) {
            f5 = rVar.kilo;
        } else {
            f5 = 0.0f;
        }
        return lineRight + f5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ak) {
                ak akVar = (ak) obj;
                if (Intrinsics.areEqual(this.alpha, akVar.alpha) && Intrinsics.areEqual(this.bravo, akVar.bravo) && Q0.m.alpha(this.charlie, akVar.charlie) && this.delta == akVar.delta && this.echo == akVar.echo && Intrinsics.areEqual(this.foxtrot, akVar.foxtrot)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int foxtrot(int i4) {
        o oVar = this.bravo;
        oVar.mike(i4);
        ArrayList arrayList = oVar.hotel;
        q qVar = (q) arrayList.get(ae.echo(i4, arrayList));
        a aVar = qVar.alpha;
        return aVar.delta.foxtrot.getLineStart(i4 - qVar.delta) + qVar.bravo;
    }

    public final O0.j golf(int i4) {
        int delta;
        o oVar = this.bravo;
        oVar.lima(i4);
        int length = ((g) oVar.alpha.purple).purple.length();
        ArrayList arrayList = oVar.hotel;
        if (i4 == length) {
            delta = CollectionsKt.ivory(arrayList);
        } else {
            delta = ae.delta(i4, arrayList);
        }
        q qVar = (q) arrayList.get(delta);
        a aVar = qVar.alpha;
        int delta2 = qVar.delta(i4);
        E0.r rVar = aVar.delta;
        if (rVar.foxtrot.getParagraphDirection(rVar.foxtrot.getLineForOffset(delta2)) == 1) {
            return O0.j.alpha;
        }
        return O0.j.purple;
    }

    public final int hashCode() {
        int hashCode = (this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31;
        long j5 = this.charlie;
        return this.foxtrot.hashCode() + ao.ad.sierra(this.echo, ao.ad.sierra(this.delta, (((int) (j5 ^ (j5 >>> 32))) + hashCode) * 31, 31), 31);
    }

    public final C0354h hotel(int i4, int i5) {
        o oVar = this.bravo;
        g gVar = (g) oVar.alpha.purple;
        if (i4 < 0 || i4 > i5 || i5 > gVar.purple.length()) {
            StringBuilder hotel = av.q.hotel(i4, i5, "Start(", ") or End(", ") is out of range [0..");
            hotel.append(gVar.purple.length());
            hotel.append("), or start > end!");
            J0.a.alpha(hotel.toString());
        }
        if (i4 == i5) {
            return AbstractC0358l.alpha();
        }
        C0354h alpha = AbstractC0358l.alpha();
        ae.golf(oVar.hotel, ae.bravo(i4, i5), new aw(alpha, i4, i5, 3));
        return alpha;
    }

    public final long india(int i4) {
        int delta;
        int i5;
        int i10;
        int sierra;
        o oVar = this.bravo;
        oVar.lima(i4);
        int length = ((g) oVar.alpha.purple).purple.length();
        ArrayList arrayList = oVar.hotel;
        if (i4 == length) {
            delta = CollectionsKt.ivory(arrayList);
        } else {
            delta = ae.delta(i4, arrayList);
        }
        q qVar = (q) arrayList.get(delta);
        a aVar = qVar.alpha;
        int delta2 = qVar.delta(i4);
        F0.e juliet = aVar.delta.juliet();
        if (juliet.quebec(juliet.tango(delta2))) {
            juliet.alpha(delta2);
            i5 = delta2;
            while (i5 != -1 && (!juliet.quebec(i5) || juliet.mike(i5))) {
                i5 = juliet.tango(i5);
            }
        } else {
            juliet.alpha(delta2);
            if (juliet.papa(delta2)) {
                if (juliet.november(delta2) && !juliet.lima(delta2)) {
                    i5 = delta2;
                } else {
                    i5 = juliet.tango(delta2);
                }
            } else if (juliet.lima(delta2)) {
                i5 = juliet.tango(delta2);
            } else {
                i5 = -1;
            }
        }
        if (i5 == -1) {
            i5 = delta2;
        }
        if (juliet.mike(juliet.sierra(delta2))) {
            juliet.alpha(delta2);
            i10 = delta2;
            while (i10 != -1 && (juliet.quebec(i10) || !juliet.mike(i10))) {
                i10 = juliet.sierra(i10);
            }
        } else {
            juliet.alpha(delta2);
            if (juliet.lima(delta2)) {
                if (juliet.november(delta2) && !juliet.papa(delta2)) {
                    i10 = delta2;
                } else {
                    sierra = juliet.sierra(delta2);
                    i10 = sierra;
                }
            } else if (juliet.papa(delta2)) {
                sierra = juliet.sierra(delta2);
                i10 = sierra;
            } else {
                i10 = -1;
            }
        }
        if (i10 != -1) {
            delta2 = i10;
        }
        return qVar.bravo(ae.bravo(i5, delta2), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.alpha + ", multiParagraph=" + this.bravo + ", size=" + ((Object) Q0.m.bravo(this.charlie)) + ", firstBaseline=" + this.delta + ", lastBaseline=" + this.echo + ", placeholderRects=" + this.foxtrot + ')';
    }
}
