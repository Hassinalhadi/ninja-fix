package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.measurement.C1362p2;
import com.google.android.gms.internal.measurement.C1369r2;
import com.google.android.gms.location.LastLocationRequest;
import i6.InterfaceC1892a;
import i6.InterfaceC1893b;
import j2.InterfaceC1935b;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1475w implements aa, I7.e, InterfaceC1893b, InterfaceC1935b, Nd.g, T5.m, ug.a {
    public static final /* synthetic */ C1475w purple = new C1475w(13);
    public final /* synthetic */ int alpha;

    public /* synthetic */ C1475w(int i4) {
        this.alpha = i4;
    }

    @Override // T5.m
    public void accept(Object obj, Object obj2) {
        ((p6.q) obj).blue(new LastLocationRequest(Long.MAX_VALUE, 0, false, null), (G6.h) obj2);
    }

    @Override // i6.InterfaceC1893b
    public H3.e alpha(Context context, String str, InterfaceC1892a interfaceC1892a) {
        H3.e eVar = new H3.e();
        int charlie = interfaceC1892a.charlie(context, str);
        eVar.alpha = charlie;
        if (charlie != 0) {
            eVar.charlie = -1;
            return eVar;
        }
        int bravo = interfaceC1892a.bravo(context, str, true);
        eVar.bravo = bravo;
        if (bravo != 0) {
            eVar.charlie = 1;
        }
        return eVar;
    }

    @Override // j2.InterfaceC1935b
    public void charlie(int i4, Serializable serializable) {
        String str;
        switch (i4) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i4 != 6 && i4 != 7 && i4 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        }
    }

    @Override // ug.a
    public void clear() {
    }

    @Override // I7.e
    public Object create(I7.c cVar) {
        return new com.google.mlkit.common.sdkinternal.m((Context) ((B9.ab) cVar).charlie(Context.class));
    }

    @Override // ug.a
    public void delta(Map map) {
    }

    @Override // ug.a
    public Map echo() {
        return null;
    }

    @Override // j2.InterfaceC1935b
    public void lima() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // com.google.android.gms.measurement.internal.aa
    public Object zza() {
        switch (this.alpha) {
            case 0:
                List list = ac.alpha;
                C1362p2.purple.get();
                Long l10 = (Long) C1369r2.black.bravo();
                l10.getClass();
                return l10;
            case 1:
                List list2 = ac.alpha;
                C1362p2.purple.get();
                Long l11 = (Long) C1369r2.kilo.bravo();
                l11.getClass();
                return l11;
            case 2:
                List list3 = ac.alpha;
                C1362p2.purple.get();
                return (String) C1369r2.golf.bravo();
            case 3:
                List list4 = ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.sierra.bravo()).longValue());
            case 4:
                List list5 = ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.victor.bravo()).longValue());
            case 5:
                List list6 = ac.alpha;
                C1362p2.purple.get();
                return (String) C1369r2.f6695l.bravo();
            default:
                List list7 = ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.maroon.bravo()).longValue());
        }
    }
}
