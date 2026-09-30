package M2;

import Aa.m;
import Af.n;
import B9.ab;
import K1.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.lifecycle.ac;
import androidx.recyclerview.widget.RecyclerView;
import coil.request.NullRequestDataException;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import okhttp3.HttpUrl;
import s6.AbstractC2832z6;
import t6.AbstractC2967a3;
import vf.AbstractC3220y;
import vf.I;
import vf.a0;
import vf.ad;
import vf.ao;

/* loaded from: classes3.dex */
public final class k implements f {
    public final Context alpha;
    public final X2.b bravo;
    public final Lazy charlie;
    public final Lazy delta;
    public final Lazy echo;
    public final a3.k foxtrot;
    public final J2.c golf;
    public final b hotel;
    public final List india;

    public k(Context context, X2.b bVar, Lazy lazy, Lazy lazy2, Lazy lazy3, b bVar2, a3.k kVar) {
        int i4 = 3;
        int i5 = 4;
        int i10 = 5;
        int i11 = 0;
        this.alpha = context;
        this.bravo = bVar;
        this.charlie = lazy;
        this.delta = lazy2;
        this.echo = lazy3;
        this.foxtrot = kVar;
        a0 foxtrot = ad.foxtrot();
        Cf.e eVar = ao.alpha;
        ad.charlie(AbstractC2832z6.charlie(foxtrot, n.alpha.teal).plus(new j(this)));
        a3.n nVar = new a3.n(this);
        J2.c cVar = new J2.c(this, nVar);
        this.golf = cVar;
        ab abVar = new ab(bVar2);
        abVar.tango(new U2.a(2), HttpUrl.class);
        abVar.tango(new U2.a(i10), String.class);
        abVar.tango(new U2.a(1), Uri.class);
        abVar.tango(new U2.a(i5), Uri.class);
        abVar.tango(new U2.a(i4), Integer.class);
        abVar.tango(new U2.a(i11), byte[].class);
        Object obj = new Object();
        ArrayList arrayList = (ArrayList) abVar.red;
        arrayList.add(new Pair(obj, Uri.class));
        arrayList.add(new Pair(new T2.a(kVar.alpha), File.class));
        abVar.sierra(new R2.i(lazy3, lazy2, kVar.charlie), Uri.class);
        abVar.sierra(new R2.a(i10), File.class);
        abVar.sierra(new R2.a(i11), Uri.class);
        abVar.sierra(new R2.a(i4), Uri.class);
        abVar.sierra(new R2.a(6), Uri.class);
        abVar.sierra(new R2.a(i5), Drawable.class);
        abVar.sierra(new R2.a(1), Bitmap.class);
        abVar.sierra(new R2.a(2), ByteBuffer.class);
        O2.c cVar2 = new O2.c(kVar.delta, kVar.echo);
        ArrayList arrayList2 = (ArrayList) abVar.teal;
        arrayList2.add(cVar2);
        List bravo = AbstractC2967a3.bravo((ArrayList) abVar.purple);
        this.hotel = new b(bravo, AbstractC2967a3.bravo((ArrayList) abVar.white), AbstractC2967a3.bravo(arrayList), AbstractC2967a3.bravo((ArrayList) abVar.silver), AbstractC2967a3.bravo(arrayList2));
        this.india = CollectionsKt.plus(bravo, new S2.i(this, nVar, cVar));
        new AtomicBoolean(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:3|(11:5|6|(4:(1:(1:(10:11|12|13|14|15|16|17|(2:19|20)(2:25|(2:27|28)(2:29|30))|21|22)(2:51|52))(13:53|54|55|56|57|58|59|60|61|62|63|(7:66|15|16|17|(0)(0)|21|22)|65))(4:77|78|79|80)|34|35|(3:37|38|39)(2:40|41))(6:96|97|98|99|100|(3:102|(3:104|105|106)|109)(2:110|111))|81|82|(1:84)|85|(1:87)|88|(9:90|57|58|59|60|61|62|63|(0))|65))|117|6|(0)(0)|81|82|(0)|85|(0)|88|(0)|65|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00b9, code lost:
    
        if (a3.d.alpha(r14, r0) == r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x016e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0131 A[Catch: all -> 0x0147, TRY_LEAVE, TryCatch #4 {all -> 0x0147, blocks: (B:16:0x012b, B:19:0x0131, B:25:0x014a, B:27:0x014e, B:29:0x015f, B:30:0x0164), top: B:15:0x012b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014a A[Catch: all -> 0x0147, TRY_ENTER, TryCatch #4 {all -> 0x0147, blocks: (B:16:0x012b, B:19:0x0131, B:25:0x014a, B:27:0x014e, B:29:0x015f, B:30:0x0164), top: B:15:0x012b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017a A[Catch: all -> 0x018e, TRY_LEAVE, TryCatch #10 {all -> 0x018e, blocks: (B:35:0x0176, B:37:0x017a, B:40:0x0191, B:41:0x019a), top: B:34:0x0176 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0191 A[Catch: all -> 0x018e, TRY_ENTER, TryCatch #10 {all -> 0x018e, blocks: (B:35:0x0176, B:37:0x017a, B:40:0x0191, B:41:0x019a), top: B:34:0x0176 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d1 A[Catch: all -> 0x016e, TryCatch #9 {all -> 0x016e, blocks: (B:82:0x00c7, B:84:0x00d1, B:85:0x00d4, B:87:0x00df, B:88:0x00eb), top: B:81:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00df A[Catch: all -> 0x016e, TryCatch #9 {all -> 0x016e, blocks: (B:82:0x00c7, B:84:0x00d1, B:85:0x00d4, B:87:0x00df, B:88:0x00eb), top: B:81:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0077  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [androidx.lifecycle.ac] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object alpha(k kVar, X2.h hVar, int i4, Pd.c cVar) {
        h hVar2;
        Od.a aVar;
        int i5;
        X2.h alpha;
        c cVar2;
        Throwable th;
        l lVar;
        m mVar;
        Object delta;
        k kVar2;
        X2.h hVar3;
        c cVar3;
        Bitmap bitmap;
        ?? r12;
        X2.i iVar;
        if (cVar instanceof h) {
            hVar2 = (h) cVar;
            int i10 = hVar2.f1851s;
            if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                hVar2.f1851s = i10 - RecyclerView.UNDEFINED_DURATION;
                Object obj = hVar2.white;
                aVar = Od.a.alpha;
                i5 = hVar2.f1851s;
                if (i5 == 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                c cVar4 = hVar2.silver;
                                alpha = hVar2.red;
                                lVar = hVar2.purple;
                                k kVar3 = hVar2.alpha;
                                try {
                                    ResultKt.alpha(obj);
                                    cVar3 = cVar4;
                                    r12 = kVar3;
                                    try {
                                        iVar = (X2.i) obj;
                                        try {
                                            if (!(iVar instanceof X2.m)) {
                                                X2.m mVar2 = (X2.m) iVar;
                                                m mVar3 = alpha.charlie;
                                                r12.getClass();
                                                X2.h hVar4 = mVar2.bravo;
                                                cVar3.getClass();
                                                hVar4.getClass();
                                            } else if (iVar instanceof X2.d) {
                                                X2.d dVar = (X2.d) iVar;
                                                m mVar4 = alpha.charlie;
                                                r12.getClass();
                                                bravo(dVar, mVar4, cVar3);
                                            } else {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            return iVar;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            kVar = r12;
                                            cVar2 = cVar3;
                                            if (th instanceof CancellationException) {
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        kVar = r12;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    cVar2 = cVar4;
                                    kVar = kVar3;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Bitmap bitmap2 = hVar2.teal;
                            c cVar5 = hVar2.silver;
                            X2.h hVar5 = hVar2.red;
                            l lVar2 = hVar2.purple;
                            k kVar4 = hVar2.alpha;
                            try {
                                ResultKt.alpha(obj);
                                bitmap = bitmap2;
                                cVar3 = cVar5;
                                hVar3 = hVar5;
                                lVar = lVar2;
                                kVar2 = kVar4;
                                try {
                                    Y2.h hVar6 = (Y2.h) obj;
                                    cVar3.getClass();
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                                try {
                                    AbstractC3220y abstractC3220y = hVar3.quebec;
                                    i iVar2 = new i(hVar3, kVar2, hVar6, cVar3, bitmap, null);
                                    hVar2.alpha = kVar2;
                                    hVar2.purple = lVar;
                                    hVar2.red = hVar3;
                                    hVar2.silver = cVar3;
                                    hVar2.teal = null;
                                    hVar2.f1851s = 3;
                                    obj = ad.blue(abstractC3220y, iVar2, hVar2);
                                    if (obj != aVar) {
                                        alpha = hVar3;
                                        r12 = kVar2;
                                        iVar = (X2.i) obj;
                                        if (!(iVar instanceof X2.m)) {
                                        }
                                        return iVar;
                                    }
                                    return aVar;
                                } catch (Throwable th6) {
                                    th = th6;
                                    alpha = hVar3;
                                    kVar = kVar2;
                                    cVar2 = cVar3;
                                    if (th instanceof CancellationException) {
                                    }
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                kVar = kVar4;
                                cVar2 = cVar5;
                                alpha = hVar5;
                                lVar = lVar2;
                            }
                        }
                    } else {
                        c cVar6 = hVar2.silver;
                        alpha = hVar2.red;
                        lVar = hVar2.purple;
                        k kVar5 = hVar2.alpha;
                        try {
                            ResultKt.alpha(obj);
                            cVar2 = cVar6;
                            kVar = kVar5;
                        } catch (Throwable th8) {
                            th = th8;
                            cVar2 = cVar6;
                            kVar = kVar5;
                        }
                    }
                    try {
                        if (th instanceof CancellationException) {
                            kVar.golf.getClass();
                            X2.d november = J2.c.november(alpha, th);
                            bravo(november, alpha.charlie, cVar2);
                            lVar.purple.charlie(lVar);
                            return november;
                        }
                        kVar.getClass();
                        cVar2.getClass();
                        alpha.getClass();
                        throw th;
                    } finally {
                        lVar.purple.charlie(lVar);
                    }
                }
                ResultKt.alpha(obj);
                I sierra = ad.sierra(hVar2.getContext());
                kVar.golf.getClass();
                ac acVar = hVar.uniform;
                l lVar3 = new l(acVar, sierra);
                X2.g alpha2 = X2.h.alpha(hVar);
                alpha2.bravo = kVar.bravo;
                alpha2.quebec = null;
                alpha = alpha2.alpha();
                cVar2 = c.alpha;
                try {
                    try {
                        if (alpha.bravo != X2.j.alpha) {
                            acVar.alpha(lVar3);
                            if (i4 == 0) {
                                ac acVar2 = alpha.uniform;
                                hVar2.alpha = kVar;
                                hVar2.purple = lVar3;
                                hVar2.red = alpha;
                                hVar2.silver = cVar2;
                                hVar2.f1851s = 1;
                            }
                            lVar = lVar3;
                            kVar = kVar;
                        } else {
                            throw new NullRequestDataException();
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        lVar = lVar3;
                        if (th instanceof CancellationException) {
                        }
                    }
                } catch (Throwable th10) {
                    th = th10;
                }
                if (((V2.b) kVar.charlie.getValue()) != null) {
                    alpha.getClass();
                }
                alpha.zulu.getClass();
                X2.b bVar = a3.f.alpha;
                mVar = alpha.charlie;
                if (mVar != null) {
                    ((N2.n) mVar.purple).echo(new N2.f(null));
                }
                cVar2.getClass();
                Y2.i iVar3 = alpha.victor;
                hVar2.alpha = kVar;
                hVar2.purple = lVar;
                hVar2.red = alpha;
                hVar2.silver = cVar2;
                hVar2.teal = null;
                hVar2.f1851s = 2;
                delta = iVar3.delta(hVar2);
                if (delta != aVar) {
                    kVar2 = kVar;
                    hVar3 = alpha;
                    cVar3 = cVar2;
                    obj = delta;
                    bitmap = null;
                    Y2.h hVar62 = (Y2.h) obj;
                    cVar3.getClass();
                    AbstractC3220y abstractC3220y2 = hVar3.quebec;
                    i iVar22 = new i(hVar3, kVar2, hVar62, cVar3, bitmap, null);
                    hVar2.alpha = kVar2;
                    hVar2.purple = lVar;
                    hVar2.red = hVar3;
                    hVar2.silver = cVar3;
                    hVar2.teal = null;
                    hVar2.f1851s = 3;
                    obj = ad.blue(abstractC3220y2, iVar22, hVar2);
                    if (obj != aVar) {
                    }
                }
                return aVar;
            }
        }
        hVar2 = new h(kVar, cVar);
        Object obj2 = hVar2.white;
        aVar = Od.a.alpha;
        i5 = hVar2.f1851s;
        if (i5 == 0) {
        }
        if (((V2.b) kVar.charlie.getValue()) != null) {
        }
        alpha.zulu.getClass();
        X2.b bVar2 = a3.f.alpha;
        mVar = alpha.charlie;
        if (mVar != null) {
        }
        cVar2.getClass();
        Y2.i iVar32 = alpha.victor;
        hVar2.alpha = kVar;
        hVar2.purple = lVar;
        hVar2.red = alpha;
        hVar2.silver = cVar2;
        hVar2.teal = null;
        hVar2.f1851s = 2;
        delta = iVar32.delta(hVar2);
        if (delta != aVar) {
        }
        return aVar;
    }

    public static void bravo(X2.d dVar, m mVar, c cVar) {
        X2.h hVar = dVar.bravo;
        cVar.getClass();
        hVar.getClass();
    }
}
