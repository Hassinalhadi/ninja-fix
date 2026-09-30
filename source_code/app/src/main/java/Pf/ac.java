package Pf;

import Nf.AbstractC0244b;
import Nf.P;
import Nf.az;
import com.google.android.gms.measurement.internal.C1473v;
import com.google.maps.android.BuildConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import s6.AbstractC2716m6;
import s6.AbstractC2796v6;
import s6.S5;

/* loaded from: classes2.dex */
public final class ac extends AbstractC2796v6 {
    public final j bravo;
    public final Of.d charlie;
    public final ag delta;
    public final ac[] echo;
    public final C1473v foxtrot;
    public final Of.k golf;
    public boolean hotel;
    public String india;
    public String juliet;

    public ac(j composer, Of.d json, ag agVar, ac[] acVarArr) {
        Intrinsics.echo(composer, "composer");
        Intrinsics.echo(json, "json");
        this.bravo = composer;
        this.charlie = json;
        this.delta = agVar;
        this.echo = acVarArr;
        this.foxtrot = json.bravo;
        this.golf = json.alpha;
        int ordinal = agVar.ordinal();
        if (acVarArr != null) {
            ac acVar = acVarArr[ordinal];
            if (acVar != null || acVar != this) {
                acVarArr[ordinal] = this;
            }
        }
    }

    @Override // s6.AbstractC2796v6, Mf.b
    public final void alpha(SerialDescriptor descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
        ag agVar = this.delta;
        j jVar = this.bravo;
        jVar.getClass();
        jVar.purple = false;
        jVar.kilo(agVar.purple);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final C1473v bravo() {
        return this.foxtrot;
    }

    @Override // s6.AbstractC2796v6, kotlinx.serialization.encoding.Encoder
    public final Mf.b charlie(SerialDescriptor descriptor) {
        ac acVar;
        Intrinsics.echo(descriptor, "descriptor");
        Of.d dVar = this.charlie;
        ag papa = r.papa(dVar, descriptor);
        char c3 = papa.alpha;
        j jVar = this.bravo;
        jVar.kilo(c3);
        jVar.purple = true;
        String str = this.india;
        if (str != null) {
            String str2 = this.juliet;
            if (str2 == null) {
                str2 = descriptor.oscar();
            }
            jVar.hotel();
            romeo(str);
            jVar.kilo(':');
            romeo(str2);
            this.india = null;
            this.juliet = null;
        }
        if (this.delta == papa) {
            return this;
        }
        ac[] acVarArr = this.echo;
        if (acVarArr != null && (acVar = acVarArr[papa.ordinal()]) != null) {
            return acVar;
        }
        return new ac(jVar, dVar, papa, acVarArr);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void delta() {
        this.bravo.november(BuildConfig.TRAVIS);
    }

    @Override // s6.AbstractC2796v6, kotlinx.serialization.encoding.Encoder
    public final void echo(double d4) {
        boolean z2 = this.hotel;
        j jVar = this.bravo;
        if (z2) {
            romeo(String.valueOf(d4));
        } else {
            ((Fe.c) jVar.red).quebec(String.valueOf(d4));
        }
        if (!this.golf.hotel && Math.abs(d4) > Double.MAX_VALUE) {
            throw r.bravo(((Fe.c) jVar.red).toString(), Double.valueOf(d4));
        }
    }

    @Override // s6.AbstractC2796v6, kotlinx.serialization.encoding.Encoder
    public final void foxtrot(short s3) {
        if (this.hotel) {
            romeo(String.valueOf((int) s3));
        } else {
            this.bravo.oscar(s3);
        }
    }

    @Override // s6.AbstractC2796v6, kotlinx.serialization.encoding.Encoder
    public final void golf(byte b2) {
        if (this.hotel) {
            romeo(String.valueOf((int) b2));
        } else {
            this.bravo.india(b2);
        }
    }

    @Override // s6.AbstractC2796v6, kotlinx.serialization.encoding.Encoder
    public final void hotel(boolean z2) {
        if (this.hotel) {
            romeo(String.valueOf(z2));
        } else {
            ((Fe.c) this.bravo.red).quebec(String.valueOf(z2));
        }
    }

    @Override // s6.AbstractC2796v6, Mf.b
    public final void india(Object obj, SerialDescriptor serialDescriptor) {
        P p4 = P.alpha;
        if (obj == null && !this.golf.echo) {
            return;
        }
        super.india(obj, serialDescriptor);
    }

    @Override // s6.AbstractC2796v6, kotlinx.serialization.encoding.Encoder
    public final void juliet(float f5) {
        boolean z2 = this.hotel;
        j jVar = this.bravo;
        if (z2) {
            romeo(String.valueOf(f5));
        } else {
            ((Fe.c) jVar.red).quebec(String.valueOf(f5));
        }
        if (!this.golf.hotel && Math.abs(f5) > Float.MAX_VALUE) {
            throw r.bravo(((Fe.c) jVar.red).toString(), Float.valueOf(f5));
        }
    }

    @Override // s6.AbstractC2796v6, kotlinx.serialization.encoding.Encoder
    public final void kilo(char c3) {
        romeo(String.valueOf(c3));
    }

    @Override // s6.AbstractC2796v6, kotlinx.serialization.encoding.Encoder
    public final void lima(SerialDescriptor enumDescriptor, int i4) {
        Intrinsics.echo(enumDescriptor, "enumDescriptor");
        romeo(enumDescriptor.sierra(i4));
    }

    @Override // s6.AbstractC2796v6, kotlinx.serialization.encoding.Encoder
    public final void mike(int i4) {
        if (this.hotel) {
            romeo(String.valueOf(i4));
        } else {
            this.bravo.lima(i4);
        }
    }

    @Override // s6.AbstractC2796v6, kotlinx.serialization.encoding.Encoder
    public final Encoder november(SerialDescriptor descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
        boolean alpha = ad.alpha(descriptor);
        ag agVar = this.delta;
        Of.d dVar = this.charlie;
        j jVar = this.bravo;
        if (alpha) {
            if (!(jVar instanceof l)) {
                jVar = new l((Fe.c) jVar.red, this.hotel);
            }
            return new ac(jVar, dVar, agVar, null);
        }
        if (descriptor.isInline() && Intrinsics.areEqual(descriptor, Of.o.alpha)) {
            if (!(jVar instanceof k)) {
                jVar = new k((Fe.c) jVar.red, this.hotel);
            }
            return new ac(jVar, dVar, agVar, null);
        }
        if (this.india != null) {
            this.juliet = descriptor.oscar();
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x003f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, Lf.l.echo) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r1.juliet != Of.a.alpha) goto L20;
     */
    @Override // s6.AbstractC2796v6, kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void oscar(KSerializer serializer, Object obj) {
        String hotel;
        Intrinsics.echo(serializer, "serializer");
        Of.d dVar = this.charlie;
        Of.k kVar = dVar.alpha;
        boolean z2 = serializer instanceof AbstractC0244b;
        if (!z2) {
            int ordinal = kVar.juliet.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    AbstractC2716m6 november = serializer.getDescriptor().november();
                    if (!Intrinsics.areEqual(november, Lf.l.bravo)) {
                    }
                    hotel = r.hotel(dVar, serializer.getDescriptor());
                }
            }
            hotel = null;
        }
        if (z2) {
            AbstractC0244b abstractC0244b = (AbstractC0244b) serializer;
            if (obj != null) {
                KSerializer bravo = S5.bravo(abstractC0244b, this, obj);
                if (hotel != null) {
                    if (serializer instanceof Jf.d) {
                        SerialDescriptor descriptor = bravo.getDescriptor();
                        Intrinsics.echo(descriptor, "<this>");
                        if (az.bravo(descriptor).contains(hotel)) {
                            StringBuilder india = av.q.india("Sealed class '", bravo.getDescriptor().oscar(), "' cannot be serialized as base class '", ((Jf.d) serializer).getDescriptor().oscar(), "' because it has property name that conflicts with JSON class discriminator '");
                            india.append(hotel);
                            india.append("'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                            throw new IllegalStateException(india.toString().toString());
                        }
                    }
                    AbstractC2716m6 kind = bravo.getDescriptor().november();
                    Intrinsics.echo(kind, "kind");
                    if (!(kind instanceof Lf.k)) {
                        if (!(kind instanceof Lf.f)) {
                            if (kind instanceof Lf.d) {
                                throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
                            }
                        } else {
                            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                        }
                    } else {
                        throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                    }
                }
                serializer = bravo;
            } else {
                throw new IllegalArgumentException(("Value for serializer " + abstractC0244b.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
        }
        if (hotel != null) {
            String oscar = serializer.getDescriptor().oscar();
            this.india = hotel;
            this.juliet = oscar;
        }
        serializer.serialize(this, obj);
    }

    @Override // s6.AbstractC2796v6, kotlinx.serialization.encoding.Encoder
    public final void papa(long j5) {
        if (this.hotel) {
            romeo(String.valueOf(j5));
        } else {
            this.bravo.mike(j5);
        }
    }

    @Override // s6.AbstractC2796v6, Mf.b
    public final boolean quebec(SerialDescriptor serialDescriptor) {
        return this.golf.alpha;
    }

    @Override // s6.AbstractC2796v6, kotlinx.serialization.encoding.Encoder
    public final void romeo(String value) {
        Intrinsics.echo(value, "value");
        this.bravo.quebec(value);
    }

    @Override // s6.AbstractC2796v6
    public final void tango(SerialDescriptor descriptor, int i4) {
        Intrinsics.echo(descriptor, "descriptor");
        int ordinal = this.delta.ordinal();
        boolean z2 = true;
        j jVar = this.bravo;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (!jVar.purple) {
                        jVar.kilo(',');
                    }
                    jVar.hotel();
                    Of.d json = this.charlie;
                    Intrinsics.echo(json, "json");
                    r.november(json, descriptor);
                    romeo(descriptor.sierra(i4));
                    jVar.kilo(':');
                    jVar.tango();
                    return;
                }
                if (i4 == 0) {
                    this.hotel = true;
                }
                if (i4 == 1) {
                    jVar.kilo(',');
                    jVar.tango();
                    this.hotel = false;
                    return;
                }
                return;
            }
            if (!jVar.purple) {
                if (i4 % 2 == 0) {
                    jVar.kilo(',');
                    jVar.hotel();
                } else {
                    jVar.kilo(':');
                    jVar.tango();
                    z2 = false;
                }
                this.hotel = z2;
                return;
            }
            this.hotel = true;
            jVar.hotel();
            return;
        }
        if (!jVar.purple) {
            jVar.kilo(',');
        }
        jVar.hotel();
    }
}
