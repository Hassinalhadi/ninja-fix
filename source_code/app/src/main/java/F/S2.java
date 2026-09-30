package F;

import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* loaded from: classes3.dex */
public final class S2 {
    public final D0.an alpha;
    public final D0.an bravo;
    public final D0.an charlie;
    public final D0.an delta;
    public final D0.an echo;
    public final D0.an foxtrot;
    public final D0.an golf;
    public final D0.an hotel;
    public final D0.an india;
    public final D0.an juliet;
    public final D0.an kilo;
    public final D0.an lima;
    public final D0.an mike;
    public final D0.an november;
    public final D0.an oscar;

    public S2(D0.an anVar, D0.an anVar2, D0.an anVar3, D0.an anVar4, D0.an anVar5, D0.an anVar6, D0.an anVar7, D0.an anVar8, D0.an anVar9, D0.an anVar10, D0.an anVar11, D0.an anVar12, D0.an anVar13, D0.an anVar14, D0.an anVar15) {
        this.alpha = anVar;
        this.bravo = anVar2;
        this.charlie = anVar3;
        this.delta = anVar4;
        this.echo = anVar5;
        this.foxtrot = anVar6;
        this.golf = anVar7;
        this.hotel = anVar8;
        this.india = anVar9;
        this.juliet = anVar10;
        this.kilo = anVar11;
        this.lima = anVar12;
        this.mike = anVar13;
        this.november = anVar14;
        this.oscar = anVar15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S2)) {
            return false;
        }
        S2 s22 = (S2) obj;
        if (Intrinsics.areEqual(this.alpha, s22.alpha) && Intrinsics.areEqual(this.bravo, s22.bravo) && Intrinsics.areEqual(this.charlie, s22.charlie) && Intrinsics.areEqual(this.delta, s22.delta) && Intrinsics.areEqual(this.echo, s22.echo) && Intrinsics.areEqual(this.foxtrot, s22.foxtrot) && Intrinsics.areEqual(this.golf, s22.golf) && Intrinsics.areEqual(this.hotel, s22.hotel) && Intrinsics.areEqual(this.india, s22.india) && Intrinsics.areEqual(this.juliet, s22.juliet) && Intrinsics.areEqual(this.kilo, s22.kilo) && Intrinsics.areEqual(this.lima, s22.lima) && Intrinsics.areEqual(this.mike, s22.mike) && Intrinsics.areEqual(this.november, s22.november) && Intrinsics.areEqual(this.oscar, s22.oscar)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.oscar.hashCode() + AbstractC2327c.romeo(AbstractC2327c.romeo(AbstractC2327c.romeo(AbstractC2327c.romeo(AbstractC2327c.romeo(AbstractC2327c.romeo(AbstractC2327c.romeo(AbstractC2327c.romeo(AbstractC2327c.romeo(AbstractC2327c.romeo(AbstractC2327c.romeo(AbstractC2327c.romeo(AbstractC2327c.romeo(this.alpha.hashCode() * 31, 31, this.bravo), 31, this.charlie), 31, this.delta), 31, this.echo), 31, this.foxtrot), 31, this.golf), 31, this.hotel), 31, this.india), 31, this.juliet), 31, this.kilo), 31, this.lima), 31, this.mike), 31, this.november);
    }

    public final String toString() {
        return "Typography(displayLarge=" + this.alpha + ", displayMedium=" + this.bravo + ",displaySmall=" + this.charlie + ", headlineLarge=" + this.delta + ", headlineMedium=" + this.echo + ", headlineSmall=" + this.foxtrot + ", titleLarge=" + this.golf + ", titleMedium=" + this.hotel + ", titleSmall=" + this.india + ", bodyLarge=" + this.juliet + ", bodyMedium=" + this.kilo + ", bodySmall=" + this.lima + ", labelLarge=" + this.mike + ", labelMedium=" + this.november + ", labelSmall=" + this.oscar + ')';
    }
}
