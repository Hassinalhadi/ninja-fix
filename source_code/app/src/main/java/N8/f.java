package N8;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;
import vf.ab;

/* loaded from: classes2.dex */
public final class f extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ g purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ c silver;
    public final /* synthetic */ d teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Map map, c cVar, d dVar, Nd.c cVar2) {
        super(2, cVar2);
        this.purple = gVar;
        this.red = map;
        this.silver = cVar;
        this.teal = dVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        c cVar2 = this.silver;
        d dVar = this.teal;
        return new f(this.purple, this.red, cVar2, dVar, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c9, code lost:
    
        if (r2.invoke(r9, r8) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dc, code lost:
    
        if (r2.invoke(r1, r8) != r0) goto L37;
     */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.Map, java.lang.Object] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        d dVar = this.teal;
        try {
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            this.alpha = 3;
        }
        if (i4 != 0) {
            if (i4 != 1 && i4 != 2) {
                if (i4 == 3) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
            }
        } else {
            ResultKt.alpha(obj);
            URLConnection openConnection = g.alpha(this.purple).openConnection();
            Intrinsics.charlie(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.setRequestProperty("Accept", "application/json");
            for (Map.Entry entry : this.red.entrySet()) {
                httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode == 200) {
                InputStream inputStream = httpsURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder sb2 = new StringBuilder();
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    objectRef.alpha = readLine;
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                }
                bufferedReader.close();
                inputStream.close();
                JSONObject jSONObject = new JSONObject(sb2.toString());
                c cVar = this.silver;
                this.alpha = 1;
                if (cVar.invoke(jSONObject, this) == aVar) {
                    return aVar;
                }
            } else {
                String str = "Bad response code: " + responseCode;
                this.alpha = 2;
            }
        }
        return Unit.INSTANCE;
    }
}
