package X2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* loaded from: classes3.dex */
public final class k {
    public final Context alpha;
    public final Bitmap.Config bravo;
    public final ColorSpace charlie;
    public final Y2.h delta;
    public final Y2.g echo;
    public final boolean foxtrot;
    public final boolean golf;
    public final boolean hotel;
    public final String india;
    public final Headers juliet;
    public final n kilo;
    public final l lima;
    public final a mike;
    public final a november;
    public final a oscar;

    public k(Context context, Bitmap.Config config, ColorSpace colorSpace, Y2.h hVar, Y2.g gVar, boolean z2, boolean z10, boolean z11, String str, Headers headers, n nVar, l lVar, a aVar, a aVar2, a aVar3) {
        this.alpha = context;
        this.bravo = config;
        this.charlie = colorSpace;
        this.delta = hVar;
        this.echo = gVar;
        this.foxtrot = z2;
        this.golf = z10;
        this.hotel = z11;
        this.india = str;
        this.juliet = headers;
        this.kilo = nVar;
        this.lima = lVar;
        this.mike = aVar;
        this.november = aVar2;
        this.oscar = aVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (Intrinsics.areEqual(this.alpha, kVar.alpha) && this.bravo == kVar.bravo) {
                if ((Build.VERSION.SDK_INT < 26 || Intrinsics.areEqual(this.charlie, kVar.charlie)) && Intrinsics.areEqual(this.delta, kVar.delta) && this.echo == kVar.echo && this.foxtrot == kVar.foxtrot && this.golf == kVar.golf && this.hotel == kVar.hotel && Intrinsics.areEqual(this.india, kVar.india) && Intrinsics.areEqual(this.juliet, kVar.juliet) && Intrinsics.areEqual(this.kilo, kVar.kilo) && Intrinsics.areEqual(this.lima, kVar.lima) && this.mike == kVar.mike && this.november == kVar.november && this.oscar == kVar.oscar) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i5;
        int i10;
        int hashCode = (this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.charlie;
        int i11 = 0;
        if (colorSpace != null) {
            i4 = colorSpace.hashCode();
        } else {
            i4 = 0;
        }
        int hashCode2 = (this.echo.hashCode() + ((this.delta.hashCode() + ((hashCode + i4) * 31)) * 31)) * 31;
        int i12 = 1237;
        if (this.foxtrot) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i13 = (hashCode2 + i5) * 31;
        if (this.golf) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i14 = (i13 + i10) * 31;
        if (this.hotel) {
            i12 = 1231;
        }
        int i15 = (i14 + i12) * 31;
        String str = this.india;
        if (str != null) {
            i11 = str.hashCode();
        }
        return this.oscar.hashCode() + ((this.november.hashCode() + ((this.mike.hashCode() + ((this.lima.alpha.hashCode() + ((this.kilo.alpha.hashCode() + ((this.juliet.hashCode() + ((i15 + i11) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
