package A7;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import bd.ScheduledExecutorServiceC0750c;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Random;
import javax.crypto.Cipher;
import s6.U6;
import t0.Y;
import t0.ay;

/* loaded from: classes2.dex */
public final class a extends ThreadLocal {
    public final /* synthetic */ int alpha;

    public /* synthetic */ a(int i4) {
        this.alpha = i4;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.alpha) {
            case 0:
                try {
                    return (Cipher) l.echo.alpha("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                try {
                    return (Cipher) l.echo.alpha("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e4) {
                    throw new IllegalStateException(e4);
                }
            case 2:
                try {
                    return (Cipher) l.echo.alpha("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e5) {
                    throw new IllegalStateException(e5);
                }
            case 3:
                try {
                    return (Cipher) l.echo.alpha("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            case 4:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            case 5:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return tg.k.echo();
                }
                if (Looper.myLooper() != null) {
                    return new ScheduledExecutorServiceC0750c(new Handler(Looper.myLooper()));
                }
                return null;
            case 6:
                return new Random();
            case 7:
                return 0L;
            case 8:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    ay ayVar = new ay(choreographer, U6.alpha(myLooper));
                    return ayVar.plus(ayVar.f13832d);
                }
                throw new IllegalStateException("no Looper on this thread");
            case 9:
                return new Y();
            default:
                try {
                    return (Cipher) l.echo.alpha("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e11) {
                    throw new IllegalStateException(e11);
                }
        }
    }
}
