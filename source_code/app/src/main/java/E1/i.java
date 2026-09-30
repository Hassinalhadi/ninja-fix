package E1;

import C1.A;
import C1.InterfaceC0079a;
import C1.ao;
import C1.q;
import Tf.ah;
import Tf.u;
import Xd.l;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2689j6;

/* loaded from: classes3.dex */
public final class i implements InterfaceC0079a {
    public final u alpha;
    public final ah bravo;
    public final A charlie;
    public final e delta;
    public final a echo;
    public final Ef.c foxtrot;

    public i(u fileSystem, ah path, A coordinator, e eVar) {
        Intrinsics.echo(fileSystem, "fileSystem");
        Intrinsics.echo(path, "path");
        Intrinsics.echo(coordinator, "coordinator");
        this.alpha = fileSystem;
        this.bravo = path;
        this.charlie = coordinator;
        this.delta = eVar;
        this.echo = new a();
        this.foxtrot = Ef.d.alpha();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(6:36|37|38|40|41|(1:43)(1:44))(2:53|54))|13|14|15|(2:(1:18)|19)(1:21)))|7|(0)(0)|13|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[Catch: all -> 0x007d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x007d, blocks: (B:21:0x007c, B:31:0x008a, B:28:0x008d, B:27:0x0085), top: B:7:0x0020, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [E1.i] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [E1.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [E1.i] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [C1.q] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object alpha(q qVar, Pd.c cVar) {
        ?? r02;
        int i4;
        Throwable th;
        c cVar2;
        boolean z2;
        i iVar;
        try {
            if (cVar instanceof g) {
                g gVar = (g) cVar;
                int i5 = gVar.white;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    gVar.white = i5 - RecyclerView.UNDEFINED_DURATION;
                    r02 = gVar;
                    Object obj = r02.silver;
                    Od.a aVar = Od.a.alpha;
                    i4 = r02.white;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            qVar = r02.red;
                            cVar2 = r02.purple;
                            r02 = r02.alpha;
                            try {
                                ResultKt.alpha(obj);
                                iVar = r02;
                                z2 = qVar;
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    cVar2.close();
                                } catch (Throwable th3) {
                                    AbstractC2689j6.charlie(th, th3);
                                }
                                throw th;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj);
                        if (!this.echo.alpha.get()) {
                            boolean echo = this.foxtrot.echo();
                            try {
                                c cVar3 = new c(this.alpha, this.bravo);
                                try {
                                    Boolean valueOf = Boolean.valueOf(echo);
                                    r02.alpha = this;
                                    r02.purple = cVar3;
                                    r02.red = echo;
                                    r02.white = 1;
                                    Object invoke = qVar.invoke(cVar3, valueOf, r02);
                                    if (invoke == aVar) {
                                        return aVar;
                                    }
                                    obj = invoke;
                                    z2 = echo;
                                    iVar = this;
                                    cVar2 = cVar3;
                                } catch (Throwable th4) {
                                    th = th4;
                                    qVar = echo;
                                    r02 = this;
                                    cVar2 = cVar3;
                                    cVar2.close();
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                qVar = echo;
                                r02 = this;
                                if (qVar != 0) {
                                }
                                throw th;
                            }
                        } else {
                            throw new IllegalStateException("StorageConnection has already been disposed.");
                        }
                    }
                    cVar2.close();
                    th = null;
                    if (th != null) {
                        if (z2) {
                            iVar.foxtrot.foxtrot(null);
                        }
                        return obj;
                    }
                    throw th;
                }
            }
            if (i4 == 0) {
            }
            cVar2.close();
            th = null;
            if (th != null) {
            }
        } catch (Throwable th6) {
            th = th6;
            if (qVar != 0) {
                r02.foxtrot.foxtrot(null);
            }
            throw th;
        }
        r02 = new g(this, cVar);
        Object obj2 = r02.silver;
        Od.a aVar2 = Od.a.alpha;
        i4 = r02.white;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ba A[Catch: all -> 0x00ca, IOException -> 0x00cd, TRY_ENTER, TryCatch #9 {IOException -> 0x00cd, all -> 0x00ca, blocks: (B:18:0x00ba, B:20:0x00c2, B:24:0x00d9, B:34:0x00e4, B:31:0x00e7, B:30:0x00df), top: B:7:0x0024, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d9 A[Catch: all -> 0x00ca, IOException -> 0x00cd, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x00cd, all -> 0x00ca, blocks: (B:18:0x00ba, B:20:0x00c2, B:24:0x00d9, B:34:0x00e4, B:31:0x00e7, B:30:0x00df), top: B:7:0x0024, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [Tf.ah] */
    /* JADX WARN: Type inference failed for: r0v4, types: [Tf.ah] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7, types: [Tf.ah] */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v8, types: [Xd.l] */
    /* JADX WARN: Type inference failed for: r12v15, types: [Ef.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [E1.i] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [E1.h, java.lang.Object, Nd.c] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [Tf.u] */
    /* JADX WARN: Type inference failed for: r1v6, types: [Tf.u] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [Tf.u] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bravo(ao aoVar, Pd.c cVar) {
        ?? r12;
        Object obj;
        int i4;
        Object obj2;
        i iVar;
        ah charlie;
        ?? r11;
        c cVar2;
        Throwable th;
        InterfaceC0079a interfaceC0079a;
        i iVar2;
        ah ahVar;
        ?? r02 = ".tmp";
        try {
            try {
                try {
                    try {
                        if (cVar instanceof h) {
                            h hVar = (h) cVar;
                            int i5 = hVar.yellow;
                            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                                hVar.yellow = i5 - RecyclerView.UNDEFINED_DURATION;
                                r12 = hVar;
                                Object obj3 = r12.teal;
                                obj = Od.a.alpha;
                                i4 = r12.yellow;
                                if (i4 == 0) {
                                    if (i4 != 1) {
                                        if (i4 == 2) {
                                            interfaceC0079a = (InterfaceC0079a) r12.silver;
                                            r02 = r12.red;
                                            obj = (Ef.a) r12.purple;
                                            r12 = r12.alpha;
                                            try {
                                                ResultKt.alpha(obj3);
                                                ahVar = r02;
                                                iVar2 = r12;
                                                try {
                                                    interfaceC0079a.close();
                                                    th = null;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                                if (th != null) {
                                                    if (iVar2.alpha.exists(ahVar)) {
                                                        iVar2.alpha.atomicMove(ahVar, iVar2.bravo);
                                                    }
                                                    ((Ef.c) obj).foxtrot(null);
                                                    return Unit.INSTANCE;
                                                }
                                                throw th;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                try {
                                                    interfaceC0079a.close();
                                                } catch (Throwable th4) {
                                                    AbstractC2689j6.charlie(th, th4);
                                                }
                                                throw th;
                                            }
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    Ef.a aVar = (Ef.a) r12.silver;
                                    charlie = r12.red;
                                    l lVar = (l) r12.purple;
                                    iVar = r12.alpha;
                                    ResultKt.alpha(obj3);
                                    obj2 = aVar;
                                    r11 = lVar;
                                } else {
                                    ResultKt.alpha(obj3);
                                    if (!this.echo.alpha.get()) {
                                        charlie = this.bravo.charlie();
                                        if (charlie != null) {
                                            this.alpha.createDirectories(charlie, false);
                                            r12.alpha = this;
                                            r12.purple = aoVar;
                                            r12.red = charlie;
                                            ?? r122 = this.foxtrot;
                                            r12.silver = r122;
                                            r12.yellow = 1;
                                            if (r122.delta(r12) != obj) {
                                                iVar = this;
                                                r11 = aoVar;
                                                obj2 = r122;
                                            }
                                            return obj;
                                        }
                                        throw new IllegalStateException("must have a parent path");
                                    }
                                    throw new IllegalStateException("StorageConnection has already been disposed.");
                                }
                                ah ahVar2 = iVar.bravo;
                                ?? r92 = iVar.alpha;
                                r02 = charlie.foxtrot(ahVar2.bravo().concat(".tmp"));
                                r92.delete(r02, false);
                                cVar2 = new c(r92, r02);
                                r12.alpha = iVar;
                                r12.purple = obj2;
                                r12.red = r02;
                                r12.silver = cVar2;
                                r12.yellow = 2;
                                if (r11.invoke(cVar2, r12) != obj) {
                                    obj = obj2;
                                    interfaceC0079a = cVar2;
                                    iVar2 = iVar;
                                    ahVar = r02;
                                    interfaceC0079a.close();
                                    th = null;
                                    if (th != null) {
                                    }
                                }
                                return obj;
                            }
                        }
                        r12.alpha = iVar;
                        r12.purple = obj2;
                        r12.red = r02;
                        r12.silver = cVar2;
                        r12.yellow = 2;
                        if (r11.invoke(cVar2, r12) != obj) {
                        }
                        return obj;
                    } catch (Throwable th5) {
                        obj = obj2;
                        r12 = iVar;
                        th = th5;
                        interfaceC0079a = cVar2;
                        interfaceC0079a.close();
                        throw th;
                    }
                    r92.delete(r02, false);
                    cVar2 = new c(r92, r02);
                } catch (IOException e) {
                    e = e;
                    if (iVar.alpha.exists(r02)) {
                        try {
                            iVar.alpha.delete(r02);
                        } catch (IOException unused) {
                        }
                    }
                    throw e;
                }
                ah ahVar22 = iVar.bravo;
                ?? r922 = iVar.alpha;
                r02 = charlie.foxtrot(ahVar22.bravo().concat(".tmp"));
            } catch (Throwable th6) {
                th = th6;
                ((Ef.c) obj2).foxtrot(null);
                throw th;
            }
            if (i4 == 0) {
            }
        } catch (IOException e4) {
            e = e4;
            iVar = r12;
            obj2 = obj;
            if (iVar.alpha.exists(r02)) {
            }
            throw e;
        } catch (Throwable th7) {
            th = th7;
            obj2 = obj;
            ((Ef.c) obj2).foxtrot(null);
            throw th;
        }
        r12 = new h(this, cVar);
        Object obj32 = r12.teal;
        obj = Od.a.alpha;
        i4 = r12.yellow;
    }

    @Override // C1.InterfaceC0079a
    public final void close() {
        this.echo.alpha.set(true);
        this.delta.invoke();
    }
}
