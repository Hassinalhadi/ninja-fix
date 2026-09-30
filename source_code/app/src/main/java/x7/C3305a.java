package x7;

import A7.q;
import com.google.crypto.tink.shaded.protobuf.AbstractC1490h;
import com.google.crypto.tink.shaded.protobuf.C1489g;
import com.google.crypto.tink.shaded.protobuf.ao;
import com.google.crypto.tink.shaded.protobuf.p;
import java.security.GeneralSecurityException;
import t7.f;
import z7.C3469a;
import z7.C3470b;
import z7.C3472d;
import z7.C3473e;

/* renamed from: x7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3305a extends G3.a {
    @Override // G3.a
    public final Object I(ao aoVar) {
        C3472d c3472d = (C3472d) aoVar;
        C3469a sierra = C3470b.sierra();
        sierra.charlie();
        C3470b.mike((C3470b) sierra.purple);
        byte[] alpha = q.alpha(c3472d.mike());
        C1489g delta = AbstractC1490h.delta(alpha, 0, alpha.length);
        sierra.charlie();
        C3470b.november((C3470b) sierra.purple, delta);
        C3473e november = c3472d.november();
        sierra.charlie();
        C3470b.oscar((C3470b) sierra.purple, november);
        return (C3470b) sierra.alpha();
    }

    @Override // G3.a
    public final ao P(AbstractC1490h abstractC1490h) {
        return C3472d.oscar(abstractC1490h, p.alpha());
    }

    @Override // G3.a
    public final void T(ao aoVar) {
        C3472d c3472d = (C3472d) aoVar;
        f.november(c3472d.november());
        if (c3472d.mike() == 32) {
        } else {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
