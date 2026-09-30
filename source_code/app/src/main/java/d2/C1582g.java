package d2;

import Y1.aq;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.C1473v;
import com.google.android.material.internal.ab;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import s6.AbstractC2787u6;

/* renamed from: d2.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1582g extends AbstractC2787u6 {
    public final ab alpha;
    public int bravo = -1;
    public String charlie = "";
    public final C1473v delta = kotlinx.serialization.modules.a.alpha;

    public C1582g(Bundle bundle, LinkedHashMap linkedHashMap) {
        this.alpha = new ab(1, bundle, linkedHashMap);
    }

    @Override // Mf.a
    public final C1473v bravo() {
        return this.delta;
    }

    @Override // s6.AbstractC2787u6
    public final Object coral() {
        return crimson();
    }

    public final Object crimson() {
        Object obj;
        String key = this.charlie;
        ab abVar = this.alpha;
        abVar.getClass();
        Intrinsics.echo(key, "key");
        aq aqVar = (aq) ((LinkedHashMap) abVar.red).get(key);
        if (aqVar != null) {
            obj = aqVar.alpha((Bundle) abVar.purple, key);
        } else {
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException(("Unexpected null value for non-nullable argument " + this.charlie).toString());
    }

    @Override // s6.AbstractC2787u6, kotlinx.serialization.encoding.Decoder
    public final boolean quebec() {
        Object obj;
        String key = this.charlie;
        ab abVar = this.alpha;
        abVar.getClass();
        Intrinsics.echo(key, "key");
        aq aqVar = (aq) ((LinkedHashMap) abVar.red).get(key);
        if (aqVar != null) {
            obj = aqVar.alpha((Bundle) abVar.purple, key);
        } else {
            obj = null;
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    @Override // Mf.a
    public final int sierra(SerialDescriptor descriptor) {
        String key;
        ab abVar;
        Intrinsics.echo(descriptor, "descriptor");
        int i4 = this.bravo;
        do {
            i4++;
            if (i4 >= descriptor.romeo()) {
                return -1;
            }
            key = descriptor.sierra(i4);
            abVar = this.alpha;
            abVar.getClass();
            Intrinsics.echo(key, "key");
        } while (!((Bundle) abVar.purple).containsKey(key));
        this.bravo = i4;
        this.charlie = key;
        return i4;
    }

    @Override // s6.AbstractC2787u6, kotlinx.serialization.encoding.Decoder
    public final Object tango(KSerializer deserializer) {
        Intrinsics.echo(deserializer, "deserializer");
        return crimson();
    }

    @Override // s6.AbstractC2787u6, kotlinx.serialization.encoding.Decoder
    public final Decoder victor(SerialDescriptor descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
        if (AbstractC1579d.foxtrot(descriptor)) {
            this.charlie = descriptor.sierra(0);
            this.bravo = 0;
        }
        return this;
    }
}
