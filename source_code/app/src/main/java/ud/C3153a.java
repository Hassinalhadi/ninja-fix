package ud;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ud.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3153a {
    public final char alpha;
    public final ArrayList bravo;

    public C3153a(char c3, List exact, ArrayList arrayList) {
        Intrinsics.echo(exact, "exact");
        this.alpha = c3;
        this.bravo = arrayList;
        C3153a[] c3153aArr = new C3153a[Barcode.FORMAT_QR_CODE];
        for (int i4 = 0; i4 < 256; i4++) {
            Iterator it = this.bravo.iterator();
            Object obj = null;
            boolean z2 = false;
            Object obj2 = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (((C3153a) next).alpha == i4) {
                        if (z2) {
                            break;
                        }
                        z2 = true;
                        obj2 = next;
                    }
                } else if (z2) {
                    obj = obj2;
                }
            }
            c3153aArr[i4] = obj;
        }
    }
}
