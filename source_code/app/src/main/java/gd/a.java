package gd;

import G6.p;
import T5.m;
import T5.n;
import V5.x;
import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.appcompat.widget.P0;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import bx.C0769g;
import com.google.android.gms.internal.identity.zzee;
import com.google.android.gms.internal.identity.zzeg;
import com.google.android.gms.internal.identity.zzei;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.gson.JsonIOException;
import com.google.gson.ad;
import hd.ao;
import io.ktor.client.engine.okhttp.StreamAdapterIOException;
import io.ktor.client.network.sockets.ConnectTimeoutException;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.B;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.aj;
import kotlin.reflect.jvm.internal.impl.types.ar;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.av;
import kotlin.reflect.jvm.internal.impl.types.s;
import kotlin.text.StringsKt;
import od.C2227d;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p6.ab;
import p6.q;
import p6.y;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.aq;
import q0.ap;
import s0.al;
import s6.O5;
import vf.C3207k;

/* loaded from: classes2.dex */
public final class a implements Callback, m, G6.f, vg.m {
    public final /* synthetic */ int alpha;
    public Object purple;
    public Object red;

    public /* synthetic */ a(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    @Override // T5.m
    public void accept(Object obj, Object obj2) {
        switch (this.alpha) {
            case 4:
                p pVar = new p((G6.h) obj2);
                ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) this.purple;
                PendingIntent pendingIntent = (PendingIntent) this.red;
                x.india(pendingIntent, "PendingIntent must be specified.");
                n nVar = new n(pVar);
                ab abVar = (ab) ((y) obj).tango();
                Parcel ivory = abVar.ivory();
                p6.e.bravo(ivory, activityTransitionRequest);
                p6.e.bravo(ivory, pendingIntent);
                ivory.writeStrongBinder(nVar);
                abVar.lavender(ivory, 72);
                return;
            default:
                G6.h hVar = (G6.h) obj2;
                q qVar = (q) obj;
                boolean black = qVar.black(com.google.android.gms.location.n.foxtrot);
                PendingIntent pendingIntent2 = (PendingIntent) this.purple;
                LocationRequest locationRequest = (LocationRequest) this.red;
                if (black) {
                    ((ab) qVar.tango()).maroon(new zzee(3, null, null, pendingIntent2, null), locationRequest, new p6.l(null, hVar));
                    return;
                }
                ab abVar2 = (ab) qVar.tango();
                zzeg zzegVar = new zzeg(locationRequest, null, false, false, false, false, Long.MAX_VALUE);
                p6.i iVar = new p6.i((Boolean) null, hVar);
                int hashCode = pendingIntent2.hashCode();
                StringBuilder sb2 = new StringBuilder(String.valueOf(hashCode).length() + 14);
                sb2.append("PendingIntent@");
                sb2.append(hashCode);
                abVar2.magenta(new zzei(1, zzegVar, null, null, pendingIntent2, iVar, sb2.toString()));
                return;
        }
    }

    @Override // G6.f
    public /* synthetic */ void alpha() {
        try {
            ((q) this.purple).coral((T5.i) this.red, true, new G6.h());
        } catch (RemoteException unused) {
        }
    }

    @Override // vg.m
    public Object bravo(Object obj) {
        ResponseBody responseBody = (ResponseBody) obj;
        Reader charStream = responseBody.charStream();
        ((com.google.gson.l) this.purple).getClass();
        S8.a aVar = new S8.a(charStream);
        aVar.j(2);
        try {
            Object read = ((ad) this.red).read(aVar);
            if (aVar.white() == S8.b.f2050c) {
                return read;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public Object charlie(Class key) {
        Intrinsics.echo(key, "key");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.red;
        Object obj = concurrentHashMap.get(key);
        if (obj == null) {
            Object invoke = ((Lambda) this.purple).invoke(key);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(key, invoke);
            if (putIfAbsent == null) {
                return invoke;
            }
            return putIfAbsent;
        }
        return obj;
    }

    public B delta(De.a aVar) {
        B lima;
        ae aeVar = aVar.foxtrot;
        if (aeVar != null && (lima = O5.lima(aeVar)) != null) {
            return lima;
        }
        return (hf.f) ((Lazy) this.purple).getValue();
    }

    public kotlin.reflect.jvm.internal.impl.types.y echo(aq typeParameter, De.a typeAttr) {
        Intrinsics.echo(typeParameter, "typeParameter");
        Intrinsics.echo(typeAttr, "typeAttr");
        return (kotlin.reflect.jvm.internal.impl.types.y) ((ff.e) this.red).invoke(new ar(typeParameter, typeAttr));
    }

    public ap foxtrot() {
        return (ap) ((t0) ((ax) this.red)).getValue();
    }

    public byte[] golf() {
        String str = (String) this.red;
        try {
            String string = ((SharedPreferences) this.purple).getString(str, null);
            if (string != null) {
                return com.bumptech.glide.c.alpha(string);
            }
            throw new FileNotFoundException("can't read keyset; the pref value " + str + " does not exist");
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(ao.ad.gray("can't read keyset; the pref value ", str, " is not a valid hex string"));
        }
    }

    public Ld.j hotel(kotlin.reflect.jvm.internal.impl.types.ax axVar, List list, De.a aVar) {
        B b2;
        int collectionSizeOrDefault;
        boolean z2;
        int collectionSizeOrDefault2;
        boolean z10;
        int collectionSizeOrDefault3;
        boolean z11;
        Ld.j jVar = new Ld.j();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.types.y yVar = (kotlin.reflect.jvm.internal.impl.types.y) it.next();
            InterfaceC2332h kilo = yVar.green().kilo();
            if (kilo instanceof InterfaceC2330f) {
                Set set = aVar.echo;
                B ochre = yVar.ochre();
                if (ochre instanceof s) {
                    s sVar = (s) ochre;
                    ae aeVar = sVar.purple;
                    if (!aeVar.green().getParameters().isEmpty() && aeVar.green().kilo() != null) {
                        List<aq> parameters = aeVar.green().getParameters();
                        Intrinsics.delta(parameters, "constructor.parameters");
                        collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10);
                        ArrayList arrayList = new ArrayList(collectionSizeOrDefault3);
                        for (aq aqVar : parameters) {
                            as asVar = (as) CollectionsKt.jade(aqVar.getIndex(), yVar.cyan());
                            if (set != null && set.contains(aqVar)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (asVar != null && !z11) {
                                av foxtrot = axVar.foxtrot();
                                kotlin.reflect.jvm.internal.impl.types.y bravo = asVar.bravo();
                                Intrinsics.delta(bravo, "argument.type");
                                if (foxtrot.delta(bravo) != null) {
                                    arrayList.add(asVar);
                                }
                            }
                            asVar = new aj(aqVar);
                            arrayList.add(asVar);
                        }
                        aeVar = kotlin.reflect.jvm.internal.impl.types.c.papa(aeVar, arrayList, null, 2);
                    }
                    ae aeVar2 = sVar.red;
                    if (!aeVar2.green().getParameters().isEmpty() && aeVar2.green().kilo() != null) {
                        List<aq> parameters2 = aeVar2.green().getParameters();
                        Intrinsics.delta(parameters2, "constructor.parameters");
                        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters2, 10);
                        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                        for (aq aqVar2 : parameters2) {
                            as asVar2 = (as) CollectionsKt.jade(aqVar2.getIndex(), yVar.cyan());
                            if (set != null && set.contains(aqVar2)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (asVar2 != null && !z10) {
                                av foxtrot2 = axVar.foxtrot();
                                kotlin.reflect.jvm.internal.impl.types.y bravo2 = asVar2.bravo();
                                Intrinsics.delta(bravo2, "argument.type");
                                if (foxtrot2.delta(bravo2) != null) {
                                    arrayList2.add(asVar2);
                                }
                            }
                            asVar2 = new aj(aqVar2);
                            arrayList2.add(asVar2);
                        }
                        aeVar2 = kotlin.reflect.jvm.internal.impl.types.c.papa(aeVar2, arrayList2, null, 2);
                    }
                    b2 = kotlin.reflect.jvm.internal.impl.types.ab.alpha(aeVar, aeVar2);
                } else if (ochre instanceof ae) {
                    ae aeVar3 = (ae) ochre;
                    if (!aeVar3.green().getParameters().isEmpty() && aeVar3.green().kilo() != null) {
                        List<aq> parameters3 = aeVar3.green().getParameters();
                        Intrinsics.delta(parameters3, "constructor.parameters");
                        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters3, 10);
                        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
                        for (aq aqVar3 : parameters3) {
                            as asVar3 = (as) CollectionsKt.jade(aqVar3.getIndex(), yVar.cyan());
                            if (set != null && set.contains(aqVar3)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (asVar3 != null && !z2) {
                                av foxtrot3 = axVar.foxtrot();
                                kotlin.reflect.jvm.internal.impl.types.y bravo3 = asVar3.bravo();
                                Intrinsics.delta(bravo3, "argument.type");
                                if (foxtrot3.delta(bravo3) != null) {
                                    arrayList3.add(asVar3);
                                }
                            }
                            asVar3 = new aj(aqVar3);
                            arrayList3.add(asVar3);
                        }
                        b2 = kotlin.reflect.jvm.internal.impl.types.c.papa(aeVar3, arrayList3, null, 2);
                    } else {
                        b2 = aeVar3;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                jVar.add(axVar.golf(3, kotlin.reflect.jvm.internal.impl.types.c.golf(b2, ochre)));
            } else if (kilo instanceof aq) {
                Set set2 = aVar.echo;
                if (set2 != null && set2.contains(kilo)) {
                    jVar.add(delta(aVar));
                } else {
                    List upperBounds = ((aq) kilo).getUpperBounds();
                    Intrinsics.delta(upperBounds, "declaration.upperBounds");
                    jVar.addAll(hotel(axVar, upperBounds, aVar));
                }
            }
        }
        return kotlin.collections.ab.bravo(jVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 == null) goto L24;
     */
    @Override // okhttp3.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onFailure(Call call, IOException e) {
        Throwable connectTimeoutException;
        Object obj;
        Intrinsics.echo(call, "call");
        Intrinsics.echo(e, "e");
        C3207k c3207k = (C3207k) this.red;
        if (c3207k.isCancelled()) {
            return;
        }
        Result.Companion companion = Result.INSTANCE;
        if (e instanceof StreamAdapterIOException) {
            connectTimeoutException = e.getCause();
        } else {
            if (e instanceof SocketTimeoutException) {
                String message = e.getMessage();
                C2227d request = (C2227d) this.purple;
                if (message != null && StringsKt.beige(message, "connect", true)) {
                    rg.b bVar = hd.ar.alpha;
                    Intrinsics.echo(request, "request");
                    StringBuilder sb2 = new StringBuilder("Connect timeout has expired [url=");
                    sb2.append(request.alpha);
                    sb2.append(", connect_timeout=");
                    ao aoVar = (ao) request.alpha();
                    if (aoVar == null || (obj = aoVar.bravo) == null) {
                        obj = "unknown";
                    }
                    connectTimeoutException = new ConnectTimeoutException(P0.emerald(sb2, obj, " ms]"), e);
                    e = connectTimeoutException;
                } else {
                    e = hd.ar.alpha(request, e);
                }
            }
            c3207k.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(e)));
        }
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        Intrinsics.echo(call, "call");
        Intrinsics.echo(response, "response");
        if (!call.getCanceled()) {
            ((C3207k) this.red).resumeWith(Result.m206constructorimpl(response));
        }
    }

    public a(U8.a aVar) {
        this.alpha = 2;
        ff.l lVar = new ff.l("Type parameter upper bound erasure results");
        this.purple = LazyKt.lazy(new je.ab(8, this));
        this.red = lVar.charlie(new C0769g(11, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Function1 compute) {
        this.alpha = 1;
        Intrinsics.echo(compute, "compute");
        this.purple = (Lambda) compute;
        this.red = new ConcurrentHashMap();
    }

    public a(int i4) {
        this.alpha = i4;
        switch (i4) {
            case 9:
                this.purple = new J.e(new Reference[16]);
                this.red = new ReferenceQueue();
                return;
            default:
                return;
        }
    }

    public a(al alVar, ap apVar) {
        this.alpha = 7;
        this.purple = alVar;
        this.red = C0564b.zulu(apVar);
    }

    public a(C2227d requestData, C3207k c3207k) {
        this.alpha = 0;
        Intrinsics.echo(requestData, "requestData");
        this.purple = requestData;
        this.red = c3207k;
    }

    public a(Context context, String str) {
        this.alpha = 11;
        this.red = str;
        this.purple = context.getApplicationContext().getSharedPreferences("UserInfo_secure", 0);
    }
}
