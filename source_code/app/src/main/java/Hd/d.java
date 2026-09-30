package Hd;

import Pd.i;
import Xd.l;
import io.ktor.utils.io.am;
import java.io.EOFException;
import kotlin.ResultKt;
import kotlin.Unit;
import s6.Y4;
import vf.ab;

/* loaded from: classes2.dex */
public final class d extends i implements l {
    public final /* synthetic */ e alpha;
    public final /* synthetic */ int purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, int i4, Nd.c cVar) {
        super(2, cVar);
        this.alpha = eVar;
        this.purple = i4;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new d(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        e eVar;
        Gf.b bVar;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        long j5 = 0;
        while (true) {
            eVar = this.alpha;
            long charlie = Y4.charlie(eVar.delta);
            long j6 = this.purple;
            bVar = eVar.bravo;
            if (charlie >= j6 || j5 < 0) {
                break;
            }
            try {
                j5 = bVar.h(eVar.delta, Long.MAX_VALUE);
            } catch (EOFException unused) {
                j5 = -1;
            }
        }
        if (j5 == -1) {
            bVar.close();
            eVar.echo.yellow();
            eVar.charlie = new am(null);
        }
        return Unit.INSTANCE;
    }
}
