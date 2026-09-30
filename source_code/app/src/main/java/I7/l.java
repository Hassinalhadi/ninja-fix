package I7;

import i8.InterfaceC1904b;

/* loaded from: classes2.dex */
public final class l implements InterfaceC1904b {
    public static final Object charlie = new Object();
    public volatile Object alpha = charlie;
    public volatile InterfaceC1904b bravo;

    public l(InterfaceC1904b interfaceC1904b) {
        this.bravo = interfaceC1904b;
    }

    @Override // i8.InterfaceC1904b
    public final Object get() {
        Object obj;
        Object obj2 = this.alpha;
        Object obj3 = charlie;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.alpha;
                    if (obj == obj3) {
                        obj = this.bravo.get();
                        this.alpha = obj;
                        this.bravo = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return obj;
        }
        return obj2;
    }
}
