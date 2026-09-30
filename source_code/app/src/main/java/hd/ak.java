package hd;

import androidx.recyclerview.widget.RecyclerView;
import dd.C1614e;
import io.ktor.client.plugins.SendCountExceedException;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import od.C2226c;
import od.C2229f;

/* loaded from: classes2.dex */
public final class ak implements au {
    public final cd.c alpha;
    public int bravo;
    public C1614e charlie;

    public ak(cd.c client) {
        Intrinsics.echo(client, "client");
        this.alpha = client;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // hd.au
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object alpha(C2226c c2226c, Pd.c cVar) {
        aj ajVar;
        Object obj;
        int i4;
        C1614e c1614e;
        if (cVar instanceof aj) {
            ajVar = (aj) cVar;
            int i5 = ajVar.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                ajVar.red = i5 - RecyclerView.UNDEFINED_DURATION;
                obj = ajVar.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = ajVar.red;
                c1614e = null;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    C1614e c1614e2 = this.charlie;
                    if (c1614e2 != null) {
                        vf.ad.kilo(c1614e2, null);
                    }
                    int i10 = this.bravo;
                    if (i10 < 20) {
                        this.bravo = i10 + 1;
                        C2229f c2229f = this.alpha.white;
                        Object obj2 = c2226c.delta;
                        ajVar.red = 1;
                        obj = c2229f.alpha(c2226c, obj2, ajVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        throw new SendCountExceedException("Max send count 20 exceeded. Consider increasing the property maxSendCount if more is required.");
                    }
                }
                if (obj instanceof C1614e) {
                    c1614e = (C1614e) obj;
                }
                if (c1614e == null) {
                    this.charlie = c1614e;
                    return c1614e;
                }
                throw new IllegalStateException(("Failed to execute send pipeline. Expected [HttpClientCall], but received " + obj).toString());
            }
        }
        ajVar = new aj(this, cVar);
        obj = ajVar.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = ajVar.red;
        c1614e = null;
        if (i4 == 0) {
        }
        if (obj instanceof C1614e) {
        }
        if (c1614e == null) {
        }
    }
}
