package com.google.android.play.core.integrity;

import J8.B;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import ao.ad;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import p7.AbstractC2286c;
import p7.C2285b;
import p7.q;
import p7.r;
import p7.t;
import p7.u;

/* loaded from: classes2.dex */
public final class d extends u {
    public final /* synthetic */ int purple = 1;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;

    public d(B b2, IBinder iBinder) {
        this.red = iBinder;
        this.silver = b2;
    }

    @Override // p7.u
    public final void bravo() {
        String str;
        r pVar;
        int i4 = 0;
        Object obj = this.red;
        Object obj2 = this.silver;
        switch (this.purple) {
            case 0:
                Context context = (Context) obj;
                G6.h hVar = ((i) obj2).charlie;
                t tVar = AbstractC2286c.alpha;
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
                    ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    if (applicationInfo != null && applicationInfo.enabled) {
                        Signature[] signatureArr = packageInfo.signatures;
                        t tVar2 = AbstractC2286c.alpha;
                        if (signatureArr != null && (signatureArr.length) != 0) {
                            ArrayList arrayList = new ArrayList();
                            for (Signature signature : signatureArr) {
                                byte[] byteArray = signature.toByteArray();
                                try {
                                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                    messageDigest.update(byteArray);
                                    str = Base64.encodeToString(messageDigest.digest(), 11);
                                } catch (NoSuchAlgorithmException unused) {
                                    str = "";
                                }
                                arrayList.add(str);
                                if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                                    String str2 = Build.TAGS;
                                    if ((!str2.contains("dev-keys") && !str2.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                                    }
                                }
                                i4 = packageInfo.versionCode;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            Iterator it = arrayList.iterator();
                            if (it.hasNext()) {
                                while (true) {
                                    sb2.append((CharSequence) it.next());
                                    if (it.hasNext()) {
                                        sb2.append((CharSequence) ", ");
                                    }
                                }
                            }
                            String gray = ad.gray("Play Store package certs are not valid. Found these sha256 certs: [", sb2.toString(), "].");
                            Object[] objArr = new Object[0];
                            tVar2.getClass();
                            if (Log.isLoggable("PlayCore", 5)) {
                                Log.w("PlayCore", t.charlie(tVar2.alpha, gray, objArr));
                            }
                        } else {
                            Object[] objArr2 = new Object[0];
                            tVar2.getClass();
                            if (Log.isLoggable("PlayCore", 5)) {
                                Log.w("PlayCore", t.charlie(tVar2.alpha, "Play Store package is not signed -- possibly self-built package. Could not verify.", objArr2));
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                hVar.delta(Integer.valueOf(i4));
                return;
            default:
                C2285b c2285b = (C2285b) ((B) obj2).bravo;
                c2285b.india.getClass();
                int i5 = q.hotel;
                IBinder iBinder = (IBinder) obj;
                if (iBinder == null) {
                    pVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                    if (queryLocalInterface instanceof r) {
                        pVar = (r) queryLocalInterface;
                    } else {
                        pVar = new p7.p(iBinder);
                    }
                }
                c2285b.november = pVar;
                t tVar3 = c2285b.bravo;
                tVar3.bravo("linkToDeath", new Object[0]);
                try {
                    ((p7.p) c2285b.november).golf.linkToDeath(c2285b.kilo, 0);
                } catch (RemoteException e) {
                    tVar3.alpha(e, "linkToDeath failed", new Object[0]);
                }
                c2285b.golf = false;
                Iterator it2 = c2285b.delta.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                c2285b.delta.clear();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, G6.h hVar, Context context) {
        super(hVar);
        this.red = context;
        this.silver = iVar;
    }
}
