package Nf;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import t6.AbstractC3057t;

/* loaded from: classes2.dex */
public final class f0 implements KSerializer {
    public static final f0 alpha = new Object();
    public static final G bravo = new G("kotlin.uuid.Uuid", Lf.e.juliet);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        String concat;
        String uuidString = decoder.mike();
        Intrinsics.echo(uuidString, "uuidString");
        int length = uuidString.length();
        rf.b bVar = rf.b.red;
        if (length != 32) {
            if (length != 36) {
                StringBuilder sb2 = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (uuidString.length() <= 64) {
                    concat = uuidString;
                } else {
                    String substring = uuidString.substring(0, 64);
                    Intrinsics.delta(substring, "substring(...)");
                    concat = substring.concat("...");
                }
                sb2.append(concat);
                sb2.append("\" of length ");
                sb2.append(uuidString.length());
                throw new IllegalArgumentException(sb2.toString());
            }
            long bravo2 = kotlin.text.d.bravo(0, 8, uuidString);
            AbstractC3057t.alpha(8, uuidString);
            long bravo3 = kotlin.text.d.bravo(9, 13, uuidString);
            AbstractC3057t.alpha(13, uuidString);
            long bravo4 = kotlin.text.d.bravo(14, 18, uuidString);
            AbstractC3057t.alpha(18, uuidString);
            long bravo5 = kotlin.text.d.bravo(19, 23, uuidString);
            AbstractC3057t.alpha(23, uuidString);
            long j5 = (bravo3 << 16) | (bravo2 << 32) | bravo4;
            long bravo6 = kotlin.text.d.bravo(24, 36, uuidString) | (bravo5 << 48);
            if (j5 != 0 || bravo6 != 0) {
                return new rf.b(j5, bravo6);
            }
        } else {
            long bravo7 = kotlin.text.d.bravo(0, 16, uuidString);
            long bravo8 = kotlin.text.d.bravo(16, 32, uuidString);
            if (bravo7 != 0 || bravo8 != 0) {
                return new rf.b(bravo7, bravo8);
            }
        }
        return bVar;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return bravo;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        rf.b value = (rf.b) obj;
        Intrinsics.echo(value, "value");
        encoder.romeo(value.toString());
    }
}
