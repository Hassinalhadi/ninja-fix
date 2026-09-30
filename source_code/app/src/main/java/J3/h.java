package J3;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class h implements E3.f {
    public final l bravo;
    public final URL charlie;
    public final String delta;
    public String echo;
    public URL foxtrot;
    public volatile byte[] golf;
    public int hotel;

    public h(URL url) {
        l lVar = i.alpha;
        Y3.f.charlie(url, "Argument must not be null");
        this.charlie = url;
        this.delta = null;
        Y3.f.charlie(lVar, "Argument must not be null");
        this.bravo = lVar;
    }

    @Override // E3.f
    public final void alpha(MessageDigest messageDigest) {
        if (this.golf == null) {
            this.golf = charlie().getBytes(E3.f.alpha);
        }
        messageDigest.update(this.golf);
    }

    public final String charlie() {
        String str = this.delta;
        if (str != null) {
            return str;
        }
        URL url = this.charlie;
        Y3.f.charlie(url, "Argument must not be null");
        return url.toString();
    }

    public final URL delta() {
        if (this.foxtrot == null) {
            if (TextUtils.isEmpty(this.echo)) {
                String str = this.delta;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.charlie;
                    Y3.f.charlie(url, "Argument must not be null");
                    str = url.toString();
                }
                this.echo = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.foxtrot = new URL(this.echo);
        }
        return this.foxtrot;
    }

    @Override // E3.f
    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (charlie().equals(hVar.charlie()) && this.bravo.equals(hVar.bravo)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // E3.f
    public final int hashCode() {
        if (this.hotel == 0) {
            int hashCode = charlie().hashCode();
            this.hotel = hashCode;
            this.hotel = this.bravo.bravo.hashCode() + (hashCode * 31);
        }
        return this.hotel;
    }

    public final String toString() {
        return charlie();
    }

    public h(String str, l lVar) {
        this.charlie = null;
        if (!TextUtils.isEmpty(str)) {
            this.delta = str;
            Y3.f.charlie(lVar, "Argument must not be null");
            this.bravo = lVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
