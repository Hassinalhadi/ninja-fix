package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class aa {
    public static final p bravo = new p(1);
    public final Object alpha;

    public aa(C0602i c0602i) {
        u.alpha(c0602i, "output");
        this.alpha = c0602i;
        c0602i.alpha = this;
    }

    public void alpha(int i4, Object obj, as asVar) {
        C0602i c0602i = (C0602i) this.alpha;
        c0602i.beige(i4, 3);
        asVar.echo((ah) obj, c0602i.alpha);
        c0602i.beige(i4, 4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.z, java.lang.Object] */
    public aa() {
        ap apVar = ap.charlie;
        Object obj = bravo;
        try {
            obj = (ag) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
        }
        ag[] agVarArr = {p.bravo, obj};
        ?? obj2 = new Object();
        obj2.alpha = agVarArr;
        Charset charset = u.alpha;
        this.alpha = obj2;
    }
}
