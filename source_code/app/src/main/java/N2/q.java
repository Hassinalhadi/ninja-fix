package N2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q {
    public final Object alpha;
    public final y bravo;
    public final M2.f charlie;

    public q(Object obj, y yVar, M2.f fVar) {
        this.alpha = obj;
        this.bravo = yVar;
        this.charlie = fVar;
    }

    public final boolean equals(Object obj) {
        boolean areEqual;
        if (this != obj) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                Object obj2 = qVar.alpha;
                this.bravo.getClass();
                Object obj3 = this.alpha;
                if (obj3 != obj2) {
                    if ((obj3 instanceof X2.h) && (obj2 instanceof X2.h)) {
                        X2.h hVar = (X2.h) obj3;
                        X2.h hVar2 = (X2.h) obj2;
                        if (!Intrinsics.areEqual(hVar.alpha, hVar2.alpha) || !Intrinsics.areEqual(hVar.bravo, hVar2.bravo) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(null, null) || hVar.delta != hVar2.delta || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(hVar.foxtrot, hVar2.foxtrot) || !Intrinsics.areEqual(hVar.hotel, hVar2.hotel) || hVar.juliet != hVar2.juliet || hVar.kilo != hVar2.kilo || hVar.lima != hVar2.lima || hVar.mike != hVar2.mike || hVar.november != hVar2.november || hVar.oscar != hVar2.oscar || hVar.papa != hVar2.papa || !Intrinsics.areEqual(hVar.victor, hVar2.victor) || hVar.whiskey != hVar2.whiskey || hVar.echo != hVar2.echo || !Intrinsics.areEqual(hVar.xray, hVar2.xray)) {
                            areEqual = false;
                        }
                    } else {
                        areEqual = Intrinsics.areEqual(obj3, obj2);
                    }
                    if (areEqual || !Intrinsics.areEqual(this.charlie, qVar.charlie)) {
                    }
                }
                areEqual = true;
                if (areEqual) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int i5;
        int i10;
        int hashCode;
        this.bravo.getClass();
        Object obj = this.alpha;
        if (!(obj instanceof X2.h)) {
            if (obj != null) {
                hashCode = obj.hashCode();
            } else {
                hashCode = 0;
            }
        } else {
            X2.h hVar = (X2.h) obj;
            int hashCode2 = (hVar.hotel.hashCode() + com.google.android.material.datepicker.j.golf((hVar.delta.hashCode() + ((hVar.bravo.hashCode() + (hVar.alpha.hashCode() * 31)) * 923521)) * 961, 31, hVar.foxtrot)) * 31;
            int i11 = 1237;
            if (hVar.juliet) {
                i4 = 1231;
            } else {
                i4 = 1237;
            }
            int i12 = (hashCode2 + i4) * 31;
            if (hVar.kilo) {
                i5 = 1231;
            } else {
                i5 = 1237;
            }
            int i13 = (i12 + i5) * 31;
            if (hVar.lima) {
                i10 = 1231;
            } else {
                i10 = 1237;
            }
            int i14 = (i13 + i10) * 31;
            if (hVar.mike) {
                i11 = 1231;
            }
            hashCode = hVar.xray.alpha.hashCode() + ((hVar.echo.hashCode() + ((hVar.whiskey.hashCode() + ((hVar.victor.hashCode() + ((hVar.papa.hashCode() + ((hVar.oscar.hashCode() + ((hVar.november.hashCode() + ((i14 + i11) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }
        return this.charlie.hashCode() + (hashCode * 31);
    }
}
