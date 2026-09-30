package d2;

import Y1.aq;
import ao.ad;
import com.google.android.gms.measurement.internal.C1473v;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import s6.AbstractC2796v6;

/* renamed from: d2.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1583h extends AbstractC2796v6 {
    public final KSerializer bravo;
    public final LinkedHashMap charlie;
    public final C1473v delta = kotlinx.serialization.modules.a.alpha;
    public final LinkedHashMap echo = new LinkedHashMap();
    public int foxtrot = -1;

    public C1583h(KSerializer kSerializer, LinkedHashMap linkedHashMap) {
        this.bravo = kSerializer;
        this.charlie = linkedHashMap;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final C1473v bravo() {
        return this.delta;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void delta() {
        zulu(null);
    }

    @Override // s6.AbstractC2796v6, kotlinx.serialization.encoding.Encoder
    public final Encoder november(SerialDescriptor descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
        if (AbstractC1579d.foxtrot(descriptor)) {
            this.foxtrot = 0;
        }
        return this;
    }

    @Override // s6.AbstractC2796v6, kotlinx.serialization.encoding.Encoder
    public final void oscar(KSerializer serializer, Object obj) {
        Intrinsics.echo(serializer, "serializer");
        zulu(obj);
    }

    @Override // s6.AbstractC2796v6
    public final void tango(SerialDescriptor descriptor, int i4) {
        Intrinsics.echo(descriptor, "descriptor");
        this.foxtrot = i4;
    }

    @Override // s6.AbstractC2796v6
    public final void yankee(Object value) {
        Intrinsics.echo(value, "value");
        zulu(value);
    }

    public final void zulu(Object obj) {
        List juliet;
        String sierra = this.bravo.getDescriptor().sierra(this.foxtrot);
        aq aqVar = (aq) this.charlie.get(sierra);
        if (aqVar != null) {
            if (aqVar instanceof Y1.f) {
                juliet = ((Y1.f) aqVar).hotel(obj);
            } else {
                juliet = ab.juliet(aqVar.foxtrot(obj));
            }
            this.echo.put(sierra, juliet);
            return;
        }
        throw new IllegalStateException(ad.gray("Cannot find NavType for argument ", sierra, ". Please provide NavType through typeMap.").toString());
    }
}
