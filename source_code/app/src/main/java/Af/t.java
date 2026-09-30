package Af;

import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.P0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import s2.InterfaceC2595c;
import s2.InterfaceC2596d;

/* loaded from: classes2.dex */
public final class t implements InterfaceC2596d {
    public final /* synthetic */ int alpha;
    public String purple;

    public static void alpha(J2.t tVar, W7.d dVar) {
        String str = dVar.alpha;
        if (str != null) {
            tVar.quebec("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        tVar.quebec("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        tVar.quebec("X-CRASHLYTICS-API-CLIENT-VERSION", "19.4.4");
        tVar.quebec("Accept", "application/json");
        String str2 = dVar.bravo;
        if (str2 != null) {
            tVar.quebec("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = dVar.charlie;
        if (str3 != null) {
            tVar.quebec("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = dVar.delta;
        if (str4 != null) {
            tVar.quebec("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = dVar.echo.charlie().alpha;
        if (str5 != null) {
            tVar.quebec("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap bravo(W7.d dVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", dVar.hotel);
        hashMap.put("display_version", dVar.golf);
        hashMap.put("source", Integer.toString(dVar.india));
        String str = dVar.foxtrot;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    @Override // s2.InterfaceC2596d
    public void charlie(InterfaceC2595c interfaceC2595c) {
    }

    public JSONObject delta(Fe.c cVar) {
        StringBuilder sb2 = new StringBuilder("Settings response code was: ");
        int i4 = cVar.purple;
        sb2.append(i4);
        String sb3 = sb2.toString();
        L7.c cVar2 = L7.c.alpha;
        cVar2.foxtrot(sb3);
        String str = this.purple;
        if (i4 != 200 && i4 != 201 && i4 != 202 && i4 != 203) {
            String str2 = "Settings request failed; (status: " + i4 + ") from " + str;
            if (cVar2.bravo(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
                return null;
            }
        } else {
            String str3 = (String) cVar.red;
            try {
                return new JSONObject(str3);
            } catch (Exception e) {
                cVar2.golf("Failed to parse settings JSON from " + str, e);
                cVar2.golf("Settings response " + str3, null);
            }
        }
        return null;
    }

    @Override // s2.InterfaceC2596d
    public String echo() {
        return this.purple;
    }

    public String toString() {
        switch (this.alpha) {
            case 0:
                return P0.fuchsia(new StringBuilder("<"), this.purple, '>');
            case 1:
                return P0.gold(new StringBuilder("Phase('"), this.purple, "')");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ t(String str, int i4) {
        this.alpha = i4;
        this.purple = str;
    }

    public t(String query) {
        this.alpha = 5;
        Intrinsics.echo(query, "query");
        this.purple = query;
    }

    public t(String str, U8.a aVar) {
        this.alpha = 4;
        if (str != null) {
            this.purple = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
