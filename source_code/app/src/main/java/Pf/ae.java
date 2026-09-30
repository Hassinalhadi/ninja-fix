package Pf;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public class ae extends a {
    public final String echo;

    public ae(String source) {
        Intrinsics.echo(source, "source");
        this.echo = source;
    }

    @Override // Pf.a
    public boolean charlie() {
        int i4 = this.alpha;
        if (i4 == -1) {
            return false;
        }
        while (true) {
            String str = this.echo;
            if (i4 < str.length()) {
                char charAt = str.charAt(i4);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.alpha = i4;
                    return a.uniform(charAt);
                }
                i4++;
            } else {
                this.alpha = i4;
                return false;
            }
        }
    }

    @Override // Pf.a
    public final String echo() {
        String str;
        hotel('\"');
        int i4 = this.alpha;
        String str2 = this.echo;
        int emerald = StringsKt.emerald(str2, '\"', i4, 4);
        if (emerald == -1) {
            lima();
            int i5 = this.alpha;
            if (i5 != str2.length() && i5 >= 0) {
                str = String.valueOf(str2.charAt(i5));
            } else {
                str = "EOF";
            }
            a.romeo(this, ao.ad.gray("Expected quotation mark '\"', but had '", str, "' instead"), i5, null, 4);
            throw null;
        }
        for (int i10 = i4; i10 < emerald; i10++) {
            if (str2.charAt(i10) == '\\') {
                return kilo(str2, this.alpha, i10);
            }
        }
        this.alpha = emerald + 1;
        String substring = str2.substring(i4, emerald);
        Intrinsics.delta(substring, "substring(...)");
        return substring;
    }

    @Override // Pf.a
    public byte foxtrot() {
        String str;
        int i4 = this.alpha;
        while (true) {
            str = this.echo;
            if (i4 == -1 || i4 >= str.length()) {
                break;
            }
            int i5 = i4 + 1;
            char charAt = str.charAt(i4);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.alpha = i5;
                return r.golf(charAt);
            }
            i4 = i5;
        }
        this.alpha = str.length();
        return (byte) 10;
    }

    @Override // Pf.a
    public void hotel(char c3) {
        int i4 = this.alpha;
        if (i4 == -1) {
            beige(c3);
            throw null;
        }
        while (true) {
            String str = this.echo;
            if (i4 < str.length()) {
                int i5 = i4 + 1;
                char charAt = str.charAt(i4);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.alpha = i5;
                    if (charAt == c3) {
                        return;
                    }
                    beige(c3);
                    throw null;
                }
                i4 = i5;
            } else {
                this.alpha = -1;
                beige(c3);
                throw null;
            }
        }
    }

    @Override // Pf.a
    public final CharSequence tango() {
        return this.echo;
    }

    @Override // Pf.a
    public final String victor(String keyToMatch, boolean z2) {
        Intrinsics.echo(keyToMatch, "keyToMatch");
        int i4 = this.alpha;
        try {
            if (foxtrot() != 6) {
                return null;
            }
            if (!Intrinsics.areEqual(xray(z2), keyToMatch)) {
                return null;
            }
            this.charlie = null;
            if (foxtrot() != 5) {
                return null;
            }
            return xray(z2);
        } finally {
            this.alpha = i4;
            this.charlie = null;
        }
    }

    @Override // Pf.a
    public final int yankee(int i4) {
        if (i4 < this.echo.length()) {
            return i4;
        }
        return -1;
    }

    @Override // Pf.a
    public int zulu() {
        char charAt;
        int i4 = this.alpha;
        if (i4 == -1) {
            return i4;
        }
        while (true) {
            String str = this.echo;
            if (i4 >= str.length() || !((charAt = str.charAt(i4)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i4++;
        }
        this.alpha = i4;
        return i4;
    }
}
