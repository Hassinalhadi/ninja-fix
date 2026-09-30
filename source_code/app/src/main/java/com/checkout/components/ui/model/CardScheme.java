package com.checkout.components.ui.model;

import Qd.a;
import androidx.annotation.Keep;
import com.checkout.components.ui.R;
import com.checkout.components.ui.model.PatternType;
import com.zendesk.service.HttpConstants;
import fe.C1713e;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\u0081\u0002\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\"BM\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006#"}, d2 = {"Lcom/checkout/components/ui/model/CardScheme;", "", "cvvLength", "", "", "patterns", "", "Lcom/checkout/components/ui/model/PatternType;", "numberSeparatorPattern", "lengths", "imageId", "<init>", "(Ljava/lang/String;ILjava/util/Set;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)V", "getCvvLength", "()Ljava/util/Set;", "getPatterns$ui_standardRelease", "()Ljava/util/List;", "getNumberSeparatorPattern", "getLengths", "getImageId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "MADA", "VISA", "MASTERCARD", "AMERICAN_EXPRESS", "DINERS_CLUB", "DISCOVER", "JCB", "UNION_PAY", "JAYWAN", "MAESTRO", "CARTES_BANCAIRES", "UNKNOWN", "Companion", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardScheme {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CardScheme[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final CardScheme UNKNOWN = new CardScheme("UNKNOWN", 11, ArraysKt.g(new Integer[]{3, 4}), CollectionsKt.emptyList(), CollectionsKt.listOf(4, 8, 12, 16), CollectionsKt.listOf(13, 16, 18, 19), null, 16, null);

    @NotNull
    private final Set<Integer> cvvLength;

    @Nullable
    private final Integer imageId;

    @NotNull
    private final List<Integer> lengths;

    @NotNull
    private final List<Integer> numberSeparatorPattern;

    @NotNull
    private final List<PatternType> patterns;
    public static final CardScheme MADA = new CardScheme("MADA", 0, ab.oscar(3), CollectionsKt.listOf(new PatternType.Exact(400861), new PatternType.Exact(401757), new PatternType.Exact(403024), new PatternType.Exact(406136), new PatternType.Exact(406996), new PatternType.Exact(407197), new PatternType.Exact(407395), new PatternType.Exact(409201), new PatternType.Exact(412565), new PatternType.Exact(410621), new PatternType.Exact(410685), new PatternType.Exact(417633), new PatternType.Exact(419593), new PatternType.Exact(420132), new PatternType.Exact(421141), new PatternType.Exact(426897), new PatternType.Exact(428331), new PatternType.Exact(431361), new PatternType.Exact(432328), new PatternType.Exact(434107), new PatternType.Exact(439954), new PatternType.Exact(440533), new PatternType.Exact(440647), new PatternType.Exact(440795), new PatternType.Exact(445564), new PatternType.Exact(446393), new PatternType.Exact(446404), new PatternType.Exact(446672), new PatternType.Exact(455036), new PatternType.Exact(455708), new PatternType.Exact(457865), new PatternType.Exact(457997), new PatternType.Exact(458456), new PatternType.Exact(462220), new PatternType.Exact(474491), new PatternType.Exact(484783), new PatternType.Exact(493428), new PatternType.Exact(504300), new PatternType.Exact(506968), new PatternType.Exact(508160), new PatternType.Exact(513213), new PatternType.Exact(520058), new PatternType.Exact(521076), new PatternType.Exact(524130), new PatternType.Exact(524514), new PatternType.Exact(529415), new PatternType.Exact(529741), new PatternType.Exact(530060), new PatternType.Exact(530906), new PatternType.Exact(531095), new PatternType.Exact(531196), new PatternType.Exact(532013), new PatternType.Exact(535825), new PatternType.Exact(535989), new PatternType.Exact(536023), new PatternType.Exact(537767), new PatternType.Exact(539931), new PatternType.Exact(543085), new PatternType.Exact(543357), new PatternType.Exact(549760), new PatternType.Exact(554180), new PatternType.Exact(557606), new PatternType.Exact(558563), new PatternType.Exact(558848), new PatternType.Exact(585265), new PatternType.Exact(589005), new PatternType.Exact(589206), new PatternType.Exact(604906), new PatternType.Exact(605141), new PatternType.Exact(636120), new PatternType.Range(428671, 428673), new PatternType.Range(468540, 468543), new PatternType.Range(483010, 483012), new PatternType.Range(486094, 486096), new PatternType.Range(489317, 489319), new PatternType.Range(588845, 588851), new PatternType.Range(588982, 588983), new PatternType.Range(422817, 422819), new PatternType.Range(968201, 968211)), CollectionsKt.listOf(4, 8, 12), ab.juliet(16), Integer.valueOf(R.drawable.cko_ic_scheme_mada));
    public static final CardScheme VISA = new CardScheme("VISA", 1, ab.oscar(3), ab.juliet(new PatternType.Exact(4)), CollectionsKt.listOf(4, 8, 12, 16), CollectionsKt.listOf(13, 16, 18, 19), Integer.valueOf(R.drawable.cko_ic_scheme_visa));
    public static final CardScheme MASTERCARD = new CardScheme("MASTERCARD", 2, ab.oscar(3), CollectionsKt.listOf(new PatternType.Range(51, 55), new PatternType.Range(222, 229), new PatternType.Range(23, 26), new PatternType.Range(270, 271), new PatternType.Exact(2720)), CollectionsKt.listOf(4, 8, 12), ab.juliet(16), Integer.valueOf(R.drawable.cko_ic_scheme_mastercard));
    public static final CardScheme AMERICAN_EXPRESS = new CardScheme("AMERICAN_EXPRESS", 3, ab.oscar(4), CollectionsKt.listOf(new PatternType.Exact(34), new PatternType.Exact(37)), CollectionsKt.listOf(4, 10), ab.juliet(15), Integer.valueOf(R.drawable.cko_ic_scheme_amex));
    public static final CardScheme DINERS_CLUB = new CardScheme("DINERS_CLUB", 4, ab.oscar(3), CollectionsKt.listOf(new PatternType.Exact(30), new PatternType.Exact(36), new PatternType.Exact(38), new PatternType.Exact(39), new PatternType.Range(300, HttpConstants.HTTP_USE_PROXY), new PatternType.Range(380, 389), new PatternType.Range(360, 369)), CollectionsKt.listOf(4, 10), CollectionsKt.listOf(14, 16, 19), Integer.valueOf(R.drawable.cko_ic_scheme_diners));
    public static final CardScheme DISCOVER = new CardScheme("DISCOVER", 5, ab.oscar(3), CollectionsKt.listOf(new PatternType.Exact(6011), new PatternType.Exact(65), new PatternType.Exact(601174), new PatternType.Range(601177, 601179), new PatternType.Range(601186, 601199), new PatternType.Range(644000, 659999), new PatternType.Range(601100, 601109), new PatternType.Range(601120, 601149), new PatternType.Range(644, 649)), CollectionsKt.listOf(4, 8, 12), CollectionsKt.listOf(16, 19), Integer.valueOf(R.drawable.cko_ic_scheme_discover));
    public static final CardScheme JCB = new CardScheme("JCB", 6, ab.oscar(3), CollectionsKt.listOf(new PatternType.Exact(2131), new PatternType.Exact(1800), new PatternType.Range(3528, 3589)), CollectionsKt.listOf(4, 8, 12), CollectionsKt.listOf(16, 17, 18, 19), Integer.valueOf(R.drawable.cko_ic_scheme_jcb));
    public static final CardScheme UNION_PAY = new CardScheme("UNION_PAY", 7, ab.oscar(3), CollectionsKt.listOf(new PatternType.Exact(620), new PatternType.Exact(622018), new PatternType.Exact(6270), new PatternType.Exact(6272), new PatternType.Exact(6276), new PatternType.Exact(6291), new PatternType.Exact(6292), new PatternType.Exact(810), new PatternType.Range(8110, 8131), new PatternType.Range(8132, 8151), new PatternType.Range(8152, 8163), new PatternType.Range(8164, 8171), new PatternType.Range(62100, 62182), new PatternType.Range(62184, 62187), new PatternType.Range(62185, 62197), new PatternType.Range(62200, 62205), new PatternType.Range(622010, 622999), new PatternType.Range(627700, 627779), new PatternType.Range(627781, 627799), new PatternType.Range(6282, 6289), new PatternType.Range(62207, 62209), new PatternType.Range(623, 626)), CollectionsKt.listOf(4, 8, 12), CollectionsKt.listOf(14, 15, 16, 17, 18, 19), Integer.valueOf(R.drawable.cko_ic_scheme_union_pay));
    public static final CardScheme JAYWAN = new CardScheme("JAYWAN", 8, ab.oscar(3), CollectionsKt.listOf(new PatternType.Exact(66900937), new PatternType.Exact(66901000), new PatternType.Exact(66901052), new PatternType.Exact(66901076), new PatternType.Exact(66901087), new PatternType.Exact(97845003), new PatternType.Range(66900900, 66900901), new PatternType.Range(66900903, 66900905), new PatternType.Range(66900907, 66900931), new PatternType.Range(66900939, 66900940), new PatternType.Range(66900950, 66900957), new PatternType.Range(66900959, 66900960), new PatternType.Range(66900962, 66900964), new PatternType.Range(66900966, 66900974), new PatternType.Range(66900979, 66900987), new PatternType.Range(66900991, 66900998), new PatternType.Range(66901056, 66901057), new PatternType.Range(66901071, 66901073), new PatternType.Range(66901078, 66901085)), CollectionsKt.listOf(4, 8, 12), ab.juliet(16), Integer.valueOf(R.drawable.cko_ic_scheme_jaywan));
    public static final CardScheme MAESTRO = new CardScheme("MAESTRO", 9, ab.oscar(3), CollectionsKt.listOf(new PatternType.Exact(493698), new PatternType.Range(56, 59), new PatternType.Exact(63), new PatternType.Exact(67), new PatternType.Exact(6), new PatternType.Range(500000, 504174), new PatternType.Range(504176, 506698), new PatternType.Range(506779, 508999)), CollectionsKt.listOf(4, 8, 12), CollectionsKt.listOf(12, 13, 14, 15, 16, 17, 18, 19), Integer.valueOf(R.drawable.cko_ic_scheme_maestro));
    public static final CardScheme CARTES_BANCAIRES = new CardScheme("CARTES_BANCAIRES", 10, ArraysKt.g(new Integer[]{3, 4}), CollectionsKt.emptyList(), CollectionsKt.listOf(4, 8, 12, 16), CollectionsKt.listOf(13, 16, 18, 19), Integer.valueOf(R.drawable.cko_ic_scheme_carte_bancaire));

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/checkout/components/ui/model/CardScheme$Companion;", "", "<init>", "()V", "detectScheme", "Lcom/checkout/components/ui/model/CardScheme;", "cardNumber", "", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0095, code lost:
        
            r1 = (com.checkout.components.ui.model.CardScheme) r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0097, code lost:
        
            if (r1 != null) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x009b, code lost:
        
            return com.checkout.components.ui.model.CardScheme.UNKNOWN;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
        
            return r1;
         */
        /* JADX WARN: Type inference failed for: r7v0, types: [fe.g, fe.e] */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final CardScheme detectScheme(@NotNull String cardNumber) {
            Object obj;
            boolean z2;
            boolean z10;
            Intrinsics.echo(cardNumber, "cardNumber");
            Iterator<E> it = CardScheme.getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    List<PatternType> patterns$ui_standardRelease = ((CardScheme) obj).getPatterns$ui_standardRelease();
                    boolean z11 = true;
                    if (patterns$ui_standardRelease != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2 || !patterns$ui_standardRelease.isEmpty()) {
                        for (PatternType patternType : patterns$ui_standardRelease) {
                            if (patternType instanceof PatternType.Exact) {
                                z10 = r.quebec(cardNumber, String.valueOf(((PatternType.Exact) patternType).getValue()), false);
                            } else if (patternType instanceof PatternType.Range) {
                                PatternType.Range range = (PatternType.Range) patternType;
                                Integer tango = r.tango(StringsKt.yellow(String.valueOf(range.getStart()).length(), cardNumber));
                                if (tango != null && new C1713e(range.getStart(), range.getEnd(), 1).alpha(tango.intValue())) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (z10) {
                                break;
                            }
                        }
                    }
                    z11 = false;
                    if (z11) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ CardScheme[] $values() {
        return new CardScheme[]{MADA, VISA, MASTERCARD, AMERICAN_EXPRESS, DINERS_CLUB, DISCOVER, JCB, UNION_PAY, JAYWAN, MAESTRO, CARTES_BANCAIRES, UNKNOWN};
    }

    static {
        CardScheme[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
        INSTANCE = new Companion(null);
    }

    private CardScheme(String str, int i4, Set set, List list, List list2, List list3, Integer num) {
        this.cvvLength = set;
        this.patterns = list;
        this.numberSeparatorPattern = list2;
        this.lengths = list3;
        this.imageId = num;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static CardScheme valueOf(String str) {
        return (CardScheme) Enum.valueOf(CardScheme.class, str);
    }

    public static CardScheme[] values() {
        return (CardScheme[]) $VALUES.clone();
    }

    @NotNull
    public final Set<Integer> getCvvLength() {
        return this.cvvLength;
    }

    @Nullable
    public final Integer getImageId() {
        return this.imageId;
    }

    @NotNull
    public final List<Integer> getLengths() {
        return this.lengths;
    }

    @NotNull
    public final List<Integer> getNumberSeparatorPattern() {
        return this.numberSeparatorPattern;
    }

    @NotNull
    public final List<PatternType> getPatterns$ui_standardRelease() {
        return this.patterns;
    }

    public /* synthetic */ CardScheme(String str, int i4, Set set, List list, List list2, List list3, Integer num, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i4, set, list, list2, list3, (i5 & 16) != 0 ? null : num);
    }
}
