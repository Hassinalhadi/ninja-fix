package wd;

import C1.t;
import java.nio.charset.Charset;
import kotlin.Unit;
import yf.InterfaceC3439i;
import yf.InterfaceC3440j;

/* loaded from: classes2.dex */
public final class c implements InterfaceC3439i {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ t purple;
    public final /* synthetic */ Charset red;
    public final /* synthetic */ Ed.a silver;
    public final /* synthetic */ io.ktor.utils.io.t teal;

    public /* synthetic */ c(t tVar, Charset charset, Ed.a aVar, io.ktor.utils.io.t tVar2, int i4) {
        this.alpha = i4;
        this.purple = tVar;
        this.red = charset;
        this.silver = aVar;
        this.teal = tVar2;
    }

    @Override // yf.InterfaceC3439i
    public final Object collect(InterfaceC3440j interfaceC3440j, Nd.c cVar) {
        switch (this.alpha) {
            case 0:
                Object collect = this.purple.collect(new b(interfaceC3440j, this.red, this.silver, this.teal, 0), cVar);
                if (collect != Od.a.alpha) {
                    return Unit.INSTANCE;
                }
                return collect;
            default:
                Object collect2 = this.purple.collect(new b(interfaceC3440j, this.red, this.silver, this.teal, 1), cVar);
                if (collect2 != Od.a.alpha) {
                    return Unit.INSTANCE;
                }
                return collect2;
        }
    }
}
