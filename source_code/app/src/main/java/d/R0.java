package d;

import a2.C0393r;
import androidx.compose.runtime.C0564b;
import androidx.recyclerview.widget.RecyclerView;
import bz.AbstractC0779d;
import bz.C0789n;
import bz.InterfaceC0787l;
import g.AbstractC1719b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class R0 {
    public static final C0789n foxtrot = new C0789n(0.0f);
    public final bz.i0 alpha;
    public long bravo = Long.MIN_VALUE;
    public C0789n charlie = foxtrot;
    public boolean delta;
    public float echo;

    public R0(InterfaceC0787l interfaceC0787l) {
        this.alpha = interfaceC0787l.alpha(AbstractC0779d.juliet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:
    
        if (androidx.compose.runtime.C0564b.sierra(r0.getContext()).blue(r15, r0) == r1) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0030, B:13:0x00db, B:21:0x004a, B:23:0x00a8, B:25:0x0077, B:28:0x00b0, B:31:0x00bb, B:34:0x0086), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0030, B:13:0x00db, B:21:0x004a, B:23:0x00a8, B:25:0x0077, B:28:0x00b0, B:31:0x00bb, B:34:0x0086), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r14v12, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r2v10, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a5 -> B:23:0x00a8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object alpha(Cb.ac acVar, Ac.l lVar, Pd.c cVar) {
        Q0 q02;
        int i4;
        C0789n c0789n;
        float f5;
        Cb.ac acVar2;
        float f10;
        Ac.l lVar2;
        Function0 function0;
        try {
            if (cVar instanceof Q0) {
                q02 = (Q0) cVar;
                int i5 = q02.white;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    q02.white = i5 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = q02.silver;
                    Od.a aVar = Od.a.alpha;
                    i4 = q02.white;
                    c0789n = foxtrot;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                function0 = (Function0) q02.alpha;
                                ResultKt.alpha(obj);
                                function0.invoke();
                                this.bravo = Long.MIN_VALUE;
                                this.charlie = c0789n;
                                this.delta = false;
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f10 = q02.red;
                        Function0 function02 = q02.purple;
                        ?? r22 = (Function1) q02.alpha;
                        ResultKt.alpha(obj);
                        lVar2 = function02;
                        acVar2 = r22;
                        lVar2.invoke();
                        if (f10 == 0.0f) {
                            function0 = lVar2;
                            if (Math.abs(this.echo) != 0.0f) {
                                C0393r c0393r = new C0393r(24, this, acVar2);
                                q02.alpha = function0;
                                q02.purple = null;
                                q02.white = 2;
                            } else {
                                this.bravo = Long.MIN_VALUE;
                                this.charlie = c0789n;
                                this.delta = false;
                                return Unit.INSTANCE;
                            }
                        }
                        if (Math.abs(this.echo) >= 0.01f) {
                            P0 p02 = new P0(this, f10, acVar2);
                            q02.alpha = acVar2;
                            q02.purple = lVar2;
                            q02.red = f10;
                            q02.white = 1;
                            if (C0564b.sierra(q02.getContext()).blue(p02, q02) == aVar) {
                                return aVar;
                            }
                            lVar2.invoke();
                            if (f10 == 0.0f) {
                            }
                            if (Math.abs(this.echo) >= 0.01f) {
                            }
                        }
                        function0 = lVar2;
                        if (Math.abs(this.echo) != 0.0f) {
                        }
                    } else {
                        ResultKt.alpha(obj);
                        if (this.delta) {
                            AbstractC1719b.charlie("animateToZero called while previous animation is running");
                        }
                        T.t tVar = (T.t) q02.getContext().get(T.d.f2065i);
                        if (tVar != null) {
                            f5 = tVar.azure();
                        } else {
                            f5 = 1.0f;
                        }
                        this.delta = true;
                        acVar2 = acVar;
                        f10 = f5;
                        lVar2 = lVar;
                        if (Math.abs(this.echo) >= 0.01f) {
                        }
                        function0 = lVar2;
                        if (Math.abs(this.echo) != 0.0f) {
                        }
                    }
                }
            }
            if (i4 == 0) {
            }
        } catch (Throwable th) {
            this.bravo = Long.MIN_VALUE;
            this.charlie = c0789n;
            this.delta = false;
            throw th;
        }
        q02 = new Q0(this, cVar);
        Object obj2 = q02.silver;
        Od.a aVar2 = Od.a.alpha;
        i4 = q02.white;
        c0789n = foxtrot;
    }
}
