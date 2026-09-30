package vg;

import okhttp3.MultipartBody;

/* loaded from: classes2.dex */
public final class ah extends A {
    public static final ah delta = new Object();

    @Override // vg.A
    public final void alpha(an anVar, Object obj) {
        MultipartBody.Part part = (MultipartBody.Part) obj;
        if (part != null) {
            anVar.india.addPart(part);
        }
    }
}
