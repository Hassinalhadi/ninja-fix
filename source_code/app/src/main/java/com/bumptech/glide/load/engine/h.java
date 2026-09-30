package com.bumptech.glide.load.engine;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import ao.ad;
import b8.InterfaceC0733c;
import c8.InterfaceC0830a;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.internal.C1450j;
import com.google.android.gms.measurement.internal.C1459n0;
import com.google.android.gms.measurement.internal.EnumC1470t0;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.H0;
import com.google.android.gms.measurement.internal.InterfaceC1463p0;
import com.google.android.gms.measurement.internal.Z0;
import com.google.android.gms.measurement.internal.a1;
import com.google.android.gms.measurement.internal.ac;
import com.google.android.gms.measurement.internal.ar;
import com.google.android.gms.measurement.internal.as;
import com.google.android.gms.measurement.internal.au;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzpa;
import fe.C1715g;
import g.C1718a;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2333i;
import pf.AbstractC2360j;
import s0.EnumC2564y;
import s0.al;
import s0.f0;
import s1.C2576i;
import s6.H4;
import t6.C2983e;

/* loaded from: classes3.dex */
public final class h implements com.bumptech.glide.load.resource.bitmap.v, InterfaceC1463p0, as, InterfaceC0830a {
    public final /* synthetic */ int alpha;
    public Object purple;
    public Object red;
    public Object silver;

    public /* synthetic */ h(int i4, boolean z2) {
        this.alpha = i4;
    }

    private final void mike() {
    }

    private final void november() {
    }

    @Override // c8.InterfaceC0830a
    public /* bridge */ /* synthetic */ InterfaceC0830a alpha(Class cls, InterfaceC0733c interfaceC0733c) {
        ((HashMap) this.purple).put(cls, interfaceC0733c);
        ((HashMap) this.red).remove(cls);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    @Override // com.google.android.gms.measurement.internal.InterfaceC1463p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bravo(int i4, IOException iOException, byte[] bArr) {
        EnumC1470t0 enumC1470t0;
        AtomicReference atomicReference;
        C1459n0 c1459n0 = (C1459n0) this.purple;
        c1459n0.W();
        zzpa zzpaVar = (zzpa) this.silver;
        if (i4 != 200 && i4 != 204) {
            if (i4 == 304) {
                i4 = 304;
            }
            ar arVar = ((G) c1459n0.alpha).f7507b;
            G.foxtrot(arVar);
            arVar.f7632b.delta("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzpaVar.alpha), Integer.valueOf(i4), iOException);
            if (!Arrays.asList(((String) ac.uniform.alpha(null)).split(Constants.SEPARATOR_COMMA)).contains(String.valueOf(i4))) {
                enumC1470t0 = EnumC1470t0.BACKOFF;
            } else {
                enumC1470t0 = EnumC1470t0.FAILURE;
            }
            atomicReference = (AtomicReference) this.red;
            H0 mike = ((G) c1459n0.alpha).mike();
            long j5 = zzpaVar.alpha;
            zzag zzagVar = new zzag(enumC1470t0.alpha, j5, zzpaVar.white);
            mike.W();
            mike.X();
            mike.n0(new D2.d(mike, mike.k0(true), zzagVar, 9));
            ar arVar2 = ((G) c1459n0.alpha).f7507b;
            G.foxtrot(arVar2);
            arVar2.f7636g.charlie(Long.valueOf(j5), enumC1470t0, "[sgtm] Updated status for row_id");
            synchronized (atomicReference) {
                atomicReference.set(enumC1470t0);
                atomicReference.notifyAll();
            }
            return;
        }
        if (iOException == null) {
            ar arVar3 = ((G) c1459n0.alpha).f7507b;
            G.foxtrot(arVar3);
            arVar3.f7636g.bravo(Long.valueOf(zzpaVar.alpha), "[sgtm] Upload succeeded for row_id");
            enumC1470t0 = EnumC1470t0.SUCCESS;
            atomicReference = (AtomicReference) this.red;
            H0 mike2 = ((G) c1459n0.alpha).mike();
            long j52 = zzpaVar.alpha;
            zzag zzagVar2 = new zzag(enumC1470t0.alpha, j52, zzpaVar.white);
            mike2.W();
            mike2.X();
            mike2.n0(new D2.d(mike2, mike2.k0(true), zzagVar2, 9));
            ar arVar22 = ((G) c1459n0.alpha).f7507b;
            G.foxtrot(arVar22);
            arVar22.f7636g.charlie(Long.valueOf(j52), enumC1470t0, "[sgtm] Updated status for row_id");
            synchronized (atomicReference) {
            }
        }
        ar arVar4 = ((G) c1459n0.alpha).f7507b;
        G.foxtrot(arVar4);
        arVar4.f7632b.delta("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzpaVar.alpha), Integer.valueOf(i4), iOException);
        if (!Arrays.asList(((String) ac.uniform.alpha(null)).split(Constants.SEPARATOR_COMMA)).contains(String.valueOf(i4))) {
        }
        atomicReference = (AtomicReference) this.red;
        H0 mike22 = ((G) c1459n0.alpha).mike();
        long j522 = zzpaVar.alpha;
        zzag zzagVar22 = new zzag(enumC1470t0.alpha, j522, zzpaVar.white);
        mike22.W();
        mike22.X();
        mike22.n0(new D2.d(mike22, mike22.k0(true), zzagVar22, 9));
        ar arVar222 = ((G) c1459n0.alpha).f7507b;
        G.foxtrot(arVar222);
        arVar222.f7636g.charlie(Long.valueOf(j522), enumC1470t0, "[sgtm] Updated status for row_id");
        synchronized (atomicReference) {
        }
    }

    @Override // com.bumptech.glide.load.resource.bitmap.v
    public int charlie() {
        switch (this.alpha) {
            case 1:
                ByteBuffer charlie = Y3.b.charlie((ByteBuffer) this.purple);
                G3.g gVar = (G3.g) this.silver;
                if (charlie == null) {
                    return -1;
                }
                ArrayList arrayList = (ArrayList) this.red;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    try {
                        int bravo = ((E3.e) arrayList.get(i4)).bravo(charlie, gVar);
                        if (bravo != -1) {
                            return bravo;
                        }
                    } finally {
                    }
                }
                return -1;
            default:
                com.bumptech.glide.load.data.h hVar = (com.bumptech.glide.load.data.h) this.silver;
                G3.g gVar2 = (G3.g) this.purple;
                ArrayList arrayList2 = (ArrayList) this.red;
                int size2 = arrayList2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    E3.e eVar = (E3.e) arrayList2.get(i5);
                    com.bumptech.glide.load.resource.bitmap.w wVar = null;
                    try {
                        com.bumptech.glide.load.resource.bitmap.w wVar2 = new com.bumptech.glide.load.resource.bitmap.w(new FileInputStream(hVar.delta().getFileDescriptor()), gVar2);
                        try {
                            int delta = eVar.delta(wVar2, gVar2);
                            wVar2.echo();
                            hVar.delta();
                            if (delta != -1) {
                                return delta;
                            }
                        } catch (Throwable th) {
                            th = th;
                            wVar = wVar2;
                            if (wVar != null) {
                                wVar.echo();
                            }
                            hVar.delta();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return -1;
        }
    }

    public void delta(al alVar, EnumC2564y enumC2564y) {
        int ordinal = enumC2564y.ordinal();
        C1718a c1718a = (C1718a) this.purple;
        C1718a c1718a2 = (C1718a) this.silver;
        if (ordinal != 0) {
            C1718a c1718a3 = (C1718a) this.red;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (alVar.yellow != null) {
                            c1718a2.mike(alVar);
                            return;
                        } else {
                            c1718a3.mike(alVar);
                            return;
                        }
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (alVar.yellow != null) {
                    c1718a2.mike(alVar);
                    return;
                } else {
                    c1718a.mike(alVar);
                    return;
                }
            }
            c1718a3.mike(alVar);
            c1718a2.mike(alVar);
            return;
        }
        c1718a.mike(alVar);
        c1718a2.mike(alVar);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.v
    public Bitmap echo(BitmapFactory.Options options) {
        switch (this.alpha) {
            case 1:
                return BitmapFactory.decodeStream(new Y3.a(Y3.b.charlie((ByteBuffer) this.purple)), null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((com.bumptech.glide.load.data.h) this.silver).delta().getFileDescriptor(), null, options);
        }
    }

    public boolean foxtrot(al alVar) {
        boolean z2;
        boolean z10;
        if (alVar.yellow == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!((f0) ((C1718a) this.purple).purple).contains(alVar) && !((f0) ((C1718a) this.red).purple).contains(alVar)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z2 || !z10) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.v
    public void golf() {
        int i4 = this.alpha;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x008e  */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.String] */
    @Override // com.google.android.gms.measurement.internal.as
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void hotel(String str, int i4, IOException iOException, byte[] bArr, Map map) {
        Z0 z02 = (Z0) this.silver;
        ad.crimson(z02);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                z02.f7550n = false;
                z02.yankee();
            }
        }
        long j5 = ((a1) this.red).alpha;
        String str2 = (String) this.purple;
        if (i4 != 200) {
            if (i4 == 204) {
                i4 = 204;
            }
            String str3 = new String(bArr, StandardCharsets.UTF_8);
            ?? substring = str3.substring(0, Math.min(32, str3.length()));
            a4.j jVar = z02.crimson().f7634d;
            Integer valueOf = Integer.valueOf(i4);
            if (iOException == null) {
                iOException = substring;
            }
            jVar.delta("Network upload failed. Will retry later. appId, status, error", str2, valueOf, iOException);
            C1450j c1450j = z02.red;
            Z0.cyan(c1450j);
            c1450j.n0(Long.valueOf(j5));
            z02.azure();
        }
        if (iOException == null) {
            C1450j c1450j2 = z02.red;
            Z0.cyan(c1450j2);
            c1450j2.k0(Long.valueOf(j5));
            z02.crimson().f7636g.charlie(str2, Integer.valueOf(i4), "Successfully uploaded batch from upload queue. appId, status");
            if (z02.white().j0(null, ac.f7565F)) {
                au auVar = z02.purple;
                Z0.cyan(auVar);
                if (auVar.v0()) {
                    C1450j c1450j3 = z02.red;
                    Z0.cyan(c1450j3);
                    if (c1450j3.v0(str2)) {
                        z02.olive(str2);
                    }
                }
            }
            z02.azure();
        }
        String str32 = new String(bArr, StandardCharsets.UTF_8);
        ?? substring2 = str32.substring(0, Math.min(32, str32.length()));
        a4.j jVar2 = z02.crimson().f7634d;
        Integer valueOf2 = Integer.valueOf(i4);
        if (iOException == null) {
        }
        jVar2.delta("Network upload failed. Will retry later. appId, status, error", str2, valueOf2, iOException);
        C1450j c1450j4 = z02.red;
        Z0.cyan(c1450j4);
        c1450j4.n0(Long.valueOf(j5));
        z02.azure();
    }

    @Override // com.bumptech.glide.load.resource.bitmap.v
    public ImageHeaderParser$ImageType india() {
        switch (this.alpha) {
            case 1:
                return H4.delta((ArrayList) this.red, Y3.b.charlie((ByteBuffer) this.purple));
            default:
                com.bumptech.glide.load.data.h hVar = (com.bumptech.glide.load.data.h) this.silver;
                G3.g gVar = (G3.g) this.purple;
                ArrayList arrayList = (ArrayList) this.red;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    E3.e eVar = (E3.e) arrayList.get(i4);
                    com.bumptech.glide.load.resource.bitmap.w wVar = null;
                    try {
                        com.bumptech.glide.load.resource.bitmap.w wVar2 = new com.bumptech.glide.load.resource.bitmap.w(new FileInputStream(hVar.delta().getFileDescriptor()), gVar);
                        try {
                            ImageHeaderParser$ImageType charlie = eVar.charlie(wVar2);
                            wVar2.echo();
                            hVar.delta();
                            if (charlie != ImageHeaderParser$ImageType.UNKNOWN) {
                                return charlie;
                            }
                        } catch (Throwable th) {
                            th = th;
                            wVar = wVar2;
                            if (wVar != null) {
                                wVar.echo();
                            }
                            hVar.delta();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public List juliet(byte[] bArr) {
        List list = (List) ((ConcurrentHashMap) this.purple).get(new s7.g(bArr));
        if (list != null) {
            return list;
        }
        return Collections.EMPTY_LIST;
    }

    public boolean kilo() {
        boolean z2;
        if (((f0) ((C1718a) this.purple).purple).isEmpty() && ((f0) ((C1718a) this.silver).purple).isEmpty() && ((f0) ((C1718a) this.red).purple).isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        return !z2;
    }

    public boolean lima(Y1.aa destination) {
        Intrinsics.echo(destination, "destination");
        int i4 = Y1.aa.white;
        for (Y1.aa aaVar : Y1.y.bravo(destination)) {
            if (((HashSet) this.purple).contains(Integer.valueOf(aaVar.purple.charlie))) {
                if (aaVar instanceof Y1.ac) {
                    int i5 = destination.purple.charlie;
                    int i10 = Y1.ac.f2266a;
                    if (i5 == ((Y1.aa) AbstractC2360j.november(AbstractC2360j.lima((Y1.ac) aaVar, new X9.i(7)))).purple.charlie) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public h(Z0 z02, String str, a1 a1Var) {
        this.alpha = 5;
        this.purple = str;
        this.red = a1Var;
        this.silver = z02;
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
    }

    public h(Ge.e eVar, C2576i c2576i) {
        this.alpha = 13;
        this.purple = eVar;
        this.red = c2576i;
        this.silver = new ConcurrentHashMap();
    }

    public h(C1715g argumentRange, Method[] methodArr, Method method) {
        this.alpha = 7;
        Intrinsics.echo(argumentRange, "argumentRange");
        this.purple = argumentRange;
        this.red = methodArr;
        this.silver = method;
    }

    public h(InterfaceC2333i classifierDescriptor, List arguments, h hVar) {
        this.alpha = 8;
        Intrinsics.echo(classifierDescriptor, "classifierDescriptor");
        Intrinsics.echo(arguments, "arguments");
        this.purple = classifierDescriptor;
        this.red = arguments;
        this.silver = hVar;
    }

    public h(int i4) {
        this.alpha = i4;
        switch (i4) {
            case 11:
                this.purple = new HashMap();
                this.red = new HashMap();
                this.silver = C2983e.charlie;
                return;
            case 14:
                this.purple = new String[6];
                this.red = new int[6];
                this.silver = new int[6];
                return;
            default:
                this.purple = new C1718a(20);
                this.red = new C1718a(20);
                this.silver = new C1718a(20);
                return;
        }
    }

    public h(Class cls) {
        this.alpha = 10;
        this.purple = new ConcurrentHashMap();
        this.silver = cls;
    }

    public h(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, G3.g gVar) {
        this.alpha = 2;
        Y3.f.charlie(gVar, "Argument must not be null");
        this.purple = gVar;
        Y3.f.charlie(arrayList, "Argument must not be null");
        this.red = arrayList;
        this.silver = new com.bumptech.glide.load.data.h(parcelFileDescriptor);
    }
}
