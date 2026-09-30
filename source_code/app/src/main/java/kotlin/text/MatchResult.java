package kotlin.text;

import fe.C1715g;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u000bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lkotlin/text/MatchResult;", "", "", "", "getGroupValues", "()Ljava/util/List;", "groupValues", "Lkotlin/text/MatchResult$Destructured;", "getDestructured", "()Lkotlin/text/MatchResult$Destructured;", "destructured", "Destructured", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface MatchResult {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/text/MatchResult$Destructured;", "", "Lkotlin/text/MatchResult;", "alpha", "Lkotlin/text/MatchResult;", "getMatch", "()Lkotlin/text/MatchResult;", "match", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Destructured {
        public final k alpha;

        public Destructured(k kVar) {
            this.alpha = kVar;
        }

        @NotNull
        public final MatchResult getMatch() {
            return this.alpha;
        }
    }

    M.l alpha();

    C1715g bravo();

    @NotNull
    Destructured getDestructured();

    @NotNull
    List<String> getGroupValues();

    k next();
}
