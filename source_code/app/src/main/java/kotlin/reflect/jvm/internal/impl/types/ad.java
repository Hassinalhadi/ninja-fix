package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes2.dex */
public final class ad extends q {
    public final /* synthetic */ int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ad(ae aeVar, int i4) {
        super(aeVar);
        this.red = i4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p, kotlin.reflect.jvm.internal.impl.types.y
    public final boolean indigo() {
        switch (this.red) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p
    public final p u(ae aeVar) {
        switch (this.red) {
            case 0:
                return new ad(aeVar, 0);
            default:
                return new ad(aeVar, 1);
        }
    }
}
