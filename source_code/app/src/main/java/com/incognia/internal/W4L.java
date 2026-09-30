package com.incognia.internal;

import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class W4L {

    /* renamed from: W, reason: collision with root package name */
    public final Nkf f9829W;

    /* renamed from: b, reason: collision with root package name */
    public final MkB f9830b;

    /* renamed from: f9, reason: collision with root package name */
    public static final String f9828f9 = (String) wGk.XX.getValue();
    public static final long sVU = TimeUnit.MINUTES.toMillis(1);
    public static final String gmP = (String) wGk.KW.getValue();

    public W4L(MkB mkB, S0A s0a, W6 w62) {
        this.f9830b = mkB;
        this.f9829W = new Nkf(w62, ((JSONObject) s0a.f9574b.get()).optLong(gmP, sVU));
    }

    public final void b(xm xmVar) {
        ArrayList arrayList;
        int collectionSizeOrDefault;
        try {
            ArrayList b2 = b(f9828f9 + UUID.randomUUID(), UUID.randomUUID().toString());
            if (b2 != null) {
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(b2, 10);
                arrayList = new ArrayList(collectionSizeOrDefault);
                int size = b2.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = b2.get(i4);
                    i4++;
                    arrayList.add(cT.f9(0, ((X509Certificate) obj).getEncoded()));
                }
            } else {
                arrayList = null;
            }
            xmVar.invoke(new Result(Result.m206constructorimpl(arrayList)));
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            xmVar.invoke(new Result(Result.m206constructorimpl(ResultKt.createFailure(th))));
        }
    }

    public final String b() {
        X509Certificate x509Certificate;
        if (this.f9829W.b()) {
            try {
                ArrayList b2 = b(f9828f9 + UUID.randomUUID(), UUID.randomUUID().toString());
                if (b2 != null && (x509Certificate = (X509Certificate) CollectionsKt.green(b2)) != null) {
                    byte[] extensionValue = x509Certificate.getExtensionValue((String) wGk.f11618G4.getValue());
                    this.f9829W.b(extensionValue != null ? cT.f9(0, extensionValue) : null);
                }
            } catch (Throwable th) {
                this.f9829W.b(null);
                throw th;
            }
        }
        return (String) this.f9829W.sVU;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:3|4|5|(1:7)|9|10|11|(1:13)|(4:16|17|18|(1:20))|23|(2:24|25)|(6:29|30|31|32|(1:34)|(3:37|(4:40|(3:42|43|44)(1:46)|45|38)|47))|50|30|31|32|(0)|(0)) */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0046 A[Catch: all -> 0x0049, TRY_LEAVE, TryCatch #2 {all -> 0x0049, blocks: (B:32:0x0042, B:34:0x0046), top: B:31:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList b(String str, String str2) {
        List list;
        KeyStore keyStore;
        KeyStore keyStore2;
        Certificate[] certificateChain;
        boolean z2 = false;
        ArrayList arrayList = null;
        if (CnH.b(CnH.f8484b, 24, 0, 2)) {
            try {
                KeyStore keyStore3 = this.f9830b.f9168b;
                if (keyStore3 != null) {
                    keyStore3.load(null);
                }
            } catch (Throwable unused) {
            }
            try {
                KeyStore keyStore4 = this.f9830b.f9168b;
                if (keyStore4 != null) {
                    z2 = keyStore4.containsAlias(str);
                }
            } catch (Throwable unused2) {
            }
            if (z2) {
                try {
                    KeyStore keyStore5 = this.f9830b.f9168b;
                    if (keyStore5 != null) {
                        keyStore5.deleteEntry(str);
                    }
                } catch (Throwable unused3) {
                }
            }
            MkB.b(str, str2);
            try {
                keyStore2 = this.f9830b.f9168b;
            } catch (Throwable unused4) {
            }
            if (keyStore2 != null && (certificateChain = keyStore2.getCertificateChain(str)) != null) {
                list = ArraysKt.sierra(certificateChain);
                keyStore = this.f9830b.f9168b;
                if (keyStore != null) {
                    keyStore.deleteEntry(str);
                }
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof X509Certificate) {
                            arrayList.add(obj);
                        }
                    }
                }
            }
            list = null;
            keyStore = this.f9830b.f9168b;
            if (keyStore != null) {
            }
            if (list != null) {
            }
        }
        return arrayList;
    }
}
