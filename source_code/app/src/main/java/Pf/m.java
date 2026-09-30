package Pf;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.internal.C1473v;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import okhttp3.internal.http2.Settings;
import pe.AbstractC2327c;
import s6.AbstractC2760r6;
import s6.AbstractC2787u6;

/* loaded from: classes2.dex */
public final class m extends AbstractC2787u6 {
    public final a alpha;
    public final C1473v bravo;

    public m(a aVar, Of.d json) {
        Intrinsics.echo(json, "json");
        this.alpha = aVar;
        this.bravo = json.bravo;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033 A[Catch: IllegalArgumentException -> 0x003a, TryCatch #0 {IllegalArgumentException -> 0x003a, blocks: (B:3:0x0007, B:5:0x0014, B:8:0x0029, B:10:0x0033, B:13:0x0036, B:14:0x0039), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036 A[Catch: IllegalArgumentException -> 0x003a, TryCatch #0 {IllegalArgumentException -> 0x003a, blocks: (B:3:0x0007, B:5:0x0014, B:8:0x0029, B:10:0x0033, B:13:0x0036, B:14:0x0039), top: B:2:0x0007 }] */
    @Override // s6.AbstractC2787u6, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final short azure() {
        kotlin.s sVar;
        a aVar = this.alpha;
        String lima = aVar.lima();
        try {
            Intrinsics.echo(lima, "<this>");
            UInt delta = AbstractC2760r6.delta(10, lima);
            if (delta != null) {
                int m210constructorimpl = UInt.m210constructorimpl(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                int i4 = delta.alpha;
                if (Integer.compare(i4 ^ RecyclerView.UNDEFINED_DURATION, m210constructorimpl ^ RecyclerView.UNDEFINED_DURATION) <= 0) {
                    sVar = new kotlin.s((short) i4);
                    if (sVar == null) {
                        return sVar.alpha;
                    }
                    kotlin.text.r.kilo(lima);
                    throw null;
                }
            }
            sVar = null;
            if (sVar == null) {
            }
        } catch (IllegalArgumentException unused) {
            a.romeo(aVar, AbstractC2327c.victor('\'', "Failed to parse type 'UShort' for input '", lima), 0, null, 6);
            throw null;
        }
    }

    @Override // Mf.a
    public final C1473v bravo() {
        return this.bravo;
    }

    @Override // s6.AbstractC2787u6, kotlinx.serialization.encoding.Decoder
    public final int juliet() {
        a aVar = this.alpha;
        String lima = aVar.lima();
        try {
            Intrinsics.echo(lima, "<this>");
            UInt delta = AbstractC2760r6.delta(10, lima);
            if (delta != null) {
                return delta.alpha;
            }
            kotlin.text.r.kilo(lima);
            throw null;
        } catch (IllegalArgumentException unused) {
            a.romeo(aVar, AbstractC2327c.victor('\'', "Failed to parse type 'UInt' for input '", lima), 0, null, 6);
            throw null;
        }
    }

    @Override // s6.AbstractC2787u6, kotlinx.serialization.encoding.Decoder
    public final long november() {
        a aVar = this.alpha;
        String lima = aVar.lima();
        try {
            Intrinsics.echo(lima, "<this>");
            kotlin.p echo = AbstractC2760r6.echo(lima);
            if (echo != null) {
                return echo.alpha;
            }
            kotlin.text.r.kilo(lima);
            throw null;
        } catch (IllegalArgumentException unused) {
            a.romeo(aVar, AbstractC2327c.victor('\'', "Failed to parse type 'ULong' for input '", lima), 0, null, 6);
            throw null;
        }
    }

    @Override // Mf.a
    public final int sierra(SerialDescriptor descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035 A[Catch: IllegalArgumentException -> 0x003c, TryCatch #0 {IllegalArgumentException -> 0x003c, blocks: (B:3:0x0007, B:5:0x0014, B:8:0x0028, B:10:0x0035, B:13:0x0038, B:14:0x003b), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[Catch: IllegalArgumentException -> 0x003c, TryCatch #0 {IllegalArgumentException -> 0x003c, blocks: (B:3:0x0007, B:5:0x0014, B:8:0x0028, B:10:0x0035, B:13:0x0038, B:14:0x003b), top: B:2:0x0007 }] */
    @Override // s6.AbstractC2787u6, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte xray() {
        UByte uByte;
        a aVar = this.alpha;
        String lima = aVar.lima();
        try {
            Intrinsics.echo(lima, "<this>");
            UInt delta = AbstractC2760r6.delta(10, lima);
            if (delta != null) {
                int m210constructorimpl = UInt.m210constructorimpl(255);
                int i4 = delta.alpha;
                if (Integer.compare(i4 ^ RecyclerView.UNDEFINED_DURATION, m210constructorimpl ^ RecyclerView.UNDEFINED_DURATION) <= 0) {
                    uByte = UByte.m208boximpl(UByte.m209constructorimpl((byte) i4));
                    if (uByte == null) {
                        return uByte.alpha;
                    }
                    kotlin.text.r.kilo(lima);
                    throw null;
                }
            }
            uByte = null;
            if (uByte == null) {
            }
        } catch (IllegalArgumentException unused) {
            a.romeo(aVar, AbstractC2327c.victor('\'', "Failed to parse type 'UByte' for input '", lima), 0, null, 6);
            throw null;
        }
    }
}
