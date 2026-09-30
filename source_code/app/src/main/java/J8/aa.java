package J8;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import j8.C1944a;
import j8.C1946c;
import j8.InterfaceC1947d;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import s6.T4;

/* loaded from: classes2.dex */
public final class aa {
    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|7|(1:(1:(6:11|12|13|14|15|16)(2:19|20))(2:21|22))(6:29|30|31|32|(1:34)|27)|23|24|25))|42|6|7|(0)(0)|23|24|25|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (r10 != r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0046, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0033, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        android.util.Log.w("InstallationId", "Error getting Firebase installation id .", r10);
        r9 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object alpha(InterfaceC1947d interfaceC1947d, Pd.c cVar) {
        z zVar;
        int i4;
        InterfaceC1947d interfaceC1947d2;
        ?? r92;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i5 = zVar.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                zVar.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = zVar.purple;
                Od.a aVar = Od.a.alpha;
                i4 = zVar.silver;
                String str = "";
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ?? r93 = (String) zVar.alpha;
                            ResultKt.alpha(obj);
                            interfaceC1947d = r93;
                            Intrinsics.delta(obj, "{\n          firebaseInst…ions.id.await()\n        }");
                            str = (String) obj;
                            ?? r94 = interfaceC1947d;
                            return new ab(str, r94);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InterfaceC1947d interfaceC1947d3 = (InterfaceC1947d) zVar.alpha;
                    ResultKt.alpha(obj);
                    interfaceC1947d = interfaceC1947d3;
                } else {
                    ResultKt.alpha(obj);
                    C1946c c1946c = (C1946c) interfaceC1947d;
                    G6.q echo = c1946c.echo();
                    try {
                        Intrinsics.delta(echo, "firebaseInstallations.getToken(false)");
                        zVar.alpha = c1946c;
                        zVar.silver = 1;
                        Object bravo = T4.bravo(echo, zVar);
                        if (bravo != aVar) {
                            obj = bravo;
                            interfaceC1947d = c1946c;
                        }
                    } catch (Exception e) {
                        e = e;
                        interfaceC1947d = c1946c;
                        Log.w("InstallationId", "Error getting authentication token.", e);
                        interfaceC1947d2 = interfaceC1947d;
                        r92 = "";
                        G6.q delta = ((C1946c) interfaceC1947d2).delta();
                        Intrinsics.delta(delta, "firebaseInstallations.id");
                        zVar.alpha = r92;
                        zVar.silver = 2;
                        obj = T4.bravo(delta, zVar);
                        interfaceC1947d = r92;
                    }
                    return aVar;
                }
                String str2 = ((C1944a) obj).alpha;
                Intrinsics.delta(str2, "{\n          firebaseInst…).await().token\n        }");
                interfaceC1947d2 = interfaceC1947d;
                r92 = str2;
                G6.q delta2 = ((C1946c) interfaceC1947d2).delta();
                Intrinsics.delta(delta2, "firebaseInstallations.id");
                zVar.alpha = r92;
                zVar.silver = 2;
                obj = T4.bravo(delta2, zVar);
                interfaceC1947d = r92;
            }
        }
        zVar = new z(this, cVar);
        Object obj2 = zVar.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = zVar.silver;
        String str3 = "";
        if (i4 == 0) {
        }
        String str22 = ((C1944a) obj2).alpha;
        Intrinsics.delta(str22, "{\n          firebaseInst…).await().token\n        }");
        interfaceC1947d2 = interfaceC1947d;
        r92 = str22;
        G6.q delta22 = ((C1946c) interfaceC1947d2).delta();
        Intrinsics.delta(delta22, "firebaseInstallations.id");
        zVar.alpha = r92;
        zVar.silver = 2;
        obj2 = T4.bravo(delta22, zVar);
        interfaceC1947d = r92;
    }
}
