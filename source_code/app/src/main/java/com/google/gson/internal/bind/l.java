package com.google.gson.internal.bind;

import com.clevertap.android.sdk.Constants;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ad;
import com.google.gson.ae;
import com.google.gson.q;
import com.google.gson.reflect.TypeToken;
import com.google.maps.android.BuildConfig;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes2.dex */
public abstract class l {
    public static final ae amber;
    public static final ae azure;
    public static final ad charlie;
    public static final ae delta;
    public static final ae echo;
    public static final ae foxtrot;
    public static final ae golf;
    public static final ae hotel;
    public static final ae india;
    public static final ae juliet;
    public static final ad kilo;
    public static final ae lima;
    public static final ad mike;
    public static final ad november;
    public static final ad oscar;
    public static final ae papa;
    public static final ae quebec;
    public static final ae romeo;
    public static final ae sierra;
    public static final ae tango;
    public static final ae uniform;
    public static final ae victor;
    public static final ae whiskey;
    public static final ae xray;
    public static final ae yankee;
    public static final ad zulu;
    public static final ae alpha = new TypeAdapters$29(Class.class, new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$1
        @Override // com.google.gson.ad
        public Class read(S8.a aVar) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported"));
        }

        @Override // com.google.gson.ad
        public void write(S8.c cVar, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported"));
        }
    }.nullSafe());
    public static final ae bravo = new TypeAdapters$29(BitSet.class, new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$2
        @Override // com.google.gson.ad
        public BitSet read(S8.a aVar) throws IOException {
            boolean z2;
            BitSet bitSet = new BitSet();
            aVar.charlie();
            S8.b white = aVar.white();
            int i4 = 0;
            while (white != S8.b.purple) {
                int ordinal = white.ordinal();
                if (ordinal == 5 || ordinal == 6) {
                    int jade = aVar.jade();
                    if (jade == 0) {
                        z2 = false;
                    } else {
                        if (jade != 1) {
                            StringBuilder sierra2 = Q0.c.sierra(jade, "Invalid bitset value ", ", expected 0 or 1; at path ");
                            sierra2.append(aVar.beige());
                            throw new JsonSyntaxException(sierra2.toString());
                        }
                        z2 = true;
                    }
                } else if (ordinal == 7) {
                    z2 = aVar.green();
                } else {
                    throw new JsonSyntaxException("Invalid bitset value type: " + white + "; at path " + aVar.uniform());
                }
                if (z2) {
                    bitSet.set(i4);
                }
                i4++;
                white = aVar.white();
            }
            aVar.juliet();
            return bitSet;
        }

        @Override // com.google.gson.ad
        public void write(S8.c cVar, BitSet bitSet) throws IOException {
            cVar.echo();
            int length = bitSet.length();
            for (int i4 = 0; i4 < length; i4++) {
                cVar.indigo(bitSet.get(i4) ? 1L : 0L);
            }
            cVar.juliet();
        }
    }.nullSafe());

    static {
        ad adVar = new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$3
            @Override // com.google.gson.ad
            public Boolean read(S8.a aVar) throws IOException {
                S8.b white = aVar.white();
                if (white == S8.b.f2049b) {
                    aVar.peach();
                    return null;
                }
                if (white == S8.b.white) {
                    return Boolean.valueOf(Boolean.parseBoolean(aVar.purple()));
                }
                return Boolean.valueOf(aVar.green());
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, Boolean bool) throws IOException {
                cVar.jade(bool);
            }
        };
        charlie = new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$4
            @Override // com.google.gson.ad
            public Boolean read(S8.a aVar) throws IOException {
                if (aVar.white() == S8.b.f2049b) {
                    aVar.peach();
                    return null;
                }
                return Boolean.valueOf(aVar.purple());
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, Boolean bool) throws IOException {
                cVar.navy(bool == null ? BuildConfig.TRAVIS : bool.toString());
            }
        };
        delta = new TypeAdapters$30(Boolean.TYPE, Boolean.class, adVar);
        echo = new TypeAdapters$30(Byte.TYPE, Byte.class, new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$5
            @Override // com.google.gson.ad
            public Number read(S8.a aVar) throws IOException {
                if (aVar.white() == S8.b.f2049b) {
                    aVar.peach();
                    return null;
                }
                try {
                    int jade = aVar.jade();
                    if (jade <= 255 && jade >= -128) {
                        return Byte.valueOf((byte) jade);
                    }
                    StringBuilder sierra2 = Q0.c.sierra(jade, "Lossy conversion from ", " to byte; at path ");
                    sierra2.append(aVar.beige());
                    throw new JsonSyntaxException(sierra2.toString());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.azure();
                } else {
                    cVar.indigo(number.byteValue());
                }
            }
        });
        foxtrot = new TypeAdapters$30(Short.TYPE, Short.class, new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$6
            @Override // com.google.gson.ad
            public Number read(S8.a aVar) throws IOException {
                if (aVar.white() == S8.b.f2049b) {
                    aVar.peach();
                    return null;
                }
                try {
                    int jade = aVar.jade();
                    if (jade <= 65535 && jade >= -32768) {
                        return Short.valueOf((short) jade);
                    }
                    StringBuilder sierra2 = Q0.c.sierra(jade, "Lossy conversion from ", " to short; at path ");
                    sierra2.append(aVar.beige());
                    throw new JsonSyntaxException(sierra2.toString());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.azure();
                } else {
                    cVar.indigo(number.shortValue());
                }
            }
        });
        golf = new TypeAdapters$30(Integer.TYPE, Integer.class, new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$7
            @Override // com.google.gson.ad
            public Number read(S8.a aVar) throws IOException {
                if (aVar.white() == S8.b.f2049b) {
                    aVar.peach();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.jade());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.azure();
                } else {
                    cVar.indigo(number.intValue());
                }
            }
        });
        hotel = new TypeAdapters$29(AtomicInteger.class, new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$8
            @Override // com.google.gson.ad
            public AtomicInteger read(S8.a aVar) throws IOException {
                try {
                    return new AtomicInteger(aVar.jade());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, AtomicInteger atomicInteger) throws IOException {
                cVar.indigo(atomicInteger.get());
            }
        }.nullSafe());
        india = new TypeAdapters$29(AtomicBoolean.class, new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$9
            @Override // com.google.gson.ad
            public AtomicBoolean read(S8.a aVar) throws IOException {
                return new AtomicBoolean(aVar.green());
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, AtomicBoolean atomicBoolean) throws IOException {
                cVar.olive(atomicBoolean.get());
            }
        }.nullSafe());
        juliet = new TypeAdapters$29(AtomicIntegerArray.class, new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$10
            @Override // com.google.gson.ad
            public AtomicIntegerArray read(S8.a aVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                aVar.charlie();
                while (aVar.blue()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.jade()));
                    } catch (NumberFormatException e) {
                        throw new JsonSyntaxException(e);
                    }
                }
                aVar.juliet();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i4 = 0; i4 < size; i4++) {
                    atomicIntegerArray.set(i4, ((Integer) arrayList.get(i4)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
                cVar.echo();
                int length = atomicIntegerArray.length();
                for (int i4 = 0; i4 < length; i4++) {
                    cVar.indigo(atomicIntegerArray.get(i4));
                }
                cVar.juliet();
            }
        }.nullSafe());
        kilo = new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$11
            @Override // com.google.gson.ad
            public Number read(S8.a aVar) throws IOException {
                if (aVar.white() == S8.b.f2049b) {
                    aVar.peach();
                    return null;
                }
                try {
                    return Long.valueOf(aVar.magenta());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.azure();
                } else {
                    cVar.indigo(number.longValue());
                }
            }
        };
        new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$12
            @Override // com.google.gson.ad
            public Number read(S8.a aVar) throws IOException {
                if (aVar.white() == S8.b.f2049b) {
                    aVar.peach();
                    return null;
                }
                return Float.valueOf((float) aVar.indigo());
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.azure();
                    return;
                }
                if (!(number instanceof Float)) {
                    number = Float.valueOf(number.floatValue());
                }
                cVar.magenta(number);
            }
        };
        new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$13
            @Override // com.google.gson.ad
            public Number read(S8.a aVar) throws IOException {
                if (aVar.white() == S8.b.f2049b) {
                    aVar.peach();
                    return null;
                }
                return Double.valueOf(aVar.indigo());
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.azure();
                } else {
                    cVar.green(number.doubleValue());
                }
            }
        };
        lima = new TypeAdapters$30(Character.TYPE, Character.class, new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$14
            @Override // com.google.gson.ad
            public Character read(S8.a aVar) throws IOException {
                if (aVar.white() == S8.b.f2049b) {
                    aVar.peach();
                    return null;
                }
                String purple = aVar.purple();
                if (purple.length() == 1) {
                    return Character.valueOf(purple.charAt(0));
                }
                StringBuilder victor2 = Q0.c.victor("Expecting character, got: ", purple, "; at ");
                victor2.append(aVar.beige());
                throw new JsonSyntaxException(victor2.toString());
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, Character ch) throws IOException {
                cVar.navy(ch == null ? null : String.valueOf(ch));
            }
        });
        ad adVar2 = new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$15
            @Override // com.google.gson.ad
            public String read(S8.a aVar) throws IOException {
                S8.b white = aVar.white();
                if (white == S8.b.f2049b) {
                    aVar.peach();
                    return null;
                }
                if (white == S8.b.f2048a) {
                    return Boolean.toString(aVar.green());
                }
                return aVar.purple();
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, String str) throws IOException {
                cVar.navy(str);
            }
        };
        mike = new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$16
            @Override // com.google.gson.ad
            public BigDecimal read(S8.a aVar) throws IOException {
                if (aVar.white() == S8.b.f2049b) {
                    aVar.peach();
                    return null;
                }
                String purple = aVar.purple();
                try {
                    return com.google.gson.internal.f.juliet(purple);
                } catch (NumberFormatException e) {
                    StringBuilder victor2 = Q0.c.victor("Failed parsing '", purple, "' as BigDecimal; at path ");
                    victor2.append(aVar.beige());
                    throw new JsonSyntaxException(victor2.toString(), e);
                }
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, BigDecimal bigDecimal) throws IOException {
                cVar.magenta(bigDecimal);
            }
        };
        november = new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$17
            @Override // com.google.gson.ad
            public BigInteger read(S8.a aVar) throws IOException {
                if (aVar.white() == S8.b.f2049b) {
                    aVar.peach();
                    return null;
                }
                String purple = aVar.purple();
                try {
                    com.google.gson.internal.f.delta(purple);
                    return new BigInteger(purple);
                } catch (NumberFormatException e) {
                    StringBuilder victor2 = Q0.c.victor("Failed parsing '", purple, "' as BigInteger; at path ");
                    victor2.append(aVar.beige());
                    throw new JsonSyntaxException(victor2.toString(), e);
                }
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, BigInteger bigInteger) throws IOException {
                cVar.magenta(bigInteger);
            }
        };
        oscar = new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$18
            @Override // com.google.gson.ad
            public com.google.gson.internal.h read(S8.a aVar) throws IOException {
                if (aVar.white() == S8.b.f2049b) {
                    aVar.peach();
                    return null;
                }
                return new com.google.gson.internal.h(aVar.purple());
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, com.google.gson.internal.h hVar) throws IOException {
                cVar.magenta(hVar);
            }
        };
        papa = new TypeAdapters$29(String.class, adVar2);
        quebec = new TypeAdapters$29(StringBuilder.class, new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$19
            @Override // com.google.gson.ad
            public StringBuilder read(S8.a aVar) throws IOException {
                if (aVar.white() == S8.b.f2049b) {
                    aVar.peach();
                    return null;
                }
                return new StringBuilder(aVar.purple());
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, StringBuilder sb2) throws IOException {
                cVar.navy(sb2 == null ? null : sb2.toString());
            }
        });
        romeo = new TypeAdapters$29(StringBuffer.class, new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$20
            @Override // com.google.gson.ad
            public StringBuffer read(S8.a aVar) throws IOException {
                if (aVar.white() == S8.b.f2049b) {
                    aVar.peach();
                    return null;
                }
                return new StringBuffer(aVar.purple());
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, StringBuffer stringBuffer) throws IOException {
                cVar.navy(stringBuffer == null ? null : stringBuffer.toString());
            }
        });
        sierra = new TypeAdapters$29(URL.class, new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$21
            @Override // com.google.gson.ad
            public URL read(S8.a aVar) throws IOException {
                if (aVar.white() == S8.b.f2049b) {
                    aVar.peach();
                    return null;
                }
                String purple = aVar.purple();
                if (purple.equals(BuildConfig.TRAVIS)) {
                    return null;
                }
                return new URL(purple);
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, URL url) throws IOException {
                cVar.navy(url == null ? null : url.toExternalForm());
            }
        });
        tango = new TypeAdapters$29(URI.class, new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$22
            @Override // com.google.gson.ad
            public URI read(S8.a aVar) throws IOException {
                if (aVar.white() == S8.b.f2049b) {
                    aVar.peach();
                    return null;
                }
                try {
                    String purple = aVar.purple();
                    if (purple.equals(BuildConfig.TRAVIS)) {
                        return null;
                    }
                    return new URI(purple);
                } catch (URISyntaxException e) {
                    throw new JsonIOException(e);
                }
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, URI uri) throws IOException {
                cVar.navy(uri == null ? null : uri.toASCIIString());
            }
        });
        final ad adVar3 = new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$23
            @Override // com.google.gson.ad
            public InetAddress read(S8.a aVar) throws IOException {
                if (aVar.white() == S8.b.f2049b) {
                    aVar.peach();
                    return null;
                }
                return InetAddress.getByName(aVar.purple());
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, InetAddress inetAddress) throws IOException {
                cVar.navy(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        final Class<InetAddress> cls = InetAddress.class;
        uniform = new ae() { // from class: com.google.gson.internal.bind.TypeAdapters$32
            @Override // com.google.gson.ae
            public <T2> ad create(com.google.gson.l lVar, TypeToken<T2> typeToken) {
                final Class<? super T2> rawType = typeToken.getRawType();
                if (!cls.isAssignableFrom(rawType)) {
                    return null;
                }
                return new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$32.1
                    @Override // com.google.gson.ad
                    public Object read(S8.a aVar) throws IOException {
                        Object read = adVar3.read(aVar);
                        if (read != null && !rawType.isInstance(read)) {
                            throw new JsonSyntaxException("Expected a " + rawType.getName() + " but was " + read.getClass().getName() + "; at path " + aVar.beige());
                        }
                        return read;
                    }

                    @Override // com.google.gson.ad
                    public void write(S8.c cVar, Object obj) throws IOException {
                        adVar3.write(cVar, obj);
                    }
                };
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + adVar3 + Constants.AES_SUFFIX;
            }
        };
        victor = new TypeAdapters$29(UUID.class, new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$24
            @Override // com.google.gson.ad
            public UUID read(S8.a aVar) throws IOException {
                if (aVar.white() == S8.b.f2049b) {
                    aVar.peach();
                    return null;
                }
                String purple = aVar.purple();
                try {
                    return UUID.fromString(purple);
                } catch (IllegalArgumentException e) {
                    StringBuilder victor2 = Q0.c.victor("Failed parsing '", purple, "' as UUID; at path ");
                    victor2.append(aVar.beige());
                    throw new JsonSyntaxException(victor2.toString(), e);
                }
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, UUID uuid) throws IOException {
                cVar.navy(uuid == null ? null : uuid.toString());
            }
        });
        whiskey = new TypeAdapters$29(Currency.class, new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$25
            @Override // com.google.gson.ad
            public Currency read(S8.a aVar) throws IOException {
                String purple = aVar.purple();
                try {
                    return Currency.getInstance(purple);
                } catch (IllegalArgumentException e) {
                    StringBuilder victor2 = Q0.c.victor("Failed parsing '", purple, "' as Currency; at path ");
                    victor2.append(aVar.beige());
                    throw new JsonSyntaxException(victor2.toString(), e);
                }
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, Currency currency) throws IOException {
                cVar.navy(currency.getCurrencyCode());
            }
        }.nullSafe());
        final ad adVar4 = new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$26
            private static final String DAY_OF_MONTH = "dayOfMonth";
            private static final String HOUR_OF_DAY = "hourOfDay";
            private static final String MINUTE = "minute";
            private static final String MONTH = "month";
            private static final String SECOND = "second";
            private static final String YEAR = "year";

            /* JADX WARN: Failed to find 'out' block for switch in B:10:0x002f. Please report as an issue. */
            @Override // com.google.gson.ad
            public Calendar read(S8.a aVar) throws IOException {
                if (aVar.white() == S8.b.f2049b) {
                    aVar.peach();
                    return null;
                }
                aVar.echo();
                int i4 = 0;
                int i5 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (aVar.white() != S8.b.silver) {
                    String navy = aVar.navy();
                    int jade = aVar.jade();
                    navy.getClass();
                    char c3 = 65535;
                    switch (navy.hashCode()) {
                        case -1181204563:
                            if (navy.equals(DAY_OF_MONTH)) {
                                c3 = 0;
                                break;
                            }
                            break;
                        case -1074026988:
                            if (navy.equals(MINUTE)) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case -906279820:
                            if (navy.equals(SECOND)) {
                                c3 = 2;
                                break;
                            }
                            break;
                        case 3704893:
                            if (navy.equals(YEAR)) {
                                c3 = 3;
                                break;
                            }
                            break;
                        case 104080000:
                            if (navy.equals(MONTH)) {
                                c3 = 4;
                                break;
                            }
                            break;
                        case 985252545:
                            if (navy.equals(HOUR_OF_DAY)) {
                                c3 = 5;
                                break;
                            }
                            break;
                    }
                    switch (c3) {
                        case 0:
                            i10 = jade;
                            break;
                        case 1:
                            i12 = jade;
                            break;
                        case 2:
                            i13 = jade;
                            break;
                        case 3:
                            i4 = jade;
                            break;
                        case 4:
                            i5 = jade;
                            break;
                        case 5:
                            i11 = jade;
                            break;
                    }
                }
                aVar.papa();
                return new GregorianCalendar(i4, i5, i10, i11, i12, i13);
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, Calendar calendar) throws IOException {
                if (calendar == null) {
                    cVar.azure();
                    return;
                }
                cVar.foxtrot();
                cVar.quebec(YEAR);
                cVar.indigo(calendar.get(1));
                cVar.quebec(MONTH);
                cVar.indigo(calendar.get(2));
                cVar.quebec(DAY_OF_MONTH);
                cVar.indigo(calendar.get(5));
                cVar.quebec(HOUR_OF_DAY);
                cVar.indigo(calendar.get(11));
                cVar.quebec(MINUTE);
                cVar.indigo(calendar.get(12));
                cVar.quebec(SECOND);
                cVar.indigo(calendar.get(13));
                cVar.papa();
            }
        };
        final Class<Calendar> cls2 = Calendar.class;
        final Class<GregorianCalendar> cls3 = GregorianCalendar.class;
        xray = new ae() { // from class: com.google.gson.internal.bind.TypeAdapters$31
            @Override // com.google.gson.ae
            public <T> ad create(com.google.gson.l lVar, TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (rawType != cls2 && rawType != cls3) {
                    return null;
                }
                return adVar4;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls3.getName() + ",adapter=" + adVar4 + Constants.AES_SUFFIX;
            }
        };
        yankee = new TypeAdapters$29(Locale.class, new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$27
            @Override // com.google.gson.ad
            public Locale read(S8.a aVar) throws IOException {
                if (aVar.white() == S8.b.f2049b) {
                    aVar.peach();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.purple(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (nextToken2 == null && nextToken3 == null) {
                    return new Locale(nextToken);
                }
                if (nextToken3 == null) {
                    return new Locale(nextToken, nextToken2);
                }
                return new Locale(nextToken, nextToken2, nextToken3);
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, Locale locale) throws IOException {
                cVar.navy(locale == null ? null : locale.toString());
            }
        });
        final JsonElementTypeAdapter jsonElementTypeAdapter = JsonElementTypeAdapter.ADAPTER;
        zulu = jsonElementTypeAdapter;
        final Class<q> cls4 = q.class;
        amber = new ae() { // from class: com.google.gson.internal.bind.TypeAdapters$32
            @Override // com.google.gson.ae
            public <T2> ad create(com.google.gson.l lVar, TypeToken<T2> typeToken) {
                final Class rawType = typeToken.getRawType();
                if (!cls4.isAssignableFrom(rawType)) {
                    return null;
                }
                return new ad() { // from class: com.google.gson.internal.bind.TypeAdapters$32.1
                    @Override // com.google.gson.ad
                    public Object read(S8.a aVar) throws IOException {
                        Object read = jsonElementTypeAdapter.read(aVar);
                        if (read != null && !rawType.isInstance(read)) {
                            throw new JsonSyntaxException("Expected a " + rawType.getName() + " but was " + read.getClass().getName() + "; at path " + aVar.beige());
                        }
                        return read;
                    }

                    @Override // com.google.gson.ad
                    public void write(S8.c cVar, Object obj) throws IOException {
                        jsonElementTypeAdapter.write(cVar, obj);
                    }
                };
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls4.getName() + ",adapter=" + jsonElementTypeAdapter + Constants.AES_SUFFIX;
            }
        };
        azure = EnumTypeAdapter.FACTORY;
    }

    public static ae alpha(final TypeToken typeToken, final ad adVar) {
        return new ae() { // from class: com.google.gson.internal.bind.TypeAdapters$28
            @Override // com.google.gson.ae
            public <T> ad create(com.google.gson.l lVar, TypeToken<T> typeToken2) {
                if (typeToken2.equals(TypeToken.this)) {
                    return adVar;
                }
                return null;
            }
        };
    }

    public static ae bravo(Class cls, ad adVar) {
        return new TypeAdapters$29(cls, adVar);
    }

    public static ae charlie(Class cls, Class cls2, ad adVar) {
        return new TypeAdapters$30(cls, cls2, adVar);
    }
}
