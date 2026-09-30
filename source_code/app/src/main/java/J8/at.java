package J8;

import j8.InterfaceC1947d;

/* loaded from: classes2.dex */
public final class at implements M8.b {
    public final /* synthetic */ int alpha;
    public final M8.c bravo;
    public final M8.c charlie;
    public final Kd.a delta;
    public final Kd.a echo;
    public final Kd.a foxtrot;

    public /* synthetic */ at(M8.c cVar, M8.c cVar2, Kd.a aVar, Kd.a aVar2, Kd.a aVar3, int i4) {
        this.alpha = i4;
        this.bravo = cVar;
        this.charlie = cVar2;
        this.delta = aVar;
        this.echo = aVar2;
        this.foxtrot = aVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [L8.a] */
    @Override // Kd.a
    public final Object get() {
        M8.a aVar;
        switch (this.alpha) {
            case 0:
                return new as((B7.g) this.bravo.alpha, (InterfaceC1947d) this.charlie.alpha, (N8.j) this.delta.get(), (l) this.echo.get(), (Nd.h) ((M8.c) this.foxtrot).alpha);
            default:
                Nd.h hVar = (Nd.h) this.bravo.alpha;
                InterfaceC1947d interfaceC1947d = (InterfaceC1947d) this.charlie.alpha;
                C0187b c0187b = (C0187b) this.delta.get();
                N8.g gVar = (N8.g) this.echo.get();
                Kd.a aVar2 = this.foxtrot;
                if (aVar2 instanceof L8.a) {
                    aVar = (L8.a) aVar2;
                } else {
                    aVar = new M8.a(aVar2);
                }
                return new N8.e(hVar, interfaceC1947d, c0187b, gVar, aVar);
        }
    }
}
