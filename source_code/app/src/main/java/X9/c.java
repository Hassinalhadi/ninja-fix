package X9;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c {
    public final boolean alpha;
    public final String bravo;
    public final b charlie;
    public final Boolean delta;
    public final Boolean echo;
    public final Boolean foxtrot;
    public final Boolean golf;
    public final Boolean hotel;
    public final Boolean india;
    public final Boolean juliet;
    public final Boolean kilo;
    public final Boolean lima;
    public final String mike;
    public final Boolean november;
    public final Boolean oscar;
    public final Boolean papa;

    public c(boolean z2, String str, b bVar, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, String str2, Boolean bool10, Boolean bool11, Boolean bool12) {
        this.alpha = z2;
        this.bravo = str;
        this.charlie = bVar;
        this.delta = bool;
        this.echo = bool2;
        this.foxtrot = bool3;
        this.golf = bool4;
        this.hotel = bool5;
        this.india = bool6;
        this.juliet = bool7;
        this.kilo = bool8;
        this.lima = bool9;
        this.mike = str2;
        this.november = bool10;
        this.oscar = bool11;
        this.papa = bool12;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.alpha != cVar.alpha || !Intrinsics.areEqual(this.bravo, cVar.bravo) || this.charlie != cVar.charlie || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(this.delta, cVar.delta) || !Intrinsics.areEqual(this.echo, cVar.echo) || !Intrinsics.areEqual(this.foxtrot, cVar.foxtrot) || !Intrinsics.areEqual(this.golf, cVar.golf) || !Intrinsics.areEqual(this.hotel, cVar.hotel) || !Intrinsics.areEqual(this.india, cVar.india) || !Intrinsics.areEqual(this.juliet, cVar.juliet) || !Intrinsics.areEqual(this.kilo, cVar.kilo) || !Intrinsics.areEqual(this.lima, cVar.lima) || !Intrinsics.areEqual(this.mike, cVar.mike) || !Intrinsics.areEqual(this.november, cVar.november) || !Intrinsics.areEqual(this.oscar, cVar.oscar) || !Intrinsics.areEqual(this.papa, cVar.papa)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int hashCode;
        if (this.alpha) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i5 = i4 * 31;
        int i10 = 0;
        String str = this.bravo;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = (this.lima.hashCode() + ((this.kilo.hashCode() + ((this.juliet.hashCode() + ((this.india.hashCode() + ((this.hotel.hashCode() + ((this.golf.hashCode() + ((this.foxtrot.hashCode() + ((this.echo.hashCode() + ((this.delta.hashCode() + ((this.charlie.hashCode() + ((i5 + hashCode) * 31)) * 961)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str2 = this.mike;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return this.papa.hashCode() + ((this.oscar.hashCode() + ((this.november.hashCode() + ((hashCode2 + i10) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Result(isOfficialSigner=" + this.alpha + ", signerSha256=" + this.bravo + ", reason=" + this.charlie + ", hasRogueLoadedLibrary=null, isSignerAllowed=" + this.delta + ", hasSuspiciousNativePayload=" + this.echo + ", hasSuspiciousBridgeClass=" + this.foxtrot + ", hasSuspiciousHackClass=" + this.golf + ", isDebuggerAttached=" + this.hotel + ", hasFridaIndicators=" + this.india + ", hasXposedIndicators=" + this.juliet + ", hasLsposedIndicators=" + this.kilo + ", hasHookFrameworkIndicators=" + this.lima + ", hookFrameworkConfidence=" + this.mike + ", isApplicationHijacked=" + this.november + ", hasPackedDex=" + this.oscar + ", diskSignerMismatch=" + this.papa + ")";
    }
}
