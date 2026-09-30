package D6;

import A0.z;
import F8.q;
import H6.d;
import T5.r;
import V5.f;
import V5.m;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import av.ao;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import okhttp3.internal.http.HttpStatusCodesKt;
import w6.g;

/* loaded from: classes2.dex */
public final class b {
    public final /* synthetic */ int alpha;

    public /* synthetic */ b(int i4) {
        this.alpha = i4;
    }

    public static byte[] bravo(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i4 = 0; i4 < 16; i4++) {
                byte b2 = (byte) ((bArr[i4] << 1) & 254);
                bArr2[i4] = b2;
                if (i4 < 15) {
                    bArr2[i4] = (byte) (((byte) ((bArr[i4 + 1] >> 7) & 1)) | b2);
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }

    public com.google.android.gms.common.api.c alpha(Context context, Looper looper, ao aoVar, Object obj, h hVar, i iVar) {
        switch (this.alpha) {
            case 0:
                aoVar.getClass();
                Integer num = (Integer) aoVar.white;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new E6.a(context, looper, aoVar, bundle, hVar, iVar);
            case 1:
                throw z.hotel(obj);
            case 2:
                d dVar = (d) obj;
                if (dVar == null) {
                    dVar = new d(new q());
                }
                return new g(context, looper, aoVar, (r) hVar, (r) iVar, dVar.alpha);
            default:
                r rVar = (r) hVar;
                r rVar2 = (r) iVar;
                switch (this.alpha) {
                    case 3:
                        return new X5.c(context, looper, aoVar, (m) obj, rVar, rVar2);
                    case 4:
                        return new f(context, looper, HttpStatusCodesKt.HTTP_PERM_REDIRECT, aoVar, rVar, rVar2);
                    case 5:
                        return new f(context, looper, 23, aoVar, rVar, rVar2);
                    case 6:
                        return new p6.q(context, looper, aoVar, rVar, rVar2);
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                }
        }
    }
}
