package Pf;

import Nf.AbstractC0244b;
import Nf.E;
import Nf.P;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import com.google.android.gms.measurement.internal.C1473v;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import s6.AbstractC2716m6;
import s6.S5;

/* loaded from: classes2.dex */
public abstract class b implements Of.l, Decoder, Mf.a {
    public final ArrayList alpha = new ArrayList();
    public boolean bravo;
    public final Of.d charlie;
    public final String delta;
    public final Of.k echo;

    public b(Of.d dVar, String str) {
        this.charlie = dVar;
        this.delta = str;
        this.echo = dVar.alpha;
    }

    @Override // Mf.a
    public void alpha(SerialDescriptor descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
    }

    @Override // Mf.a
    public final double amber(E descriptor, int i4) {
        Intrinsics.echo(descriptor, "descriptor");
        return emerald(lavender(descriptor, i4));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short azure() {
        return indigo(magenta());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float beige() {
        return fuchsia(magenta());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double black() {
        return emerald(magenta());
    }

    public abstract Of.n blue(String str);

    @Override // Mf.a
    public final C1473v bravo() {
        return this.charlie.bravo;
    }

    public final Of.n bronze() {
        Of.n blue;
        String str = (String) CollectionsKt.olive(this.alpha);
        if (str != null && (blue = blue(str)) != null) {
            return blue;
        }
        return lime();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Mf.a charlie(SerialDescriptor descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
        Of.n bronze = bronze();
        AbstractC2716m6 november = descriptor.november();
        boolean areEqual = Intrinsics.areEqual(november, Lf.l.charlie);
        Of.d dVar = this.charlie;
        if (!areEqual && !(november instanceof Lf.d)) {
            if (Intrinsics.areEqual(november, Lf.l.delta)) {
                SerialDescriptor foxtrot = r.foxtrot(descriptor.uniform(0), dVar.bravo);
                AbstractC2716m6 november2 = foxtrot.november();
                if (!(november2 instanceof Lf.f) && !Intrinsics.areEqual(november2, Lf.k.bravo)) {
                    if (dVar.alpha.delta) {
                        String oscar = descriptor.oscar();
                        if (bronze instanceof Of.f) {
                            return new w(dVar, (Of.f) bronze);
                        }
                        StringBuilder sb2 = new StringBuilder("Expected ");
                        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
                        sb2.append(vVar.bravo(Of.f.class).kilo());
                        sb2.append(", but had ");
                        sb2.append(vVar.bravo(bronze.getClass()).kilo());
                        sb2.append(" as the serialized body of ");
                        sb2.append(oscar);
                        sb2.append(" at element: ");
                        sb2.append(maroon());
                        throw r.delta(-1, bronze.toString(), sb2.toString());
                    }
                    throw r.charlie(foxtrot);
                }
                String oscar2 = descriptor.oscar();
                if (bronze instanceof Of.aa) {
                    return new x(dVar, (Of.aa) bronze);
                }
                StringBuilder sb3 = new StringBuilder("Expected ");
                kotlin.jvm.internal.v vVar2 = kotlin.jvm.internal.u.alpha;
                sb3.append(vVar2.bravo(Of.aa.class).kilo());
                sb3.append(", but had ");
                sb3.append(vVar2.bravo(bronze.getClass()).kilo());
                sb3.append(" as the serialized body of ");
                sb3.append(oscar2);
                sb3.append(" at element: ");
                sb3.append(maroon());
                throw r.delta(-1, bronze.toString(), sb3.toString());
            }
            String oscar3 = descriptor.oscar();
            if (bronze instanceof Of.aa) {
                return new v(dVar, (Of.aa) bronze, this.delta, 8);
            }
            StringBuilder sb4 = new StringBuilder("Expected ");
            kotlin.jvm.internal.v vVar3 = kotlin.jvm.internal.u.alpha;
            sb4.append(vVar3.bravo(Of.aa.class).kilo());
            sb4.append(", but had ");
            sb4.append(vVar3.bravo(bronze.getClass()).kilo());
            sb4.append(" as the serialized body of ");
            sb4.append(oscar3);
            sb4.append(" at element: ");
            sb4.append(maroon());
            throw r.delta(-1, bronze.toString(), sb4.toString());
        }
        String oscar4 = descriptor.oscar();
        if (bronze instanceof Of.f) {
            return new w(dVar, (Of.f) bronze);
        }
        StringBuilder sb5 = new StringBuilder("Expected ");
        kotlin.jvm.internal.v vVar4 = kotlin.jvm.internal.u.alpha;
        sb5.append(vVar4.bravo(Of.f.class).kilo());
        sb5.append(", but had ");
        sb5.append(vVar4.bravo(bronze.getClass()).kilo());
        sb5.append(" as the serialized body of ");
        sb5.append(oscar4);
        sb5.append(" at element: ");
        sb5.append(maroon());
        throw r.delta(-1, bronze.toString(), sb5.toString());
    }

    public final boolean coral(Object obj) {
        Boolean bool;
        String tag = (String) obj;
        Intrinsics.echo(tag, "tag");
        Of.n blue = blue(tag);
        if (blue instanceof Of.ae) {
            Of.ae aeVar = (Of.ae) blue;
            try {
                Nf.af afVar = Of.o.alpha;
                Intrinsics.echo(aeVar, "<this>");
                String alpha = aeVar.alpha();
                String[] strArr = af.alpha;
                Intrinsics.echo(alpha, "<this>");
                if (alpha.equalsIgnoreCase("true")) {
                    bool = Boolean.TRUE;
                } else if (alpha.equalsIgnoreCase("false")) {
                    bool = Boolean.FALSE;
                } else {
                    bool = null;
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
                ochre(aeVar, CTVariableUtils.BOOLEAN, tag);
                throw null;
            } catch (IllegalArgumentException unused) {
                ochre(aeVar, CTVariableUtils.BOOLEAN, tag);
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        sb2.append(vVar.bravo(Of.ae.class).kilo());
        sb2.append(", but had ");
        sb2.append(vVar.bravo(blue.getClass()).kilo());
        sb2.append(" as the serialized body of boolean at element: ");
        sb2.append(navy(tag));
        throw r.delta(-1, blue.toString(), sb2.toString());
    }

    public final byte crimson(Object obj) {
        Byte b2;
        String tag = (String) obj;
        Intrinsics.echo(tag, "tag");
        Of.n blue = blue(tag);
        if (blue instanceof Of.ae) {
            Of.ae aeVar = (Of.ae) blue;
            try {
                long bravo = Of.o.bravo(aeVar);
                if (-128 <= bravo && bravo <= 127) {
                    b2 = Byte.valueOf((byte) bravo);
                } else {
                    b2 = null;
                }
                if (b2 != null) {
                    return b2.byteValue();
                }
                ochre(aeVar, "byte", tag);
                throw null;
            } catch (IllegalArgumentException unused) {
                ochre(aeVar, "byte", tag);
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        sb2.append(vVar.bravo(Of.ae.class).kilo());
        sb2.append(", but had ");
        sb2.append(vVar.bravo(blue.getClass()).kilo());
        sb2.append(" as the serialized body of byte at element: ");
        sb2.append(navy(tag));
        throw r.delta(-1, blue.toString(), sb2.toString());
    }

    public final char cyan(Object obj) {
        String tag = (String) obj;
        Intrinsics.echo(tag, "tag");
        Of.n blue = blue(tag);
        if (blue instanceof Of.ae) {
            Of.ae aeVar = (Of.ae) blue;
            try {
                String alpha = aeVar.alpha();
                Intrinsics.echo(alpha, "<this>");
                int length = alpha.length();
                if (length != 0) {
                    if (length == 1) {
                        return alpha.charAt(0);
                    }
                    throw new IllegalArgumentException("Char sequence has more than one element.");
                }
                throw new NoSuchElementException("Char sequence is empty.");
            } catch (IllegalArgumentException unused) {
                ochre(aeVar, "char", tag);
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        sb2.append(vVar.bravo(Of.ae.class).kilo());
        sb2.append(", but had ");
        sb2.append(vVar.bravo(blue.getClass()).kilo());
        sb2.append(" as the serialized body of char at element: ");
        sb2.append(navy(tag));
        throw r.delta(-1, blue.toString(), sb2.toString());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean delta() {
        return coral(magenta());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char echo() {
        return cyan(magenta());
    }

    public final double emerald(Object obj) {
        String tag = (String) obj;
        Intrinsics.echo(tag, "tag");
        Of.n blue = blue(tag);
        if (blue instanceof Of.ae) {
            Of.ae aeVar = (Of.ae) blue;
            try {
                Nf.af afVar = Of.o.alpha;
                Intrinsics.echo(aeVar, "<this>");
                double parseDouble = Double.parseDouble(aeVar.alpha());
                if (!this.charlie.alpha.hotel && Math.abs(parseDouble) > Double.MAX_VALUE) {
                    throw r.alpha(Double.valueOf(parseDouble), tag, bronze().toString());
                }
                return parseDouble;
            } catch (IllegalArgumentException unused) {
                ochre(aeVar, "double", tag);
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        sb2.append(vVar.bravo(Of.ae.class).kilo());
        sb2.append(", but had ");
        sb2.append(vVar.bravo(blue.getClass()).kilo());
        sb2.append(" as the serialized body of double at element: ");
        sb2.append(navy(tag));
        throw r.delta(-1, blue.toString(), sb2.toString());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int foxtrot(SerialDescriptor enumDescriptor) {
        Intrinsics.echo(enumDescriptor, "enumDescriptor");
        String tag = (String) magenta();
        Intrinsics.echo(tag, "tag");
        Of.n blue = blue(tag);
        String oscar = enumDescriptor.oscar();
        if (blue instanceof Of.ae) {
            return r.juliet(enumDescriptor, this.charlie, ((Of.ae) blue).alpha(), "");
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        sb2.append(vVar.bravo(Of.ae.class).kilo());
        sb2.append(", but had ");
        sb2.append(vVar.bravo(blue.getClass()).kilo());
        sb2.append(" as the serialized body of ");
        sb2.append(oscar);
        sb2.append(" at element: ");
        sb2.append(navy(tag));
        throw r.delta(-1, blue.toString(), sb2.toString());
    }

    public final float fuchsia(Object obj) {
        String tag = (String) obj;
        Intrinsics.echo(tag, "tag");
        Of.n blue = blue(tag);
        if (blue instanceof Of.ae) {
            Of.ae aeVar = (Of.ae) blue;
            try {
                Nf.af afVar = Of.o.alpha;
                Intrinsics.echo(aeVar, "<this>");
                float parseFloat = Float.parseFloat(aeVar.alpha());
                if (!this.charlie.alpha.hotel && Math.abs(parseFloat) > Float.MAX_VALUE) {
                    throw r.alpha(Float.valueOf(parseFloat), tag, bronze().toString());
                }
                return parseFloat;
            } catch (IllegalArgumentException unused) {
                ochre(aeVar, "float", tag);
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        sb2.append(vVar.bravo(Of.ae.class).kilo());
        sb2.append(", but had ");
        sb2.append(vVar.bravo(blue.getClass()).kilo());
        sb2.append(" as the serialized body of float at element: ");
        sb2.append(navy(tag));
        throw r.delta(-1, blue.toString(), sb2.toString());
    }

    public final Decoder gold(Object obj, SerialDescriptor inlineDescriptor) {
        String tag = (String) obj;
        Intrinsics.echo(tag, "tag");
        Intrinsics.echo(inlineDescriptor, "inlineDescriptor");
        if (ad.alpha(inlineDescriptor)) {
            Of.n blue = blue(tag);
            String oscar = inlineDescriptor.oscar();
            if (blue instanceof Of.ae) {
                String source = ((Of.ae) blue).alpha();
                Of.d json = this.charlie;
                Intrinsics.echo(json, "json");
                Intrinsics.echo(source, "source");
                return new m(new ae(source), json);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
            sb2.append(vVar.bravo(Of.ae.class).kilo());
            sb2.append(", but had ");
            sb2.append(vVar.bravo(blue.getClass()).kilo());
            sb2.append(" as the serialized body of ");
            sb2.append(oscar);
            sb2.append(" at element: ");
            sb2.append(navy(tag));
            throw r.delta(-1, blue.toString(), sb2.toString());
        }
        this.alpha.add(tag);
        return this;
    }

    @Override // Mf.a
    public final long golf(SerialDescriptor descriptor, int i4) {
        Intrinsics.echo(descriptor, "descriptor");
        return green(lavender(descriptor, i4));
    }

    public final int gray(Object obj) {
        Integer num;
        String tag = (String) obj;
        Intrinsics.echo(tag, "tag");
        Of.n blue = blue(tag);
        if (blue instanceof Of.ae) {
            Of.ae aeVar = (Of.ae) blue;
            try {
                long bravo = Of.o.bravo(aeVar);
                if (-2147483648L <= bravo && bravo <= 2147483647L) {
                    num = Integer.valueOf((int) bravo);
                } else {
                    num = null;
                }
                if (num != null) {
                    return num.intValue();
                }
                ochre(aeVar, "int", tag);
                throw null;
            } catch (IllegalArgumentException unused) {
                ochre(aeVar, "int", tag);
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        sb2.append(vVar.bravo(Of.ae.class).kilo());
        sb2.append(", but had ");
        sb2.append(vVar.bravo(blue.getClass()).kilo());
        sb2.append(" as the serialized body of int at element: ");
        sb2.append(navy(tag));
        throw r.delta(-1, blue.toString(), sb2.toString());
    }

    public final long green(Object obj) {
        String tag = (String) obj;
        Intrinsics.echo(tag, "tag");
        Of.n blue = blue(tag);
        if (blue instanceof Of.ae) {
            Of.ae aeVar = (Of.ae) blue;
            try {
                return Of.o.bravo(aeVar);
            } catch (IllegalArgumentException unused) {
                ochre(aeVar, "long", tag);
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        sb2.append(vVar.bravo(Of.ae.class).kilo());
        sb2.append(", but had ");
        sb2.append(vVar.bravo(blue.getClass()).kilo());
        sb2.append(" as the serialized body of long at element: ");
        sb2.append(navy(tag));
        throw r.delta(-1, blue.toString(), sb2.toString());
    }

    @Override // Mf.a
    public final Decoder hotel(E descriptor, int i4) {
        Intrinsics.echo(descriptor, "descriptor");
        return gold(lavender(descriptor, i4), descriptor.uniform(i4));
    }

    @Override // Of.l
    public final Of.n india() {
        return bronze();
    }

    public final short indigo(Object obj) {
        Short sh;
        String tag = (String) obj;
        Intrinsics.echo(tag, "tag");
        Of.n blue = blue(tag);
        if (blue instanceof Of.ae) {
            Of.ae aeVar = (Of.ae) blue;
            try {
                long bravo = Of.o.bravo(aeVar);
                if (-32768 <= bravo && bravo <= 32767) {
                    sh = Short.valueOf((short) bravo);
                } else {
                    sh = null;
                }
                if (sh != null) {
                    return sh.shortValue();
                }
                ochre(aeVar, "short", tag);
                throw null;
            } catch (IllegalArgumentException unused) {
                ochre(aeVar, "short", tag);
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        sb2.append(vVar.bravo(Of.ae.class).kilo());
        sb2.append(", but had ");
        sb2.append(vVar.bravo(blue.getClass()).kilo());
        sb2.append(" as the serialized body of short at element: ");
        sb2.append(navy(tag));
        throw r.delta(-1, blue.toString(), sb2.toString());
    }

    public final String ivory(Object obj) {
        String tag = (String) obj;
        Intrinsics.echo(tag, "tag");
        Of.n blue = blue(tag);
        if (blue instanceof Of.ae) {
            Of.ae aeVar = (Of.ae) blue;
            if (aeVar instanceof Of.u) {
                Of.u uVar = (Of.u) aeVar;
                if (!uVar.alpha && !this.charlie.alpha.charlie) {
                    StringBuilder victor = Q0.c.victor("String literal for key '", tag, "' should be quoted at element: ");
                    victor.append(navy(tag));
                    victor.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
                    throw r.delta(-1, bronze().toString(), victor.toString());
                }
                return uVar.purple;
            }
            StringBuilder victor2 = Q0.c.victor("Expected string value for a non-null key '", tag, "', got null literal instead at element: ");
            victor2.append(navy(tag));
            throw r.delta(-1, bronze().toString(), victor2.toString());
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        sb2.append(vVar.bravo(Of.ae.class).kilo());
        sb2.append(", but had ");
        sb2.append(vVar.bravo(blue.getClass()).kilo());
        sb2.append(" as the serialized body of string at element: ");
        sb2.append(navy(tag));
        throw r.delta(-1, blue.toString(), sb2.toString());
    }

    public String jade(SerialDescriptor descriptor, int i4) {
        Intrinsics.echo(descriptor, "descriptor");
        return descriptor.sierra(i4);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int juliet() {
        return gray(magenta());
    }

    @Override // Mf.a
    public final int kilo(SerialDescriptor descriptor, int i4) {
        Intrinsics.echo(descriptor, "descriptor");
        return gray(lavender(descriptor, i4));
    }

    public final String lavender(SerialDescriptor serialDescriptor, int i4) {
        Intrinsics.echo(serialDescriptor, "<this>");
        String nestedName = jade(serialDescriptor, i4);
        Intrinsics.echo(nestedName, "nestedName");
        return nestedName;
    }

    @Override // Mf.a
    public final byte lima(E descriptor, int i4) {
        Intrinsics.echo(descriptor, "descriptor");
        return crimson(lavender(descriptor, i4));
    }

    public abstract Of.n lime();

    public final Object magenta() {
        ArrayList arrayList = this.alpha;
        Object remove = arrayList.remove(CollectionsKt.ivory(arrayList));
        this.bravo = true;
        return remove;
    }

    public final String maroon() {
        ArrayList arrayList = this.alpha;
        if (arrayList.isEmpty()) {
            return "$";
        }
        return CollectionsKt.maroon(arrayList, ".", "$.", null, null, 60);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final String mike() {
        return ivory(magenta());
    }

    public final String navy(String currentTag) {
        Intrinsics.echo(currentTag, "currentTag");
        return maroon() + '.' + currentTag;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long november() {
        return green(magenta());
    }

    public final void ochre(Of.ae aeVar, String str, String str2) {
        String str3;
        if (kotlin.text.r.quebec(str, "i", false)) {
            str3 = "an ";
        } else {
            str3 = "a ";
        }
        throw r.delta(-1, bronze().toString(), "Failed to parse literal '" + aeVar + "' as " + str3.concat(str) + " value at element: " + navy(str2));
    }

    @Override // Mf.a
    public final boolean oscar(SerialDescriptor descriptor, int i4) {
        Intrinsics.echo(descriptor, "descriptor");
        return coral(lavender(descriptor, i4));
    }

    @Override // Mf.a
    public final String papa(SerialDescriptor descriptor, int i4) {
        Intrinsics.echo(descriptor, "descriptor");
        return ivory(lavender(descriptor, i4));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean quebec() {
        return !(bronze() instanceof Of.x);
    }

    @Override // Mf.a
    public final float romeo(E descriptor, int i4) {
        Intrinsics.echo(descriptor, "descriptor");
        return fuchsia(lavender(descriptor, i4));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Object tango(KSerializer deserializer) {
        Intrinsics.echo(deserializer, "deserializer");
        if (deserializer instanceof AbstractC0244b) {
            Of.d dVar = this.charlie;
            Of.k kVar = dVar.alpha;
            AbstractC0244b abstractC0244b = (AbstractC0244b) deserializer;
            String hotel = r.hotel(dVar, abstractC0244b.getDescriptor());
            Of.n bronze = bronze();
            String oscar = abstractC0244b.getDescriptor().oscar();
            if (bronze instanceof Of.aa) {
                Of.aa aaVar = (Of.aa) bronze;
                Of.n nVar = (Of.n) aaVar.get(hotel);
                String str = null;
                if (nVar != null) {
                    Of.ae alpha = Of.o.alpha(nVar);
                    if (!(alpha instanceof Of.x)) {
                        str = alpha.alpha();
                    }
                }
                try {
                    return r.oscar(dVar, hotel, aaVar, S5.alpha((AbstractC0244b) deserializer, this, str));
                } catch (SerializationException e) {
                    String message = e.getMessage();
                    Intrinsics.checkNotNull(message);
                    throw r.delta(-1, aaVar.toString(), message);
                }
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
            sb2.append(vVar.bravo(Of.aa.class).kilo());
            sb2.append(", but had ");
            sb2.append(vVar.bravo(bronze.getClass()).kilo());
            sb2.append(" as the serialized body of ");
            sb2.append(oscar);
            sb2.append(" at element: ");
            sb2.append(maroon());
            throw r.delta(-1, bronze.toString(), sb2.toString());
        }
        return deserializer.deserialize(this);
    }

    @Override // Mf.a
    public final Object uniform(SerialDescriptor descriptor, String str) {
        Object tango;
        P p4 = P.alpha;
        Intrinsics.echo(descriptor, "descriptor");
        String lavender = lavender(descriptor, 2);
        P p5 = P.alpha;
        this.alpha.add(lavender);
        P p10 = P.alpha;
        if (!p10.getDescriptor().papa() && !quebec()) {
            tango = null;
        } else {
            tango = tango(p10);
        }
        if (!this.bravo) {
            magenta();
        }
        this.bravo = false;
        return tango;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Decoder victor(SerialDescriptor descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
        if (CollectionsKt.olive(this.alpha) != null) {
            return gold(magenta(), descriptor);
        }
        return new t(this.charlie, lime(), this.delta).victor(descriptor);
    }

    @Override // Mf.a
    public final Object whiskey(SerialDescriptor descriptor, int i4, KSerializer deserializer, Object obj) {
        Intrinsics.echo(descriptor, "descriptor");
        Intrinsics.echo(deserializer, "deserializer");
        this.alpha.add(lavender(descriptor, i4));
        Intrinsics.echo(deserializer, "deserializer");
        Object tango = tango(deserializer);
        if (!this.bravo) {
            magenta();
        }
        this.bravo = false;
        return tango;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte xray() {
        return crimson(magenta());
    }

    @Override // Mf.a
    public final short yankee(E descriptor, int i4) {
        Intrinsics.echo(descriptor, "descriptor");
        return indigo(lavender(descriptor, i4));
    }

    @Override // Mf.a
    public final char zulu(E descriptor, int i4) {
        Intrinsics.echo(descriptor, "descriptor");
        return cyan(lavender(descriptor, i4));
    }
}
