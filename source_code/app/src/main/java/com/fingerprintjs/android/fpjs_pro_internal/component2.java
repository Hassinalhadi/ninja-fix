package com.fingerprintjs.android.fpjs_pro_internal;

import com.clevertap.android.sdk.Constants;
import com.zendesk.service.HttpConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/component2;", "", "b", "a", "Lcom/fingerprintjs/android/fpjs_pro_internal/component2$b;", "Lcom/fingerprintjs/android/fpjs_pro_internal/component2$a;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class component2 {
    public static int bravo = 1;
    public static int charlie;
    public static int delta;
    public final int alpha;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÆ\n\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/component2$a;", "Lcom/fingerprintjs/android/fpjs_pro_internal/component2;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class a extends component2 {

        @NotNull
        public static final a echo = new component2(0, null);
        public static int foxtrot = 0;
        public static int golf = 1;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.component2, com.fingerprintjs.android.fpjs_pro_internal.component2$a] */
        static {
            if (25 % 2 == 0) {
                int i4 = 1 / 0;
            }
        }

        public final boolean equals(Object obj) {
            int i4 = golf;
            int i5 = (i4 + 67) % 128;
            foxtrot = i5;
            if (this == obj) {
                golf = (i5 + 1) % 128;
                return true;
            }
            if (!(obj instanceof a)) {
                int i10 = ((i4 & 5) + (i4 | 5)) % 128;
                foxtrot = i10;
                int i11 = i10 + 35;
                golf = i11 % 128;
                if (i11 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            golf = ((i5 & 37) + (i5 | 37)) % 128;
            return true;
        }

        public final int hashCode() {
            int i4 = golf;
            int i5 = ((i4 | 71) << 1) - (i4 ^ 71);
            foxtrot = i5 % 128;
            if (i5 % 2 == 0) {
                return 1760430767;
            }
            throw null;
        }

        public final String toString() {
            int i4;
            golf = (foxtrot + 121) % 128;
            int i5 = com.fingerprintjs.android.fpjs_pro.q.echo;
            int i10 = i5 % 7047851;
            com.fingerprintjs.android.fpjs_pro.q.echo = i5 + 1;
            if (i10 != 0) {
                i4 = com.fingerprintjs.android.fpjs_pro.q.foxtrot;
            } else {
                i4 = (int) Runtime.getRuntime().totalMemory();
                com.fingerprintjs.android.fpjs_pro.q.foxtrot = i4;
            }
            int i11 = -(-(((~(1328100320 | i4)) | 117511104) * (-502)));
            int i12 = (((((-681443459) | i11) << 1) - (i11 ^ (-681443459))) - (~(-(-((~((~i4) | (-537280516))) * (-502)))))) - 1;
            int i13 = ~((i4 & 654791619) | (654791619 ^ i4));
            int i14 = (((i13 & 1328100320) | (1328100320 ^ i13)) * HttpConstants.HTTP_BAD_GATEWAY) + i12;
            int identityHashCode = System.identityHashCode(this);
            int i15 = ~identityHashCode;
            int i16 = ((1865669851 | i15) * (-369)) + 2035404426;
            int i17 = ~(((-1813076052) ^ i15) | ((-1813076052) & i15));
            int i18 = -(-(((i17 & 1663222938) | (1663222938 ^ i17)) * (-369)));
            int i19 = (i16 & i18) + (i16 | i18);
            int i20 = ~((identityHashCode & 1813076051) | (1813076051 ^ identityHashCode));
            int i21 = (i20 & 52593800) | (52593800 ^ i20);
            int i22 = ~((i15 & (-1813076052)) | ((-1813076052) ^ i15) | 1663222938);
            int i23 = ((i21 & i22) | (i21 ^ i22)) * 369;
            if (i14 > (i19 ^ i23) + ((i23 & i19) << 1)) {
                int i24 = 9 / 0;
            }
            return "D8871";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/component2$b;", "Lcom/fingerprintjs/android/fpjs_pro_internal/component2;", "a", "b", "c", Constants.INAPP_DATA_TAG, "Lcom/fingerprintjs/android/fpjs_pro_internal/component2$b$a;", "Lcom/fingerprintjs/android/fpjs_pro_internal/component2$b$b;", "Lcom/fingerprintjs/android/fpjs_pro_internal/component2$b$c;", "Lcom/fingerprintjs/android/fpjs_pro_internal/component2$b$d;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class b extends component2 {
        public final int echo;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÆ\n\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/component2$b$a;", "Lcom/fingerprintjs/android/fpjs_pro_internal/component2$b;"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final /* data */ class a extends b {

            @NotNull
            public static final a foxtrot = new b(-1, null);
            public static int golf = 0;
            public static int hotel = 1;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.component2$b$a, com.fingerprintjs.android.fpjs_pro_internal.component2$b] */
            static {
                if (ao.ad.victor(0, -70, 1, 2) == 0) {
                    int i4 = 15 / 0;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
            
                r5 = (com.fingerprintjs.android.fpjs_pro_internal.component2.b.a) r5;
                r5 = (r0 & 71) + (r0 | 71);
                com.fingerprintjs.android.fpjs_pro_internal.component2.b.a.hotel = r5 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
            
                if ((r5 % 2) != 0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
            
                r5 = 95 / 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0016, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0014, code lost:
            
                if (r4 == r5) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
            
                if (r4 == r5) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
            
                if ((r5 instanceof com.fingerprintjs.android.fpjs_pro_internal.component2.b.a) != false) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
            
                r0 = (r0 + 103) % 128;
                com.fingerprintjs.android.fpjs_pro_internal.component2.b.a.hotel = r0;
                r0 = r0 + 125;
                com.fingerprintjs.android.fpjs_pro_internal.component2.b.a.golf = r0 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
            
                if ((r0 % 2) != 0) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
            
                return false;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final boolean equals(Object obj) {
                int i4 = golf;
                int i5 = i4 + 91;
                hotel = i5 % 128;
                if (i5 % 2 == 0) {
                    int i10 = 98 / 0;
                }
            }

            public final int hashCode() {
                int i4 = hotel + 55;
                golf = i4 % 128;
                if (i4 % 2 == 0) {
                    return -857063736;
                }
                throw null;
            }

            public final String toString() {
                int i4 = hotel;
                int i5 = ((i4 | 45) << 1) - (i4 ^ 45);
                int i10 = i5 % 128;
                golf = i10;
                if (i5 % 2 == 0) {
                    int i11 = (i10 ^ 97) + ((i10 & 97) << 1);
                    hotel = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 69 / 0;
                    }
                    return "D8871";
                }
                throw null;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÆ\n\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/component2$b$b;", "Lcom/fingerprintjs/android/fpjs_pro_internal/component2$b;"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.fingerprintjs.android.fpjs_pro_internal.component2$b$b, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final /* data */ class C0008b extends b {

            @NotNull
            public static final C0008b foxtrot = new b(-2, null);
            public static int golf = 0;
            public static int hotel = 1;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.component2$b$b, com.fingerprintjs.android.fpjs_pro_internal.component2$b] */
            static {
                if (15 % 2 == 0) {
                    int i4 = 53 / 0;
                }
            }

            public final boolean equals(Object obj) {
                int i4 = hotel;
                int i5 = ((i4 ^ 65) + ((i4 & 65) << 1)) % 128;
                golf = i5;
                if (this == obj) {
                    golf = (((i4 | 85) << 1) - (i4 ^ 85)) % 128;
                    return true;
                }
                if (!(obj instanceof C0008b)) {
                    hotel = ((i5 ^ 75) + ((i5 & 75) << 1)) % 128;
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                int i4 = hotel;
                int i5 = (i4 ^ 29) + ((i4 & 29) << 1);
                golf = i5 % 128;
                if (i5 % 2 == 0) {
                    golf = ((i4 ^ 117) + ((i4 & 117) << 1)) % 128;
                    return 988138177;
                }
                throw null;
            }

            public final String toString() {
                int i4 = golf;
                int i5 = (i4 & 81) + (i4 | 81);
                hotel = i5 % 128;
                if (i5 % 2 != 0) {
                    return "component5";
                }
                throw null;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÆ\n\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/component2$b$c;", "Lcom/fingerprintjs/android/fpjs_pro_internal/component2$b;"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final /* data */ class c extends b {

            @NotNull
            public static final c foxtrot = new b(-3, null);
            public static int golf = 0;
            public static int hotel = 1;

            public final boolean equals(Object obj) {
                int i4 = hotel;
                int i5 = (i4 + 33) % 128;
                golf = i5;
                if (this == obj) {
                    int i10 = i5 + 115;
                    hotel = i10 % 128;
                    if (i10 % 2 != 0) {
                        return true;
                    }
                    throw null;
                }
                if (!(obj instanceof c)) {
                    golf = ((i4 & 103) + (i4 | 103)) % 128;
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                int i4 = golf;
                int i5 = (((i4 | 73) << 1) - (i4 ^ 73)) % 128;
                hotel = i5;
                int i10 = i5 + 51;
                golf = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 42 / 0;
                }
                return 988138178;
            }

            public final String toString() {
                int i4 = (hotel + 49) % 128;
                golf = i4;
                int i5 = (i4 ^ 39) + ((i4 & 39) << 1);
                hotel = i5 % 128;
                if (i5 % 2 != 0) {
                    return "setPivotYN16904";
                }
                throw null;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÆ\n\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/component2$b$d;", "Lcom/fingerprintjs/android/fpjs_pro_internal/component2$b;"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final /* data */ class d extends b {

            @NotNull
            public static final d foxtrot = new b(-4, null);
            public static int golf = 0;
            public static int hotel = 1;

            public final boolean equals(Object obj) {
                boolean z2;
                int i4 = hotel;
                int i5 = ((i4 ^ 67) + ((i4 & 67) << 1)) % 128;
                golf = i5;
                if (this == obj) {
                    hotel = (i5 + 75) % 128;
                    return true;
                }
                if (!(obj instanceof d)) {
                    int i10 = (i5 ^ 29) + ((i5 & 29) << 1);
                    hotel = i10 % 128;
                    if (i10 % 2 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    hotel = ((i5 ^ 37) + ((i5 & 37) << 1)) % 128;
                    return z2;
                }
                golf = (i4 + 99) % 128;
                return true;
            }

            public final int hashCode() {
                int i4 = golf + 113;
                hotel = i4 % 128;
                if (i4 % 2 != 0) {
                    return 988138179;
                }
                throw null;
            }

            public final String toString() {
                System.identityHashCode(this);
                System.identityHashCode(this);
                int i4 = golf;
                int i5 = ((i4 | 51) << 1) - (i4 ^ 51);
                hotel = i5 % 128;
                if (i5 % 2 != 0) {
                    return "vD14832N6715";
                }
                throw null;
            }
        }

        public b(int i4, DefaultConstructorMarker defaultConstructorMarker) {
            super(i4, null);
            this.echo = i4;
        }

        @Override // com.fingerprintjs.android.fpjs_pro_internal.component2
        /* renamed from: alpha, reason: from getter */
        public final int getEcho() {
            return this.echo;
        }
    }

    public component2(int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this.alpha = i4;
    }

    public static int setPivotYN16904() {
        int i4 = charlie;
        int i5 = i4 % 8987373;
        charlie = i4 + 1;
        if (i5 != 0) {
            return delta;
        }
        int i10 = (int) Runtime.getRuntime().totalMemory();
        delta = i10;
        return i10;
    }

    /* renamed from: alpha */
    public int getEcho() {
        int i4 = bravo + 83;
        int i5 = i4 % 128;
        if (i4 % 2 == 0) {
            int i10 = i5 + 57;
            bravo = i10 % 128;
            if (i10 % 2 != 0) {
                return this.alpha;
            }
            throw null;
        }
        throw null;
    }
}
