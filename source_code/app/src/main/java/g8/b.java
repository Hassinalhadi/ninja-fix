package g8;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Callable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ c purple;

    public /* synthetic */ b(c cVar, int i4) {
        this.alpha = i4;
        this.purple = cVar;
    }

    private final Object alpha() {
        String byteArrayOutputStream;
        c cVar = this.purple;
        synchronized (cVar) {
            try {
                g gVar = (g) cVar.alpha.get();
                ArrayList charlie = gVar.charlie();
                gVar.bravo();
                JSONArray jSONArray = new JSONArray();
                for (int i4 = 0; i4 < charlie.size(); i4++) {
                    C1757a c1757a = (C1757a) charlie.get(i4);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", c1757a.alpha);
                    jSONObject.put("dates", new JSONArray((Collection) c1757a.bravo));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return byteArrayOutputStream;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.alpha) {
            case 0:
                return alpha();
            default:
                c cVar = this.purple;
                synchronized (cVar) {
                    ((g) cVar.alpha.get()).kilo(System.currentTimeMillis(), ((D8.b) cVar.charlie.get()).alpha());
                }
                return null;
        }
    }
}
