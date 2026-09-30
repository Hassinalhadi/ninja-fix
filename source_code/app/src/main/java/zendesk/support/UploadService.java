package zendesk.support;

import okhttp3.RequestBody;
import vg.d;
import yg.a;
import yg.b;
import yg.o;
import yg.s;
import yg.t;

/* loaded from: classes.dex */
interface UploadService {
    @b("/api/mobile/uploads/{token}.json")
    d<Void> deleteAttachment(@s("token") String str);

    @o("/api/mobile/uploads.json")
    d<UploadResponseWrapper> uploadAttachment(@t("filename") String str, @a RequestBody requestBody);
}
