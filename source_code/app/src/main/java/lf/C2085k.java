package lf;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* renamed from: lf.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2085k {
    public final Ne.f alpha;
    public final Regex bravo;
    public final Collection charlie;
    public final Function1 delta;
    public final InterfaceC2079e[] echo;

    public C2085k(Ne.f fVar, Regex regex, Collection collection, Function1 function1, InterfaceC2079e... interfaceC2079eArr) {
        this.alpha = fVar;
        this.bravo = regex;
        this.charlie = collection;
        this.delta = function1;
        this.echo = interfaceC2079eArr;
    }

    public /* synthetic */ C2085k(Ne.f fVar, InterfaceC2079e[] interfaceC2079eArr) {
        this(fVar, interfaceC2079eArr, C2082h.alpha);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2085k(Ne.f name, InterfaceC2079e[] interfaceC2079eArr, Function1 additionalChecks) {
        this(name, null, null, additionalChecks, (InterfaceC2079e[]) Arrays.copyOf(interfaceC2079eArr, interfaceC2079eArr.length));
        Intrinsics.echo(name, "name");
        Intrinsics.echo(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ C2085k(Set set, InterfaceC2079e[] interfaceC2079eArr) {
        this(set, interfaceC2079eArr, C2084j.alpha);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2085k(Collection nameList, InterfaceC2079e[] interfaceC2079eArr, Function1 additionalChecks) {
        this(null, null, nameList, additionalChecks, (InterfaceC2079e[]) Arrays.copyOf(interfaceC2079eArr, interfaceC2079eArr.length));
        Intrinsics.echo(nameList, "nameList");
        Intrinsics.echo(additionalChecks, "additionalChecks");
    }
}
