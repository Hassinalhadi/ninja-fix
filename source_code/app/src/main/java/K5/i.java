package K5;

import A2.ao;
import B9.C0058p;
import D5.aa;
import D5.ah;
import D5.ai;
import D5.ak;
import D5.m;
import D5.n;
import D5.p;
import D5.q;
import D5.r;
import D5.s;
import D5.t;
import D5.u;
import D5.w;
import E5.o;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.appcompat.widget.P0;
import com.google.android.gms.internal.measurement.C1298c;
import id.C1915c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import s6.D5;

/* loaded from: classes3.dex */
public final class i {
    public final Context alpha;
    public final F5.f bravo;
    public final L5.d charlie;
    public final d delta;
    public final Executor echo;
    public final M5.b foxtrot;
    public final N5.a golf;
    public final N5.a hotel;
    public final L5.c india;

    public i(Context context, F5.f fVar, L5.d dVar, d dVar2, Executor executor, M5.b bVar, N5.a aVar, N5.a aVar2, L5.c cVar) {
        this.alpha = context;
        this.bravo = fVar;
        this.charlie = dVar;
        this.delta = dVar2;
        this.echo = executor;
        this.foxtrot = bVar;
        this.golf = aVar;
        this.hotel = aVar2;
        this.india = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x042a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v22, types: [D5.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18, types: [D5.s, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void alpha(E5.i iVar, int i4) {
        int i5;
        F5.h hVar;
        F5.a aVar;
        int i10;
        int i11;
        String str;
        C5.b bravo;
        F5.a aVar2;
        String str2;
        Integer num;
        Iterator it;
        s sVar;
        long longValue;
        String str3;
        int i12;
        int i13;
        final i iVar2 = this;
        final E5.i iVar3 = iVar;
        final int i14 = 0;
        int i15 = 10;
        final int i16 = 1;
        F5.h alpha = iVar2.bravo.alpha(iVar3.alpha);
        long j5 = 0;
        while (true) {
            M5.a aVar3 = new M5.a(iVar2) { // from class: K5.h
                public final /* synthetic */ i purple;

                {
                    this.purple = iVar2;
                }

                @Override // M5.a
                public final Object execute() {
                    Boolean bool;
                    switch (i14) {
                        case 0:
                            E5.i iVar4 = iVar3;
                            L5.h hVar2 = (L5.h) this.purple.charlie;
                            SQLiteDatabase charlie = hVar2.charlie();
                            charlie.beginTransaction();
                            try {
                                Long echo = L5.h.echo(charlie, iVar4);
                                if (echo == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = hVar2.charlie().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{echo.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                charlie.setTransactionSuccessful();
                                return bool;
                            } finally {
                                charlie.endTransaction();
                            }
                        default:
                            L5.h hVar3 = (L5.h) this.purple.charlie;
                            hVar3.getClass();
                            return (Iterable) hVar3.foxtrot(new ao(10, hVar3, iVar3));
                    }
                }
            };
            L5.h hVar2 = (L5.h) iVar2.foxtrot;
            if (((Boolean) hVar2.papa(aVar3)).booleanValue()) {
                Iterable iterable = (Iterable) hVar2.papa(new M5.a(iVar2) { // from class: K5.h
                    public final /* synthetic */ i purple;

                    {
                        this.purple = iVar2;
                    }

                    @Override // M5.a
                    public final Object execute() {
                        Boolean bool;
                        switch (i16) {
                            case 0:
                                E5.i iVar4 = iVar3;
                                L5.h hVar22 = (L5.h) this.purple.charlie;
                                SQLiteDatabase charlie = hVar22.charlie();
                                charlie.beginTransaction();
                                try {
                                    Long echo = L5.h.echo(charlie, iVar4);
                                    if (echo == null) {
                                        bool = Boolean.FALSE;
                                    } else {
                                        Cursor rawQuery = hVar22.charlie().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{echo.toString()});
                                        try {
                                            Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                            rawQuery.close();
                                            bool = valueOf;
                                        } catch (Throwable th) {
                                            rawQuery.close();
                                            throw th;
                                        }
                                    }
                                    charlie.setTransactionSuccessful();
                                    return bool;
                                } finally {
                                    charlie.endTransaction();
                                }
                            default:
                                L5.h hVar3 = (L5.h) this.purple.charlie;
                                hVar3.getClass();
                                return (Iterable) hVar3.foxtrot(new ao(10, hVar3, iVar3));
                        }
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return;
                }
                byte[] bArr = iVar3.bravo;
                if (alpha == null) {
                    D5.foxtrot("Uploader", "Unknown backend for %s, deleting event batch for it...", iVar3);
                    aVar = new F5.a(3, -1L);
                    i11 = i15;
                    hVar = alpha;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((L5.b) it2.next()).charlie);
                    }
                    if (bArr != null) {
                        i5 = 1;
                    } else {
                        i5 = i14;
                    }
                    if (i5 != 0) {
                        L5.c cVar = iVar2.india;
                        Objects.requireNonNull(cVar);
                        H5.a aVar4 = (H5.a) hVar2.papa(new B2.s(i15, cVar));
                        C0058p c0058p = new C0058p();
                        c0058p.delta = new HashMap();
                        c0058p.foxtrot = Long.valueOf(iVar2.golf.getTime());
                        c0058p.golf = Long.valueOf(iVar2.hotel.getTime());
                        c0058p.bravo = "GDT_CLIENT_METRICS";
                        B5.c cVar2 = new B5.c("proto");
                        aVar4.getClass();
                        C1298c c1298c = o.alpha;
                        c1298c.getClass();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            c1298c.quebec(aVar4, byteArrayOutputStream);
                        } catch (IOException unused) {
                        }
                        c0058p.echo = new E5.l(cVar2, byteArrayOutputStream.toByteArray());
                        arrayList.add(((C5.c) alpha).alpha(c0058p.charlie()));
                    }
                    C5.c cVar3 = (C5.c) alpha;
                    HashMap hashMap = new HashMap();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        E5.h hVar3 = (E5.h) it3.next();
                        String str4 = hVar3.alpha;
                        if (!hashMap.containsKey(str4)) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(hVar3);
                            hashMap.put(str4, arrayList2);
                        } else {
                            ((List) hashMap.get(str4)).add(hVar3);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it4 = hashMap.entrySet().iterator();
                    while (it4.hasNext()) {
                        Map.Entry entry = (Map.Entry) it4.next();
                        E5.h hVar4 = (E5.h) ((List) entry.getValue()).get(0);
                        ak akVar = ak.alpha;
                        long time = cVar3.foxtrot.getTime();
                        long time2 = cVar3.echo.getTime();
                        n nVar = new n(new D5.l(Integer.valueOf(hVar4.bravo("sdk-version")), hVar4.alpha("model"), hVar4.alpha("hardware"), hVar4.alpha("device"), hVar4.alpha("product"), hVar4.alpha("os-uild"), hVar4.alpha("manufacturer"), hVar4.alpha("fingerprint"), hVar4.alpha("locale"), hVar4.alpha("country"), hVar4.alpha("mcc_mnc"), hVar4.alpha("application_build")));
                        try {
                            num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                            str2 = null;
                        } catch (NumberFormatException unused2) {
                            str2 = (String) entry.getKey();
                            num = null;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it5 = ((List) entry.getValue()).iterator();
                        while (it5.hasNext()) {
                            E5.h hVar5 = (E5.h) it5.next();
                            Iterator it6 = it4;
                            E5.l lVar = hVar5.charlie;
                            B5.c cVar4 = lVar.alpha;
                            F5.h hVar6 = alpha;
                            boolean equals = cVar4.equals(new B5.c("proto"));
                            byte[] bArr2 = lVar.bravo;
                            if (equals) {
                                ?? obj = new Object();
                                obj.foxtrot = bArr2;
                                it = it5;
                                sVar = obj;
                            } else {
                                it = it5;
                                if (cVar4.equals(new B5.c("json"))) {
                                    String str5 = new String(bArr2, Charset.forName("UTF-8"));
                                    ?? obj2 = new Object();
                                    obj2.golf = str5;
                                    sVar = obj2;
                                } else {
                                    String india = D5.india("CctTransportBackend");
                                    if (Log.isLoggable(india, 5)) {
                                        Log.w(india, "Received event of unsupported encoding " + cVar4 + ". Skipping...");
                                    }
                                    it5 = it;
                                    it4 = it6;
                                    alpha = hVar6;
                                }
                            }
                            sVar.alpha = Long.valueOf(hVar5.delta);
                            sVar.bravo = Long.valueOf(hVar5.echo);
                            String str6 = (String) hVar5.foxtrot.get("tz-offset");
                            if (str6 == null) {
                                longValue = 0;
                            } else {
                                longValue = Long.valueOf(str6).longValue();
                            }
                            sVar.charlie = Long.valueOf(longValue);
                            sVar.hotel = new w((ai) ai.alpha.get(hVar5.bravo("net-type")), (ah) ah.alpha.get(hVar5.bravo("mobile-subtype")));
                            Integer num2 = hVar5.bravo;
                            if (num2 != null) {
                                sVar.delta = num2;
                            }
                            Integer num3 = hVar5.golf;
                            if (num3 != null) {
                                r rVar = new r(new q(num3));
                                aa aaVar = aa.alpha;
                                sVar.echo = new D5.o(rVar);
                            }
                            byte[] bArr3 = hVar5.juliet;
                            byte[] bArr4 = hVar5.india;
                            if (bArr4 != null || bArr3 != null) {
                                if (bArr4 == null) {
                                    bArr4 = null;
                                }
                                if (bArr3 == null) {
                                    bArr3 = null;
                                }
                                sVar.india = new p(bArr4, bArr3);
                            }
                            if (((Long) sVar.alpha) == null) {
                                str3 = " eventTimeMs";
                            } else {
                                str3 = "";
                            }
                            if (((Long) sVar.bravo) == null) {
                                str3 = str3.concat(" eventUptimeMs");
                            }
                            if (((Long) sVar.charlie) == null) {
                                str3 = P0.crimson(str3, " timezoneOffsetSeconds");
                            }
                            if (str3.isEmpty()) {
                                arrayList4.add(new t(((Long) sVar.alpha).longValue(), (Integer) sVar.delta, (D5.o) sVar.echo, ((Long) sVar.bravo).longValue(), (byte[]) sVar.foxtrot, (String) sVar.golf, ((Long) sVar.charlie).longValue(), (w) sVar.hotel, (p) sVar.india));
                                it5 = it;
                                it4 = it6;
                                alpha = hVar6;
                            } else {
                                throw new IllegalStateException("Missing required properties:".concat(str3));
                            }
                        }
                        arrayList3.add(new u(time, time2, nVar, num, str2, arrayList4));
                        it4 = it4;
                        alpha = alpha;
                    }
                    hVar = alpha;
                    m mVar = new m(arrayList3);
                    URL url = cVar3.delta;
                    if (bArr != null) {
                        try {
                            C5.a alpha2 = C5.a.alpha(bArr);
                            str = alpha2.bravo;
                            if (str == null) {
                                str = null;
                            }
                            String str7 = alpha2.alpha;
                            if (str7 != null) {
                                url = C5.c.bravo(str7);
                            }
                        } catch (IllegalArgumentException unused3) {
                            aVar = new F5.a(3, -1L);
                            i10 = 2;
                            i11 = 10;
                        }
                    } else {
                        str = null;
                    }
                    try {
                        i11 = 10;
                        try {
                            C1915c c1915c = new C1915c(url, mVar, str, i11);
                            B2.s sVar2 = new B2.s(1, cVar3);
                            int i17 = 5;
                            do {
                                bravo = sVar2.bravo(c1915c);
                                URL url2 = (URL) bravo.charlie;
                                if (url2 != null) {
                                    D5.foxtrot("CctTransportBackend", "Following redirect to: %s", url2);
                                    i11 = 10;
                                    c1915c = new C1915c(url2, (m) c1915c.red, (String) c1915c.silver, i11);
                                } else {
                                    i11 = 10;
                                    c1915c = null;
                                }
                                if (c1915c == null) {
                                    break;
                                } else {
                                    i17--;
                                }
                            } while (i17 >= 1);
                            int i18 = bravo.alpha;
                            if (i18 == 200) {
                                aVar = new F5.a(1, bravo.bravo);
                            } else {
                                if (i18 < 500 && i18 != 404) {
                                    if (i18 == 400) {
                                        try {
                                            aVar2 = new F5.a(4, -1L);
                                        } catch (IOException e) {
                                            e = e;
                                            D5.golf("CctTransportBackend", "Could not make request to the backend", e);
                                            i10 = 2;
                                            aVar = new F5.a(2, -1L);
                                            i12 = aVar.alpha;
                                            if (i12 != i10) {
                                            }
                                        }
                                    } else {
                                        aVar2 = new F5.a(3, -1L);
                                    }
                                } else {
                                    aVar2 = new F5.a(2, -1L);
                                }
                                aVar = aVar2;
                            }
                        } catch (IOException e4) {
                            e = e4;
                        }
                    } catch (IOException e5) {
                        e = e5;
                        i11 = 10;
                    }
                }
                i10 = 2;
                i12 = aVar.alpha;
                if (i12 != i10) {
                    hVar2.papa(new J7.c(this, iterable, iVar, j5));
                    this.delta.alpha(iVar, i4 + 1, true);
                    return;
                }
                iVar2 = this;
                iVar3 = iVar;
                long j6 = j5;
                hVar2.papa(new ao(8, iVar2, iterable));
                if (i12 == 1) {
                    j5 = Math.max(j6, aVar.bravo);
                    if (bArr != null) {
                        hVar2.papa(new B2.s(12, iVar2));
                    }
                    i13 = 1;
                } else {
                    if (i12 == 4) {
                        HashMap hashMap2 = new HashMap();
                        Iterator it7 = iterable.iterator();
                        while (it7.hasNext()) {
                            String str8 = ((L5.b) it7.next()).charlie.alpha;
                            if (!hashMap2.containsKey(str8)) {
                                hashMap2.put(str8, 1);
                            } else {
                                hashMap2.put(str8, Integer.valueOf(((Integer) hashMap2.get(str8)).intValue() + 1));
                            }
                        }
                        i13 = 1;
                        hVar2.papa(new ao(9, iVar2, hashMap2));
                    } else {
                        i13 = 1;
                    }
                    j5 = j6;
                }
                i15 = i11;
                i16 = i13;
                alpha = hVar;
                i14 = 0;
            } else {
                hVar2.papa(new F8.h(iVar2, iVar3, j5));
                return;
            }
        }
    }
}
