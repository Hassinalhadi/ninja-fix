package Nf;

import com.checkout.address.utils.NumberOnlyZipVisualTransformation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: Nf.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0263v implements KSerializer {
    public static final C0263v alpha = new Object();
    public static final G bravo = new G("kotlin.time.Duration", Lf.e.juliet);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        int i4 = kotlin.time.b.silver;
        String value = decoder.mike();
        Intrinsics.echo(value, "value");
        try {
            return new kotlin.time.b(kotlin.time.g.alpha(value));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(ao.ad.gray("Invalid ISO duration string format: '", value, "'."), e);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return bravo;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        long j5;
        int golf;
        int golf2;
        boolean z2;
        boolean z10;
        long j6 = ((kotlin.time.b) obj).alpha;
        int i4 = kotlin.time.b.silver;
        StringBuilder sb2 = new StringBuilder();
        if (j6 < 0) {
            sb2.append(NumberOnlyZipVisualTransformation.HYPHEN);
        }
        sb2.append("PT");
        if (j6 < 0) {
            j5 = kotlin.time.b.hotel(j6);
        } else {
            j5 = j6;
        }
        long golf3 = kotlin.time.b.golf(j5, kotlin.time.d.yellow);
        boolean z11 = false;
        if (kotlin.time.b.echo(j5)) {
            golf = 0;
        } else {
            golf = (int) (kotlin.time.b.golf(j5, kotlin.time.d.white) % 60);
        }
        if (kotlin.time.b.echo(j5)) {
            golf2 = 0;
        } else {
            golf2 = (int) (kotlin.time.b.golf(j5, kotlin.time.d.teal) % 60);
        }
        int delta = kotlin.time.b.delta(j5);
        if (kotlin.time.b.echo(j6)) {
            golf3 = 9999999999999L;
        }
        if (golf3 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (golf2 == 0 && delta == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (golf != 0 || (z10 && z2)) {
            z11 = true;
        }
        if (z2) {
            sb2.append(golf3);
            sb2.append('H');
        }
        if (z11) {
            sb2.append(golf);
            sb2.append('M');
        }
        if (z10 || (!z2 && !z11)) {
            kotlin.time.b.bravo(sb2, golf2, delta, 9, "S", true);
        }
        encoder.romeo(sb2.toString());
    }
}
