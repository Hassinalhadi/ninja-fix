package Af;

import androidx.compose.runtime.D0;
import ge.InterfaceC1771c;

/* loaded from: classes2.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.p implements ge.s {
    public final /* synthetic */ int purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i4, int i5, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i4);
        this.purple = i5;
    }

    @Override // kotlin.jvm.internal.c
    public final InterfaceC1771c computeReflected() {
        return kotlin.jvm.internal.u.alpha.golf(this);
    }

    @Override // ge.s
    public final Object get() {
        switch (this.purple) {
            case 0:
                return this.receiver.getClass().getSimpleName();
            case 1:
                return ((D0) this.receiver).getValue();
            case 2:
                return ((D0) this.receiver).getValue();
            case 3:
                return ((D0) this.receiver).getValue();
            default:
                return ((D0) this.receiver).getValue();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return get();
    }

    @Override // ge.v
    public final ge.r bravo() {
        return ((ge.s) getReflected()).bravo();
    }
}
