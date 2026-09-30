package X9;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.play.core.integrity.StandardIntegrityException;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p7.C2285b;
import s6.J6;
import vf.C3207k;

/* loaded from: classes2.dex */
public final class z {
    public static final z alpha = new Object();
    public static final AtomicReference bravo = new AtomicReference(null);
    public static final AtomicReference charlie = new AtomicReference(null);
    public static final AtomicLong delta = new AtomicLong(0);

    public static r alpha(Exception exc) {
        if (exc instanceof StandardIntegrityException) {
            int errorCode = ((StandardIntegrityException) exc).getErrorCode();
            if (errorCode != -100 && errorCode != -12) {
                if (errorCode != -8) {
                    if (errorCode != -3) {
                        if (errorCode != -19) {
                            if (errorCode != -18) {
                                return r.silver;
                            }
                        } else {
                            return r.red;
                        }
                    }
                } else {
                    return r.white;
                }
            }
            return r.teal;
        }
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        String upperCase = message.toUpperCase(Locale.ROOT);
        Intrinsics.delta(upperCase, "toUpperCase(...)");
        if (StringsKt.beige(upperCase, "QUOTA", false)) {
            return r.white;
        }
        if (StringsKt.beige(upperCase, "NETWORK", false)) {
            return r.teal;
        }
        return r.yellow;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.play.core.integrity.o, java.lang.Object] */
    public static Object bravo(Context context, w wVar) {
        com.google.android.material.internal.s sVar;
        int i4 = 1;
        Context applicationContext = context.getApplicationContext();
        synchronized (com.google.android.play.core.integrity.a.class) {
            try {
                if (com.google.android.play.core.integrity.a.alpha == null) {
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    if (applicationContext2 != null) {
                        applicationContext = applicationContext2;
                    }
                    com.google.android.play.core.integrity.a.alpha = new com.google.android.material.internal.s(applicationContext);
                }
                sVar = com.google.android.play.core.integrity.a.alpha;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.play.core.integrity.b bVar = (com.google.android.play.core.integrity.b) ((p7.k) sVar.purple).bravo();
        Intrinsics.delta(bVar, "createStandard(...)");
        byte b2 = (byte) (((byte) 2) | 1);
        if (b2 != 3) {
            StringBuilder sb2 = new StringBuilder();
            if ((b2 & 1) == 0) {
                sb2.append(" cloudProjectNumber");
            }
            if ((b2 & 2) == 0) {
                sb2.append(" webViewRequestMode");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
        }
        ?? obj = new Object();
        C3207k c3207k = new C3207k(1, J6.delta(wVar));
        c3207k.tango();
        com.google.android.play.core.integrity.i iVar = bVar.alpha;
        iVar.alpha.bravo("warmUpIntegrityToken(%s)", 244414812773L);
        G6.h hVar = new G6.h();
        com.google.android.play.core.integrity.e eVar = new com.google.android.play.core.integrity.e(iVar, hVar, hVar);
        C2285b c2285b = iVar.echo;
        c2285b.getClass();
        c2285b.alpha().post(new p7.w(c2285b, hVar, hVar, eVar));
        G6.q kilo = hVar.alpha.kilo(new com.google.android.material.internal.s(bVar, (com.google.android.play.core.integrity.o) obj));
        kilo.echo(G6.i.alpha, new O7.j(16, new v(c3207k, 0)));
        kilo.lima(new Ff.b(c3207k, i4));
        Object sierra = c3207k.sierra();
        Od.a aVar = Od.a.alpha;
        return sierra;
    }

    public static Object charlie(com.google.android.play.core.integrity.m mVar, String str, Pd.c cVar) {
        int i4 = p7.h.red;
        p7.j jVar = p7.j.yellow;
        if (jVar != null) {
            com.google.android.play.core.integrity.p pVar = new com.google.android.play.core.integrity.p(str, jVar);
            C3207k c3207k = new C3207k(1, J6.delta(cVar));
            c3207k.tango();
            long j5 = mVar.bravo;
            Object[] objArr = {Long.valueOf(j5)};
            com.google.android.play.core.integrity.i iVar = mVar.alpha.alpha;
            iVar.alpha.bravo("requestExpressIntegrityToken(%s)", objArr);
            G6.h hVar = new G6.h();
            com.google.android.play.core.integrity.f fVar = new com.google.android.play.core.integrity.f(iVar, hVar, pVar, j5, hVar);
            C2285b c2285b = iVar.echo;
            c2285b.getClass();
            c2285b.alpha().post(new p7.w(c2285b, hVar, hVar, fVar));
            O7.j jVar2 = new O7.j(16, new v(c3207k, 1));
            G6.q qVar = hVar.alpha;
            qVar.getClass();
            qVar.echo(G6.i.alpha, jVar2);
            qVar.lima(new O9.c(c3207k));
            Object sierra = c3207k.sierra();
            Od.a aVar = Od.a.alpha;
            return sierra;
        }
        throw new NullPointerException("Null verdictOptOut");
    }

    public static boolean delta(Context context) {
        Intrinsics.echo(context, "context");
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
            return true;
        }
        return false;
    }

    public static s foxtrot(Exception exc) {
        r alpha2 = alpha(exc);
        charlie.set(alpha2);
        exc.getMessage();
        alpha2.toString();
        K7.b.alpha().bravo("security: play_integrity_token_failed reason=" + alpha2 + " err=" + exc.getClass().getSimpleName() + " msg=" + exc.getMessage());
        return new s(alpha2, exc.getMessage());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object echo(Context context, Pd.c cVar) {
        w wVar;
        int i4;
        AtomicReference atomicReference;
        try {
            if (cVar instanceof w) {
                wVar = (w) cVar;
                int i5 = wVar.red;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    wVar.red = i5 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = wVar.alpha;
                    Od.a aVar = Od.a.alpha;
                    i4 = wVar.red;
                    AtomicReference atomicReference2 = bravo;
                    atomicReference = charlie;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            ResultKt.alpha(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj);
                        if (!delta(context)) {
                            r rVar = r.alpha;
                            atomicReference.set(rVar);
                            return new s(rVar, "Google Play Services not available");
                        }
                        if (((com.google.android.play.core.integrity.m) atomicReference2.get()) != null) {
                            return new t("PREPARED");
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        AtomicLong atomicLong = delta;
                        if (currentTimeMillis - atomicLong.get() < 12000) {
                            return new s(r.white, "prepare throttled");
                        }
                        atomicLong.set(currentTimeMillis);
                        wVar.red = 1;
                        obj = bravo(context, wVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    atomicReference2.set((com.google.android.play.core.integrity.m) obj);
                    atomicReference.set(null);
                    return new t("PREPARED");
                }
            }
            if (i4 == 0) {
            }
            atomicReference2.set((com.google.android.play.core.integrity.m) obj);
            atomicReference.set(null);
            return new t("PREPARED");
        } catch (Exception e) {
            r alpha2 = alpha(e);
            atomicReference.set(alpha2);
            e.getMessage();
            alpha2.toString();
            K7.b.alpha().bravo("security: play_integrity_prepare_failed reason=" + alpha2 + " err=" + e.getClass().getSimpleName() + " msg=" + e.getMessage());
            return new s(alpha2, e.getMessage());
        }
        wVar = new w(this, cVar);
        Object obj2 = wVar.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = wVar.red;
        AtomicReference atomicReference22 = bravo;
        atomicReference = charlie;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f3, code lost:
    
        if (r14 == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0091, code lost:
    
        if (r14 == r1) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object golf(Context context, String str, Pd.c cVar) {
        x xVar;
        int i4;
        com.google.android.play.core.integrity.m mVar;
        Context context2;
        String str2;
        u uVar;
        try {
            if (cVar instanceof x) {
                xVar = (x) cVar;
                int i5 = xVar.white;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    xVar.white = i5 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = xVar.silver;
                    Object obj2 = Od.a.alpha;
                    i4 = xVar.white;
                    AtomicReference atomicReference = bravo;
                    AtomicReference atomicReference2 = charlie;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 != 3) {
                                    if (i4 == 4) {
                                        ResultKt.alpha(obj);
                                        return obj;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                str2 = xVar.purple;
                                ResultKt.alpha(obj);
                                u uVar2 = (u) obj;
                                if (uVar2 instanceof s) {
                                    return uVar2;
                                }
                                com.google.android.play.core.integrity.m mVar2 = (com.google.android.play.core.integrity.m) atomicReference.get();
                                if (mVar2 == null) {
                                    r rVar = r.purple;
                                    atomicReference2.set(rVar);
                                    return new s(rVar, "Re-prepare returned no provider");
                                }
                                xVar.alpha = null;
                                xVar.purple = null;
                                xVar.red = null;
                                xVar.white = 4;
                                Object hotel = hotel(mVar2, str2, xVar);
                                if (hotel == obj2) {
                                    return obj2;
                                }
                                return hotel;
                            }
                            str2 = xVar.purple;
                            context2 = xVar.alpha;
                            try {
                                ResultKt.alpha(obj);
                                String str3 = (String) obj;
                                atomicReference2.set(null);
                                str3.getClass();
                                return new t(str3);
                            } catch (StandardIntegrityException e) {
                                e = e;
                                if (e.getErrorCode() != -19) {
                                    atomicReference.set(null);
                                    xVar.alpha = null;
                                    xVar.purple = str2;
                                    xVar.red = null;
                                    xVar.white = 3;
                                    obj = echo(context2, xVar);
                                } else {
                                    return foxtrot(e);
                                }
                            }
                        } else {
                            str = xVar.purple;
                            context = xVar.alpha;
                            ResultKt.alpha(obj);
                        }
                    } else {
                        ResultKt.alpha(obj);
                        if (!delta(context)) {
                            r rVar2 = r.alpha;
                            atomicReference2.set(rVar2);
                            return new s(rVar2, "Google Play Services not available");
                        }
                        mVar = (com.google.android.play.core.integrity.m) atomicReference.get();
                        if (mVar == null) {
                            xVar.alpha = context;
                            xVar.purple = str;
                            xVar.red = this;
                            xVar.white = 1;
                            obj = echo(context, xVar);
                        }
                        try {
                            xVar.alpha = context;
                            xVar.purple = str;
                            xVar.red = null;
                            xVar.white = 2;
                            obj = charlie(mVar, str, xVar);
                            if (obj != obj2) {
                                String str4 = str;
                                context2 = context;
                                str2 = str4;
                                String str32 = (String) obj;
                                atomicReference2.set(null);
                                str32.getClass();
                                return new t(str32);
                            }
                        } catch (StandardIntegrityException e4) {
                            e = e4;
                            String str5 = str;
                            context2 = context;
                            str2 = str5;
                            if (e.getErrorCode() != -19) {
                            }
                        }
                        return obj2;
                    }
                    uVar = (u) obj;
                    if (!(uVar instanceof s)) {
                        return uVar;
                    }
                    mVar = (com.google.android.play.core.integrity.m) atomicReference.get();
                    if (mVar == null) {
                        r rVar3 = r.purple;
                        atomicReference2.set(rVar3);
                        return new s(rVar3, "Provider unavailable after prepare");
                    }
                    xVar.alpha = context;
                    xVar.purple = str;
                    xVar.red = null;
                    xVar.white = 2;
                    obj = charlie(mVar, str, xVar);
                    if (obj != obj2) {
                    }
                    return obj2;
                }
            }
            if (i4 == 0) {
            }
            uVar = (u) obj;
            if (!(uVar instanceof s)) {
            }
        } catch (Exception e5) {
            return foxtrot(e5);
        }
        xVar = new x(this, cVar);
        Object obj3 = xVar.silver;
        Object obj22 = Od.a.alpha;
        i4 = xVar.white;
        AtomicReference atomicReference3 = bravo;
        AtomicReference atomicReference22 = charlie;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hotel(com.google.android.play.core.integrity.m mVar, String str, Pd.c cVar) {
        y yVar;
        int i4;
        try {
            if (cVar instanceof y) {
                yVar = (y) cVar;
                int i5 = yVar.red;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    yVar.red = i5 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = yVar.alpha;
                    Od.a aVar = Od.a.alpha;
                    i4 = yVar.red;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            ResultKt.alpha(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj);
                        yVar.red = 1;
                        obj = charlie(mVar, str, yVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    charlie.set(null);
                    return new t((String) obj);
                }
            }
            if (i4 == 0) {
            }
            charlie.set(null);
            return new t((String) obj);
        } catch (Exception e) {
            return foxtrot(e);
        }
        yVar = new y(this, cVar);
        Object obj2 = yVar.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = yVar.red;
    }
}
