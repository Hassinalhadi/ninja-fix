package R2;

import Jb.C0201i;
import O2.q;
import Tf.ah;
import Tf.aj;
import Tf.ak;
import Tf.n;
import Tf.u;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import androidx.recyclerview.widget.RecyclerView;
import coil.network.HttpException;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Map;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import s6.AbstractC2689j6;
import s6.J6;
import vf.C3207k;

/* loaded from: classes3.dex */
public final class l implements g {
    public static final CacheControl foxtrot = new CacheControl.Builder().noCache().noStore().build();
    public static final CacheControl golf = new CacheControl.Builder().noCache().onlyIfCached().build();
    public final String alpha;
    public final X2.k bravo;
    public final Lazy charlie;
    public final Lazy delta;
    public final boolean echo;

    public l(String str, X2.k kVar, Lazy lazy, Lazy lazy2, boolean z2) {
        this.alpha = str;
        this.bravo = kVar;
        this.charlie = lazy;
        this.delta = lazy2;
        this.echo = z2;
    }

    public static String delta(String str, MediaType mediaType) {
        String str2;
        String bravo;
        if (mediaType != null) {
            str2 = mediaType.toString();
        } else {
            str2 = null;
        }
        if ((str2 == null || r.quebec(str2, "text/plain", false)) && (bravo = a3.h.bravo(MimeTypeMap.getSingleton(), str)) != null) {
            return bravo;
        }
        if (str2 == null) {
            return null;
        }
        return StringsKt.red(str2, ';');
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x012c A[Catch: Exception -> 0x00cc, TryCatch #0 {Exception -> 0x00cc, blocks: (B:28:0x021e, B:29:0x0221, B:36:0x0152, B:38:0x0222, B:39:0x0227, B:80:0x0094, B:82:0x009e, B:85:0x00d0, B:87:0x00d4, B:91:0x00ed, B:93:0x0139, B:97:0x0105, B:99:0x0111, B:100:0x011a, B:102:0x00b2, B:104:0x00bc, B:106:0x0124, B:107:0x012b, B:108:0x012c), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01e8 A[Catch: Exception -> 0x018c, TryCatch #1 {Exception -> 0x018c, blocks: (B:15:0x01e0, B:17:0x01e8, B:19:0x020f, B:20:0x0214, B:23:0x0212, B:24:0x0218, B:25:0x021d, B:41:0x015c, B:44:0x0168, B:46:0x0174, B:47:0x0182, B:49:0x018e, B:51:0x019a, B:53:0x01bc, B:54:0x01c1, B:56:0x01bf, B:57:0x01c5), top: B:40:0x015c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0218 A[Catch: Exception -> 0x018c, TryCatch #1 {Exception -> 0x018c, blocks: (B:15:0x01e0, B:17:0x01e8, B:19:0x020f, B:20:0x0214, B:23:0x0212, B:24:0x0218, B:25:0x021d, B:41:0x015c, B:44:0x0168, B:46:0x0174, B:47:0x0182, B:49:0x018e, B:51:0x019a, B:53:0x01bc, B:54:0x01c1, B:56:0x01bf, B:57:0x01c5), top: B:40:0x015c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0222 A[Catch: Exception -> 0x00cc, TryCatch #0 {Exception -> 0x00cc, blocks: (B:28:0x021e, B:29:0x0221, B:36:0x0152, B:38:0x0222, B:39:0x0227, B:80:0x0094, B:82:0x009e, B:85:0x00d0, B:87:0x00d4, B:91:0x00ed, B:93:0x0139, B:97:0x0105, B:99:0x0111, B:100:0x011a, B:102:0x00b2, B:104:0x00bc, B:106:0x0124, B:107:0x012b, B:108:0x012c), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0094 A[Catch: Exception -> 0x00cc, TRY_ENTER, TryCatch #0 {Exception -> 0x00cc, blocks: (B:28:0x021e, B:29:0x0221, B:36:0x0152, B:38:0x0222, B:39:0x0227, B:80:0x0094, B:82:0x009e, B:85:0x00d0, B:87:0x00d4, B:91:0x00ed, B:93:0x0139, B:97:0x0105, B:99:0x0111, B:100:0x011a, B:102:0x00b2, B:104:0x00bc, B:106:0x0124, B:107:0x012b, B:108:0x012c), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    @Override // R2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object alpha(Nd.c cVar) {
        k kVar;
        ?? r32;
        P2.h hVar;
        P2.h hVar2;
        W2.e alpha;
        Object bravo;
        W2.e eVar;
        l lVar;
        W2.b bVar;
        P2.i iVar;
        ResponseBody body;
        Response response;
        Exception e;
        l lVar2;
        O2.f fVar;
        ResponseBody body2;
        O2.f fVar2;
        int i4 = 3;
        try {
            if (cVar instanceof k) {
                kVar = (k) cVar;
                int i5 = kVar.white;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    kVar.white = i5 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = kVar.silver;
                    Od.a aVar = Od.a.alpha;
                    r32 = kVar.white;
                    MediaType mediaType = null;
                    if (r32 == 0) {
                        if (r32 != 1) {
                            if (r32 == 2) {
                                response = (Response) kVar.red;
                                P2.h hVar3 = kVar.purple;
                                lVar2 = kVar.alpha;
                                try {
                                    ResultKt.alpha(obj);
                                    Response response2 = (Response) obj;
                                    Bitmap.Config[] configArr = a3.h.alpha;
                                    body2 = response2.body();
                                    if (body2 == null) {
                                        lVar2.getClass();
                                        q qVar = new q(body2.getBodySource(), new C0201i(lVar2.bravo.alpha, i4), null);
                                        String delta = delta(lVar2.alpha, body2.getMediaType());
                                        if (response2.networkResponse() != null) {
                                            fVar2 = O2.f.silver;
                                        } else {
                                            fVar2 = O2.f.red;
                                        }
                                        return new m(qVar, delta, fVar2);
                                    }
                                    throw new IllegalStateException("response body == null");
                                } catch (Exception e4) {
                                    e = e4;
                                    a3.h.alpha(response);
                                    throw e;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        W2.e eVar2 = (W2.e) kVar.red;
                        hVar = kVar.purple;
                        lVar = kVar.alpha;
                        try {
                            ResultKt.alpha(obj);
                            eVar = eVar2;
                            hVar2 = hVar;
                        } catch (Exception e5) {
                            e = e5;
                            if (hVar != null) {
                                a3.h.alpha(hVar);
                            }
                            throw e;
                        }
                    } else {
                        ResultKt.alpha(obj);
                        X2.k kVar2 = this.bravo;
                        boolean z2 = kVar2.november.alpha;
                        String str = this.alpha;
                        if (z2 && (iVar = (P2.i) this.delta.getValue()) != null) {
                            String str2 = kVar2.india;
                            if (str2 == null) {
                                str2 = str;
                            }
                            n nVar = n.silver;
                            P2.c foxtrot2 = iVar.bravo.foxtrot(g8.d.oscar(str2).charlie("SHA-256").echo());
                            if (foxtrot2 != null) {
                                hVar2 = new P2.h(foxtrot2);
                                if (hVar2 == null) {
                                    u charlie = charlie();
                                    P2.c cVar2 = hVar2.alpha;
                                    if (!cVar2.purple) {
                                        Long l10 = charlie.metadata((ah) cVar2.alpha.charlie.get(0)).delta;
                                        if (l10 != null && l10.longValue() == 0) {
                                            return new m(golf(hVar2), delta(str, null), O2.f.red);
                                        }
                                        if (this.echo) {
                                            alpha = new W2.d(echo(), foxtrot(hVar2)).alpha();
                                            if (alpha.alpha == null && (bVar = alpha.bravo) != null) {
                                                return new m(golf(hVar2), delta(str, (MediaType) bVar.bravo.getValue()), O2.f.red);
                                            }
                                        } else {
                                            O2.n golf2 = golf(hVar2);
                                            W2.b foxtrot3 = foxtrot(hVar2);
                                            if (foxtrot3 != null) {
                                                mediaType = (MediaType) foxtrot3.bravo.getValue();
                                            }
                                            return new m(golf2, delta(str, mediaType), O2.f.red);
                                        }
                                    } else {
                                        throw new IllegalStateException("snapshot is closed");
                                    }
                                } else {
                                    alpha = new W2.d(echo(), null).alpha();
                                }
                                Request request = alpha.alpha;
                                Intrinsics.checkNotNull(request);
                                kVar.alpha = this;
                                kVar.purple = hVar2;
                                kVar.red = alpha;
                                kVar.white = 1;
                                bravo = bravo(request, kVar);
                                if (bravo == aVar) {
                                    eVar = alpha;
                                    obj = bravo;
                                    lVar = this;
                                } else {
                                    return aVar;
                                }
                            }
                        }
                        hVar2 = null;
                        if (hVar2 == null) {
                        }
                        Request request2 = alpha.alpha;
                        Intrinsics.checkNotNull(request2);
                        kVar.alpha = this;
                        kVar.purple = hVar2;
                        kVar.red = alpha;
                        kVar.white = 1;
                        bravo = bravo(request2, kVar);
                        if (bravo == aVar) {
                        }
                    }
                    Response response3 = (Response) obj;
                    Bitmap.Config[] configArr2 = a3.h.alpha;
                    body = response3.body();
                    if (body == null) {
                        try {
                            P2.h hotel = lVar.hotel(hVar2, eVar.alpha, response3, eVar.bravo);
                            String str3 = lVar.alpha;
                            if (hotel != null) {
                                O2.n golf3 = lVar.golf(hotel);
                                W2.b foxtrot4 = lVar.foxtrot(hotel);
                                if (foxtrot4 != null) {
                                    mediaType = (MediaType) foxtrot4.bravo.getValue();
                                }
                                return new m(golf3, delta(str3, mediaType), O2.f.silver);
                            }
                            if (body.getBodySource().request(1L)) {
                                q qVar2 = new q(body.getBodySource(), new C0201i(lVar.bravo.alpha, i4), null);
                                String delta2 = delta(str3, body.getMediaType());
                                if (response3.networkResponse() != null) {
                                    fVar = O2.f.silver;
                                } else {
                                    fVar = O2.f.red;
                                }
                                return new m(qVar2, delta2, fVar);
                            }
                            a3.h.alpha(response3);
                            Request echo = lVar.echo();
                            kVar.alpha = lVar;
                            kVar.purple = hotel;
                            kVar.red = response3;
                            kVar.white = 2;
                            Object bravo2 = lVar.bravo(echo, kVar);
                            if (bravo2 != aVar) {
                                response = response3;
                                obj = bravo2;
                                lVar2 = lVar;
                                Response response22 = (Response) obj;
                                Bitmap.Config[] configArr3 = a3.h.alpha;
                                body2 = response22.body();
                                if (body2 == null) {
                                }
                            }
                            return aVar;
                        } catch (Exception e10) {
                            response = response3;
                            e = e10;
                            a3.h.alpha(response);
                            throw e;
                        }
                    }
                    throw new IllegalStateException("response body == null");
                }
            }
            if (r32 == 0) {
            }
            Response response32 = (Response) obj;
            Bitmap.Config[] configArr22 = a3.h.alpha;
            body = response32.body();
            if (body == null) {
            }
        } catch (Exception e11) {
            e = e11;
            hVar = r32;
        }
        kVar = new k(this, (Pd.c) cVar);
        Object obj2 = kVar.silver;
        Od.a aVar2 = Od.a.alpha;
        r32 = kVar.white;
        MediaType mediaType2 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bravo(Request request, Pd.c cVar) {
        j jVar;
        int i4;
        Response execute;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i5 = jVar.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                jVar.red = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = jVar.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = jVar.red;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    Bitmap.Config[] configArr = a3.h.alpha;
                    boolean areEqual = Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper());
                    Lazy lazy = this.charlie;
                    if (areEqual) {
                        if (!this.bravo.oscar.alpha) {
                            execute = FirebasePerfOkHttpClient.execute(((Call.Factory) lazy.getValue()).newCall(request));
                            if (execute.getIsSuccessful() && execute.code() != 304) {
                                ResponseBody body = execute.body();
                                if (body != null) {
                                    a3.h.alpha(body);
                                }
                                throw new HttpException(execute);
                            }
                            return execute;
                        }
                        throw new NetworkOnMainThreadException();
                    }
                    Call newCall = ((Call.Factory) lazy.getValue()).newCall(request);
                    jVar.red = 1;
                    C3207k c3207k = new C3207k(1, J6.delta(jVar));
                    c3207k.tango();
                    Cb.l lVar = new Cb.l(9, newCall, c3207k);
                    FirebasePerfOkHttpClient.enqueue(newCall, lVar);
                    c3207k.victor(lVar);
                    obj = c3207k.sierra();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                execute = (Response) obj;
                if (execute.getIsSuccessful()) {
                }
                return execute;
            }
        }
        jVar = new j(this, cVar);
        Object obj2 = jVar.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = jVar.red;
        if (i4 == 0) {
        }
        execute = (Response) obj2;
        if (execute.getIsSuccessful()) {
        }
        return execute;
    }

    public final u charlie() {
        Object value = this.delta.getValue();
        Intrinsics.checkNotNull(value);
        return ((P2.i) value).alpha;
    }

    public final Request echo() {
        Request.Builder url = new Request.Builder().url(this.alpha);
        X2.k kVar = this.bravo;
        Request.Builder headers = url.headers(kVar.juliet);
        for (Map.Entry entry : kVar.kilo.alpha.entrySet()) {
            Object key = entry.getKey();
            Intrinsics.charlie(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            headers.tag((Class<? super Class>) key, (Class) entry.getValue());
        }
        X2.a aVar = kVar.november;
        boolean z2 = aVar.alpha;
        boolean z10 = kVar.oscar.alpha;
        if (!z10 && z2) {
            headers.cacheControl(CacheControl.FORCE_CACHE);
        } else if (z10 && !z2) {
            if (aVar.purple) {
                headers.cacheControl(CacheControl.FORCE_NETWORK);
            } else {
                headers.cacheControl(foxtrot);
            }
        } else if (!z10 && !z2) {
            headers.cacheControl(golf);
        }
        return headers.build();
    }

    public final W2.b foxtrot(P2.h hVar) {
        Throwable th;
        W2.b bVar;
        try {
            u charlie = charlie();
            P2.c cVar = hVar.alpha;
            if (!cVar.purple) {
                ak charlie2 = Tf.b.charlie(charlie.source((ah) cVar.alpha.charlie.get(0)));
                try {
                    bVar = new W2.b(charlie2);
                    try {
                        charlie2.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        charlie2.close();
                    } catch (Throwable th4) {
                        AbstractC2689j6.charlie(th3, th4);
                    }
                    th = th3;
                    bVar = null;
                }
                if (th == null) {
                    return bVar;
                }
                throw th;
            }
            throw new IllegalStateException("snapshot is closed");
        } catch (IOException unused) {
            return null;
        }
    }

    public final O2.n golf(P2.h hVar) {
        P2.c cVar = hVar.alpha;
        if (!cVar.purple) {
            ah ahVar = (ah) cVar.alpha.charlie.get(1);
            u charlie = charlie();
            String str = this.bravo.india;
            if (str == null) {
                str = this.alpha;
            }
            return new O2.n(ahVar, charlie, str, hVar);
        }
        throw new IllegalStateException("snapshot is closed");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final P2.h hotel(P2.h hVar, Request request, Response response, W2.b bVar) {
        O7.l lVar;
        Throwable th;
        C3.d echo;
        int i4 = 1;
        Throwable th2 = null;
        if (this.bravo.november.purple && (!this.echo || (!request.cacheControl().noStore() && !response.cacheControl().noStore() && !Intrinsics.areEqual(response.headers().get("Vary"), "*")))) {
            if (hVar != null) {
                P2.c cVar = hVar.alpha;
                P2.f fVar = cVar.red;
                synchronized (fVar) {
                    cVar.close();
                    echo = fVar.echo(cVar.alpha.alpha);
                }
                if (echo != null) {
                    lVar = new O7.l(i4, echo);
                    if (lVar != null) {
                        try {
                            try {
                                if (response.code() == 304 && bVar != null) {
                                    Response build = response.newBuilder().headers(W2.c.alpha(bVar.foxtrot, response.headers())).build();
                                    aj bravo = Tf.b.bravo(charlie().sink(((C3.d) lVar.purple).delta(0), false));
                                    try {
                                        new W2.b(build).alpha(bravo);
                                        try {
                                            bravo.close();
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                        }
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                        try {
                                            bravo.close();
                                        } catch (Throwable th5) {
                                            AbstractC2689j6.charlie(th2, th5);
                                        }
                                    }
                                    if (th2 != null) {
                                        throw th2;
                                    }
                                } else {
                                    aj bravo2 = Tf.b.bravo(charlie().sink(((C3.d) lVar.purple).delta(0), false));
                                    try {
                                        new W2.b(response).alpha(bravo2);
                                        try {
                                            bravo2.close();
                                            th = null;
                                        } catch (Throwable th6) {
                                            th = th6;
                                        }
                                    } catch (Throwable th7) {
                                        try {
                                            bravo2.close();
                                        } catch (Throwable th8) {
                                            AbstractC2689j6.charlie(th7, th8);
                                        }
                                        th = th7;
                                    }
                                    if (th == null) {
                                        aj bravo3 = Tf.b.bravo(charlie().sink(((C3.d) lVar.purple).delta(1), false));
                                        try {
                                            ResponseBody body = response.body();
                                            Intrinsics.checkNotNull(body);
                                            body.getBodySource().g(bravo3);
                                            try {
                                                bravo3.close();
                                            } catch (Throwable th9) {
                                                th2 = th9;
                                            }
                                        } catch (Throwable th10) {
                                            th2 = th10;
                                            try {
                                                bravo3.close();
                                            } catch (Throwable th11) {
                                                AbstractC2689j6.charlie(th2, th11);
                                            }
                                        }
                                        if (th2 != null) {
                                            throw th2;
                                        }
                                    } else {
                                        throw th;
                                    }
                                }
                                P2.h white = lVar.white();
                                a3.h.alpha(response);
                                return white;
                            } catch (Exception e) {
                                Bitmap.Config[] configArr = a3.h.alpha;
                                try {
                                    ((C3.d) lVar.purple).charlie(false);
                                } catch (Exception unused) {
                                }
                                throw e;
                            }
                        } catch (Throwable th12) {
                            a3.h.alpha(response);
                            throw th12;
                        }
                    }
                }
                lVar = null;
                if (lVar != null) {
                }
            } else {
                P2.i iVar = (P2.i) this.delta.getValue();
                if (iVar != null) {
                    String str = this.bravo.india;
                    if (str == null) {
                        str = this.alpha;
                    }
                    P2.f fVar2 = iVar.bravo;
                    n nVar = n.silver;
                    C3.d echo2 = fVar2.echo(g8.d.oscar(str).charlie("SHA-256").echo());
                    if (echo2 != null) {
                        lVar = new O7.l(i4, echo2);
                        if (lVar != null) {
                        }
                    }
                }
                lVar = null;
                if (lVar != null) {
                }
            }
        } else if (hVar != null) {
            a3.h.alpha(hVar);
        }
        return null;
    }
}
