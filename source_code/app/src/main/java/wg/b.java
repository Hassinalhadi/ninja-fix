package wg;

import S8.c;
import com.google.gson.ad;
import com.google.gson.l;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import vg.m;

/* loaded from: classes2.dex */
public final class b implements m {
    public static final MediaType red = MediaType.get("application/json; charset=UTF-8");
    public final l alpha;
    public final ad purple;

    public b(l lVar, ad adVar) {
        this.alpha = lVar;
        this.purple = adVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Tf.k, java.lang.Object] */
    @Override // vg.m
    public final Object bravo(Object obj) {
        ?? obj2 = new Object();
        ad adVar = this.purple;
        c hotel = this.alpha.hotel(new OutputStreamWriter(obj2.z(), StandardCharsets.UTF_8));
        adVar.write(hotel, obj);
        hotel.close();
        return RequestBody.create(red, obj2.november(obj2.purple));
    }
}
