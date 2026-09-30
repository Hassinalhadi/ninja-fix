package xd;

import C1.t;
import java.nio.charset.Charset;
import kotlin.Unit;
import yf.InterfaceC3439i;
import yf.InterfaceC3440j;

/* renamed from: xd.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3334g implements InterfaceC3439i {
    public final /* synthetic */ t alpha;
    public final /* synthetic */ sd.e purple;
    public final /* synthetic */ Charset red;
    public final /* synthetic */ Ed.a silver;
    public final /* synthetic */ Object teal;

    public C3334g(t tVar, sd.e eVar, Charset charset, Ed.a aVar, Object obj) {
        this.alpha = tVar;
        this.purple = eVar;
        this.red = charset;
        this.silver = aVar;
        this.teal = obj;
    }

    @Override // yf.InterfaceC3439i
    public final Object collect(InterfaceC3440j interfaceC3440j, Nd.c cVar) {
        Object collect = this.alpha.collect(new C3333f(interfaceC3440j, this.purple, this.red, this.silver, this.teal), cVar);
        if (collect == Od.a.alpha) {
            return collect;
        }
        return Unit.INSTANCE;
    }
}
