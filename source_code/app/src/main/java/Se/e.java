package Se;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.y;
import me.AbstractC2120h;
import pe.InterfaceC2349y;

/* loaded from: classes2.dex */
public final class e extends n {
    @Override // Se.g
    public final y alpha(InterfaceC2349y module) {
        Intrinsics.echo(module, "module");
        AbstractC2120h juliet = module.juliet();
        juliet.getClass();
        return juliet.romeo(me.j.CHAR);
    }

    @Override // Se.g
    public final String toString() {
        String str;
        Object obj = this.alpha;
        Integer valueOf = Integer.valueOf(((Character) obj).charValue());
        char charValue = ((Character) obj).charValue();
        if (charValue == '\b') {
            str = "\\b";
        } else if (charValue == '\t') {
            str = "\\t";
        } else if (charValue == '\n') {
            str = "\\n";
        } else if (charValue == '\f') {
            str = "\\f";
        } else if (charValue == '\r') {
            str = "\\r";
        } else {
            byte type = (byte) Character.getType(charValue);
            if (type != 0 && type != 13 && type != 14 && type != 15 && type != 16 && type != 18 && type != 19) {
                str = String.valueOf(charValue);
            } else {
                str = "?";
            }
        }
        return String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{valueOf, str}, 2));
    }
}
