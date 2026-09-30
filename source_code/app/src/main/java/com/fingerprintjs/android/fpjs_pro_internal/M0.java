package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import com.fingerprintjs.android.fpjs_pro_internal.T0;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2707l6;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/M0;", "Lcom/fingerprintjs/android/fpjs_pro_internal/bz;", "delta", "a"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class M0 implements bz {

    /* renamed from: delta, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public final InterfaceC1276x alpha;
    public final cj bravo;
    public final SSLSocketFactory charlie;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/M0$a;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.fingerprintjs.android.fpjs_pro_internal.M0$a, reason: from kotlin metadata */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public M0(InterfaceC1276x interfaceC1276x, cj cjVar, SSLSocketFactory sSLSocketFactory, DefaultConstructorMarker defaultConstructorMarker) {
        this.alpha = interfaceC1276x;
        this.bravo = cjVar;
        this.charlie = sSLSocketFactory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    @Override // com.fingerprintjs.android.fpjs_pro_internal.bz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bx alpha(cf cfVar, Integer num, Integer num2, Function0 function0, Function0 function02) {
        M0 m02;
        Object m206constructorimpl;
        N14263A23323 component5;
        Object m206constructorimpl2;
        bx bxVar;
        function0.invoke();
        try {
            Result.Companion companion = Result.INSTANCE;
            m02 = this;
            try {
                m206constructorimpl = Result.m206constructorimpl(m02.bravo(cfVar.component5(), cfVar.setPivotYN16904(), cfVar.D8871(), new L0(cfVar, this), num, num2));
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th2));
                component5 = bk.component5(m206constructorimpl);
                function02.invoke();
                if (!(component5 instanceof component8)) {
                }
                return (bx) component13.vD14832N6715(component5, new bx(null));
            }
        } catch (Throwable th3) {
            th = th3;
            m02 = this;
        }
        component5 = bk.component5(m206constructorimpl);
        function02.invoke();
        if (!(component5 instanceof component8)) {
            Pair pair = (Pair) ((component8) component5).component9;
            byte[] bArr = (byte[]) pair.first;
            try {
                cj cjVar = m02.bravo;
                if (cjVar != null) {
                    byte[] component9 = cjVar.component9(bArr);
                    if (component9.length == 0) {
                        bxVar = new bx(bArr);
                    } else {
                        bxVar = new bx(component9);
                    }
                } else {
                    bxVar = new bx(bArr);
                }
                m206constructorimpl2 = Result.m206constructorimpl(bxVar);
            } catch (Throwable th4) {
                Result.Companion companion3 = Result.INSTANCE;
                m206constructorimpl2 = Result.m206constructorimpl(ResultKt.createFailure(th4));
            }
            component5 = bk.component5(m206constructorimpl2);
        } else if (!(component5 instanceof setTopP6481)) {
            throw new NoWhenBranchMatchedException();
        }
        return (bx) component13.vD14832N6715(component5, new bx(null));
    }

    public final Pair bravo(String str, T0 t02, Map map, Function1 function1, Integer num, Integer num2) {
        Object m206constructorimpl;
        InputStream dataInputStream;
        boolean z2 = false;
        List<Integer> listOf = CollectionsKt.listOf(num, num2);
        if (listOf == null || !listOf.isEmpty()) {
            for (Integer num3 : listOf) {
                if (num3 != null && num3.intValue() <= 0) {
                    throw new Exception();
                }
            }
        }
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
        Intrinsics.checkNotNull(uRLConnection);
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
        if (num != null) {
            httpsURLConnection.setConnectTimeout(num.intValue());
        }
        if (num2 != null) {
            httpsURLConnection.setReadTimeout(num2.intValue());
        }
        SSLSocketFactory sSLSocketFactory = this.charlie;
        if (sSLSocketFactory != null) {
            httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
        }
        for (String str2 : map.keySet()) {
            map.get(str2);
            httpsURLConnection.setRequestProperty(str2, (String) map.get(str2));
        }
        if (Intrinsics.areEqual(t02, T0.a.alpha)) {
            httpsURLConnection.setRequestMethod(P28427.C1025d0.echo.vD14832N6715());
        } else if (Intrinsics.areEqual(t02, T0.b.alpha)) {
            httpsURLConnection.setRequestMethod(P28427.C1159w1.echo.vD14832N6715());
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.connect();
            try {
                Result.Companion companion = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(httpsURLConnection.getServerCertificates());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            byte[] invoke = ((L0) function1).invoke(new ca((Certificate[]) component13.vD14832N6715(bk.component5(m206constructorimpl), null)));
            DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
            dataOutputStream.write(invoke);
            dataOutputStream.flush();
        }
        httpsURLConnection.getResponseCode();
        if (httpsURLConnection.getResponseCode() != 200) {
            dataInputStream = httpsURLConnection.getErrorStream();
            if (dataInputStream == null) {
                dataInputStream = httpsURLConnection.getInputStream();
                Intrinsics.checkNotNull(dataInputStream);
            }
            z2 = true;
        } else {
            dataInputStream = new DataInputStream(httpsURLConnection.getInputStream());
        }
        try {
            byte[] foxtrot = AbstractC2707l6.foxtrot(dataInputStream);
            new String(foxtrot, kotlin.text.a.alpha);
            Pair pair = new Pair(foxtrot, Boolean.valueOf(z2));
            dataInputStream.close();
            return pair;
        } finally {
        }
    }
}
