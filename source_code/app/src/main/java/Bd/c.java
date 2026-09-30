package Bd;

import Nf.B;
import Nf.ac;
import Nf.aj;
import Nf.ao;
import Nf.az;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2796v6;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements ac {
    public static final c alpha;

    @NotNull
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [Nf.ac, Bd.c, java.lang.Object] */
    static {
        ?? obj = new Object();
        alpha = obj;
        B b2 = new B("io.ktor.util.date.GMTDate", obj, 9);
        b2.bravo("seconds", false);
        b2.bravo("minutes", false);
        b2.bravo("hours", false);
        b2.bravo("dayOfWeek", false);
        b2.bravo("dayOfMonth", false);
        b2.bravo("dayOfYear", false);
        b2.bravo("month", false);
        b2.bravo("year", false);
        b2.bravo("timestamp", false);
        descriptor = b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Nf.ac
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = e.f769c;
        aj ajVar = aj.alpha;
        return new KSerializer[]{ajVar, ajVar, ajVar, lazyArr[3].getValue(), ajVar, ajVar, lazyArr[6].getValue(), ajVar, ao.alpha};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        Mf.a charlie = decoder.charlie(serialDescriptor);
        Lazy[] lazyArr = e.f769c;
        f fVar = null;
        int i4 = 0;
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        g gVar = null;
        long j5 = 0;
        boolean z2 = true;
        while (z2) {
            int sierra = charlie.sierra(serialDescriptor);
            switch (sierra) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    i5 = charlie.kilo(serialDescriptor, 0);
                    i4 |= 1;
                    break;
                case 1:
                    i10 = charlie.kilo(serialDescriptor, 1);
                    i4 |= 2;
                    break;
                case 2:
                    i11 = charlie.kilo(serialDescriptor, 2);
                    i4 |= 4;
                    break;
                case 3:
                    gVar = (g) charlie.whiskey(serialDescriptor, 3, (KSerializer) lazyArr[3].getValue(), gVar);
                    i4 |= 8;
                    break;
                case 4:
                    i12 = charlie.kilo(serialDescriptor, 4);
                    i4 |= 16;
                    break;
                case 5:
                    i13 = charlie.kilo(serialDescriptor, 5);
                    i4 |= 32;
                    break;
                case 6:
                    fVar = (f) charlie.whiskey(serialDescriptor, 6, (KSerializer) lazyArr[6].getValue(), fVar);
                    i4 |= 64;
                    break;
                case 7:
                    i14 = charlie.kilo(serialDescriptor, 7);
                    i4 |= 128;
                    break;
                case 8:
                    j5 = charlie.golf(serialDescriptor, 8);
                    i4 |= Barcode.FORMAT_QR_CODE;
                    break;
                default:
                    throw new UnknownFieldException(sierra);
            }
        }
        charlie.alpha(serialDescriptor);
        return new e(i4, i5, i10, i11, gVar, i12, i13, fVar, i14, j5);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        e value = (e) obj;
        Intrinsics.echo(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Mf.b charlie = encoder.charlie(serialDescriptor);
        AbstractC2796v6 abstractC2796v6 = (AbstractC2796v6) charlie;
        abstractC2796v6.victor(0, value.alpha, serialDescriptor);
        abstractC2796v6.victor(1, value.purple, serialDescriptor);
        abstractC2796v6.victor(2, value.red, serialDescriptor);
        Lazy[] lazyArr = e.f769c;
        abstractC2796v6.whiskey(serialDescriptor, 3, (KSerializer) lazyArr[3].getValue(), value.silver);
        abstractC2796v6.victor(4, value.teal, serialDescriptor);
        abstractC2796v6.victor(5, value.white, serialDescriptor);
        abstractC2796v6.whiskey(serialDescriptor, 6, (KSerializer) lazyArr[6].getValue(), value.yellow);
        abstractC2796v6.victor(7, value.f770a, serialDescriptor);
        abstractC2796v6.tango(serialDescriptor, 8);
        abstractC2796v6.papa(value.f771b);
        charlie.alpha(serialDescriptor);
    }

    @Override // Nf.ac
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return az.bravo;
    }
}
