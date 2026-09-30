package vg;

import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class i implements f {
    public final /* synthetic */ int alpha;
    public final Type purple;

    public /* synthetic */ i(int i4, Type type) {
        this.alpha = i4;
        this.purple = type;
    }

    @Override // vg.f
    public final Object adapt(d dVar) {
        switch (this.alpha) {
            case 0:
                y yVar = (y) dVar;
                j jVar = new j(yVar);
                yVar.o(new h(jVar, 0));
                return jVar;
            default:
                y yVar2 = (y) dVar;
                j jVar2 = new j(yVar2);
                yVar2.o(new h(jVar2, 1));
                return jVar2;
        }
    }

    @Override // vg.f
    public final Type responseType() {
        switch (this.alpha) {
            case 0:
                return this.purple;
            default:
                return this.purple;
        }
    }
}
