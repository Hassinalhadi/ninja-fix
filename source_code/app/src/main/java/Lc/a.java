package Lc;

import Nc.k;
import av.q;
import com.clevertap.android.sdk.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import t3.h;

/* loaded from: classes2.dex */
public final class a implements Mc.a {
    public final h alpha;

    public a(h service) {
        Intrinsics.echo(service, "service");
        this.alpha = service;
    }

    public final Object alpha(String str, String str2, List list, k kVar) {
        RequestBody.Companion companion = RequestBody.INSTANCE;
        MultipartBody.Part[] partArr = null;
        RequestBody create$default = RequestBody.Companion.create$default(companion, str, (MediaType) null, 1, (Object) null);
        RequestBody create$default2 = RequestBody.Companion.create$default(companion, str2, (MediaType) null, 1, (Object) null);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str3 = (String) obj;
                arrayList.add(MultipartBody.Part.INSTANCE.createFormData(q.delta(i4, "attachments[", Constants.AES_SUFFIX), new File(str3).getName(), RequestBody.INSTANCE.create(new File(str3), MediaType.INSTANCE.parse("image/*"))));
                i4 = i5;
            }
            partArr = (MultipartBody.Part[]) arrayList.toArray(new MultipartBody.Part[0]);
        }
        if (partArr == null) {
            partArr = new MultipartBody.Part[0];
        }
        return this.alpha.alpha(create$default, create$default2, partArr, kVar);
    }
}
