package ca;

import X9.q;
import android.util.Log;
import ao.ad;
import com.checkout.components.card.operations.network.utils.OkHttpConstants;
import com.clevertap.android.sdk.Constants;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.ab;
import kotlin.collections.t;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import pe.AbstractC2327c;
import t6.af;
import td.C3117a;
import v3.InterfaceC3171a;
import vf.Y;

/* loaded from: classes2.dex */
public final class h extends WebSocketListener {
    public final /* synthetic */ n alpha;
    public final /* synthetic */ String bravo;
    public final /* synthetic */ String charlie;

    public h(n nVar, String str, String str2) {
        this.alpha = nVar;
        this.bravo = str;
        this.charlie = str2;
    }

    @Override // okhttp3.WebSocketListener
    public final void onClosed(WebSocket ws, int i4, String reason) {
        Intrinsics.echo(ws, "ws");
        Intrinsics.echo(reason, "reason");
        if (!Intrinsics.areEqual(ws, this.alpha.papa)) {
            return;
        }
        if (i4 == 1000 && StringsKt.gray(reason)) {
            reason = "lifecycle_closed";
        }
        n nVar = this.alpha;
        if (StringsKt.gray(reason)) {
            reason = ad.zulu(i4, "code=");
        }
        nVar.delta("CLOSED", reason, null);
    }

    @Override // okhttp3.WebSocketListener
    public final void onFailure(WebSocket ws, Throwable t5, Response response) {
        Integer num;
        String str;
        Intrinsics.echo(ws, "ws");
        Intrinsics.echo(t5, "t");
        if (!Intrinsics.areEqual(ws, this.alpha.papa)) {
            return;
        }
        if (response != null) {
            num = Integer.valueOf(response.code());
        } else {
            num = null;
        }
        String simpleName = t5.getClass().getSimpleName();
        String message = t5.getMessage();
        if (num == null || (str = ad.zulu(num.intValue(), " http=")) == null) {
            str = "";
        }
        String xray = AbstractC2327c.xray(simpleName, ": ", message, str);
        if ((num == null || num.intValue() != 401) && ((num == null || num.intValue() != 403) && !n.foxtrot(xray, t5.getClass().getName()))) {
            this.alpha.delta("ERROR", xray, t5);
            return;
        }
        n.golf(this.alpha, "AUTH_ERROR", y.romeo(new Pair("session_invalidated", "true")), null, null, null, null, null, 124);
        this.alpha.alpha();
        this.alpha.hotel.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // okhttp3.WebSocketListener
    public final void onMessage(WebSocket ws, String text) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        int i4;
        List<f> juliet;
        Object eVar;
        String obj;
        String str;
        String str2;
        boolean z2;
        int i5;
        Pair pair;
        String str3;
        boolean z10;
        String obj2;
        Long uniform;
        String obj3;
        Long uniform2;
        ?? r62 = 0;
        Intrinsics.echo(ws, "ws");
        Intrinsics.echo(text, "text");
        if (Intrinsics.areEqual(ws, this.alpha.papa)) {
            this.alpha.beige.set(System.currentTimeMillis());
            boolean gray = StringsKt.gray(text);
            C0835c c0835c = C0835c.alpha;
            int i10 = 6;
            if (gray) {
                juliet = ab.juliet(c0835c);
                i4 = 2;
            } else {
                List navy = StringsKt.navy(r.oscar(text, "\r\n", "\n"), new char[]{(char) 0});
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(navy, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                Iterator it = navy.iterator();
                while (it.hasNext()) {
                    arrayList.add(StringsKt.f((String) it.next(), '\n'));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (!StringsKt.gray((String) next)) {
                        arrayList2.add(next);
                    }
                }
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
                ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String str4 = (String) it3.next();
                    List maroon = StringsKt.maroon(str4, new String[]{"\n"}, 6);
                    String str5 = (String) CollectionsKt.green(maroon);
                    if (str5 != null && (obj = StringsKt.b(str5).toString()) != null) {
                        int hashCode = obj.hashCode();
                        if (hashCode == -2087582999) {
                            if (obj.equals("CONNECTED")) {
                                LinkedHashMap bravo = Y8.d.bravo(maroon);
                                eVar = new C0833a((String) bravo.get("version"), (String) bravo.get("heart-beat"));
                            }
                            eVar = new e(str4);
                        } else if (hashCode == 66247144) {
                            if (obj.equals("ERROR")) {
                                LinkedHashMap bravo2 = Y8.d.bravo(maroon);
                                int fuchsia = StringsKt.fuchsia(str4, "\n\n", 0, false, 6);
                                if (fuchsia >= 0) {
                                    str = str4.substring(fuchsia + 2);
                                    Intrinsics.delta(str, "substring(...)");
                                } else {
                                    str = null;
                                }
                                eVar = new C0834b((String) bravo2.get(Constants.KEY_MESSAGE), str);
                            }
                            eVar = new e(str4);
                        } else {
                            if (hashCode == 1672907751 && obj.equals("MESSAGE")) {
                                LinkedHashMap bravo3 = Y8.d.bravo(maroon);
                                int fuchsia2 = StringsKt.fuchsia(str4, "\n\n", 0, false, 6);
                                if (fuchsia2 >= 0) {
                                    str2 = str4.substring(fuchsia2 + 2);
                                    Intrinsics.delta(str2, "substring(...)");
                                } else {
                                    str2 = null;
                                }
                                eVar = new d((String) bravo3.get("destination"), (String) bravo3.get("subscription"), str2);
                            }
                            eVar = new e(str4);
                        }
                    } else {
                        eVar = new e(str4);
                    }
                    arrayList3.add(eVar);
                }
                i4 = 2;
                juliet = arrayList3.isEmpty() ? ab.juliet(c0835c) : arrayList3;
            }
            for (f fVar : juliet) {
                if (fVar instanceof C0833a) {
                    n nVar = this.alpha;
                    String str6 = ((C0833a) fVar).bravo;
                    if (nVar.romeo.compareAndSet(true, r62)) {
                        nVar.quebec.set(true);
                        Y y10 = nVar.blue;
                        if (y10 != null) {
                            y10.foxtrot(null);
                        }
                        nVar.blue = null;
                        long currentTimeMillis = System.currentTimeMillis();
                        nVar.tango = Long.valueOf(currentTimeMillis);
                        nVar.beige.set(currentTimeMillis);
                        InterfaceC3171a interfaceC3171a = nVar.charlie;
                        if (interfaceC3171a != null) {
                            interfaceC3171a.oscar();
                        }
                        InterfaceC3171a interfaceC3171a2 = nVar.charlie;
                        if (interfaceC3171a2 != null) {
                            interfaceC3171a2.lima(currentTimeMillis);
                        }
                        InterfaceC3171a interfaceC3171a3 = nVar.charlie;
                        Long juliet2 = interfaceC3171a3 != null ? interfaceC3171a3.juliet() : null;
                        if (juliet2 != null && juliet2.longValue() > OkHttpConstants.READ_TIMEOUT_MS) {
                            nVar.uniform = r62;
                        }
                        if (str6 != null && !StringsKt.gray(str6)) {
                            List maroon2 = StringsKt.maroon(str6, new String[]{Constants.SEPARATOR_COMMA}, i10);
                            String str7 = (String) CollectionsKt.jade(r62, maroon2);
                            long longValue = (str7 == null || (obj3 = StringsKt.b(str7).toString()) == null || (uniform2 = r.uniform(obj3)) == null) ? 0L : uniform2.longValue();
                            String str8 = (String) CollectionsKt.jade(1, maroon2);
                            pair = new Pair(Long.valueOf(longValue), Long.valueOf((str8 == null || (obj2 = StringsKt.b(str8).toString()) == null || (uniform = r.uniform(obj2)) == null) ? 0L : uniform.longValue()));
                        } else {
                            pair = new Pair(0L, 0L);
                        }
                        long longValue2 = ((Number) pair.first).longValue();
                        long longValue3 = ((Number) pair.second).longValue();
                        z2 = r62;
                        nVar.yankee = (nVar.whiskey <= 0 || longValue3 <= 0) ? 0L : Math.max(nVar.whiskey, longValue3);
                        nVar.zulu = (nVar.whiskey <= 0 || longValue2 <= 0) ? 0L : Math.max(nVar.whiskey, longValue2);
                        InterfaceC3171a interfaceC3171a4 = nVar.charlie;
                        Pair pair2 = new Pair("attempt", String.valueOf(interfaceC3171a4 != null ? Integer.valueOf(interfaceC3171a4.charlie()) : null));
                        Pair pair3 = new Pair("clientHbMs", String.valueOf(nVar.yankee));
                        Pair pair4 = new Pair("serverHbMs", String.valueOf(nVar.zulu));
                        Pair[] pairArr = new Pair[3];
                        pairArr[z2 ? 1 : 0] = pair2;
                        pairArr[1] = pair3;
                        pairArr[i4] = pair4;
                        n.golf(nVar, "OPENED", y.sierra(pairArr), Long.valueOf(currentTimeMillis - nVar.victor), null, null, null, null, 120);
                        Y y11 = nVar.black;
                        if (y11 != null) {
                            y11.foxtrot(null);
                        }
                        nVar.black = null;
                        Y y12 = nVar.amber;
                        if (y12 != null) {
                            y12.foxtrot(null);
                        }
                        long j5 = nVar.yankee;
                        if (j5 > 0) {
                            nVar.amber = vf.ad.zulu(nVar.lima, null, null, new l(j5, null, nVar), 3);
                        }
                        Y y13 = nVar.azure;
                        if (y13 != null) {
                            y13.foxtrot(null);
                        }
                        long j6 = nVar.zulu;
                        if (j6 <= 0) {
                            str3 = null;
                        } else {
                            C3117a c3117a = nVar.lima;
                            m mVar = new m(nVar, j6, j6 * 3, null);
                            str3 = null;
                            nVar.azure = vf.ad.zulu(c3117a, null, null, mVar, 3);
                        }
                        nVar.november = str3;
                        if (!nVar.mike) {
                            Log.i("SocketConnection", "[V2] RECEIPT_PROBE disabled — no delivery confirmation in logs");
                        } else {
                            String str9 = (String) nVar.india.invoke();
                            if (str9 == null || StringsKt.gray(str9)) {
                                str9 = null;
                            }
                            if (str9 == null) {
                                Log.w("SocketConnection", "[V2] RECEIPT_SUBSCRIBE skipped — receipt topic unavailable");
                            } else {
                                WebSocket webSocket = nVar.papa;
                                if (webSocket != null) {
                                    z10 = webSocket.send("SUBSCRIBE\nid:loc-receipt\ndestination:" + str9 + "\n\n\u0000\n");
                                } else {
                                    z10 = z2 ? 1 : 0;
                                }
                                if (z10) {
                                    nVar.november = str9;
                                    n.golf(nVar, "RECEIPT_SUBSCRIBE", y.romeo(new Pair("topic", str9)), null, null, null, null, null, 124);
                                } else {
                                    Log.w("SocketConnection", "[V2] RECEIPT_SUBSCRIBE send failed");
                                }
                            }
                        }
                        try {
                            nVar.golf.invoke();
                        } catch (Exception e) {
                            Log.e("SocketConnection", "[V2] onSocketConnect() threw: " + e.getMessage(), e);
                            if (nVar.delta != null) {
                                Y9.d.alpha("[V2] onSocketConnect error: " + e.getClass().getSimpleName() + " " + e.getMessage());
                            }
                        }
                    } else {
                        z2 = r62;
                    }
                } else {
                    z2 = r62;
                    if (fVar instanceof C0834b) {
                        n nVar2 = this.alpha;
                        C0834b c0834b = (C0834b) fVar;
                        String str10 = c0834b.alpha;
                        String str11 = c0834b.bravo;
                        if (str10 == null) {
                            str10 = str11 == null ? "unknown" : str11;
                        }
                        AtomicLong atomicLong = q.alpha;
                        if (StringsKt.beige(str10, "INTEGRITY_TIMESTAMP_", z2)) {
                            nVar2.india(str10);
                            n.golf(nVar2, "INTEGRITY_TIMESTAMP_ERROR", y.romeo(new Pair("no_retry", "true")), null, null, null, null, null, 124);
                            q.alpha(str10);
                            nVar2.alpha();
                            nVar2.sierra = false;
                            i5 = i4;
                            z2 = false;
                        } else if (n.foxtrot(str10, null)) {
                            nVar2.india(str10);
                            Pair pair5 = new Pair("session_invalidated", "true");
                            Pair pair6 = new Pair(Constants.KEY_MESSAGE, StringsKt.yellow(100, str10));
                            i5 = i4;
                            Pair[] pairArr2 = new Pair[i5];
                            z2 = false;
                            pairArr2[0] = pair5;
                            pairArr2[1] = pair6;
                            n.golf(nVar2, "AUTH_ERROR", y.sierra(pairArr2), null, null, null, null, null, 124);
                            nVar2.alpha();
                            nVar2.hotel.invoke();
                        } else {
                            i5 = i4;
                            z2 = false;
                            nVar2.delta("ERROR", str10, null);
                        }
                    } else {
                        i5 = i4;
                        if (fVar instanceof d) {
                            n nVar3 = this.alpha;
                            String str12 = ((d) fVar).alpha;
                            if (str12 != null && Intrinsics.areEqual(str12, nVar3.november)) {
                                Log.i("SocketConnection", "[V2] DELIVERY_RECEIPT topic=".concat(str12));
                                nVar3.juliet.invoke();
                            }
                        } else if (!(fVar instanceof C0835c)) {
                            if (fVar instanceof e) {
                                Log.d("SocketConnection", "[V2] Unknown STOMP frame: ".concat(StringsKt.yellow(100, ((e) fVar).alpha)));
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    }
                    i4 = i5;
                }
                r62 = z2;
                i10 = 6;
            }
        }
    }

    @Override // okhttp3.WebSocketListener
    public final void onOpen(WebSocket ws, Response response) {
        String token;
        Object m206constructorimpl;
        Object m206constructorimpl2;
        Object obj;
        Intrinsics.echo(ws, "ws");
        Intrinsics.echo(response, "response");
        g3.ad adVar = this.alpha.foxtrot;
        if (adVar == null || (token = adVar.alpha()) == null) {
            token = this.bravo;
        }
        long j5 = this.alpha.whiskey;
        n nVar = this.alpha;
        String str = this.charlie;
        Object obj2 = "/samurai";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Result.Companion companion = Result.INSTANCE;
            AtomicReference atomicReference = X9.o.alpha;
            m206constructorimpl = Result.m206constructorimpl(X9.o.alpha(nVar.kilo));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
        Y9.d dVar = nVar.delta;
        if (m207exceptionOrNullimpl != null && dVar != null) {
            Y9.d.alpha("security: stomp_v2_integrity_headers_failed err=".concat(m207exceptionOrNullimpl.getClass().getSimpleName()));
        }
        t tVar = t.alpha;
        if (m206constructorimpl instanceof kotlin.k) {
            m206constructorimpl = tVar;
        }
        Map map = (Map) m206constructorimpl;
        linkedHashMap.putAll(map);
        String str2 = (String) map.get("X-Integrity-Timestamp");
        try {
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            m206constructorimpl2 = Result.m206constructorimpl(ResultKt.createFailure(th2));
        }
        if (str2 != null) {
            try {
                String path = new URI(str).getPath();
                if (path == null) {
                    path = "/samurai";
                }
                obj = Result.m206constructorimpl(path);
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.INSTANCE;
                obj = Result.m206constructorimpl(ResultKt.createFailure(th3));
            }
            if (!(obj instanceof kotlin.k)) {
                obj2 = obj;
            }
            String str3 = (String) obj2;
            byte[] alpha = X9.h.alpha();
            if (alpha != null) {
                linkedHashMap.put("X-Integrity-Signature", af.alpha("CONNECT", str3, str2, new byte[0], alpha));
            }
            m206constructorimpl2 = Result.m206constructorimpl(Unit.INSTANCE);
            Throwable m207exceptionOrNullimpl2 = Result.m207exceptionOrNullimpl(m206constructorimpl2);
            if (m207exceptionOrNullimpl2 != null && dVar != null) {
                Y9.d.alpha("security: stomp_v2_hmac_sign_failed err=".concat(m207exceptionOrNullimpl2.getClass().getSimpleName()));
            }
        }
        Intrinsics.echo(token, "token");
        StringBuilder sb2 = new StringBuilder("CONNECT\naccept-version:1.1,1.2\n");
        StringBuilder uniform = Q0.c.uniform("heart-beat:", j5, Constants.SEPARATOR_COMMA);
        uniform.append(j5);
        uniform.append("\n");
        sb2.append(uniform.toString());
        sb2.append("X-Authorization:Bearer " + token + "\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str4 = (String) entry.getKey();
            String str5 = (String) entry.getValue();
            sb2.append(str4);
            sb2.append(':');
            sb2.append(str5);
            sb2.append('\n');
        }
        sb2.append("\n\u0000\n");
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        ws.send(sb3);
    }

    @Override // okhttp3.WebSocketListener
    public final void onMessage(WebSocket ws, Tf.n bytes) {
        Intrinsics.echo(ws, "ws");
        Intrinsics.echo(bytes, "bytes");
        if (Intrinsics.areEqual(ws, this.alpha.papa)) {
            this.alpha.beige.set(System.currentTimeMillis());
            Log.w("SocketConnection", "[V2] Unexpected binary message (" + bytes.delta() + " bytes)");
            if (this.alpha.delta != null) {
                Y9.d.alpha("[V2] Binary WebSocket message received (" + bytes.delta() + " bytes)");
            }
        }
    }
}
