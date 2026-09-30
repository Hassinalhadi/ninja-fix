package sd;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@Jf.e(with = ag.class)
/* loaded from: classes2.dex */
public final class af implements Serializable {

    @NotNull
    public static final ae Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final ac f13702a;
    public final String alpha;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f13703b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f13704c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f13705d;
    public final Lazy e;

    /* renamed from: f, reason: collision with root package name */
    public final Lazy f13706f;

    /* renamed from: g, reason: collision with root package name */
    public final Lazy f13707g;
    public final int purple;
    public final String red;
    public final String silver;
    public final String teal;
    public final Lazy white;
    public final ac yellow;

    public af(ac acVar, String host, int i4, ArrayList arrayList, w parameters, String fragment, String str, String str2, String str3) {
        Intrinsics.echo(host, "host");
        Intrinsics.echo(parameters, "parameters");
        Intrinsics.echo(fragment, "fragment");
        this.alpha = host;
        this.purple = i4;
        this.red = str;
        this.silver = str2;
        this.teal = str3;
        if (i4 >= 0 && i4 < 65536) {
            this.white = LazyKt.lazy(new Jf.h(1, arrayList));
            this.yellow = acVar;
            this.f13702a = acVar == null ? ac.red : acVar;
            this.f13703b = LazyKt.lazy(new okhttp3.internal.ws.a(6, arrayList, this));
            final int i5 = 0;
            this.f13704c = LazyKt.lazy(new Function0(this) { // from class: sd.ad
                public final /* synthetic */ af purple;

                {
                    this.purple = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int xray;
                    af afVar = this.purple;
                    switch (i5) {
                        case 0:
                            int emerald = StringsKt.emerald(afVar.teal, '?', 0, 6) + 1;
                            if (emerald == 0) {
                                return "";
                            }
                            String str4 = afVar.teal;
                            int emerald2 = StringsKt.emerald(str4, '#', emerald, 4);
                            if (emerald2 == -1) {
                                String substring = str4.substring(emerald);
                                Intrinsics.delta(substring, "substring(...)");
                                return substring;
                            }
                            String substring2 = str4.substring(emerald, emerald2);
                            Intrinsics.delta(substring2, "substring(...)");
                            return substring2;
                        case 1:
                            int emerald3 = StringsKt.emerald(afVar.teal, '/', afVar.f13702a.alpha.length() + 3, 4);
                            if (emerald3 == -1) {
                                return "";
                            }
                            String str5 = afVar.teal;
                            int emerald4 = StringsKt.emerald(str5, '#', emerald3, 4);
                            if (emerald4 == -1) {
                                String substring3 = str5.substring(emerald3);
                                Intrinsics.delta(substring3, "substring(...)");
                                return substring3;
                            }
                            String substring4 = str5.substring(emerald3, emerald4);
                            Intrinsics.delta(substring4, "substring(...)");
                            return substring4;
                        case 2:
                            String str6 = afVar.red;
                            if (str6 == null) {
                                return null;
                            }
                            if (str6.length() == 0) {
                                return "";
                            }
                            int length = afVar.f13702a.alpha.length() + 3;
                            String str7 = afVar.teal;
                            xray = StringsKt__StringsKt.xray(str7, new char[]{':', '@'}, length, false);
                            String substring5 = str7.substring(length, xray);
                            Intrinsics.delta(substring5, "substring(...)");
                            return substring5;
                        case 3:
                            String str8 = afVar.silver;
                            if (str8 == null) {
                                return null;
                            }
                            if (str8.length() == 0) {
                                return "";
                            }
                            int length2 = afVar.f13702a.alpha.length() + 3;
                            String str9 = afVar.teal;
                            String substring6 = str9.substring(StringsKt.emerald(str9, ':', length2, 4) + 1, StringsKt.emerald(str9, '@', 0, 6));
                            Intrinsics.delta(substring6, "substring(...)");
                            return substring6;
                        default:
                            int emerald5 = StringsKt.emerald(afVar.teal, '#', 0, 6) + 1;
                            if (emerald5 == 0) {
                                return "";
                            }
                            String substring7 = afVar.teal.substring(emerald5);
                            Intrinsics.delta(substring7, "substring(...)");
                            return substring7;
                    }
                }
            });
            final int i10 = 1;
            this.f13705d = LazyKt.lazy(new Function0(this) { // from class: sd.ad
                public final /* synthetic */ af purple;

                {
                    this.purple = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int xray;
                    af afVar = this.purple;
                    switch (i10) {
                        case 0:
                            int emerald = StringsKt.emerald(afVar.teal, '?', 0, 6) + 1;
                            if (emerald == 0) {
                                return "";
                            }
                            String str4 = afVar.teal;
                            int emerald2 = StringsKt.emerald(str4, '#', emerald, 4);
                            if (emerald2 == -1) {
                                String substring = str4.substring(emerald);
                                Intrinsics.delta(substring, "substring(...)");
                                return substring;
                            }
                            String substring2 = str4.substring(emerald, emerald2);
                            Intrinsics.delta(substring2, "substring(...)");
                            return substring2;
                        case 1:
                            int emerald3 = StringsKt.emerald(afVar.teal, '/', afVar.f13702a.alpha.length() + 3, 4);
                            if (emerald3 == -1) {
                                return "";
                            }
                            String str5 = afVar.teal;
                            int emerald4 = StringsKt.emerald(str5, '#', emerald3, 4);
                            if (emerald4 == -1) {
                                String substring3 = str5.substring(emerald3);
                                Intrinsics.delta(substring3, "substring(...)");
                                return substring3;
                            }
                            String substring4 = str5.substring(emerald3, emerald4);
                            Intrinsics.delta(substring4, "substring(...)");
                            return substring4;
                        case 2:
                            String str6 = afVar.red;
                            if (str6 == null) {
                                return null;
                            }
                            if (str6.length() == 0) {
                                return "";
                            }
                            int length = afVar.f13702a.alpha.length() + 3;
                            String str7 = afVar.teal;
                            xray = StringsKt__StringsKt.xray(str7, new char[]{':', '@'}, length, false);
                            String substring5 = str7.substring(length, xray);
                            Intrinsics.delta(substring5, "substring(...)");
                            return substring5;
                        case 3:
                            String str8 = afVar.silver;
                            if (str8 == null) {
                                return null;
                            }
                            if (str8.length() == 0) {
                                return "";
                            }
                            int length2 = afVar.f13702a.alpha.length() + 3;
                            String str9 = afVar.teal;
                            String substring6 = str9.substring(StringsKt.emerald(str9, ':', length2, 4) + 1, StringsKt.emerald(str9, '@', 0, 6));
                            Intrinsics.delta(substring6, "substring(...)");
                            return substring6;
                        default:
                            int emerald5 = StringsKt.emerald(afVar.teal, '#', 0, 6) + 1;
                            if (emerald5 == 0) {
                                return "";
                            }
                            String substring7 = afVar.teal.substring(emerald5);
                            Intrinsics.delta(substring7, "substring(...)");
                            return substring7;
                    }
                }
            });
            final int i11 = 2;
            this.e = LazyKt.lazy(new Function0(this) { // from class: sd.ad
                public final /* synthetic */ af purple;

                {
                    this.purple = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int xray;
                    af afVar = this.purple;
                    switch (i11) {
                        case 0:
                            int emerald = StringsKt.emerald(afVar.teal, '?', 0, 6) + 1;
                            if (emerald == 0) {
                                return "";
                            }
                            String str4 = afVar.teal;
                            int emerald2 = StringsKt.emerald(str4, '#', emerald, 4);
                            if (emerald2 == -1) {
                                String substring = str4.substring(emerald);
                                Intrinsics.delta(substring, "substring(...)");
                                return substring;
                            }
                            String substring2 = str4.substring(emerald, emerald2);
                            Intrinsics.delta(substring2, "substring(...)");
                            return substring2;
                        case 1:
                            int emerald3 = StringsKt.emerald(afVar.teal, '/', afVar.f13702a.alpha.length() + 3, 4);
                            if (emerald3 == -1) {
                                return "";
                            }
                            String str5 = afVar.teal;
                            int emerald4 = StringsKt.emerald(str5, '#', emerald3, 4);
                            if (emerald4 == -1) {
                                String substring3 = str5.substring(emerald3);
                                Intrinsics.delta(substring3, "substring(...)");
                                return substring3;
                            }
                            String substring4 = str5.substring(emerald3, emerald4);
                            Intrinsics.delta(substring4, "substring(...)");
                            return substring4;
                        case 2:
                            String str6 = afVar.red;
                            if (str6 == null) {
                                return null;
                            }
                            if (str6.length() == 0) {
                                return "";
                            }
                            int length = afVar.f13702a.alpha.length() + 3;
                            String str7 = afVar.teal;
                            xray = StringsKt__StringsKt.xray(str7, new char[]{':', '@'}, length, false);
                            String substring5 = str7.substring(length, xray);
                            Intrinsics.delta(substring5, "substring(...)");
                            return substring5;
                        case 3:
                            String str8 = afVar.silver;
                            if (str8 == null) {
                                return null;
                            }
                            if (str8.length() == 0) {
                                return "";
                            }
                            int length2 = afVar.f13702a.alpha.length() + 3;
                            String str9 = afVar.teal;
                            String substring6 = str9.substring(StringsKt.emerald(str9, ':', length2, 4) + 1, StringsKt.emerald(str9, '@', 0, 6));
                            Intrinsics.delta(substring6, "substring(...)");
                            return substring6;
                        default:
                            int emerald5 = StringsKt.emerald(afVar.teal, '#', 0, 6) + 1;
                            if (emerald5 == 0) {
                                return "";
                            }
                            String substring7 = afVar.teal.substring(emerald5);
                            Intrinsics.delta(substring7, "substring(...)");
                            return substring7;
                    }
                }
            });
            final int i12 = 3;
            this.f13706f = LazyKt.lazy(new Function0(this) { // from class: sd.ad
                public final /* synthetic */ af purple;

                {
                    this.purple = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int xray;
                    af afVar = this.purple;
                    switch (i12) {
                        case 0:
                            int emerald = StringsKt.emerald(afVar.teal, '?', 0, 6) + 1;
                            if (emerald == 0) {
                                return "";
                            }
                            String str4 = afVar.teal;
                            int emerald2 = StringsKt.emerald(str4, '#', emerald, 4);
                            if (emerald2 == -1) {
                                String substring = str4.substring(emerald);
                                Intrinsics.delta(substring, "substring(...)");
                                return substring;
                            }
                            String substring2 = str4.substring(emerald, emerald2);
                            Intrinsics.delta(substring2, "substring(...)");
                            return substring2;
                        case 1:
                            int emerald3 = StringsKt.emerald(afVar.teal, '/', afVar.f13702a.alpha.length() + 3, 4);
                            if (emerald3 == -1) {
                                return "";
                            }
                            String str5 = afVar.teal;
                            int emerald4 = StringsKt.emerald(str5, '#', emerald3, 4);
                            if (emerald4 == -1) {
                                String substring3 = str5.substring(emerald3);
                                Intrinsics.delta(substring3, "substring(...)");
                                return substring3;
                            }
                            String substring4 = str5.substring(emerald3, emerald4);
                            Intrinsics.delta(substring4, "substring(...)");
                            return substring4;
                        case 2:
                            String str6 = afVar.red;
                            if (str6 == null) {
                                return null;
                            }
                            if (str6.length() == 0) {
                                return "";
                            }
                            int length = afVar.f13702a.alpha.length() + 3;
                            String str7 = afVar.teal;
                            xray = StringsKt__StringsKt.xray(str7, new char[]{':', '@'}, length, false);
                            String substring5 = str7.substring(length, xray);
                            Intrinsics.delta(substring5, "substring(...)");
                            return substring5;
                        case 3:
                            String str8 = afVar.silver;
                            if (str8 == null) {
                                return null;
                            }
                            if (str8.length() == 0) {
                                return "";
                            }
                            int length2 = afVar.f13702a.alpha.length() + 3;
                            String str9 = afVar.teal;
                            String substring6 = str9.substring(StringsKt.emerald(str9, ':', length2, 4) + 1, StringsKt.emerald(str9, '@', 0, 6));
                            Intrinsics.delta(substring6, "substring(...)");
                            return substring6;
                        default:
                            int emerald5 = StringsKt.emerald(afVar.teal, '#', 0, 6) + 1;
                            if (emerald5 == 0) {
                                return "";
                            }
                            String substring7 = afVar.teal.substring(emerald5);
                            Intrinsics.delta(substring7, "substring(...)");
                            return substring7;
                    }
                }
            });
            final int i13 = 4;
            this.f13707g = LazyKt.lazy(new Function0(this) { // from class: sd.ad
                public final /* synthetic */ af purple;

                {
                    this.purple = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int xray;
                    af afVar = this.purple;
                    switch (i13) {
                        case 0:
                            int emerald = StringsKt.emerald(afVar.teal, '?', 0, 6) + 1;
                            if (emerald == 0) {
                                return "";
                            }
                            String str4 = afVar.teal;
                            int emerald2 = StringsKt.emerald(str4, '#', emerald, 4);
                            if (emerald2 == -1) {
                                String substring = str4.substring(emerald);
                                Intrinsics.delta(substring, "substring(...)");
                                return substring;
                            }
                            String substring2 = str4.substring(emerald, emerald2);
                            Intrinsics.delta(substring2, "substring(...)");
                            return substring2;
                        case 1:
                            int emerald3 = StringsKt.emerald(afVar.teal, '/', afVar.f13702a.alpha.length() + 3, 4);
                            if (emerald3 == -1) {
                                return "";
                            }
                            String str5 = afVar.teal;
                            int emerald4 = StringsKt.emerald(str5, '#', emerald3, 4);
                            if (emerald4 == -1) {
                                String substring3 = str5.substring(emerald3);
                                Intrinsics.delta(substring3, "substring(...)");
                                return substring3;
                            }
                            String substring4 = str5.substring(emerald3, emerald4);
                            Intrinsics.delta(substring4, "substring(...)");
                            return substring4;
                        case 2:
                            String str6 = afVar.red;
                            if (str6 == null) {
                                return null;
                            }
                            if (str6.length() == 0) {
                                return "";
                            }
                            int length = afVar.f13702a.alpha.length() + 3;
                            String str7 = afVar.teal;
                            xray = StringsKt__StringsKt.xray(str7, new char[]{':', '@'}, length, false);
                            String substring5 = str7.substring(length, xray);
                            Intrinsics.delta(substring5, "substring(...)");
                            return substring5;
                        case 3:
                            String str8 = afVar.silver;
                            if (str8 == null) {
                                return null;
                            }
                            if (str8.length() == 0) {
                                return "";
                            }
                            int length2 = afVar.f13702a.alpha.length() + 3;
                            String str9 = afVar.teal;
                            String substring6 = str9.substring(StringsKt.emerald(str9, ':', length2, 4) + 1, StringsKt.emerald(str9, '@', 0, 6));
                            Intrinsics.delta(substring6, "substring(...)");
                            return substring6;
                        default:
                            int emerald5 = StringsKt.emerald(afVar.teal, '#', 0, 6) + 1;
                            if (emerald5 == 0) {
                                return "";
                            }
                            String substring7 = afVar.teal.substring(emerald5);
                            Intrinsics.delta(substring7, "substring(...)");
                            return substring7;
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException(ao.ad.zulu(i4, "Port must be between 0 and 65535, or 0 if not set. Provided: ").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && af.class == obj.getClass()) {
            return Intrinsics.areEqual(this.teal, ((af) obj).teal);
        }
        return false;
    }

    public final int hashCode() {
        return this.teal.hashCode();
    }

    public final String toString() {
        return this.teal;
    }
}
