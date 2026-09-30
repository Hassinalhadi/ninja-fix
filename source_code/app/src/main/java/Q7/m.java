package Q7;

import android.util.Log;
import com.google.maps.android.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
public final class m implements d {
    public static final Charset red = Charset.forName("UTF-8");
    public final File alpha;
    public l purple;

    public m(File file) {
        this.alpha = file;
    }

    @Override // Q7.d
    public final void alpha() {
        O7.f.bravo(this.purple, "There was a problem closing the Crashlytics log file.");
        this.purple = null;
    }

    public final void bravo() {
        File file = this.alpha;
        if (this.purple == null) {
            try {
                this.purple = new l(file);
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004a  */
    @Override // Q7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String charlie() {
        Fe.c cVar;
        byte[] bArr;
        if (this.alpha.exists()) {
            bravo();
            l lVar = this.purple;
            if (lVar != null) {
                int[] iArr = {0};
                byte[] bArr2 = new byte[lVar.blue()];
                try {
                    this.purple.golf(new f(iArr, bArr2));
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e);
                }
                cVar = new Fe.c(bArr2, iArr[0], 4);
                if (cVar != null) {
                    bArr = null;
                } else {
                    int i4 = cVar.purple;
                    bArr = new byte[i4];
                    System.arraycopy((byte[]) cVar.red, 0, bArr, 0, i4);
                }
                if (bArr != null) {
                    return null;
                }
                return new String(bArr, red);
            }
        }
        cVar = null;
        if (cVar != null) {
        }
        if (bArr != null) {
        }
    }

    @Override // Q7.d
    public final void kilo(long j5, String str) {
        bravo();
        if (this.purple != null) {
            if (str == null) {
                str = BuildConfig.TRAVIS;
            }
            try {
                if (str.length() > 16384) {
                    str = "..." + str.substring(str.length() - Http2.INITIAL_MAX_FRAME_SIZE);
                }
                this.purple.charlie(String.format(Locale.US, "%d %s%n", Long.valueOf(j5), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(red));
                while (!this.purple.juliet() && this.purple.blue() > 65536) {
                    this.purple.uniform();
                }
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
            }
        }
    }
}
