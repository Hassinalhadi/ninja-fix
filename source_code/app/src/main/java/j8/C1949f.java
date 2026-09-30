package j8;

import k8.C2019a;

/* renamed from: j8.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1949f implements InterfaceC1952i {
    public final C1953j alpha;
    public final G6.h bravo;

    public C1949f(C1953j c1953j, G6.h hVar) {
        this.alpha = c1953j;
        this.bravo = hVar;
    }

    @Override // j8.InterfaceC1952i
    public final boolean alpha(Exception exc) {
        this.bravo.charlie(exc);
        return true;
    }

    @Override // j8.InterfaceC1952i
    public final boolean bravo(C2019a c2019a) {
        if (c2019a.bravo == 4 && !this.alpha.alpha(c2019a)) {
            String str = c2019a.charlie;
            if (str != null) {
                this.bravo.bravo(new C1944a(c2019a.echo, c2019a.foxtrot, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
