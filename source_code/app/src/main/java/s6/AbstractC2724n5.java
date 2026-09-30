package s6;

import android.graphics.Typeface;
import android.os.Build;
import ic.C1911b;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s6.n5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2724n5 {
    public static C1911b alpha(String str, String str2, String str3, String str4, List gifs, int i4) {
        Intrinsics.echo(gifs, "gifs");
        C1911b c1911b = new C1911b();
        c1911b.setArguments(S6.charlie(new Pair("t", str), new Pair("m", str2), new Pair("p1", str3), new Pair("p2", str4), new Pair("ac", Integer.valueOf(i4)), new Pair("gifs", CollectionsKt.y(gifs))));
        c1911b.oscar(true);
        return c1911b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bravo(int i4, Object obj, H0.i iVar, H0.v vVar, int i5) {
        Object[] objArr;
        Object[] objArr2;
        int i10;
        Typeface create;
        Object[] objArr3;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z2 = false;
        int i11 = 0;
        z2 = false;
        if ((i4 & 1) != 0) {
            H0.z zVar = (H0.z) iVar;
            if (!Intrinsics.areEqual(zVar.bravo, vVar)) {
                H0.v vVar2 = H0.v.silver;
                if (vVar.compareTo(vVar2) >= 0 && Intrinsics.golf(zVar.bravo.alpha, vVar2.alpha) < 0) {
                    objArr = true;
                    if ((i4 & 2) == 0 && i5 != ((H0.z) iVar).charlie) {
                        objArr2 = true;
                    } else {
                        objArr2 = false;
                    }
                    if (objArr2 != false && objArr == false) {
                        return obj;
                    }
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (objArr2 != false && i5 == 1) {
                            objArr3 = true;
                        } else {
                            objArr3 = false;
                        }
                        if (objArr3 != false && objArr != false) {
                            i11 = 3;
                        } else if (objArr != false) {
                            i11 = 1;
                        } else if (objArr3 != false) {
                            i11 = 2;
                        }
                        return Typeface.create((Typeface) obj, i11);
                    }
                    if (objArr != false) {
                        i10 = vVar.alpha;
                    } else {
                        i10 = ((H0.z) iVar).bravo.alpha;
                    }
                    if (objArr2 == false ? ((H0.z) iVar).charlie == 1 : i5 == 1) {
                        z2 = true;
                    }
                    create = Typeface.create((Typeface) obj, i10, z2);
                    return create;
                }
            }
        }
        objArr = false;
        if ((i4 & 2) == 0) {
        }
        objArr2 = false;
        if (objArr2 != false) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
        }
    }
}
