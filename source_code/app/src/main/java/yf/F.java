package yf;

/* loaded from: classes2.dex */
public final class F implements E {
    public final /* synthetic */ int alpha;

    @Override // yf.E
    public final InterfaceC3439i alpha(zf.ad adVar) {
        switch (this.alpha) {
            case 0:
                EnumC3430C enumC3430C = EnumC3430C.alpha;
                return new C3438h(1);
            default:
                return new C1.t(new H(adVar, null));
        }
    }

    public final String toString() {
        switch (this.alpha) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return "SharingStarted.Lazily";
        }
    }
}
