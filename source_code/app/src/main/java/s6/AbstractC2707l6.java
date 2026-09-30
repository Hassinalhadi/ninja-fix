package s6;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: s6.l6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2707l6 {
    public static final Nf.G alpha(String str) {
        Lf.e eVar = Lf.e.juliet;
        if (!StringsKt.gray(str)) {
            Object it = ((Ld.i) Nf.H.alpha.values()).iterator();
            while (((Ld.f) it).hasNext()) {
                KSerializer kSerializer = (KSerializer) ((Ld.d) it).next();
                if (Intrinsics.areEqual(str, kSerializer.getDescriptor().oscar())) {
                    StringBuilder victor = Q0.c.victor("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                    victor.append(kotlin.jvm.internal.u.alpha.bravo(kSerializer.getClass()).kilo());
                    victor.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                    throw new IllegalArgumentException(kotlin.text.n.charlie(victor.toString()));
                }
            }
            return new Nf.G(str, eVar);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    public static final Lf.g bravo(String str, SerialDescriptor[] serialDescriptorArr, Function1 function1) {
        if (!StringsKt.gray(str)) {
            Lf.a aVar = new Lf.a(str);
            function1.invoke(aVar);
            return new Lf.g(str, Lf.l.bravo, aVar.charlie.size(), ArraysKt.b(serialDescriptorArr), aVar);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    public static final Lf.g charlie(String serialName, AbstractC2716m6 abstractC2716m6, SerialDescriptor[] serialDescriptorArr, Function1 function1) {
        Intrinsics.echo(serialName, "serialName");
        if (!StringsKt.gray(serialName)) {
            if (!Intrinsics.areEqual(abstractC2716m6, Lf.l.bravo)) {
                Lf.a aVar = new Lf.a(serialName);
                function1.invoke(aVar);
                return new Lf.g(serialName, abstractC2716m6, aVar.charlie.size(), ArraysKt.b(serialDescriptorArr), aVar);
            }
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    public static Lf.g delta(String serialName, AbstractC2716m6 abstractC2716m6, SerialDescriptor[] serialDescriptorArr) {
        Intrinsics.echo(serialName, "serialName");
        if (!StringsKt.gray(serialName)) {
            if (!Intrinsics.areEqual(abstractC2716m6, Lf.l.bravo)) {
                Lf.a aVar = new Lf.a(serialName);
                return new Lf.g(serialName, abstractC2716m6, aVar.charlie.size(), ArraysKt.b(serialDescriptorArr), aVar);
            }
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    public static final long echo(InputStream inputStream, OutputStream outputStream) {
        Intrinsics.echo(inputStream, "<this>");
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        long j5 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j5 += read;
            read = inputStream.read(bArr);
        }
        return j5;
    }

    public static final byte[] foxtrot(InputStream inputStream) {
        Intrinsics.echo(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        echo(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.delta(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
