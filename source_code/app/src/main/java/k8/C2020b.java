package k8;

import B7.g;
import B7.i;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: k8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2020b {
    public static final String[] charlie = {"*", "FCM", "GCM", ""};
    public final SharedPreferences alpha;
    public final String bravo;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (r1.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2020b(g gVar) {
        gVar.alpha();
        this.alpha = gVar.alpha.getSharedPreferences("com.google.android.gms.appid", 0);
        gVar.alpha();
        i iVar = gVar.charlie;
        String str = iVar.echo;
        if (str == null) {
            gVar.alpha();
            str = iVar.bravo;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] split = str.split(":");
                if (split.length == 4) {
                    str = split[1];
                }
                str = null;
            }
        }
        this.bravo = str;
    }

    public final String alpha() {
        String string;
        synchronized (this.alpha) {
            string = this.alpha.getString("|S|id", null);
        }
        return string;
    }

    public final String bravo() {
        PublicKey publicKey;
        synchronized (this.alpha) {
            String str = null;
            String string = this.alpha.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                Log.w("ContentValues", "Invalid key stored " + e);
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return str;
        }
    }
}
