package sd;

import io.ktor.http.IllegalHeaderNameException;
import io.ktor.http.IllegalHeaderValueException;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class n extends G3.a {
    @Override // G3.a
    public final void U(String name) {
        Intrinsics.echo(name, "name");
        List list = q.alpha;
        int i4 = 0;
        int i5 = 0;
        while (i4 < name.length()) {
            char charAt = name.charAt(i4);
            int i10 = i5 + 1;
            if (Intrinsics.golf(charAt, 32) > 0 && !StringsKt.black("\"(),/:;<=>?@[\\]{}", charAt)) {
                i4++;
                i5 = i10;
            } else {
                throw new IllegalHeaderNameException(name, i5);
            }
        }
    }

    @Override // G3.a
    public final void V(String value) {
        Intrinsics.echo(value, "value");
        List list = q.alpha;
        int i4 = 0;
        int i5 = 0;
        while (i4 < value.length()) {
            char charAt = value.charAt(i4);
            int i10 = i5 + 1;
            if (Intrinsics.golf(charAt, 32) < 0 && charAt != '\t') {
                throw new IllegalHeaderValueException(value, i5);
            }
            i4++;
            i5 = i10;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [zd.r, sd.o] */
    public final o X() {
        Map values = (Map) this.alpha;
        Intrinsics.echo(values, "values");
        return new zd.r(values);
    }
}
