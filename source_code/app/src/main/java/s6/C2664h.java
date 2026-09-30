package s6;

import java.util.Arrays;

/* renamed from: s6.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2664h {
    public final /* synthetic */ int alpha = 1;
    public Object bravo;
    public Object charlie;
    public Object delta;

    public /* synthetic */ C2664h() {
    }

    public String toString() {
        switch (this.alpha) {
            case 0:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.bravo);
                sb2.append('{');
                gd.a aVar = (gd.a) ((gd.a) this.charlie).red;
                String str = "";
                while (aVar != null) {
                    Object obj = aVar.purple;
                    sb2.append(str);
                    if (obj != null && obj.getClass().isArray()) {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    aVar = (gd.a) aVar.red;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public C2664h(String str) {
        gd.a aVar = new gd.a(8);
        this.charlie = aVar;
        this.delta = aVar;
        this.bravo = str;
    }
}
