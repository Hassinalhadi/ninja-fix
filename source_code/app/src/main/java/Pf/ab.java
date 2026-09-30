package Pf;

import Nf.AbstractC0244b;
import Nf.C0264w;
import com.google.android.gms.measurement.internal.C1473v;
import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import pe.AbstractC2327c;
import s6.AbstractC2787u6;
import s6.S5;

/* loaded from: classes2.dex */
public final class ab extends AbstractC2787u6 implements Of.l {
    public final Of.d alpha;
    public final ag bravo;
    public final a charlie;
    public final C1473v delta;
    public int echo;
    public Af.t foxtrot;
    public final Of.k golf;
    public final o hotel;

    public ab(Of.d dVar, ag agVar, a aVar, SerialDescriptor descriptor, Af.t tVar) {
        o oVar;
        Intrinsics.echo(descriptor, "descriptor");
        this.alpha = dVar;
        this.bravo = agVar;
        this.charlie = aVar;
        this.delta = dVar.bravo;
        this.echo = -1;
        this.foxtrot = tVar;
        Of.k kVar = dVar.alpha;
        this.golf = kVar;
        if (kVar.echo) {
            oVar = null;
        } else {
            oVar = new o(descriptor);
        }
        this.hotel = oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (Pf.r.kilo(r1, r6) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (sierra(r6) != (-1)) goto L20;
     */
    @Override // s6.AbstractC2787u6, Mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void alpha(SerialDescriptor descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
        int romeo = descriptor.romeo();
        Of.d dVar = this.alpha;
        if (romeo == 0) {
        }
        a aVar = this.charlie;
        if (!aVar.azure()) {
            aVar.hotel(this.bravo.purple);
            B0.a aVar2 = aVar.bravo;
            int i4 = aVar2.bravo;
            int[] iArr = (int[]) aVar2.delta;
            if (iArr[i4] == -2) {
                iArr[i4] = -1;
                aVar2.bravo = i4 - 1;
            }
            int i5 = aVar2.bravo;
            if (i5 != -1) {
                aVar2.bravo = i5 - 1;
                return;
            }
            return;
        }
        r.lima(aVar, "");
        throw null;
    }

    @Override // s6.AbstractC2787u6, kotlinx.serialization.encoding.Decoder
    public final short azure() {
        a aVar = this.charlie;
        long india = aVar.india();
        short s3 = (short) india;
        if (india == s3) {
            return s3;
        }
        a.romeo(aVar, "Failed to parse short for input '" + india + '\'', 0, null, 6);
        throw null;
    }

    @Override // s6.AbstractC2787u6, kotlinx.serialization.encoding.Decoder
    public final float beige() {
        a aVar = this.charlie;
        String lima = aVar.lima();
        try {
            float parseFloat = Float.parseFloat(lima);
            if (!this.alpha.alpha.hotel && Math.abs(parseFloat) > Float.MAX_VALUE) {
                r.quebec(aVar, Float.valueOf(parseFloat));
                throw null;
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            a.romeo(aVar, AbstractC2327c.victor('\'', "Failed to parse type 'float' for input '", lima), 0, null, 6);
            throw null;
        }
    }

    @Override // s6.AbstractC2787u6, kotlinx.serialization.encoding.Decoder
    public final double black() {
        a aVar = this.charlie;
        String lima = aVar.lima();
        try {
            double parseDouble = Double.parseDouble(lima);
            if (!this.alpha.alpha.hotel && Math.abs(parseDouble) > Double.MAX_VALUE) {
                r.quebec(aVar, Double.valueOf(parseDouble));
                throw null;
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            a.romeo(aVar, AbstractC2327c.victor('\'', "Failed to parse type 'double' for input '", lima), 0, null, 6);
            throw null;
        }
    }

    @Override // Mf.a
    public final C1473v bravo() {
        return this.delta;
    }

    @Override // s6.AbstractC2787u6, kotlinx.serialization.encoding.Decoder
    public final Mf.a charlie(SerialDescriptor descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
        Of.d dVar = this.alpha;
        ag papa = r.papa(dVar, descriptor);
        a aVar = this.charlie;
        B0.a aVar2 = aVar.bravo;
        int i4 = aVar2.bravo + 1;
        aVar2.bravo = i4;
        Object[] objArr = (Object[]) aVar2.charlie;
        if (i4 == objArr.length) {
            int i5 = i4 * 2;
            Object[] copyOf = Arrays.copyOf(objArr, i5);
            Intrinsics.delta(copyOf, "copyOf(...)");
            aVar2.charlie = copyOf;
            int[] copyOf2 = Arrays.copyOf((int[]) aVar2.delta, i5);
            Intrinsics.delta(copyOf2, "copyOf(...)");
            aVar2.delta = copyOf2;
        }
        ((Object[]) aVar2.charlie)[i4] = descriptor;
        aVar.hotel(papa.alpha);
        if (aVar.whiskey() != 4) {
            int ordinal = papa.ordinal();
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                if (this.bravo == papa && dVar.alpha.echo) {
                    return this;
                }
                return new ab(dVar, papa, aVar, descriptor, this.foxtrot);
            }
            return new ab(dVar, papa, aVar, descriptor, this.foxtrot);
        }
        a.romeo(aVar, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // s6.AbstractC2787u6, kotlinx.serialization.encoding.Decoder
    public final boolean delta() {
        boolean z2;
        boolean z10;
        a aVar = this.charlie;
        int zulu = aVar.zulu();
        if (zulu != aVar.tango().length()) {
            if (aVar.tango().charAt(zulu) == '\"') {
                zulu++;
                z2 = true;
            } else {
                z2 = false;
            }
            int yankee = aVar.yankee(zulu);
            if (yankee < aVar.tango().length() && yankee != -1) {
                int i4 = yankee + 1;
                int charAt = aVar.tango().charAt(yankee) | ' ';
                if (charAt != 102) {
                    if (charAt == 116) {
                        aVar.delta(i4, "rue");
                        z10 = true;
                    } else {
                        a.romeo(aVar, "Expected valid boolean literal prefix, but had '" + aVar.lima() + '\'', 0, null, 6);
                        throw null;
                    }
                } else {
                    aVar.delta(i4, "alse");
                    z10 = false;
                }
                if (z2) {
                    if (aVar.alpha != aVar.tango().length()) {
                        if (aVar.tango().charAt(aVar.alpha) == '\"') {
                            aVar.alpha++;
                            return z10;
                        }
                        a.romeo(aVar, "Expected closing quotation mark", 0, null, 6);
                        throw null;
                    }
                    a.romeo(aVar, "EOF", 0, null, 6);
                    throw null;
                }
                return z10;
            }
            a.romeo(aVar, "EOF", 0, null, 6);
            throw null;
        }
        a.romeo(aVar, "EOF", 0, null, 6);
        throw null;
    }

    @Override // s6.AbstractC2787u6, kotlinx.serialization.encoding.Decoder
    public final char echo() {
        a aVar = this.charlie;
        String lima = aVar.lima();
        if (lima.length() == 1) {
            return lima.charAt(0);
        }
        a.romeo(aVar, AbstractC2327c.victor('\'', "Expected single char, but got '", lima), 0, null, 6);
        throw null;
    }

    @Override // s6.AbstractC2787u6, kotlinx.serialization.encoding.Decoder
    public final int foxtrot(SerialDescriptor enumDescriptor) {
        Intrinsics.echo(enumDescriptor, "enumDescriptor");
        return r.juliet(enumDescriptor, this.alpha, mike(), " at path " + this.charlie.bravo.echo());
    }

    @Override // Of.l
    public final Of.n india() {
        return new Fe.d(this.alpha.alpha, this.charlie).delta();
    }

    @Override // s6.AbstractC2787u6, kotlinx.serialization.encoding.Decoder
    public final int juliet() {
        a aVar = this.charlie;
        long india = aVar.india();
        int i4 = (int) india;
        if (india == i4) {
            return i4;
        }
        a.romeo(aVar, "Failed to parse int for input '" + india + '\'', 0, null, 6);
        throw null;
    }

    @Override // s6.AbstractC2787u6, kotlinx.serialization.encoding.Decoder
    public final String mike() {
        Of.k kVar = this.golf;
        a aVar = this.charlie;
        if (kVar.charlie) {
            return aVar.mike();
        }
        return aVar.juliet();
    }

    @Override // s6.AbstractC2787u6, kotlinx.serialization.encoding.Decoder
    public final long november() {
        return this.charlie.india();
    }

    @Override // s6.AbstractC2787u6, kotlinx.serialization.encoding.Decoder
    public final boolean quebec() {
        boolean z2;
        o oVar = this.hotel;
        if (oVar != null) {
            z2 = oVar.bravo;
        } else {
            z2 = false;
        }
        if (!z2) {
            a aVar = this.charlie;
            int yankee = aVar.yankee(aVar.zulu());
            int length = aVar.tango().length() - yankee;
            boolean z10 = false;
            if (length >= 4 && yankee != -1) {
                int i4 = 0;
                while (true) {
                    if (i4 < 4) {
                        if (BuildConfig.TRAVIS.charAt(i4) != aVar.tango().charAt(yankee + i4)) {
                            break;
                        }
                        i4++;
                    } else if (length <= 4 || r.golf(aVar.tango().charAt(yankee + 4)) != 0) {
                        aVar.alpha = yankee + 4;
                        z10 = true;
                    }
                }
            }
            if (!z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f2, code lost:
    
        r1 = r13.bravo;
        r2 = (int[]) r13.delta;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fb, code lost:
    
        if (r2[r1] != (-2)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fd, code lost:
    
        r2[r1] = -1;
        r13.bravo = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0102, code lost:
    
        r1 = r13.bravo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0104, code lost:
    
        if (r1 == (-1)) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0106, code lost:
    
        r13.bravo = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0109, code lost:
    
        r1 = kotlin.text.StringsKt.indigo(6, r5.amber(0, r5.alpha), r3);
        r3 = androidx.appcompat.widget.P0.green("Encountered an unknown key '", r3, "' at offset ", " at path: ", r1);
        r3.append(r13.echo());
        r3.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
        r3.append((java.lang.Object) Pf.r.mike(r5.tango(), r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013e, code lost:
    
        throw new kotlinx.serialization.json.internal.JsonDecodingException(r3.toString());
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int sierra(SerialDescriptor descriptor) {
        String echo;
        char c3;
        Object[] objArr;
        Intrinsics.echo(descriptor, "descriptor");
        ag agVar = this.bravo;
        int ordinal = agVar.ordinal();
        Of.d dVar = this.alpha;
        a aVar = this.charlie;
        byte b2 = 1;
        int i4 = -1;
        int i5 = 0;
        r9 = false;
        boolean z2 = false;
        char c4 = ':';
        B0.a aVar2 = aVar.bravo;
        if (ordinal != 0) {
            if (ordinal != 2) {
                boolean azure = aVar.azure();
                if (aVar.charlie()) {
                    int i10 = this.echo;
                    if (i10 != -1 && !azure) {
                        a.romeo(aVar, "Expected end of the array or comma", 0, null, 6);
                        throw null;
                    }
                    i4 = i10 + 1;
                    this.echo = i4;
                } else if (azure) {
                    r.lima(aVar, "array");
                    throw null;
                }
            } else {
                int i11 = this.echo;
                if (i11 % 2 != 0) {
                    objArr = true;
                } else {
                    objArr = false;
                }
                if (objArr != false) {
                    if (i11 != -1) {
                        z2 = aVar.azure();
                    }
                } else {
                    aVar.hotel(':');
                }
                if (aVar.charlie()) {
                    if (objArr != false) {
                        if (this.echo == -1) {
                            int i12 = aVar.alpha;
                            if (z2) {
                                a.romeo(aVar, "Unexpected leading comma", i12, null, 4);
                                throw null;
                            }
                        } else {
                            int i13 = aVar.alpha;
                            if (!z2) {
                                a.romeo(aVar, "Expected comma after the key-value pair", i13, null, 4);
                                throw null;
                            }
                        }
                    }
                    i4 = this.echo + 1;
                    this.echo = i4;
                } else if (z2) {
                    r.lima(aVar, "object");
                    throw null;
                }
            }
        } else {
            boolean azure2 = aVar.azure();
            while (true) {
                boolean charlie = aVar.charlie();
                byte b4 = b2;
                o oVar = this.hotel;
                if (charlie) {
                    boolean z10 = this.golf.charlie;
                    if (z10) {
                        echo = aVar.mike();
                    } else {
                        echo = aVar.echo();
                    }
                    aVar.hotel(c4);
                    int india = r.india(descriptor, dVar, echo);
                    if (india != -3) {
                        if (oVar != null) {
                            C0264w c0264w = oVar.alpha;
                            if (india < 64) {
                                c0264w.charlie |= 1 << india;
                            } else {
                                int i14 = (india >>> 6) - 1;
                                long[] jArr = c0264w.delta;
                                jArr[i14] = jArr[i14] | (1 << (india & 63));
                            }
                        }
                        i4 = india;
                    } else {
                        if (!r.kilo(dVar, descriptor)) {
                            Af.t tVar = this.foxtrot;
                            if (tVar == null || !Intrinsics.areEqual(tVar.purple, echo)) {
                                break;
                            }
                            tVar.purple = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte whiskey = aVar.whiskey();
                        if (whiskey == 8 || whiskey == 6) {
                            while (true) {
                                byte whiskey2 = aVar.whiskey();
                                b2 = b4;
                                if (whiskey2 == b2) {
                                    if (z10) {
                                        aVar.lima();
                                    } else {
                                        aVar.echo();
                                    }
                                } else {
                                    c3 = 6;
                                    if (whiskey2 != 8 && whiskey2 != 6) {
                                        if (whiskey2 == 9) {
                                            if (((Number) CollectionsKt.ochre(arrayList)).byteValue() == 8) {
                                                CollectionsKt.f(arrayList);
                                            } else {
                                                throw r.delta(aVar.alpha, aVar.tango(), "found ] instead of } at path: " + aVar2);
                                            }
                                        } else if (whiskey2 == 7) {
                                            if (((Number) CollectionsKt.ochre(arrayList)).byteValue() == 6) {
                                                CollectionsKt.f(arrayList);
                                            } else {
                                                throw r.delta(aVar.alpha, aVar.tango(), "found } instead of ] at path: " + aVar2);
                                            }
                                        } else if (whiskey2 == 10) {
                                            a.romeo(aVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                            throw null;
                                        }
                                        c3 = 6;
                                    } else {
                                        arrayList.add(Byte.valueOf(whiskey2));
                                    }
                                    aVar.foxtrot();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                }
                                b4 = b2;
                            }
                        } else {
                            aVar.lima();
                            b2 = b4;
                            c3 = 6;
                        }
                        azure2 = aVar.azure();
                        c4 = ':';
                    }
                } else if (!azure2) {
                    if (oVar != null) {
                        C0264w c0264w2 = oVar.alpha;
                        SerialDescriptor serialDescriptor = c0264w2.alpha;
                        int romeo = serialDescriptor.romeo();
                        while (true) {
                            long j5 = c0264w2.charlie;
                            n nVar = c0264w2.bravo;
                            if (j5 != -1) {
                                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j5);
                                c0264w2.charlie |= 1 << numberOfTrailingZeros;
                                if (((Boolean) nVar.invoke(serialDescriptor, Integer.valueOf(numberOfTrailingZeros))).booleanValue()) {
                                    i4 = numberOfTrailingZeros;
                                    break;
                                }
                            } else if (romeo > 64) {
                                long[] jArr2 = c0264w2.delta;
                                int length = jArr2.length;
                                loop3: while (i5 < length) {
                                    int i15 = i5 + 1;
                                    int i16 = i15 * 64;
                                    long j6 = jArr2[i5];
                                    while (j6 != -1) {
                                        int i17 = i5;
                                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j6);
                                        j6 |= 1 << numberOfTrailingZeros2;
                                        i4 = numberOfTrailingZeros2 + i16;
                                        if (((Boolean) nVar.invoke(serialDescriptor, Integer.valueOf(i4))).booleanValue()) {
                                            jArr2[i17] = j6;
                                            break loop3;
                                        }
                                        i5 = i17;
                                    }
                                    jArr2[i5] = j6;
                                    i5 = i15;
                                }
                            }
                        }
                    }
                    i4 = -1;
                } else {
                    r.lima(aVar, "object");
                    throw null;
                }
            }
        }
        if (agVar != ag.teal) {
            ((int[]) aVar2.delta)[aVar2.bravo] = i4;
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
    @Override // s6.AbstractC2787u6, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object tango(KSerializer deserializer) {
        String message;
        Of.d dVar = this.alpha;
        a aVar = this.charlie;
        B0.a aVar2 = aVar.bravo;
        Intrinsics.echo(deserializer, "deserializer");
        try {
        } catch (MissingFieldException e) {
            message = e.getMessage();
            Intrinsics.checkNotNull(message);
            if (!StringsKt.beige(message, "at path", false)) {
            }
        }
        if (deserializer instanceof AbstractC0244b) {
            String hotel = r.hotel(dVar, ((AbstractC0244b) deserializer).getDescriptor());
            String victor = aVar.victor(hotel, this.golf.charlie);
            String str = null;
            if (victor == null) {
                if (deserializer instanceof AbstractC0244b) {
                    String hotel2 = r.hotel(dVar, ((AbstractC0244b) deserializer).getDescriptor());
                    Of.n india = india();
                    String oscar = ((AbstractC0244b) deserializer).getDescriptor().oscar();
                    if (india instanceof Of.aa) {
                        Of.aa aaVar = (Of.aa) india;
                        Of.n nVar = (Of.n) aaVar.get(hotel2);
                        if (nVar != null) {
                            Of.ae alpha = Of.o.alpha(nVar);
                            if (!(alpha instanceof Of.x)) {
                                str = alpha.alpha();
                            }
                        }
                        try {
                            return r.oscar(dVar, hotel2, aaVar, S5.alpha((AbstractC0244b) deserializer, this, str));
                        } catch (SerializationException e4) {
                            String message2 = e4.getMessage();
                            Intrinsics.checkNotNull(message2);
                            throw r.delta(-1, aaVar.toString(), message2);
                        }
                    }
                    StringBuilder sb2 = new StringBuilder("Expected ");
                    kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
                    sb2.append(vVar.bravo(Of.aa.class).kilo());
                    sb2.append(", but had ");
                    sb2.append(vVar.bravo(india.getClass()).kilo());
                    sb2.append(" as the serialized body of ");
                    sb2.append(oscar);
                    sb2.append(" at element: ");
                    sb2.append(aVar2.echo());
                    throw r.delta(-1, india.toString(), sb2.toString());
                }
                return deserializer.deserialize(this);
            }
            try {
                KSerializer alpha2 = S5.alpha((AbstractC0244b) deserializer, this, victor);
                Af.t tVar = new Af.t(3);
                tVar.purple = hotel;
                this.foxtrot = tVar;
                return alpha2.deserialize(this);
            } catch (SerializationException e5) {
                String message3 = e5.getMessage();
                Intrinsics.checkNotNull(message3);
                String magenta = StringsKt.magenta(StringsKt.red(message3, '\n'), ".");
                String message4 = e5.getMessage();
                Intrinsics.checkNotNull(message4);
                a.romeo(aVar, magenta, 0, StringsKt.pink('\n', message4, ""), 2);
                throw null;
            }
            message = e.getMessage();
            Intrinsics.checkNotNull(message);
            if (!StringsKt.beige(message, "at path", false)) {
                throw e;
            }
            throw new MissingFieldException(e.getMissingFields(), e.getMessage() + " at path: " + aVar2.echo(), e);
        }
        return deserializer.deserialize(this);
    }

    @Override // s6.AbstractC2787u6, kotlinx.serialization.encoding.Decoder
    public final Decoder victor(SerialDescriptor descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
        if (ad.alpha(descriptor)) {
            return new m(this.charlie, this.alpha);
        }
        return this;
    }

    @Override // s6.AbstractC2787u6, Mf.a
    public final Object whiskey(SerialDescriptor descriptor, int i4, KSerializer deserializer, Object obj) {
        boolean z2;
        Intrinsics.echo(descriptor, "descriptor");
        Intrinsics.echo(deserializer, "deserializer");
        if (this.bravo == ag.teal && (i4 & 1) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        B0.a aVar = this.charlie.bravo;
        if (z2) {
            int[] iArr = (int[]) aVar.delta;
            int i5 = aVar.bravo;
            if (iArr[i5] == -2) {
                ((Object[]) aVar.charlie)[i5] = s.alpha;
            }
        }
        Object whiskey = super.whiskey(descriptor, i4, deserializer, obj);
        if (z2) {
            int[] iArr2 = (int[]) aVar.delta;
            int i10 = aVar.bravo;
            if (iArr2[i10] != -2) {
                int i11 = i10 + 1;
                aVar.bravo = i11;
                Object[] objArr = (Object[]) aVar.charlie;
                if (i11 == objArr.length) {
                    int i12 = i11 * 2;
                    Object[] copyOf = Arrays.copyOf(objArr, i12);
                    Intrinsics.delta(copyOf, "copyOf(...)");
                    aVar.charlie = copyOf;
                    int[] copyOf2 = Arrays.copyOf((int[]) aVar.delta, i12);
                    Intrinsics.delta(copyOf2, "copyOf(...)");
                    aVar.delta = copyOf2;
                }
            }
            Object[] objArr2 = (Object[]) aVar.charlie;
            int i13 = aVar.bravo;
            objArr2[i13] = whiskey;
            ((int[]) aVar.delta)[i13] = -2;
        }
        return whiskey;
    }

    @Override // s6.AbstractC2787u6, kotlinx.serialization.encoding.Decoder
    public final byte xray() {
        a aVar = this.charlie;
        long india = aVar.india();
        byte b2 = (byte) india;
        if (india == b2) {
            return b2;
        }
        a.romeo(aVar, "Failed to parse byte for input '" + india + '\'', 0, null, 6);
        throw null;
    }
}
