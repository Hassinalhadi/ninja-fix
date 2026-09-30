package sc;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* renamed from: sc.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2847b {
    public final long alpha;
    public final EnumC2848c bravo;
    public final String charlie;
    public final String delta;
    public final Double echo;
    public final EnumC2849d foxtrot;
    public final double golf;
    public final String hotel;
    public final String india;

    public C2847b(long j5, EnumC2848c enumC2848c, String fromSectionName, String toSectionName, Double d4, EnumC2849d enumC2849d, double d9, String str, String str2) {
        Intrinsics.echo(fromSectionName, "fromSectionName");
        Intrinsics.echo(toSectionName, "toSectionName");
        this.alpha = j5;
        this.bravo = enumC2848c;
        this.charlie = fromSectionName;
        this.delta = toSectionName;
        this.echo = d4;
        this.foxtrot = enumC2849d;
        this.golf = d9;
        this.hotel = str;
        this.india = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2847b)) {
            return false;
        }
        C2847b c2847b = (C2847b) obj;
        if (this.alpha == c2847b.alpha && this.bravo == c2847b.bravo && Intrinsics.areEqual(this.charlie, c2847b.charlie) && Intrinsics.areEqual(this.delta, c2847b.delta) && Intrinsics.areEqual(this.echo, c2847b.echo) && this.foxtrot == c2847b.foxtrot && Double.compare(this.golf, c2847b.golf) == 0 && Intrinsics.areEqual(this.hotel, c2847b.hotel) && Intrinsics.areEqual(this.india, c2847b.india)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long j5 = this.alpha;
        int sierra = AbstractC2327c.sierra(AbstractC2327c.sierra((this.bravo.hashCode() + (((int) (j5 ^ (j5 >>> 32))) * 31)) * 31, 31, this.charlie), 31, this.delta);
        int i4 = 0;
        Double d4 = this.echo;
        if (d4 == null) {
            hashCode = 0;
        } else {
            hashCode = d4.hashCode();
        }
        int hashCode3 = (this.foxtrot.hashCode() + ((sierra + hashCode) * 31)) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.golf);
        int i5 = (hashCode3 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        String str = this.hotel;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        String str2 = this.india;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i10 + i4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RepositionAssignment(id=");
        sb2.append(this.alpha);
        sb2.append(", status=");
        sb2.append(this.bravo);
        sb2.append(", fromSectionName=");
        sb2.append(this.charlie);
        sb2.append(", toSectionName=");
        sb2.append(this.delta);
        sb2.append(", amount=");
        sb2.append(this.echo);
        sb2.append(", transferMode=");
        sb2.append(this.foxtrot);
        sb2.append(", distanceInKm=");
        sb2.append(this.golf);
        sb2.append(", title=");
        sb2.append(this.hotel);
        sb2.append(", message=");
        return P0.gold(sb2, this.india, ")");
    }
}
