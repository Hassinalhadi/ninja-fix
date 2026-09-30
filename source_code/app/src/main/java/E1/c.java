package E1;

import C1.InterfaceC0079a;
import Tf.ah;
import Tf.ak;
import Tf.u;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.FileNotFoundException;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2689j6;

/* loaded from: classes3.dex */
public class c implements InterfaceC0079a {
    public final u alpha;
    public final ah bravo;
    public final a charlie;

    public c(u fileSystem, ah path) {
        Intrinsics.echo(fileSystem, "fileSystem");
        Intrinsics.echo(path, "path");
        this.alpha = fileSystem;
        this.bravo = path;
        this.charlie = new a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:(4:11|12|(2:19|20)|(2:15|16)(1:18))(2:24|25))(3:26|27|28))(2:48|(6:52|53|54|55|(1:57)|58)(2:50|51))|(2:35|36)|30|(2:32|33)(1:34)))|80|6|7|(0)(0)|(0)|30|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b8, code lost:
    
        if (r9 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0032, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c3, code lost:
    
        if (r8 != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00cd, code lost:
    
        r6 = r9;
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c5, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c9, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ca, code lost:
    
        s6.AbstractC2689j6.charlie(r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x008f, code lost:
    
        r8 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095 A[Catch: FileNotFoundException -> 0x008f, TryCatch #3 {FileNotFoundException -> 0x008f, blocks: (B:32:0x0095, B:34:0x0099, B:47:0x008b, B:44:0x0086), top: B:7:0x0023, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[Catch: FileNotFoundException -> 0x008f, TRY_LEAVE, TryCatch #3 {FileNotFoundException -> 0x008f, blocks: (B:32:0x0095, B:34:0x0099, B:47:0x008b, B:44:0x0086), top: B:7:0x0023, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [E1.c] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [E1.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v4, types: [E1.c] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object alpha(c cVar, Pd.c cVar2) {
        b bVar;
        ?? r22;
        ak akVar;
        Throwable th;
        Throwable th2;
        if (cVar2 instanceof b) {
            bVar = (b) cVar2;
            int i4 = bVar.teal;
            if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                bVar.teal = i4 - RecyclerView.UNDEFINED_DURATION;
                Object obj = bVar.red;
                Od.a aVar = Od.a.alpha;
                r22 = bVar.teal;
                G1.e eVar = G1.e.alpha;
                Throwable th3 = null;
                if (r22 == 0) {
                    if (r22 != 1) {
                        if (r22 == 2) {
                            Closeable closeable = (Closeable) bVar.alpha;
                            ResultKt.alpha(obj);
                            cVar = closeable;
                            if (cVar != 0) {
                                try {
                                    cVar.close();
                                } catch (Throwable th4) {
                                    th3 = th4;
                                }
                            }
                            if (th3 == null) {
                                Intrinsics.checkNotNull(obj);
                                return obj;
                            }
                            throw th3;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    akVar = bVar.purple;
                    r22 = (c) bVar.alpha;
                    try {
                        ResultKt.alpha(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        if (akVar != null) {
                        }
                        th2 = th;
                        obj = null;
                        if (th2 != null) {
                        }
                    }
                } else {
                    ResultKt.alpha(obj);
                    if (!cVar.charlie.alpha.get()) {
                        try {
                            ak charlie = Tf.b.charlie(cVar.alpha.source(cVar.bravo));
                            try {
                                bVar.alpha = cVar;
                                bVar.purple = charlie;
                                bVar.teal = 1;
                                G1.b bravo = eVar.bravo(charlie);
                                if (bravo != aVar) {
                                    akVar = charlie;
                                    obj = bravo;
                                }
                            } catch (Throwable th6) {
                                r22 = cVar;
                                akVar = charlie;
                                th = th6;
                                if (akVar != null) {
                                    try {
                                        akVar.close();
                                    } catch (Throwable th7) {
                                        AbstractC2689j6.charlie(th, th7);
                                    }
                                }
                                th2 = th;
                                obj = null;
                                if (th2 != null) {
                                }
                            }
                        } catch (FileNotFoundException unused) {
                            u uVar = cVar.alpha;
                            ah ahVar = cVar.bravo;
                            if (uVar.exists(ahVar)) {
                                ak charlie2 = Tf.b.charlie(cVar.alpha.source(ahVar));
                                bVar.alpha = charlie2;
                                bVar.purple = null;
                                bVar.teal = 2;
                                obj = eVar.bravo(charlie2);
                                cVar = charlie2;
                            } else {
                                return new G1.b(true);
                            }
                        }
                        return aVar;
                    }
                    throw new IllegalStateException("This scope has already been closed.");
                }
                if (akVar != null) {
                    try {
                        akVar.close();
                    } catch (Throwable th8) {
                        th2 = th8;
                    }
                }
                th2 = null;
                if (th2 != null) {
                    Intrinsics.checkNotNull(obj);
                    return obj;
                }
                throw th2;
            }
        }
        bVar = new b(cVar, cVar2);
        Object obj2 = bVar.red;
        Od.a aVar2 = Od.a.alpha;
        r22 = bVar.teal;
        G1.e eVar2 = G1.e.alpha;
        Throwable th32 = null;
        if (r22 == 0) {
        }
        if (akVar != null) {
        }
        th2 = null;
        if (th2 != null) {
        }
    }

    @Override // C1.InterfaceC0079a
    public final void close() {
        this.charlie.alpha.set(true);
    }
}
