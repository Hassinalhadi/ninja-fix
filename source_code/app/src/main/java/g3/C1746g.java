package g3;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g3.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1746g {
    public final Map alpha;
    public final boolean bravo;
    public final boolean charlie;
    public final boolean delta;
    public final boolean echo;
    public final boolean foxtrot;
    public final Integer golf;
    public final Function0 hotel;
    public final Function0 india;
    public final Function0 juliet;
    public final Function1 kilo;
    public final Function1 lima;
    public final Xd.m mike;

    public C1746g(Map priorities, boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, Integer num, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function1 function12, Xd.m mVar) {
        Intrinsics.echo(priorities, "priorities");
        this.alpha = priorities;
        this.bravo = z2;
        this.charlie = z10;
        this.delta = z11;
        this.echo = z12;
        this.foxtrot = z13;
        this.golf = num;
        this.hotel = function0;
        this.india = function02;
        this.juliet = function03;
        this.kilo = function1;
        this.lima = function12;
        this.mike = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1746g)) {
            return false;
        }
        C1746g c1746g = (C1746g) obj;
        if (Intrinsics.areEqual(this.alpha, c1746g.alpha) && this.bravo == c1746g.bravo && this.charlie == c1746g.charlie && this.delta == c1746g.delta && this.echo == c1746g.echo && this.foxtrot == c1746g.foxtrot && Intrinsics.areEqual(this.golf, c1746g.golf) && Intrinsics.areEqual(this.hotel, c1746g.hotel) && Intrinsics.areEqual(this.india, c1746g.india) && Intrinsics.areEqual(this.juliet, c1746g.juliet) && Intrinsics.areEqual(this.kilo, c1746g.kilo) && Intrinsics.areEqual(this.lima, c1746g.lima) && Intrinsics.areEqual(this.mike, c1746g.mike)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i5;
        int i10;
        int i11;
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7 = this.alpha.hashCode() * 31;
        int i12 = 1237;
        if (this.bravo) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i13 = (hashCode7 + i4) * 31;
        if (this.charlie) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i14 = (i13 + i5) * 31;
        if (this.delta) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i15 = (i14 + i10) * 31;
        if (this.echo) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i16 = (i15 + i11) * 31;
        if (this.foxtrot) {
            i12 = 1231;
        }
        int i17 = (i16 + i12) * 31;
        int i18 = 0;
        Integer num = this.golf;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i19 = (i17 + hashCode) * 31;
        Function0 function0 = this.hotel;
        if (function0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = function0.hashCode();
        }
        int i20 = (i19 + hashCode2) * 31;
        Function0 function02 = this.india;
        if (function02 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = function02.hashCode();
        }
        int i21 = (i20 + hashCode3) * 31;
        Function0 function03 = this.juliet;
        if (function03 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = function03.hashCode();
        }
        int i22 = (i21 + hashCode4) * 31;
        Function1 function1 = this.kilo;
        if (function1 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = function1.hashCode();
        }
        int i23 = (i22 + hashCode5) * 31;
        Function1 function12 = this.lima;
        if (function12 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = function12.hashCode();
        }
        int i24 = (i23 + hashCode6) * 31;
        Xd.m mVar = this.mike;
        if (mVar != null) {
            i18 = mVar.hashCode();
        }
        return i24 + i18;
    }

    public final String toString() {
        return "LocationComplianceHandlerConfig(priorities=" + this.alpha + ", showForceDialogs=" + this.bravo + ", showOptionalDialogs=" + this.charlie + ", showInfoDialogs=" + this.delta + ", enableAnimations=" + this.echo + ", enablePulseAnimation=" + this.foxtrot + ", dialogTheme=" + this.golf + ", onCompliant=" + this.hotel + ", onDismissed=" + this.india + ", onSettingsOpened=" + this.juliet + ", onActionTaken=" + this.kilo + ", onPermissionsRequested=" + this.lima + ", onPermissionsResult=" + this.mike + ")";
    }
}
