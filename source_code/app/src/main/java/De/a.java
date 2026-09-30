package De;

import av.q;
import com.google.android.material.datepicker.j;
import com.google.maps.android.BuildConfig;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ae;

/* loaded from: classes2.dex */
public final class a {
    public final int alpha;
    public final int bravo;
    public final boolean charlie;
    public final boolean delta;
    public final Set echo;
    public final ae foxtrot;

    public a(int i4, int i5, boolean z2, boolean z10, Set set, ae aeVar) {
        j.papa(i4, "howThisTypeIsUsed");
        j.papa(i5, "flexibility");
        this.alpha = i4;
        this.bravo = i5;
        this.charlie = z2;
        this.delta = z10;
        this.echo = set;
        this.foxtrot = aeVar;
    }

    public static a alpha(a aVar, int i4, boolean z2, Set set, ae aeVar, int i5) {
        int i10 = aVar.alpha;
        if ((i5 & 2) != 0) {
            i4 = aVar.bravo;
        }
        int i11 = i4;
        if ((i5 & 4) != 0) {
            z2 = aVar.charlie;
        }
        boolean z10 = z2;
        boolean z11 = aVar.delta;
        if ((i5 & 16) != 0) {
            set = aVar.echo;
        }
        Set set2 = set;
        if ((i5 & 32) != 0) {
            aeVar = aVar.foxtrot;
        }
        aVar.getClass();
        j.papa(i10, "howThisTypeIsUsed");
        j.papa(i11, "flexibility");
        return new a(i10, i11, z10, z11, set2, aeVar);
    }

    public final a bravo(int i4) {
        j.papa(i4, "flexibility");
        return alpha(this, i4, false, null, null, 61);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (Intrinsics.areEqual(aVar.foxtrot, this.foxtrot)) {
                if (aVar.alpha == this.alpha && aVar.bravo == this.bravo && aVar.charlie == this.charlie && aVar.delta == this.delta) {
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
        ae aeVar = this.foxtrot;
        if (aeVar != null) {
            i4 = aeVar.hashCode();
        } else {
            i4 = 0;
        }
        int mike = q.mike(this.alpha) + (i4 * 31) + i4;
        int mike2 = q.mike(this.bravo) + (mike * 31) + mike;
        int i5 = (mike2 * 31) + (this.charlie ? 1 : 0) + mike2;
        return (i5 * 31) + (this.delta ? 1 : 0) + i5;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("JavaTypeAttributes(howThisTypeIsUsed=");
        int i4 = this.alpha;
        if (i4 != 1) {
            if (i4 != 2) {
                str = BuildConfig.TRAVIS;
            } else {
                str = "COMMON";
            }
        } else {
            str = "SUPERTYPE";
        }
        sb2.append(str);
        sb2.append(", flexibility=");
        int i5 = this.bravo;
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    str2 = BuildConfig.TRAVIS;
                } else {
                    str2 = "FLEXIBLE_LOWER_BOUND";
                }
            } else {
                str2 = "FLEXIBLE_UPPER_BOUND";
            }
        } else {
            str2 = "INFLEXIBLE";
        }
        sb2.append(str2);
        sb2.append(", isRaw=");
        sb2.append(this.charlie);
        sb2.append(", isForAnnotationParameter=");
        sb2.append(this.delta);
        sb2.append(", visitedTypeParameters=");
        sb2.append(this.echo);
        sb2.append(", defaultType=");
        sb2.append(this.foxtrot);
        sb2.append(')');
        return sb2.toString();
    }

    public /* synthetic */ a(int i4, boolean z2, boolean z10, Set set, int i5) {
        this(i4, 1, (i5 & 4) != 0 ? false : z2, (i5 & 8) != 0 ? false : z10, (i5 & 16) != 0 ? null : set, null);
    }
}
