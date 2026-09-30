package androidx.recyclerview.widget;

import java.util.Comparator;

/* renamed from: androidx.recyclerview.widget.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0673s implements Comparator {
    public final /* synthetic */ int alpha;

    public /* synthetic */ C0673s(int i4) {
        this.alpha = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
    
        if (r0 != false) goto L18;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        switch (this.alpha) {
            case 0:
                return ((C0675u) obj).alpha - ((C0675u) obj2).alpha;
            default:
                af afVar = (af) obj;
                af afVar2 = (af) obj2;
                RecyclerView recyclerView = afVar.delta;
                if (recyclerView == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (afVar2.delta == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z2 == z10) {
                    boolean z11 = afVar.alpha;
                    if (z11 == afVar2.alpha) {
                        int i4 = afVar2.bravo - afVar.bravo;
                        if (i4 != 0) {
                            return i4;
                        }
                        int i5 = afVar.charlie - afVar2.charlie;
                        if (i5 == 0) {
                            return 0;
                        }
                        return i5;
                    }
                }
                break;
        }
    }
}
