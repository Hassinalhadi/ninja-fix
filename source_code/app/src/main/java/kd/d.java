package kd;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import vf.J;

/* loaded from: classes2.dex */
public final class d {
    public static final /* synthetic */ AtomicIntegerFieldUpdater foxtrot = AtomicIntegerFieldUpdater.newUpdater(d.class, "requestLogged");
    public static final /* synthetic */ AtomicIntegerFieldUpdater golf = AtomicIntegerFieldUpdater.newUpdater(d.class, "responseLogged");
    public final g alpha;
    public final StringBuilder bravo = new StringBuilder();
    public final StringBuilder charlie = new StringBuilder();
    public final J delta = vf.ad.delta();
    public final J echo = vf.ad.delta();

    @NotNull
    private volatile /* synthetic */ int requestLogged = 0;

    @NotNull
    private volatile /* synthetic */ int responseLogged = 0;

    public d(g gVar) {
        this.alpha = gVar;
    }

    public final void alpha() {
        J j5 = this.delta;
        if (!foxtrot.compareAndSet(this, 0, 1)) {
            return;
        }
        try {
            String obj = StringsKt.b(this.bravo).toString();
            if (obj.length() > 0) {
                this.alpha.log(obj);
            }
        } finally {
            j5.yellow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bravo(Pd.c cVar) {
        C2032a c2032a;
        int i4;
        String obj;
        if (cVar instanceof C2032a) {
            c2032a = (C2032a) cVar;
            int i5 = c2032a.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2032a.red = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = c2032a.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = c2032a.red;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj2);
                    if (!golf.compareAndSet(this, 0, 1)) {
                        return Unit.INSTANCE;
                    }
                    J j5 = this.delta;
                    c2032a.red = 1;
                    if (j5.gray(c2032a) == aVar) {
                        return aVar;
                    }
                }
                obj = StringsKt.b(this.charlie).toString();
                if (obj.length() > 0) {
                    this.alpha.log(obj);
                }
                return Unit.INSTANCE;
            }
        }
        c2032a = new C2032a(this, cVar);
        Object obj22 = c2032a.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = c2032a.red;
        if (i4 == 0) {
        }
        obj = StringsKt.b(this.charlie).toString();
        if (obj.length() > 0) {
        }
        return Unit.INSTANCE;
    }

    public final void charlie(String message) {
        Intrinsics.echo(message, "message");
        String obj = StringsKt.b(message).toString();
        StringBuilder sb2 = this.bravo;
        sb2.append(obj);
        sb2.append('\n');
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delta(String str, Pd.c cVar) {
        b bVar;
        int i4;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i5 = bVar.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                bVar.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = bVar.purple;
                Od.a aVar = Od.a.alpha;
                i4 = bVar.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        str = bVar.alpha;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    J j5 = this.echo;
                    bVar.alpha = str;
                    bVar.silver = 1;
                    if (j5.gray(bVar) == aVar) {
                        return aVar;
                    }
                }
                this.charlie.append(str);
                return Unit.INSTANCE;
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = bVar.silver;
        if (i4 == 0) {
        }
        this.charlie.append(str);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object echo(String str, Pd.c cVar) {
        c cVar2;
        int i4;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i5 = cVar2.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                cVar2.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = cVar2.purple;
                Od.a aVar = Od.a.alpha;
                i4 = cVar2.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        str = cVar2.alpha;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    J j5 = this.delta;
                    cVar2.alpha = str;
                    cVar2.silver = 1;
                    if (j5.gray(cVar2) == aVar) {
                        return aVar;
                    }
                }
                this.alpha.log(StringsKt.b(str).toString());
                return Unit.INSTANCE;
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = cVar2.silver;
        if (i4 == 0) {
        }
        this.alpha.log(StringsKt.b(str).toString());
        return Unit.INSTANCE;
    }

    public final void foxtrot(String str) {
        String obj = StringsKt.b(str).toString();
        StringBuilder sb2 = this.charlie;
        sb2.append(obj);
        sb2.append('\n');
        this.echo.yellow();
    }
}
