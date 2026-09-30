package Hd;

import Nd.h;
import androidx.recyclerview.widget.RecyclerView;
import io.ktor.utils.io.al;
import io.ktor.utils.io.am;
import io.ktor.utils.io.t;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import s6.Y4;
import vf.H;
import vf.I;
import vf.J;
import vf.aa;
import vf.ad;

/* loaded from: classes2.dex */
public final class e implements t {
    public final Gf.b bravo;
    public am charlie;
    public final Gf.a delta;
    public final J echo;
    public final h foxtrot;

    /* JADX WARN: Type inference failed for: r2v1, types: [Gf.a, java.lang.Object] */
    public e(Gf.b bVar, h parent) {
        Intrinsics.echo(parent, "parent");
        this.bravo = bVar;
        this.delta = new Object();
        J j5 = new J((I) parent.get(H.alpha));
        this.echo = j5;
        this.foxtrot = parent.plus(j5).plus(new aa("RawSourceChannel"));
    }

    @Override // io.ktor.utils.io.t
    public final void delta(Throwable th) {
        if (this.charlie != null) {
            return;
        }
        J j5 = this.echo;
        String message = th.getMessage();
        String str = "Channel was cancelled";
        if (message == null) {
            message = "Channel was cancelled";
        }
        j5.foxtrot(ad.alpha(message, th));
        this.bravo.close();
        String message2 = th.getMessage();
        if (message2 != null) {
            str = message2;
        }
        this.charlie = new am(new IOException(str, th));
    }

    @Override // io.ktor.utils.io.t
    public final Throwable echo() {
        am amVar = this.charlie;
        if (amVar != null) {
            return amVar.alpha(al.alpha);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // io.ktor.utils.io.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object foxtrot(int i4, Pd.c cVar) {
        c cVar2;
        int i5;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.silver;
            if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                cVar2.silver = i10 - RecyclerView.UNDEFINED_DURATION;
                Object obj = cVar2.purple;
                Od.a aVar = Od.a.alpha;
                i5 = cVar2.silver;
                boolean z2 = true;
                if (i5 == 0) {
                    if (i5 == 1) {
                        i4 = cVar2.alpha;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    if (this.charlie != null) {
                        return Boolean.TRUE;
                    }
                    d dVar = new d(this, i4, null);
                    cVar2.alpha = i4;
                    cVar2.silver = 1;
                    if (ad.blue(this.foxtrot, dVar, cVar2) == aVar) {
                        return aVar;
                    }
                }
                if (Y4.charlie(this.delta) < i4) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.purple;
        Od.a aVar2 = Od.a.alpha;
        i5 = cVar2.silver;
        boolean z22 = true;
        if (i5 == 0) {
        }
        if (Y4.charlie(this.delta) < i4) {
        }
        return Boolean.valueOf(z22);
    }

    @Override // io.ktor.utils.io.t
    public final Gf.a golf() {
        return this.delta;
    }

    @Override // io.ktor.utils.io.t
    public final boolean hotel() {
        if (this.charlie != null && this.delta.hotel()) {
            return true;
        }
        return false;
    }
}
