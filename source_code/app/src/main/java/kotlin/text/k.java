package kotlin.text;

import fe.C1715g;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.aa;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import s6.J4;

/* loaded from: classes2.dex */
public final class k implements MatchResult {
    public final Matcher alpha;
    public final CharSequence bravo;
    public final M.l charlie;
    public aa delta;

    public k(Matcher matcher, CharSequence input) {
        Intrinsics.echo(input, "input");
        this.alpha = matcher;
        this.bravo = input;
        this.charlie = new M.l(1, this);
    }

    @Override // kotlin.text.MatchResult
    public final M.l alpha() {
        return this.charlie;
    }

    @Override // kotlin.text.MatchResult
    public final C1715g bravo() {
        Matcher matcher = this.alpha;
        return J4.hotel(matcher.start(), matcher.end());
    }

    @Override // kotlin.text.MatchResult
    public final MatchResult.Destructured getDestructured() {
        return new MatchResult.Destructured(this);
    }

    @Override // kotlin.text.MatchResult
    public final List getGroupValues() {
        if (this.delta == null) {
            this.delta = new aa(this);
        }
        aa aaVar = this.delta;
        Intrinsics.checkNotNull(aaVar);
        return aaVar;
    }

    @Override // kotlin.text.MatchResult
    public final k next() {
        int i4;
        Matcher matcher = this.alpha;
        int end = matcher.end();
        if (matcher.end() == matcher.start()) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i5 = end + i4;
        CharSequence charSequence = this.bravo;
        if (i5 > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        Intrinsics.delta(matcher2, "matcher(...)");
        if (!matcher2.find(i5)) {
            return null;
        }
        return new k(matcher2, charSequence);
    }
}
