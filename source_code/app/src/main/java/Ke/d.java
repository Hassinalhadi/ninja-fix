package Ke;

import I.aj;
import Ie.E;
import Ie.aa;
import Ie.i;
import Ie.z;

/* loaded from: classes2.dex */
public abstract class d {
    public static final b alpha;
    public static final b amber;
    public static final b azure;
    public static final b beige;
    public static final b black;
    public static final b blue;
    public static final b bravo;
    public static final b bronze;
    public static final b charlie;
    public static final b coral;
    public static final b crimson;
    public static final b cyan;
    public static final c delta;
    public static final c echo;
    public static final b emerald;
    public static final c foxtrot;
    public static final b fuchsia;
    public static final b gold;
    public static final b golf;
    public static final b gray;
    public static final b hotel;
    public static final b india;
    public static final b juliet;
    public static final b kilo;
    public static final b lima;
    public static final b mike;
    public static final b november;
    public static final c oscar;
    public static final b papa;
    public static final b quebec;
    public static final b romeo;
    public static final b sierra;
    public static final b tango;
    public static final b uniform;
    public static final b victor;
    public static final b whiskey;
    public static final b xray;
    public static final b yankee;
    public static final b zulu;

    static {
        b bravo2 = aj.bravo();
        alpha = bravo2;
        bravo = aj.alpha(bravo2);
        b bravo3 = aj.bravo();
        charlie = bravo3;
        E[] values = E.values();
        int i4 = bravo3.bravo + bravo3.charlie;
        c cVar = new c(i4, values);
        delta = cVar;
        aa[] values2 = aa.values();
        int i5 = i4 + cVar.charlie;
        c cVar2 = new c(i5, values2);
        echo = cVar2;
        i[] values3 = i.values();
        int i10 = cVar2.charlie;
        c cVar3 = new c(i5 + i10, values3);
        foxtrot = cVar3;
        b alpha2 = aj.alpha(cVar3);
        golf = alpha2;
        b alpha3 = aj.alpha(alpha2);
        hotel = alpha3;
        b alpha4 = aj.alpha(alpha3);
        india = alpha4;
        b alpha5 = aj.alpha(alpha4);
        juliet = alpha5;
        b alpha6 = aj.alpha(alpha5);
        kilo = alpha6;
        lima = aj.alpha(alpha6);
        b alpha7 = aj.alpha(cVar);
        mike = alpha7;
        november = aj.alpha(alpha7);
        c cVar4 = new c(i5 + i10, z.values());
        oscar = cVar4;
        b alpha8 = aj.alpha(cVar4);
        papa = alpha8;
        b alpha9 = aj.alpha(alpha8);
        quebec = alpha9;
        b alpha10 = aj.alpha(alpha9);
        romeo = alpha10;
        b alpha11 = aj.alpha(alpha10);
        sierra = alpha11;
        b alpha12 = aj.alpha(alpha11);
        tango = alpha12;
        b alpha13 = aj.alpha(alpha12);
        uniform = alpha13;
        b alpha14 = aj.alpha(alpha13);
        victor = alpha14;
        whiskey = aj.alpha(alpha14);
        b alpha15 = aj.alpha(cVar4);
        xray = alpha15;
        b alpha16 = aj.alpha(alpha15);
        yankee = alpha16;
        b alpha17 = aj.alpha(alpha16);
        zulu = alpha17;
        b alpha18 = aj.alpha(alpha17);
        amber = alpha18;
        b alpha19 = aj.alpha(alpha18);
        azure = alpha19;
        b alpha20 = aj.alpha(alpha19);
        beige = alpha20;
        b alpha21 = aj.alpha(alpha20);
        black = alpha21;
        b alpha22 = aj.alpha(alpha21);
        blue = alpha22;
        bronze = aj.alpha(alpha22);
        b alpha23 = aj.alpha(bravo3);
        coral = alpha23;
        b alpha24 = aj.alpha(alpha23);
        crimson = alpha24;
        cyan = aj.alpha(alpha24);
        b alpha25 = aj.alpha(cVar2);
        emerald = alpha25;
        b alpha26 = aj.alpha(alpha25);
        fuchsia = alpha26;
        gold = aj.alpha(alpha26);
        gray = aj.bravo();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void alpha(int i4) {
        Object[] objArr = new Object[3];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 5) {
                    if (i4 != 6) {
                        if (i4 != 8) {
                            if (i4 != 9) {
                                if (i4 != 11) {
                                    objArr[0] = "visibility";
                                }
                            }
                        }
                    }
                    objArr[0] = "memberKind";
                }
            } else {
                objArr[0] = "kind";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
            switch (i4) {
                case 3:
                    objArr[2] = "getConstructorFlags";
                    break;
                case 4:
                case 5:
                case 6:
                    objArr[2] = "getFunctionFlags";
                    break;
                case 7:
                case 8:
                case 9:
                    objArr[2] = "getPropertyFlags";
                    break;
                case 10:
                case 11:
                    objArr[2] = "getAccessorFlags";
                    break;
                default:
                    objArr[2] = "getClassFlags";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
        objArr[0] = "modality";
        objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (i4) {
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
