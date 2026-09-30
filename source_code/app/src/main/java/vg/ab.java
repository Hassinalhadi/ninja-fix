package vg;

import java.util.Objects;
import okhttp3.FormBody;

/* loaded from: classes2.dex */
public final class ab extends A {
    public final /* synthetic */ int delta;
    public final String echo;
    public final C3222a foxtrot;
    public final boolean golf;

    public ab(String str, int i4, boolean z2) {
        this.delta = i4;
        switch (i4) {
            case 1:
                C3222a c3222a = C3222a.purple;
                Objects.requireNonNull(str, "name == null");
                this.echo = str;
                this.foxtrot = c3222a;
                this.golf = z2;
                return;
            case 2:
                C3222a c3222a2 = C3222a.purple;
                Objects.requireNonNull(str, "name == null");
                this.echo = str;
                this.foxtrot = c3222a2;
                this.golf = z2;
                return;
            default:
                C3222a c3222a3 = C3222a.purple;
                Objects.requireNonNull(str, "name == null");
                this.echo = str;
                this.foxtrot = c3222a3;
                this.golf = z2;
                return;
        }
    }

    @Override // vg.A
    public final void alpha(an anVar, Object obj) {
        switch (this.delta) {
            case 0:
                if (obj != null) {
                    this.foxtrot.getClass();
                    String obj2 = obj.toString();
                    if (obj2 != null) {
                        FormBody.Builder builder = anVar.juliet;
                        String str = this.echo;
                        if (this.golf) {
                            builder.addEncoded(str, obj2);
                            return;
                        } else {
                            builder.add(str, obj2);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                if (obj != null) {
                    this.foxtrot.getClass();
                    String obj3 = obj.toString();
                    if (obj3 != null) {
                        anVar.alpha(this.echo, obj3, this.golf);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (obj != null) {
                    this.foxtrot.getClass();
                    String obj4 = obj.toString();
                    if (obj4 != null) {
                        anVar.bravo(this.echo, obj4, this.golf);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
