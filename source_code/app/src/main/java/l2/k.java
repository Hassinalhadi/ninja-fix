package l2;

import com.google.android.material.internal.ab;
import java.util.Collection;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k {
    public final ab alpha;
    public final int[] bravo;
    public final String[] charlie;
    public final Set delta;

    public k(ab abVar, int[] iArr, String[] strArr) {
        Set oscar;
        this.alpha = abVar;
        this.bravo = iArr;
        this.charlie = strArr;
        if (strArr.length == 0) {
            oscar = u.alpha;
        } else {
            oscar = kotlin.collections.ab.oscar(strArr[0]);
        }
        this.delta = oscar;
        if (iArr.length == strArr.length) {
        } else {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final void alpha(Set invalidatedTablesIds) {
        Intrinsics.echo(invalidatedTablesIds, "invalidatedTablesIds");
        int[] iArr = this.bravo;
        int length = iArr.length;
        Collection collection = u.alpha;
        if (length != 0) {
            int i4 = 0;
            if (length != 1) {
                Ld.j jVar = new Ld.j();
                int length2 = iArr.length;
                int i5 = 0;
                while (i4 < length2) {
                    int i10 = i5 + 1;
                    if (invalidatedTablesIds.contains(Integer.valueOf(iArr[i4]))) {
                        jVar.add(this.charlie[i5]);
                    }
                    i4++;
                    i5 = i10;
                }
                collection = kotlin.collections.ab.bravo(jVar);
            } else if (invalidatedTablesIds.contains(Integer.valueOf(iArr[0]))) {
                collection = this.delta;
            }
        }
        if (!collection.isEmpty()) {
            ((xf.e) this.alpha.red).mike(Unit.INSTANCE);
        }
    }
}
