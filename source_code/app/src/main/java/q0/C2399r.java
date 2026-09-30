package q0;

import java.io.Serializable;
import kotlin.collections.ArraysKt;
import pe.AbstractC2327c;

/* renamed from: q0.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2399r {
    public final /* synthetic */ int alpha;
    public final C2398q bravo;
    public final C2398q charlie;
    public final C2398q delta;
    public final C2398q echo;
    public final Serializable foxtrot;

    public C2399r(String str) {
        this.alpha = 1;
        this.foxtrot = str;
        this.bravo = new C2398q(1, null);
        this.charlie = new C2398q(0, null);
        this.delta = new C2398q(1, null);
        this.echo = new C2398q(0, null);
    }

    public final C2398q alpha() {
        switch (this.alpha) {
            case 0:
                return this.echo;
            default:
                return this.echo;
        }
    }

    public final C2398q bravo() {
        switch (this.alpha) {
            case 0:
                return this.bravo;
            default:
                return this.bravo;
        }
    }

    public final C2398q charlie() {
        switch (this.alpha) {
            case 0:
                return this.delta;
            default:
                return this.delta;
        }
    }

    public final C2398q delta() {
        switch (this.alpha) {
            case 0:
                return this.charlie;
            default:
                return this.charlie;
        }
    }

    public final String toString() {
        switch (this.alpha) {
            case 0:
                return ArraysKt.magenta((C2399r[]) this.foxtrot, null, "innermostOf(", ")", null, 57);
            default:
                String str = (String) this.foxtrot;
                if (str != null) {
                    return AbstractC2327c.victor(')', "RectRulers(", str);
                }
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2399r(C2399r[] c2399rArr) {
        this.alpha = 0;
        this.foxtrot = c2399rArr;
        int length = c2399rArr.length;
        C2398q[] c2398qArr = new C2398q[length];
        for (int i4 = 0; i4 < length; i4++) {
            c2398qArr[i4] = ((C2399r[]) this.foxtrot)[i4].bravo();
        }
        this.bravo = new C2398q(1, new S(c2398qArr, 0));
        int length2 = ((C2399r[]) this.foxtrot).length;
        C2398q[] c2398qArr2 = new C2398q[length2];
        for (int i5 = 0; i5 < length2; i5++) {
            c2398qArr2[i5] = ((C2399r[]) this.foxtrot)[i5].delta();
        }
        this.charlie = new C2398q(0, new C2397p(c2398qArr2, 0));
        int length3 = ((C2399r[]) this.foxtrot).length;
        C2398q[] c2398qArr3 = new C2398q[length3];
        for (int i10 = 0; i10 < length3; i10++) {
            c2398qArr3[i10] = ((C2399r[]) this.foxtrot)[i10].charlie();
        }
        this.delta = new C2398q(1, new S(c2398qArr3, 1));
        int length4 = ((C2399r[]) this.foxtrot).length;
        C2398q[] c2398qArr4 = new C2398q[length4];
        for (int i11 = 0; i11 < length4; i11++) {
            c2398qArr4[i11] = ((C2399r[]) this.foxtrot)[i11].alpha();
        }
        this.echo = new C2398q(0, new C2397p(c2398qArr4, 1));
    }
}
