package com.incognia.internal;

import android.security.keystore.KeyPermanentlyInvalidatedException;
import com.google.android.material.datepicker.j;
import h9.C1824b;
import h9.s;
import java.security.Key;
import java.security.KeyStore;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class P48 implements Gg, tcn {
    public static final String PqK = (String) wGk.f11670Y.getValue();

    /* renamed from: V, reason: collision with root package name */
    public static final String f9383V = (String) wGk.Nh.getValue();

    /* renamed from: W, reason: collision with root package name */
    public final MkB f9385W;

    /* renamed from: b, reason: collision with root package name */
    public final pl2 f9386b;

    /* renamed from: f9, reason: collision with root package name */
    public final ccL f9387f9;
    public final K sVU;
    public D5f gmP = aNe.f10097b;

    /* renamed from: J, reason: collision with root package name */
    public boolean f9384J = W();

    public P48(pl2 pl2Var, MkB mkB, W6 w62, ccL ccl, K k6) {
        this.f9386b = pl2Var;
        this.f9385W = mkB;
        this.f9387f9 = ccl;
        this.sVU = k6;
    }

    @Override // com.incognia.internal.Gg
    public final void J() {
        this.gmP = tOI.f11377b;
        if (CnH.b(CnH.f8484b, 24, 0, 2) && this.f9384J && R() == null) {
            MkB.b(this.f9385W, f9383V);
        }
    }

    @Override // com.incognia.internal.tcn
    public final void PqK() {
        njO.b(this, new s(this, 0));
    }

    public final SecretKey R() {
        Key key;
        try {
            KeyStore keyStore = this.f9385W.f9168b;
            if (keyStore != null) {
                keyStore.load(null);
            }
        } catch (Throwable unused) {
        }
        MkB mkB = this.f9385W;
        String str = f9383V;
        try {
            KeyStore keyStore2 = mkB.f9168b;
            if (keyStore2 != null) {
                key = keyStore2.getKey(str, null);
            } else {
                key = null;
            }
            return (SecretKey) key;
        } catch (Throwable unused2) {
            return null;
        }
    }

    @Override // com.incognia.internal.tcn
    public final void V() {
        DF7.b(this);
    }

    public final void W(boolean z2) {
        if (z2) {
            kT kTVar = QHn.f9493f9;
            String str = PqK;
            NL nl = NL.f9200b;
            kTVar.b(str, new s0(((s0) kTVar.b(nl, str)) != null ? 1 + ((s0) kTVar.b(nl, str)).f11255b : 1, System.currentTimeMillis()), xKv.f11791b);
            return;
        }
        kT kTVar2 = QHn.f9493f9;
        String str2 = PqK;
        if (((s0) kTVar2.b(NL.f9200b, str2)) == null) {
            kTVar2.b(str2, new s0(0, System.currentTimeMillis()), xKv.f11791b);
        }
    }

    @Override // com.incognia.internal.sX
    public final void b(S0A s0a) {
        DF7.W(this);
    }

    @Override // com.incognia.internal.Gg
    public final void f9() {
        this.gmP = b66.f10146b;
        if (CnH.b(CnH.f8484b, 24, 0, 2) && this.f9384J) {
            njO.b(this, new s(this, 1));
        }
    }

    @Override // com.incognia.internal.tcn
    public final boolean gmP() {
        return this.f9384J;
    }

    @Override // com.incognia.internal.tcn
    public final void olU() {
    }

    @Override // com.incognia.internal.Gg
    public final D5f sVU() {
        return this.gmP;
    }

    @Override // com.incognia.internal.Gg
    public final pl2 b() {
        return this.f9386b;
    }

    @Override // com.incognia.internal.tcn
    public final void b(boolean z2) {
        this.f9384J = z2;
    }

    @Override // com.incognia.internal.Gg
    public final void b(Cj0 cj0) {
        this.gmP = L4.f9041b;
        cj0.invoke();
    }

    public static final void b(P48 p48) {
        if (CnH.b(CnH.f8484b, 24, 0, 2)) {
            p48.b((Function1) null);
        }
    }

    public final void b(Jup jup) {
        if (CnH.b(CnH.f8484b, 24, 0, 2)) {
            if (njO.b(this, new C1824b(14, this, jup))) {
                return;
            }
            Result.Companion companion = Result.INSTANCE;
            jup.b(Result.m206constructorimpl(ResultKt.createFailure(new KcS(PqK))));
            return;
        }
        jup.b(Result.m206constructorimpl(null));
    }

    @Override // com.incognia.internal.tcn
    public final boolean W() {
        if (Intrinsics.areEqual(this.sVU.b(), r.f11189b)) {
            return false;
        }
        return this.f9387f9.W(PqK);
    }

    public static final void W(P48 p48) {
        p48.b((Function1) null);
    }

    public static final void b(P48 p48, Function1 function1) {
        p48.b(function1);
    }

    public final void b(Function1 function1) {
        try {
            if (R() == null) {
                MkB.b(this.f9385W, f9383V);
            }
            Cipher.getInstance("AES/CBC/PKCS7Padding").init(1, R());
            W(false);
            if (function1 != null) {
                Result.Companion companion = Result.INSTANCE;
                function1.invoke(new Result(Result.m206constructorimpl((s0) QHn.f9493f9.b(NL.f9200b, PqK))));
            }
        } catch (Throwable th) {
            if (!(th instanceof KeyPermanentlyInvalidatedException)) {
                if (function1 != null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    j.quebec(Result.m206constructorimpl(ResultKt.createFailure(th)), function1);
                    return;
                }
                return;
            }
            W(true);
            MkB.b(this.f9385W, f9383V);
            if (function1 != null) {
                Result.Companion companion3 = Result.INSTANCE;
                j.quebec(Result.m206constructorimpl((s0) QHn.f9493f9.b(NL.f9200b, PqK)), function1);
            }
        }
    }
}
