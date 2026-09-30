package He;

import Ge.l;
import Ge.m;
import androidx.compose.runtime.C0562a;
import androidx.compose.runtime.ak;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class c implements m {
    public final ArrayList alpha;

    public c(int i4) {
        switch (i4) {
            case 1:
                this.alpha = new ArrayList();
                return;
            default:
                this.alpha = new ArrayList();
                return;
        }
    }

    @Override // Ge.m
    public void alpha(Ne.b bVar, Ne.f fVar) {
    }

    @Override // Ge.m
    public void bravo() {
        hotel((String[]) this.alpha.toArray(new String[0]));
    }

    @Override // Ge.m
    public l charlie(Ne.b bVar) {
        return null;
    }

    @Override // Ge.m
    public void delta(Object obj) {
        if (obj instanceof String) {
            this.alpha.add((String) obj);
        }
    }

    @Override // Ge.m
    public void echo(Se.f fVar) {
    }

    public boolean foxtrot(ak akVar, Object obj) {
        ArrayList arrayList = akVar.alpha;
        if (arrayList == null) {
            return true;
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Object obj2 = arrayList.get(i4);
            if (obj2 instanceof C0562a) {
                if (Intrinsics.areEqual(obj2, obj)) {
                    return true;
                }
            } else if (obj2 instanceof ak) {
                if (foxtrot((ak) obj2, obj)) {
                    return true;
                }
            } else {
                throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
            }
        }
        return false;
    }

    public void golf(ak akVar, Object obj) {
    }

    public abstract void hotel(String[] strArr);
}
