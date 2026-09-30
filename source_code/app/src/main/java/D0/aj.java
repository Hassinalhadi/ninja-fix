package D0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;
import s6.D6;

/* loaded from: classes3.dex */
public final class aj {
    public final g alpha;
    public final an bravo;
    public final List charlie;
    public final int delta;
    public final boolean echo;
    public final int foxtrot;
    public final Q0.d golf;
    public final Q0.n hotel;
    public final H0.j india;
    public final long juliet;

    public aj(g gVar, an anVar, List list, int i4, boolean z2, int i5, Q0.d dVar, Q0.n nVar, H0.j jVar, long j5) {
        this.alpha = gVar;
        this.bravo = anVar;
        this.charlie = list;
        this.delta = i4;
        this.echo = z2;
        this.foxtrot = i5;
        this.golf = dVar;
        this.hotel = nVar;
        this.india = jVar;
        this.juliet = j5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof aj) {
                aj ajVar = (aj) obj;
                if (Intrinsics.areEqual(this.alpha, ajVar.alpha) && Intrinsics.areEqual(this.bravo, ajVar.bravo) && Intrinsics.areEqual(this.charlie, ajVar.charlie) && this.delta == ajVar.delta && this.echo == ajVar.echo && this.foxtrot == ajVar.foxtrot && Intrinsics.areEqual(this.golf, ajVar.golf) && this.hotel == ajVar.hotel && Intrinsics.areEqual(this.india, ajVar.india) && Q0.a.bravo(this.juliet, ajVar.juliet)) {
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
        int golf = (com.google.android.material.datepicker.j.golf(AbstractC2327c.romeo(this.alpha.hashCode() * 31, 31, this.bravo), 31, this.charlie) + this.delta) * 31;
        if (this.echo) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int hashCode = (this.india.hashCode() + ((this.hotel.hashCode() + ((this.golf.hashCode() + ((((golf + i4) * 31) + this.foxtrot) * 31)) * 31)) * 31)) * 31;
        long j5 = this.juliet;
        return ((int) ((j5 >>> 32) ^ j5)) + hashCode;
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.alpha) + ", style=" + this.bravo + ", placeholders=" + this.charlie + ", maxLines=" + this.delta + ", softWrap=" + this.echo + ", overflow=" + ((Object) D6.juliet(this.foxtrot)) + ", density=" + this.golf + ", layoutDirection=" + this.hotel + ", fontFamilyResolver=" + this.india + ", constraints=" + ((Object) Q0.a.kilo(this.juliet)) + ')';
    }
}
