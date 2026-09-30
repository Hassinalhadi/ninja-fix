package of;

import kotlin.jvm.functions.Function1;

/* renamed from: of.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2246a extends AbstractC2262q {
    public final /* synthetic */ Object bravo;
    public final /* synthetic */ boolean[] charlie;

    public C2246a(Function1 function1, boolean[] zArr) {
        this.bravo = function1;
        this.charlie = zArr;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @Override // of.AbstractC2262q
    public final boolean charlie(Object obj) {
        boolean booleanValue = ((Boolean) this.bravo.invoke(obj)).booleanValue();
        boolean[] zArr = this.charlie;
        if (booleanValue) {
            zArr[0] = true;
        }
        return !zArr[0];
    }

    @Override // of.AbstractC2262q
    public final Object india() {
        return Boolean.valueOf(this.charlie[0]);
    }
}
