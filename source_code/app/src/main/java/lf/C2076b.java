package lf;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: lf.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2076b extends kotlin.collections.b {
    public int red = -1;
    public final /* synthetic */ C2077c silver;

    public C2076b(C2077c c2077c) {
        this.silver = c2077c;
    }

    @Override // kotlin.collections.b
    public final void alpha() {
        int i4;
        Object[] objArr;
        do {
            i4 = this.red + 1;
            this.red = i4;
            objArr = this.silver.alpha;
            if (i4 >= objArr.length) {
                break;
            }
        } while (objArr[i4] == null);
        if (i4 >= objArr.length) {
            this.alpha = 2;
            return;
        }
        Object obj = objArr[i4];
        Intrinsics.charlie(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
        this.purple = obj;
        this.alpha = 1;
    }
}
