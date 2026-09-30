package kotlin.text;

import Yb.F;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.ab;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "pattern", "<init>", "(Ljava/lang/String;)V", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Regex implements Serializable {
    public final Pattern alpha;

    public Regex(Pattern pattern) {
        this.alpha = pattern;
    }

    public static kotlin.io.h bravo(Regex regex, String input) {
        regex.getClass();
        Intrinsics.echo(input, "input");
        if (input.length() >= 0) {
            return new kotlin.io.h(new F(20, regex, input), l.alpha);
        }
        StringBuilder sierra = Q0.c.sierra(0, "Start index out of bounds: ", ", input length: ");
        sierra.append(input.length());
        throw new IndexOutOfBoundsException(sierra.toString());
    }

    public static MatchResult find$default(Regex regex, CharSequence input, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        regex.getClass();
        Intrinsics.echo(input, "input");
        Matcher matcher = regex.alpha.matcher(input);
        Intrinsics.delta(matcher, "matcher(...)");
        if (!matcher.find(i4)) {
            return null;
        }
        return new k(matcher, input);
    }

    public final boolean alpha(CharSequence input) {
        Intrinsics.echo(input, "input");
        return this.alpha.matcher(input).find();
    }

    public final k charlie(int i4, String input) {
        Intrinsics.echo(input, "input");
        Matcher region = this.alpha.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i4, input.length());
        if (region.lookingAt()) {
            Intrinsics.checkNotNull(region);
            return new k(region, input);
        }
        return null;
    }

    public final k delta(CharSequence input) {
        Intrinsics.echo(input, "input");
        Matcher matcher = this.alpha.matcher(input);
        Intrinsics.delta(matcher, "matcher(...)");
        if (!matcher.matches()) {
            return null;
        }
        return new k(matcher, input);
    }

    public final boolean echo(CharSequence input) {
        Intrinsics.echo(input, "input");
        return this.alpha.matcher(input).matches();
    }

    public final String foxtrot(CharSequence input, String replacement) {
        Intrinsics.echo(input, "input");
        Intrinsics.echo(replacement, "replacement");
        String replaceAll = this.alpha.matcher(input).replaceAll(replacement);
        Intrinsics.delta(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final String golf(String input, Function1 function1) {
        Intrinsics.echo(input, "input");
        int i4 = 0;
        MatchResult find$default = find$default(this, input, 0, 2, null);
        if (find$default == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append((CharSequence) input, i4, find$default.bravo().alpha);
            sb2.append((CharSequence) function1.invoke(find$default));
            i4 = find$default.bravo().purple + 1;
            find$default = find$default.next();
            if (i4 >= length) {
                break;
            }
        } while (find$default != null);
        if (i4 < length) {
            sb2.append((CharSequence) input, i4, length);
        }
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }

    public final List hotel(CharSequence input) {
        Intrinsics.echo(input, "input");
        int i4 = 0;
        StringsKt__StringsKt.zulu(0);
        Matcher matcher = this.alpha.matcher(input);
        if (!matcher.find()) {
            return ab.juliet(input.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(input.subSequence(i4, matcher.start()).toString());
            i4 = matcher.end();
        } while (matcher.find());
        arrayList.add(input.subSequence(i4, input.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String pattern = this.alpha.toString();
        Intrinsics.delta(pattern, "toString(...)");
        return pattern;
    }

    public Regex(@NotNull String pattern) {
        Intrinsics.echo(pattern, "pattern");
        Pattern compile = Pattern.compile(pattern);
        Intrinsics.delta(compile, "compile(...)");
        this.alpha = compile;
    }

    public Regex(String pattern, int i4) {
        m[] mVarArr = m.alpha;
        Intrinsics.echo(pattern, "pattern");
        Pattern compile = Pattern.compile(pattern, 66);
        Intrinsics.delta(compile, "compile(...)");
        this.alpha = compile;
    }
}
