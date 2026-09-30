package Lb;

import androidx.appcompat.widget.P0;
import com.app.network.network.models.WorkingStatus;
import kotlin.jvm.internal.Intrinsics;
import p3.EnumC2270b;

/* loaded from: classes2.dex */
public final class aj {
    public final boolean alpha;
    public final boolean bravo;
    public final String charlie;
    public final WorkingStatus delta;
    public final p3.ah echo;
    public final boolean foxtrot;
    public final EnumC2270b golf;
    public final boolean hotel;
    public final boolean india;
    public final boolean juliet;
    public final boolean kilo;
    public final String lima;

    public aj(boolean z2, boolean z10, String str, WorkingStatus workingStatus, p3.ah ahVar, boolean z11, EnumC2270b enumC2270b, boolean z12, boolean z13, boolean z14, boolean z15, String str2) {
        this.alpha = z2;
        this.bravo = z10;
        this.charlie = str;
        this.delta = workingStatus;
        this.echo = ahVar;
        this.foxtrot = z11;
        this.golf = enumC2270b;
        this.hotel = z12;
        this.india = z13;
        this.juliet = z14;
        this.kilo = z15;
        this.lima = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj)) {
            return false;
        }
        aj ajVar = (aj) obj;
        if (this.alpha == ajVar.alpha && this.bravo == ajVar.bravo && Intrinsics.areEqual(this.charlie, ajVar.charlie) && this.delta == ajVar.delta && this.echo == ajVar.echo && this.foxtrot == ajVar.foxtrot && this.golf == ajVar.golf && this.hotel == ajVar.hotel && this.india == ajVar.india && this.juliet == ajVar.juliet && this.kilo == ajVar.kilo && Intrinsics.areEqual(this.lima, ajVar.lima)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i5;
        int hashCode;
        int hashCode2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 1237;
        if (this.alpha) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i15 = i4 * 31;
        if (this.bravo) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i16 = (i15 + i5) * 31;
        int i17 = 0;
        String str = this.charlie;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i18 = (i16 + hashCode) * 31;
        WorkingStatus workingStatus = this.delta;
        if (workingStatus == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = workingStatus.hashCode();
        }
        int hashCode3 = (this.echo.hashCode() + ((i18 + hashCode2) * 31)) * 31;
        if (this.foxtrot) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode4 = (this.golf.hashCode() + ((hashCode3 + i10) * 31)) * 31;
        if (this.hotel) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i19 = (hashCode4 + i11) * 31;
        if (this.india) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i20 = (i19 + i12) * 31;
        if (this.juliet) {
            i13 = 1231;
        } else {
            i13 = 1237;
        }
        int i21 = (i20 + i13) * 31;
        if (this.kilo) {
            i14 = 1231;
        }
        int i22 = (i21 + i14) * 31;
        String str2 = this.lima;
        if (str2 != null) {
            i17 = str2.hashCode();
        }
        return i22 + i17;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatusHeaderCardState(isSuspended=");
        sb2.append(this.alpha);
        sb2.append(", isReadyToWork=");
        sb2.append(this.bravo);
        sb2.append(", locationStatus=");
        sb2.append(this.charlie);
        sb2.append(", workingStatus=");
        sb2.append(this.delta);
        sb2.append(", stompConnectionState=");
        sb2.append(this.echo);
        sb2.append(", hasInternet=");
        sb2.append(this.foxtrot);
        sb2.append(", gpsQuality=");
        sb2.append(this.golf);
        sb2.append(", isSwitchChecked=");
        sb2.append(this.hotel);
        sb2.append(", isToggleEnabled=");
        sb2.append(this.india);
        sb2.append(", isUpdating=");
        sb2.append(this.juliet);
        sb2.append(", hasRealStompFailure=");
        sb2.append(this.kilo);
        sb2.append(", suspendedUntil=");
        return P0.gold(sb2, this.lima, ")");
    }
}
